package ex05;

public class Vendedor extends Funcionario{
	private float salarioFixo;
	private float comissao;
	private int vendas;
	
	public Vendedor(String nome, String dataNascimento, float salarioFixo, float comissao, int vendas) {
		super(nome, dataNascimento, calculaSalario(salarioFixo, comissao, vendas));
		this.comissao = comissao;
		this.vendas = vendas;
	}
	
	public static float calculaSalario(float salarioFixo, float comissao, int vendas) {
		return salarioFixo + (comissao * vendas);
	}

	public float getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(float salarioFixo) {
		this.salarioFixo = salarioFixo;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	public int getVendas() {
		return vendas;
	}

	public void setVendas(int vendas) {
		this.vendas = vendas;
	}
	
	
}
