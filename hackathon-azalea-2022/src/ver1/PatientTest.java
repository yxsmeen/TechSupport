package ver1;

import java.time.LocalDate;

public class PatientTest {

	public static void main(String[] args) {
		testAge();
		testMedicalHistory();
		testMakeHistory();
	}
	
	public static void testAge() {
		System.out.println("---toString()---");
		Patient p = new Patient("Deborah Simms", LocalDate.of(2001, 7, 27), "123 Main St.");
		System.out.println(p.toString());
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
}
