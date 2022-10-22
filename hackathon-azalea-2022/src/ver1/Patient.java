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
	String[] status = {"Waiting", "Ready", "In-Progress", "On Hold", "Checked Out", "Not Active"};
	int currentStatus = 0;
	private static int patientId = 0;
	
	public Patient(String name, LocalDate bday, String address) {
		this.name = name;
		this.bday = bday;
		this.address = address;
		this.status = status;
		patientId++;
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
	
	public int getPatientID() {
		return patientId;
	}
	
	public void setAddress(String addy) {
		address = addy;
	}
	
	public void setStatus(int i) {
		currentStatus = i;
	}
	
	public void setStatus(String stat) {
		int index = 5;
		for(int i = 0; i < status.length; i++) {
			if(status[i].equals(stat)) {
				index = i;
			}
		}
		currentStatus = index;
	}

	public String getStatus() {
		return String.format("Status: " + status[currentStatus]);
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
		return str = String.format(visitReasonHeader + visitReason);
	}
	
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
		str += String.format("Patient ID: #" + getPatientID() + " Name: " + getName() + ", DOB: " + getBday() +
				", Age: " + getAge() + " y/o");
		return str;
	}
}
