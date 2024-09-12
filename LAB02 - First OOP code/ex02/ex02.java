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

    public String getnome(){
        return nome;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public String getdata_de_nascimento (){
        return data_de_nascimento;
    }

    public void setdata_de_nascimento(String data_de_nascimento){
        this.data_de_nascimento = data_de_nascimento;
    }

    public String getgenero(){
        return genero;
    }

    public String setgenero(String genero){
        ths.genero = genero;
    }

    public float getbens(){
        return bens;
    }

    public float setbens(float bens) {
        this.bens = bens;
    }

    public String getreeleicao(){
        return reeleicao;
    }

    public String setreeleicao (String reeleicao){
        this.reeleicao = reeleicao;
    }

    public int getn_partido(){
        return n_partido;
    }

    public int setn_partido(int n_partido){
        this.n_partido = n_partido;
    }

    public String getcargo(){
        return cargo;
    }

    public String setcargo(String cargo){
        this.cargo = cargo;
    }

    public void exibir_informacoes () {
        System.out.println("Nome: ", + nome);
        System.out.println("Data de nascimento: ", + data_de_nascimento);
        System.out.println("Genero: ", + genero);
        System.out.println("Bens: ", + bens);
        System.out.println("Candidato a reeleicao?: ", + reeleicao);
        System.out.println("Numero do partido: ", + n_partido);
        System.out.println("Cargo: ", + cargo);
        System.out.println("------------------------------------------------------------------------");
    }
}
