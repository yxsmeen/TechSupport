package ver1;

import java.time.LocalDate;

public class MainApp {

	private static QueueSystem queued = new QueueSystem();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p = new Patient("Mike",LocalDate.now(),"1500 N Patterson St");
		Patient y = new Patient("donald",LocalDate.now(),"1500 N Patterson St");
		Storage s = new Storage();
		s.addPatient(p);
		s.addPatient(y);
		System.out.println(p.getPatientID());
		System.out.println(y.getPatientID());
	}
	
	private void newPatient(Patient p) {
		
	}

	private static void updateStatus(int id, int status) {
		Patient p = Storage.getPatient(id);
		p.setStatus(status);
		if (status == 0) {
			queued.addToQueue(p);
		}
		else if (status >=1 && status <=3) {
			queued.addToInProgress(p);
		}
		else {
			if (queued.getInProgress().contains(p)) {
				queued.removeInProgress(p);
			}
			else{
				queued.removeFromQueue(p);
			}
		}
	}
}
