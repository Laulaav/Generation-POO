package questao7;
/*Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
public class TestarPaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente usuarioPaciente = new Paciente("Laura",19,49.3,1.57);
		
		usuarioPaciente.imprimirInfo();
		usuarioPaciente.imc();
	}

}
