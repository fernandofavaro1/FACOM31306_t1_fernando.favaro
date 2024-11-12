import classificacao.Classificador;
import modelos.Produto;
import modelos.Cliente;
import modelos.Servico;

public class Main {
    public static void main(String[] args) {
        Produto[] produtos = { new Produto(3), new Produto(1), new Produto(2) };
        Cliente[] clientes = { new Cliente("Maria"), new Cliente("Ana"), new Cliente("Joao") };
        Servico[] servicos = { new Servico(300.0), new Servico(100.0), new Servico(200.0) };

        Classificador classificador = new Classificador();

        classificador.ordena(produtos);
        classificador.ordena(clientes);
        classificador.ordena(servicos);

        System.out.println("Produtos ordenados:");
        for (Produto p : produtos) {
            System.out.println(p);
        }

        System.out.println("\nClientes ordenados:");
        for (Cliente c : clientes) {
            System.out.println(c);
        }

        System.out.println("\nServiços ordenados:");
        for (Servico s : servicos) {
            System.out.println(s);
        }
    }
}
