package ver1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;

public class Storage {
protected static ArrayList<Patient>AccountList = new ArrayList<Patient>();
protected static ArrayList<Appointment>AppointmentDates = new ArrayList<Appointment>();
	public Storage(){
		
	}
	
	public void addPatient(Patient p) {
		while(doesPatientExist(p.getPatientID()) == true) {
			p.generatePatientID();
		}
		AccountList.add(p);
	}
	
	public boolean addAppointment(Appointment a) {
		if(doesAppointmentExist(a) == false) {
			AppointmentDates.add(a);
			return true;
		}
		return false;
	}
	
	public void removePatient(Patient p) {
		AccountList.remove(p);
	}
	public String returnNumList() {
		String s  ="There are " + AccountList.size() + " patients in our system";
		return s;
	}
	public String printList() {
		String s = "";
		for(int i =0;i<AccountList.size();i++) {
			s += AccountList.get(i).toString() + "\n";
		}
		return s;
	}
	
	public void resetSystem() {
		AccountList.clear();
	}

	public String checkPatientStatus(int patientId) {
		String s = "";
		for(int i =0;i<AccountList.size();i++) {
			if (patientId == AccountList.get(i).getPatientID()) {
				s +="Patient " + AccountList.get(i).getPatientID() + " " + AccountList.get(i).getStatus();
			}
		}
		return s;
	}
	
	public static Patient getPatient(int patientId) {
		int j = 0;
		for (int i=0;i<AccountList.size();i++) {
			if(AccountList.get(i).getPatientID()==patientId) {
				j+= i;
			}
		}
		return AccountList.get(j);
	}
	public static Patient getPatient2(String name) {
		int j = 0;
		for(int i =0;i<AccountList.size();i++) {
			if(AccountList.get(i).getName() == name) {
				j = i; 
			}
		}
		return AccountList.get(j);
		}
	
	public String nameSortPatientList(){
		Collections.sort(AccountList, new PatientNameComparator());
		return printList();
	}
	
	public String IDSortPatientList(){
		Collections.sort(AccountList, new PatientIDComparator());
		return printList();
	}
	
	public static void main(String[] args) {
		Storage s = new Storage();
		Patient p = new Patient("Mark", LocalDate.of(1998, 3, 12),"1500 N Patterson St");
		Patient p1 = new Patient("Ann", LocalDate.of(2001, 4, 19), "333 Bloom Ave.");
		s.addPatient(p);
		s.addPatient(p1);
		String y = s.printList();
		
		System.out.println(s.printList());
		System.out.println("ID Sort:\n" + s.IDSortPatientList());
		System.out.println("Name Sort:\n" + s.nameSortPatientList());
	}
	
	public boolean doesPatientExist(int patientId) {
		for(int i =0;i<AccountList.size();i++) {
			if(AccountList.get(i).getPatientID()==patientId) {
				return true;
			}
		}
		return false;
	}
	
	public boolean doesAppointmentExist(Appointment a) {
		for(int i = 0; i < AppointmentDates.size(); i++) {
			if(a.equals(AppointmentDates.get(i))){
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Patient> returnPatientStatuses(int i){
		ArrayList<Patient> Patients = new ArrayList<Patient>();
		for(int j=0;i<AccountList.size();j++) {
			if(AccountList.get(i).currentStatus == i) {
				Patients.add(AccountList.get(i));
			}
		}
		return Patients;
	}
	public String getAppointmentDates() {
		String g = AppointmentDates.toString();
		return g;
	}
	
	public void removeAppointmentDates(Appointment a) {
		for(int i =0;i<AppointmentDates.size();i++) {
			if(AppointmentDates.get(i) == a) {
				AppointmentDates.remove(i);	
			}
		}
	}
}
