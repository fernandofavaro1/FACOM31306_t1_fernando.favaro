public class Main2{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite um numero de times: ");
        n = sc.nextInt();
        Time v[] = new Time [n];
        for (int i = 0; i < n; i++){
            System.out.println("Digite o nome do time: ");
            String v[i].nomeTime = sc.nextLine();
            System.out.println("Digite o nome do Jogador 1: ");
            String v[i].j1.nome = sc.nextLine();
            System.out.println("Digite a altura do Jogador 1: ");
            double v[i].j1.altura = sc.nextDouble();
            System.out.println("Digite a idade do Jogador 1: ");
            int v[i].j1.idade = nextInt();
            System.out.println("Digite o peso do Jogdor 1: ");
            int v[i].j1.peso = nextInt();
            System.out.println("Digite o nome do Jogador 2: ");
            String v[i].j2.nome = sc.nextLine();
            System.out.println("Digite a altura do Jogador 2: ");
            double v[i].j2.altura = sc.nextDouble();
            System.out.println("Digite a idade do Jogador 2: ");
            int v[i].j2.idade = nextInt();
            System.out.println("Digite o peso do Jogdor 2: ");
            int v[i].j2.peso = nextInt();
            System.out.println("Digite o nome do Substituto: ");
            String v[i].s1.nome = sc.nextLine();
            System.out.println("Digite a altura do Substituto: ");
            double v[i].s1.altura = sc.nextDouble();
            System.out.println("Digite a idade do Susbstituto: ");
            int v[i].s1.idade = nextInt();
            System.out.println("Digite o peso do Substituto: ");
            int v[i].s1.peso = nextInt();
        }

        for(int i = 0; i < n; i++){
            System.out.println(""+ v[i].toString());
        }

        int maior;

        for (int i = 0; i < n-1; i++) {
            maior = i;
            if (v[i].IdadeMedia() < v[i + 1].IdadeMedia()) maior = i+1;
        }
        System.out.println("O time que possui a maior media de idade eh: ");
        System.out.println(""+ v[maior].toString());

        for (int i = 0; i < n; i++){
            v[i] = null;
        }
    }

}