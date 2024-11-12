public class Doutorado extends PosGrad{
    private String tese;
    private String linhaDePesquisa;

    public Doutorado(String nome, String endereco, String tese, String linhaDePesquisa) {
        super(nome, endereco);
        this.tese = tese;
        this.linhaDePesquisa = linhaDePesquisa;
    }

    public String getTese() {
        return tese;
    }

    public void setTese(String tese) {
        this.tese = tese;
    }

    public String getLinhaDePesquisa() {
        return linhaDePesquisa;
    }

    public void setLinhaDePesquisa(String linhaDePesquisa) {
        this.linhaDePesquisa = linhaDePesquisa;
    }

    public void print(boolean multilinha){
        super.print(multilinha);
        if(multilinha) System.out.println("Tese = " + tese + "\nLinha de Pesquisa = " + linhaDePesquisa);
        else System.out.println("; Tese = "+tese+"; Linha de pesquisa = "+linhaDePesquisa);
    }
}
