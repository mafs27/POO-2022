import java.util.ArrayList;

public class Biblioteca {
	private ArrayList <Coleção> coleções;
	
	public Biblioteca() {
		coleções = new ArrayList <Coleção> ();
	}

	public Biblioteca(ArrayList<Coleção> coleções) {
		super();
		this.coleções = coleções;
	}

	public ArrayList<Coleção> getColeções() {
		return coleções;
	}

	public void setColeções(ArrayList<Coleção> coleções) {
		this.coleções = coleções;
	}
	
	public void addColeção(Coleção c) {
		coleções.add(c);
	}
	
	public void livrosAventura() {
		for (Coleção c:coleções) {  //percorre as coleções
			if(c.getTema().equalsIgnoreCase("aventura")) { //comparar o tema
					for (int l = 0; l < c.calcLivros(); l++) {  //percorre o conj de livros da coleção
						System.out.println(c.buscarLivro(l).getTitulo());
					}
			}
		}	
	}
	
	public void imprimeColeção() {
		for (Coleção c : coleções)
			System.out.println(c);
	}
	
	public String toString() {
		return "Biblioteca [coleções=" + coleções + "]";
	}
	


}
