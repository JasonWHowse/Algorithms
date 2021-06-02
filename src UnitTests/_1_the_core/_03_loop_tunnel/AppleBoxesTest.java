/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class AppleBoxesTest {

    @Test
    public void test1() {
        int testCase=5;
        int solution=-15;
        test(testCase,solution);
    }//void test1() {

    @Test
    public void test2() {
        int testCase=15;
        int solution=-120;
        test(testCase,solution);
    }//void test2() {

    @Test
    public void test3() {
        int testCase=36;
        int solution=666;
        test(testCase,solution);
    }//void test3() {

    @Test
    public void test4() {
        int testCase=1;
        int solution=-1;
        test(testCase,solution);
    }//void test4() {

    @Test
    public void test5() {
        int testCase=14;
        int solution=105;
        test(testCase,solution);
    }//void test5() {

    @Test
    public void test6() {
        int testCase=12;
        int solution=78;
        test(testCase,solution);
    }//void test6() {

    @Test
    public void test7() {
        int testCase=9;
        int solution=-45;
        test(testCase,solution);
    }//void test7() {

    @Test
    public void test8() {
        int testCase=40;
        int solution=820;
        test(testCase,solution);
    }//void test8() {

    @Test
    public void test9() {
        int testCase=37;
        int solution=-703;
        test(testCase,solution);
    }//void test9() {

    @Test
    public void test10() {
        var testCase = 2;
        var solution = 3;
        test(testCase,solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = 19;
        var solution = -190;
        test(testCase,solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = 25;
        var solution = -325;
        test(testCase,solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase = 11;
        var solution = -66;
        test(testCase,solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase = 32;
        var solution = 528;
        test(testCase,solution);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase = 22;
        var solution = 253;
        test(testCase,solution);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase = 28;
        var solution = 406;
        test(testCase,solution);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase = 27;
        var solution = -378;
        test(testCase,solution);
    }//public void test17() {

    private void test(int testCase,int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new AppleBoxes().appleBoxes(testCase));
        assertEquals(solution,new AppleBoxes().appleBoxes(testCase));
    }//private void test(int testCase,int solution){
}//class AppleBoxesTest {