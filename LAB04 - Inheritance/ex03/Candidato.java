public class Candidato{
    private String nome;
    private String data_de_nascimento;
    private String genero;
    private double bens;
    private boolean reeleicao;
    private int partido;

    public Candidato(String nome, String data_de_nascimento, String genero, double bens, boolean reeleicao, int partido){
        this.nome = nome;
        this.data_de_nascimento = data_de_nascimento;
        this.genero = genero;
        this.bens = bens;
        this.reeleicao = reeleicao;
        this.partido = partido;
    }

    @Override
    public String toString(){
        return "Candidato:\nNome: "+nome+"\nData de nascimento: "+data_de_nascimento+"\nGenero: "+genero+"\nBens: "+bens+"\nPode se reeleger?: "+reeleicao+"\nPartido: "+partido;
    }
}