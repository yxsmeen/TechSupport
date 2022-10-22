package ver1;
import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;  // Import the Collections class


public class QueueSystem {

	// Data fields
	private static ArrayList<Patient> patientsQueue = new ArrayList<Patient>();
	private static ArrayList<Patient> inProgress = new ArrayList<Patient>();
		
	public void addToQueue(Patient t) {
		patientsQueue.add(t);
	}
	
	public void removeFromQueue(Patient t) {
		patientsQueue.remove(t);
	}
	
	public void addToInProgress(Patient t) {
		inProgress.add(t);
	}
	
	public static ArrayList<Patient> getPatientsQueue(){
		return patientsQueue;
	}
	
	public ArrayList<Patient> getInProgress(){
		return inProgress;
	}
	
	public void removeInProgress(Patient p) {
		inProgress.remove(p);
		p.makeHistory();
	}
}
	