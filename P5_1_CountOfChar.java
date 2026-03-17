package Programming_Questions;

public class P5_1_CountOfChar {

	static int countB=0;
	static int countA=0;
	static int countN=0;
	
	public static void main(String[] args) {
	String str="Banana";
	String s=str.toLowerCase();
	System.out.println("String is="+s);
	
	
	for(int i=0;i<s.length();i++) {
		
		char ch=s.charAt(i);
		if(ch=='b')
		{
			countB++;
		}
		
		if(ch=='a')
		{
			countA++;
		}
		if(ch=='n')
		{
			countN++;
		}
	}
	
	System.out.println("Count of B is="+countB);
	System.out.println("Count of A is="+countA);
	System.out.println("Count of N is="+countN);

	}

}
