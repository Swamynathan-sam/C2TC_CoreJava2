package date_API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo1 {

	public static void main(String[] args) {
		LocalDate d=LocalDate.now();//Gives current date
		System.out.println("Current date is "+d);
		LocalDate p=LocalDate.of(1997, 05, 06); //user given date
		System.out.println(p);
		LocalDateTime r=LocalDateTime.now();//Gives current date and time
		System.out.println("Current date and time is "+r);
		LocalTime q=LocalTime.now();
		System.out.println(q);
	}

}
