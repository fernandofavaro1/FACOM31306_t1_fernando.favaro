public class Produto{
    float preco;
    int quantidade;

    public Produto(float preco, int quantidade){
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public boolean vendido(){
        if (compra == true) {
            System.out.println("Produto foi vendido");
            quantidade--;
            return true;
        } else {
            System.out.println("Produto nao foi vendido");
            return false;
        }
    }
}