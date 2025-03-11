abstract public  class Coleção {
	protected String tema;
	
	abstract int calcLivros();
	abstract String maisAntigo();
	abstract Livro buscarLivro(int l);
	
	public Coleção () {}

	public Coleção(String tema) {
		super();
		this.tema = tema;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	

	public String toString() {
		return "Coleção [tema=" + tema + "]";
	}
	
	

}
