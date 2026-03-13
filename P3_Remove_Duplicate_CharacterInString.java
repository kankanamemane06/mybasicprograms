//If the character is not found, indexOf() returns -1.
package Programming_Questions;

public class P3_Remove_Duplicate_CharacterInString {

	public static void main(String[] args) {
		String str="programming";
		System.out.println("String with duplicates="+str);
		String result="";
		
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(result.indexOf(ch)==-1) { //Check character in result string
				result=result+ch; //add character
			}
		
		}
		System.out.println("String without duplicates="+result);
	}

}
