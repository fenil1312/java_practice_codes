package oops;

class Student {
	int rollNum;
	String studName;
	int marks1, marks2, marks3, totalMarks;
	
	Student(){  //this is called constructor of this class
		this.rollNum = 1;
		this.studName = "Ram";
		this.marks1 = 33;
		this.marks2 = 33;
		this.marks3 = 33;
	}

	void setStudDetail(int rollNum, String studName, int marks1, int marks2, int marks3) {
		this.rollNum = rollNum;
		this.studName = studName;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	void calculateTotal() {
		totalMarks = marks1 + marks2 + marks3;
	}

	void displayStudDetails() {
		System.out.println("Student roll no. : " + rollNum);
		System.out.println("Student Name : " + studName);
		System.out.println("Total marks : " + totalMarks);
	}
}

public class StudentDemo {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.setStudDetail(19,"Fenil",25,19,28);
//		st1.displayStudDetails();
		st1.calculateTotal();
		st1.displayStudDetails();

	}

}