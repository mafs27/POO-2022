import java.util.ArrayList;

public class ColeçãoPublica extends Coleção {
	private ArrayList <Livro> lista;
	
	public ColeçãoPublica () {
		lista = new ArrayList <Livro> ();
	}

	public ColeçãoPublica(String tema) {
		super(tema);
	}

	public ColeçãoPublica(String tema,ArrayList<Livro> lista) {
		super(tema);
		this.lista = lista;
	}

	public ArrayList<Livro> getLista() {
		return lista;
	}


	public void setLista(ArrayList<Livro> lista) {
		this.lista = lista;
	}
	
	public void addLivro(Livro l) {
		lista.add(l);
	}
		
	public int calcLivros () {
		int nLivros = lista.size();
		return nLivros;
	}
	
	public String maisAntigo() {
		int mAntigo=10000;
		String lAntigo= null;
		for (Livro l:lista) {
			int a = l.getAno();   //vai buscar o ano do livro
			if (a<mAntigo) {
				mAntigo=a;
				lAntigo=l.getTitulo();   //vai buscar o titulo do livro
			}			
		}
	
	return lAntigo ;
	}
	
	public Livro buscarLivro(int l) {
		return lista.get(l);
	}

	public String toString() {
		return "ColeçãoPublica ---> lista=" + lista + ", tema=" + tema + "";
	}

	
}
