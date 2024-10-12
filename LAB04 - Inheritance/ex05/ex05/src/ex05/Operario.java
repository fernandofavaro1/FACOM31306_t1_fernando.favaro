package ex05;

public class Operario extends Funcionario{
	private float valorPorProducao;
	private int quantidadeProduzida;
	
	public Operario(String nome, String dataNascimento, float valorPorProducao, int quantidadeProduzida) {
		super(nome, dataNascimento, calculaSalario(valorPorProducao,quantidadeProduzida));
		this.valorPorProducao = valorPorProducao;
		this.quantidadeProduzida = quantidadeProduzida;
	}
	
	public static float calculaSalario(float valorPorProducao, int quantidadeProduzida) {
		return valorPorProducao * quantidadeProduzida;
	}

	public float getValorPorProducao() {
		return valorPorProducao;
	}

	public void setValorPorProducao(float valorPorProducao) {
		this.valorPorProducao = valorPorProducao;
	}

	public int getQuantidadeProduzida() {
		return quantidadeProduzida;
	}

	public void setQuantidadeProduzida(int quantidadeProduzida) {
		this.quantidadeProduzida = quantidadeProduzida;
	}
	
}
