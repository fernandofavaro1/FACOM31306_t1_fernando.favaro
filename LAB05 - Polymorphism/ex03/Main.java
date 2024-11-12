import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos dessa faculdade:");
        int a = sc.nextInt();
        Estudante[] e = new Estudante[a];
        PosGrad[] pg = new PosGrad[a];
        sc.nextLine();
        System.out.println("Digite o nome da faculdade:");
        String nomefacul = sc.nextLine();
        System.out.println("Digite a data de fundacao:");
        String data = sc.nextLine();
        int g = 0, m = 0, d = 0, j =0;
        for (int i = 0; i < a; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            String nome = sc.nextLine();
            System.out.println("Digite o endereco do aluno " + (i + 1) + ":");
            String endereco = sc.nextLine();
            System.out.println("1- Graduacao\n2- Mestrado\n3- Doutorado");
            int k = sc.nextInt();
            if (k == 1) {
                e[i] = new Graduacao(nome, endereco);
                g++;
            } else if (k == 2) {
                e[i] = new Mestrado(nome, endereco);
                pg[j] = new Mestrado(nome, endereco);
                j++;
                m++;
            } else if (k == 3) {
                sc.nextLine();
                System.out.println("Digite e Tese de doutorado: ");
                String tese = sc.nextLine();
                System.out.println("Digite a linha de pesquisa: ");
                String linha = sc.nextLine();
                e[i] = new Doutorado(nome, endereco, tese, linha);
                pg[j] = new Doutorado(nome, endereco, tese, linha);
                j++;
                d++;
            }
            sc.nextLine();
        }

        System.out.println("A faculdade possui "+ g + " estudantes de graduacao, "+ m + " estudantes de mestrado e "+d+" de doutorado");

        Universidade u = new Universidade(nomefacul, data, e);

        u.print(true);
        u.print(false);

        int i = 0;

        System.out.println("Todos os estudantes de pos-graduacao:\n");
        while (pg[i] != null && i < a) {
            pg[i].print(true);
            pg[i].print(false);
            i++;
        }
        
    }
}
