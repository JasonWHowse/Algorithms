/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class CandlesTest {

    @Test
    public void test1() {
        int testCase1=5;
        int testCase2=2;
        int solution=9;
        test(testCase1,testCase2,solution);
    }//public void test1() {

    @Test
    public void test2() {
        int testCase1=1;
        int testCase2=2;
        int solution=1;
        test(testCase1,testCase2,solution);
    }//public void test2() {

    @Test
    public void test3() {
        int testCase1=3;
        int testCase2=3;
        int solution=4;
        test(testCase1,testCase2,solution);
    }//public void test3() {

    @Test
    public void test4() {
        int testCase1=11;
        int testCase2=3;
        int solution=16;
        test(testCase1,testCase2,solution);
    }//public void test4() {

    @Test
    public void test5() {
        int testCase1=15;
        int testCase2=5;
        int solution=18;
        test(testCase1,testCase2,solution);
    }//public void test5() {

    @Test
    public void test6() {
        int testCase1=14;
        int testCase2=3;
        int solution=20;
        test(testCase1,testCase2,solution);
    }//public void test6() {

    @Test
    public void test7() {
        int testCase1=12;
        int testCase2=2;
        int solution=23;
        test(testCase1,testCase2,solution);
    }//public void test7() {

    @Test
    public void test8() {
        int testCase1=6;
        int testCase2=4;
        int solution=7;
        test(testCase1,testCase2,solution);
    }//public void test8() {

    @Test
    public void test9() {
        int testCase1=13;
        int testCase2=5;
        int solution=16;
        test(testCase1,testCase2,solution);
    }//public void test9() {

    @Test
    public void test10() {
        int testCase1=2;
        int testCase2=3;
        int solution=2;
        test(testCase1,testCase2,solution);
    }//public void test10() {

    private void test(int testCase1,int testCase2,int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new Candles().candles(testCase1,testCase2));
        assertEquals(solution,new Candles().candles(testCase1,testCase2));
    }//private void test(int testCase1,int testCase2,int solution){
}//class CandlesTest {