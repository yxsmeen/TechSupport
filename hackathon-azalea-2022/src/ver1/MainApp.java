package ver1;

public class MainApp {

	private static QueueSystem queued = new QueueSystem();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	private void newPatient(Patient p) {
		
	}

	private static void updateStatus(int id, int status) {
		Patient p = Storage.getPatient(id);
		p.setStatus(status);
		if (status == 0) {
			queued.addToQueue(p);
		}
		else if (status >=1 || status <=3) {
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
