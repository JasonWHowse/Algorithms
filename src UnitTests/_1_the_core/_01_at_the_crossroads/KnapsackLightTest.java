/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._01_at_the_crossroads;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class KnapsackLightTest {

    @Test
    public void test1() {
        var testCase1 = 10;
        var testCase2 = 6;
        var testCase3 = 5;
        var testCase4 = 4;
        var testCase5 = 8;
        var solution = 10;
        test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = 10;
        var testCase2 = 5;
        var testCase3 = 6;
        var testCase4 = 4;
        var testCase5 = 9;
        var solution = 16;
        test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = 5;
        var testCase2 = 3;
        var testCase3 = 7;
        var testCase4 = 4;
        var testCase5 = 6;
        var solution = 7;
        test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = 10;
        var testCase2 = 2;
        var testCase3 = 11;
        var testCase4 = 3;
        var testCase5 = 1;
        var solution = 0;
        test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = 15;
        var testCase2 = 2;
        var testCase3 = 20;
        var testCase4 = 3;
        var testCase5 = 2;
        var solution = 15;
        test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = 2;
        var testCase2 = 5;
        var testCase3 = 3;
        var testCase4 = 4;
        var testCase5 = 5;
        var solution = 3;
        test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = 4;
        var testCase2 = 3;
        var testCase3 = 3;
        var testCase4 = 4;
        var testCase5 = 4;
        var solution = 4;
        test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = 3;
        var testCase2 = 5;
        var testCase3 = 3;
        var testCase4 = 8;
        var testCase5 = 10;
        var solution = 3;
        test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = 3;
        var testCase2 = 4;
        var testCase3 = 5;
        var testCase4 = 3;
        var testCase5 = 3;
        var solution = 5;
        test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = 5;
        var testCase2 = 2;
        var testCase3 = 4;
        var testCase4 = 2;
        var testCase5 = 20;
        var solution = 9;
        test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase1 = 2;
        var testCase2 = 2;
        var testCase3 = 2;
        var testCase4 = 2;
        var testCase5 = 2;
        var solution = 2;
        test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase1 = 10;
        var testCase2 = 4;
        var testCase3 = 11;
        var testCase4 = 5;
        var testCase5 = 3;
        var solution = 0;
        test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase1 = 10;
        var testCase2 = 4;
        var testCase3 = 11;
        var testCase4 = 5;
        var testCase5 = 6;
        var solution = 11;
        test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase1 = 12;
        var testCase2 = 4;
        var testCase3 = 11;
        var testCase4 = 5;
        var testCase5 = 6;
        var solution = 12;
        test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase1 = 4;
        var testCase2 = 5;
        var testCase3 = 6;
        var testCase4 = 5;
        var testCase5 = 4;
        var solution = 0;
        test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
    }//public void test15() {

    private void test(int testCase1, int testCase2, int testCase3, int testCase4, int testCase5, int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new KnapsackLight().knapsackLight(testCase1,testCase2,testCase3,testCase4,testCase5));
        assertEquals(solution,new KnapsackLight().knapsackLight(testCase1,testCase2,testCase3,testCase4,testCase5));
    }//private void test(int testCase1, int testCase2, int testCase3, int testCase4, int testCase5, int solution){
}//class KnapsackLightTest {