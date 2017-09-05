import java.util.*;		//importing scanner class to get the values from user

class Student {		//creating a student class to get details of students
	private int roll, phone_no, st_class;	//declaring private data member (integer variables)
	private String name;						//declaring private data members (string variables)
	float marks1, marks2, marks3, percentage;  //declaring float variables
	public void setRoll(int stu_roll) {    //setting the value for roll no using the set method
		this.roll = stu_roll;
	}
	public int getRoll() {			//getting the roll number and returning the value for processing
		return this.roll;
	}
	public void setPhone(int stu_phone) {  //setting the value for phone no using the set method
		this.phone_no = stu_phone;
	}
	public int getPhone() {		//getting the phone number and returning the value for processing
		return this.phone_no;
	}
	public void setStclass(int stu_class) {  //setting the value for class using the set method
		this.st_class = stu_class;
	}
	public int getStclass() {		//getting the class and returning the value for processing
		return this.st_class;
	}
	public void setName(String stu_name) {   //setting the value for name using the set method
		this.name = stu_name;
	}
	public String getName() {		//getting the name and returning the value for processing
		return this.name;
	}
	public void marks(float m1, float m2, float m3) {   //method to take input from the user and assigning it to marks variable
		this.marks1 = m1;
		this.marks2 = m2;
		this.marks3 = m3;
	}
	public int calculate() {    //calculating method where percentage is calculated 
		percentage = (marks1 + marks2 +marks3) / 3;   //calculating the percentage
		if(percentage < 40)    //checking if the percentage is less than 40
		{
			return 1;		//returns the value as 1
		}
		else 
		{
			return 0;		//if more than 40 returns the value as 0
		}
	}
}

class StudentResultProcessing extends Student {   //new Class StudentResultProcessing which extends the student class
	int res = calculate();   //initializing variable and storing the value of return from calculate method
	void display() {   //method to display output on console
		if(res == 1) {   //condition to check whether the value in res is equal to 1
			System.out.println("You have Failed");  //if true then prints statement on console as fail
		}
		else
		{
			System.out.println("You have Passed");  //if condition is false then prints on console as pass
		}
	}
}

public class StudentData {    //main class 

	public static void main(String[] args) {  //main method
		 
		float m1, m2, m3;   //declaring float variables to take marks i/p from user
		
		Scanner sc =  new Scanner(System.in);   //creating an object of scanner class
		StudentResultProcessing srp = new StudentResultProcessing();   //creating an object of StudentResultProcessing Class
		Student st = new Student();	//creating an object of student class
		
		System.out.println("Enter Student Roll Number: ");   //taking input from user
		st.setRoll(sc.nextInt());  //taking input from user and passing directly to the setter method of student class
		System.out.println("Enter Student Name: ");   //taking input from user
		st.setName(sc.next());   //taking input from user and passing directly to the setter method of student class
		System.out.println("Enter Student Phone Number: ");  //taking input from user
		st.setPhone(sc.nextInt());  //taking input from user and passing directly to the setter method of student class
		System.out.println("Enter Student Class: ");  //taking input from user
		st.setRoll(sc.nextInt());  //taking input from user and passing directly to the setter method of student class
		System.out.println("Enter the marks of 1st Subject: ");  //taking input from user
		m1 = sc.nextFloat();   //taking input from user and storing in variable
		System.out.println("Enter the marks of 2nd Subject: ");  //taking input from user
		m2 = sc.nextFloat();   //taking input from user and storing in variable
		System.out.println("Enter the marks of 3rd Subject: ");  //taking input from user
		m3 = sc.nextFloat();  //taking input from user and storing in variable
		st.marks(m1, m2, m3);   //calling method marks
		srp.display();   //calling display method
		sc.close();   //closing the scanner class
	}

}
