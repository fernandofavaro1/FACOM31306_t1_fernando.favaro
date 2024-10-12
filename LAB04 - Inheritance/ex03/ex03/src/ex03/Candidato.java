package ex03;

public class Candidato{

	private String nome;
	private String dataNascimento;
	private char genero;
	private float totalBens;
	private String reeleicao;
	private int numPartido;
	
	public Candidato(String nome, String dataNascimento, char genero, float totalBens, String reeleicao, int numPartido) {
		this.setNome(nome);
		this.setDataNascimento(dataNascimento);
		this.setGenero(genero);
		this.setTotalBens(totalBens);
		this.setReeleicao(reeleicao);
		this.setNumPartido (numPartido);
	}
	

	@Override
	public String toString() {
		return "nome=" + nome + ", dataNascimento=" + dataNascimento + ", genero=" + genero + ", totalBens="
				+ totalBens + ", reeleicao=" + reeleicao + ", numPartido=" + numPartido;
	}


	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
    	if(genero == 'm' || genero == 'M') this.genero = 'M';
    	else if(genero == 'f' || genero == 'F') this.genero = 'F';
    	else this.genero = 'N';
    }

    public float getTotalBens() {
        return totalBens;
    }

    public void setTotalBens(float totalBens) {
    	if(totalBens < 0) this.totalBens = 0;
    	else this.totalBens = totalBens;
    }

    public String getReeleicao() {
        return reeleicao;
    }

    public void setReeleicao(String reeleicao) {
        this.reeleicao = reeleicao;
    }

    public int getNumPartido() {
        return numPartido;
    }

    public void setNumPartido(int numPartido) {
        this.numPartido = numPartido;
    }
}
