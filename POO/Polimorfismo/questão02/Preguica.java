package questao02;

public class Preguica extends Animal{
	
	public Preguica() {
  	  super("Raça: Preguiça-bentinho");
    }
    
    @Override
    public void nome(String nome) {
  	  System.out.println("\nNome do preguiça: "+nome);
    }
    
    @Override
    public void idade(int idade) {
  	  System.out.println("\nIdade do preguiça: "+idade);
    }
    
    @Override
    public void emitirSom(String emitirSom) {
  	  System.out.println("\nO som emitido é: "+emitirSom);
    }
    
   public void subirArvores() {
	   System.out.println("\nA preguiça vive em árvores!!");
   }
    
}