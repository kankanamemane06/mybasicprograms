package Programming_Questions;

public class P2_Palindrome {

	public static void main(String[] args) {
		String string="Madam";
		String s1=string.toLowerCase();
		System.out.println("Original String is="+s1);
		
		String reverse="";
		for(int i=s1.length()-1;i>=0;i--) {
			reverse=reverse+s1.charAt(i);
		}
		System.out.println("Reverse String="+reverse);
		
		if(s1.equals(reverse)) {
			System.out.println(s1+"=String is Palindrome");
		}
		else {
			System.out.println(s1+"=String is not a Palindrome");
		}
		
	}

}
