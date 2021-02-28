/*
 * Authored by: Jason Wesley Howse
 */

package intro.the_journey_begins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class CheckPalindromeTest {
    @Test
    void test1() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("aabaa"));
        Assertions.assertEquals((new CheckPalindrome()).
                checkPalindrome("aabaa"), true);
    }//void test1() {

    @Test
    void test2() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("abac"));
        Assertions.assertEquals((new CheckPalindrome()).
                checkPalindrome("abac"), false);
    }//void test2() {

    @Test
    void test3() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("a"));
        Assertions.assertEquals((new CheckPalindrome()).
                checkPalindrome("a"), true);
    }//void test() {

    @Test
    void test4() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("az"));
        Assertions.assertEquals((new CheckPalindrome()).
                checkPalindrome("az"), false);
    }//void test4() {

    @Test
    void test5() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("abacaba"));
        Assertions.assertEquals((new CheckPalindrome()).
                checkPalindrome("abacaba"), true);
    }//void test5() {

    @Test
    void test6() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("z"));
        Assertions.assertEquals((new CheckPalindrome()).
                checkPalindrome("z"), true);
    }//void test6() {

    @Test
    void test7() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("aaabaaaa"));
        Assertions.assertEquals((new CheckPalindrome()).
                checkPalindrome("aaabaaaa"), false);
    }//void test7() {

    @Test
    void test8() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("zzzazzazz"));
        Assertions.assertEquals((new CheckPalindrome()).
                checkPalindrome("zzzazzazz"), false);
    }//void test8() {

    @Test
    void test9() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("hlbeeykoqqqqokyeeblh"));
        Assertions.assertEquals((new CheckPalindrome()).
                checkPalindrome("hlbeeykoqqqqokyeeblh"), true);
    }//void test9() {

    @Test
    void test10() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new CheckPalindrome()).checkPalindrome("aabhlbeeykoqqqokyeeblhaa"));
        Assertions.assertEquals((new CheckPalindrome()).
                checkPalindrome("hlbeeykoqqqokyeeblh"), true);
    }//void test10() {
}//class CheckPalindromeTest {