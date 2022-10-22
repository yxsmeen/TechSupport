package ver1;

import java.time.LocalDate;
import java.time.Period;

public class Patient {

	String name;
	LocalDate bday;
	LocalDate currentDate = LocalDate.now();
	int age;
	String address;
	String medicalHistory = "MEDICAL HISTORY:\n";
	String visitReasonHeader = "REASON FOR VISIT:\n-";
	String visitReason = "";
	public Patient(String name, LocalDate bday, String address) {
		this.name = name;
		this.bday = bday;
		this.address = address;
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
	
	public void setAddress(String addy) {
		address = addy;
	}

	public void addMedicalHistory(String more) {
		medicalHistory += "-" + more + "\n";
	}
	
	public String getMedicalHistory() {
		return medicalHistory;
	}
	
	public void addVisitReason(String reason) {
		visitReason = reason;
	}
	
	public String getFullReason() {
		String str = "";
//		visitReason += reason;
		return str = String.format(visitReasonHeader + visitReason);
	}
	
//	public String getReason(String reason) {
//		return reason;
//	}
	
	public String getVisitReason() {
		return visitReason;
	}
	
	public void emptyReason() {
		visitReason = "";
	}
	
	public void makeHistory() {
		addMedicalHistory(getVisitReason());
	}
	
	public String toString() {
		String str = "";
		str += String.format("Patient: " + getName() + ", DOB: " + getBday() +
				", Age: " + getAge() + " y/o");
		return str;
	}
}
