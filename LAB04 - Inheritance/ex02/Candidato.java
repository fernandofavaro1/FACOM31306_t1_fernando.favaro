public class Candidato{
    protected String nome;
    protected String data_de_nascimento;
    protected String genero;
    protected double bens;
    protected boolean reeleicao;
    protected int partido;

    public Candidato(String nome, String data_de_nascimento, String genero, double bens, boolean reeleicao, int partido){
        this.nome = nome;
        this.data_de_nascimento = data_de_nascimento;
        this.genero = genero;
        this.bens = bens;
        this.reeleicao = reeleicao;
        this.partido = partido;
    }

    public String toString(){
        return "Candidato:\nNome: "+nome+"\nData de nascimento: "+data_de_nascimento+"\nGenero: "+genero+"\nBens: "+bens+"\nPode se reeleger?: "+reeleicao+"\nPartido: "+partido;
    }
}