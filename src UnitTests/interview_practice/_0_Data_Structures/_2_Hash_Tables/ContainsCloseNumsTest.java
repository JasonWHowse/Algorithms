/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._2_Hash_Tables;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static helper_functions.Helpers.getJsonObject;
import static org.junit.jupiter.api.Assertions.*;

class ContainsCloseNumsTest {
    private final static String path = "Test_Cases\\interview_practice\\_0_Data_Structures\\_2_Hash_Tables\\ContainsCloseNums\\";
    private int[] internedTestCase1 = new int[0];
    private int internedTestCase2 = 0;
    private boolean internedSolution = false;

    @Test
    public void test1() {
        int[] testCase1 = { 0, 1, 2, 3, 5, 2 };
        var testCase2 = 3;
        test(testCase1, testCase2, true);
    }//public void test1() {

    @Test
    public void test2() {
        int[] testCase1 = { 0, 1, 2, 3, 5, 2 };
        var testCase2 = 2;
        test(testCase1, testCase2, false);
    }//public void test2() {

    @Test
    public void test3() {
        int[] testCase1 = { };
        var testCase2 = 0;
        test(testCase1, testCase2, false);
    }//public void test3() {

    @Test
    public void test4() {
        int[] testCase1 = { 99, 99 };
        var testCase2 = 2;
        test(testCase1, testCase2, true);
    }//public void test4() {

    @Test
    public void test5() {
        int[] testCase1 = { 2, 2 };
        var testCase2 = 3;
        test(testCase1, testCase2, true);
    }//public void test5() {

    @Test
    public void test6() {
        int[] testCase1 = { 1, 2 };
        var testCase2 = 2;
        test(testCase1, testCase2, false);
    }//public void test6() {

    @Test
    public void test7() {
        int[] testCase1 = { 1, 2, 1 };
        var testCase2 = 2;
        test(testCase1, testCase2, true);
    }//public void test7() {

    @Test
    public void test8() {
        int[] testCase1 = { 1, 0, 1, 1 };
        var testCase2 = 1;
        test(testCase1, testCase2, true);
    }//public void test8() {

    @Test
    public void test9() {
        int[] testCase1 = { 1, 2, 1 };
        var testCase2 = 0;
        test(testCase1, testCase2, false);
    }//public void test9() {

    @Test
    public void test10() {
        int[] testCase1 = { 1, 2, 1 };
        var testCase2 = 1;
        test(testCase1, testCase2, false);
    }//public void test10() {

    @Test
    public void test11() {
        int[] testCase1 = { 1 };
        var testCase2 = 1;
        test(testCase1, testCase2, false);
    }//public void test11() {

    @Test
    public void test12() {
        int[] testCase1 = { -1, -1 };
        var testCase2 = 1;
        test(testCase1, testCase2, true);
    }//public void test12() {

    @Test
    public void test13() {
        int[] testCase1 = { 1, 2, 3, 1 };
        var testCase2 = 3;
        test(testCase1, testCase2, true);
    }//public void test13() {

    @Test
    public void test14() {
        int[] testCase1 = { 2147483647, -2147483648, 2147483647, -2147483648 };
        var testCase2 = 2;
        test(testCase1, testCase2, true);
    }//public void test14() {

    @Test
    public void test15() {
        int[] testCase1 = { 13, 23, 1, 2, 3 };
        var testCase2 = 5;
        test(testCase1, testCase2, false);
    }//public void test15() {

    @Test
    public void test16() {
        int[] testCase1 = { 1, 2, 3, 1, 2, 3 };
        var testCase2 = 2;
        test(testCase1, testCase2, false);
    }//public void test16() {

    @Test
    public void test17() {
        int[] testCase1 = { 1, 2, 3, 1, 1, 2, 3 };
        var testCase2 = 0;
        test(testCase1, testCase2, false);
    }//public void test17() {

    @Test
    public void test18() {
        int[] testCase1 = { 0, 1, 2, 3, 4, 5, 0 };
        var testCase2 = 5;
        test(testCase1, testCase2, false);
    }//public void test18() {

    @Test
    public void test19() {
        int[] testCase1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        var testCase2 = 15;
        test(testCase1, testCase2, false);
    }//public void test19() {

    @Test
    public void test20() {
        int[] testCase1 = { 4, 1, 2, 3, 1, 5 };
        var testCase2 = 3;
        test(testCase1, testCase2, true);
    }//public void test20() {

    @Test
    public void test21() {
        int[] testCase1 = { 0, 1, 2, 3, 4, 5, 0 };
        var testCase2 = 6;
        test(testCase1, testCase2, true);
    }//public void test21() {

    @Test
    public void test22() {
        int[] testCase1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9 };
        var testCase2 = 3;
        test(testCase1, testCase2, true);
    }//public void test22() {

    @Test
    public void test23() {
        int[] testCase1 = { 0, 1, 2, 3, 4, 0, 0, 7, 8, 9, 10, 11, 12, 0 };
        var testCase2 = 1;
        test(testCase1, testCase2, true);
    }//public void test23() {

    @Test
    public void test24() {
        setTestCaseInfo("test-24.json");
        test(internedTestCase1, internedTestCase2, internedSolution);;
    }//public void test24() {

    private void test(int[] testCase1, int testCase2, boolean solution){
        assertTimeout(Duration.ofSeconds(3), ()-> new ContainsCloseNums().containsCloseNums(testCase1.clone(),testCase2));
        if(solution){
            assertTrue(new ContainsCloseNums().containsCloseNums(testCase1,testCase2));
        }else{//if(solution){
            assertFalse(new ContainsCloseNums().containsCloseNums(testCase1,testCase2));
        }//}else
    }//void private test(String[] testCase1, String[] testCase2, boolean solution){

    private void setTestCaseInfo(String fileName){
        JSONObject testInfo = getJsonObject(fileName, path);
        if(testInfo==null){
            fail("JObject for " + fileName + " returns null");
        }else{//if(testInfo==null){
            var preInternedTestCase1 = (JSONArray) ((JSONObject) testInfo.get("input")).get("nums");
            internedTestCase1 = new int[preInternedTestCase1.size()];
            for(int i=0;i< internedTestCase1.length;i++){
                internedTestCase1[i] = ((Long) preInternedTestCase1.get(i)).intValue();
            }//for(int i=0;i< internedTestCase1.length;i++){
            internedTestCase2 = ((Long)((JSONObject)testInfo.get("input")).get("k")).intValue();
            internedSolution = (boolean) testInfo.get("output");
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class ContainsCloseNumsTest {