/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._04_island_of_knowledge;

import org.hamcrest.MatcherAssert;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static helper_functions.Helpers.deepClone;
import static helper_functions.Helpers.getJsonObject;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.fail;

class MinesweeperTest {
    private final static String path = "Test_Cases\\_0_intro\\_04_island_of_knowledge\\Minesweeper\\";
    private boolean[][] internedTestCase = new boolean[0][];
    private int[][] internedSolution = new int[0][];

    @Test
    public void test1() {
        boolean[][] testCase = { new boolean[] { true, false, false }, new boolean[] { false, true, false }, new boolean[] { false, false, false } };
        int[][] solution = { new int[] { 1, 2, 1 }, new int[] { 2, 1, 1 }, new int[] { 1, 1, 1 } };
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        boolean[][] testCase = { new boolean[] { false, false, false }, new boolean[] { false, false, false } };
        int[][] solution = { new int[] { 0, 0, 0 }, new int[] { 0, 0, 0 } };
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        boolean[][] testCase = { new boolean[] { true, false, false, true }, new boolean[] { false, false, true, false }, new boolean[] { true, true, false, true } };
        int[][] solution = { new int[] { 0, 2, 2, 1 }, new int[] { 3, 4, 3, 3 }, new int[] { 1, 2, 3, 1 } };
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        boolean[][] testCase = { new boolean[] { true, true, true }, new boolean[] { true, true, true }, new boolean[] { true, true, true } };
        int[][] solution = { new int[] { 3, 5, 3 }, new int[] { 5, 8, 5 }, new int[] { 3, 5, 3 } };
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        boolean[][] testCase = { new boolean[] { false, true, true, false }, new boolean[] { true, true, false, true }, new boolean[] { false, false, true, false } };
        int[][] solution = { new int[] { 3, 3, 3, 2 }, new int[] { 2, 4, 5, 2 }, new int[] { 2, 3, 2, 2 } };
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        boolean[][] testCase = { new boolean[] { true, false }, new boolean[] { true, false }, new boolean[] { false, true }, new boolean[] { false, false }, new boolean[] { false, false } };
        int[][] solution = { new int[] { 1, 2 }, new int[] { 2, 3 }, new int[] { 2, 1 }, new int[] { 1, 1 }, new int[] { 0, 0 } };
        test(testCase, solution);
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

    @Test
    public void test11() {
        setTestCaseInfo("test-11.json");
        test(internedTestCase, internedSolution);
    }//public void test11() {

    private void test(boolean[][] testCase, int[][] solution){
        MatcherAssert.assertThat(new Minesweeper().minesweeper(deepClone(testCase)),is(solution));
        assertTimeout(Duration.ofSeconds(3),()-> new Minesweeper().minesweeper(testCase));
    }//private void test(boolean[][] testCase, int[][] solution){

    private void setTestCaseInfo(String fileName){
        JSONObject testInfo = getJsonObject(fileName, path);
        if(testInfo==null){
            fail("JObject for " + fileName + " returns null");
        }else{//if(testInfo==null){
            var preInternedTestCase = (JSONArray) ((JSONObject) testInfo.get("input")).get("matrix");
            internedTestCase = new boolean[preInternedTestCase.size()][];
            for(int x=0;x< internedTestCase.length;x++){
                internedTestCase[x] = new boolean[((JSONArray) preInternedTestCase.get(x)).size()];
                for(int y=0;y<internedTestCase[x].length;y++){
                    internedTestCase[x][y]=(Boolean)((JSONArray) preInternedTestCase.get(x)).get(y);
                }//for(int y=0;y<internedTestCase[x].length;x++){
            }//for(int x=0;x< internedTestCase.length;x++){
            var preInternedSolution=(JSONArray) testInfo.get("output");
            internedSolution = new int[preInternedSolution.size()][];
            for(int x=0;x<internedSolution.length;x++){
                internedSolution[x] = new int[((JSONArray) preInternedSolution.get(x)).size()];
                for(int y=0;y<internedSolution[x].length;y++){
                    internedSolution[x][y]=((Long)((JSONArray) preInternedSolution.get(x)).get(y)).intValue();
                }//for(int y=0;y<internedSolution[x].length;x++){
            }//for(int x=0;x<internedSolution.length;x++){
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class MinesweeperTest {