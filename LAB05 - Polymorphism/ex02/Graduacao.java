public class Graduacao extends Estudante{
    public Graduacao(String nome, String endereco) {
        super(nome, endereco);
    }

    public void print(){
        System.out.println("Graduacao:\n Nome: "+getNome());
    }
}
