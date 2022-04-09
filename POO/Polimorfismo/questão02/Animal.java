package questao02;

public abstract class Animal {
     private String raca;
     
     public Animal(String raca) {
    	 this.raca=raca;
     }
     
     abstract public void nome(String nome);
     abstract public void emitirSom(String emitirSom);
     abstract public void idade(int idade);

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
     
     
}
