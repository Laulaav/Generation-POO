package questao02;

public class Cachorro extends Animal{
      public Cachorro() {
    	  super("Raça: Rusky siberiano");
      }
      
      @Override
      public void nome(String nome) {
    	  System.out.println("\nNome do cachorro: "+nome);
      }
      
      @Override
      public void idade(int idade) {
    	  System.out.println("\nIdade do cachorro: "+idade);
      }
      
      @Override
      public void emitirSom(String emitirSom) {
    	  System.out.println("\nO som emitido é: "+emitirSom);
      }
      
      
      public void correr(String correr) {
    	  System.out.println("\n"+correr);
      }
      
      
}
