/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._01_at_the_crossroads;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class ExtraNumberTest {

    @Test
    public void test1() {
        var testCase1 = 2;
        var testCase2 = 7;
        var testCase3 = 2;
        var solution = 7;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = 3;
        var testCase2 = 2;
        var testCase3 = 2;
        var solution = 3;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = 5;
        var testCase2 = 5;
        var testCase3 = 1;
        var solution = 1;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = 500000000;
        var testCase2 = 3;
        var testCase3 = 500000000;
        var solution = 3;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = 1;
        var testCase2 = 5;
        var testCase3 = 1;
        var solution = 5;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = 5;
        var testCase2 = 5;
        var testCase3 = 3;
        var solution = 3;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = 5;
        var testCase2 = 1;
        var testCase3 = 1;
        var solution = 5;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = 4000000;
        var testCase2 = 3000000;
        var testCase3 = 4000000;
        var solution = 3000000;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = 548442737;
        var testCase2 = 82231042;
        var testCase3 = 548442737;
        var solution = 82231042;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = 469992838;
        var testCase2 = 66019520;
        var testCase3 = 66019520;
        var solution = 469992838;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase1 = 488477175;
        var testCase2 = 282544737;
        var testCase3 = 282544737;
        var solution = 488477175;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase1 = 472753449;
        var testCase2 = 11275999;
        var testCase3 = 11275999;
        var solution = 472753449;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase1 = 628064928;
        var testCase2 = 997087;
        var testCase3 = 628064928;
        var solution = 997087;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase1 = 342266500;
        var testCase2 = 11980963;
        var testCase3 = 11980963;
        var solution = 342266500;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase1 = 809848561;
        var testCase2 = 56902274;
        var testCase3 = 809848561;
        var solution = 56902274;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase1 = 729722321;
        var testCase2 = 33389720;
        var testCase3 = 33389720;
        var solution = 729722321;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase1 = 1000000000;
        var testCase2 = 1;
        var testCase3 = 1000000000;
        var solution = 1;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase1 = 1000000000;
        var testCase2 = 1000000000;
        var testCase3 = 999999999;
        var solution = 999999999;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase1 = 299285277;
        var testCase2 = 367976496;
        var testCase3 = 367976496;
        var solution = 299285277;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase1 = 687508152;
        var testCase2 = 10679698;
        var testCase3 = 687508152;
        var solution = 10679698;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test20() {

    private void test(int testCase1,int  testCase2,int  testCase3,int  solution) {
        assertTimeout(Duration.ofSeconds(3),()-> new ExtraNumber().extraNumber(testCase1,testCase2,testCase3));
        assertEquals(solution,new ExtraNumber().extraNumber(testCase1,testCase2,testCase3));
    }//private void test(int testCase1,int  testCase2,int  testCase3,int  solution) {
}//class ExtraNumberTest {