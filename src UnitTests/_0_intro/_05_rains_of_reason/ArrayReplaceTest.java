/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._05_rains_of_reason;

import org.hamcrest.MatcherAssert;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static helper_functions.Helpers.getJsonObject;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.fail;

class ArrayReplaceTest {
    private final static String path = "Test_Cases\\_0_intro\\_05_rains_of_reason\\ArrayReplace\\";
    private int[] internedTestCase1 = new int[0];
    private int internedTestCase2 = 0;
    private int internedTestCase3 = 0;
    private int[] internedSolution = new int[0];

    @Test
    public void test1() {
        int[] testCase1 = { 1, 2, 1 };
        var testCase2 = 1;
        var testCase3 = 3;
        int[] solution = { 3, 2, 3 };
        test(testCase1,testCase2,testCase3, solution);
    }//public void test1() {

    @Test
    public void test2() {
        int[] testCase1 = { 1, 2, 3, 4, 5 };
        var testCase2 = 3;
        var testCase3 = 0;
        int[] solution = { 1, 2, 0, 4, 5 };
        test(testCase1,testCase2,testCase3, solution);
    }//public void test2() {

    @Test
    public void test3() {
        int[] testCase1 = { 1, 1, 1 };
        var testCase2 = 1;
        var testCase3 = 10;
        int[] solution = { 10, 10, 10 };
        test(testCase1,testCase2,testCase3, solution);
    }//public void test3() {

    @Test
    public void test4() {
        int[] testCase1 = { 1, 2, 1, 2, 1 };
        var testCase2 = 2;
        var testCase3 = 1;
        int[] solution = { 1, 1, 1, 1, 1 };
        test(testCase1,testCase2,testCase3, solution);
    }//public void test4() {

    @Test
    public void test5() {
        int[] testCase1 = { 1, 2, 1, 2, 1 };
        var testCase2 = 2;
        var testCase3 = 2;
        int[] solution = { 1, 2, 1, 2, 1 };
        test(testCase1,testCase2,testCase3, solution);
    }//public void test5() {

    @Test
    public void test6() {
        int[] testCase1 = { 3, 1 };
        var testCase2 = 3;
        var testCase3 = 9;
        int[] solution = { 9, 1 };
        test(testCase1,testCase2,testCase3, solution);
    }//public void test6() {

    @Test
    public void test7() {
        int[] testCase1 = { 10, 10 };
        var testCase2 = 0;
        var testCase3 = 9;
        int[] solution = { 10, 10 };
        test(testCase1,testCase2,testCase3, solution);
    }//public void test7() {

    @Test
    public void test8() {
        int[] testCase1 = { 2, 1 };
        var testCase2 = 3;
        var testCase3 = 9;
        int[] solution = { 2, 1 };
        test(testCase1, testCase2, testCase3, solution);
    }//public void test8() {

    @Test
    public void test9() {
        int[] testCase1 = { 5, 4, 7, 2, 2, 4, 4, 7, 0, 10 };
        var testCase2 = 4;
        var testCase3 = 7;
        int[] solution = { 5, 7, 7, 2, 2, 7, 7, 7, 0, 10 };
        test(testCase1, testCase2, testCase3, solution);
    }//public void test9() {

    @Test
    public void test10() {
        int[] testCase1 = { 4, 5, 4 };
        var testCase2 = 4;
        var testCase3 = 10;
        int[] solution = { 10, 5, 10 };
        test(testCase1, testCase2, testCase3, solution);
    }//public void test10() {

    @Test
    public void test11() {
        int[] testCase1 = { 0, 0 };
        var testCase2 = 0;
        var testCase3 = 4;
        int[] solution = { 4, 4 };
        test(testCase1, testCase2, testCase3, solution);
    }//public void test11() {

    @Test
    public void test12() {
        int[] testCase1 = { 5, 1, 3, 10, 3 };
        var testCase2 = 3;
        var testCase3 = 9;
        int[] solution = { 5, 1, 9, 10, 9 };
        test(testCase1, testCase2, testCase3, solution);
    }//public void test12() {

    @Test
    public void test13() {
        int[] testCase1 = {  };
        var testCase2 = 1000000000;
        var testCase3 = 1000000000;
        int[] solution = {  };
        test(testCase1, testCase2, testCase3, solution);
    }//public void test13() {

    @Test
    public void test14() {
        setTestCaseInfo("test-14.json");
        test(internedTestCase1, internedTestCase2, internedTestCase3, internedSolution);
    }//public void test14() {

    @Test
    public void test15() {
        setTestCaseInfo("test-15.json");
        test(internedTestCase1, internedTestCase2, internedTestCase3, internedSolution);
    }//public void test5() {

    @Test
    public void test16() {
        setTestCaseInfo("test-16.json");
        test(internedTestCase1, internedTestCase2, internedTestCase3, internedSolution);
    }//public void test16() {

    private void test(int[] testCase1, int testCase2, int testCase3, int[] solution){
        assertTimeout(Duration.ofSeconds(3),()->new ArrayReplace().arrayReplace(testCase1.clone(),testCase2,testCase3));
        MatcherAssert.assertThat(new ArrayReplace().arrayReplace(testCase1,testCase2,testCase3),is(solution));
    }//private void test(int[] testCase1, int testCase2, int testCase3, int[] solution){

    private void setTestCaseInfo(String fileName){
        JSONObject testInfo = getJsonObject(fileName, path);
        if(testInfo==null){
            fail("JObject for " + fileName + " returns null");
        }else{//if(testInfo==null){
            var preInternedTestCase1 = (JSONArray) ((JSONObject) testInfo.get("input")).get("inputArray");
            internedTestCase1 = new int[preInternedTestCase1.size()];
            for(int i=0;i< internedTestCase1.length;i++){
                internedTestCase1[i] = ((Long) preInternedTestCase1.get(i)).intValue();
            }//for(int i=0;i< internedTestCase1.length;i++){
            internedTestCase2 = ((Long)((JSONObject)testInfo.get("input")).get("elemToReplace")).intValue();
            internedTestCase3 = ((Long)((JSONObject)testInfo.get("input")).get("substitutionElem")).intValue();
            var preInternedSolution =(JSONArray)testInfo.get("output");
            internedSolution = new int[preInternedSolution.size()];
            for(int i=0;i<internedSolution.length;i++){
                internedSolution[i] = ((Long) preInternedSolution.get(i)).intValue();
            }//for(int i=0;i<internedSolution.length;i++){
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class ArrayReplaceTest {