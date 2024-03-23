/**
 * 
 */
package plymorphism;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class datetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LocalDateTime idt=LocalDateTime.now();
   LocalDate d =LocalDate.now();
		System.out.println(d.getYear());
		System.out.println(d.getMonth());
		System.out.println(d.getMonthValue());
		System.out.println(d.getDayOfWeek());
		System.out.println(d.getDayOfYear());
		
		
	}

}
