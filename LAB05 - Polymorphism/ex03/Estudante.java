public class Estudante {
    private String nome;
    private String endereco;

    public Estudante(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void print(boolean multilinha) {
        if (multilinha) {
            System.out.println("Estudante:\n" +
                            "Nome = " + nome + "\nEndereco = " + endereco);
        } else System.out.println("Estudante; Nome = "+ nome +"; Endereco = "+ endereco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}

