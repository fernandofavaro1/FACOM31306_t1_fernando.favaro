public class eleicao_municipal {
    public static void main(String[] args) {
        candidatos []v = new candidatos [2];
        candidatos candidatos1 = new candidatos(
            "Ana Lucia Alves da Silva",
            "01/06/1973",
            "Feminino",
            0,
            "Nao",
            44,
            "Vereador"
        );v[0] = candidatos1;

        candidatos candidatos2 = new candidatos(
            "Antonio Jose Purcino da Silva",
            "08/10/1996",
            "Masculino",
            0,
            "Nao",
            20,
            "Vereador"
        );v[1] = candidatos2;

        candidatos candidatos3 = new candidatos(
            "Lucimar barros",
            "02/05/1987",
            "Feminino",
            0,
            "Nao",
            44,
            "Vereador"
        );v[2] = candidatos3;

        System.out.printf("Informacoes dos candidatos de Sanatana do Ipanema:");
        for (int i = 0; i < 3; i ++){
            v[i].exibir_informacoes;
        }
    
        candidatos1.setbens(20000);
        candidatos2.setcargo("Prefeito");
        candidatos3.setn_partido(22);

        System.out.printf("Informacoes dos candidatos de Sanatana do Ipanema apos a alteracao de dados:");
        for (int i = 0; i < 3; i ++){
            v[i].exibir_informacoes;
        }
    }
}