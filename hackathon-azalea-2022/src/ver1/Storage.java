package ver1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Storage {
protected static ArrayList<Patient>AccountList = new ArrayList<Patient>();
	public Storage(){
		
	}
	public void addPatient(Patient p) {
		AccountList.add(p);
	}
	public void removePatient(Patient p) {
		AccountList.remove(p);
	}
	public String returnNumList() {
		String s  ="There are " + AccountList.size() + " many patients in our system";
		return s;
	}
	public String printList() {
		String s = "";
		for(int i =0;i<AccountList.size();i++) {
			s += AccountList.get(i).toString() + "\n";
//			s+= "Patient name: " + AccountList.get(i).getName() + ", Age: " + AccountList.get(i).getAge() + 
//					", DOB: " + AccountList.get(i).getBday() + "\n";
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
				s += "Patient status is " + AccountList.get(i).currentStatus;
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
	
	public String doesPatientExist(int patientId) {
		String s = "";
		for(int i =0;i<AccountList.size();i++) {
			if(AccountList.get(i).getPatientID()==patientId) {
				s = "Patient exists in system don't create account";
			}
			else {
				s = "Patient doesn't exist in system, add them";
			}
		}
		return s;
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
}
