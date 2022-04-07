package questao7;

public class Paciente {
	private String nomeDoPaciente;
	private int idade;
	private double peso;
	private double altura;
	
	public Paciente(String nome, int idade, double peso, double altura) {
		this.nomeDoPaciente= nome;
		this.idade=idade;
		this.peso=peso;
	    this.altura=altura;
	}
	
	public void imprimirInfo() {
		System.out.println("\nA paciente "+nomeDoPaciente+" tem "+idade+" anos, "+peso+" Kg e "+altura);
	}
	
	public void imc() {
		double IMC;
		
		IMC=peso/(altura * altura);
		System.out.println("\nSeu IMC é de "+IMC);
		
		if(IMC<18.5) {
			System.out.println("\nSeu peso está menor que o normal!!!");
		}else if(IMC>18.5 && IMC<24.9) {
			System.out.println("\nSeu peso está normal!!!");
		}else if(IMC>25 && IMC<29.9) {
			System.out.println("\nVocê está com sobrepeso!!!");
		}else if(IMC>30 && IMC<39.9) {
			System.out.println("\nVocê está com obesidade!!!");
		}else {
			System.out.println("\nVocê está com obesidade grave!!!");
		}
	}

	
	public String getNomeDoPaciente() {
		return nomeDoPaciente;
	}

	public void setNomeDoPaciente(String nomeDoPaciente) {
		this.nomeDoPaciente = nomeDoPaciente;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
