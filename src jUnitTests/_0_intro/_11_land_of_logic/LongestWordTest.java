/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._11_land_of_logic;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;

class LongestWordTest {

    @Test
    void test1() {
        String testCase="Ready, steady, go!";
        String solution="steady";
        assertTimeout(Duration.ofSeconds(3),()->
                new LongestWord().longestWord(testCase));
        assertEquals(new LongestWord().longestWord(testCase),solution);
    }//void test1() {

    @Test
    void test2() {
        String testCase="Ready[[[, steady, go!";
        String solution="steady";
        assertTimeout(Duration.ofSeconds(3),()->
                new LongestWord().longestWord(testCase));
        assertEquals(new LongestWord().longestWord(testCase),solution);
    }//void test2() {

    @Test
    void test3() {
        String testCase="ABCd";
        String solution="ABCd";
        assertTimeout(Duration.ofSeconds(3),()->
                new LongestWord().longestWord(testCase));
        assertEquals(new LongestWord().longestWord(testCase),solution);
    }//void test3() {

    @Test
    void test4() {
        String testCase="To be or not to be";
        String solution="not";
        assertTimeout(Duration.ofSeconds(3),()->
                new LongestWord().longestWord(testCase));
        assertEquals(new LongestWord().longestWord(testCase),solution);
    }//void test4() {

    @Test
    void test5() {
        String testCase="You are the best!!!!!!!!!!!! CodeFighter ever!";
        String solution="CodeFighter";
        assertTimeout(Duration.ofSeconds(3),()->
                new LongestWord().longestWord(testCase));
        assertEquals(new LongestWord().longestWord(testCase),solution);
    }//void test5() {
}