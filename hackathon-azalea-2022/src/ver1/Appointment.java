package ver1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {

	LocalDate date;
	LocalTime time;
	Patient p;
	
	public Appointment(LocalDate date, LocalTime time) {
		this.date = date;
		this.time = time;
	}
	
}
