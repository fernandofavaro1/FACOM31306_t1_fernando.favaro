public class Time{
    private String nomeTime;
    private Jogador[] j;

    public Time(String nomeTime, Jogador j1, Jogador j2, Jogador s1){
        this.nomeTime = nomeTime;
        this.j = new Jogador[3];
        this.j[0] = j1;
        this.j[1] = j2;
        this.j[2] = s1;
    }

    public Time(String nomeTime, Jogador j1, Jogador j2){
        this.nomeTime = nomeTime;
        this.j = new Jogador[2];
        this.j[0] = j1;
        this.j[1] = j2;
    }

    public void setJogador(int i, Jogador j){
        this.j[i] = j;
    }

    public String getJogador(int i){
        return "Nome: "+j[i].getNome()+", Idade: "+j[i].getIdade()+", Altura: "+j[i].getAltura()+", Peso: "+j[i].getPeso();
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nome) {
        this.nomeTime = nomeTime;
    }

    public double IdadeMedia(){
        double media;
        if (j[2] == null){
            media = (double) (j[0].getIdade() + j[1].getIdade()) /2;
            return media;
        } else{
            media = (double) (j[0].getIdade() + j[1].getIdade() + j[2].getIdade())/3;
            return media;
        }
    }

    public String toString(){
        if (j[2] != null){
            return "Nome do time: " + nomeTime + "\nTitulares:\n" + j[0].toString() + "\n" + j[1].toString() + "\nReserva:\n" + j[2].toString();
        } else return "Nome do time: " + nomeTime + "\nTitulares:\n" + j[0].toString() + "\n" + j[1].toString();
    }
}