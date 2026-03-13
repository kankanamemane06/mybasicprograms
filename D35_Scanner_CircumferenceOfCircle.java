//Assignment 35=Circumference of Circle using Scanner Class

package basic.program;

import java.util.Scanner;

public class D35_Scanner_CircumferenceOfCircle {
	
	final static double pi=3.14;

	static void CircumferenceOfCircle(int r)
	{
		double Circumference_Of_Circle=2*pi*r;
		System.out.println("Circumference Of Circle="+Circumference_Of_Circle);
	}
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the radius=");
	int r=sc.nextInt();
	
	CircumferenceOfCircle(r);
	
	sc.close();

	}

}
