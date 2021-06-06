/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._2_Hash_Tables;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class PossibleSumsTest {

    @Test
    public void test1() {
        int[] testCase1 = { 10, 50, 100 };
        int[] testCase2 = { 1, 2, 1 };
        var solution = 9;
        test(testCase1, testCase2, solution);
    }//public void test1() {

    @Test
    public void test2() {
        int[] testCase1 = { 10, 50, 100, 500 };
        int[] testCase2 = { 5, 3, 2, 2 };
        var solution = 122;
        test(testCase1, testCase2, solution);
    }//public void test2() {

    @Test
    public void test3() {
        int[] testCase1 = { 1 };
        int[] testCase2 = { 5 };
        var solution = 5;
        test(testCase1, testCase2, solution);
    }//public void test3() {

    @Test
    public void test4() {
        int[] testCase1 = { 1, 1 };
        int[] testCase2 = { 2, 3 };
        var solution = 5;
        test(testCase1, testCase2, solution);
    }//public void test4() {

    @Test
    public void test5() {
        int[] testCase1 = { 1, 2 };
        int[] testCase2 = { 50000, 2 };
        var solution = 50004;
        test(testCase1, testCase2, solution);
    }//public void test5() {

    @Test
    public void test6() {
        int[] testCase1 = { 1, 2, 3 };
        int[] testCase2 = { 2, 3, 10000 };
        var solution = 30008;
        test(testCase1, testCase2, solution);
    }//public void test6() {

    @Test
    public void test7() {
        int[] testCase1 = { 3, 1, 1 };
        int[] testCase2 = { 111, 84, 104 };
        var solution = 521;
        test(testCase1, testCase2, solution);
    }//public void test7() {

    @Test
    public void test8() {
        int[] testCase1 = { 1, 1, 1, 1, 1 };
        int[] testCase2 = { 9, 19, 18, 12, 19 };
        var solution = 77;
        test(testCase1, testCase2, solution);
    }//public void test8() {

    @Test
    public void test9() {
        int[] testCase1 = { 3, 2, 5, 2, 3, 5, 4 };
        int[] testCase2 = { 4, 6, 4, 9, 6, 8, 8 };
        var solution = 150;
        test(testCase1, testCase2, solution);
    }//public void test9() {

    @Test
    public void test10() {
        int[] testCase1 = { 6, 12, 7, 16, 8, 5, 17, 18, 6 };
        int[] testCase2 = { 3, 4, 4, 2, 6, 4, 4, 2, 5 };
        var solution = 318;
        test(testCase1, testCase2, solution);
    }//public void test10() {

    @Test
    public void test11() {
        int[] testCase1 = { 13, 8, 31, 7, 10, 36, 28, 11, 11, 11 };
        int[] testCase2 = { 6, 3, 2, 2, 2, 2, 6, 1, 5, 4 };
        var solution = 532;
        test(testCase1, testCase2, solution);
    }//public void test11() {

    @Test
    public void test12() {
        int[] testCase1 = { 34, 39, 20, 47, 33, 49, 53, 8, 48, 44, 51, 47 };
        int[] testCase2 = { 2, 3, 2, 2, 2, 4, 1, 2, 3, 3, 2, 1 };
        var solution = 1005;
        test(testCase1, testCase2, solution);
    }//public void test12() {

    @Test
    public void test13() {
        int[] testCase1 = { 50, 48, 44, 46, 34, 53, 29, 27, 38, 30, 54, 56, 6, 55, 31 };
        int[] testCase2 = { 3, 1, 1, 2, 3, 1, 1, 1, 1, 1, 2, 2, 2, 1, 2 };
        var solution = 902;
        test(testCase1, testCase2, solution);
    }//public void test13() {

    @Test
    public void test14() {
        int[] testCase1 = { 50, 48, 44, 46, 34, 53, 29, 27, 38, 30, 54, 56, 6, 55, 31 };
        int[] testCase2 = { 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1 };
        var solution = 862;
        test(testCase1, testCase2, solution);
    }//public void test14() {

    @Test
    public void test15() {
        int[] testCase1 = { 5, 46, 27, 17, 54, 10, 14, 54, 40, 44, 22, 61, 19, 20, 68, 40, 2, 31 };
        int[] testCase2 = { 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 2 };
        var solution = 651;
        test(testCase1, testCase2, solution);
    }//public void test15() {

    @Test
    public void test16() {
        int[] testCase1 = { 17, 27, 22, 18, 9, 58, 50, 85, 67, 50, 42, 11, 60, 39, 23, 37, 28, 91, 81 };
        int[] testCase2 = { 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        var solution = 862;
        test(testCase1, testCase2, solution);
    }//public void test16() {

    private void test(int[] testCase1, int[] testCase2, int solution) {
        assertEquals(solution,new PossibleSums().possibleSums(testCase1.clone(),testCase2.clone()));
        assertTimeout(Duration.ofSeconds(3), ()-> new PossibleSums().possibleSums(testCase1,testCase2));
    }//private void test(int[] testCase1, int[] testCase2, int solution) {
}//class PossibleSumsTest {