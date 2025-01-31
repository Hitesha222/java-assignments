package assignment;

//Assignment24: WAP that demonstrate interface concept

interface University{
	void college();
	void stream();
}

interface Course{
	void language();
}

public class InterfaceAdmission implements University,Course {

	public void college() {
		System.out.println("College name is s.p");
	}
	public void stream() {
		System.out.println("Stream is B.Tc");
		
	}
	public void language() {
		System.out.println("Main language is Java");
		
	}
	
	public static void main(String[] args) {
		
		InterfaceAdmission id=new InterfaceAdmission();
		id.college();
		id.stream();
		id.language();
	}

}
