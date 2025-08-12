//Assignment 34-Area of Rectangle using Scanner Class

package basic.program;

import java.util.Scanner;

public class D34_Scanner_AreaOfRectangle {
	
 static void Area_Of_Rectangle(int l,int b)
 {
	 int area=l*b;
	 System.out.println("Area Of Rectangle="+area);
	 
 }
 

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Length of Rectangle=");
		int length=sc.nextInt();
	
		System.out.println(length);
		
		System.out.println("Enter the Breadth of Rectangle=");
		int breath=sc.nextInt();
		System.out.println(breath);

		Area_Of_Rectangle(length,breath);
		
		sc.close();
		
		

	}

}
