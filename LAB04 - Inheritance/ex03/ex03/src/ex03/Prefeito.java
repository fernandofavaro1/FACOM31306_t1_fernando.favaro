package ex03;

public class Prefeito extends Candidato {
	private String vicePrefeito;

	public Prefeito(String nome, String dataNascimento, char genero, float totalBens, String reeleicao, int numPartido,
			String vicePrefeito) {
		super(nome, dataNascimento, genero, totalBens, reeleicao, numPartido);
		this.vicePrefeito = vicePrefeito;
	}

	@Override
	public String toString() {
		return "Prefeito [vicePrefeito=" + vicePrefeito + super.toString() + "]";
	}

	public String getVicePrefeito() {
		return vicePrefeito;
	}

	public void setVicePrefeito(String vicePrefeito) {
		this.vicePrefeito = vicePrefeito;
	}
	
}
