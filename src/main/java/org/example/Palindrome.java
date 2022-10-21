package org.example;

import java.util.stream.IntStream;

public class Palindrome {

    protected String Given;
    private Boolean solution = Boolean.FALSE;

    public Palindrome(String input) {
        Given = input.replaceAll("[;:,.?()\\n\\t\\W]", "").toLowerCase().trim();
    }

    public Boolean isPalindromeByReversing() {
        StringBuilder reverse = new StringBuilder();
        for (int i = Given.length() - 1; i >= 0; i--) {
            reverse.append(Given.charAt(i));
        }
        solution = reverse.toString().equals(Given);
        return solution;
    }

    public Boolean isPalindromeWithStreams() {
        solution = IntStream.range(0, Given.length() / 2).allMatch(i -> (Given.charAt(i) == Given.charAt(Given.length() - i - 1)));
        return solution;
    }

    public Boolean isPalindromeUsingForloops() {
        for (int i = 0, j = Given.length() - 1; i <= j; i++, j--) {
            if (Given.charAt(i) != Given.charAt(j)) {
                return solution;
            }
        }
        solution = true;
        return solution;
    }
}
