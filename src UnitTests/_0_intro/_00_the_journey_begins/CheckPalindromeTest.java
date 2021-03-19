/*
 * Authored by: Jason Wesley Howse
 */

/*
 * Authored by: Jason Wesley Howse
 */

/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._00_the_journey_begins;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class CheckPalindromeTest {
    @Test
    void test1() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("aabaa"));
        assertTrue((new CheckPalindrome()).
                checkPalindrome("aabaa"));
    }//void test1() {

    @Test
    void test2() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("abac"));
        assertFalse((new CheckPalindrome()).
                checkPalindrome("abac"));
    }//void test2() {

    @Test
    void test3() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("a"));
        assertTrue((new CheckPalindrome()).
                checkPalindrome("a"));
    }//void test() {

    @Test
    void test4() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("az"));
        assertFalse((new CheckPalindrome()).
                checkPalindrome("az"));
    }//void test4() {

    @Test
    void test5() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("abacaba"));
        assertTrue((new CheckPalindrome()).
                checkPalindrome("abacaba"));
    }//void test5() {

    @Test
    void test6() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("z"));
        assertTrue((new CheckPalindrome()).
                checkPalindrome("z"));
    }//void test6() {

    @Test
    void test7() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("aaabaaaa"));
        assertFalse((new CheckPalindrome()).
                checkPalindrome("aaabaaaa"));
    }//void test7() {

    @Test
    void test8() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("zzzazzazz"));
        assertFalse((new CheckPalindrome()).
                checkPalindrome("zzzazzazz"));
    }//void test8() {

    @Test
    void test9() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("hlbeeykoqqqqokyeeblh"));
        assertTrue((new CheckPalindrome()).
                checkPalindrome("hlbeeykoqqqqokyeeblh"));
    }//void test9() {

    @Test
    void test10() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("aabhlbeeykoqqqokyeeblhaa"));
        assertTrue((new CheckPalindrome()).
                checkPalindrome("hlbeeykoqqqokyeeblh"));
    }//void test10() {
}//class CheckPalindromeTest {