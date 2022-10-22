package ver1;

import java.time.LocalDate;

public class PatientTest {

	public static void main(String[] args) {
		testToString();
		testMultPatients();
		testMedicalHistory();
		testMakeHistory();
		testStatus();
		testStatusWithString();
	}
	
	public static void testToString() {
		System.out.println("---testToString()---");
		Patient p = new Patient("Deborah Simms", LocalDate.of(2001, 7, 27), "123 Main St.");
		System.out.println(p.toString());
		System.out.println(p.getStatus());
	}

	public static void testMultPatients() {
		System.out.println("\n---toString()---");
		Patient p = new Patient("Deborah Simms", LocalDate.of(2001, 7, 27), "123 Main St.");
		Patient p1 = new Patient("Sandra Dee", LocalDate.of(2010, 5, 22), "123 Main St.");
		System.out.println(p.toString());
		System.out.println(p.getStatus());
		System.out.println(p1.toString());
		System.out.println(p1.getStatus());
	}
	
	public static void testMedicalHistory() {
		System.out.println("\n---testMedicalHistory()---");
		Patient p = new Patient("Deborah Simms", LocalDate.of(2001, 7, 27), "123 Main St.");
		p.addMedicalHistory("Aching back");
		System.out.println(p.toString());
		System.out.println(p.getMedicalHistory());
		p.addMedicalHistory("Crooked neck");
		System.out.println(p.getMedicalHistory());
	}
	
	public static void testMakeHistory() {
		System.out.println("---testMakeHistory()---");
		Patient p = new Patient("Deborah Simms", LocalDate.of(2001, 7, 27), "123 Main St.");
		System.out.println(p.toString());
		
		System.out.println("\n->Added medical history");
		p.addMedicalHistory("Aching back");
		System.out.println(p.getMedicalHistory());
		
		System.out.println("->Added visit reason");
		p.addVisitReason("Chest pain");
		System.out.println(p.getMedicalHistory());
		System.out.println(p.getFullReason());
		
		System.out.println("\n->Made history");
		p.makeHistory();
		System.out.println(p.getMedicalHistory());
	}
	
	public static void testStatus() {
		System.out.println("---testStatus()---");
		Patient p = new Patient("Deborah Simms", LocalDate.of(2001, 7, 27), "123 Main St.");
		p.addMedicalHistory("Aching back");
		System.out.println(p.toString());
		System.out.println(p.getMedicalHistory());
		p.setStatus(0);
		System.out.println(p.getStatus());
	}
	
	public static void testStatusWithString() {
		System.out.println("\n---testStatusWithString()---");
		Patient p = new Patient("Deborah Simms", LocalDate.of(2001, 7, 27), "123 Main St.");
		p.addMedicalHistory("Aching back");
		System.out.println(p.toString());
		System.out.println(p.getMedicalHistory());
		p.setStatus("On Hold");
		System.out.println(p.getStatus());
	}
}
