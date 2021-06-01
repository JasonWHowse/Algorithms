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

class BoxBlurTest {
    private final static String path = "Test_Cases\\_0_intro\\_04_island_of_knowledge\\BoxBlur\\";
    private int[][] internedTestCase = new int[0][];
    private int[][] internedSolution = new int[0][];

    @Test
    public void test1() {
        int[][] testCase = { new int[]{ 1, 1, 1 }, new int[]{ 1, 7, 1 }, new int[]{ 1, 1, 1 } };
        int[][] solution = { new int[]{ 1 } };
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        int[][] testCase = { new int[]{ 0, 18, 9 }, new int[]{ 27, 9, 0 }, new int[]{ 81, 63, 45 } };
        int[][] solution = { new int[]{ 28 } };
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        int[][] testCase = { new int[]{ 36, 0, 18, 9 }, new int[]{ 27, 54, 9, 0 }, new int[]{ 81, 63, 72, 45 } };
        int[][] solution = { new int[]{ 40, 30 } };
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        int[][] testCase = { new int[]{ 7, 4, 0, 1 }, new int[]{ 5, 6, 2, 2 }, new int[]{ 6, 10, 7, 8 }, new int[]{ 1, 4, 2, 0 } };
        int[][] solution = { new int[]{ 5, 4 }, new int[]{ 4, 4 } };
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        int[][] testCase = { new int[]{ 36, 0, 18, 9, 9, 45, 27 }, new int[]{ 27, 0, 54, 9, 0, 63, 90 }, new int[]{ 81, 63, 72, 45, 18, 27, 0 }, new int[]{ 0, 0, 9, 81, 27, 18, 45 }, new int[]{ 45, 45, 27, 27, 90, 81, 72 }, new int[]{ 45, 18, 9, 0, 9, 18, 45 }, new int[]{ 27, 81, 36, 63, 63, 72, 81 } };
        int[][] solution = { new int[]{ 39, 30, 26, 25, 31 }, new int[]{ 34, 37, 35, 32, 32 }, new int[]{ 38, 41, 44, 46, 42 }, new int[]{ 22, 24, 31, 39, 45 }, new int[]{ 37, 34, 36, 47, 59 } };
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        int[][] testCase = { new int[] { 36, 0, 18, 9, 9, 45, 27 }, new int[] { 27, 0, 254, 9, 0, 63, 90 }, new int[] { 81, 255, 72, 45, 18, 27, 0 }, new int[] { 0, 0, 9, 81, 27, 18, 45 }, new int[] { 45, 45, 227, 227, 90, 81, 72 }, new int[] { 45, 18, 9, 255, 9, 18, 45 }, new int[] { 27, 81, 36, 127, 255, 72, 81 } };
        int[][] solution = { new int[] { 82, 73, 48, 25, 31 }, new int[] { 77, 80, 57, 32, 32 }, new int[] { 81, 106, 88, 68, 42 }, new int[] { 44, 96, 103, 89, 45 }, new int[] { 59, 113, 137, 126, 80 } };
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        int[][] testCase = { new int[] { 8, 157, 172 }, new int[] { 17, 186, 189 }, new int[] { 73, 114, 197 }, new int[] { 132, 142, 76 } };
        int[][] solution = { new int[] { 123 }, new int[] { 125 } };
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        int[][] testCase = { new int[] { 208, 99, 59, 136, 161, 6, 219, 192, 85, 49 }, new int[] { 194, 105, 43, 254, 153, 225, 171, 197, 1, 154 }, new int[] { 221, 178, 119, 169, 134, 7, 76, 61, 99, 22 }, new int[] { 161, 254, 172, 12, 174, 200, 216, 107, 109, 109 } };
        int[][] solution = { new int[] { 136, 129, 136, 138, 128, 128, 122, 95 }, new int[] { 160, 145, 136, 147, 150, 140, 115, 95 } };
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        int[][] testCase = { new int[] { 172, 14, 85, 186, 28, 155, 122, 39, 44 }, new int[] { 71, 215, 117, 16, 56, 107, 126, 114, 214 }, new int[] { 83, 173, 135, 218, 151, 200, 133, 58, 8 }, new int[] { 249, 119, 57, 134, 255, 70, 82, 238, 37 }, new int[] { 199, 76, 110, 36, 121, 185, 187, 82, 92 }, new int[] { 106, 231, 120, 126, 41, 205, 203, 57, 185 }, new int[] { 246, 241, 81, 146, 148, 46, 16, 128, 233 } };
        int[][] solution = { new int[] { 118, 128, 110, 124, 119, 117, 95 }, new int[] { 135, 131, 126, 134, 131, 125, 112 }, new int[] { 133, 117, 135, 152, 153, 137, 101 }, new int[] { 140, 112, 111, 130, 149, 145, 129 }, new int[] { 156, 129, 103, 117, 128, 123, 131 } };
        test(testCase, solution);
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
        setTestCaseInfo("test-12.json");
        test(internedTestCase, internedSolution);
    }//public void test12() {

    private void test(int[][] testCase, int[][] solution){
        MatcherAssert.assertThat(new BoxBlur().boxBlur(deepClone(testCase)),is(solution));
        assertTimeout(Duration.ofSeconds(3),()->new BoxBlur().boxBlur(testCase));
    }//private void test(int[][] testCase, int[][] solution){

    private void setTestCaseInfo(String fileName){
        JSONObject testInfo = getJsonObject(fileName, path);
        if(testInfo==null){
            fail("JObject for " + fileName + " returns null");
        }else{//if(testInfo==null){
            var preInternedTestCase = (JSONArray) ((JSONObject) testInfo.get("input")).get("image");
            internedTestCase = new int[preInternedTestCase.size()][];
            for(int x=0;x< internedTestCase.length;x++){
                internedTestCase[x] = new int[((JSONArray) preInternedTestCase.get(x)).size()];
                for(int y=0;y<internedTestCase[x].length;y++){
                    internedTestCase[x][y]=((Long)((JSONArray) preInternedTestCase.get(x)).get(y)).intValue();
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
}//class BoxBlurTest {