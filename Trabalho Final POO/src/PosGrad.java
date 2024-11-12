public class PosGrad extends Estudante{
    String temaDePesquisa;

    public PosGrad(String cpf, String nome,String dataNascimento, double cra, String temaDePesquisa){
        super(cpf,nome,dataNascimento,cra);
        this.temaDePesquisa = temaDePesquisa;
    }

    public String getTemaDePesquisa() {
        return temaDePesquisa;
    }

    public void setTemaDePesquisa(String temaDePesquisa) {
        this.temaDePesquisa = temaDePesquisa;
    }
}
