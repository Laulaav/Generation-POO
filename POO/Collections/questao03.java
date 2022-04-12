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
        	System.out.println("\nDigite uma opção: ");
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
        			System.out.println("\nProduto não existente...");
        		}
        		System.out.println(estoque);
        		break;
        	case 3:
        		leia.nextLine();
        		leia.nextLine();
        		System.out.println("\nDigite o produto que deseja atualizar: ");
        		String verifica = leia.nextLine();
        		System.out.println("\nDigite o produto que entrará no lugar de"+verifica+" : ");
        		String novo= leia.nextLine();
        		if(estoque.contains(verifica)) {
        			estoque.remove(verifica);
        			estoque.add(novo);
        		}else {
        			System.out.println("\nProduto não existe...");
        		}
        		System.out.println(estoque);
        		break;
        	case 4:
        		System.out.println("\nOs produtos do estoque são: ");
        		System.out.println(estoque);
        		break;
        	default:
        		if(num<0 || num>4) {
        			System.out.println("\nOpção errada...Digite uma nova opção");
        		}else {
        			System.out.println("\nFinalizou o programa...");
        		}
        	}
        }while(num!=0);
        		
        		
        	}
        }
        
	


