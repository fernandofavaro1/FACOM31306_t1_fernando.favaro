package ex04;

public abstract class Contato {
    private String nome;
    private String email;
    private String aniversario;

    public Contato(String nome, String email, String aniversario) {
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    public abstract void imprimirContato();

    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getAniversario() {
        return aniversario;
    }
}

class Familia extends Contato {
    private String parentesco;

    public Familia(String nome, String email, String aniversario, String parentesco) {
        super(nome, email, aniversario);
        this.parentesco = parentesco;
    }

    @Override
    public void imprimirContato() {
        System.out.println("Família: " + getNome() + ", Parentesco: " + parentesco);
    }

    public String getParentesco() {
        return parentesco;
    }
}

class Amigos extends Contato {
    private int grau;

    public Amigos(String nome, String email, String aniversario, int grau) {
        super(nome, email, aniversario);
        this.grau = grau;
    }

    @Override
    public void imprimirContato() {
        System.out.println("Amigo: " + getNome() + ", Grau de amizade: " + grau);
    }

    public int getGrau() {
        return grau;
    }
}

class Trabalho extends Contato {
    private String tipo;

    public Trabalho(String nome, String email, String aniversario, String tipo) {
        super(nome, email, aniversario);
        this.tipo = tipo;
    }

    @Override
    public void imprimirContato() {
        System.out.println("Colega de Trabalho: " + getNome() + ", Tipo: " + tipo);
    }

    public String getTipo() {
        return tipo;
    }
}
