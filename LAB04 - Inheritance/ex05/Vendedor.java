public class Vendedor extends Funcionario{
    private int vendas;
    private double comissao;

    public Vendedor(String nome, String dataNascimento, double salario, int vendas, double comissao){
        super(nome, dataNascimento, salario + (comissao * vendas));
        this.vendas = vendas;
        this.comissao = comissao;
    }
}
