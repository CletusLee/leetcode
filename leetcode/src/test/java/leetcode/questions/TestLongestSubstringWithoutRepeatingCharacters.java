package leetcode.questions;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TestLongestSubstringWithoutRepeatingCharacters {

	@Test
	public void testAbcabcbb() {
		int length = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb");
		
		assertThat(length, is(3));
	}
	
	@Test
	public void testBbbbb() {
		int length = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb");
		
		assertThat(length, is(1));
	}
	
	@Test
	public void testZoneLengthInput() {
		int length = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("");
		
		assertThat(length, is(0));
	}
	
	@Test
	public void testC() {
		int length = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("c");
		
		assertThat(length, is(1));
	}
	
	@Test
	public void testAab() {
		int length = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("aab");
		
		assertThat(length, is(2));
	}

}
