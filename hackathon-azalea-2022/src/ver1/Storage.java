package ver1;

import java.util.ArrayList;

public class Storage {
	ArrayList<Patient>AccountList = new ArrayList<Patient>();
	public Storage(Patient p){
		
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
					" finally their birthdate is " + AccountList.get(i).dob + "\n";
		}
		return s;
	}
	public void resetSystem() {
		AccountList.clear();
	}
	public String checkPatientStatus(Patient p) {
		String s = "";
		for(int i =0;i<AccountList.size();i++) {
			if (p.equals(AccountList.get(i))) {
				s += "Patient status is " + p;
				// insert their status here once method exists 
			}
		}
		return s;
	
	}
}
