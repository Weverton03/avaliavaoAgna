package questao03;

public class Estudante {
	int matricula;
    String nome;
	char sexo;
	
	double notas[] = new double[4];
	
	public void exibir() {
		System.out.println("======================Dados do Estudante======================");
		System.out.println("matricula:" + matricula);
		System.out.println("matricula:" + nome);
		System.out.println("matricula:" + sexo);
	}
	
	public void atribuirNota(double nota, int numProva) {
		notas[0] = nota;
		notas[1] = numProva;
	}
	
	public double lerNota(int numProva) {
		System.out.println("====================Mostrando A posição 1 do array====================");
		notas[1] = numProva;
		
		return notas[1];
	}
}
