package questao02;
import java.util.Date;

public class Questao02exec {
	public static void main(String args[]) {
		Date data = new Date();
		
		Questao02 quest02 = new Questao02();
		System.out.println(quest02.ultimoDiaMes(data));
	}
}
