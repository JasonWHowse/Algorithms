/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._06_boom_market;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsTandemRepeatTest {

    @Test
    public void test1() {
        var testCase = "tandemtandem";
        test(testCase, true);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = "qqq";
        test(testCase, false);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = "2w2ww";
        test(testCase, false);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = "hophey";
        test(testCase, false);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = "CodeSignalCodeSignal";
        test(testCase, true);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = "interestinterest";
        test(testCase, true);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = "aa";
        test(testCase, true);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = "ab";
        test(testCase, false);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = "stringString";
        test(testCase, false);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = "truetruetrue";
        test(testCase, false);
    }//public void test10() {

    private void test(String testCase, boolean solution){
        assertTimeout(Duration.ofSeconds(3),()-> new IsTandemRepeat().isTandemRepeat(testCase));
        if(solution){
            assertTrue(new IsTandemRepeat().isTandemRepeat(testCase));
        }else{//if(solution){
            assertFalse(new IsTandemRepeat().isTandemRepeat(testCase));
        }//else{
    }//private void test(String testCase, boolean solution){
}//class IsTandemRepeatTest {