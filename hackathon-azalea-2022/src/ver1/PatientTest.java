package ver1;

import java.time.LocalDate;

public class PatientTest {

	public static void main(String[] args) {
		testAge();

	}
	
	public static void testAge() {
		System.out.println("Testing BDAY");
		Patient p = new Patient("Deborah Simms", LocalDate.of(2003, 1, 27));
		System.out.println(p.toString());
//		System.out.println("Patient: " + p.toString());
	}

}
