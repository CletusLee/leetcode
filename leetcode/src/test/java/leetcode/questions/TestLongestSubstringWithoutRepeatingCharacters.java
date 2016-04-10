package leetcode.questions;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class TestLongestSubstringWithoutRepeatingCharacters {

	@Test
	public void testAbcabcbb() {
		int length = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb");
		
		assertThat(length, is(3));
	}
}
