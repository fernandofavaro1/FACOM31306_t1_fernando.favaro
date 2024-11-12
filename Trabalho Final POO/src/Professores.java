public class Professores exetends Pessoa{
    int inicioDoContrato;
    String departamentoVinculado;

    public Professores(String cpf, String nome, String dataNascimento, int inicioDoContrato, String departamentoVinculado) {
        super(cpf, nome, dataNascimento);
        this.inicioDoContrato = inicioDoContrato;
        this.departamentoVinculado = departamentoVinculado;
    }

    public int getInicioDoContrato() {
        return inicioDoContrato;
    }

    public void setInicioDoContrato(int inicioDoContrato) {
        this.inicioDoContrato = inicioDoContrato;
    }

    public String getDepartamentoVinculado() {
        return departamentoVinculado;
    }

    public void setDepartamentoVinculado(String departamentoVinculado) {
        this.departamentoVinculado = departamentoVinculado;
    }
}
