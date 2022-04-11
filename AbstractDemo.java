/*19. Design a Student class which contains register number, name, marks for three courses,
average and result. Define methods to get input, print details, find the average and result (if
mark is more than 49 in all courses then Pass, otherwise Fail).
Keep input methods and print methods as public while others are private.
Create array of objects for the Student class and demonstrate those methods*/
import java.util.Scanner;
abstract class Collage{
	abstract double average();
	abstract String result();
}
class Student extends Collage {
	private int register_number;
	private String name;
	private int marks1, marks2, marks3;

	double average() {
		return (marks1 + marks2 + marks3)/3;
	}
	String result() {
		if (average() > 49)
			return "Pass";
		else
			return "Fail";
	}
	void setdata() {
		Scanner in = new Scanner(System.in);
		System.out.print("\t* Enter Name : ");
		this.name = in.nextLine();
		System.out.print("\t* Enter Register No. : ");
		this.register_number = in.nextInt();
		System.out.print("\t* Enter marks of three course : ");
		this.marks1 = in.nextInt();
		this.marks2 = in.nextInt();
		this.marks3 = in.nextInt();
		in.close();
	}
	void getdata() {
		System.out.println("\t* Name : "+name+"\t* Register No. : "+register_number);
		System.out.println("\t* Marks in three subject : "+marks1+" "+marks2+" "+marks3);
		System.out.println("\t* Average : "+average()+"\t* Result : "+result());
	}

}

public class AbstractDemo {
	public static void main(String[] args) {
		Student stud1 = new Student();
		System.out.println("\t-------: fill data of student :--------");
		stud1.setdata();
		System.out.println("\t-------: Result of student :-----------");
		stud1.getdata();
		
	}
}