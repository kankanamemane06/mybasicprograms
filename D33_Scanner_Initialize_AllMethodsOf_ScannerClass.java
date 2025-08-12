//Assignment 33=Lets Declare and Initialize/Utilize all the methods of Scanner Class

package basic.program;

import java.util.Scanner;

public class D33_Scanner_Initialize_AllMethodsOf_ScannerClass {

	public static void main(String[] args) {
		
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter the value in the Range of Byte-");
	 byte a1=sc.nextByte();
	 System.out.println(a1);
	 
	 System.out.println("Enter the value in the Range of Short-");
	 short a2=sc.nextShort();
	 System.out.println(a2);
	 
	 System.out.println("Enter the value in the Range of Int-");
	 int a3=sc.nextInt();
	 System.out.println(a3);
	 
	 System.out.println("Enter the value in the Range of Long-");
	 long a4=sc.nextLong();
	 System.out.println(a4);
	 
	 System.out.println("Enter a String-");
	 String a5=sc.next();
	 System.out.println(a5);

	 System.out.println("Enter the value in the Range of Float-");
	 float a6=sc.nextFloat();
	 System.out.println(a6);
	 
	 System.out.println("Enter the value in the Range of Double-");
	 double a7=sc.nextDouble();
	 System.out.println(a7);
	 
	 System.out.println("Enter Boolean value-");
	boolean a8=sc.nextBoolean();
	System.out.println(a8);
	 
	sc.close(); 
	}

}
