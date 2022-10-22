package ver1;

import java.util.Comparator;

public class PatientIDComparator implements Comparator<Patient>{

	public int compare(Patient p1, Patient p2) {
		if(p1.getPatientID() == p2.getPatientID()) {
			return 0;
		} else if(p1.getPatientID() > p2.getPatientID()) {
			return 1;
		} else {
			return -1;
		}
	}
}
