/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._05_labyrinth_of_nested_loops;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsPowerTest {

    @Test
    public void test1() {
        var testCase = 125;
        test(testCase, true);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = 72;
        test(testCase, false);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = 100;
        test(testCase, true);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = 11;
        test(testCase, false);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = 324;
        test(testCase, true);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = 256;
        test(testCase, true);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = 119;
        test(testCase, false);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = 400;
        test(testCase, true);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = 350;
        test(testCase, false);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = 361;
        test(testCase, true);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = 122;
        test(testCase, false);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = 290;
        test(testCase, false);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase = 1;
        test(testCase, true);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase = 2;
        test(testCase, false);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase = 343;
        test(testCase, true);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase = 144;
        test(testCase, true);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase = 289;
        test(testCase, true);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase = 225;
        test(testCase, true);
    }//public void test18() {

    private void test(int testCase,boolean solution) {
        assertTimeout(Duration.ofSeconds(3), () -> new IsPower().isPower(testCase));
        if(solution) {
            assertTrue(new IsPower().isPower(testCase));
        }else{//if(solution) {
            assertFalse(new IsPower().isPower(testCase));
        }//else{
    }//private void test(int testCase,boolean solution) {
}//class IsPowerTest {