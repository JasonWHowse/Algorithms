/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._00_intro_gates;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class PhoneCallTest {

    @Test
    public void test1() {
        var testCase1 = 3;
        var testCase2 = 1;
        var testCase3 = 2;
        var testCase4 = 20;
        var solution = 14;
        test(testCase1, testCase2, testCase3, testCase4, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = 2;
        var testCase2 = 2;
        var testCase3 = 1;
        var testCase4 = 2;
        var solution = 1;
        test(testCase1, testCase2, testCase3, testCase4, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = 10;
        var testCase2 = 1;
        var testCase3 = 2;
        var testCase4 = 22;
        var solution = 11;
        test(testCase1, testCase2, testCase3, testCase4, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = 2;
        var testCase2 = 2;
        var testCase3 = 1;
        var testCase4 = 24;
        var solution = 14;
        test(testCase1, testCase2, testCase3, testCase4, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = 1;
        var testCase2 = 2;
        var testCase3 = 1;
        var testCase4 = 6;
        var solution = 3;
        test(testCase1, testCase2, testCase3, testCase4, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = 10;
        var testCase2 = 10;
        var testCase3 = 10;
        var testCase4 = 8;
        var solution = 0;
        test(testCase1, testCase2, testCase3, testCase4, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = 5;
        var testCase2 = 3;
        var testCase3 = 2;
        var testCase4 = 60;
        var solution = 24;
        test(testCase1, testCase2, testCase3, testCase4, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = 3;
        var testCase2 = 3;
        var testCase3 = 2;
        var testCase4 = 3;
        var solution = 1;
        test(testCase1, testCase2, testCase3, testCase4, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = 2;
        var testCase2 = 4;
        var testCase3 = 2;
        var testCase4 = 8;
        var solution = 2;
        test(testCase1, testCase2, testCase3, testCase4, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = 3;
        var testCase2 = 8;
        var testCase3 = 8;
        var testCase4 = 289;
        var solution = 36;
        test(testCase1, testCase2, testCase3, testCase4, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase1 = 5;
        var testCase2 = 5;
        var testCase3 = 9;
        var testCase4 = 329;
        var solution = 41;
        test(testCase1, testCase2, testCase3, testCase4, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase1 = 1;
        var testCase2 = 4;
        var testCase3 = 9;
        var testCase4 = 500;
        var solution = 61;
        test(testCase1, testCase2, testCase3, testCase4, solution);
    }//public void test12() {

    private void test(int testCase1, int testCase2, int testCase3, int testCase4, int solution){
        assertTimeout(Duration.ofSeconds(3),()->
                new PhoneCall().phoneCall(testCase1,testCase2,testCase3,testCase4));
        assertEquals(solution,new PhoneCall().phoneCall(testCase1,testCase2,testCase3,testCase4));
    }//private void test(int testCase1, int testCase2, int testCase3, int testCase4, int solution){
}//class PhoneCallTest {