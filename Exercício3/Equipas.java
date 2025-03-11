import java.util.Arrays;

public class Equipas {
	protected String nomeEquipa;
	protected Jogadores [] jogadores = new Jogadores [12];
	
	public Equipas() {}
	public Equipas(String nomeEquipa) {
		this.nomeEquipa = nomeEquipa;
	}

	public Equipas(String nomeEquipa, Jogadores[] jogadores) {
		super();
		this.nomeEquipa = nomeEquipa;
		this.jogadores = jogadores;
	}

	public String getNomeEquipa() {
		return nomeEquipa;
	}

	public void setNomeEquipa(String nomeEquipa) {
		this.nomeEquipa = nomeEquipa;
	}

	public Jogadores[] getJogadores() {
		return jogadores;
	}

	public void setJogadores(Jogadores[] jogadores) {
		this.jogadores = jogadores;
	}


	public String toString() {
		return "Equipas [nomeEquipa=" + nomeEquipa + ", jogadores=" + Arrays.toString(jogadores) + "]";
	}
}
	
	