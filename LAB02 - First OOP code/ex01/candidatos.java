public class candidatos {
    private String nome;
    private String data_de_nascimento;
    private String genero;
    private float bens;
    private String reeleicao;
    private int n_partido;
    private String cargo;


    public candidatos (String nome, String data_de_nascimento, String genero, float bens, String reeleicao, int n_partido, String cargo){
        this.nome = nome;
        this.data_de_nascimento = data_de_nascimento;
        this.genero = genero;
        this.bens = bens;
        this.reeleicao = reeleicao;
        this.n_partido = n_partido;
        this.cargo = cargo;
    }

    public void exibir_informacoes () {
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + data_de_nascimento);
        System.out.println("Genero: " + genero);
        System.out.println("Bens: " + bens);
        System.out.println("Candidato a reeleicao?: " + reeleicao);
        System.out.println("Numero do partido: " + n_partido);
        System.out.println("Cargo: " + cargo);
        System.out.println("------------------------------------------------------------------------");
    }
}