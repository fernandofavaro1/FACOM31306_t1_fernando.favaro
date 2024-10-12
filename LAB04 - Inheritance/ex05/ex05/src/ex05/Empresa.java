package ex05;

public class Empresa {

	public static void main(String[] args) {
		Funcionario[] funcionarios = new Funcionario[8];
		Chefe[] chefe = new Chefe[2];
		Horista[] horista = new Horista[2];
		Operario[] operario = new Operario[2];
		Vendedor[] vendedor = new Vendedor[2];
		
		funcionarios[0] = new Chefe("João", "02/03/1999", 30000.f);
		funcionarios[1] = new Chefe("Lúcia", "21/02/1996", 60000.f);
		funcionarios[2] = new Horista("Marcelo", "03/04/2000", 20.f, 25.f);
		funcionarios[3] = new Horista("Eduardo", "22/06/2001", 40.f, 22.f);
		funcionarios[4] = new Operario("Matheus", "19/03/1994", 20.f, 310);
		funcionarios[5] = new Operario("Jonas", "14/10/2000", 21.f, 260);
		funcionarios[6] = new Vendedor("Alisson", "23/09/2001", 1500.f, 100.f, 30);
		funcionarios[7] = new Vendedor("Alisson", "23/09/2001", 2000.f, 80.f, 40);
		
		for(int i  = 0; i < 8; i++) {
			System.out.println(funcionarios[i].getSalario());
		}
	}

}
