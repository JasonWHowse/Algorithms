/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class AdditionWithoutCarryingTest {

    @Test
    void test1() {
        int testCase1=456;
        int testCase2=1734;
        int solution=1180;
        test(testCase1,testCase2,solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase1=99999;
        int testCase2=0;
        int solution=99999;
        test(testCase1,testCase2,solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase1=999;
        int testCase2=999;
        int solution=888;
        test(testCase1,testCase2,solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase1=0;
        int testCase2=0;
        int solution=0;
        test(testCase1,testCase2,solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase1=54321;
        int testCase2=54321;
        int solution=8642;
        test(testCase1,testCase2,solution);
    }//void test5() {

    @Test
    void test6() {
        int testCase1=54321;
        int testCase2=56789;
        int solution=0;
        test(testCase1,testCase2,solution);
    }//void test6() {

    private void test(int testCase1,int testCase2,int solution){
        assertTimeout(Duration.ofSeconds(3),()->
                new AdditionWithoutCarrying().additionWithoutCarrying(testCase1,testCase2));
        assertEquals(solution,new AdditionWithoutCarrying().additionWithoutCarrying(testCase1,testCase2));
    }//private void test(int testCase1,int testCase2,int solution){
}//class AdditionWithoutCarryingTest {