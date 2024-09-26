public class Venda{
    Comprador carlos;
    Produto arroz;
    Vendedor valdir;

    public Venda (Comprador carlos, Produto arroz, Vendedor valdir){
        this.carlos = carlos;
        this.arroz = arroz;
        this.valdir = valdir;
    }

    public void VendaConcretizada(){
        if (vendido == true && compra == true) System.out.println("Venda concretizada");
        else System.out.println("Venda nao ocorreu ainda");
    }

    public void CancelaVenda(){
        if(vendido != true || compra != true){
            System.out.println("Compra cancelada");
        }
    }
}