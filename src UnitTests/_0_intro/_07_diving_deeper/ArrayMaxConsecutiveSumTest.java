/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._07_diving_deeper;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import java.time.Duration;

import static helper_functions.Helpers.getJsonObject;
import static org.junit.jupiter.api.Assertions.*;

class ArrayMaxConsecutiveSumTest {
    private final static String path = "Test_Cases\\_0_intro\\_07_diving_deeper\\ArrayMaxConsecutiveSum\\";
    private int[] internedTestCase1 = new int[0];
    private int internedTestCase2 = 0;
    private int internedSolution = 0;

    @Test
    public void test1() {
        int[] testCase1 = { 2, 3, 5, 1, 6 };
        var testCase2 = 2;
        var solution = 8;
        test(testCase1, testCase2, solution);
    }//public void test1() {

    @Test
    public void test2() {
        int[] testCase1 = { 2, 4, 10, 1 };
        var testCase2 = 2;
        var solution = 14;
        test(testCase1, testCase2, solution);
    }//public void test2() {

    @Test
    public void test3() {
        int[] testCase1 = { 1, 3, 2, 4 };
        var testCase2 = 3;
        var solution = 9;
        test(testCase1, testCase2, solution);
    }//public void test3() {

    @Test
    public void test4() {
        int[] testCase1 = { 3, 2, 1, 1 };
        var testCase2 = 1;
        var solution = 3;
        test(testCase1, testCase2, solution);
    }//public void test4() {

    @Test
    public void test5() {
        int[] testCase1 = { 1, 3, 4, 2, 4, 2, 4 };
        var testCase2 = 4;
        var solution = 13;
        test(testCase1, testCase2, solution);
    }//public void test5() {

    @Test
    public void test6() {
        setTestCaseInfo("test-6.json");
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test6() {

    @Test
    public void test7() {
        int[] testCase1 = { 963, 741, 22, 851, 399, 382, 190, 247, 494, 452, 891, 532, 795, 920, 465, 831, 344, 391, 582, 897, 763, 951, 735, 806, 320, 702, 200, 59, 870, 345, 695, 321, 817, 83, 416, 36, 914, 335, 117, 985, 690, 303, 875, 556, 292, 309, 496, 791, 509, 360, 235, 784, 607, 341 };
        var testCase2 = 23;
        var solution = 14232;
        test(testCase1, testCase2, solution);
    }//public void test7() {

    @Test
    public void test8() {
        setTestCaseInfo("test-8.json");
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test8() {

    @Test
    public void test9() {
        setTestCaseInfo("test-9.json");
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test9() {

    @Test
    public void test10() {
        setTestCaseInfo("test-10.json");
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test10() {

    @Test
    public void test11() {
        setTestCaseInfo("test-11.json");
        test(internedTestCase1, internedTestCase2, internedSolution);
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
        int[] testCase1 = { 711, 501, 190, 345, 295, 865, 601, 735, 968, 496, 447, 938, 986, 56, 644, 307, 338, 904, 295, 617, 694, 313, 90, 38, 506, 485 };
        var testCase2 = 13;
        var solution = 8285;
        test(testCase1, testCase2, solution);
    }//public void test15() {

    @Test
    public void test16() {
        setTestCaseInfo("test-16.json");
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test16() {

    @Test
    public void test17() {
        int[] testCase1 = { 505, 340, 565, 301, 650, 110, 330, 46, 425, 525, 942, 840, 628, 174, 445, 316, 425, 155, 524, 470, 795, 781, 44, 84, 277, 301, 226, 504, 750, 23, 480, 565, 219, 977, 910, 550, 524, 658, 735, 73, 26, 659, 13 };
        var testCase2 = 3;
        var solution = 2437;
        test(testCase1, testCase2, solution);
    }//public void test17() {

    @Test
    public void test18() {
        setTestCaseInfo("test-18.json");
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test18() {

    @Test
    public void test19() {
        setTestCaseInfo("test-19.json");
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test19() {

    @Test
    public void test20() {
        setTestCaseInfo("test-20.json");
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test20() {

    private void test(int[] testCase1, int testCase2, int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new ArrayMaxConsecutiveSum().arrayMaxConsecutiveSum(testCase1.clone(),testCase2));
        assertEquals(solution,new ArrayMaxConsecutiveSum().arrayMaxConsecutiveSum(testCase1,testCase2));
    }//private void test(int[] testCase1, int testCase2, int solution){

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
            internedTestCase2 = ((Long)((JSONObject)testInfo.get("input")).get("k")).intValue();
            internedSolution = ((Long)testInfo.get("output")).intValue();
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class ArrayMaxConsecutiveSumTest {