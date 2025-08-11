//Assignment 9.1:Example of Nested If Else Block

package basic.program;

public class A9_Nested_IfElse_Block_1 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		if(a<b) {
			
			if(a==b) {
				System.out.println("A is equal to B");
			}
			else {
				
				System.out.println("A is not equal to B");
			}
			
		}
		
		else {
			
			System.out.println("A is not less than B");
		}

	}

}
