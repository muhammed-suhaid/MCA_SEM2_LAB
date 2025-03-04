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
		System.out.println("------------------------------");
	}
}

class StudentDetails{
	public static void main(String[] args){
		Student student1=new Student("Sahla",1,"A");
		Student student2=new Student("Suhaid",2,"A");
		Student student3=new Student("Shafeela",3,"A");
		Student student4=new Student("Alhan",4,"A");
		
		student1.display();
		student2.display();
		student3.display();
		student4.display();
	}
}
	
