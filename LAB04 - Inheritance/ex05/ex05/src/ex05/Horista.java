package ex05;

public class Horista extends Funcionario{
	private float horasTrabalhadas;
	private float valorProducao;
	
	public Horista(String nome, String dataNascimento, float horasTrabalhadas, float valorProducao) {
		super(nome, dataNascimento, calculaSalario(horasTrabalhadas, valorProducao));
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorProducao = valorProducao;
	}
	
	public static float calculaSalario(float horasTrabalhadas, float valorProducao) {
		return horasTrabalhadas * valorProducao;
	}

	public float getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(float horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public float getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(float valorProducao) {
		this.valorProducao = valorProducao;
	}
	
	
	
}
