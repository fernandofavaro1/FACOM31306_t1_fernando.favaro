import java.util.Scanner;

public class Main2{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero de times: ");
        int n = sc.nextInt();
        sc.nextLine();
        Time []v = new Time [n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite o nome do Time "+(i+1)+":");
            String nometime = sc.nextLine();
            Jogador []j = new Jogador[3];
            for (int k = 0; k < 3; k++){
                System.out.println("\nDigite o nome do Jogador "+(k +1)+":");
                String nome1 = sc.nextLine();
                System.out.println("\nDigite a idade do Jogador "+(k +1)+":");
                int idade1 = sc.nextInt();
                System.out.println("\nDigite a altura do Jogador "+(k +1)+":");
                double altura1 = sc.nextDouble();
                System.out.println("\nDigite o peso do Jogador "+(k +1)+":");
                int peso1 = sc.nextInt();
                sc.nextLine();
                j[k] = new Jogador(nome1, idade1, altura1, peso1);
            }
            v[i] = new Time(nometime, j[0], j[1], j[2]);
        }

        for(int i = 0; i < n; i++){
            System.out.println(v[i].toString());
        }

        int maior = 0;

        for (int i = 0; i < n-1; i++) {
            maior = i;
            if (v[i].IdadeMedia() < v[i + 1].IdadeMedia()) maior = i+1;
        }
        System.out.println("O time que possui a maior media de idade eh: ");
        System.out.println(v[maior].toString());

        sc.close();

        for (int i = 0; i < n; i++){
            v[i] = null;
        }
    }

}