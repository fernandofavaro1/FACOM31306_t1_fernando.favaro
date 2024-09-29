public class Jogador{
    private String nome;
    private int idade;
    private double altura;
    private int peso;

    public Jogador(String nome, int idde, double altura, int peso){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return "Jogador: " +nome+ "\nIdade:" +idade+ "\nAltura: " +altura+ "\nPeso: " +peso;
    }

}