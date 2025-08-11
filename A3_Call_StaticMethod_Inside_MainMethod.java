//Assignment 3.1=Write a Program to Call Static Method Inside Main Method

package basic.program;

public class A3_Call_StaticMethod_Inside_MainMethod {

	
	public static void add()
	{
		System.out.println("Addition");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method");
		add();
		sub();
		
	}
	public static void sub()
	{
		System.out.println("Substration");
	}

}
