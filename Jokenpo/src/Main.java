import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0, op1 = 0, op2 = 0;

        do {
            try {
                System.out.println("1 - Jogar");
                System.out.println("2 - Sair");
                op = sc.nextInt();

                switch (op) {
                    case 1:
                        do {
                            try {
                                System.out.println("Escolha um sinal para o Jogador 1:");
                                System.out.println("1 - PEDRA");
                                System.out.println("2 - PAPEL");
                                System.out.println("3 - TESOURA");
                                op1 = sc.nextInt();

                                if (op1 >= 1 && op1 <= 3) {
                                    Mao m1 = new Mao(op1);

                                    do {
                                        try {
                                            System.out.println("Escolha um sinal para o Jogador 2:");
                                            System.out.println("1 - PEDRA");
                                            System.out.println("2 - PAPEL");
                                            System.out.println("3 - TESOURA");
                                            op2 = sc.nextInt();

                                            if (op2 >= 1 && op2 <= 3) {
                                                Mao m2 = new Mao(op2);
                                                Jogo jogo = new Jogo(m1, m2);
                                                jogo.jogar(m1, m2);
                                            } else {
                                                System.out.println("Valor inválido!");
                                            }
                                        } catch (InputMismatchException e) {
                                            System.out.println("Digite um valor inteiro!");
                                            sc.nextLine();
                                            op2 = 0;
                                        }
                                    } while (op2 < 1 || op2 > 3);
                                } else {
                                    System.out.println("Valor inválido!");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Digite um valor inteiro!");
                                sc.nextLine();
                                op1 = 0;
                            }
                        } while (op1 < 1 || op1 > 3);
                        break;

                    case 2:
                        System.out.println("Saindo do jogo...");
                        break;

                    default:
                        System.out.println("Valor inválido!!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite um valor inteiro!");
                sc.nextLine();
                op = 0;
            }
        } while (op != 2);

        sc.close();
    }
}
