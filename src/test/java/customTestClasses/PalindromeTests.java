package customTestClasses;

import org.example.Palindrome;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeTests {

    @Test
    public void isPalindromeByReversingTests() {
        Assert.assertEquals(new Palindrome("Madam").isPalindromeByReversing(), Boolean.TRUE);
        Assert.assertEquals(new Palindrome("Eve, mad Adam, Eve!").isPalindromeByReversing(), Boolean.TRUE);
        Assert.assertEquals(new Palindrome("RaCeCar").isPalindromeByReversing(), Boolean.TRUE);
        Assert.assertEquals(new Palindrome("").isPalindromeByReversing(), Boolean.TRUE);
        Assert.assertEquals(new Palindrome("Hai!").isPalindromeWithStreams(), Boolean.FALSE);

    }

    @Test
    public void isPalindromeWithStreamsTests() {

        Assert.assertEquals(new Palindrome("Madam").isPalindromeWithStreams(), Boolean.TRUE);
        Assert.assertEquals(new Palindrome("Eve, mad Adam, Eve!").isPalindromeWithStreams(), Boolean.TRUE);
        Assert.assertEquals(new Palindrome("RaCeCar").isPalindromeWithStreams(), Boolean.TRUE);
        Assert.assertEquals(new Palindrome("").isPalindromeWithStreams(), Boolean.TRUE);
        Assert.assertEquals(new Palindrome("Hai!").isPalindromeWithStreams(), Boolean.FALSE);
    }

    @Test
    public void isPalindromeUsingForLoopsTests() {

        Assert.assertEquals(new Palindrome("Madam").isPalindromeUsingForloops(), Boolean.TRUE);
        Assert.assertEquals(new Palindrome("Eve, mad Adam, Eve!").isPalindromeUsingForloops(), Boolean.TRUE);
        Assert.assertEquals(new Palindrome("RaCeCar").isPalindromeUsingForloops(), Boolean.TRUE);
        Assert.assertEquals(new Palindrome("").isPalindromeUsingForloops(), Boolean.TRUE);
        Assert.assertEquals(new Palindrome("Hai!").isPalindromeUsingForloops(), Boolean.FALSE);
    }

}
