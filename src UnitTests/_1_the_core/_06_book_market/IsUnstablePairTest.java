/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._06_book_market;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsUnstablePairTest {

    @Test
    public void test1() {
        var testCase1 = "aa";
        var testCase2 = "AAB";
        test(testCase1,testCase2, true);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = "A";
        var testCase2 = "z";
        test(testCase1,testCase2, false);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = "yyyyyy";
        var testCase2 = "Azzzzzzzzz";
        test(testCase1,testCase2, false);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = "mehOu";
        var testCase2 = "mehau";
        test(testCase1,testCase2, true);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = "aaZ";
        var testCase2 = "AAzz";
        test(testCase1,testCase2, true);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = "fdsAs";
        var testCase2 = "dzdw";
        test(testCase1,testCase2, false);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = "aaad";
        var testCase2 = "aaAdd";
        test(testCase1,testCase2, true);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = "zzzzzAa123";
        var testCase2 = "zzzzza";
        test(testCase1,testCase2, true);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = "123za";
        var testCase2 = "123Z";
        test(testCase1,testCase2, false);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = "qwerTyu123";
        var testCase2 = "qwertyu";
        test(testCase1,testCase2, true);
    }//public void test10() {

    private void test(String testCase1, String testCase2, boolean solution){
        assertTimeout(Duration.ofSeconds(3),()->new IsUnstablePair().isUnstablePair(testCase1, testCase2));
        if(solution){
            assertTrue(new IsUnstablePair().isUnstablePair(testCase1, testCase2));
        }else{//if(solution){
            assertFalse(new IsUnstablePair().isUnstablePair(testCase1, testCase2));
        }//else{
    }//private void test(String testCase1, String testCase2, boolean solution){
}//class IsUnstablePairTest {