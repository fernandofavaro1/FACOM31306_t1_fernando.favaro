package ex03;

public class main {

	public static void main(String[] args) {
		Candidato[] candidatos = new Candidato[2];
		candidatos[0] = new Prefeito ("Joao", "29/04/1999", 'm', 1000000.0f, "sim", 40, "Edudaro Vice");
		candidatos[1] = new Vereador ("Pedro", "03/12/1950", 'm', 20000000.0f, "não", 23, "123", "Santa Mônica");
		
		for(int i = 0; i < 2 ; i ++) {
			System.out.printf(candidatos[i].toString() + "\n");
		}
	}

}
