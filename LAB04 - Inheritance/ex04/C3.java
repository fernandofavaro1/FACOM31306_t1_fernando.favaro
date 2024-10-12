public class C3 extends C2{
    public String cor;
    protected String roupa;
    private String time;

    public C3(){
        System.out.println("Classe C3: Chamando construtor sem parametros");
    }
    public C3(String nome, String sobrenome, int idade, String genero, double renda, String escolaridade, String cor, String roupa, String time){
        super(nome, sobrenome, idade, genero, renda, escolaridade);
        System.out.println("Classe C3: Chamando construtor com parametros");
        this.cor = cor;
        this.roupa = roupa;
        this.time = time;
    }

    @Override
    public String mostrarAtributos(){
        return "{Nome: "+nome+"|Sobrenome: "+sobrenome+"|Idade: "+getIdade()+"|Genero: "+genero+"|Renda: "+renda+"|Escolaridade: "+getEscolaridade()+"|Cor: "+cor+"|Roupa: "+roupa+"|TIme: "+time+"}";
    }

    @Override
    public void mostraAtributosSuper(){
        System.out.println("{Nome: "+nome+"|Sobrenome: "+sobrenome+"|Idade: "+super.getIdade()+"|Genero: "+genero+"|Renda: "+renda+"|Escolaridade: "+super.getEscolaridade()+"|Cor: "+cor+"|Roupa: "+roupa+"|Time: "+time+"}");
    }
}