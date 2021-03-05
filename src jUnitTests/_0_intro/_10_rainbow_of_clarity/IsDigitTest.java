/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._10_rainbow_of_clarity;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class IsDigitTest {

    @Test
    void test1() {
        char testCase='0';
        assertTimeout(Duration.ofSeconds(3),()->
                new IsDigit().isDigit(testCase));
        assertTrue(new IsDigit().isDigit(testCase));
    }//void test1() {

    @Test
    void test2() {
        char testCase='-';
        assertTimeout(Duration.ofSeconds(3),()->
                new IsDigit().isDigit(testCase));
        assertFalse(new IsDigit().isDigit(testCase));
    }//void test2() {

    @Test
    void test3() {
        char testCase='O';
        assertTimeout(Duration.ofSeconds(3),()->
                new IsDigit().isDigit(testCase));
        assertFalse(new IsDigit().isDigit(testCase));
    }//void test3() {

    @Test
    void test4() {
        char testCase='1';
        assertTimeout(Duration.ofSeconds(3),()->
                new IsDigit().isDigit(testCase));
        assertTrue(new IsDigit().isDigit(testCase));
    }//void test4() {

    @Test
    void test5() {
        char testCase='2';
        assertTimeout(Duration.ofSeconds(3),()->
                new IsDigit().isDigit(testCase));
        assertTrue(new IsDigit().isDigit(testCase));
    }//void test5() {

    @Test
    void test6() {
        char testCase='!';
        assertTimeout(Duration.ofSeconds(3),()->
                new IsDigit().isDigit(testCase));
        assertFalse(new IsDigit().isDigit(testCase));
    }//void test6() {

    @Test
    void test7() {
        char testCase='@';
        assertTimeout(Duration.ofSeconds(3),()->
                new IsDigit().isDigit(testCase));
        assertFalse(new IsDigit().isDigit(testCase));
    }//void test7() {

    @Test
    void test8() {
        char testCase='+';
        assertTimeout(Duration.ofSeconds(3),()->
                new IsDigit().isDigit(testCase));
        assertFalse(new IsDigit().isDigit(testCase));
    }//void test8() {

    @Test
    void test9() {
        char testCase='6';
        assertTimeout(Duration.ofSeconds(3),()->
                new IsDigit().isDigit(testCase));
        assertTrue(new IsDigit().isDigit(testCase));
    }//void test9() {

    @Test
    void test10() {
        char testCase='(';
        assertTimeout(Duration.ofSeconds(3),()->
                new IsDigit().isDigit(testCase));
        assertFalse(new IsDigit().isDigit(testCase));
    }//void test10() {

    @Test
    void test11() {
        char testCase=')';
        assertTimeout(Duration.ofSeconds(3),()->
                new IsDigit().isDigit(testCase));
        assertFalse(new IsDigit().isDigit(testCase));
    }//void test11() {
}