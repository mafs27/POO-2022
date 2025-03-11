import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		String[] text= texto(le); //cria a lista de Strings 
		              
		int nEscolhido=0;
		while(nEscolhido!=7) {
			System.out.print("\n");
			menu();  //apresenta o menu
			nEscolhido = pedirNum(le);
			
			switch (nEscolhido) {
			
			case 1:
				comando1(text);
				break;
			
			case 2:
				comando2(le, text);
				break;
			
			case 3:
				comando3(text);
				break;
			
			case 4:
				comando4(le, text);
				break;

			case 5:
				comando5(le, text);	
				break;
				
			case 6:
				comando6(le, text);
				break;
				
			default:
				System.out.println("O programa acabou.");
				
		   }
		}
		le.close();
	}

	public static String[] texto(Scanner le) {
		
		System.out.print("Insira o seu texto:\n");
		String [] text = new String [10];   //a lista tem no máx 10 espaços
		  
		for(int i=0;i<text.length;i++) {    //o utilizador vai escrever o texto linha a linha até alcançar as 10 ou deixar uma linha em branco
		    text[i]=le.nextLine();
		    if (text[i]=="")
		    	break;
		}
		
		return text;
	}
	
    public static void menu() {
		System.out.print("""
				 1. Escrever a linha com mais caracteres.
				 2. Listar todas as linhas com um número de caracteres inferior a um valor dado pelo utilizador. 
				 3. Escrever a linha com mais vogais.
				 4. Listar todas as linhas que incluem uma palavra dada pelo utilizador.
				 5. Saber se uma certa linha dada pelo utilizador está incluída no conjunto de linhas em análise.
				 6. Fornecer um novo conjunto de linhas que substituirá o que está em utilização.
				 7. Sair do programa.
				""");
	}
    
    public static int pedirNum(Scanner le) {
    	System.out.print("\n Numero: ");
    	int nEscolhido;
		while(!le.hasNextInt()) {                //validação
			System.out.print("Deve inserir um número\n" );
			System.out.print("Numero: " );
			le.next();
		}
		nEscolhido= le.nextInt();
		le.nextLine();             //tira do inteiro
		while(0>nEscolhido || nEscolhido>=8) {
			System.out.print("Número escolhido inválido.\n ");
			System.out.print("Número: ");
			nEscolhido= le.nextInt();
		}
		
		return nEscolhido;
    }

    public static void comando1(String[] text) {
    	String fraseMaior="";
    	int pos=0;
    	int tam2=0;
    	for(int i=0; i<text.length && text[i]!= null;i++) {  //ciclo que percorre todas as linhas
    		int tam=text[i].length();           //tam=tamanho da linha i e tam2 vai ser utilizado para fazer a comparação
    		if(tam>tam2) {                      //caso o tamanho da linha i seja maior do que o valor do tam2, o tam2 é substituido por ele e a posição é também alterada, caso contrário fica igual
    			tam2=tam;                       
    			pos=i;                   
    			fraseMaior=text[pos];
    		}
    	}
    	
    	 System.out.print(fraseMaior);
    }
    
    public static void comando2(Scanner le,String[] text) {
    	System.out.print("\n Numero de caracteres: ");   //pedido e validação do nº de caracteres
    	int nCaract;
		while(!le.hasNextInt()) {
			System.out.print("Deve inserir um número\n" );
			System.out.print("Numero: " );
			le.next();
		}
		 nCaract=le.nextInt();
		while(0>nCaract) {
				System.out.print("Número escolhido inválido.\n ");
				System.out.print("Número: ");
				nCaract= le.nextInt();
		}
		for(int i=0; i<text.length && text[i]!= null;i++) {       
	    	 if(text[i].length()<nCaract)       //se o tamanho da linha for menor do que o valor dado imprime a frase
	    		System.out.println(text[i]);
		 }	 
    }
    
    public static void comando3(String[] text) {
    	int vog,vogL=0,pos=0;
    	
    	for(int i=0; i<text.length && text[i]!=null;i++) {          //percorre todas as linhas
    		vog=0;                                                  //reinicia o contador de vogais
    		for(int j=0;j<text[i].length() && text[i]!=null;j++) {  //percorre os caracteres de cada linha
    			String pal=text[i].toUpperCase();                   //toda a frase fica em letra maiuscula
    			if(pal.charAt(j)=='A' || pal.charAt(j)=='E' ||pal.charAt(j)=='I' || pal.charAt(j)=='O' || pal.charAt(j)=='U') 
    				vog++;
    		}
    		if(vogL<vog) {
    			vogL=vog;
    			pos=i;
    		}	
    	}
    	System.out.print(text[pos]);
	}
    
    public static void comando4(Scanner le,String[] text) {
    	String palavra;
		System.out.print("Palavra: ");     
		palavra=le.next();
		boolean contem = false;
		boolean para;
		for(int i=0; i<text.length && text[i]!=null;i++) {   
			String[] partes=text[i].split(" ");  //cria uma lista de Strings em que os elementos são as palavras das linhas
		    para=false;   //"reinicia" o boolean sempre que muda a frase 
		    
			for(int j=0;j<partes.length && !para;j++){  //percorre cada palavra e vê se é igual à que é inserida pelo utilizador e !para serve para quando econtrar uma palavra igual na frase passar para a proxima
				String semPont=partes[j].replaceAll("\\p{Punct}", "");  //Substitui toda a pontuação existente (\\p{Punct}) por nada ("")
				if(semPont.equalsIgnoreCase(palavra)) {
					System.out.println(text[i]);
					contem = true;
					para = true;    
				}
			}
	    }
		if(!contem)
			System.out.println("A palavra não está contida.");
			
    }
   
    public static void comando5(Scanner le,String[] text) {
    	String frase;
		System.out.print("Frase: ");    //considerei que, por exemplo, está tudo bem? e está tudo bem! são frases diferentes devido à pontação
		frase=le.nextLine().toUpperCase();
		boolean contem = false;
		for(int i=0; i<text.length && text[i]!=null;i++) {
			if(text[i].toUpperCase().equals(frase)) 
				contem = true;
	    }
		if(contem)                              //"contem" é a mesma coisa que contem == true
			System.out.println("A frase está contida.");
		else
			System.out.println("A frase não está contida.");
			
		
    }
    
	public static String [] comando6(Scanner le,String[] text) {
		for(int i=0; i<text.length && text[i]!=null;i++) {  //vai "apagar" todas as linhas escritas anteriormente
			text[i]= null;
		}
		System.out.println("Insira o novo texto:");  //comando semelhante ao do inicio para reescrever o texto
		for(int i=0;i<text.length;i++) {      
		    text[i]=le.nextLine();
		    if (text[i]=="")
		    	break;
		}
		return text;
	}
}
