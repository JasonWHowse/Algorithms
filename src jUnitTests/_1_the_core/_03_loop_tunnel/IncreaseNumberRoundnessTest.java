/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

import java.time.Duration;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.jupiter.api.Assertions.*;

import static helper_functions.Helpers.deepCopy;

class IncreaseNumberRoundnessTest {

    @Test
    void test1() {
        int testCase = 103456789;
        test(testCase, true);
    }//void test1() {

    @Test
    void test2() {
        int testCase = 11000;
        test(testCase, false);
    }//void test2() {

    @Test
    void test3() {
        int testCase = 99080;
        test(testCase, true);
    }//void test3() {

    @Test
    void test4() {
        int testCase = 1022220;
        test(testCase, true);
    }//void test4() {

    @Test
    void test5() {
        int testCase = 106611;
        test(testCase, true);
    }//void test5() {

    @Test
    void test6() {
        int testCase = 234230;
        test(testCase, false);
    }//void test6() {

    @Test
    void test7() {
        int testCase = 888;
        test(testCase, false);
    }//void test7() {

    @Test
    void test8() {
        int testCase = 100;
        test(testCase, false);
    }//void test8() {

    @Test
    void test9() {
        int testCase = 1000000000;
        test(testCase, false);
    }//void test9() {

    @Test
    void test10() {
        int testCase = 103456789;
        test(testCase, true);
    }//void test10() {

    private void test(int testCase,boolean solution) {
        assertTimeout(Duration.ofSeconds(3), () ->
                new IncreaseNumberRoundness().increaseNumberRoundness(testCase));
        if(solution) {
            assertTrue(new IncreaseNumberRoundness().increaseNumberRoundness(testCase));
        }else{
            assertFalse(new IncreaseNumberRoundness().increaseNumberRoundness(testCase));
        }
    }//private void test(){
}//class IncreaseNumberRoundnessTest {