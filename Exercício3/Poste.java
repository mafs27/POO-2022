
public class Poste extends Jogadores {
	public Poste() {}
	
	public Poste(String nome, double mediaPontos, double mediaPerdas, double mediaAssistencias, double mediaRessaltos,double tempoJogo, String pos) {
		super(nome,mediaPontos,mediaPerdas,mediaAssistencias,mediaRessaltos,tempoJogo,pos);
		this.pos="P";
	}
	
	public double calcValia() {
		double Valia=3*mediaPontos + 1*mediaAssistencias + 3*mediaRessaltos - 3*mediaPerdas;
		return Valia;
	}

	public String toString() {
		return "Poste [nome=" + nome + ", mediaPontos=" + mediaPontos + ", mediaPerdas=" + mediaPerdas
				+ ", mediaAssistencias=" + mediaAssistencias + ", mediaRessaltos=" + mediaRessaltos + ", tempoJogo="
				+ tempoJogo + "]";
	}
}
