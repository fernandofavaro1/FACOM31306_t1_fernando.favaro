public class Jogo {
    private Mao jogada1;
    private Mao jogada2;
    public Jogo(Mao jogada1, Mao jogada2) {
        this.jogada1 = jogada1;
        this.jogada2 = jogada2;
    }
    public void jogar(Mao jogada, Mao jogada2) {
        if (jogada1 == null || jogada2 == null) {
            System.out.println("Erro");
        }else if (jogada1.getSinal() == jogada2.getSinal()) {
            System.out.println("Empate");
        } else if (jogada1.getSinal() == 1 && jogada2.getSinal() == 2 || jogada1.getSinal() == 2 && jogada2.getSinal() == 1) {
            System.out.println("Papel come Pedra!");
        } else if (jogada1.getSinal() == 2 && jogada2.getSinal() == 3 || jogada1.getSinal() == 3 && jogada2.getSinal() == 2) {
            System.out.println("Tesoura corta papel!");
        } else if (jogada1.getSinal() == 3 && jogada2.getSinal() == 1 || jogada1.getSinal() == 1 && jogada2.getSinal() == 3) {
            System.out.println("Pedra amassa tesoura!");
        }
    }

}

