//Assignment 8:Example of If Else If Block

package basic.program;

public class A8_IfElseIf_Block_1{

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		if(a>b)
		{
			System.out.println("A is greater than B");
		}
		else if(a>=b) {
			System.out.println("A is greater than equal to B");
			
		}
		else if(a<b)
		{
			System.out.println("A is less than B");
		}
		
		else if(a<=b)
		{
			System.out.println("A is less than or equal to B");
		}
		else if(a!=b) {
			System.out.println("A is not equal to B");
		}
		else {
			System.out.println("Else Block");
		}
	}

}
