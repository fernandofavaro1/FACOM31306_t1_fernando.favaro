package ex03;

public class Vereador extends Candidato{
	private String codigo;
	private String bairro;
	
	public Vereador(String nome, String dataNascimento, char genero, float totalBens, String reeleicao, int numPartido,
			String codigo, String bairro) {
		super(nome, dataNascimento, genero, totalBens, reeleicao, numPartido);
		this.codigo = codigo;
		this.bairro = bairro;
	}


	@Override
	public String toString() {
		return "Vereador [codigo=" + codigo + ", bairro=" + super.toString() + "]";
	}
	
	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
}
