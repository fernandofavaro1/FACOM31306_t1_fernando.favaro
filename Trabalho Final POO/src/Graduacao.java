public class Graduacao extends Estudante{
    protected boolean estagioSupervisionado;

    public Graduacao(String cpf, String nome, String dataNascimento, double cra, boolean estagioSupervisionado) {
        super(cpf, nome, dataNascimento, cra);
        this.estagioSupervisionado = estagioSupervisionado;
    }

    public boolean getEstagioSupervisionado() {
        return estagioSupervisionado;
    }

    public void setEstagioSupervisionado(boolean estagioSupervisionado) {
        this.estagioSupervisionado = estagioSupervisionado;
    }
}
