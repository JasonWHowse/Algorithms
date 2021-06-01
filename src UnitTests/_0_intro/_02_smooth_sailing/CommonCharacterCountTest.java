/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._02_smooth_sailing;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class CommonCharacterCountTest {

    @Test
    public void test1() {
        var testCase1 = "aabcc";
        var testCase2 = "adcaa";
        var solution = 3;
        test(testCase1, testCase2, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = "zzzz";
        var testCase2 = "zzzzzzz";
        var solution = 4;
        test(testCase1, testCase2, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = "abca";
        var testCase2 = "xyzbac";
        var solution = 3;
        test(testCase1, testCase2, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = "a";
        var testCase2 = "b";
        var solution = 0;
        test(testCase1, testCase2, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = "a";
        var testCase2 = "aaa";
        var solution = 1;
        test(testCase1, testCase2, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = "abcdefghxyzttw";
        var testCase2 = "hgfedcbaabcwwt";
        var solution = 10;
        test(testCase1, testCase2, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = "zza";
        var testCase2 = "zzz";
        var solution = 2;
        test(testCase1, testCase2, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = "abaca";
        var testCase2 = "abaac";
        var solution = 5;
        test(testCase1, testCase2, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = "aba";
        var testCase2 = "bb";
        var solution = 1;
        test(testCase1, testCase2, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = "bb";
        var testCase2 = "bbb";
        var solution = 2;
        test(testCase1, testCase2, solution);
    }//public void test10() {
    
    private void test(String testCase1, String testCase2, int solution){
        assertTimeout(Duration.ofSeconds(3),()->new CommonCharacterCount().commonCharacterCount(testCase1,testCase2));
        assertEquals(new CommonCharacterCount().commonCharacterCount(testCase1,testCase2),solution);
    }//private void test(String testCase1, String testCase2, int solution){
}//class CommonCharacterCountTest {