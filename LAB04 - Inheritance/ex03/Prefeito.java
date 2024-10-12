public class Prefeito extends Candidato{
    private String nome_vice;
    private int partido_vice;

    public Prefeito(String nome, String data_de_nascimento, String genero, double bens, boolean reeleicao, int partido, String nome_vice, int partido_vice){
        super(nome, data_de_nascimento, genero, bens, reeleicao, partido);
        this.nome_vice = nome_vice;
        this.partido_vice = partido_vice;
    }

    @Override
    public String toString(){
        return "Candidato a prefeito:\n" + super.toString() +"\nNome do vice: "+nome_vice+"\nPartido do vice: "+partido_vice;
    }
}