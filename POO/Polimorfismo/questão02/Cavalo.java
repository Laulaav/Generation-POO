package questao02;

public class Cavalo extends Animal{
    public Cavalo() {
  	  super("Raça: Puro-sangue inglês");
    }
    
    @Override
    public void nome(String nome) {
  	  System.out.println("\nNome do cavalo: "+nome);
    }
    
    @Override
    public void idade(int idade) {
  	  System.out.println("\nIdade do cavalo: "+idade);
    }
    
    @Override
    public void emitirSom(String emitirSom) {
  	  System.out.println("\nO som emitido é: "+emitirSom);
    }
    
    
    public void correr(String correr) {
  	  System.out.println("\n"+correr);
    }
    
    
}