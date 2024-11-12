package modelos;

import classificacao.Classificavel;

public class Produto implements Classificavel {
    private int codigo;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public int compararCom(Classificavel o) {
        Produto compara = (Produto) o;
        return Integer.compare(this.codigo, compara.codigo);
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + '}';
    }
}
