/*
 * Authored by: Jason Wesley Howse
 */

package intro.the_journey_begins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPalindromeTest {
    @org.junit.jupiter.api.Test
    void test1() {
        Assertions.assertEquals((new CheckPalindrome()).
                checkPalindrome("aabaa"), true);
    }//void test1() {

    @org.junit.jupiter.api.Test
    void test2() {
        Assertions.assertEquals((new CheckPalindrome()).
                checkPalindrome("aabaa"), true);
    }//void test2() {

    @org.junit.jupiter.api.Test
    void test3() {
        Assertions.assertEquals((new CheckPalindrome()).
                checkPalindrome("a"), true);
    }//void test() {

    @org.junit.jupiter.api.Test
    void test4() {
        Assertions.assertEquals((new CheckPalindrome()).
                checkPalindrome("az"), false);
    }//void test4() {

    @org.junit.jupiter.api.Test
    void test5() {
        Assertions.assertEquals((new CheckPalindrome()).
                checkPalindrome("abacaba"), true);
    }//void test5() {

    @org.junit.jupiter.api.Test
    void test6() {
        Assertions.assertEquals((new CheckPalindrome()).
                checkPalindrome("z"), true);
    }//void test6() {

    @org.junit.jupiter.api.Test
    void test7() {
        Assertions.assertEquals((new CheckPalindrome()).
                checkPalindrome("aaabaaaa"), false);
    }//void test7() {

    @org.junit.jupiter.api.Test
    void test8() {
        Assertions.assertEquals((new CheckPalindrome()).
                checkPalindrome("zzzazzazz"), false);
    }//void test8() {

    @org.junit.jupiter.api.Test
    void test9() {
        Assertions.assertEquals((new CheckPalindrome()).
                checkPalindrome("hlbeeykoqqqqokyeeblh"), true);
    }//void test9() {

    @org.junit.jupiter.api.Test
    void test10() {
        Assertions.assertEquals((new CheckPalindrome()).
                checkPalindrome("hlbeeykoqqqokyeeblh"), true);
    }//void test10() {
}//class CheckPalindromeTest {