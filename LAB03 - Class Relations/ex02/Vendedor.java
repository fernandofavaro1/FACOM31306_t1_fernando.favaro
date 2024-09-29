public class Vendedor{
    double comissao;
    
    public void vende(float preco){
        comissao = preco * 0.1;
        System.out.println("O vendedor ganhou " + comissao + " reais de comissao");
    }
}