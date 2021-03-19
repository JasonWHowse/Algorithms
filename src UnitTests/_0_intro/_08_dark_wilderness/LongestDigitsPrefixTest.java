/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._08_dark_wilderness;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class LongestDigitsPrefixTest {

    @Test
    void test1() {
        String testCase="123aa1";
        String solution="123";
        assertTimeout(Duration.ofSeconds(3),()->
                new LongestDigitsPrefix().longestDigitsPrefix(testCase));
        assertEquals(new LongestDigitsPrefix().longestDigitsPrefix(testCase),solution);
    }//void test1() {

    @Test
    void test2() {
        String testCase="0123456789";
        String solution="0123456789";
        assertTimeout(Duration.ofSeconds(3),()->
                new LongestDigitsPrefix().longestDigitsPrefix(testCase));
        assertEquals(new LongestDigitsPrefix().longestDigitsPrefix(testCase),solution);
    }//void test2() {

    @Test
    void test3() {
        String testCase="  3) always check for whitespaces";
        String solution="";
        assertTimeout(Duration.ofSeconds(3),()->
                new LongestDigitsPrefix().longestDigitsPrefix(testCase));
        assertEquals(new LongestDigitsPrefix().longestDigitsPrefix(testCase),solution);
    }//void test3() {

    @Test
    void test4() {
        String testCase="12abc34";
        String solution="12";
        assertTimeout(Duration.ofSeconds(3),()->
                new LongestDigitsPrefix().longestDigitsPrefix(testCase));
        assertEquals(new LongestDigitsPrefix().longestDigitsPrefix(testCase),solution);
    }//void test4() {

    @Test
    void test5() {
        String testCase="the output is 42";
        String solution="";
        assertTimeout(Duration.ofSeconds(3),()->
                new LongestDigitsPrefix().longestDigitsPrefix(testCase));
        assertEquals(new LongestDigitsPrefix().longestDigitsPrefix(testCase),solution);
    }//void test5() {

    @Test
    void test6() {
        String testCase="aaaaaaa";
        String solution="";
        assertTimeout(Duration.ofSeconds(3),()->
                new LongestDigitsPrefix().longestDigitsPrefix(testCase));
        assertEquals(new LongestDigitsPrefix().longestDigitsPrefix(testCase),solution);
    }//void test6() {
}//class LongestDigitsPrefixTest {