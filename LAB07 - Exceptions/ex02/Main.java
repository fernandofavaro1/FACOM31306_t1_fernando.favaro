package Ex02;

public class Main {
    public static void main(String[] args) {
        Operacao operacao = new Operacao();

        // Exemplo sem erro
        operacao.iniciarOperacao(10, 2);

        // Exemplo que gera DivisaoPorZeroException
        operacao.iniciarOperacao(10, 0);
    }
}
