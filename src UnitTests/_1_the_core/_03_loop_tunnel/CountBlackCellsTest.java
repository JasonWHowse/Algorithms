/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class CountBlackCellsTest {

    @Test
    public void test1() {
        int testCase1=3;
        int testCase2=4;
        int solution=6;
        test(testCase1,testCase2,solution);
    }//void test1() {

    @Test
    public void test2() {
        int testCase1=3;
        int testCase2=3;
        int solution=7;
        test(testCase1,testCase2,solution);
    }//void test2() {

    @Test
    public void test3() {
        int testCase1=2;
        int testCase2=5;
        int solution=6;
        test(testCase1,testCase2,solution);
    }//void test3() {

    @Test
    public void test4() {
        int testCase1=1;
        int testCase2=1;
        int solution=1;
        test(testCase1,testCase2,solution);
    }//void test4() {

    @Test
    public void test5() {
        int testCase1=1;
        int testCase2=2;
        int solution=2;
        test(testCase1,testCase2,solution);
    }//void test5() {

    @Test
    public void test6() {
        int testCase1=1;
        int testCase2=3;
        int solution=3;
        test(testCase1,testCase2,solution);
    }//void test6() {

    @Test
    public void test7() {
        int testCase1=1;
        int testCase2=239;
        int solution=239;
        test(testCase1,testCase2,solution);
    }//void test7() {

    @Test
    public void test8() {
        int testCase1=33;
        int testCase2=44;
        int solution=86;
        test(testCase1,testCase2,solution);
    }//void test8() {

    @Test
    public void test9() {
        int testCase1=16;
        int testCase2=8;
        int solution=30;
        test(testCase1,testCase2,solution);
    }//void test9() {

    @Test
    public void test10() {
        int testCase1=66666;
        int testCase2=88888;
        int solution=177774;
        test(testCase1,testCase2,solution);
    }//void test10() {

    @Test
    public void test11() {
        var testCase1 = 100000;
        var testCase2 = 1;
        var solution = 100000;
        test(testCase1,testCase2,solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase1 = 239;
        var testCase2 = 1;
        var solution = 239;
        test(testCase1,testCase2,solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase1 = 1;
        var testCase2 = 100000;
        var solution = 100000;
        test(testCase1,testCase2,solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase1 = 2;
        var testCase2 = 100;
        var solution = 102;
        test(testCase1,testCase2,solution);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase1 = 239;
        var testCase2 = 749;
        var solution = 987;
        test(testCase1,testCase2,solution);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase1 = 100;
        var testCase2 = 2;
        var solution = 102;
        test(testCase1,testCase2,solution);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase1 = 2;
        var testCase2 = 1;
        var solution = 2;
        test(testCase1,testCase2,solution);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase1 = 100000;
        var testCase2 = 100000;
        var solution = 299998;
        test(testCase1,testCase2,solution);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase1 = 14;
        var testCase2 = 234;
        var solution = 248;
        test(testCase1,testCase2,solution);
    }//public void test19() {

    private void test(int testCase1,int testCase2,int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new CountBlackCells().countBlackCells(testCase1,testCase2));
        assertEquals(solution,new CountBlackCells().countBlackCells(testCase1,testCase2));
    }//private void test(int testCase1,int testCase2,int solution){
}//class CountBlackCellsTest {