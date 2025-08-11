//Assignment 4.1=Write a program to do Addition,Subtraction,Multiplication,Division and Modulus using Static Method

package basic.program;

public class A4_StaticMethod_Calculator {
	
	public static void add()
	{
		int a=200;
		int b=100;
		int sum=a+b;
		System.out.println("Addition="+sum);
	}
	
	public static void sub()
	{
		int a=200;
		int b=100;
		int sub=a-b;
		System.out.println("Substration="+sub);
	}
	
	public static void multi()
	{
		int a=200;
		int b=100;
		int multi=a*b;
		System.out.println("Multiplication="+multi);
	}
	
	public static void div()
	{
		int a=200;
		int b=100;
		int div=a/b;
		System.out.println("Division="+div);
	}
	
	public static void mod()
	{
		int a=200;
		int b=100;
		int mod=a%b;
		System.out.println("Modulus="+mod);
	}

	public static void main(String[] args) {
		add();
		sub();
		multi();
		div();
		mod();

	}

}
