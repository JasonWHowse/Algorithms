/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._06_book_market;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsCaseInsensitivePalindromeTest {

    @Test
    public void test1() {
        var testCase = "AaBaa";
        test(testCase, true);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = "abac";
        test(testCase, false);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = "aBACaba";
        test(testCase, true);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = "opOP";
        test(testCase, false);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = "ZZzzazZzz";
        test(testCase, true);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = "zzzzazzzz";
        test(testCase, true);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = "ZZzzabzZzz";
        test(testCase, false);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = "abcdcbA";
        test(testCase, true);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = "abracabra";
        test(testCase, false);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = "abcd";
        test(testCase, false);
    }//public void test10() {

    private void test(String testCase, boolean solution) {
        assertTimeout(Duration.ofSeconds(3),()-> new IsCaseInsensitivePalindrome().isCaseInsensitivePalindrome(testCase));
        if(solution){
            assertTrue(new IsCaseInsensitivePalindrome().isCaseInsensitivePalindrome(testCase));
        }else {//if(solution){
            assertFalse(new IsCaseInsensitivePalindrome().isCaseInsensitivePalindrome(testCase));
        }//else {
    }//private void test(String testCase, boolean solution) {
}//class IsCaseInsensitivePalindromeTest {