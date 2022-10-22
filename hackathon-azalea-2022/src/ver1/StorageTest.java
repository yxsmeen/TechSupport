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
	}

	@Test
	final void testCheckPatientStatus() {
		Storage a = new Storage();
		Patient b = new Patient("Heather",LocalDate.now(),"1500 N Patterson St");
		a.addPatient(b);
		String actual = a.checkPatientStatus(b.getPatientID());
		System.out.println(actual);
	}

	@Test
	final void testGetPatient() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testDoesPatientExist() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testReturnPatientStatuses() {
		fail("Not yet implemented"); // TODO
	}

}
