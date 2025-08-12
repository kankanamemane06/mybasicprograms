//Assignment 31-WAP on area of circle using math.random five times using for loop
package basic.program;

public class D31_AreaOfCircle_MathRandom_5times {

	static double pi_value=Math.PI;
	public static void main(String[] args) {
		
	for(int i=1;i<=5;i++) {
		double r=Math.random();
		double area=pi_value*r*r;
		System.out.println("Area Of Circle="+area);
		}
	}

}
