/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._08_dark_wilderness;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class DigitDegreeTest {

    @Test
    void test1() {
        int testCase=5;
        int solution=0;
        assertTimeout(Duration.ofSeconds(3),()->
                new DigitDegree().digitDegree(testCase));
        assertEquals(new DigitDegree().digitDegree(testCase),solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase=100;
        int solution=1;
        assertTimeout(Duration.ofSeconds(3),()->
                new DigitDegree().digitDegree(testCase));
        assertEquals(new DigitDegree().digitDegree(testCase),solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase=91;
        int solution=2;
        assertTimeout(Duration.ofSeconds(3),()->
                new DigitDegree().digitDegree(testCase));
        assertEquals(new DigitDegree().digitDegree(testCase),solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase=99;
        int solution=2;
        assertTimeout(Duration.ofSeconds(3),()->
                new DigitDegree().digitDegree(testCase));
        assertEquals(new DigitDegree().digitDegree(testCase),solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase=1000000000;
        int solution=1;
        assertTimeout(Duration.ofSeconds(3),()->
                new DigitDegree().digitDegree(testCase));
        assertEquals(new DigitDegree().digitDegree(testCase),solution);
    }//void test5() {

    @Test
    void test6() {
        int testCase=9;
        int solution=0;
        assertTimeout(Duration.ofSeconds(3),()->
                new DigitDegree().digitDegree(testCase));
        assertEquals(new DigitDegree().digitDegree(testCase),solution);
    }//void test6() {

    @Test
    void test7() {
        int testCase=73;
        int solution=2;
        assertTimeout(Duration.ofSeconds(3),()->
                new DigitDegree().digitDegree(testCase));
        assertEquals(new DigitDegree().digitDegree(testCase),solution);
    }//void test7() {

    @Test
    void test8() {
        int testCase=877;
        int solution=2;
        assertTimeout(Duration.ofSeconds(3),()->
                new DigitDegree().digitDegree(testCase));
        assertEquals(new DigitDegree().digitDegree(testCase),solution);
    }//void test8() {

    @Test
    void test9() {
        int testCase=777773;
        int solution=3;
        assertTimeout(Duration.ofSeconds(3),()->
                new DigitDegree().digitDegree(testCase));
        assertEquals(new DigitDegree().digitDegree(testCase),solution);
    }//void test9() {

    @Test
    void test10() {
        int testCase=304;
        int solution=1;
        assertTimeout(Duration.ofSeconds(3),()->
                new DigitDegree().digitDegree(testCase));
        assertEquals(new DigitDegree().digitDegree(testCase),solution);
    }//void test10() {
}//class DigitDegreeTest {