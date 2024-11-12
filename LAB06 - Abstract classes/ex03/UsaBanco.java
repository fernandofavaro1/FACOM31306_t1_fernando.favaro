package ex03;

abstract class ContaCorrente {
    protected float saldo;
    protected int estado; // 1 = ativa, 2 = inativa
    protected int numConta;
    protected int senha;

    public ContaCorrente(float val, int num, int pwd) {
        numConta = num;
        senha = pwd;
        saldo = val;
        estado = 1;
    }

    public abstract boolean debitaValor(float val, int pwd);

    public void creditaValor(float val) {
        saldo += val;
    }

    public float getSaldo() {
        return saldo;
    }
}

class ContaEspecial extends ContaCorrente {
    private float limite;

    public ContaEspecial(float val, int num, int pwd, float limite) {
        super(val, num, pwd);
        this.limite = limite;
    }

    @Override
    public boolean debitaValor(float val, int pwd) {
        if (pwd != senha || val <= 0 || (saldo + limite) < val) {
            return false;
        }
        saldo -= val;
        return true;
    }
}

class ContaComum extends ContaCorrente {
    public ContaComum(float val, int num, int pwd) {
        super(val, num, pwd);
    }

    @Override
    public boolean debitaValor(float val, int pwd) {
        if (pwd != senha || val <= 0 || saldo < val) {
            return false;
        }
        saldo -= val;
        if (saldo == 0) {
            estado = 2; // Conta inativa
        }
        return true;
    }
}

public class UsaBanco {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaComum(1000, 123, 1111);
        ContaCorrente cc2 = new ContaEspecial(500, 456, 2222, 1000);

        cc1.debitaValor(500, 1111);
        cc2.debitaValor(1200, 2222);

        System.out.println("Saldo Conta Comum: " + cc1.getSaldo());
        System.out.println("Saldo Conta Especial: " + cc2.getSaldo());
    }
}
