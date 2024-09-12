public class eleicao_municipal {
    public static void (String[] args) {
        candidatos candidatos1 = new candidatos(
            "Ana Lucia Alves da Silva",
            "01/06/1973",
            "Feminino",
            "0",
            "Nao",
            "44",
            "Vereador"
        );

        candidatos candidatos2 = new candidatos(
            "Antonio Jose Purcino da Silva",
            "08/10/1996",
            "Masculino",
            "0",
            "Nao",
            "20",
            "Vereador"
        );

        candidatos candidatos3 = new candandidatos;(
            "Lucimar barros",
            "02/05/1987",
            "Feminino",
            "0",
            "Nao",
            "44",
            "Vereador"
        );

        System.out.printf("Informacoes dos candidatos de Sanatana do Ipanema:");
        candidatos1.exibir_informacoes;
        candidatos2.exibir_informacoes;
        candidatos3.exibir_informacoes;
    

        candidatos1.setbens(20000.00);
        candidatos2.setcargo(Prefeito);
        candidatos3.setn_partido(22);

        System.out.printf("Informacoes dos candidatos de Sanatana do Ipanema apos a alteracao de dados:");
        candidatos1.exibir_informacoes;
        candidatos2.exibir_informacoes;
        candidatos3.exibir_informacoes;
    }
}