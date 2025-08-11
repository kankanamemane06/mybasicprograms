//Assignment 4.2=Write a program to do Addition,Subtraction,Multiplication,Division and Modulus using NonStatic Method


package basic.program;

public class A4_NonStaticMethod_Calculator {
	public void add()
	{
		int a=200;
		int b=100;
		int sum=a+b;
		System.out.println("Addition="+sum);
	}
	
	public void sub()
	{
		int a=200;
		int b=100;
		int sub=a-b;
		System.out.println("Substration="+sub);
	}
	
	public void multi()
	{
		int a=200;
		int b=100;
		int multi=a*b;
		System.out.println("Multiplication="+multi);
	}
	
	public void div()
	{
		int a=200;
		int b=100;
		int div=a/b;
		System.out.println("Division="+div);
	}
	
	public void mod()
	{
		int a=200;
		int b=100;
		int mod=a%b;
		System.out.println("Modulus="+mod);
	}

	public void main(String[] args) {
		A4_NonStaticMethod_Calculator ns=new A4_NonStaticMethod_Calculator();
		ns.add();
		ns.sub();
		ns.multi();
		ns.div();
		ns.mod();

	}


}

