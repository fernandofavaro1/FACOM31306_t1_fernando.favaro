public class Vip extends Ingresso{
    protected double adicional;

    public Vip(double valor, double adicional){
        this.valor = valor;
        this.adicional = adicional;
    }

    public double valorVip(){
        return (adicional + valor);
    }
}