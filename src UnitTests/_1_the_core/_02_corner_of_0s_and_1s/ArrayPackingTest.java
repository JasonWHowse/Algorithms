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
    public void test1() {
        int[] testCase = { 24, 85, 0 };
        var solution = 21784;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        int[] testCase = { 23, 45, 39 };
        var solution = 2567447;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        int[] testCase = { 1, 2, 4, 8 };
        var solution = 134480385;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        int[] testCase = { 5 };
        var solution = 5;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        int[] testCase = { 187, 99, 42, 43 };
        var solution = 724198331;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        int[] testCase = { 0 };
        var solution = 0;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        int[] testCase = { 207, 78, 212, 28 };
        var solution = 483675855;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        int[] testCase = { 111, 8, 150 };
        var solution = 9832559;
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        int[] testCase = { 242, 30 };
        var solution = 7922;
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        int[] testCase = { 255, 255, 255, 127 };
        var solution = 2147483647;
        test(testCase, solution);
    }//public void test10() {
    
    private void test(int[] testCase,int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new ArrayPacking().arrayPacking(testCase.clone()));
        assertEquals(solution,new ArrayPacking().arrayPacking(testCase.clone()));
    }//private void test(int[] testCase,int solution){
}//class ArrayPackingTest {