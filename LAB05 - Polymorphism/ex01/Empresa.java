public class Empresa{
    public static void main (String args[]){
        Funcionario f[] = new Funcionario [4];
        f[0] = new Horista("Gabriel", "16/05/1995", 0, 12, 80);
        f[1] = new Operario("Joao", "05/05/1995", 0, 5000, 0.5);
        f[2] = new Vendedor("Joana", "13/12/1987", 2000, 5000, 0.1);
        f[3] = new Chefes("Gerson", "28/08/1988", 5000);

        FolhaPagamento fp = new FolhaPagamento();
        fp.retornaPagamento(f[0], f[1], f[2], f[3]);
    }
}
