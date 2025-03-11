import java.io.*;
import java.util.ArrayList;

public class Exerc4 {

	public static void main(String[] args) {
		ArrayList <Livro> conjLivros= new ArrayList <>();  //cria um ArrayList com objetos do tipo Livro
		ArrayList <Cole��o> conjCol= new ArrayList <>(); //cria um ArrayList com objetos do tipo Cole��o
		Cole��oPublica UmaAventura = new Cole��oPublica ("Aventura", conjLivros);
		Biblioteca b1 = new Biblioteca(conjCol);

		Livro livl= new Livro ("Uma Aventura na Cidade",2018) ; 
		UmaAventura.addLivro(livl);		
		Livro liv2= new Livro("Uma Aventura no Alto Mar",2008) ;	
		UmaAventura.addLivro(liv2);
		Livro liv3= new Livro ("Uma Aventura Fant�stica", 2003) ;
		UmaAventura.addLivro(liv3);
		Livro liv4= new Livro ("Uma Aventura na Amaz�nia ", 2009) ;
		UmaAventura.addLivro(liv4);
		System.out.println("A cole��o tem " +UmaAventura.calcLivros()+" livros");
		System.out.println("O livro mais antigo � " +UmaAventura.maisAntigo ());

		Cole��oPrivada LeslieWolf= new Cole��oPrivada ("Mist�rio", 20);
		Livro liv5= new Livro ("A Rapariga da Rosa",2021) ; 
		LeslieWolf.addLivro(liv5);		
		Livro liv6= new Livro("A Rapariga Sem Nome", 2019) ;	
		LeslieWolf.addLivro(liv6);
		Livro liv7= new Livro ("A Rapariga do Fim", 2020) ;
		LeslieWolf.addLivro(liv7);
		System.out.println("A cole��o tem " +LeslieWolf.calcLivros()+" livros");
		System.out.println("O livro mais anitgo � " +LeslieWolf.maisAntigo ());
		b1.addCole��o(UmaAventura);
		b1.addCole��o(LeslieWolf);
		
		System.out.println("Cole��es com o tema Aventura:");
		b1.livrosAventura();       //cole��es com tema aventura 
		
		File fo = new File("biblioteca.obj");
		File fichLivros = new File ("biblioteca.txt");
		escreveFichObj(fo,conjCol);
		escreveFichTxt(fichLivros,conjCol);
	}

	public static void escreveFichObj(File fo, ArrayList<Cole��o> conjCol) {
		try {
			FileOutputStream fos = new FileOutputStream(fo);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (int i=0;i<conjCol.size(); i++) {      //percorre o conjunto de cole��es
				oos.writeObject(conjCol.get(i).toString());  //vai buscar a cole��o que est� na pos i do conjunto 
			}
			oos.close();
		} 
		catch (FileNotFoundException ex) {
			System.out.println("Erro a criar ficheiro.");
		} 
		catch (IOException ex) {
			System.out.println("Erro a escrever para o ficheiro.");
		}
	}
	
	public static void escreveFichTxt(File fichLivros,ArrayList<Cole��o> conjCol) { 
		try {
			FileWriter fw = new FileWriter(fichLivros);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i=0;i<conjCol.size();i++) {        //percorre o conjunto de cole��es
				for (int l = 0; l < conjCol.get(i).calcLivros(); l++) {   //percorre o conjunto de livros da cole��o
					bw.write(conjCol.get(i).buscarLivro(l).getTitulo());
					bw.newLine();
				}
			}
			bw.close();
		}	
		 catch (IOException ex) {
			System.out.println("Erro a escrever no ficheiro.");
		}
	}
}


