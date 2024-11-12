public class Turma extends Disciplinas{
    int ano;
    int semestre;

    public Turma(String codigo, String nome, int cargaHoraria, int ano, int semestre){
        super(codigo, nome, cargaHoraria);
        this.ano = ano;
        this.semestre = semestre;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}