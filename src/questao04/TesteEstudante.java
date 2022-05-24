package questao04;
public class TesteEstudante {
	public static void main(String args[]) {
		Estudante02 e = new Estudante02();
		e.matricula = 2004001;
		e.nome = "Maria Silvia";
		e.sexo = 'F';
		
		e.atribuirNota1(7.0);
		e.atribuirNota2(8.2);
		e.atribuirNota3(6.0);
		e.atribuirNota4(5.5);
		
		e.exibir();
		
		e.lerNota();
		
	}
}
