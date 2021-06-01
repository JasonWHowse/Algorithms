/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._02_smooth_sailing;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class AllLongestStringsTest {

    @Test
    public void test1() {
        String[] testCase = { "aba", "aa", "ad", "vcd", "aba"};
        String[] solution = { "aba", "vcd", "aba"};
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        String[] testCase = { "aa" };
        String[] solution = { "aa" };
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        String[] testCase = {"abc", "eeee", "abcd", "dcd" };
        String[] solution = {"eeee", "abcd" };
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        String[] testCase = {"a", "abc", "cbd", "zzzzzz", "a", "abcdef", "asasa", "aaaaaa" };
        String[] solution = {"zzzzzz", "abcdef", "aaaaaa" };
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        String[] testCase = { "enyky", "benyky", "yely", "varennyky"};
        String[] solution = { "varennyky" };
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        String[] testCase = { "abacaba", "abacab", "abac", "xxxxxx"};
        String[] solution = { "abacaba" };
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        String[] testCase = { "young", "yooooooung", "hot", "or", "not", "come", "on", "fire", "water", "watermelon"};
        String[] solution = {"yooooooung", "watermelon" };
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        String[] testCase = {"onsfnib", "aokbcwthc", "jrfcw" };
        String[] solution = { "aokbcwthc" };
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        String[] testCase = { "lbgwyqkry" };
        String[] solution = { "lbgwyqkry" };
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        String[] testCase = { "i" };
        String[] solution = { "i" };
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        String[] testCase = { "khtalawph", "sbm", "gcyksgxay", "nsfllbkf", "v", "dgi", "comuoube", "fywmfrxgk", "empg" };
        String[] solution = { "khtalawph", "gcyksgxay", "fywmfrxgk" };
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        String[] testCase = { "rfty" };
        String[] solution = { "rfty" };
        test(testCase, solution);
    }//public void test12() {

    @Test
    public void test13() {
        String[] testCase = { "zcecgkpyb", "tdacd", "m", "wauqkcu", "vpblr", "arykm", "bzogu", "me", "lt" };
        String[] solution = { "zcecgkpyb" };
        test(testCase, solution);
    }//public void test13() {

    @Test
    public void test14() {
        String[] testCase = { "ikbxvrug", "hiccycgk", "kyuus" };
        String[] solution = { "ikbxvrug", "hiccycgk" };
        test(testCase, solution);
    }//public void test14() {

    @Test
    public void test15() {
        String[] testCase = { "xqa", "hhnyfayyj", "oxuqxqrx", "bbibat", "matafgnmrq", "mswvjnqusu" };
        String[] solution = { "matafgnmrq", "mswvjnqusu" };
        test(testCase, solution);
    }//public void test15() {

    @Test
    public void test16() {
        String[] testCase = { "hxumgl", "udyuekcfn", "zrmiiqwvg", "xmkkgt", "hkz" };
        String[] solution = { "udyuekcfn", "zrmiiqwvg" };
        test(testCase, solution);
    }//public void test16() {

    @Test
    public void test17() {
        String[] testCase = { "guux", "i", "uoopjf", "yhwmg", "qmc", "lixdzs", "t", "duzh" };
        String[] solution = { "uoopjf", "lixdzs" };
        test(testCase, solution);
    }//public void test17() {

    @Test
    public void test18() {
        String[] testCase = { "pjwipkwr", "cbjjkuos", "vao", "kpyutrrxa", "cmt", "ubg" };
        String[] solution = { "kpyutrrxa" };
        test(testCase, solution);
    }//public void test18() {

    @Test
    public void test19() {
        String[] testCase = { "ae", "uljczhlv", "t", "qrxie" };
        String[] solution = { "uljczhlv" };
        test(testCase, solution);
    }//public void test19() {

    @Test
    public void test20() {
        String[] testCase = { "y", "dumcwfqfu" };
        String[] solution = { "dumcwfqfu" };
        test(testCase, solution);
    }//public void test20() {
    
    private void test(String[] testCase, String[] solution){
        assertTimeout(Duration.ofSeconds(3),()->new AllLongestStrings().allLongestStrings(testCase.clone()));
        MatcherAssert.assertThat(new AllLongestStrings().allLongestStrings(testCase.clone()),is(solution.clone()));
    }//private void test(String[] testCase, String[] solution){
}//class AllLongestStringsTest {