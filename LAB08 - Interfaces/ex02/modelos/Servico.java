package modelos;

import classificacao.Classificavel;

public class Servico implements Classificavel {
    private double preco;

    public Servico(double preco) {
        this.preco = preco;
    }

    public int compararCom(Classificavel o) {
        Servico compara = (Servico) o;
        return Double.compare(this.preco, compara.preco);
    }

    @Override
    public String toString() {
        return "Servico{" + "preco=" + preco + '}';
    }
}
