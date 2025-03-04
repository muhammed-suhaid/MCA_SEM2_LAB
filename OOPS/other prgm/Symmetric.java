import java.util.Scanner;

public class Symmetric{ 
	public static void main(String [] args){
		Scanner myObj=new Scanner(System.in);
		
		System.out.print("Enter the number of rows : ");		
		int row=myObj.nextInt();
		System.out.print("Enter the number of columns : ");
		int col=myObj.nextInt();
		
		int m1[][]=new int[row][col];
		int m2[][]=new int[row][col];
		
		System.out.println("Enter the elements of matrix : ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				m1[i][j]=myObj.nextInt();
			}
		}
		
		System.out.println("Enter the elements of second matrix : ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				m2[i][j]=m1[j][i];
			}
		}
		
		System.out.println("your matrix : ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(m1[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("Transpose of matrix : ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(m2[i][j]+"\t");
			}
			System.out.println();
		}
		
		boolean isSymmetric=true;
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(m1[i][j]!=m2[i][j]){
					isSymmetric=false;
				}
			}
		}
		
		if(isSymmetric){
			System.out.println("symmetric");
		}else{
			System.out.println("Not symmetric");
		}
					
	}
}
