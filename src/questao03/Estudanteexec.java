package questao03;
public class Estudanteexec {
	public static void main(String args[]) {
		Estudante estudante = new Estudante();
		estudante.matricula = 13452;
		estudante.nome = "Lucas";
		estudante.sexo = 'M';

		estudante.exibir();
		
		estudante.atribuirNota(10, 8);
		
		System.out.println(estudante.lerNota(8));
	}
}
