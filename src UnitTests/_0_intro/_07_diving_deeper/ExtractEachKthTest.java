/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._07_diving_deeper;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class ExtractEachKthTest {

    @Test
    public void test1() {
        int[] testCase1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        var testCase2 = 3;
        int[] solution = { 1, 2, 4, 5, 7, 8, 10 };
        test(testCase1, testCase2, solution);
    }//public void test1() {

    @Test
    public void test2() {
        int[] testCase1 = { 1, 1, 1, 1, 1 };
        var testCase2 = 1;
        int[] solution = { };
        test(testCase1, testCase2, solution);
    }//public void test2() {

    @Test
    public void test3() {
        int[] testCase1 = { 1, 2, 1, 2, 1, 2, 1, 2 };
        var testCase2 = 2;
        int[] solution = { 1, 1, 1, 1 };
        test(testCase1, testCase2, solution);
    }//public void test3() {

    @Test
    public void test4() {
        int[] testCase1 = { 1, 2, 1, 2, 1, 2, 1, 2 };
        var testCase2 = 10;
        int[] solution = { 1, 2, 1, 2, 1, 2, 1, 2 };
        test(testCase1, testCase2, solution);
    }//public void test4() {

    @Test
    public void test5() {
        int[] testCase1 = { 2, 4, 6, 8, 10 };
        var testCase2 = 2;
        int[] solution = { 2, 6, 10 };
        test(testCase1, testCase2, solution);
    }//public void test5() {

    @Test
    public void test6() {
        int[] testCase1 = { 5, 7, 11, 4, 10, -9, -1, 5, -2, 1, 11, -3, 4, 4, -3 };
        var testCase2 = 3;
        int[] solution = { 5, 7, 4, 10, -1, 5, 1, 11, 4, 4 };
        test(testCase1, testCase2, solution);
    }//public void test6() {

    @Test
    public void test7() {
        int[] testCase1 = { 2, 0, 0, -5, -3, 1, 4, -10 };
        var testCase2 = 4;
        int[] solution = { 2, 0, 0, -3, 1, 4 };
        test(testCase1, testCase2, solution);
    }//public void test7() {

    @Test
    public void test8() {
        int[] testCase1 = { -20, 20, -19, 19, -18, 18, -17, 17, -16, 16, -15, 15, -14, 14, 0 };
        var testCase2 = 3;
        int[] solution = { -20, 20, 19, -18, -17, 17, 16, -15, -14, 14 };
        test(testCase1, testCase2, solution);
    }//public void test8() {

    @Test
    public void test9() {
        int[] testCase1 = { 10, 11, 12, 13, 14 };
        var testCase2 = 2;
        int[] solution = { 10, 12, 14 };
        test(testCase1, testCase2, solution);
    }//public void test9() {

    @Test
    public void test10() {
        int[] testCase1 = { 10, 11, 12, 13, 14 };
        var testCase2 = 3;
        int[] solution = { 10, 11, 13, 14 };
        test(testCase1, testCase2, solution);
    }//public void test10() {

    private void test(int[] testCase1, int testCase2, int[] solution){
        assertTimeout(Duration.ofSeconds(3), ()-> new ExtractEachKth().extractEachKth(testCase1.clone(),testCase2));
        MatcherAssert.assertThat(new ExtractEachKth().extractEachKth(testCase1,testCase2),is(solution));
    }//private void test(int[] testCase1, int testCase2, int[] solution){
}//class ExtractEachKthTest {