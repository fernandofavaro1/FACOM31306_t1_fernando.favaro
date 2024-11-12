package Ex02;

public class Operacao {

    public void iniciarOperacao(int numerador, int denominador) {
        try {
            calcular(numerador, denominador);
        } catch (DivisaoPorZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private void calcular(int numerador, int denominador) throws DivisaoPorZeroException {
        dividir(numerador, denominador);
    }

    private void dividir(int numerador, int denominador) throws DivisaoPorZeroException {
        if (denominador == 0) {
            throw new DivisaoPorZeroException("Divisão por zero não permitida");
        }
        System.out.println("Resultado da divisão: " + (numerador / (double) denominador));
    }
}
