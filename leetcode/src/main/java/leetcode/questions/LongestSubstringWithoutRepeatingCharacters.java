package leetcode.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LongestSubstringWithoutRepeatingCharacters {

	public static int lengthOfLongestSubstring(String s) {
		if(s.length() == 0 ) {
			return 0;
		}
		
		Set<Character> foundChar = new HashSet<Character>();
		ArrayList<Integer> results = new ArrayList<Integer>();
		
		for(int resultIndex = 0; resultIndex < s.length(); resultIndex++) {
			results.add(0);
			for(int curIndex = resultIndex; curIndex < s.length(); curIndex++) {
				Character c = s.charAt(curIndex);
				if(!foundChar.contains(c)) {
					results.set(resultIndex, results.get(resultIndex) + 1);
					foundChar.add(c);
				} else {
					foundChar.clear();
					break;
				}
			}
		}
		
		return Collections.max(results);
	}

}
