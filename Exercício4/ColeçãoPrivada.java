import java.util.Arrays;

public class ColeçãoPrivada extends Coleção {
	private int num;
	private Livro [] livros;

	public ColeçãoPrivada (String tema,int num) {
		super(tema);
		livros = new Livro[num];
	}

	public ColeçãoPrivada(String tema, int num,Livro[] livros) {
		super(tema);
		livros = new Livro[num];
		this.livros = livros;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Livro[] getLivros() {
		return livros;
	}

	public void setLivros(Livro[] livros) {
		this.livros = livros;
	}
	public void addLivro(Livro n) {
		for(int i=0; i<livros.length; i++) {
			if(livros[i] == null) {
				livros[i]= n;
				i = livros.length; //termina o ciclo for
			}
		}
	}
	public Livro buscarLivro(int l) {
		return livros[l];
	}
	public int calcLivros () {
		int numLivros=0;
		for(int i=0;i<livros.length;i++) {
			if(livros[i] != null)
				numLivros = numLivros + 1;
		}
		return numLivros;
	}

	public String maisAntigo() {
		int mAntigo=10000;
		String lAntigo= null;    
		for (int i=0;i<livros.length; i++) {
			if(livros[i] != null) {
				int a = livros[i].getAno();  //vai buscar o ano do livro
				if (a<mAntigo) {
					mAntigo=a;
					lAntigo=livros[i].getTitulo();   //vai buscar o titulo do livro
				}			
			}
		}
		return lAntigo ;
	}
	
	public String toString() {
		return "ColeçãoPrivada ---> livros=" + Arrays.toString(livros) + ", tema=" + tema + "";
	}
}
