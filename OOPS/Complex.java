import java.util.Scanner;

public class Complex{
	public static void main(String []args){
		Scanner myScanner=new Scanner(System.in);
		
		System.out.print("Enter the real part of first complex number : ");
		int realNo1=myScanner.nextInt();
		System.out.print("Enter the imaginary part of first complex number : ");
		int imgNo1=myScanner.nextInt();
		
		System.out.print("Enter the real part of second complex number : ");
		int realNo2=myScanner.nextInt();	
		System.out.print("Enter the imaginary part of second complex number : ");
		int imgNo2=myScanner.nextInt();
		
		System.out.println("First Complex Number : "+realNo1 +"+"+imgNo1+"i");
		System.out.println("Second Complex Number : "+realNo2 +"+"+imgNo2+"i");
		
		int realNO=realNo1+realNo2;
		int imgNo=imgNo1+imgNo2;
		System.out.println("Added Complex Number : "+realNO +"+"+imgNo+"i");
			
	}


}
