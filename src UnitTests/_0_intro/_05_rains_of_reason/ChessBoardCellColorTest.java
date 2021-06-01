/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._05_rains_of_reason;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class ChessBoardCellColorTest {

    @Test
    public void test1() {
        var testCase1 = "A1";
        var testCase2 = "C3";
        test(testCase1,testCase2, true);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = "A1";
        var testCase2 = "H3";
        test(testCase1,testCase2, false);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = "A1";
        var testCase2 = "A2";
        test(testCase1,testCase2, false);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = "A1";
        var testCase2 = "B2";
        test(testCase1,testCase2, true);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = "B3";
        var testCase2 = "H8";
        test(testCase1,testCase2, false);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = "C3";
        var testCase2 = "B5";
        test(testCase1,testCase2, false);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = "G5";
        var testCase2 = "E7";
        test(testCase1,testCase2, true);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = "C8";
        var testCase2 = "H8";
        test(testCase1,testCase2, false);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = "D2";
        var testCase2 = "D2";
        test(testCase1,testCase2, true);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = "A2";
        var testCase2 = "A5";
        test(testCase1,testCase2, false);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase1 = "G5";
        var testCase2 = "G6";
        test(testCase1,testCase2, false);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase1 = "A1";
        var testCase2 = "B1";
        test(testCase1,testCase2, false);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase1 = "A1";
        var testCase2 = "D4";
        test(testCase1,testCase2, true);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase1 = "B2";
        var testCase2 = "B4";
        test(testCase1,testCase2, true);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase1 = "G6";
        var testCase2 = "H6";
        test(testCase1,testCase2, false);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase1 = "H1";
        var testCase2 = "H1";
        test(testCase1,testCase2, true);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase1 = "B2";
        var testCase2 = "H8";
        test(testCase1,testCase2, true);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase1 = "B2";
        var testCase2 = "B5";
        test(testCase1,testCase2, false);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase1 = "G5";
        var testCase2 = "H6";
        test(testCase1,testCase2, true);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase1 = "C8";
        var testCase2 = "H1";
        test(testCase1,testCase2, true);
    }//public void test20() {

    private void test(String testCase1, String testCase2, boolean solution){
        assertTimeout(Duration.ofSeconds(3),()->new ChessBoardCellColor().chessBoardCellColor(testCase1,testCase2));
        if(solution) {
            assertTrue(new ChessBoardCellColor().chessBoardCellColor(testCase1, testCase2));
        }else {//if(solution){
            assertFalse(new ChessBoardCellColor().chessBoardCellColor(testCase1, testCase2));
        }//else{
    }//private void test(String testCase1, String testCase2, boolean solution){
}//class ChessBoardCellColorTest {