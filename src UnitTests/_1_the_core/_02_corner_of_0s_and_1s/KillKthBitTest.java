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
    void test1() {
        int testCase1=37;
        int testCase2=3;
        int solution=33;
        test(testCase1,testCase2,solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase1=37;
        int testCase2=4;
        int solution=37;
        test(testCase1,testCase2,solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase1=37;
        int testCase2=2;
        int solution=37;
        test(testCase1,testCase2,solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase1=0;
        int testCase2=4;
        int solution=0;
        test(testCase1,testCase2,solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase1=2147483647;
        int testCase2=16;
        int solution=2147450879;
        test(testCase1,testCase2,solution);
    }//void test5() {

    @Test
    void test6() {
        int testCase1=374823748;
        int testCase2=13;
        int solution=374819652;
        test(testCase1,testCase2,solution);
    }//void test6() {

    @Test
    void test7() {
        int testCase1=2734827;
        int testCase2=4;
        int solution=2734819;
        test(testCase1,testCase2,solution);
    }//void test7() {

    @Test
    void test8() {
        int testCase1=1084197039;
        int testCase2=15;
        int solution=1084197039;
        test(testCase1,testCase2,solution);
    }//void test8() {

    @Test
    void test9() {
        int testCase1=1160825071;
        int testCase2=3;
        int solution=1160825067;
        test(testCase1,testCase2,solution);
    }//void test9() {

    @Test
    void test10() {
        int testCase1=2039063284;
        int testCase2=4;
        int solution=2039063284;
        test(testCase1,testCase2,solution);
    }//void test10() {

    private void test(int testCase1,int testCase2,int solution){
        assertTimeout(Duration.ofSeconds(3),()->
                new KillKthBit().killKthBit(testCase1,testCase2));
        assertEquals(solution,new KillKthBit().killKthBit(testCase1,testCase2));
    }//private void test(int testCase1,int testCase2,int solution){
}//class KillKthBitTest {