public class Empresa {
    public static void main (String args[]){
        Funcionario f[] = new Funcionario [8];
        f[0] = new Horista("Jair", "21/10/1991", 0, 12, 60);
        f[1] = new Horista("Pablo", "30/7/1990", 0, 8, 120);
        f[2] = new Chefes("Caio", "13/12/1980", 6000);
        f[3] = new Chefes("Sofia", "12/12/1992", 6500);
        f[4] = new Operario("Leticia", "16/09/2002", 0, 3000, 0.5);
        f[5] = new Operario("Luana", "20/05/1998", 0, 1500, 1);
        f[6] = new Vendedor("Carla", "09/09/1999", 1500, 1500, 0.1);
        f[7] = new Vendedor("Juracir", "08/08/1988", 1500, 2000, 0.2);
    }
}
