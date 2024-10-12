public class CamaroteInferior extends Vip{
    private String localizacao;

    public CamaroteInferior(double valor, double adicional, String localizacao){
        super(valor, adicional);
        this.localizacao = localizacao;
    }

    public String acessaLocalizacao(String localizacao){
        return localizacao;
    }

    public void mostraLocalizacao(){
        System.out.println(""+localizacao);
    }
}