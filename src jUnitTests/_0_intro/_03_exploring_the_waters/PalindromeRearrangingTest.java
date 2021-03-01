/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._03_exploring_the_waters;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class PalindromeRearrangingTest {

    @Test
    void test1() {
        String testCase="aabb";
        assertTimeout(Duration.ofSeconds(3),()->
                (new PalindromeRearranging().palindromeRearranging(testCase)));
        assertTrue(new PalindromeRearranging().palindromeRearranging(testCase));
    }//void test1() {

    @Test
    void test2() {
        String testCase="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc";
        assertTimeout(Duration.ofSeconds(3),()->
                (new PalindromeRearranging().palindromeRearranging(testCase)));
        assertFalse(new PalindromeRearranging().palindromeRearranging(testCase));
    }//void test2() {

    @Test
    void test3() {
        String testCase="abbcabb";
        assertTimeout(Duration.ofSeconds(3),()->
                (new PalindromeRearranging().palindromeRearranging(testCase)));
        assertTrue(new PalindromeRearranging().palindromeRearranging(testCase));
    }//void test3() {

    @Test
    void test4() {
        String testCase="zyyzzzzz";
        assertTimeout(Duration.ofSeconds(3),()->
                (new PalindromeRearranging().palindromeRearranging(testCase)));
        assertTrue(new PalindromeRearranging().palindromeRearranging(testCase));
    }//void test4() {

    @Test
    void test5() {
        String testCase="z";
        assertTimeout(Duration.ofSeconds(3),()->
                (new PalindromeRearranging().palindromeRearranging(testCase)));
        assertTrue(new PalindromeRearranging().palindromeRearranging(testCase));
    }//void test5() {

    @Test
    void test6() {
        String testCase="zaa";
        assertTimeout(Duration.ofSeconds(3),()->
                (new PalindromeRearranging().palindromeRearranging(testCase)));
        assertTrue(new PalindromeRearranging().palindromeRearranging(testCase));
    }//void test6() {

    @Test
    void test7() {
        String testCase="abca";
        assertTimeout(Duration.ofSeconds(3),()->
                (new PalindromeRearranging().palindromeRearranging(testCase)));
        assertFalse(new PalindromeRearranging().palindromeRearranging(testCase));
    }//void test7() {

    @Test
    void test8() {
        String testCase="abcad";
        assertTimeout(Duration.ofSeconds(3),()->
                (new PalindromeRearranging().palindromeRearranging(testCase)));
        assertFalse(new PalindromeRearranging().palindromeRearranging(testCase));
    }//void test8() {

    @Test
    void test9() {
        String testCase="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbccccaaaaaaaaaaaaa";
        assertTimeout(Duration.ofSeconds(3),()->
                (new PalindromeRearranging().palindromeRearranging(testCase)));
        assertFalse(new PalindromeRearranging().palindromeRearranging(testCase));
    }//void test9() {

    @Test
    void test10() {
        String testCase="abdhuierf";
        assertTimeout(Duration.ofSeconds(3),()->
                (new PalindromeRearranging().palindromeRearranging(testCase)));
        assertFalse(new PalindromeRearranging().palindromeRearranging(testCase));
    }//void test10() {
}//class PalindromeRearrangingTest {