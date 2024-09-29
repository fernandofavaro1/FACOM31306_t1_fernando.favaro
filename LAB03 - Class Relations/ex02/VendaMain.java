public class VendaMain{
    public static void main (String arg[]){
        Comprador carlos = new Comprador(500, true);
        Produto arroz = new Produto(7, 200);
        Vendedor valdir = new Vendedor();
        Venda venda = new Venda(carlos, arroz, valdir);

        valdir.vende(7);
        carlos.interessado();
        carlos.compra();
        arroz.vendido();
        venda.VendaConcretizada();

        carlos.perda_de_interesse();
        valdir.vende(7);
        carlos.compra();

        carlos.interessado();
        carlos.compra();
        arroz.vendido();
        valdir.vende(7);
        venda.CancelaVenda();
    }
}