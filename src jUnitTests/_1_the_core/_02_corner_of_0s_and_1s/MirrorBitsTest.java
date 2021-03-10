/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._02_corner_of_0s_and_1s;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MirrorBitsTest {

    @Test
    void test1() {
        int testCase=97;
        int solution=67;
        test(testCase,solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase=8;
        int solution=1;
        test(testCase,solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase=123;
        int solution=111;
        test(testCase,solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase=86782;
        int solution=65173;
        test(testCase,solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase=5;
        int solution=5;
        test(testCase,solution);
    }//void test5() {

    private void test(int testCase,int solution){
        assertTimeout(Duration.ofSeconds(3),()->
                new MirrorBits().mirrorBits(testCase));
        assertEquals(solution,new MirrorBits().mirrorBits(testCase));
    }//private void test(int testCase,int solution){
}//class MirrorBitsTest {