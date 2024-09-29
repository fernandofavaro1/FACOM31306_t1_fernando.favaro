public class Time{
    private String nomeTime;
    private Jogador j1;
    private Jogador j2;
    private Jogador s1;

    public Time(String nomeTime, Jogador j1, Jogador j2, Jogador s1){
        this.nomeTime = nomeTime;
        this.j1 = j1;
        this.j2 = j2;
        this.s1;
    }

    public Time(String nomeTime, Jogador j1, Jogador j2){
        this.nomeTime = nomeTime;
        this.j1 = j1;
        this.j2 = j2;
    }

    public Jogador getS1() {
        return s1;
    }

    public void setS1(Jogador s1) {
        this.s1 = s1;
    }

    public Jogador getJ2() {
        return j2;
    }

    public void setJ2(Jogador j2) {
        this.j2 = j2;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nome) {
        this.nomeTime = nomeTime;
    }

    public Jogador getJ1() {
        return j1;
    }

    public void setJ1(Jogador j1) {
        this.j1 = j1;
    }

    public double IdadeMedia(){
        double media;
        if (s1 == null){
            media = (j1.idade + j2.idade)/2;
            return media;
        } else{
            media = (j1.idade + j2.idade + s1.idade)/3;
            return media;
        }
    }

    public String toString(){
        System.out.println("Titulares: "+ j1.toString()+ j2.toString());
        if (s1 != null) System.out.println("Reserva: "+ s1.toString());
    }
}