import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num;
        Scanner leia = new Scanner(System.in);
        
        ArrayList<String> estoque = new ArrayList();
        
        do {

        	System.out.println("\n1-Adicionar produtos no estoque");
        	System.out.println("\n2-Remover produtos do estoque");
        	System.out.println("\n3-Atualizar produtos do estoque");
        	System.out.println("\n4-Mostrar os produtos do estoque");
        	System.out.println("\n0-Encerrar o programa...");
        	System.out.println("\nDigite uma op��o: ");
        	num=leia.nextInt();
        	
        	switch(num) {
        	case 1: 
        		leia.nextLine();
        		System.out.println("\nDigite o produto para adicionar ao estoque: ");
        		String produto = leia.nextLine();
        		estoque.add(produto);
        		break;
        	case 2:
        		leia.nextLine();
        		System.out.println("\nDigite o produto para adicionar ao estoque: ");
        		String produto2 = leia.nextLine();
        		if(estoque.contains(produto2)) {
        			estoque.remove(produto2);
        		}else {
        			System.out.println("\nProduto n�o existente...");
        		}
        		System.out.println(estoque);
        		break;
        	case 3:
        		leia.nextLine();
        		leia.nextLine();
        		System.out.println("\nDigite o produto que deseja atualizar: ");
        		String verifica = leia.nextLine();
        		System.out.println("\nDigite o produto que entrar� no lugar de"+verifica+" : ");
        		String novo= leia.nextLine();
        		if(estoque.contains(verifica)) {
        			estoque.remove(verifica);
        			estoque.add(novo);
        		}else {
        			System.out.println("\nProduto n�o existe...");
        		}
        		System.out.println(estoque);
        		break;
        	case 4:
        		System.out.println("\nOs produtos do estoque s�o: ");
        		System.out.println(estoque);
        		break;
        	default:
        		if(num<0 || num>4) {
        			System.out.println("\nOp��o errada...Digite uma nova op��o");
        		}else {
        			System.out.println("\nFinalizou o programa...");
        		}
        	}
        }while(num!=0);
        		
        		
        	}
        }
        
	


