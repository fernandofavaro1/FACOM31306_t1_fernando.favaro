public class C1{
    public String nome;
    protected String sobrenome;
    private int idade;

    public C1(){
        System.out.println("Classe C1: Chamada do construtor sem parametros");
    }

    public C1(String nome, String sobrenome, int idade){
        System.out.println("Classe C1: Chamada do construtor com paramtros");
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public String mostrarAtributos(){
        return "{Nome: "+nome+"|Sobrenome: "+sobrenome+"|Idade: "+idade+"}";
    }

    public int getIdade(){
        return idade;
    }
}