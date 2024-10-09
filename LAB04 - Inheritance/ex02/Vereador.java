public class Vereador extends Candidato{
    String bairro;
    public Vereador(String nome, String data_de_nascimento, String genero, double bens, boolean reeleicao, int partido, String bairro){
        super(nome, data_de_nascimento, genero, bens, reeleicao, partido);
        this.bairro = bairro;
    }

    public String toString(){
        return "Candidato a vereador:\nNome do candidato: " + nome + "\nData de nascimento: " + data_de_nascimento + "\nGenero: " + genero + "\nBens: " + bens + "\nReeleicao: " + reeleicao + "\nPartido: "+ partido +"\nBairro onde mora: "+ bairro;
    }
}