public class C2 extends C1{
    public String genero;
    protected double renda;
    private String escolaridade;

    public C2(){
        System.out.println("Classe C2: Chamada do construtor sem parametros");
    }

    public C2(String nome, String sobrenome, int idade, String genero, double renda, String escolaridade){
        super(nome, sobrenome, idade);
        System.out.println("Classe C2: Chamada do construtor com parametros");
        this.genero = genero;
        this.renda = renda;
        this.escolaridade = escolaridade;
    }

    @Override
    public String mostrarAtributos(){
        return "{Nome: "+nome+"|Sobrenome: "+sobrenome+"|Idade: "+getIdade()+"|Genero: "+genero+"|Renda: "+renda+"|Escolaridade: "+escolaridade+"}";
    }

    public void mostraAtributosSuper(){
        System.out.println("{Nome: "+nome+"|Sobrenome: "+sobrenome+"|Idade: "+super.getIdade()+"|Genero: "+genero+"|Renda: "+renda+"|Escolaridade: "+escolaridade+"}");
    }

    public String getEscolaridade(){
        return escolaridade;
    }
}