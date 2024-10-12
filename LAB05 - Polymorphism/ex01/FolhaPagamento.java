public class FolhaPagamento{

    public String retornaPagamento(Funcionario f1, Funcionario f2, Funcionario f3, Funcionario f4){
        return "Total gasto com salarios: "+(f1.getSalario() + f2.getSalario() + f3.getSalario() + f4.getSalario());
    }
}