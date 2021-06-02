/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._00_intro_gates;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class SeatsInTheaterTest {

    @Test
    public void test1() {
        var testCase1 = 16;
        var testCase2 = 11;
        var testCase3 = 5;
        var testCase4 = 3;
        var solution = 96;
        test(testCase1, testCase2, testCase3, testCase4, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = 1;
        var testCase2 = 1;
        var testCase3 = 1;
        var testCase4 = 1;
        var solution = 0;
        test(testCase1, testCase2, testCase3, testCase4, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = 13;
        var testCase2 = 6;
        var testCase3 = 8;
        var testCase4 = 3;
        var solution = 18;
        test(testCase1, testCase2, testCase3, testCase4, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = 60;
        var testCase2 = 100;
        var testCase3 = 60;
        var testCase4 = 1;
        var solution = 99;
        test(testCase1, testCase2, testCase3, testCase4, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = 1000;
        var testCase2 = 1000;
        var testCase3 = 1000;
        var testCase4 = 1000;
        var solution = 0;
        test(testCase1, testCase2, testCase3, testCase4, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = 100;
        var testCase2 = 100;
        var testCase3 = 1;
        var testCase4 = 100;
        var solution = 0;
        test(testCase1, testCase2, testCase3, testCase4, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = 429;
        var testCase2 = 718;
        var testCase3 = 213;
        var testCase4 = 534;
        var solution = 39928;
        test(testCase1, testCase2, testCase3, testCase4, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = 985;
        var testCase2 = 299;
        var testCase3 = 478;
        var testCase4 = 299;
        var solution = 0;
        test(testCase1, testCase2, testCase3, testCase4, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = 596;
        var testCase2 = 162;
        var testCase3 = 364;
        var testCase4 = 160;
        var solution = 466;
        test(testCase1, testCase2, testCase3, testCase4, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = 1000;
        var testCase2 = 1000;
        var testCase3 = 567;
        var testCase4 = 983;
        var solution = 7378;
        test(testCase1, testCase2, testCase3, testCase4, solution);
    }//public void test10() {

    private void test(int testCase1, int testCase2, int testCase3, int testCase4, int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new SeatsInTheater().seatsInTheater(testCase1,testCase2,testCase3,testCase4));
        assertEquals(solution,new SeatsInTheater().seatsInTheater(testCase1,testCase2,testCase3,testCase4));
    }//private void test(int testCase1, int testCase2, int testCase3, int testCase4, int solution){
}//class SeatsInTheaterTest {