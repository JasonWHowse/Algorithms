/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._07_through_the_fog;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class DepositProfitTest {

    @Test
    void test1() {
        int testCase1=100;
        int testCase2=20;
        int testCase3=170;
        int solution=3;
        assertTimeout(Duration.ofSeconds(3),()->
                new DepositProfit().depositProfit(testCase1,testCase2,testCase3));
        assertEquals(solution,new DepositProfit().depositProfit(testCase1,testCase2,testCase3));
    }//void test1() {

    @Test
    void test2() {
        int testCase1=100;
        int testCase2=1;
        int testCase3=101;
        int solution=1;
        assertTimeout(Duration.ofSeconds(3),()->
                new DepositProfit().depositProfit(testCase1,testCase2,testCase3));
        assertEquals(solution,new DepositProfit().depositProfit(testCase1,testCase2,testCase3));
    }//void test2() {

    @Test
    void test3() {
        int testCase1=1;
        int testCase2=100;
        int testCase3=64;
        int solution=6;
        assertTimeout(Duration.ofSeconds(3),()->
                new DepositProfit().depositProfit(testCase1,testCase2,testCase3));
        assertEquals(solution,new DepositProfit().depositProfit(testCase1,testCase2,testCase3));
    }//void test3() {

    @Test
    void test4() {
        int testCase1=20;
        int testCase2=20;
        int testCase3=50;
        int solution=6;
        assertTimeout(Duration.ofSeconds(3),()->
                new DepositProfit().depositProfit(testCase1,testCase2,testCase3));
        assertEquals(solution,new DepositProfit().depositProfit(testCase1,testCase2,testCase3));
    }//void test4() {

    @Test
    void test5() {
        int testCase1=50;
        int testCase2=25;
        int testCase3=100;
        int solution=4;
        assertTimeout(Duration.ofSeconds(3),()->
                new DepositProfit().depositProfit(testCase1,testCase2,testCase3));
        assertEquals(solution,new DepositProfit().depositProfit(testCase1,testCase2,testCase3));
    }//void test5() {
}//class DepositProfitTest {