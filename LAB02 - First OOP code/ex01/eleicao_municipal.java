public class eleicao_municipal {
    public static void main(String[] args) {
        candidatos candidatos1 = new candidatos(
            "Ana Lucia Alves da Silva",
            "01/06/1973",
            "Feminino",
            0,
            "Nao",
            44,
            "Vereador"
        );

        candidatos candidatos2 = new candidatos(
            "Antonio Jose Purcino da Silva",
            "08/10/1996",
            "Masculino",
            0,
            "Nao",
            20,
            "Vereador"
        );

        candidatos candidatos3 = new candidatos(
            "Lucimar barros",
            "02/05/1987",
            "Feminino",
            0,
            "Nao",
            44,
            "Vereador"
        );

        System.out.printf("Informacoes dos candidatos de Sanatana do Ipanema:");
        candidatos1.exibir_informacoes;
        candidatos2.exibir_informacoes;
        candidatos3.exibir_informacoes;
    }
}