public class Vendedor{
    float comissao;
    
    public void vende(){
        if(vendido == true){
            comissao = preco * 0.1;
            System.out.println("O vendedor ganhou " + comissao + " reais de comissao");
        }
    }
}