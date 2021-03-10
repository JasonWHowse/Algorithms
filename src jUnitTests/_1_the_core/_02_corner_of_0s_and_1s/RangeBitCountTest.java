/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._02_corner_of_0s_and_1s;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RangeBitCountTest {

    @Test
    void test1() {
        int testCase1=2;
        int testCase2=7;
        int solution=11;
        test(testCase1,testCase2,solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase1=0;
        int testCase2=1;
        int solution=1;
        test(testCase1,testCase2,solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase1=1;
        int testCase2=10;
        int solution=17;
        test(testCase1,testCase2,solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase1=8;
        int testCase2=9;
        int solution=3;
        test(testCase1,testCase2,solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase1=9;
        int testCase2=10;
        int solution=4;
        test(testCase1,testCase2,solution);
    }//void test5() {

    private void test(int testCase1,int testCase2,int solution){
        assertTimeout(Duration.ofSeconds(3),()->
                new RangeBitCount().rangeBitCount(testCase1,testCase2));
        assertEquals(solution,new RangeBitCount().rangeBitCount(testCase1,testCase2));
    }//private void test(int testCase1,int testCase2,int solution){
}//class RangeBitCountTest {