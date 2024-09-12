public class candidatos {
    private String nome;
    private String data_de_nascimento;
    private char genero;
    private float bens;
    private String reeleicao;
    private int n_partido;
    private String cargo;


    public candidatos (String nome, String data_de_nascimento, char genero, float bens, String reeleicao, int n_partido, String cargo){
        this.nome = nome;
        this.data_de_nascimento = data_de_nascimento;
        this.genero = genero;
        this.bens = bens;
        this.reeleicao = reeleicao;
        this.n_partido = n_partido;
        this.cargo = cargo;
    }

    public void exibir_informacoes () {
        System.out.printf("Nome: ", + nome);
        System.out.printf("Data de nascimento: ", + data_de_nascimento);
        System.out.printf("Genero: ", + genero);
        System.out.printf("Bens: ", + bens);
        System.out.printf("Candidato a reeleicao?: ", + reeleicao);
        System.out.printf("Numero do partido: ", + n_partido);
        System.out.printf("Cargo: ", + cargo);
        System.out.printf("------------------------------------------------------------------------");
    }
}