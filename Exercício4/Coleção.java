abstract public  class Cole��o {
	protected String tema;
	
	abstract int calcLivros();
	abstract String maisAntigo();
	abstract Livro buscarLivro(int l);
	
	public Cole��o () {}

	public Cole��o(String tema) {
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
		return "Cole��o [tema=" + tema + "]";
	}
	
	

}
