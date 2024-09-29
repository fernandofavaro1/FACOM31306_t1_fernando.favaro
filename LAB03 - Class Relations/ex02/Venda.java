public class Venda{
    Comprador comprador;
    Produto produto;
    Vendedor vendedor;

    public Venda (Comprador comprador, Produto produto, Vendedor vendedor){
        this.comprador = comprador;
        this.produto = produto;
        this.vendedor = vendedor;
    }

    public void VendaConcretizada(){
        System.out.println("Venda concretizada");
    }

    public void CancelaVenda(){
            System.out.println("Compra cancelada");
    }
}