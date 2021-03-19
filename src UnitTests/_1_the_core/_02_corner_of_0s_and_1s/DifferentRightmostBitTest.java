/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._02_corner_of_0s_and_1s;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class DifferentRightmostBitTest {

    @Test
    void test1() {
        int testCase1=11;
        int testCase2=13;
        int solution=2;
        test(testCase1,testCase2,solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase1=7;
        int testCase2=23;
        int solution=16;
        test(testCase1,testCase2,solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase1=1;
        int testCase2=0;
        int solution=1;
        test(testCase1,testCase2,solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase1=64;
        int testCase2=65;
        int solution=1;
        test(testCase1,testCase2,solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase1=1073741823;
        int testCase2=1071513599;
        int solution=131072;
        test(testCase1,testCase2,solution);
    }//void test5() {

    @Test
    void test6() {
        int testCase1=42;
        int testCase2=22;
        int solution=4;
        test(testCase1,testCase2,solution);
    }//void test6() {

    private void test(int testCase1, int testCase2, int solution) {
        assertTimeout(Duration.ofSeconds(3),()->
                new DifferentRightmostBit().differentRightmostBit(testCase1,testCase2));
        assertEquals(solution,new DifferentRightmostBit().differentRightmostBit(testCase1,testCase2));
    }//private void test(int testCase1, int testCase2, int solution) {
}//class DifferentRightmostBitTest {