package assignment;

// Assignment20: Hierarchical inheritance

//subclass-one
class StudentInfo extends School {

	protected void sinfo() {
		int rollno = 1;
		String sname = "Josh";
		System.out.printf("----------------------------|%n");
		System.out.println("Student name: " + sname);
		System.out.println("Student rollno: " + rollno);

	}

}
//subclass-two
class Teacher extends School {

	protected void teacherinfo() {
		int id = 1;
		String tname = "Jess";
		System.out.printf("----------------------------|%n");

		System.out.println("Teacher id: " + id);
		System.out.println("Teacher name: " + tname);

	}

}
//Super class
class School {
	protected void schoolinfo() {

		String sc_name = "V.P School";

		System.out.println("School name: " + sc_name);
	}

}

public class HierarchicalInherit extends StudentInfo {

	public static void main(String[] args) {
		StudentInfo si = new StudentInfo();
		si.sinfo();
		si.schoolinfo();

		Teacher ti = new Teacher();
		ti.teacherinfo();
		ti.schoolinfo();

	}

}
