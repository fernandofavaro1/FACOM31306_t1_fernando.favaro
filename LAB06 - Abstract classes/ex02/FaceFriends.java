package ex02;
import java.util.ArrayList;
import java.util.Scanner;

abstract class Contato {
    protected String apelido;
    protected String nome;
    protected String email;
    protected String aniversario;

    public Contato(String apelido, String nome, String email, String aniversario) {
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String imprimirBasico() {
        return "Apelido: " + apelido + "\nNome: " + nome + "\nEmail: " + email + "\nAniversário: " + aniversario;
    }

    public abstract String imprimirContato();
}

class Familia extends Contato {
    private String parentesco;

    public Familia(String apelido, String nome, String email, String aniversario, String parentesco) {
        super(apelido, nome, email, aniversario);
        this.parentesco = parentesco;
    }

    @Override
    public String imprimirContato() {
        return imprimirBasico() + "\nParentesco: " + parentesco;
    }
}

class Amigos extends Contato {
    private int grau;

    public Amigos(String apelido, String nome, String email, String aniversario, int grau) {
        super(apelido, nome, email, aniversario);
        this.grau = grau;
    }

    @Override
    public String imprimirContato() {
        return imprimirBasico() + "\nGrau de amizade: " + grau;
    }
}

class Trabalho extends Contato {
    private String tipo;

    public Trabalho(String apelido, String nome, String email, String aniversario, String tipo) {
        super(apelido, nome, email, aniversario);
        this.tipo = tipo;
    }

    @Override
    public String imprimirContato() {
        return imprimirBasico() + "\nTipo de trabalho: " + tipo;
    }
}

public class FaceFriends {
    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Inserir contato");
            System.out.println("2. Sair");
            int opcao = scanner.nextInt();

            if (opcao == 2) break;

            System.out.println("Escolha o tipo de contato (1-Familia, 2-Amigos, 3-Trabalho):");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Apelido: ");
            String apelido = scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Aniversário: ");
            String aniversario = scanner.nextLine();

            switch (tipo) {
                case 1:
                    System.out.print("Parentesco: ");
                    String parentesco = scanner.nextLine();
                    contatos.add(new Familia(apelido, nome, email, aniversario, parentesco));
                    break;
                case 2:
                    System.out.print("Grau de amizade (1-Melhor amigo, 2-Amigo, 3-Conhecido): ");
                    int grau = scanner.nextInt();
                    contatos.add(new Amigos(apelido, nome, email, aniversario, grau));
                    break;
                case 3:
                    System.out.print("Tipo de trabalho: ");
                    String trabalho = scanner.nextLine();
                    contatos.add(new Trabalho(apelido, nome, email, aniversario, trabalho));
                    break;
            }
        }

        System.out.println("Contatos cadastrados:");
        for (Contato c : contatos) {
            System.out.println(c.imprimirContato());
        }

        scanner.close();
    }
}
