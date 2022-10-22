package ver1;

import java.time.LocalDate;
import java.time.Period;

public class Patient {

	String name;
	LocalDate bday;
	LocalDate currentDate = LocalDate.now();
	int age;
	public Patient(String name, LocalDate bday) {
		this.name = name;
		this.bday = bday;
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDate getBday() {
		return bday;
	}
	
	public int getAge() {
		return Period.between(bday, currentDate).getYears();
	}
	
	public String toString() {
		String str = "";
		str += String.format("Patient: " + getName() + " DOB: " + getBday() +
				", age: " + getAge());
		return str;
	}
}
