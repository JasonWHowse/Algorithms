/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._02_corner_of_0s_and_1s;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class ArrayPackingTest {

    @Test
    void test1() {
        int[] testCase= {24, 85, 0};
        int solution=21784;
        test(testCase,solution);
    }//void test1() {

    @Test
    void test2() {
        int[] testCase= {23, 45, 39};
        int solution=2567447;
        test(testCase,solution);
    }//void test2() {

    @Test
    void test3() {
        int[] testCase= {1, 2, 4, 8};
        int solution=134480385;
        test(testCase,solution);
    }//void test3() {

    @Test
    void test4() {
        int[] testCase= {5};
        int solution=5;
        test(testCase,solution);
    }//void test4() {

    @Test
    void test5() {
        int[] testCase= {187, 99, 42, 43};
        int solution=724198331;
        test(testCase,solution);
    }//void test5() {
    
    private void test(int[] testCase,int solution){
        assertTimeout(Duration.ofSeconds(3),()->
                new ArrayPacking().arrayPacking(testCase.clone()));
        assertEquals(solution,new ArrayPacking().arrayPacking(testCase.clone()));
    }//private void test(int[] testCase,int solution){
}//class ArrayPackingTest {