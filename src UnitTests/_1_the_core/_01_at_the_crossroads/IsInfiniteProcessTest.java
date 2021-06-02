/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._01_at_the_crossroads;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class IsInfiniteProcessTest {

    @Test
    public void test1() {
        var testCase1 = 2;
        var testCase2 = 6;
        test(testCase1, testCase2, false);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = 2;
        var testCase2 = 3;
        test(testCase1, testCase2, true);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = 2;
        var testCase2 = 10;
        test(testCase1, testCase2, false);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = 0;
        var testCase2 = 1;
        test(testCase1, testCase2, true);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = 3;
        var testCase2 = 1;
        test(testCase1, testCase2, true);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = 10;
        var testCase2 = 10;
        test(testCase1, testCase2, false);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = 5;
        var testCase2 = 10;
        test(testCase1, testCase2, true);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = 6;
        var testCase2 = 10;
        test(testCase1, testCase2, false);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = 10;
        var testCase2 = 0;
        test(testCase1, testCase2, true);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = 5;
        var testCase2 = 5;
        test(testCase1, testCase2, false);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase1 = 20;
        var testCase2 = 20;
        test(testCase1, testCase2, false);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase1 = 0;
        var testCase2 = 19;
        test(testCase1, testCase2, true);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase1 = 5;
        var testCase2 = 9;
        test(testCase1, testCase2, false);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase1 = 5;
        var testCase2 = 11;
        test(testCase1, testCase2, false);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase1 = 10;
        var testCase2 = 3;
        test(testCase1, testCase2, true);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase1 = 15;
        var testCase2 = 20;
        test(testCase1, testCase2, true);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase1 = 10;
        var testCase2 = 4;
        test(testCase1, testCase2, true);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase1 = 13;
        var testCase2 = 8;
        test(testCase1, testCase2, true);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase1 = 7;
        var testCase2 = 7;
        test(testCase1, testCase2, false);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase1 = 4;
        var testCase2 = 2;
        test(testCase1, testCase2, true);
    }//public void test20() {

    private void test(int testCase1, int testCase2, boolean solution){
        assertTimeout(Duration.ofSeconds(3),()-> new IsInfiniteProcess().isInfiniteProcess(testCase1,testCase2));
        if(solution){
            assertTrue(new IsInfiniteProcess().isInfiniteProcess(testCase1, testCase2));
        }else {//if(solution){
            assertFalse(new IsInfiniteProcess().isInfiniteProcess(testCase1, testCase2));
        }//else{
    }//private void test(int testCase1, int testCase2, boolean solution){
}//class IsInfiniteProcessTest {