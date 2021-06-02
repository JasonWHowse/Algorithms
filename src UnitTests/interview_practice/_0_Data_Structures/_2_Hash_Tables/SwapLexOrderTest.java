/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._2_Hash_Tables;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static helper_functions.Helpers.deepClone;
import static helper_functions.Helpers.getJsonObject;
import static org.junit.jupiter.api.Assertions.*;

class SwapLexOrderTest {
    private final static String path = "Test_Cases\\interview_practice\\_0_Data_Structures\\_2_Hash_Tables\\SwapLexOrder\\";
    private String internedTestCase1 = "";
    private int[][] internedTestCase2 = new int[0][];
    private String internedSolution = "";

    @Test
    public void test1() {
        var testCase1 = "abdc";
        int[][] testCase2 = {  new int[] { 1, 4 }, new int[] { 3, 4 } };
        var solution = "dbca";
        test(testCase1, testCase2, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = "abcdefgh";
        int[][] testCase2 = { new int[] { 1, 4 }, new int[] { 7, 8 } };
        var solution = "dbcaefhg";
        test(testCase1, testCase2, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = "acxrabdz";
        int[][] testCase2 = { new int[] { 1, 3 }, new int[] { 6, 8 }, new int[] { 3, 8 }, new int[] { 2, 7 } };
        var solution = "zdxrabca";
        test(testCase1, testCase2, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = "z";
        int[][] testCase2 = { };
        var solution = "z";
        test(testCase1, testCase2, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = "dznsxamwoj";
        int[][] testCase2 = { new int[] { 1, 2 }, new int[] { 3, 4 }, new int[] { 6, 5 }, new int[] { 8, 10 } };
        var solution = "zdsnxamwoj";
        test(testCase1, testCase2, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = "fixmfbhyutghwbyezkveyameoamqoi";
        int[][] testCase2 = { new int[] { 8, 5 }, new int[] { 10, 8 }, new int[] { 4, 18 }, new int[] { 20, 12 }, new int[] { 5, 2 }, new int[] { 17, 2 }, new int[] { 13, 25 }, new int[] { 29, 12 }, new int[] { 22, 2 }, new int[] { 17, 11 } };
        var solution = "fzxmybhtuigowbyefkvhyameoamqei";
        test(testCase1, testCase2, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = "lvvyfrbhgiyexoirhunnuejzhesylojwbyatfkrv";
        int[][] testCase2 = { new int[] { 13, 23 }, new int[] { 13, 28 }, new int[] { 15, 20 }, new int[] { 24, 29 }, new int[] { 6, 7 }, new int[] { 3, 4 }, new int[] { 21, 30 }, new int[] { 2, 13 }, new int[] { 12, 15 }, new int[] { 19, 23 }, new int[] { 10, 19 }, new int[] { 13, 14 }, new int[] { 6, 16 }, new int[] { 17, 25 }, new int[] { 6, 21 }, new int[] { 17, 26 }, new int[] { 5, 6 }, new int[] { 12, 24 } };
        var solution = "lyyvurrhgxyzvonohunlfejihesiebjwbyatfkrv";
        test(testCase1, testCase2, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = "a";
        int[][] testCase2 = { };
        var solution = "a";
        test(testCase1, testCase2, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = "hprjxqshxddnujbnkmugymkdpqkfvmwlrkpqstxx";
        int[][] testCase2 = { new int[] { 10, 25 }, new int[] { 1, 20 }, new int[] { 11, 24 }, new int[] { 6, 8 }, new int[] { 13, 28 }, new int[] { 1, 6 }, new int[] { 1, 3 }, new int[] { 21, 22 }, new int[] { 15, 26 }, new int[] { 13, 26 }, new int[] { 12, 20 }, new int[] { 27, 29 }, new int[] { 3, 4 }, new int[] { 4, 7 }, new int[] { 10, 18 }, new int[] { 10, 27 }, new int[] { 20, 26 }, new int[] { 20, 30 }, new int[] { 1, 24 } };
        var solution = "upsrxqqnxvmjhjhnkpugymkfmdkddbwlrkpqstxx";
        test(testCase1, testCase2, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = "qvspxdrbvwfuaahtzbpjudfyzccgzwynkgihwmdshvfnvyvfjc";
        int[][] testCase2 = { new int[] { 16, 26 }, new int[] { 2, 25 }, new int[] { 25, 27 }, new int[] { 19, 20 }, new int[] { 13, 20 }, new int[] { 4, 26 }, new int[] { 19, 27 }, new int[] { 18, 26 }, new int[] { 13, 23 }, new int[] { 1, 4 }, new int[] { 11, 19 }, new int[] { 16, 19 }, new int[] { 25, 28 }, new int[] { 19, 30 }, new int[] { 19, 25 }, new int[] { 1, 11 }, new int[] { 2, 20 }, new int[] { 10, 22 }, new int[] { 6, 19 }, new int[] { 7, 26 }, new int[] { 3, 30 }, new int[] { 15, 23 }, new int[] { 12, 26 }, new int[] { 1, 3 }, new int[] { 3, 12 }, new int[] { 3, 26 }, new int[] { 16, 30 }, new int[] { 2, 16 }, new int[] { 4, 13 } };
        var solution = "zwvuxtsbvwrqpapjzhgfudfydccbzaynkgihwmdshvfnvyvfjc";
        test(testCase1, testCase2, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase1 = "wdbmjpxusweoaxfybkikectlgvrxyracjxeghyctvvexpoxibunjvswhuwduirybhrfvcybuaisbujcngdiaotysffkxocnajloq";
        int[][] testCase2 = { new int[] { 60, 65 }, new int[] { 41, 93 }, new int[] { 41, 58 }, new int[] { 87, 92 }, new int[] { 34, 87 }, new int[] { 37, 56 }, new int[] { 35, 79 }, new int[] { 10, 54 }, new int[] { 35, 73 }, new int[] { 56, 57 }, new int[] { 5, 65 }, new int[] { 69, 91 }, new int[] { 6, 65 }, new int[] { 72, 95 }, new int[] { 8, 49 }, new int[] { 35, 62 }, new int[] { 26, 73 }, new int[] { 38, 58 }, new int[] { 14, 88 }, new int[] { 38, 41 }, new int[] { 25, 66 }, new int[] { 29, 47 }, new int[] { 4, 65 }, new int[] { 44, 59 }, new int[] { 40, 89 }, new int[] { 7, 86 }, new int[] { 26, 53 }, new int[] { 39, 81 }, new int[] { 6, 8 }, new int[] { 3, 68 }, new int[] { 88, 91 }, new int[] { 42, 71 }, new int[] { 8, 67 }, new int[] { 34, 89 }, new int[] { 5, 53 }, new int[] { 76, 79 }, new int[] { 16, 75 }, new int[] { 44, 70 }, new int[] { 37, 44 }, new int[] { 62, 94 }, new int[] { 66, 83 }, new int[] { 42, 70 }, new int[] { 3, 76 }, new int[] { 22, 37 }, new int[] { 27, 36 }, new int[] { 81, 96 }, new int[] { 11, 25 }, new int[] { 29, 58 }, new int[] { 33, 81 }, new int[] { 36, 44 } };
        var solution = "wdvvvuxuswroaxfybkikeytlirxxyracjypvuygxxrehpowimunjjswhgvdhifybegccscbubisbujbncdeaotxktfcfoanajloq";
        test(testCase1, testCase2, solution);
    }//public void test11() {

    @Test
    public void test12() {
        setTestCaseInfo("test-12.json");
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test12() {

    @Test
    public void test13() {
        setTestCaseInfo("test-13.json");
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test13() {

    @Test
    public void test14() {
        setTestCaseInfo("test-14.json");
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test14() {

    @Test
    public void test15() {
        setTestCaseInfo("test-15.json");
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test15() {

    private void test(String testCase1,int[][] testCase2,String solution){
        assertEquals(new SwapLexOrder().swapLexOrder(testCase1,deepClone(testCase2)),solution);
        assertTimeout(Duration.ofSeconds(3),()-> new SwapLexOrder().swapLexOrder(testCase1,testCase2));
    }//private void test(String testCase1,int[][] testCase2,String solution){

    private void setTestCaseInfo(String fileName){
        JSONObject testInfo = getJsonObject(fileName, path);
        if(testInfo==null){
            fail("JObject for " + fileName + " returns null");
        }else{//if(testInfo==null){
            internedTestCase1 = (String) ((JSONObject) testInfo.get("input")).get("str");
            var preInternedTestCase2 = (JSONArray) ((JSONObject) testInfo.get("input")).get("pairs");
            internedTestCase2=new int[preInternedTestCase2.size()][];
            for(int x=0;x<internedTestCase2.length;x++){
                internedTestCase2[x]=new int[((JSONArray)preInternedTestCase2.get(x)).size()];
                for(int y=0;y<internedTestCase2[x].length;y++){
                    internedTestCase2[x][y]=((Long)((JSONArray)preInternedTestCase2.get(x)).get(y)).intValue();
                }//for(int y=0;y<internedTestCase2[x].length;y++){
            }//for(int x=0;x<internedTestCase2.length;x++){
            internedSolution = (String) testInfo.get("output");
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class SwapLexOrderTest {