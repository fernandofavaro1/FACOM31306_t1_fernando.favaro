public class Produto{
    float preco;
    int quantidade;

    public Produto(float preco, int quantidade){
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public void vendido(){
        System.out.println("Produto foi vendido");
            quantidade--;
    }
}