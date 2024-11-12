package Ex01;

public class MainEx01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("12345678900", "João", 35000.0);

        try {
            funcionario.aumentarSalario(20); // Exemplo que gera erro de teto ultrapassado
        } catch (SalarioException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Salário atual: R$" + funcionario.getSalario());
        }
    }
}
