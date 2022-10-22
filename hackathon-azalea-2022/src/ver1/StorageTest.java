package ver1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;

class StorageTest {

	@Test
	final void testAddPatient() {
	 Storage s = new Storage();
	 Patient b = new Patient("Mike", LocalDate.now(),"1500 N Patterson St");
	 s.addPatient(b);
	 int expected = 1;
	 int actual = Storage.AccountList.size();
	 assertEquals(expected,actual);
	 s.resetSystem();
	}

	@Test
	final void testRemovePatient() {
		Storage s = new Storage();
		Patient a = new Patient("Mike",LocalDate.now(),"1500 N Patterson St");
		s.addPatient(a);
		s.removePatient(a);
		int expected = 0;
		int actual = Storage.AccountList.size();
		assertEquals(expected,actual);
		s.resetSystem();
	}

	@Test
	final void testReturnNumList() {
		Storage a = new Storage();
		Patient ax = new Patient("Mike",LocalDate.now(),"1500 N Patterson St");
		Patient b = new Patient("Martin", LocalDate.now(),"1500 N Patterson St");
		a.addPatient(ax);
		a.addPatient(b);
		String expected = "There are 2 patients in our system";
		String actual = a.returnNumList();
		assertEquals(expected,actual);
		a.resetSystem();
	}
	

	@Test
	final void testPrintList() {
		Storage a = new Storage();
		Patient aa = new Patient("Javian", LocalDate.now(),"1500 N Patterson St");
		Patient b = new Patient ("Marcus", LocalDate.now(),"1500 N Patterson St");
		a.addPatient(aa);
		a.addPatient(b);
		String expected = a.printList();
		String actual = a.printList();
		assertEquals(expected,actual);
		a.resetSystem();
	}

	@Test
	final void testResetSystem() {
		Storage a = new Storage();
		Patient g = new Patient("Micheal",LocalDate.now(),"1500 N Patterson St");
		a.resetSystem();
		int expected = 0;
		int actual = a.AccountList.size();
		assertEquals(expected,actual);
		a.resetSystem();
	}

	@Test
	final void testCheckPatientStatus() {
		Storage a = new Storage();
		Patient b = new Patient("Heather",LocalDate.now(),"1500 N Patterson St");
		a.addPatient(b);
		String actual = a.checkPatientStatus(b.getPatientID());
		String expected = "Patient " + b.getPatientID() + " Status: Not Active";
		assertEquals(expected,actual);
		a.resetSystem();
	}

	@Test
	final void testGetPatient() {
		Storage a = new Storage();
		Patient z = new Patient("Huey",LocalDate.now(),"1200 N Patterson St");
		a.addPatient(z);
		Patient actual = Storage.getPatient2(z.name);
		assertEquals(z,actual);
		a.resetSystem();
	}

	@Test
	final void testDoesPatientExist() {
		Storage a = new Storage();
		Patient f = new Patient("Ian",LocalDate.now(),"1100 N Patterson St");
		a.addPatient(f);
		boolean expected = true;
		boolean actual = a.doesPatientExist(f.getPatientID());
		assertEquals(expected,actual);
		a.resetSystem();
	}
}
