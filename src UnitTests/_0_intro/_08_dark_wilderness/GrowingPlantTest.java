/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._08_dark_wilderness;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class GrowingPlantTest {

    @Test
    public void test1() {
        var testCase1 = 100;
        var testCase2 = 10;
        var testCase3 = 910;
        var solution = 10;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = 10;
        var testCase2 = 9;
        var testCase3 = 4;
        var solution = 1;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = 5;
        var testCase2 = 2;
        var testCase3 = 7;
        var solution = 2;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = 7;
        var testCase2 = 3;
        var testCase3 = 443;
        var solution = 110;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = 6;
        var testCase2 = 5;
        var testCase3 = 10;
        var solution = 5;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = 100;
        var testCase2 = 99;
        var testCase3 = 1000;
        var solution = 901;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = 3;
        var testCase2 = 2;
        var testCase3 = 1000;
        var solution = 998;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = 3;
        var testCase2 = 2;
        var testCase3 = 4;
        var solution = 2;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = 99;
        var testCase2 = 53;
        var testCase3 = 973;
        var solution = 20;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = 100;
        var testCase2 = 2;
        var testCase3 = 99;
        var solution = 1;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test10() {

    private void test(int testCase1, int testCase2, int testCase3, int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new GrowingPlant().growingPlant(testCase1,testCase2,testCase3));
        assertEquals(solution,new GrowingPlant().growingPlant(testCase1,testCase2,testCase3));
    }//private void test(int testCase1, int testCase2, int testCase3, int solution){
}//class GrowingPlantTest {