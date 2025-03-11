import java.util.ArrayList;

public class Cole��oPublica extends Cole��o {
	private ArrayList <Livro> lista;
	
	public Cole��oPublica () {
		lista = new ArrayList <Livro> ();
	}

	public Cole��oPublica(String tema) {
		super(tema);
	}

	public Cole��oPublica(String tema,ArrayList<Livro> lista) {
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
		return "Cole��oPublica ---> lista=" + lista + ", tema=" + tema + "";
	}

	
}
