/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountSumOfTwoRepresentations2Test {

    @Test
    void test1() {
        int testCase1=6;
        int testCase2=2;
        int testCase3=4;
        int solution=2;
        test(testCase1,testCase2,testCase3,solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase1=6;
        int testCase2=3;
        int testCase3=3;
        int solution=1;
        test(testCase1,testCase2,testCase3,solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase1=10;
        int testCase2=9;
        int testCase3=11;
        int solution=0;
        test(testCase1,testCase2,testCase3,solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase1=24;
        int testCase2=8;
        int testCase3=16;
        int solution=5;
        test(testCase1,testCase2,testCase3,solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase1=24;
        int testCase2=12;
        int testCase3=12;
        int solution=1;
        test(testCase1,testCase2,testCase3,solution);
    }//void test5() {

    @Test
    void test6() {
        int testCase1=93;
        int testCase2=24;
        int testCase3=58;
        int solution=12;
        test(testCase1,testCase2,testCase3,solution);
    }//void test6() {

    private void test(int testCase1,int testCase2,int testCase3,int solution){
        assertTimeout(Duration.ofSeconds(3),()->
                new CountSumOfTwoRepresentations2().countSumOfTwoRepresentations2(testCase1,testCase2,testCase3));
        assertEquals(solution,new CountSumOfTwoRepresentations2().countSumOfTwoRepresentations2(testCase1,testCase2,testCase3));
    }
}//class CountSumOfTwoRepresentations2Test {