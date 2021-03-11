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

class AppleBoxesTest {

    @Test
    void test1() {
        int testCase=5;
        int solution=-15;
        test(testCase,solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase=15;
        int solution=-120;
        test(testCase,solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase=36;
        int solution=666;
        test(testCase,solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase=1;
        int solution=-1;
        test(testCase,solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase=14;
        int solution=105;
        test(testCase,solution);
    }//void test5() {

    @Test
    void test6() {
        int testCase=12;
        int solution=78;
        test(testCase,solution);
    }//void test6() {

    @Test
    void test7() {
        int testCase=9;
        int solution=-45;
        test(testCase,solution);
    }//void test7() {

    @Test
    void test8() {
        int testCase=40;
        int solution=820;
        test(testCase,solution);
    }//void test8() {

    @Test
    void test9() {
        int testCase=37;
        int solution=-703;
        test(testCase,solution);
    }//void test9() {

    private void test(int testCase,int solution){
        assertTimeout(Duration.ofSeconds(3),()->
                new AppleBoxes().appleBoxes(testCase));
        assertEquals(solution,new AppleBoxes().appleBoxes(testCase));
    }//private void test(int testCase,int solution){
}//class AppleBoxesTest {