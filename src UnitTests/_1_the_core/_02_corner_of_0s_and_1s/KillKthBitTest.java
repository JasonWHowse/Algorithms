/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._02_corner_of_0s_and_1s;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class KillKthBitTest {

    @Test
    public void test1() {
        var testCase1 = 37;
        var testCase2 = 3;
        var solution = 33;
        test(testCase1, testCase2, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = 37;
        var testCase2 = 4;
        var solution = 37;
        test(testCase1, testCase2, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = 37;
        var testCase2 = 2;
        var solution = 37;
        test(testCase1, testCase2, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = 0;
        var testCase2 = 4;
        var solution = 0;
        test(testCase1, testCase2, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = 2147483647;
        var testCase2 = 16;
        var solution = 2147450879;
        test(testCase1, testCase2, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = 374823748;
        var testCase2 = 13;
        var solution = 374819652;
        test(testCase1, testCase2, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = 2734827;
        var testCase2 = 4;
        var solution = 2734819;
        test(testCase1, testCase2, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = 1084197039;
        var testCase2 = 15;
        var solution = 1084197039;
        test(testCase1, testCase2, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = 1160825071;
        var testCase2 = 3;
        var solution = 1160825067;
        test(testCase1, testCase2, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = 2039063284;
        var testCase2 = 4;
        var solution = 2039063284;
        test(testCase1, testCase2, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase1 = 1981123330;
        var testCase2 = 7;
        var solution = 1981123330;
        test(testCase1, testCase2, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase1 = 427439517;
        var testCase2 = 24;
        var solution = 427439517;
        test(testCase1, testCase2, solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase1 = 870677799;
        var testCase2 = 11;
        var solution = 870676775;
        test(testCase1, testCase2, solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase1 = 1435387516;
        var testCase2 = 16;
        var solution = 1435387516;
        test(testCase1, testCase2, solution);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase1 = 319033977;
        var testCase2 = 3;
        var solution = 319033977;
        test(testCase1, testCase2, solution);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase1 = 773454791;
        var testCase2 = 13;
        var solution = 773450695;
        test(testCase1, testCase2, solution);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase1 = 2003132370;
        var testCase2 = 25;
        var solution = 1986355154;
        test(testCase1, testCase2, solution);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase1 = 2738;
        var testCase2 = 30;
        var solution = 2738;
        test(testCase1, testCase2, solution);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase1 = 2147483647;
        var testCase2 = 31;
        var solution = 1073741823;
        test(testCase1, testCase2, solution);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase1 = 5;
        var testCase2 = 2;
        var solution = 5;
        test(testCase1, testCase2, solution);
    }//public void test20() {

    private void test(int testCase1,int testCase2,int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new KillKthBit().killKthBit(testCase1,testCase2));
        assertEquals(solution,new KillKthBit().killKthBit(testCase1,testCase2));
    }//private void test(int testCase1,int testCase2,int solution){
}//class KillKthBitTest {