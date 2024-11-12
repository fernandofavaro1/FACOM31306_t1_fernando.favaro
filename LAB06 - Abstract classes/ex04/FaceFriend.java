package ex04;
import java.util.ArrayList;
import java.util.Scanner;

public class FaceFriend {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public static void main(String[] args) {
        FaceFriend app = new FaceFriend();
        app.menu();
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n1. Inserir um contato");
            System.out.println("2. Imprimir todos os contatos");
            System.out.println("3. Imprimir somente os familiares");
            System.out.println("4. Imprimir somente os amigos");
            System.out.println("5. Imprimir somente os colegas de trabalho");
            System.out.println("6. Imprimir melhores amigos e irmãos");
            System.out.println("7. Imprimir colegas específicos de trabalho");
            System.out.println("8. Imprimir dados de um contato por índice");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> inserirContato(scanner);
                case 2 -> imprimirContatos();
                case 3 -> imprimirFamilia();
                case 4 -> imprimirAmigos();
                case 5 -> imprimirTrabalho();
                case 6 -> imprimirMelhoresAmigos();
                case 7 -> imprimirColegasEspecificos();
                case 8 -> imprimirContatoPorIndice(scanner);
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private void inserirContato(Scanner scanner) {
        System.out.println("Informe o subtipo do contato (1: Família, 2: Amigo, 3: Trabalho): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Aniversário: ");
        String aniversario = scanner.nextLine();

        switch (tipo) {
            case 1 -> {
                System.out.print("Parentesco: ");
                String parentesco = scanner.nextLine();
                contatos.add(new Familia(nome, email, aniversario, parentesco));
            }
            case 2 -> {
                System.out.print("Grau de amizade (1 a 3): ");
                int grau = scanner.nextInt();
                contatos.add(new Amigos(nome, email, aniversario, grau));
            }
            case 3 -> {
                System.out.print("Tipo de colega de trabalho: ");
                String tipoTrabalho = scanner.nextLine();
                contatos.add(new Trabalho(nome, email, aniversario, tipoTrabalho));
            }
            default -> System.out.println("Subtipo inválido.");
        }
    }

    private void imprimirContatos() {
        contatos.forEach(Contato::imprimirContato);
    }

    private void imprimirFamilia() {
        contatos.stream()
                .filter(c -> c instanceof Familia)
                .forEach(Contato::imprimirContato);
    }

    private void imprimirAmigos() {
        contatos.stream()
                .filter(c -> c instanceof Amigos)
                .forEach(Contato::imprimirContato);
    }

    private void imprimirTrabalho() {
        contatos.stream()
                .filter(c -> c instanceof Trabalho)
                .forEach(Contato::imprimirContato);
    }

    private void imprimirMelhoresAmigos() {
        contatos.stream()
                .filter(c -> c instanceof Amigos && ((Amigos) c).getGrau() == 1)
                .forEach(Contato::imprimirContato);
        contatos.stream()
                .filter(c -> c instanceof Familia && ((Familia) c).getParentesco().equals("irmão"))
                .forEach(Contato::imprimirContato);
    }

    private void imprimirColegasEspecificos() {
        contatos.stream()
                .filter(c -> c instanceof Trabalho && ((Trabalho) c).getTipo().equals("colega"))
                .forEach(Contato::imprimirContato);
    }

    private void imprimirContatoPorIndice(Scanner scanner) {
        System.out.print("Informe o índice do contato: ");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < contatos.size()) {
            Contato contato = contatos.get(indice);
            contato.imprimirContato();
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
