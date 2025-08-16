import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op, op1, op2;
        do {
            System.out.println("1 - Jogar");
            System.out.println("2 - Sair");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    do{
                        System.out.println("Escolha um sinal para o Jogador 1:");
                        System.out.println("1 - PEDRA");
                        System.out.println("2 - PAPEL");
                        System.out.println("3 - TESOURA");
                        op1 = sc.nextInt();
                        if (op1 >= 1 && op1 <= 3) {
                                Mao m1 = new Mao(op1);
                                do{
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
                                        System.out.println("Valor Invalido!");
                                    }
                            } while (op2 < 1 || op2 > 3);
                        } else System.out.println("Valor Invalido!");
                    } while (op1 < 1 || op1 > 3);
                    break;

                    case 2:
                        break;

                default:
                    System.out.println("Valor Invalido!!");
            }
        } while(op != 2);
    }
}