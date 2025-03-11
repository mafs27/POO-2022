
public abstract class Jogadores {
	protected String nome, pos;
	protected double mediaPontos, mediaPerdas, mediaAssistencias, mediaRessaltos, tempoJogo;
	
	
	public Jogadores() {}
	
	public Jogadores(String nome, double mediaPontos, double mediaPerdas, double mediaAssistencias,
			double mediaRessaltos, double tempoJogo, String pos) {
		super();
		this.nome = nome;
		this.mediaPontos = mediaPontos;
		this.mediaPerdas = mediaPerdas;
		this.mediaAssistencias = mediaAssistencias;
		this.mediaRessaltos = mediaRessaltos;
		this.tempoJogo = tempoJogo;
		this.pos = pos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMediaPontos() {
		return mediaPontos;
	}

	public void setMediaPontos(double mediaPontos) {
		this.mediaPontos = mediaPontos;
	}

	public double getMediaPerdas() {
		return mediaPerdas;
	}

	public void setMediaPerdas(double mediaPerdas) {
		this.mediaPerdas = mediaPerdas;
	}

	public double getMediaAssistencias() {
		return mediaAssistencias;
	}

	public void setMediaAssistencias(double mediaAssistencias) {
		this.mediaAssistencias = mediaAssistencias;
	}

	public double getMediaRessaltos() {
		return mediaRessaltos;
	}

	public void setMediaRessaltos(double mediaRessaltos) {
		this.mediaRessaltos = mediaRessaltos;
	}

	public double getTempoJogo() {
		return tempoJogo;
	}

	public void setTempoJogo(double tempoJogo) {
		this.tempoJogo = tempoJogo;
	}
	
	public String getPos(String pos) {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	abstract double calcValia();

	public String toString() {
		return "Jogadores [nome=" + nome + ", mediaPontos=" + mediaPontos + ", mediaPerdas=" + mediaPerdas
				+ ", mediaAssistencias=" + mediaAssistencias + ", mediaRessaltos=" + mediaRessaltos + ", tempoJogo="
				+ tempoJogo + ", pos=" + pos + "]";
	}

	
	

	
	
	
	
}
