import java.io.Reader;
import java.util.Scanner;
import java.lang.Math;

public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);
    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);
        // ....
    }

    public static void main(String[] args) {
        //ex01();
        ex02();
        //ex03();
    }


}

public static void ex001() {
    System.out.printf ("Hello World --- Fernando Favaro Henriques Netto --- 123111bcc006");
}

public static void ex002() {

    public static int altera_preco(float[] preco, float porcentagem) {
        if (porcentagem > -100) {
            temp = 1 + porcentagem/100;
            preco[] = preco[] * temp;
            return 0;
        } else return -1;
    }

    public static void main(String agrs) {
        char nome [][] = new char[4][100];
        float preco[] = new float[4];
        int qtd_estoque[] = new int[4];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++){
            System.out.printf ("\nInforme o nome, preco e a quantidade em estoque do produto %d:\n", i +1);
            nome[i] = sc.nextChar();
            preco[i] = sc.nextFloat();
            qtd_estoque[] = sc.nextInt();
        }

        System.out.printf ("Aumentando o preco em 10% do produto 1 e 3");
        altera_preco(new float[]{preco[0]}, -110);
        altera_preco(new float[]{preco[2]}, 10);

        System.out.printf ("Reduzindo o preco do produto 2 em 5%");
        if (altera_preco(new float[]{preco[1], -5}) == -1) {
            System.out.printf ("\n\nErro, porcentagem invalida. Preco nao foi alterado");
        } else System.out.printf("\n\nPreco do produto 2 alterado com sucesso");

        System.out.printf("\nAlterando o preco do produto 3");
        if (altera_preco(new float[]{preco[2]}, -110) == -1) System.out.printf("\n\nErro: preco nao alterado. Porcentagem invalida\n");

        System.out.printf("\nProdutos cadastrados:\n");
        for (int i = 0; i < 4; i++){
            System.out.printf("\nProduto: %s\nPreco: %f\nEstoque: %d", nome[i], preco[i], qtd_estoque[i]);
        }
    }
}

