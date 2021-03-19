/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._01_at_the_crossroads;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class ExtraNumberTest {

    @Test
    void test1() {
        int testCase1=2;
        int testCase2=7;
        int testCase3=2;
        int solution=7;
        assertTimeout(Duration.ofSeconds(3),()->
                new ExtraNumber().extraNumber(testCase1,testCase2,testCase3));
        assertEquals(solution,new ExtraNumber().extraNumber(testCase1,testCase2,testCase3));
    }//void test1() {

    @Test
    void test2() {
        int testCase1=3;
        int testCase2=2;
        int testCase3=2;
        int solution=3;
        assertTimeout(Duration.ofSeconds(3),()->
                new ExtraNumber().extraNumber(testCase1,testCase2,testCase3));
        assertEquals(solution,new ExtraNumber().extraNumber(testCase1,testCase2,testCase3));
    }//void test2() {

    @Test
    void test3() {
        int testCase1=5;
        int testCase2=5;
        int testCase3=1;
        int solution=1;
        assertTimeout(Duration.ofSeconds(3),()->
                new ExtraNumber().extraNumber(testCase1,testCase2,testCase3));
        assertEquals(solution,new ExtraNumber().extraNumber(testCase1,testCase2,testCase3));
    }//void test3() {

    @Test
    void test4() {
        int testCase1=500000000;
        int testCase2=3;
        int testCase3=500000000;
        int solution=3;
        assertTimeout(Duration.ofSeconds(3),()->
                new ExtraNumber().extraNumber(testCase1,testCase2,testCase3));
        assertEquals(solution,new ExtraNumber().extraNumber(testCase1,testCase2,testCase3));
    }//void test4() {

    @Test
    void test5() {
        int testCase1=1;
        int testCase2=5;
        int testCase3=1;
        int solution=5;
        assertTimeout(Duration.ofSeconds(3),()->
                new ExtraNumber().extraNumber(testCase1,testCase2,testCase3));
        assertEquals(solution,new ExtraNumber().extraNumber(testCase1,testCase2,testCase3));
    }//void test5() {

    @Test
    void test6() {
        int testCase1=5;
        int testCase2=5;
        int testCase3=3;
        int solution=3;
        assertTimeout(Duration.ofSeconds(3),()->
                new ExtraNumber().extraNumber(testCase1,testCase2,testCase3));
        assertEquals(solution,new ExtraNumber().extraNumber(testCase1,testCase2,testCase3));
    }//void test6() {

    @Test
    void test7() {
        int testCase1=5;
        int testCase2=1;
        int testCase3=1;
        int solution=5;
        assertTimeout(Duration.ofSeconds(3),()->
                new ExtraNumber().extraNumber(testCase1,testCase2,testCase3));
        assertEquals(solution,new ExtraNumber().extraNumber(testCase1,testCase2,testCase3));
    }//void test7() {

    @Test
    void test8() {
        int testCase1=4000000;
        int testCase2=3000000;
        int testCase3=4000000;
        int solution=3000000;
        assertTimeout(Duration.ofSeconds(3),()->
                new ExtraNumber().extraNumber(testCase1,testCase2,testCase3));
        assertEquals(solution,new ExtraNumber().extraNumber(testCase1,testCase2,testCase3));
    }//void test8() {

    @Test
    void test9() {
        int testCase1=548442737;
        int testCase2=82231042;
        int testCase3=548442737;
        int solution=82231042;
        assertTimeout(Duration.ofSeconds(3),()->
                new ExtraNumber().extraNumber(testCase1,testCase2,testCase3));
        assertEquals(solution,new ExtraNumber().extraNumber(testCase1,testCase2,testCase3));
    }//void test9() {

    @Test
    void test10() {
        int testCase1=469992838;
        int testCase2=66019520;
        int testCase3=66019520;
        int solution=469992838;
        assertTimeout(Duration.ofSeconds(3),()->
                new ExtraNumber().extraNumber(testCase1,testCase2,testCase3));
        assertEquals(solution,new ExtraNumber().extraNumber(testCase1,testCase2,testCase3));
    }//void test10() {
}//class ExtraNumberTest {