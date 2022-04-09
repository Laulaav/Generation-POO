package questao02;

public class TesteGeral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Cachorro dog= new Cachorro();
         Cavalo horse= new Cavalo();
         Preguica slow= new Preguica();
         System.out.println("\nCachorro");
         dog.correr("Eles correm? Eles correm muito para brincar");
         dog.emitirSom("Auau");
         dog.nome("Julia");
         dog.idade(4);
         System.out.println("\n>>>>>>>>>>>>>>>>>");
         System.out.println("\nCavalo");
         horse.correr("Eles correm? Eles correm muito");
         horse.emitirSom("iiirrriií");
         horse.nome("Spirit");
         horse.idade(10);
         System.out.println("\n>>>>>>>>>>>>>>>>>");
         System.out.println("\nPreguiça");
         slow.subirArvores();
         slow.emitirSom("iiiiiiiii");
         slow.nome("João");
         slow.idade(20);
	}

}
