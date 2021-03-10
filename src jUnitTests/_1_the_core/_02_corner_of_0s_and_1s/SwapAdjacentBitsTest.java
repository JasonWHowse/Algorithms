/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._02_corner_of_0s_and_1s;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SwapAdjacentBitsTest {

    @Test
    void test1() {
        int testCase=13;
        int solution=14;
        test(testCase,solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase=74;
        int solution=133;
        test(testCase,solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase=1073741823;
        int solution=1073741823;
        test(testCase,solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase=0;
        int solution=0;
        test(testCase,solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase=1;
        int solution=2;
        test(testCase,solution);
    }//void test5() {

    @Test
    void test6() {
        int testCase=83748;
        int solution=166680;
        test(testCase,solution);
    }//void test6() {

    private void test(int testCase,int solution){
        assertTimeout(Duration.ofSeconds(3),()->
                new SwapAdjacentBits().swapAdjacentBits(testCase));
        assertEquals(solution,new SwapAdjacentBits().swapAdjacentBits(testCase));
    }//private void test(int testCase,int solution){
}//class SwapAdjacentBitsTest {