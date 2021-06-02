/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._09_eruption_of_light;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class BuildPalindromeTest {

    @Test
    public void test1() {
        var testCase = "abcdc";
        var solution = "abcdcba";
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = "ababab";
        var solution = "abababa";
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = "abba";
        var solution = "abba";
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = "abaa";
        var solution = "abaaba";
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = "aaaaba";
        var solution = "aaaabaaaa";
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = "abc";
        var solution = "abcba";
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = "kebab";
        var solution = "kebabek";
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = "abccba";
        var solution = "abccba";
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = "abcabc";
        var solution = "abcabcbacba";
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = "cbdbedffcg";
        var solution = "cbdbedffcgcffdebdbc";
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = "euotmn";
        var solution = "euotmnmtoue";
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = "jfd";
        var solution = "jfdfj";
        test(testCase, solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase = "cdfjkbe";
        var solution = "cdfjkbebkjfdc";
        test(testCase, solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase = "jqrdb";
        var solution = "jqrdbdrqj";
        test(testCase, solution);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase = "fej";
        var solution = "fejef";
        test(testCase, solution);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase = "edcahble";
        var solution = "edcahblelbhacde";
        test(testCase, solution);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase = "cfhbkabkjh";
        var solution = "cfhbkabkjhjkbakbhfc";
        test(testCase, solution);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase = "kewlncbzhe";
        var solution = "kewlncbzhehzbcnlwek";
        test(testCase, solution);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase = "jeahf";
        var solution = "jeahfhaej";
        test(testCase, solution);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase = "lmsrlimdrh";
        var solution = "lmsrlimdrhrdmilrsml";
        test(testCase, solution);
    }//public void test20() {

    @Test
    public void test21() {
        var testCase = "aaaaaaaaa";
        var solution = "aaaaaaaaa";
        test(testCase, solution);
    }//public void test21() {

    @Test
    public void test22() {
        var testCase = "aaaaaaba";
        var solution = "aaaaaabaaaaaa";
        test(testCase, solution);
    }//public void test22() {

    private void test(String testCase, String solution){
        assertTimeout(Duration.ofSeconds(3),()->
                new BuildPalindrome().buildPalindrome(testCase));
        assertEquals(solution,new BuildPalindrome().buildPalindrome(testCase));
    }//private void test(String testCase, String solution){
}//class BuildPalindromeTest {