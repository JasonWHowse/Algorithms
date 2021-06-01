/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._08_dark_wilderness;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class BishopAndPawnTest {

    @Test
    public void test1() {
        var testCase1 = "a1";
        var testCase2 = "c3";
        test(testCase1, testCase2, true);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = "h1";
        var testCase2 = "h3";
        test(testCase1, testCase2, false);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = "a5";
        var testCase2 = "c3";
        test(testCase1, testCase2, true);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = "g1";
        var testCase2 = "f3";
        test(testCase1, testCase2, false);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = "e7";
        var testCase2 = "d6";
        test(testCase1, testCase2, true);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = "e7";
        var testCase2 = "a3";
        test(testCase1, testCase2, true);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = "e3";
        var testCase2 = "a7";
        test(testCase1, testCase2, true);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = "a1";
        var testCase2 = "h8";
        test(testCase1, testCase2, true);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = "a1";
        var testCase2 = "h7";
        test(testCase1, testCase2, false);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = "h1";
        var testCase2 = "a8";
        test(testCase1, testCase2, true);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase1 = "h1";
        var testCase2 = "b8";
        test(testCase1, testCase2, false);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase1 = "b4";
        var testCase2 = "c3";
        test(testCase1, testCase2, true);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase1 = "b4";
        var testCase2 = "d7";
        test(testCase1, testCase2, false);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase1 = "b4";
        var testCase2 = "e7";
        test(testCase1, testCase2, true);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase1 = "d6";
        var testCase2 = "b4";
        test(testCase1, testCase2, true);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase1 = "d6";
        var testCase2 = "a2";
        test(testCase1, testCase2, false);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase1 = "a1";
        var testCase2 = "a8";
        test(testCase1, testCase2, false);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase1 = "e5";
        var testCase2 = "f6";
        test(testCase1, testCase2, true);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase1 = "f6";
        var testCase2 = "e8";
        test(testCase1, testCase2, false);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase1 = "g8";
        var testCase2 = "a2";
        test(testCase1, testCase2, true);
    }//public void test20() {

    private void test(String testCase1,String testCase2,boolean solution){
        assertTimeout(Duration.ofSeconds(3),()-> new BishopAndPawn().bishopAndPawn(testCase1,testCase2));
        if(solution) {
            assertTrue(new BishopAndPawn().bishopAndPawn(testCase1, testCase2));
        }else {//if(solution){
            assertFalse(new BishopAndPawn().bishopAndPawn(testCase1, testCase2));
        }//else{
    }//private void test(String testCase1,String testCase2,boolean solution){
}//class BishopAndPawnTest {