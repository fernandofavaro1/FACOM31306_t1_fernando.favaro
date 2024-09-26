public class VendaMain{
    public static void main (String arg[]){
        Comprador carlos = new Comprador(500, true);
        Produto arroz = new Produto(7, 200);
        Vendedor valdir = new Vendedor();
        Venda venda = new Venda(carlos, arroz, valdir);

        venda.VendaConcretizada;
        venda.CancelaVenda;
        
    }
}