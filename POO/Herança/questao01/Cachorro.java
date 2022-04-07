package questao01;

public class Cachorro extends Animal{
     private String correr;
     
     public Cachorro(String nome, int idade, String emitirSom, String correr) {
    	 super(nome,idade,emitirSom);
    	 this.correr=correr;
     }

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
     
     
}
