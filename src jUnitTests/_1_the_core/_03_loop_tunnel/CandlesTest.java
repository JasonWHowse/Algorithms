/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CandlesTest {

    @Test
    void test1() {
        int testCase1=5;
        int testCase2=2;
        int solution=9;
        test(testCase1,testCase2,solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase1=1;
        int testCase2=2;
        int solution=1;
        test(testCase1,testCase2,solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase1=3;
        int testCase2=3;
        int solution=4;
        test(testCase1,testCase2,solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase1=11;
        int testCase2=3;
        int solution=16;
        test(testCase1,testCase2,solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase1=15;
        int testCase2=5;
        int solution=18;
        test(testCase1,testCase2,solution);
    }//void test5() {

    @Test
    void test6() {
        int testCase1=14;
        int testCase2=3;
        int solution=20;
        test(testCase1,testCase2,solution);
    }//void test6() {

    @Test
    void test7() {
        int testCase1=12;
        int testCase2=2;
        int solution=23;
        test(testCase1,testCase2,solution);
    }//void test7() {

    @Test
    void test8() {
        int testCase1=6;
        int testCase2=4;
        int solution=7;
        test(testCase1,testCase2,solution);
    }//void test8() {

    @Test
    void test9() {
        int testCase1=13;
        int testCase2=5;
        int solution=16;
        test(testCase1,testCase2,solution);
    }//void test9() {

    @Test
    void test10() {
        int testCase1=2;
        int testCase2=3;
        int solution=2;
        test(testCase1,testCase2,solution);
    }//void test10() {

    @Test
    void customTest() {
        int testCase1=7;
        int testCase2=2;
        int solution=13;
        test(testCase1,testCase2,solution);
    }//void test10() {

    private void test(int testCase1,int testCase2,int solution){
        assertTimeout(Duration.ofSeconds(3),()->
                new Candles().candles(testCase1,testCase2));
        assertEquals(solution,new Candles().candles(testCase1,testCase2));
    }//private void test(int testCase1,int testCase2,int solution){
}//class CandlesTest {