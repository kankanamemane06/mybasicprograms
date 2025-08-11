//Assignment 9.2:Example of Nested If Else Block
package basic.program;

public class A9_Nested_IfElse_Block_2 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		if(a<b) {
			if(a!=b) {
				if(a==b) {
					System.out.println("One");
				}
				else {
					System.out.println("Two");
				}
			}
			else {
				System.out.println("Three");
			}
		}
		else {
			
			System.out.println("Four");
		}
	}

}
