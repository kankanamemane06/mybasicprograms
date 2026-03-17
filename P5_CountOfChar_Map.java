package Programming_Questions;
import java.util.HashMap;
import java.util.Map;

public class P5_CountOfChar_Map {

	public static void main(String[] args) {
	String str="programmmming";

	Map<Character,Integer> map=new HashMap<>();
	
	for(char ch:str.toCharArray())
	{
		if(map.containsKey(ch)) {
			
			map.put(ch,map.get(ch)+1);
		}
		else {
			map.put(ch, 1);
		}
	}
	System.out.println(map);
	}

}
