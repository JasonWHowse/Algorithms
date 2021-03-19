/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._01_at_the_crossroads;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class KnapsackLightTest {

    @Test
    void test1() {
        int testCase1=10;
        int testCase2=5;
        int testCase3=6;
        int testCase4=4;
        int testCase5=8;
        int solution=10;
        assertTimeout(Duration.ofSeconds(3),()->
                new KnapsackLight().knapsackLight(testCase1,testCase2,testCase3,testCase4,testCase5));
        assertEquals(solution,new KnapsackLight().knapsackLight(testCase1,testCase2,testCase3,testCase4,testCase5));
    }//void test1() {

    @Test
    void test2() {
        int testCase1=10;
        int testCase2=5;
        int testCase3=6;
        int testCase4=4;
        int testCase5=9;
        int solution=16;
        assertTimeout(Duration.ofSeconds(3),()->
                new KnapsackLight().knapsackLight(testCase1,testCase2,testCase3,testCase4,testCase5));
        assertEquals(solution,new KnapsackLight().knapsackLight(testCase1,testCase2,testCase3,testCase4,testCase5));
    }//void test2() {

    @Test
    void test3() {
        int testCase1=5;
        int testCase2=3;
        int testCase3=7;
        int testCase4=4;
        int testCase5=6;
        int solution=7;
        assertTimeout(Duration.ofSeconds(3),()->
                new KnapsackLight().knapsackLight(testCase1,testCase2,testCase3,testCase4,testCase5));
        assertEquals(solution,new KnapsackLight().knapsackLight(testCase1,testCase2,testCase3,testCase4,testCase5));
    }//void test3() {

    @Test
    void test4() {
        int testCase1=10;
        int testCase2=2;
        int testCase3=11;
        int testCase4=3;
        int testCase5=1;
        int solution=0;
        assertTimeout(Duration.ofSeconds(3),()->
                new KnapsackLight().knapsackLight(testCase1,testCase2,testCase3,testCase4,testCase5));
        assertEquals(solution,new KnapsackLight().knapsackLight(testCase1,testCase2,testCase3,testCase4,testCase5));
    }//void test4() {

    @Test
    void test5() {
        int testCase1=15;
        int testCase2=2;
        int testCase3=20;
        int testCase4=3;
        int testCase5=2;
        int solution=15;
        assertTimeout(Duration.ofSeconds(3),()->
                new KnapsackLight().knapsackLight(testCase1,testCase2,testCase3,testCase4,testCase5));
        assertEquals(solution,new KnapsackLight().knapsackLight(testCase1,testCase2,testCase3,testCase4,testCase5));
    }//void test5() {

    @Test
    void test6() {
        int testCase1=2;
        int testCase2=5;
        int testCase3=3;
        int testCase4=4;
        int testCase5=5;
        int solution=3;
        assertTimeout(Duration.ofSeconds(3),()->
                new KnapsackLight().knapsackLight(testCase1,testCase2,testCase3,testCase4,testCase5));
        assertEquals(solution,new KnapsackLight().knapsackLight(testCase1,testCase2,testCase3,testCase4,testCase5));
    }//void test6() {

    @Test
    void test7() {
        int testCase1=4;
        int testCase2=3;
        int testCase3=3;
        int testCase4=4;
        int testCase5=4;
        int solution=4;
        assertTimeout(Duration.ofSeconds(3),()->
                new KnapsackLight().knapsackLight(testCase1,testCase2,testCase3,testCase4,testCase5));
        assertEquals(solution,new KnapsackLight().knapsackLight(testCase1,testCase2,testCase3,testCase4,testCase5));
    }//void test7() {

    @Test
    void test8() {
        int testCase1=3;
        int testCase2=5;
        int testCase3=3;
        int testCase4=8;
        int testCase5=10;
        int solution=3;
        assertTimeout(Duration.ofSeconds(3),()->
                new KnapsackLight().knapsackLight(testCase1,testCase2,testCase3,testCase4,testCase5));
        assertEquals(solution,new KnapsackLight().knapsackLight(testCase1,testCase2,testCase3,testCase4,testCase5));
    }//void test8() {
}//class KnapsackLightTest {