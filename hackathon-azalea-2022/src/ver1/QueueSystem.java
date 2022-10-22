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
	
	public void resetQueue() {
		patientsQueue.clear();
	}
	
	public void resetInProgress() {
		inProgress.clear();
	}
	
	public String getQueue() {
		String str = "";
		for(Patient p: patientsQueue) {
			str += p.toString() + "\n";
		}
		resetQueue();
		return str;
	}
	
	public ArrayList<Patient> getInProgress(){
		return inProgress;
	}
	
	public String getProgress() {
		String str = "";
		for(Patient p: inProgress) {
			str += p.toString() + "\n";
		}
		resetInProgress();
		return str;
	}
	public void removeInProgress(Patient p) {
		inProgress.remove(p);
		p.makeHistory();
	}
}
	