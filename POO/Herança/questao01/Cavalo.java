package questao01;

public class Cavalo extends Animal {
	private String correr;
	
	public Cavalo(String nome, int idade, String emitirSom, String correrCavalo) {
		super(nome,idade,emitirSom);
		this.correr=correrCavalo;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

}
