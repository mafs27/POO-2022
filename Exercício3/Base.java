
public class Base extends Jogadores {
	public Base(){}
	
	public Base(String nome, double mediaPontos, double mediaPerdas, double mediaAssistencias, double mediaRessaltos,double tempoJogo,String pos) {
		super(nome,mediaPontos,mediaPerdas,mediaAssistencias,mediaRessaltos,tempoJogo,pos);
		this.pos="B";
	}
	
	public double calcValia() {
		double Valia= 3*mediaPontos + 3*mediaAssistencias + 1*mediaRessaltos - 3*mediaPerdas;
		return Valia;
	}

	public String toString() {
		return "Base [nome=" + nome + ", mediaPontos=" + mediaPontos + ", mediaPerdas=" + mediaPerdas
				+ ", mediaAssistencias=" + mediaAssistencias + ", mediaRessaltos=" + mediaRessaltos + ", tempoJogo="
				+ tempoJogo + "]";
	}
	
}
