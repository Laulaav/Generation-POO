package questao01;

public class Preguica extends Animal {
	private String subirEmArvore;
	
	public Preguica(String nome, int idade, String emitirSom, String subirEmArvore) {
		super(nome,idade,emitirSom);
		this.subirEmArvore=subirEmArvore;
	}

	public String getSubirEmArvore() {
		return subirEmArvore;
	}

	public void setSubirEmArvore(String subirEmArvore) {
		this.subirEmArvore = subirEmArvore;
	}
	

}
