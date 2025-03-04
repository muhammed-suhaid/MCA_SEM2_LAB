import java.util.Scanner;

class Student{
	String name;
	int roll_no;
	String sec;
	
	Student(String name,int roll_no,String sec){
		this.name=name;
		this.roll_no=roll_no;
		this.sec=sec;
	}
	
	void display(){
		System.out.println("Student Name : "+this.name);
		System.out.println("Student Roll No : "+this.roll_no);
		System.out.println("Student Section : "+this.sec);
	}
}

class DynamicStudentDetails{
	public static void main(String[] args){
		Scanner myScanner=new Scanner(System.in);
		Student studentArr[]=new Student[10];
		
		for(int i=0;i<4;i++){
			System.out.println("Enter Details of Student "+(i+1)+" : ");
			System.out.print("Student name : ");
			String name = myScanner.nextLine();
			
			System.out.print("Student roll no : ");
			int roll_no = myScanner.nextInt();
			
			System.out.print("Student section : ");
			String dummy = myScanner.nextLine();
			String sec = myScanner.nextLine();
			System.out.println("");
			
			studentArr[i]=new Student(name,roll_no,sec);
		}
		
		System.out.println("");
		
		for(int i=0;i<4;i++){
			System.out.println("---------- Details of Student "+(i+1)+" ----------");
			studentArr[i].display();
			System.out.println("");
		}
	}
}
	
