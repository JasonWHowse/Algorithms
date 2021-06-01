/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._06_through_the_fog;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static helper_functions.Helpers.getJsonObject;
import static org.junit.jupiter.api.Assertions.*;

class AbsoluteValuesSumMinimizationTest {
    private final static String path = "Test_Cases\\_0_intro\\_06_through_the_fog\\AbsoluteValuesSumMinimization\\";
    private int[] internedTestCase = new int[0];
    private int internedSolution = 0;

    @Test
    public void test1() {
        int[] testCase = { 2, 4, 7 };
        var solution = 4;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        int[] testCase = { 2, 3 };
        var solution = 2;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        int[] testCase = { 1, 1, 3, 4 };
        var solution = 1;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        int[] testCase = { 23 };
        var solution = 23;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        int[] testCase = { -10, -10, -10, -10, -10, -9, -9, -9, -8, -8, -7, -6, -5, -4, -3, -2, -1, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
        var solution = 15;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        int[] testCase = { -4, -1 };
        var solution = -4;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        int[] testCase = { 0, 7, 9 };
        var solution = 7;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        int[] testCase = { -1000000, -10000, -10000, -1000, -100, -10, -1, 0, 1, 10, 100, 1000, 10000, 100000, 1000000 };
        var solution = 0;
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        setTestCaseInfo("test-9.json");
        test(internedTestCase, internedSolution);
    }//public void test9() {

    @Test
    public void test10() {
        setTestCaseInfo("test-10.json");
        test(internedTestCase, internedSolution);
    }//public void test10() {

    @Test
    public void test11() {
        int[] testCase = { -10 };
        var solution = -10;
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        int[] testCase = { -1000000, -12, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1000000 };
        var solution = -1;
        test(testCase, solution);
    }//public void test12() {

    @Test
    public void test13() {
        int[] testCase = { -2, -1, 0, 1, 2 };
        var solution = 0;
        test(testCase, solution);
    }//public void test13() {

    @Test
    public void test14() {
        setTestCaseInfo("test-14.json");
        test(internedTestCase, internedSolution);
    }//public void test14() {

    @Test
    public void test15() {
        setTestCaseInfo("test-15.json");
        test(internedTestCase, internedSolution);
    }//public void test15() {

    @Test
    public void test16() {
        setTestCaseInfo("test-16.json");
        test(internedTestCase, internedSolution);
    }//public void test16() {

    @Test
    public void test17() {
        int[] testCase = { -1000000, 1000000 };
        var solution = -1000000;
        test(testCase, solution);
    }//public void test17() {

    @Test
    public void test18() {
        int[] testCase = { 1000000 };
        var solution = 1000000;
        test(testCase, solution);
    }//public void test18() {

    @Test
    public void test19() {
        int[] testCase = { 999999, 1000000 };
        var solution = 999999;
        test(testCase, solution);
    }//public void test19() {

    private void test(int[] testCase, int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new AbsoluteValuesSumMinimization().absoluteValuesSumMinimization(testCase.clone()));
        assertEquals(solution, new AbsoluteValuesSumMinimization().absoluteValuesSumMinimization(testCase));
    }//private void test(int[] testCase, int solution){

    private void setTestCaseInfo(String fileName){
        JSONObject testInfo = getJsonObject(fileName, path);
        if(testInfo==null){
            fail("JObject for " + fileName + " returns null");
        }else{//if(testInfo==null){
            var preInternedTestCase = (JSONArray) ((JSONObject) testInfo.get("input")).get("a");
            internedTestCase = new int[preInternedTestCase.size()];
            for(int i=0;i< internedTestCase.length;i++){
                internedTestCase[i] = ((Long) preInternedTestCase.get(i)).intValue();
            }//for(int i=0;i< internedTestCase.length;i++){
            internedSolution = ((Long) testInfo.get("output")).intValue();
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class AbsoluteValuesSumMinimizationTest {