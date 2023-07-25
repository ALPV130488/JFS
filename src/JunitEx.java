import java.time.LocalDate;
import java.time.Period;

import org.junit.Test;

public class JunitEx {
	@Test
	public void date() {
	
	LocalDate birthdate = LocalDate.of(1996, 01, 12);
	
	LocalDate currentdate = LocalDate.now();
	
	Period p = Period.between(birthdate, currentdate);
	
	System.out.printf("ur age is:-%d years,%d months,%d days",p.getYears(),
			
			p.getMonths(),p.getDays());
	}
	
	
}
