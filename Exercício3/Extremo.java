
public class Extremo extends Jogadores {
	public Extremo() {}
	
	public Extremo(String nome, double mediaPontos, double mediaPerdas, double mediaAssistencias, double mediaRessaltos,double tempoJogo,String pos) {
		super(nome,mediaPontos,mediaPerdas,mediaAssistencias,mediaRessaltos,tempoJogo,pos);
		this.pos= "E";
	}
	
	public double calcValia() {
		double Valia=4*mediaPontos + 2*mediaAssistencias + 2*mediaRessaltos - 3*mediaPerdas;
		return Valia;
	}

	public String toString() {
		return "Extremo [nome=" + nome + ", mediaPontos=" + mediaPontos + ", mediaPerdas=" + mediaPerdas
				+ ", mediaAssistencias=" + mediaAssistencias + ", mediaRessaltos=" + mediaRessaltos + ", tempoJogo="
				+ tempoJogo + "]";
	}
	
}
