/*
 * Authored by: Jason Wesley Howse
 */

/*
 * Authored by: Jason Wesley Howse
 */

/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._00_the_journey_begins;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static helper_functions.Helpers.getJsonObject;
import static org.junit.jupiter.api.Assertions.*;

class CheckPalindromeTest {
    private final static String path = "Test_Cases\\_0_intro\\_00_the_journey_begins\\CheckPalindrome\\";
    private String internedTestCase = "";
    private boolean internedSolution = false;

        @Test
    public void test1() {
        var testCase = "aabaa";
        test(testCase, true);
    }//public void test1() {

        @Test
    public void test2() {
        var testCase = "abac";
        test(testCase, false);
    }//public void test2() {

        @Test
    public void test3() {
        var testCase = "a";
        test(testCase, true);
    }//public void test3() {

        @Test
    public void test4() {
        var testCase = "az";
        test(testCase, false);
    }//public void test4() {

        @Test
    public void test5() {
        var testCase = "abacaba";
        test(testCase, true);
    }//public void test5() {

        @Test
    public void test6() {
        var testCase = "z";
        test(testCase, true);
    }//public void test6() {

        @Test
    public void test7() {
        var testCase = "aaabaaaa";
        test(testCase, false);
    }//public void test7() {

        @Test
    public void test8() {
        var testCase = "zzzazzazz";
        test(testCase, false);
    }//public void test8() {

        @Test
    public void test9() {
        var testCase = "hlbeeykoqqqqokyeeblh";
        test(testCase, true);
    }//public void test9() {

        @Test
    public void test10() {
        var testCase = "hlbeeykoqqqokyeeblh";
        test(testCase, true);
    }//public void test10() {

        @Test
    public void test11() {
        var testCase = "tnfodxxzqtivgnostongvitqzxxdofnt";
        test(testCase, false);
    }//public void test11() {

        @Test
    public void test12() {
        var testCase = "tnfodxxzqtivgnottongvitqzxxdofnt";
        test(testCase, true);
    }//public void test12() {

        @Test
    public void test13() {
        var testCase = "zdsptawefecbickktjoeeojtkkcibcefewatpsdz";
        test(testCase, true);
    }//public void test13() {

        @Test
    public void test14() {
        var testCase = "dshdyghryuwbdiqiuwjhdisayueyhdasdwhgdhhshaduw";
        test(testCase, false);
    }//public void test14() {

        @Test
    public void test15() {
        var testCase = "gvtygiiyztilqbukcrropxafkskfaxporrckubqlitzyiigytvg";
        test(testCase, true);
    }//public void test15() {

        @Test
    public void test16() {
        var testCase = "sxwghmtxvzpzmxejczaqufqmibscltvbzouuordogclpqywzgyfulfpzuzwvkhhfitozydwjjoacdxfspbakpnltunrrgzffzcjx";
        test(testCase, false);
    }//public void test16() {

        @Test
    public void test17() {
        var testCase = "sxwghmtxvzpzmxejczaqufqmibscltvbzouuordogclpqywzgyfulfpzuzwvkhhfitozydwjjoacdxfspbakpnltunrrgzffzcjxsxwghmtxvzpzmxejczaqufqmibscltvbzouuordogclpqywzgyfulfpzuzwvkhhfitozydwjjoacdxfspbakpnltunrrgzffzcjx";
        test(testCase, false);
    }//public void test17() {

        @Test
    public void test18() {
        var testCase = "ksswieohzzonjqosouzbnthoqfktlhokcblmleilmrbxvldvodyhuzknirkdlexrprgqbznnwypsjowrjyteosbhqflkvyfshhgzchhchyeeasbopifwhsusjvxsvlxtchrxzywptdljywcqykstepgzufvcxphtjsnxeveuqybmifdbpnwwruqgyzbltubkjzvxhpsuusphxvzjkbutlbzygqurwwnpbdfimbyquevexnsjthpxcvfuzgpetskyqcwyjldtpwyzxrhctxlvsxvjsushwfipobsaeeyhchhczghhsfyvklfqhbsoetyjrwojspywnnzbqgrprxeldkrinkzuhydovdlvxbrmlielmlbckohltkfqohtnbzuosoqjnozzhoeiwssk";
        test(testCase, true);
    }//public void test18() {

        @Test
    public void test19() {
        setTestCaseInfo("test-19.json");
        test(internedTestCase, internedSolution);
    }//public void test19() {

        @Test
    public void test20() {
        setTestCaseInfo("test-20.json");
        test(internedTestCase, internedSolution);
    }//public void test20() {
    
    private void test(String testCase, boolean solution) {
        assertTimeout(Duration.ofSeconds(3),()->new CheckPalindrome().checkPalindrome(testCase));
        if(solution) {
            assertTrue(new CheckPalindrome().checkPalindrome(testCase));
        }else {//if(solution){
            assertFalse(new CheckPalindrome().checkPalindrome(testCase));
        }//else{
    }//private void test(String testCase, boolean solution) {

    private void setTestCaseInfo(String fileName){
        JSONObject testInfo = getJsonObject(fileName, path);
        if(testInfo==null){
            fail("JObject for " + fileName + " returns null");
        }else{//if(testInfo==null){
            internedTestCase = (String) ((JSONObject) testInfo.get("input")).get("inputString");
            internedSolution = (boolean) testInfo.get("output");
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class CheckPalindromeTest {