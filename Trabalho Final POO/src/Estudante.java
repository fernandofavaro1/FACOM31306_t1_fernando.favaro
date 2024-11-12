public abstract class Estudante extends Pessoa{
    protected double cra;

    public Estudante(String cpf, String nome, String dataNascimento, double cra){
        super(cpf, nome, dataNascimento);
        this.cra = cra;
    }

    public double getCra() {
        return cra;
    }

    public void setCra(double cra) {
        this.cra = cra;
    }
}
