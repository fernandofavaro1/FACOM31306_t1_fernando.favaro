package modelos;

import classificacao.Classificavel;

public class Cliente implements Classificavel {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public int compararCom(Classificavel o) {
        Cliente compara = (Cliente) o;
        return this.nome.compareTo(compara.nome);
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome='" + nome + '\'' + '}';
    }
}
