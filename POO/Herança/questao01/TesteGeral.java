package questao01;

public class TesteGeral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Cachorro dog = new Cachorro("Lulu",3,"Sim","Sim");
            Cavalo horse = new Cavalo("Spirit",4,"Sim","Sim");
            Preguica sloth = new Preguica("Lorena",9,"Sim","Sim");
            
            System.out.println("\nCachorro:"+"\nNome: "+dog.getNome()+"\nIdade: "+dog.getIdade()+" anos"+
            		"\nEmite som?: "+dog.getEmitirSom()+"\nEle corre?: "+dog.getCorrer());
            System.out.println("\n*****************");
            System.out.println("\nCavalo:"+"\nNome: "+horse.getNome()+"\nIdade: "+horse.getIdade()+" anos"+
            		"\nEmite som?: "+horse.getEmitirSom()+"\nEle corre?: "+horse.getCorrer());
            System.out.println("\n*****************");
            System.out.println("\nPreguiça:"+"\nNome: "+sloth.getNome()+"\nIdade: "+sloth.getIdade()+" anos"+
            		"\nEmite som?: "+sloth.getEmitirSom()+"\nEla sobre em árvores?: "+sloth.getSubirEmArvore());
	}

}
