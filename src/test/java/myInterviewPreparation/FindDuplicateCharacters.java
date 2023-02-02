package myInterviewPreparation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {

	public static void main(String[] args) {
		findDuplicateChars("Nagarajuu");
	}

	public static void findDuplicateChars(String str) {
		if(str == null || str.isEmpty() || str.length() == 1) {
			return ;  
		}
		char words[] = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for(Character ch : words) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) +1);
			}
			else {
				charMap.put(ch, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		for(Map.Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey() + " repeated : "+ entry.getValue() + " times");
			}
		}
		
		
	}
}
