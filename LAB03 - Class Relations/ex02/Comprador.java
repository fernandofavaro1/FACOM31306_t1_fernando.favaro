public class Comprador{
    float verba;
    boolean interesse;

    public Comprador(float verba, boolean interesse) {
        this.verba = verba;
        this.interesse = interesse;
    }
    public void compra (){
        if (interesse == true && verba >= 7) {
            System.out.println("Produto comprado!");
        }else System.out.println("O comprador nao tem interesse no produto, compra cancelada");
    }

    public void interessado(){
        if (interesse == true) System.out.println("O cliente ja esta interessado no produto");
        else {
            System.out.println("O cliente ficou interessado no produto");
            interesse = true;
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