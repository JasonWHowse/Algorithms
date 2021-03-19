/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._00_intro_gates;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class LargestNumberTest {

    @Test
    void test1() {
        int testCase=2;
        int solution=99;
        assertTimeout(Duration.ofSeconds(3),()->
                new LargestNumber().largestNumber(testCase));
        assertEquals(solution,new LargestNumber().largestNumber(testCase));
    }//void test1() {

    @Test
    void test2() {
        int testCase=1;
        int solution=9;
        assertTimeout(Duration.ofSeconds(3),()->
                new LargestNumber().largestNumber(testCase));
        assertEquals(solution,new LargestNumber().largestNumber(testCase));
    }//void test2() {

    @Test
    void test3() {
        int testCase=7;
        int solution=9999999;
        assertTimeout(Duration.ofSeconds(3),()->
                new LargestNumber().largestNumber(testCase));
        assertEquals(solution,new LargestNumber().largestNumber(testCase));
    }//void test3() {

    @Test
    void test4() {
        int testCase=4;
        int solution=9999;
        assertTimeout(Duration.ofSeconds(3),()->
                new LargestNumber().largestNumber(testCase));
        assertEquals(solution,new LargestNumber().largestNumber(testCase));
    }//void test4() {

    @Test
    void test5() {
        int testCase=3;
        int solution=999;
        assertTimeout(Duration.ofSeconds(3),()->
                new LargestNumber().largestNumber(testCase));
        assertEquals(solution,new LargestNumber().largestNumber(testCase));
    }//void test5() {
}//class LargestNumberTest {