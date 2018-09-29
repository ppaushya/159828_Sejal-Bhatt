package Assignments;

public class MainClassStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UGStudent ug = new UGStudent(1,"Hetanxi",95,'A');
		ug.displayAttendence();
		ug.displayGrade();


		PGStudent pg = new PGStudent(2,"Sarthak",72,'B');
		pg.displayAttendence();
		pg.displayGrade();
		
	}

}
