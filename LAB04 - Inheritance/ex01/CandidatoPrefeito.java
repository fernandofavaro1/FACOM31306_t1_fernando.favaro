public class CandidatoPrefeito {
    private String nome;
    private String data_de_nascimento;
    private String genero;
    private double bens;
    private boolean reeleicao;
    private int partido;
    private String nome_vice;
    private int partido_vice;

    public CandidatoPrefeito(String nome, String data_de_nascimento, String genero, double bens, boolean reeleicao, int partido, String nome_vice, int partido_vice){
        this.nome = nome;
        this.data_de_nascimento = data_de_nascimento;
        this.genero = genero;
        this.bens = bens;
        this.reeleicao = reeleicao;
        this.partido = partido;
        this.nome_vice = nome_vice;
        this.partido_vice = partido_vice;
    }

    public String toString(){
        return "Candidato a prefeito:\nNome do candidato: " + nome + "\nData de nascimento: " + data_de_nascimento + "\nGenero: " + genero + "\nBens: " + bens + "\nReeleicao: " + reeleicao + "\nPartido: "+ partido +"\nNome do vice: "+nome_vice+"\nPartido do vice: " + partido_vice;
    }
}