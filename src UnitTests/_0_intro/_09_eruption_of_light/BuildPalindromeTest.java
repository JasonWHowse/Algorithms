/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._09_eruption_of_light;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class BuildPalindromeTest {

    @Test
    void test1() {
        String testCase="abcdc";
        String solution="abcdcba";
        assertTimeout(Duration.ofSeconds(3),()->
                new BuildPalindrome().buildPalindrome(testCase));
        assertEquals(new BuildPalindrome().buildPalindrome(testCase),solution);
    }//void test1() {

    @Test
    void test2() {
        String testCase="ababab";
        String solution="abababa";
        assertTimeout(Duration.ofSeconds(3),()->
                new BuildPalindrome().buildPalindrome(testCase));
        assertEquals(new BuildPalindrome().buildPalindrome(testCase),solution);
    }//void test2() {

    @Test
    void test3() {
        String testCase="abba";
        String solution="abba";
        assertTimeout(Duration.ofSeconds(3),()->
                new BuildPalindrome().buildPalindrome(testCase));
        assertEquals(new BuildPalindrome().buildPalindrome(testCase),solution);
    }//void test3() {

    @Test
    void test4() {
        String testCase="abaa";
        String solution="abaaba";
        assertTimeout(Duration.ofSeconds(3),()->
                new BuildPalindrome().buildPalindrome(testCase));
        assertEquals(new BuildPalindrome().buildPalindrome(testCase),solution);
    }//void test4() {

    @Test
    void test5() {
        String testCase="aaaaba";
        String solution="aaaabaaaa";
        assertTimeout(Duration.ofSeconds(3),()->
                new BuildPalindrome().buildPalindrome(testCase));
        assertEquals(new BuildPalindrome().buildPalindrome(testCase),solution);
    }//void test5() {

    @Test
    void test6() {
        String testCase="abc";
        String solution="abcba";
        assertTimeout(Duration.ofSeconds(3),()->
                new BuildPalindrome().buildPalindrome(testCase));
        assertEquals(new BuildPalindrome().buildPalindrome(testCase),solution);
    }//void test6() {

    @Test
    void test7() {
        String testCase="kebab";
        String solution="kebabek";
        assertTimeout(Duration.ofSeconds(3),()->
                new BuildPalindrome().buildPalindrome(testCase));
        assertEquals(new BuildPalindrome().buildPalindrome(testCase),solution);
    }//void test7() {

    @Test
    void test8() {
        String testCase="abccba";
        String solution="abccba";
        assertTimeout(Duration.ofSeconds(3),()->
                new BuildPalindrome().buildPalindrome(testCase));
        assertEquals(new BuildPalindrome().buildPalindrome(testCase),solution);
    }//void test8() {

    @Test
    void test9() {
        String testCase="abcabc";
        String solution="abcabcbacba";
        assertTimeout(Duration.ofSeconds(3),()->
                new BuildPalindrome().buildPalindrome(testCase));
        assertEquals(new BuildPalindrome().buildPalindrome(testCase),solution);
    }//void test9() {

    @Test
    void test10() {
        String testCase="cbdbedffcg";
        String solution="cbdbedffcgcffdebdbc";
        assertTimeout(Duration.ofSeconds(3),()->
                new BuildPalindrome().buildPalindrome(testCase));
        assertEquals(new BuildPalindrome().buildPalindrome(testCase),solution);
    }//void test10() {

    @Test
    void test11() {
        String testCase="euotmn";
        String solution="euotmnmtoue";
        assertTimeout(Duration.ofSeconds(3),()->
                new BuildPalindrome().buildPalindrome(testCase));
        assertEquals(new BuildPalindrome().buildPalindrome(testCase),solution);
    }//void test11() {
}//class BuildPalindromeTest {