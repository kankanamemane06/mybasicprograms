//Assignment 3.2=Write a Program to Call NonStatic Method Inside Main Method

package basic.program;

public class A3_Call_NonStaticMethod_Inside_MainMethod_2 {

	public void add()
	{
		System.out.println("Addition="+(5+4));
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method");
		A3_Call_NonStaticMethod_Inside_MainMethod_2 a=new A3_Call_NonStaticMethod_Inside_MainMethod_2();
		a.add();
		a.sub();
	
	}
	public void sub()
	{
		System.out.println("Substration="+(5-4));
	}

}
