public class CandidatoVereador{
    private String nome;
    private String data_de_nascimento;
    private String genero;
    private double bens;
    private boolean reeleicao;
    private int partido;
    private String bairro;

    public CandidatoVereador(String nome, String data_de_nascimento, String genero, double bens, boolean reeleicao, int partido, String bairro){
        this.nome = nome;
        this.data_de_nascimento = data_de_nascimento;
        this.genero = genero;
        this.bens = bens;
        this.reeleicao = reeleicao;
        this.partido = partido;
        this.bairro = bairro;
    }

    public String toString(){
        return "Candidato a vereador:\nNome do candidato: " + nome + "\nData de nascimento: " + data_de_nascimento + "\nGenero: " + genero + "\nBens: " + bens + "\nReeleicao: " + reeleicao + "\nPartido: "+ partido +"\nBairro onde mora: "+ bairro;
    }

}