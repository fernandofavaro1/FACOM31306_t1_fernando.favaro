public class Operario extends Funcionario{
    private int qtd;
    private double producao;

    public Operario(String nome, String dataNascimento, double salario, int qtd, double producao){
        super(nome, dataNascimento, qtd * producao);
        this.qtd = qtd;
        this.producao = producao;
    }
}
