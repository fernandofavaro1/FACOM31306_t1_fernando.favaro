// Arquivo: ExplicacaoExcecoes.java
/*
 * ExplicacaoExcecoes.java
 *
 * Este arquivo contém explicações sobre as diferenças entre os comandos `throw` e `throws` em Java,
 * além de uma visão geral sobre os tipos de exceções: Checked e Unchecked.
 */

public class ExplicacaoExcecoes {

    /*
     * Diferença entre `throw` e `throws`:
     *
     * 1. `throw`:
     *    - É uma palavra-chave usada para lançar explicitamente uma exceção em um ponto específico do código.
     *    - Apenas uma exceção pode ser lançada por vez.
     *    - Geralmente é seguido por uma nova instância de uma exceção.
     *    - O `throw` transfere o controle para o bloco `catch` mais próximo (caso exista).
     *    - Exemplo de uso:
     */
    public void exemploThrow(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número não pode ser negativo");
        }
        System.out.println("Número: " + numero);
    }

    /*
     * 2. `throws`:
     *    - É utilizado na declaração de um método para indicar que ele pode lançar uma ou mais exceções.
     *    - Ao contrário de `throw`, que lança uma exceção, `throws` apenas avisa que uma exceção pode ocorrer.
     *    - Ele delega o tratamento da exceção para o método que chamou o método atual.
     *    - Exemplo de uso:
     */
    public void exemploThrows(int numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException("Número não pode ser negativo");
        }
        System.out.println("Número: " + numero);
    }

    /*
     * Tipos de Exceções em Java:
     *
     * 1. Checked Exceptions:
     *    - São exceções verificadas em tempo de compilação.
     *    - O compilador exige que essas exceções sejam tratadas (usando `try-catch`) ou declaradas com `throws`.
     *    - Exemplos comuns: `IOException`, `SQLException`.
     *
     * 2. Unchecked Exceptions:
     *    - São exceções verificadas apenas em tempo de execução, sem obrigatoriedade de tratamento em tempo de compilação.
     *    - Podem ocorrer devido a erros de lógica, como divisão por zero ou acesso a um índice inválido de array.
     *    - Exemplo: `NullPointerException`, `ArithmeticException`.
     */

    public static void main(String[] args) {
        ExplicacaoExcecoes explicacao = new ExplicacaoExcecoes();

        // Exemplo com `throw`

    }