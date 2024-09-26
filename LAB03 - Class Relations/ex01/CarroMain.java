public class CarroMain{
    public static void main(String args[]){
        Carro mcqueen = new Carro();
        mcqueen.p1.pressao = 10;
        mcqueen.p2.pressao = 20;
        mcqueen.p3.pressao = 30;
        mcqueen.p4.pressao = 40;
        mcqueen.estepe.pressao = 50;

        mcqueen.ligar();
        mcqueen.ligar();
        mcqueen.p1.rodar();
        mcqueen.p1.estourar();
        mcqueen.desligar();
        mcqueen.desligar();
    }
}