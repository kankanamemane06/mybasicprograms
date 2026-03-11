package Programming_Questions;

public class P1_ReverseString {

	public static void main(String[] args) {
		String s="My Name Is Kankana";
		String s1=s.toLowerCase();
		System.out.println("Original String="+s1);
		System.out.println("Length of String=" + s1.length());
		
		String reverse="";
		
		for(int i=s1.length()-1;i>=0;i--) {
			reverse=reverse+s1.charAt(i);
			
		}
		System.out.print("Reverse String="+reverse);
	}

}
