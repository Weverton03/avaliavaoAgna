package questao02;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class Questao02 {
	public String ultimoDiaMes(Date data) {
		LocalDate local = LocalDate.now().withMonth(10).with(TemporalAdjusters.lastDayOfMonth());
		
		
		return local.format(DateTimeFormatter.ofPattern("dd/MMMM/yyyy"));
	}
}
