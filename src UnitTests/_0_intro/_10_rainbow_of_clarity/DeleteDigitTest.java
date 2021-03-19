/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._10_rainbow_of_clarity;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class DeleteDigitTest {

    @Test
    void test1() {
        int testCase=152;
        int solution=52;
        assertTimeout(Duration.ofSeconds(3),()->
                new DeleteDigit().deleteDigit(testCase));
        assertEquals(new DeleteDigit().deleteDigit(testCase),solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase=1001;
        int solution=101;
        assertTimeout(Duration.ofSeconds(3),()->
                new DeleteDigit().deleteDigit(testCase));
        assertEquals(new DeleteDigit().deleteDigit(testCase),solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase=10;
        int solution=1;
        assertTimeout(Duration.ofSeconds(3),()->
                new DeleteDigit().deleteDigit(testCase));
        assertEquals(new DeleteDigit().deleteDigit(testCase),solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase=222219;
        int solution=22229;
        assertTimeout(Duration.ofSeconds(3),()->
                new DeleteDigit().deleteDigit(testCase));
        assertEquals(new DeleteDigit().deleteDigit(testCase),solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase=109;
        int solution=19;
        assertTimeout(Duration.ofSeconds(3),()->
                new DeleteDigit().deleteDigit(testCase));
        assertEquals(new DeleteDigit().deleteDigit(testCase),solution);
    }//void test5() {

    @Test
    void test6() {
        int testCase=222250;
        int solution=22250;
        assertTimeout(Duration.ofSeconds(3),()->
                new DeleteDigit().deleteDigit(testCase));
        assertEquals(new DeleteDigit().deleteDigit(testCase),solution);
    }//void test6() {

    @Test
    void test7() {
        int testCase=44435;
        int solution=4445;
        assertTimeout(Duration.ofSeconds(3),()->
                new DeleteDigit().deleteDigit(testCase));
        assertEquals(new DeleteDigit().deleteDigit(testCase),solution);
    }//void test7() {

    @Test
    void test8() {
        int testCase=12;
        int solution=2;
        assertTimeout(Duration.ofSeconds(3),()->
                new DeleteDigit().deleteDigit(testCase));
        assertEquals(new DeleteDigit().deleteDigit(testCase),solution);
    }//void test8() {

    @Test
    void test9() {
        int testCase=218616;
        int solution=28616;
        assertTimeout(Duration.ofSeconds(3),()->
                new DeleteDigit().deleteDigit(testCase));
        assertEquals(new DeleteDigit().deleteDigit(testCase),solution);
    }//void test9() {

    @Test
    void test10() {
        int testCase=861452;
        int solution=86452;
        assertTimeout(Duration.ofSeconds(3),()->
                new DeleteDigit().deleteDigit(testCase));
        assertEquals(new DeleteDigit().deleteDigit(testCase),solution);
    }//void test10() {
}