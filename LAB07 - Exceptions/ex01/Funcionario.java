package Ex01;

public class Funcionario {
    private String cpf;
    private String nome;
    private double salario;
    private static double tetoSalarial = 40000.0;

    public Funcionario(String cpf, String nome, double salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public static double getTetoSalarial() { return tetoSalarial; }
    public static void setTetoSalarial(double teto) { tetoSalarial = teto; }

    public void aumentarSalario(double percentual) {
        double novoSalario = this.salario * (1 + percentual / 100);

        if (novoSalario < 0) {
            throw new SalarioException("Valor inválido de salário");
        } else if (novoSalario > tetoSalarial) {
            throw new SalarioException("Valor ultrapassa o teto");
        }

        this.salario = novoSalario;
    }
}
