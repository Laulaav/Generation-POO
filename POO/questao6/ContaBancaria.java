package questao6;

import java.util.Scanner;

public class ContaBancaria {
     private String nome;
     private String agencia;
     private String cpf;
     
     public ContaBancaria(String nome, String agencia, String cpf) {
    	 this.nome=nome;
    	 this.agencia=agencia;
    	 this.cpf=cpf;
     }
     
     public void imprimirDados() {
    	 int op;
    	 System.out.println("\nOl�, "+nome+". Seus dados est�o certos? CPF: "+cpf+". Ag�ncia: "+agencia+"\n1-Sim"+"\n2-N�o");
    	 Scanner ler= new Scanner(System.in);
    	 op=ler.nextInt();
    	 
    	 switch(op) {
    	 case 1:
    		 System.out.println("\nSeu saldo � de 1000 reais");
    		 break;
    	 case 2:
    		 System.out.println("\nEntre em contato conosco!!!");
    		 break;
    	default:
    		System.out.println("\nVoc� inseriu uma op��o inv�lida. Tente novamente!!");
    		break;
    	 }
     }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
     
     
     
}
