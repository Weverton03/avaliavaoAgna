package questao04;

public class Estudante02 {
	public int matricula;
	public String nome;
	public char sexo;
	
	double notas[] = new double[4];
	
	public void atribuirNota1(double nota1) {
		notas[0] = nota1;
	}
	
	public void atribuirNota2(double nota2) {
		notas[1] = nota2;
	}
	
	public void atribuirNota3(double nota3) {
		notas[2] = nota3;
	}
	public void atribuirNota4(double nota4) {
		notas[3] = nota4;
	}
	
	public void exibir() {
		System.out.println("===========Dados do estudante===========");
		System.out.println("Matrivula:" + matricula);
		System.out.println("Nome:" + nome);
		System.out.println("Sexo:" + sexo);
	}
	
	public void lerNota() {
		
		System.out.println("===========Notas so estudamte===========");
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
	}
}
