package ver1;

import java.time.LocalDate;

public class QueueSystemTest {

	private static QueueSystem queued = new QueueSystem();
	
	public static void main(String[] args) {
		testCreation();
		testRemoved();
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
	
	public static void testCreation() {
		System.out.println("---testCreation()---");
		Storage s = new Storage();
		QueueSystem q = new QueueSystem();
		Patient p1 = new Patient("Jason Dean", LocalDate.of(1972, 3, 18), "37 911 St.");
		Patient p2 = new Patient("Veronica Sawyer", LocalDate.of(1972, 4, 22), "289 Candy St.");
		Patient p3 = new Patient("Elizabeth Strickland", LocalDate.of(2012, 10, 12), "888 Magnolia Ave.");
		s.addPatient(p1);
		s.addPatient(p2);
		s.addPatient(p3);
		
		System.out.println("p1 status: " + p1.getStatus());
		System.out.println("p2 status: " + p2.getStatus());
		System.out.println("p3 status: " + p3.getStatus());
		
		updateStatus(p1.getPatientID(), 0);
		updateStatus(p2.getPatientID(), 2);
		updateStatus(p3.getPatientID(), 0);
		
		System.out.println("\n->Updated Status:");
		System.out.println("p1 status: " + p1.getStatus());
		System.out.println("p2 status: " + p2.getStatus());
		System.out.println("p3 status: " + p3.getStatus());
		
		System.out.println("\nPatient Queue: \n" + q.getQueue());
		System.out.println("In progress: \n" + q.getProgress());
//		s.resetSystem();
//		q.resetInProgress();
//		q.resetQueue();
	}
	
	public static void testRemoved() {
		System.out.println("---testRemoved()---");
		Storage s = new Storage();
		QueueSystem q = new QueueSystem();
		Patient p1 = new Patient("Jason Dean", LocalDate.of(1972, 3, 18), "37 911 St.");
		Patient p2 = new Patient("Veronica Sawyer", LocalDate.of(1972, 4, 22), "289 Candy St.");
		Patient p3 = new Patient("Elizabeth Strickland", LocalDate.of(2012, 10, 12), "888 Magnolia Ave.");
		s.addPatient(p1);
		s.addPatient(p2);
		s.addPatient(p3);
		
		System.out.println("p1 status: " + p1.getStatus());
		System.out.println("p2 status: " + p2.getStatus());
		System.out.println("p3 status: " + p3.getStatus());
		
		System.out.println("\nPatient Queue: \n" + q.getQueue());
		System.out.println("In progress: \n" + q.getProgress());
		
		updateStatus(p1.getPatientID(), 0);
		updateStatus(p2.getPatientID(), 2);
		updateStatus(p3.getPatientID(), 0);
		
		System.out.println("\n->Updated Status:");
		System.out.println("p1 status: " + p1.getStatus());
		System.out.println("p2 status: " + p2.getStatus());
		System.out.println("p3 status: " + p3.getStatus());
		
		System.out.println("\nPatient Queue: \n" + q.getQueue());
		System.out.println("In progress: \n" + q.getProgress());
		
		updateStatus(p1.getPatientID(), 1);
		updateStatus(p2.getPatientID(), 5);
		updateStatus(p3.getPatientID(), 3);
		
		System.out.println("->Updated Status:");
		System.out.println("p1 status: " + p1.getStatus());
		System.out.println("p2 status: " + p2.getStatus());
		System.out.println("p3 status: " + p3.getStatus());
		
		System.out.println("\nPatient Queue: \n" + q.getQueue());
		System.out.println("In progress: \n" + q.getProgress());
		
		updateStatus(p1.getPatientID(), 3);
		updateStatus(p2.getPatientID(), 4);
		updateStatus(p3.getPatientID(), 5);
		
		System.out.println("->Updated Status:");
		System.out.println("p1 status: " + p1.getStatus());
		System.out.println("p2 status: " + p2.getStatus());
		System.out.println("p3 status: " + p3.getStatus());
		
		System.out.println("\nPatient Queue: \n" + q.getQueue());
		System.out.println("In progress: \n" + q.getProgress());
		
		updateStatus(p1.getPatientID(), 5);
		updateStatus(p2.getPatientID(), 5);
		updateStatus(p3.getPatientID(), 5);
		
		System.out.println("->Updated Status:");
		System.out.println("p1 status: " + p1.getStatus());
		System.out.println("p2 status: " + p2.getStatus());
		System.out.println("p3 status: " + p3.getStatus());
		
		System.out.println("\nPatient Queue: \n" + q.getQueue());
		System.out.println("In progress: \n" + q.getProgress());
		
//		s.resetSystem();
//		q.resetInProgress();
//		q.resetQueue();
	}

}
