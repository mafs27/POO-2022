import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);

		int n = nEquipas(le);
		Equipas[] equipas  = new Equipas [n]; //cria n espaços para as equipas 
		int nEscolhido=0;
		while(nEscolhido!=6) {
			System.out.print("\n");
			menu();  
			nEscolhido = pedirNum(le);

			switch (nEscolhido) {

			case 1:
				comando1(equipas, le);
				break;

			case 2:
				comando2(equipas, le, null);
				break;

			case 3:
				comando3(equipas, le);
				break;

			case 4:
				comando4(equipas, le);
				break;

			case 5:
				comando5(equipas, le);	
				break;

			default:
				System.out.println("O programa acabou.");

			}
		}
		le.close();
	}

	public static void menu() {  
		System.out.print("""
				1. Criar uma equipa.
				2. Adicionar um atleta a uma equipa. 
				3. Calcular a valia de uma equipa.
				4. Indicar qual a equipa mais valiosa e qual a menos valiosa.
				5. Indicar qual o atleta mais valioso em cada posição (base, estremo e poste).
				6. Sair do programa. 
				""");
	}

	public static int nEquipas(Scanner le) {
		System.out.print("Número de equipas: ");
		int n;
		while(!le.hasNextInt()) {        //validação
			System.out.print("Deve inserir um número\n" );
			System.out.print("Numero: " );
			le.next();
		}
		n= le.nextInt();
		le.nextLine();          //tira do inteiro
		while(0>n) {
			System.out.print("Número escolhido inválido.\n ");
			System.out.print("Número: ");
			n= le.nextInt();
		}
		return n;
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
		while(0>nEscolhido || nEscolhido>=7) {
			System.out.print("Número escolhido inválido.\n ");
			System.out.print("Número: ");
			nEscolhido= le.nextInt();
		}
		return nEscolhido;
	}
	public static void comando1(Equipas[] equipas,Scanner le) {
		System.out.println("Nome da equipa:");
		for(int i=0;i<equipas.length;i++) {  
			if(equipas[i] == null) {  //ver se o lugar está "vazio"
				equipas[i]= new Equipas(le.next());
				break;
			}
		}
	}


	public static void comando2(Equipas[] equipas,Scanner le,Jogadores [] jogadores) {
		int mid=equipas.length/2;
		int i=0;
		int fim=equipas.length;
		if(equipas[0]==null) {  //caso ainda não existam equipas criadas não é possivel utilizar o comando
			System.out.println("Ainda não criou nenhuma equipa");
			return; //sai do programa
		}
		else 
			if(equipas[0]!= null && equipas[1]==null) {    //caso o utilizador só tenha criado uma equipa 

				System.out.println("Nome do jogador: ");
				String nome = le.nextLine();

				System.out.println("Tempo de jogo (em minutos): ");
				int tempoJ = le.nextInt();

				System.out.println("Média dos pontos: ");
				double pontos = le.nextDouble();

				System.out.println("Média do número de assistências: ");
				double assistencias = le.nextDouble();

				System.out.println("Média do número de ressaltos: ");
				double ressaltos = le.nextDouble();

				System.out.println("Média do número de perdas de bola: ");
				double perdas = le.nextDouble();

				le.nextLine();    //tira do double
				System.out.print("Posição do jogador:\n ");
				System.out.println("[Se for Base escreva B, se for Extremo escreva E, se for Poste escreva P] ");
				String pos = le.nextLine();

				if(pos.equals("B")|| pos.equals("b")) {
					equipas[0].jogadores[i] = new Base(nome, pontos, assistencias, ressaltos, perdas, tempoJ,pos );

				}
				else
					if(pos.equals("E")|| pos.equals("e")) {
						equipas[0].jogadores[i] = new Extremo(nome, pontos, assistencias, ressaltos, perdas, tempoJ,pos );

					}
					else
						if(pos.equals("P")|| pos.equals("p")) {
							equipas[0].jogadores[i] = new Poste(nome, pontos, assistencias, ressaltos, perdas, tempoJ,pos );

						}
				return; //sai do programa
			}
			else {
				while(equipas[i] != null && equipas[i+1]== null) {  //ciclo para encurtar as posições que o proximo ciclo for vai percorrer
					mid=(fim-i)/2;

					if(equipas[mid]==null)
						fim=mid;
					else 
						i=mid;
				}
			}
		for (i=0; i<=fim && equipas[i] != null; i++) {       //percorre as posições e faz print de todas as equipas
			System.out.print("Equipa "+ i +" ---------> " );
			System.out.println(equipas[i]);	
		}

		System.out.println("A qual das equipas deseja adicionar o jogador?");
		System.out.println("[escrever o nº correspondente]");

		int eq=le.nextInt();
		while(0>eq || eq>equipas.length) {         //validação
			System.out.print("Número escolhido inválido.\n ");
			System.out.print("Equipa: ");
			eq= le.nextInt();
		}
		int h=0;
		for(i=0;i<equipas[eq].jogadores.length;i++) { //ciclo para ver qual a 1 posição nula (h)
			if(equipas[eq].jogadores[i] == null) {
				h = i;
				i= equipas[eq].jogadores.length; //para terminar o ciclo
			}
		}
		le.nextLine();
		System.out.println("Nome do jogador: ");
		String nome = le.nextLine();

		System.out.println("Tempo de jogo (em minutos): ");
		int tempoJ = le.nextInt();

		System.out.println("Média dos pontos: ");
		double pontos = le.nextDouble();

		System.out.println("Média do número de assistências: ");
		double assistencias = le.nextDouble();

		System.out.println("Média do número de ressaltos: ");
		double ressaltos = le.nextDouble();

		System.out.println("Média do número de perdas de bola: ");
		double perdas = le.nextDouble();

		le.nextLine();
		System.out.print("Posição do jogador:\n ");
		System.out.println("[Se for Base escreva B, se for Extremo escreva E, se for Poste escreva P] ");
		String pos = le.nextLine();

		if(pos.equals("B")|| pos.equals("b")) {
			equipas[eq].jogadores[h] = new Base(nome, pontos, assistencias, ressaltos, perdas, tempoJ,pos);
		}
		else
			if(pos.equals("E")|| pos.equals("e")) {
				equipas[eq].jogadores[h] = new Extremo(nome, pontos, assistencias, ressaltos, perdas, tempoJ,pos );
			}
			else
				if(pos.equals("P")|| pos.equals("p")) {
					equipas[eq].jogadores[h] = new Poste(nome, pontos, assistencias, ressaltos, perdas, tempoJ,pos );
				}
	}

	public static void comando3(Equipas[] equipas,Scanner le) {
		for (int i=0; i<=equipas.length && equipas[i] != null; i++) {   //mostra as equipas existentes
			System.out.print("Equipa "+ i +" ---------> " );
			System.out.println(equipas[i]);	
		}
		System.out.println("Qual a equipa? "
				+ "[escrever o nº correspondente]");

		int eq = le.nextInt();

		while(0>eq || eq>equipas.length) {     //validação
			System.out.print("Número escolhido inválido.\n ");
			System.out.print("Equipa: ");
			eq= le.nextInt();
		}
		double vFinal = 0;

		for(int i=0;i<equipas[eq].jogadores.length;i++) {
			if(equipas[eq].jogadores[i] != null)
				vFinal = vFinal + equipas[eq].jogadores[i].calcValia();
		}
		System.out.println("A valia da equipa é " + vFinal);
	}

	public static void comando4(Equipas[] equipas, Scanner scan) {
		double vFinal,vMenos=200000,vMais=0;
		int posMais=0,posMenos=0;

		for(int j=0;j<equipas.length && equipas[j] != null; j++) {
			vFinal=0;
			for(int i=0;i<equipas[j].jogadores.length;i++) {
				if(equipas[j].jogadores[i] != null)
					vFinal = vFinal + equipas[j].jogadores[i].calcValia();
				if(vFinal>vMais) {
					vMais=vFinal;
					posMais = j;
				}	
			}
			for(int k=0;k<equipas.length && equipas[k] != null; k++) {
				vFinal=0;
				for(int i=0;i<equipas[k].jogadores.length;i++) {
					if(equipas[k].jogadores[i] != null)
						vFinal = vFinal + equipas[k].jogadores[i].calcValia();
					if(vFinal<vMenos) {
						vMenos=vFinal;
						posMenos = k;
					}	
				}
			}
		} 
		System.out.println("A Equipa mais valiosa é " + equipas[posMais].nomeEquipa +".");
		System.out.println("A Equipa menos valiosa é " + equipas[posMenos].nomeEquipa +".");
	}
	
	public static void comando5(Equipas[] equipas, Scanner scan) {
		double vFinal,vMaisBase=0,vMaisE=0,vMaisPoste=0;
		int numJogB=0,numEqB=0,numJogE=0,numEqE=0,numJogP=0,numEqP=0;
		for(int j=0;j<equipas.length;j++) {
			if(equipas[j] != null) {
				for(int i=0;i<equipas[j].jogadores.length;i++) {
					vFinal = 0;
					if(equipas[j].jogadores[i] != null && equipas[j].jogadores[i].pos.equals("B")) {
						vFinal = equipas[j].jogadores[i].calcValia();
						if(vFinal>vMaisBase && equipas[j].jogadores[i].tempoJogo >= 100) {
							vMaisBase = vFinal;
							numEqB = j;
							numJogB = i;
						}
					}
					else
						if(equipas[j].jogadores[i] != null && equipas[j].jogadores[i].pos.equals("E")) {
								vFinal = equipas[j].jogadores[i].calcValia();
								if(vFinal>vMaisE && equipas[j].jogadores[i].tempoJogo >=100) {
									vMaisE = vFinal;
									numEqE = j;
									numJogE= i;
								}
						}
					else
						if(equipas[j].jogadores[i] != null && equipas[j].jogadores[i].pos.equals("P")) {
									vFinal = equipas[j].jogadores[i].calcValia();
									if(vFinal>vMaisPoste && equipas[j].jogadores[i].tempoJogo >=100) {
										vMaisPoste = vFinal;
										numEqP= j;
										numJogP= i;
									}
						}
					}
				}
			}
		
		System.out.println("O Jogador mais valioso da posição Base é " + equipas[numEqB].jogadores[numJogB].nome + ".");
		System.out.println("O Jogador mais valioso da posição Extremo é " + equipas[numEqE].jogadores[numJogE].nome + ".");
		System.out.println("O Jogador mais valioso da posição Poste é " + equipas[numEqP].jogadores[numJogP].nome + ".");
	}
}



