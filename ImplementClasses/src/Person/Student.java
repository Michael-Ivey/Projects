package Person;
//Michael Ivey

public class Student extends Person {
	private final String CLASSSTATUS = "freshmen";

	@Override
	public String toString() {
		return "Student [CLASSSTATUS=" + CLASSSTATUS + "]";
	}

	public String getCLASSSTATUS() {
		return CLASSSTATUS;
	}
	
	
	

}
