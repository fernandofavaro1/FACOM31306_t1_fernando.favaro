public class Horista extends Funcionario{
    private int horas;
    private double valor;

    public Horista(String nome, String dataNascimento, double salario, int horas, double valor){
        super(nome, dataNascimento, horas * valor);
        this.horas = horas;
        this.valor = valor;
    }
}
