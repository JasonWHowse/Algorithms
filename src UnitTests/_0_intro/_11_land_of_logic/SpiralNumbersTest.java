/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._11_land_of_logic;

import org.hamcrest.MatcherAssert;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static helper_functions.Helpers.getJsonObject;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.fail;

class SpiralNumbersTest {
    private final static String path = "Test_Cases\\_0_intro\\_11_land_of_logic\\SpiralNumbers\\";
    private int internedTestCase = 0;
    private int[][] internedSolution = new int[0][];

    @Test
    public void test1() {
        var testCase = 3;
        int[][] solution = {new int[]{ 1, 2, 3 }, new int[] { 8, 9, 4 }, new int[] { 7, 6, 5 } };
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = 5;
        int[][] solution = {new int[]{ 1, 2, 3, 4, 5 }, new int[] { 16, 17, 18, 19, 6 }, new int[] { 15, 24, 25, 20, 7 }, new int[] { 14, 23, 22, 21, 8 }, new int[] { 13, 12, 11, 10, 9 } };
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = 6;
        int[][] solution = {new int[]{ 1, 2, 3, 4, 5, 6 }, new int[] { 20, 21, 22, 23, 24, 7 }, new int[] { 19, 32, 33, 34, 25, 8 }, new int[] { 18, 31, 36, 35, 26, 9 }, new int[] { 17, 30, 29, 28, 27, 10 }, new int[] { 16, 15, 14, 13, 12, 11 } };
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = 7;
        int[][] solution = {new int[]{ 1, 2, 3, 4, 5, 6, 7 }, new int[] { 24, 25, 26, 27, 28, 29, 8 }, new int[] { 23, 40, 41, 42, 43, 30, 9 }, new int[] { 22, 39, 48, 49, 44, 31, 10 }, new int[] { 21, 38, 47, 46, 45, 32, 11 }, new int[] { 20, 37, 36, 35, 34, 33, 12 }, new int[] { 19, 18, 17, 16, 15, 14, 13 } };
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = 10;
        int[][] solution = {new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, new int[] { 36, 37, 38, 39, 40, 41, 42, 43, 44, 11 }, new int[] { 35, 64, 65, 66, 67, 68, 69, 70, 45, 12 }, new int[] { 34, 63, 84, 85, 86, 87, 88, 71, 46, 13 }, new int[] { 33, 62, 83, 96, 97, 98, 89, 72, 47, 14 }, new int[] { 32, 61, 82, 95, 100, 99, 90, 73, 48, 15 }, new int[] { 31, 60, 81, 94, 93, 92, 91, 74, 49, 16 }, new int[] { 30, 59, 80, 79, 78, 77, 76, 75, 50, 17 }, new int[] { 29, 58, 57, 56, 55, 54, 53, 52, 51, 18 }, new int[] { 28, 27, 26, 25, 24, 23, 22, 21, 20, 19 } };
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        setTestCaseInfo("test-6.json");
        test(internedTestCase, internedSolution);
    }//public void test6() {

    @Test
    public void test7() {
        setTestCaseInfo("test-7.json");
        test(internedTestCase, internedSolution);
    }//public void test7() {

    @Test
    public void test8() {
        setTestCaseInfo("test-8.json");
        test(internedTestCase, internedSolution);
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

    private void test(int testCase, int[][] solution){
        assertTimeout(Duration.ofSeconds(3),()-> new SpiralNumbers().spiralNumbers(testCase));
        MatcherAssert.assertThat(new SpiralNumbers().spiralNumbers(testCase),is(solution));
    }//private void test(int testCase, int[][] solution){

    private void setTestCaseInfo(String fileName){
        JSONObject testInfo = getJsonObject(fileName, path);
        if(testInfo==null){
            fail("JObject for " + fileName + " returns null");
        }else{//if(testInfo==null){
            internedTestCase = ((Long)((JSONObject) testInfo.get("input")).get("n")).intValue();
            var preInternedSolution = (JSONArray)testInfo.get("output");
            internedSolution = new int [preInternedSolution.size()][];
            for(int x=0;x<internedSolution.length;x++){
                internedSolution[x]=new int [((JSONArray)preInternedSolution.get(x)).size()];
                for(int y=0;y<internedSolution[x].length;y++){
                    internedSolution[x][y]=((Long)((JSONArray)preInternedSolution.get(x)).get(y)).intValue();
                }//for(int y=0;y<internedSolution[x].length;y++){
            }//for(int x=0;x<internedSolution.length;x++){
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class SpiralNumbersTest {