public static void ex003(String args) {
    public static void ex1(){
        int i = 0;
        int v[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.printf ("\nEntre com o numero %d", i + 1);
        v[i] = sc.nextInt();
        i++;
        System.out.printf ("\nEntre com o numero %d", i + 1);
        v[i] = sc.nextInt();
        i++;
        System.out.printf ("\nEntre com o numero %d", i + 1);
        v[i] = sc.nextInt();
        i++;
        System.out.printf ("\nEntre com o numero %d", i + 1);
        v[i] = sc.nextInt();
        i++;
        System.out.printf ("\nEntre com o numero %d", i + 1);
        v[i] = sc.nextInt();
        i++;
        System.out.printf ("\nEntre com o numero %d", i + 1);
        v[i] = sc.nextInt();
        i++;
        System.out.printf ("\nOs valores lidos sao: %d, %d, %d, %d, %d, %d.",v[0], v[1], v[2], v[3], v[4], v[5]);
    }

    public static void ex2(){
        Scanner sc = new Scanner(System.in);
        int v[] = new int[5];
        for (int i = 0; i < 6; i++) {
            System.out.printf("\nEntre com o numero %d:", i + 1);
            v[i] = sc.nextInt();
        }
        System.out.printf("\nOs valores lidos sao: ");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d ", v[i]);
        }
    }

    public static void ex3() {
        Scanner sc = new Scanner(System.in);
        int v[] = new int[5];
        int j = 0;
        for (int i = 5; i >= 0; i--, j++){
            System.out.printf("\nEntre com o numero %d:", j + 1);
            v[i] = sc.nextInt();
        }
        System.out.printf("\nOs valores lidos ao contrario sao: ");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d ", v[i]);
        }
    }

    public static void ex4(){
        Scanner sc = new Scanner(System.in);
        int v[] = new int[5];
        for (int i = 0; i < 6; i++) {
            System.out.printf("\nEntre com o numero %d:", i + 1);
            v[i] = sc.nextInt();
            if (v[i] % 2 != 0) {
                System.out.printf ("\nValor invalido!\n");
                i--;
            }
        }
        System.out.printf("\nOs valores lidos sao: ");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d ", v[i]);
        }
    }

    public static void ex5() {
        Scanner sc = new Scanner(System.in);
        int v[] = new int[4];
        for (int i = 0; i < 5; i++) {
            System.out.printf("\nEntre com o numero %d:", i + 1);
            v[i] = sc.nextInt();
        }
        System.out.printf("\nOs valores lidos sao: ");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d ", v[i]);
        }
        int temp;
        for (int i = 0; i < 4; i ++){
            for (int j = 1; j < 4 - i; j++){
                if (v[j] > v[j +1]){
                    temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
        System.out.printf("\nO maior numero digitado foi: %d\n", v[4]);
        System.out.printf("\nO menor numero digitado foi: %d\n", v[0]);
        float media = 0;
        for (int i = 0; i < 5; i++)
            media = media + v[i];
        
        System.out.printf("\nA media dos numeros eh: %f", media/5);
    }

    public static void ex6() {
        Scanner sc = new Scanner(System.in);
        int v[] = new int[4];
        for (int i = 0; i < 5; i++) {
            System.out.printf("\nEntre com o numero %d:", i + 1);
            v[i] = sc.nextInt();
        }
        System.out.printf("\nOs valores lidos sao: ");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d ", v[i]);
        }

        float maior;
        float menor;
        int pmaior = 0;
        int pmenor = 0;
        maior = menor = v[0];
        for (int i = 0; i < 5; i++){
            if (v[i] > maior){
                maior =  v[i];
                pmaior = i;
            } 
            if (v[i] < menor) {
                menor = v[i];
                pmenor = i;
            }
        }
        
        System.out.printf("\nO maior valor eh: %f, e sua posicao eh: %d\n", maior, pmaior);

        System.out.printf("\nO menor valor eh: %f, e sua posicao eh: %d", menor, pmenor);

        float media = 0;
        for (int i = 0; i < 5; i++)
            media = media + v[i];
        
        System.out.printf("\nA media dos numeros eh: %f", media/5);
    }

    public static void ex7() {
        Scanner sc = new Scanner(System.in);
        int notas[] = new int[4];
        int maior = 0;

        for (int i = 0; i < 5; i++){
            System.out.printf("Digite a nota do aluno %d: ", i + 1);
            notas[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (maior < notas[i])
                maior = notas[i];
        }
        
        System.out.printf("\nAs notas normalizadas sao: ");
        float normalizada;

        for (int i = 0; i < 5; i++) {
            normalizada = (notas[i]/maior) * 100;
            System.out.printf("%f ", normalizada);
        }

    }

    public static void ex8(){
        float v[] = new float[4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            System.out.printf("\nDigite o valor %d: ",i + 1);
            v[i] = sc.nextInt();
        }

        float soma = 0;

        for (int i = 0; i < 5; i++){
            soma = soma + v[i];
        }

        float media = soma/5;

        float desvio_padrao;

        for (int i = 0; i < 5; i++){
            soma = 0;
            soma = soma + (v[i] - media) * (v[i] - media);
        }

        desvio_padrao = sqrt(soma/5-1);

        System.out.printf("A media eh %f e o desvio padrao eh %f", media, desvio_padrao);

    }
    public static void ex9() {
        int max = 100;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o numero de alunos desejado: ");
        n = sc.nextInt();
        while (n > 100) {
            System.out.printf("Erro, numero de alunos exece o maximo permitido.\n");
            System.out.printf("Digite novamente o numero de alunos desejado: \n");
            n = sc.nextInt();
        }

        int nota[] = new int[n-1];
        for (int i =  0; i < n; i++){
            System.out.printf("Digite a nota do aluno %d: ", i + 1);
            nota[i] = sc.nextInt();
        }

        System.out.printf("Relatorio de Notas");
        System.out.printf("-----------------------------");
        for (int i = 0; i < n; i++){
            System.out.printf("A nota do aluno %d eh: %d\n", i + 1, nota[i]);
        }

        float media = 0;

        for (int i = 0; i < n; i ++){
            media = media + nota[i];
        }

        System.out.printf("A media dos alunos eh: %d", media/n);
    }

    public static void ex10(){
        int va[] = new int[2];
        int vb[] = new int[2];
        int vc[] = new int[2];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            System.out.printf("Digite o valor %d de A: ", i + 1);
            va[i] = sc.nextInt();
        }

        System.out.printf("\n\n");

        for (int i = 0; i < 3; i++){
            System.out.printf("Digite o valor %d de B: ", i + 1);
            vb[i] = sc.nextInt();
        }

        System.out.printf("\n\n");

        for (int i = 0; i < 3; i++){
            vc[i] = va[i] - vb[i];
        }

        System.out.printf("O vetor C, definido como C = A - B eh: (%d, %d, %d)", vc[0], vc[1], vc[2]);
    }

    public static void ex11(){
        int v[] = new int[4];
        int v1[] = new int[4];
        int v2[] = new int[4];


        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i ++){
            System.out.printf("Digite o valor %d: ", i + 1);
            v[i] = sc.nextInt();
        }

        int j = 0;
        int k = 0;

        for (int i = 0; i < 5; i ++){
            if (v[i] % 2 == 0){
                v2[j] = v[i];
                j++;
            } else {
                v1[k] = v[i];
                k++;
            }
        }

        System.out.printf("IMPARES:");
        for (int i = 0; i < k; i ++)
            System.out.printf(" %d", v1[i]);

        System.out.printf("\nPARES:");
        for (int i = 0; i < j; i ++)
            System.out.printf(" %d", v2[i]);
    }

    public static void ex12(){
        int azuis;
        int verdes;
        int vermelhas;
        int amarelas;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a quantidade de bolinhas");
        System.out.printf("\nAzuis: ");
        azuis = sc.nextInt();
        System.out.printf("\nVerdes: ");
        verdes =  sc.nextInt();
        System.out.printf("\nVermelhas: ");
        vermelhas = sc.nextInt();
        System.out.printf("\nAmarelas: ");
        amarelas = sc.nextInt();

        int total = azuis + verdes + amarelas + vermelhas;

        float pa = azuis/total;
        float pv = verdes/total;
        float pA = amarelas/total;
        float pV = vermelhas/total;

        float maior;

        if (pv > pa){
            maior = pv;
            if (pA > pv){
                maior = pA;
                if (pV > pA){
                    maior = pV;
                }
            } else if (pV > pv){
                maior = pV;
            }
        }else{
            maior = pa;
            if(pA > pa){
                maior = pA;
                if (pV > pA){
                    maior = pV;
                }
            } else if (pV > pa){
                maior = pV;
            }  
        }

        System.out.printf("Porcentagens\n");
        System.out.printf("-------------------------\n");
        System.out.printf("\nAzul: %f", pa);
        if (pa == maior) System.out.printf(" <<<A maior>>>");
        System.out.printf("\nVerde: %f", pv);
        if (pv == maior) System.out.printf(" <<<A maior>>>");
        System.out.printf("Amarelo: %f", pA);
        if (pA == maior) System.out.printf(" <<<A maior>>>");
        System.out.printf("Vermelho: ", pV);
        if (pV == maior) System.out.printf(" <<<A maior>>>");
}

    public static void ex13(){
        int v[] = new int[4];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
        System.out.printf("Digite o numero %d: ", i + 1);
        v[i] = sc.nextInt();
        if (v[i] < 0) v[i] = 0;
        }

        System.out.printf("Zerando os numeros negativos, obtem-se:");
        for (int i = 0; i < 5; i++)
        System.out.printf(" %d", v[i]);
    }

    public static void ex14(){
        int max = 10000;

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.printf("Digite o numero de alunos: ");
        n = sc.nextInt();

        int matricula[] = new int[n];
        char classe[] = new char[n];
        int cra[] = new int [n];

        for (int i = 0; i < n; i ++){
            System.out.printf("\nDigite a matricula do aluno %d:", i + 1);
            matricula[i] = sc.nextInt();
            System.out.printf("\nDigite a classe social do aluno %d: ", i + 1);
            classe[i] = sc.nextChar();
            System.out.printf("\nDigite o cra do aluno %d: ", i + 1);
            cra[i] = sc.nextInt();
        }

        System.out.printf("=====Alunos Cadastrados=====");

        for (int i = 0; i < n; i++){
            System.out.printf("Matricula: %d Classe social: %d Cra: %d\n", matricula[i], classe[i], cra [i]);
        }
    }

    public static void ex15(){
        int v[] = new int[7];
        int repeticoes[] = new int[7];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 8; i++){
            System.out.printf("Digite o valor do numero %d: ", i + 1);
            v[i] = sc.nextInt();
        }

        for (int i = 0; i < 8; i ++){
            for (int j = 0; j < 8; j++){
                if (v[i] == v[j]) {
                    repeticoes[i]++;
                }
            }
        }

        System.out.printf("Os valores repetidos sao:");
        for (int i = 0; i < 8; i++){
            int exibido = 0;
            for (int j = 0; j < i; j++){
                if (v[i] == v[j]){
                    exibido = 1;
                    break;
                }
            }
            if (exibido == 0){
                if (repeticoes[i] > 1)
                    System.out.printf(" %d\n", v[i]);
            }
        }
    }
    public static void ex16(){
        int v[] = new int[7];
        int repeticoes[] = new int[7];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 8; i++){
            System.out.printf("Digite o valor do numero %d: ", i + 1);
            v[i] = sc.nextInt();
        }

        for (int i = 0; i < 8; i ++){
            for (int j = 0; j < 8; j++){
                if (v[i] == v[j]) {
                    repeticoes[i]++;
                }
            }
        }

        for (int i = 0; i < 8; i++){
            int exibido = 0;
            for (int j = 0; j < i; j++){
                if (v[i] == v[j]){
                    exibido = 1;
                    break;
                }
            }
            if (exibido == 0){
                if (repeticoes[i] > 1)
                    System.out.printf("%d aprece %d vezes\n", v[i], repeticoes [i]);
            }
        }
    }

}