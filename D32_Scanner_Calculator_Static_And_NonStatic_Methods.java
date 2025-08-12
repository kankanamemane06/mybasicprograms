//Assignment 32=Lets do Addition,Subtraction,Multiplication,Division and Modulus using these 5 static and non-static methods and use Scanner Class
//OR
//Using scanner class,static and nonstatic methods lets do Addition,Subtraction ,Multiplication,Division and Modulus of 5 different method.
package basic.program;

import java.util.Scanner;

public class D32_Scanner_Calculator_Static_And_NonStatic_Methods {
	
	
	static void add(int number1,int number2)
	{
		int sum=number1+number2;
		System.out.println("Addition is="+sum);
	}
	
	static void sub(int number1,int number2)
	{
		int sub=number1-number2;
		System.out.println("Substraction is="+sub);
	}
	
	static void mult(int number1,int number2)
	{
		int mult=number1*number2;
		System.out.println("Multiplication is="+mult);
	}
	
	void div(int number1,int number2)
	{
		int div=number1/number2;
		System.out.println("Division is="+div);
	}
	
	void mod(int number1,int number2)
	{
		int mod=number1%number2;
		System.out.println("Modulus is="+mod);
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number=");
		int number1=sc.nextInt();
		
		System.out.println("Enter Second Number=");
		int number2=sc.nextInt();
		
		add(number1,number2);
		sub(number1,number2);
		mult(number1,number2);
		
		D32_Scanner_Calculator_Static_And_NonStatic_Methods d=new D32_Scanner_Calculator_Static_And_NonStatic_Methods();
		d.mod(number1,number2);
		
		sc.close();

	}

}
