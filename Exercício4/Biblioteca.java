import java.util.ArrayList;

public class Biblioteca {
	private ArrayList <Cole��o> cole��es;
	
	public Biblioteca() {
		cole��es = new ArrayList <Cole��o> ();
	}

	public Biblioteca(ArrayList<Cole��o> cole��es) {
		super();
		this.cole��es = cole��es;
	}

	public ArrayList<Cole��o> getCole��es() {
		return cole��es;
	}

	public void setCole��es(ArrayList<Cole��o> cole��es) {
		this.cole��es = cole��es;
	}
	
	public void addCole��o(Cole��o c) {
		cole��es.add(c);
	}
	
	public void livrosAventura() {
		for (Cole��o c:cole��es) {  //percorre as cole��es
			if(c.getTema().equalsIgnoreCase("aventura")) { //comparar o tema
					for (int l = 0; l < c.calcLivros(); l++) {  //percorre o conj de livros da cole��o
						System.out.println(c.buscarLivro(l).getTitulo());
					}
			}
		}	
	}
	
	public void imprimeCole��o() {
		for (Cole��o c : cole��es)
			System.out.println(c);
	}
	
	public String toString() {
		return "Biblioteca [cole��es=" + cole��es + "]";
	}
	


}
