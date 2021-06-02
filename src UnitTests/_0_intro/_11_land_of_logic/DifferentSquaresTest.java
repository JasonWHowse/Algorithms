/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._11_land_of_logic;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static helper_functions.Helpers.deepClone;
import static helper_functions.Helpers.getJsonObject;
import static org.junit.jupiter.api.Assertions.*;

class DifferentSquaresTest {
    private final static String path = "Test_Cases\\_0_intro\\_11_land_of_logic\\DifferentSquares\\";
    private int[][] internedTestCase = new int[0][];
    private int internedSolution = 0;

    @Test
    public void test1() {
        int[][] testCase = { new int[] { 1, 2, 1 }, new int[] { 2, 2, 2 }, new int[] { 2, 2, 2 }, new int[] { 1, 2, 3 }, new int[] { 2, 2, 1 } };
        var solution = 6;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        int[][] testCase = { new int[] { 9, 9, 9, 9, 9 }, new int[] { 9, 9, 9, 9, 9 }, new int[] { 9, 9, 9, 9, 9 }, new int[] { 9, 9, 9, 9, 9 }, new int[] { 9, 9, 9, 9, 9 }, new int[] { 9, 9, 9, 9, 9 } };
        var solution = 1;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        int[][] testCase = { new int[] { 3 } };
        var solution = 0;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        int[][] testCase = { new int[] { 3, 4, 5, 6, 7, 8, 9 } };
        var solution = 0;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        int[][] testCase = { new int[] { 3 }, new int[] { 4 }, new int[] { 5 }, new int[] { 6 }, new int[] { 7 } };
        var solution = 0;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        int[][] testCase = { new int[] { 2, 5, 3, 4, 3, 1, 3, 2 }, new int[] { 4, 5, 4, 1, 2, 4, 1, 3 }, new int[] { 1, 1, 2, 1, 4, 1, 1, 5 }, new int[] { 1, 3, 4, 2, 3, 4, 2, 4 }, new int[] { 1, 5, 5, 2, 1, 3, 1, 1 }, new int[] { 1, 2, 3, 3, 5, 1, 2, 4 }, new int[] { 3, 1, 4, 4, 4, 1, 5, 5 }, new int[] { 5, 1, 3, 3, 1, 5, 3, 5 }, new int[] { 5, 4, 4, 3, 5, 4, 4, 4 } };
        var solution = 54;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        int[][] testCase = { new int[] { 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 9, 9, 9, 2, 3, 9 } };
        var solution = 0;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        int[][] testCase = { new int[] { 1 }, new int[] { 2 }, new int[] { 1 }, new int[] { 2 }, new int[] { 1 }, new int[] { 2 }, new int[] { 1 }, new int[] { 2 }, new int[] { 1 }, new int[] { 2 }, new int[] { 1 }, new int[] { 2 }, new int[] { 3 }, new int[] { 9 } };
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
        setTestCaseInfo("test-11.json");
        test(internedTestCase, internedSolution);
    }//public void test11() {

    @Test
    public void test12() {
        int[][] testCase = { new int[] { 9 }};
        var solution = 0;
        test(testCase, solution);
    }//public void test12() {

    @Test
    public void test13() {
        int[][] testCase = { new int[] { 1, 9, 2, 8, 3, 7, 4, 6, 5 } };
        var solution = 0;
        test(testCase, solution);
    }//public void test13() {
    
    private void test(int[][] testCase, int solution){
        assertEquals(new DifferentSquares().differentSquares(deepClone(testCase)),solution);
        assertTimeout(Duration.ofSeconds(3),()->new DifferentSquares().differentSquares(testCase));
    }//private void test(int[][] testCase, int solution){

    private void setTestCaseInfo(String fileName){
        JSONObject testInfo = getJsonObject(fileName, path);
        if(testInfo==null){
            fail("JObject for " + fileName + " returns null");
        }else{//if(testInfo==null){
            var preInternedTestCase = (JSONArray) ((JSONObject) testInfo.get("input")).get("matrix");
            internedTestCase = new int[preInternedTestCase.size()][];
            for(int x=0;x< internedTestCase.length;x++){
                internedTestCase[x] = new int[((JSONArray)preInternedTestCase.get(x)).size()];
                for(int y=0;y<internedTestCase[x].length;y++){
                    internedTestCase[x][y] = ((Long)((JSONArray)preInternedTestCase.get(x)).get(y)).intValue();
                }//for(int y=0;y<internedTestCase[x].length;y++){
            }//for(int x=0;x< internedTestCase.length;x++){
            internedSolution = ((Long) testInfo.get("output")).intValue();
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class DifferentSquaresTest {