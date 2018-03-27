package leetcode.questions;

import org.junit.Before;
import org.junit.Test;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestValidParentheses {

    ValidParentheses validParentheses;

    @Before
    public void setup() {
        validParentheses = new ValidParentheses();
    }

    @Test
    public void validParentheses() {
        assertThat(validParentheses.isValid("()"), is(true));
    }

    @Test
    public void invalidParentheses() {
        assertThat(validParentheses.isValid("())"), is(false));
    }


}
