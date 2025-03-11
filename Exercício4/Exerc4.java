import java.io.*;
import java.util.ArrayList;

public class Exerc4 {

	public static void main(String[] args) {
		ArrayList <Livro> conjLivros= new ArrayList <>();  //cria um ArrayList com objetos do tipo Livro
		ArrayList <Coleção> conjCol= new ArrayList <>(); //cria um ArrayList com objetos do tipo Coleção
		ColeçãoPublica UmaAventura = new ColeçãoPublica ("Aventura", conjLivros);
		Biblioteca b1 = new Biblioteca(conjCol);

		Livro livl= new Livro ("Uma Aventura na Cidade",2018) ; 
		UmaAventura.addLivro(livl);		
		Livro liv2= new Livro("Uma Aventura no Alto Mar",2008) ;	
		UmaAventura.addLivro(liv2);
		Livro liv3= new Livro ("Uma Aventura Fantástica", 2003) ;
		UmaAventura.addLivro(liv3);
		Livro liv4= new Livro ("Uma Aventura na Amazónia ", 2009) ;
		UmaAventura.addLivro(liv4);
		System.out.println("A coleção tem " +UmaAventura.calcLivros()+" livros");
		System.out.println("O livro mais antigo é " +UmaAventura.maisAntigo ());

		ColeçãoPrivada LeslieWolf= new ColeçãoPrivada ("Mistério", 20);
		Livro liv5= new Livro ("A Rapariga da Rosa",2021) ; 
		LeslieWolf.addLivro(liv5);		
		Livro liv6= new Livro("A Rapariga Sem Nome", 2019) ;	
		LeslieWolf.addLivro(liv6);
		Livro liv7= new Livro ("A Rapariga do Fim", 2020) ;
		LeslieWolf.addLivro(liv7);
		System.out.println("A coleção tem " +LeslieWolf.calcLivros()+" livros");
		System.out.println("O livro mais anitgo é " +LeslieWolf.maisAntigo ());
		b1.addColeção(UmaAventura);
		b1.addColeção(LeslieWolf);
		
		System.out.println("Coleções com o tema Aventura:");
		b1.livrosAventura();       //coleções com tema aventura 
		
		File fo = new File("biblioteca.obj");
		File fichLivros = new File ("biblioteca.txt");
		escreveFichObj(fo,conjCol);
		escreveFichTxt(fichLivros,conjCol);
	}

	public static void escreveFichObj(File fo, ArrayList<Coleção> conjCol) {
		try {
			FileOutputStream fos = new FileOutputStream(fo);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (int i=0;i<conjCol.size(); i++) {      //percorre o conjunto de coleções
				oos.writeObject(conjCol.get(i).toString());  //vai buscar a coleção que está na pos i do conjunto 
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
	
	public static void escreveFichTxt(File fichLivros,ArrayList<Coleção> conjCol) { 
		try {
			FileWriter fw = new FileWriter(fichLivros);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i=0;i<conjCol.size();i++) {        //percorre o conjunto de coleções
				for (int l = 0; l < conjCol.get(i).calcLivros(); l++) {   //percorre o conjunto de livros da coleção
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


