package assignment;

//Assgnment: 4 if else if- grading system


public class Grading {

	static void marks() {
		
		int grade=78;
		
		if (grade>=90 && grade<=100)
		{
			System.out.println("Grade is A+");
		}
		else if(grade>=80 && grade<=90)
		{
			System.out.println("Grade is A");
		}
		else if(grade>=70 && grade<=80)
		{
			System.out.println("Grade is B");
		}
		else if(grade>=60 && grade<=70)
		{
			System.out.println("Grade is C");
		}
		else if(grade>=50 && grade<=60)
		{
			System.out.println("Grade is D");
		}
		else
		{
			System.out.println("Grade is Fail");
		}
	}
	
	public static void main(String[] args) {
		marks();
	}
}
