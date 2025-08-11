//Assignment 10-WAP using Logical Operators:AND,OR,AND with NOT,OR with NOT

package basic.program;

public class A9_LogicalOperators {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("Logical Operators are-");
		if(a>6 || b==a)  //OR Operator
		{
			System.out.println("OR-Operator");
		}
		
		if(a>6 && b!=a)  //AND Operator
		{
			System.out.println("AND-Operator");
		}
		
		if(!(a<6 || b==a)) //OR-NOT Operator
		{
			System.out.println("OR with NOT Operator");
		}
		
		if(!(a!=6 && b==a)) //AND-NOT Operator
		{
			System.out.println("AND with NOT Operator");
		}

	}

}
