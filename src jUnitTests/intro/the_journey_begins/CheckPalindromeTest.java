/*
 * Authored by: Jason Wesley Howse
 */

package intro.the_journey_begins;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class CheckPalindromeTest {
    @Test
    void test1() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("aabaa"));
        assertEquals((new CheckPalindrome()).
                checkPalindrome("aabaa"), true);
    }//void test1() {

    @Test
    void test2() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("abac"));
        assertEquals((new CheckPalindrome()).
                checkPalindrome("abac"), false);
    }//void test2() {

    @Test
    void test3() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("a"));
        assertEquals((new CheckPalindrome()).
                checkPalindrome("a"), true);
    }//void test() {

    @Test
    void test4() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("az"));
        assertEquals((new CheckPalindrome()).
                checkPalindrome("az"), false);
    }//void test4() {

    @Test
    void test5() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("abacaba"));
        assertEquals((new CheckPalindrome()).
                checkPalindrome("abacaba"), true);
    }//void test5() {

    @Test
    void test6() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("z"));
        assertEquals((new CheckPalindrome()).
                checkPalindrome("z"), true);
    }//void test6() {

    @Test
    void test7() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("aaabaaaa"));
        assertEquals((new CheckPalindrome()).
                checkPalindrome("aaabaaaa"), false);
    }//void test7() {

    @Test
    void test8() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("zzzazzazz"));
        assertEquals((new CheckPalindrome()).
                checkPalindrome("zzzazzazz"), false);
    }//void test8() {

    @Test
    void test9() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("hlbeeykoqqqqokyeeblh"));
        assertEquals((new CheckPalindrome()).
                checkPalindrome("hlbeeykoqqqqokyeeblh"), true);
    }//void test9() {

    @Test
    void test10() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("aabhlbeeykoqqqokyeeblhaa"));
        assertEquals((new CheckPalindrome()).
                checkPalindrome("hlbeeykoqqqokyeeblh"), true);
    }//void test10() {
}//class CheckPalindromeTest {