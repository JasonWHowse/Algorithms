/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class IncreaseNumberRoundnessTest {

    @Test
    public void test1() {
        var testCase = 902200100;
        test(testCase, true);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = 11000;
        test(testCase, false);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = 99080;
        test(testCase, true);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = 1022220;
        test(testCase, true);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = 106611;
        test(testCase, true);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = 234230;
        test(testCase, false);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = 888;
        test(testCase, false);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = 100;
        test(testCase, false);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = 1000000000;
        test(testCase, false);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = 103456789;
        test(testCase, true);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = 1230;
        test(testCase, false);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = 1010;
        test(testCase, true);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase = 987654321;
        test(testCase, false);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase = 21210;
        test(testCase, false);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase = 1000000;
        test(testCase, false);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase = 250357;
        test(testCase, true);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase = 101;
        test(testCase, true);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase = 3847;
        test(testCase, false);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase = 7370;
        test(testCase, false);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase = 384090;
        test(testCase, true);
    }//public void test20() {

    private void test(int testCase,boolean solution) {
        assertTimeout(Duration.ofSeconds(3), () ->
                new IncreaseNumberRoundness().increaseNumberRoundness(testCase));
        if(solution) {
            assertTrue(new IncreaseNumberRoundness().increaseNumberRoundness(testCase));
        }else{//if(solution) {
            assertFalse(new IncreaseNumberRoundness().increaseNumberRoundness(testCase));
        }//else{
    }//private void test(){
}//class IncreaseNumberRoundnessTest {