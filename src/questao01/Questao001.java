package questao01;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Questao001 {
	public String data(Date data) {
	
		SimpleDateFormat formatardata = new SimpleDateFormat("MMMMM");
		String hoje = formatardata.format(data);
		
		return "Mês do ano: " + hoje;
	}
}
