package ver1;

import java.util.ArrayList;

public class Storage {
protected static	ArrayList<Patient>AccountList = new ArrayList<Patient>();
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
			s+= "Patient name is " + AccountList.get(i).name + ", age is " + AccountList.get(i).age + 
					" finally their birthdate is " + AccountList.get(i).bday + "\n";
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
}
