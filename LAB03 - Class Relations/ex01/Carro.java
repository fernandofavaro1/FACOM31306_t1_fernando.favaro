public class Carro{
    Pneu p1;
    Pneu p2;
    Pneu p3;
    Pneu p4;
    Pneu estepe;
    boolean ligado = false;

    void ligar(){
        if (ligado == false)
            System.out.println("Carro ligado"); 
        else System.out.println("Carro ja esta ligado");
    }

    void desligar(){
        if (ligado == true)
            System.out.println("Carro desligado");
        else System.out.println("Carro ja esta desligado");
    }
}