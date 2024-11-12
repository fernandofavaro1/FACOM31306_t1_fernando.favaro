package classificacao;

public class Classificador {
    public void ordena(Classificavel[] a) {
        Classificavel elem, menor;
        int pos;
        for (int i = 0; i < a.length - 1; i++) {
            elem = a[i];
            menor = a[i];
            pos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compararCom(menor) < 0) {
                    menor = a[j];
                    pos = j;
                }
            }
            if (menor.compararCom(elem) < 0) {
                a[i] = a[pos];
                a[pos] = elem;
            }
        }
    }
}
