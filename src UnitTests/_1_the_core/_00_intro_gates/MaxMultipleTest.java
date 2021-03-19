/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._00_intro_gates;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class MaxMultipleTest {

    @Test
    void test1() {
        int testCase1=3;
        int testCase2=10;
        int solution=9;
        assertTimeout(Duration.ofSeconds(3),()->
                new MaxMultiple().maxMultiple(testCase1,testCase2));
        assertEquals(solution,new MaxMultiple().maxMultiple(testCase1,testCase2));
    }//void test1() {

    @Test
    void test2() {
        int testCase1=2;
        int testCase2=7;
        int solution=6;
        assertTimeout(Duration.ofSeconds(3),()->
                new MaxMultiple().maxMultiple(testCase1,testCase2));
        assertEquals(solution,new MaxMultiple().maxMultiple(testCase1,testCase2));
    }//void test2() {

    @Test
    void test3() {
        int testCase1=10;
        int testCase2=50;
        int solution=50;
        assertTimeout(Duration.ofSeconds(3),()->
                new MaxMultiple().maxMultiple(testCase1,testCase2));
        assertEquals(solution,new MaxMultiple().maxMultiple(testCase1,testCase2));
    }//void test3() {

    @Test
    void test4() {
        int testCase1=7;
        int testCase2=100;
        int solution=98;
        assertTimeout(Duration.ofSeconds(3),()->
                new MaxMultiple().maxMultiple(testCase1,testCase2));
        assertEquals(solution,new MaxMultiple().maxMultiple(testCase1,testCase2));
    }//void test4() {

    @Test
    void test5() {
        int testCase1=7;
        int testCase2=20;
        int solution=14;
        assertTimeout(Duration.ofSeconds(3),()->
                new MaxMultiple().maxMultiple(testCase1,testCase2));
        assertEquals(solution,new MaxMultiple().maxMultiple(testCase1,testCase2));
    }//void test5() {

    @Test
    void test6() {
        int testCase1=5;
        int testCase2=13;
        int solution=10;
        assertTimeout(Duration.ofSeconds(3),()->
                new MaxMultiple().maxMultiple(testCase1,testCase2));
        assertEquals(solution,new MaxMultiple().maxMultiple(testCase1,testCase2));
    }//void test6() {

    @Test
    void test7() {
        int testCase1=8;
        int testCase2=88;
        int solution=88;
        assertTimeout(Duration.ofSeconds(3),()->
                new MaxMultiple().maxMultiple(testCase1,testCase2));
        assertEquals(solution,new MaxMultiple().maxMultiple(testCase1,testCase2));
    }//void test7() {

    @Test
    void test8() {
        int testCase1=10;
        int testCase2=100;
        int solution=100;
        assertTimeout(Duration.ofSeconds(3),()->
                new MaxMultiple().maxMultiple(testCase1,testCase2));
        assertEquals(solution,new MaxMultiple().maxMultiple(testCase1,testCase2));
    }//void test8() {

    @Test
    void test9() {
        int testCase1=2;
        int testCase2=5;
        int solution=4;
        assertTimeout(Duration.ofSeconds(3),()->
                new MaxMultiple().maxMultiple(testCase1,testCase2));
        assertEquals(solution,new MaxMultiple().maxMultiple(testCase1,testCase2));
    }//void test9() {

    @Test
    void test10() {
        int testCase1=3;
        int testCase2=5;
        int solution=3;
        assertTimeout(Duration.ofSeconds(3),()->
                new MaxMultiple().maxMultiple(testCase1,testCase2));
        assertEquals(solution,new MaxMultiple().maxMultiple(testCase1,testCase2));
    }//void test10() {

    @Test
    void test11() {
        int testCase1=9;
        int testCase2=11;
        int solution=9;
        assertTimeout(Duration.ofSeconds(3),()->
                new MaxMultiple().maxMultiple(testCase1,testCase2));
        assertEquals(solution,new MaxMultiple().maxMultiple(testCase1,testCase2));
    }//void test11() {

    @Test
    void test12() {
        int testCase1=8;
        int testCase2=15;
        int solution=8;
        assertTimeout(Duration.ofSeconds(3),()->
                new MaxMultiple().maxMultiple(testCase1,testCase2));
        assertEquals(solution,new MaxMultiple().maxMultiple(testCase1,testCase2));
    }//void test12() {

    @Test
    void test13() {
        int testCase1=9;
        int testCase2=60;
        int solution=54;
        assertTimeout(Duration.ofSeconds(3),()->
                new MaxMultiple().maxMultiple(testCase1,testCase2));
        assertEquals(solution,new MaxMultiple().maxMultiple(testCase1,testCase2));
    }//void test13() {
}//class MaxMultipleTest {