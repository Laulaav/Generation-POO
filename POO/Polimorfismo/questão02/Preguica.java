package questao02;

public class Preguica extends Animal{
	
	public Preguica() {
  	  super("Ra�a: Pregui�a-bentinho");
    }
    
    @Override
    public void nome(String nome) {
  	  System.out.println("\nNome do pregui�a: "+nome);
    }
    
    @Override
    public void idade(int idade) {
  	  System.out.println("\nIdade do pregui�a: "+idade);
    }
    
    @Override
    public void emitirSom(String emitirSom) {
  	  System.out.println("\nO som emitido �: "+emitirSom);
    }
    
   public void subirArvores() {
	   System.out.println("\nA pregui�a vive em �rvores!!");
   }
    
}