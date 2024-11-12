public class Universidade {
    private String nomefacul;
    private String fundacao;
    private Estudante[] estudante;

    public Universidade(String nomefacul, String fundacao, Estudante[] estudante) {
        this.nomefacul = nomefacul;
        this.fundacao = fundacao;
        this.estudante = new Estudante[100];

        for (int i = 0; i < estudante.length && i < this.estudante.length; i++){
            this.estudante[i] = estudante[i];
        }
    }

    public String getNomefacul() {
        return nomefacul;
    }

    public void setNomefacul(String nomefacul) {
        this.nomefacul = nomefacul;
    }

    public String getFundacao() {
        return fundacao;
    }

    public void setFundacao(String fundacao) {
        this.fundacao = fundacao;
    }

    public Estudante[] getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante[] estudante) {
        this.estudante = estudante;
    }

    public void print(boolean multilinha){
        if(multilinha) {
            System.out.println("Nome da Universidade = " + nomefacul+"\nData de fundacao = "+fundacao);
            int i = 0;
            while (i < estudante.length && estudante[i] != null) {
                estudante[i].print(true);
                i++;
            }
        } else {
            System.out.println("Nome da Universidade = " + nomefacul+"; Data de fundacao = "+fundacao);
            int i = 0;
            while (i < estudante.length && estudante[i] != null) {
                estudante[i].print(false);
                i++;
            }
        }

    }
}
