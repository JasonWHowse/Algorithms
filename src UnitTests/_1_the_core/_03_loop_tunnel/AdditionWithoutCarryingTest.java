/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class AdditionWithoutCarryingTest {

    @Test
    public void test1() {
        int testCase1=456;
        int testCase2=1734;
        int solution=1180;
        test(testCase1,testCase2,solution);
    }//public void test1() {

    @Test
    public void test2() {
        int testCase1=99999;
        int testCase2=0;
        int solution=99999;
        test(testCase1,testCase2,solution);
    }//public void test2() {

    @Test
    public void test3() {
        int testCase1=999;
        int testCase2=999;
        int solution=888;
        test(testCase1,testCase2,solution);
    }//public void test3() {

    @Test
    public void test4() {
        int testCase1=0;
        int testCase2=0;
        int solution=0;
        test(testCase1,testCase2,solution);
    }//public void test4() {

    @Test
    public void test5() {
        int testCase1=54321;
        int testCase2=54321;
        int solution=8642;
        test(testCase1,testCase2,solution);
    }//public void test5() {

    @Test
    public void test6() {
        int testCase1=54321;
        int testCase2=56789;
        int solution=0;
        test(testCase1,testCase2,solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = 132;
        var testCase2 = 279;
        var solution = 301;
        test(testCase1,testCase2,solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = 21111;
        var testCase2 = 59999;
        var solution = 70000;
        test(testCase1,testCase2,solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = 999;
        var testCase2 = 1111;
        var solution = 1000;
        test(testCase1,testCase2,solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = 885;
        var testCase2 = 3675;
        var solution = 3450;
        test(testCase1,testCase2,solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase1 = 55150;
        var testCase2 = 47444;
        var solution = 92594;
        test(testCase1,testCase2,solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase1 = 35405;
        var testCase2 = 3622;
        var solution = 38027;
        test(testCase1,testCase2,solution);
    }//public void test12() {

    private void test(int testCase1,int testCase2,int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new AdditionWithoutCarrying().additionWithoutCarrying(testCase1,testCase2));
        assertEquals(solution,new AdditionWithoutCarrying().additionWithoutCarrying(testCase1,testCase2));
    }//private void test(int testCase1,int testCase2,int solution){
}//class AdditionWithoutCarryingTest {