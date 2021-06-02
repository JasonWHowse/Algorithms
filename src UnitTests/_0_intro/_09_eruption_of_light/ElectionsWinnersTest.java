/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._09_eruption_of_light;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static helper_functions.Helpers.getJsonObject;
import static org.junit.jupiter.api.Assertions.*;

class ElectionsWinnersTest {
    private final static String path = "Test_Cases\\_0_intro\\_09_eruption_of_light\\ElectionsWinners\\";
    private int[] internedTestCase1 = new int[0];
    private int internedTestCase2 = 0;
    private int internedSolution = 0;

    @Test
    public void test1() {
        int[] testCase1 = { 2, 3, 5, 2 };
        var testCase2 = 3;
        var solution = 2;
        test(testCase1,testCase2, solution);
    }//public void test1() {

    @Test
    public void test2() {
        int[] testCase1 = { 1, 3, 3, 1, 1 };
        var testCase2 = 0;
        var solution = 0;
        test(testCase1,testCase2, solution);
    }//public void test2() {

    @Test
    public void test3() {
        int[] testCase1 = { 5, 1, 3, 4, 1 };
        var testCase2 = 0;
        var solution = 1;
        test(testCase1,testCase2, solution);
    }//public void test3() {

    @Test
    public void test4() {
        int[] testCase1 = { 1, 1, 1, 1 };
        var testCase2 = 1;
        var solution = 4;
        test(testCase1,testCase2, solution);
    }//public void test4() {

    @Test
    public void test5() {
        int[] testCase1 = { 1, 1, 1, 1 };
        var testCase2 = 0;
        var solution = 0;
        test(testCase1,testCase2, solution);
    }//public void test5() {

    @Test
    public void test6() {
        int[] testCase1 = { 3, 1, 1, 3, 1 };
        var testCase2 = 2;
        var solution = 2;
        test(testCase1, testCase2, solution);
    }//public void test6() {

    @Test
    public void test7() {
        int[] testCase1 = { 1, 2, 3, 4, 5 };
        var testCase2 = 4;
        var solution = 4;
        test(testCase1, testCase2, solution);
    }//public void test7() {

    @Test
    public void test8() {
        int[] testCase1 = { 5, 1, 2, 3, 3 };
        var testCase2 = 0;
        var solution = 1;
        test(testCase1, testCase2, solution);
    }//public void test8() {

    @Test
    public void test9() {
        int[] testCase1 = { 5, 7, 7, 5, 5 };
        var testCase2 = 0;
        var solution = 0;
        test(testCase1, testCase2, solution);
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

    private void test(int[] testCase1, int testCase2, int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new ElectionsWinners().electionsWinners(testCase1.clone(),testCase2));
        assertEquals(new ElectionsWinners().electionsWinners(testCase1,testCase2),solution);
    }//private void test(int[] testCase1, int testCase2, int solution){

    private void setTestCaseInfo(String fileName){
        JSONObject testInfo = getJsonObject(fileName, path);
        if(testInfo==null){
            fail("JObject for " + fileName + " returns null");
        }else{//if(testInfo==null){
            var preInternedTestCase1 = (JSONArray) ((JSONObject) testInfo.get("input")).get("votes");
            internedTestCase1 = new int[preInternedTestCase1.size()];
            for(int i=0;i< internedTestCase1.length;i++){
                internedTestCase1[i] = ((Long) preInternedTestCase1.get(i)).intValue();
            }//for(int i=0;i< internedTestCase1.length;i++){
            internedTestCase2 = ((Long)((JSONObject) testInfo.get("input")).get("k")).intValue();
            internedSolution = ((Long) testInfo.get("output")).intValue();
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class ElectionsWinnersTest {