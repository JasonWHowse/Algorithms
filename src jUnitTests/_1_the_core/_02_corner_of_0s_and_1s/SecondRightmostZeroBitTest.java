/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._02_corner_of_0s_and_1s;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SecondRightmostZeroBitTest {

    @Test
    void test1() {
        int testCase=37;
        int solution=8;
        test(testCase,solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase=1073741824;
        int solution=2;
        test(testCase,solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase=83748;
        int solution=2;
        test(testCase,solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase=4;
        int solution=2;
        test(testCase,solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase=728782938;
        int solution=4;
        test(testCase,solution);
    }//void test5() {

    private void test(int testCase, int solution){
        assertTimeout(Duration.ofSeconds(3),()->
                new SecondRightmostZeroBit().secondRightmostZeroBit(testCase));
        assertEquals(solution,new SecondRightmostZeroBit().secondRightmostZeroBit(testCase));
    }//private void test(int testCase, int solution){
}//class SecondRightmostZeroBitTest {