public class CamaroteSuperior extends Vip{
    private double adicional2;

    public CamaroteSuperior(double valor, double adicional, double adicional2){
        super(valor, adicional);
        this.adicional2 = adicional2;
    }

    public double retornaIngresso(double adicional2){
        return (super.valorVip() + adicional2);
    }
}