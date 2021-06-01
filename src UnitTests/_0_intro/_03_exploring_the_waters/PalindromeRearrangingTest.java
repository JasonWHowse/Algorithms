/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._03_exploring_the_waters;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeRearrangingTest {

    @Test
    public void test1() {
        var testCase = "aabb";
        test(testCase, true);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc";
        test(testCase, false);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = "abbcabb";
        test(testCase, true);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = "zyyzzzzz";
        test(testCase, true);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = "z";
        test(testCase, true);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = "zaa";
        test(testCase, true);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = "abca";
        test(testCase, false);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = "abcad";
        test(testCase, false);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbccccaaaaaaaaaaaaa";
        test(testCase, false);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = "abdhuierf";
        test(testCase, false);
    }//public void test10() {

    private void test(String testCase, boolean solution){
        assertTimeout(Duration.ofSeconds(3),()->new PalindromeRearranging().palindromeRearranging(testCase));
        if(solution) {
            assertTrue(new PalindromeRearranging().palindromeRearranging(testCase));
        }else {//if(solution){
            assertFalse(new PalindromeRearranging().palindromeRearranging(testCase));
        }//else {
    }//private void test(String testCase, boolean solution){
}//class PalindromeRearrangingTest {