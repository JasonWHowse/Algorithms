/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._3_Special_Topics._0_Common_Techniques_Basic;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class ArrayMaxConsecutiveSum2Test {

    @Test
    public void test1() {
        int[] testCase = { -2, 2, 5, -11, 6 };
        var solution = 7;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        int[] testCase = { -3, -2, -1, -4 };
        var solution = -1;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        int[] testCase = { -3, 2, 1, -4 };
        var solution = 3;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        int[] testCase = { 1, -2, 3, -4, 5, -3, 2, 2, 2 };
        var solution = 8;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        int[] testCase = { 11, -2, 1, -4, 5, -3, 2, 2, 2 };
        var solution = 14;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        int[] testCase = { 89, 96, 60, 10, 24, 30, 72, 40, 74, 49, 38, 87, 55, 46, 44, 14, 49, 88, 93, 11 };
        var solution = 1069;
        test(testCase, solution);
    }//public void test6() {

    private void test(int[] testCase, int solution){
        assertEquals(solution, new ArrayMaxConsecutiveSum2().arrayMaxConsecutiveSum2(testCase.clone()));
        assertTimeout(Duration.ofSeconds(3),()->new ArrayMaxConsecutiveSum2().arrayMaxConsecutiveSum2(testCase));
    }//private void test(int[] testCase, int solution){
}//class ArrayMaxConsecutiveSum2Test {