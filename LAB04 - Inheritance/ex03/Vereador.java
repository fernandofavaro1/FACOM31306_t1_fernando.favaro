public class Vereador extends Candidato{
    String bairro;
    public Vereador(String nome, String data_de_nascimento, String genero, double bens, boolean reeleicao, int partido, String bairro){
        super(nome, data_de_nascimento, genero, bens, reeleicao, partido);
        this.bairro = bairro;
    }

    @Override
    public String toString(){
        return "Candidato a vereador:\n" + super.toString() +"\nBairro do vereador: "+bairro;
    }
}