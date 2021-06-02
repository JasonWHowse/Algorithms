/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._01_at_the_crossroads;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class WillYouTest {

    @Test
    public void test1() {
        test(true, true, true, false);
    }//public void test1() {

    @Test
    public void test2() {
        test(true, false, true, true);
    }//public void test2() {

    @Test
    public void test3() {
        test(false, false, false, false);
    }//public void test3() {

    @Test
    public void test4() {
        test(false, false, true, true);
    }//public void test4() {

    @Test
    public void test5() {
        test(false, true, false, false);
    }//public void test5() {

    @Test
    public void test6() {
        test(false, true, true, true);
    }//public void test6() {

    @Test
    public void test7() {
        test(true, false, false, false);
    }//public void test7() {

    @Test
    public void test8() {
        test(true, true, false, true);
    }//public void test8() {

    private void test(boolean testCase1,boolean  testCase2,boolean  testCase3,boolean  solution){
        assertTimeout(Duration.ofSeconds(3),()->
                new WillYou().willYou(testCase1,testCase2,testCase3));
        if(solution) {
            assertTrue(new WillYou().willYou(testCase1, testCase2, testCase3));
        }else {//if(solution){
            assertFalse(new WillYou().willYou(testCase1, testCase2, testCase3));
        }//else{
    }//private void test(boolean testCase1,boolean  testCase2,boolean  testCase3,boolean  solution){
}//class WillYouTest {