public class Comprador{
    float verba;
    boolean interesse;

    public Comprador(float verba, boolean interesse) {
        this.verba = verba;
        this.interesse = interesse;
    }
    public boolean compra (){
        if (verba >= preco && interesse == true) {
            System.out.println("Produto comprado!");
            verba -= preco;
            return true;
        }else System.out.println("Verba insuficiente, compra cancelada"); return false;
    }

    public void interessado(){
        if (interesse == true) System.out.println("O cliente ja esta interessado no produto");
        else {
            System.out.println("O cliente ficou interessado no produto");
        }
    }

    public void perda_de_interesse(){
        if (interesse != true) System.out.println("O cliente nao esta interessado no produto");
        else {
            System.out.println("O cliente nao esta mais interessado no produto");
            interesse = false;
        }
    }
}