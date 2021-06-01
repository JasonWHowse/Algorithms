/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._02_smooth_sailing;

import org.hamcrest.MatcherAssert;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static helper_functions.Helpers.getJsonObject;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.fail;

class SortByHeightTest {
    private final static String path = "Test_Cases\\_0_intro\\_02_smooth_sailing\\SortByHeight\\";
    private int[] internedTestCase = new int[0];
    private int[] internedSolution = new int[0];

    @Test
    public void test1() {
        int[] testCase = { -1, 150, 190, 170, -1, -1, 160, 180 };
        int[] solution = { -1, 150, 160, 170, -1, -1, 180, 190 };
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        int[] testCase = { -1, -1, -1, -1, -1 };
        int[] solution = { -1, -1, -1, -1, -1 };
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        int[] testCase = { -1 };
        int[] solution = { -1 };
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        int[] testCase = { 4, 2, 9, 11, 2, 16 };
        int[] solution = { 2, 2, 4, 9, 11, 16 };
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        int[] testCase = { 2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1 };
        int[] solution = { 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2 };
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        int[] testCase = { 23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 3 };
        int[] solution = { 1, 3, -1, 23, 43, -1, -1, 54, -1, -1, -1, 77 };
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        int[] testCase = { 1000 };
        int[] solution = { 1000 };
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        int[] testCase = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
        int[] solution = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        int[] testCase = { 964, 735, 365, 864, 764, 689, 163, 886, 63, 263, 333, 299, 451, 62, 983, 3, 340, 115, 626, 576, 598, 407, 189, 975, 874, 78, 650, 598, 198, 522, 857, 501, 48, 982, 758, 630, 313, 647, 358, 351, 288, 29, 386, 377, 736, 743, 899, 596, 263, 374 };
        int[] solution = { 3, 29, 48, 62, 63, 78, 115, 163, 189, 198, 263, 263, 288, 299, 313, 333, 340, 351, 358, 365, 374, 377, 386, 407, 451, 501, 522, 576, 596, 598, 598, 626, 630, 647, 650, 689, 735, 736, 743, 758, 764, 857, 864, 874, 886, 899, 964, 975, 982, 983 };
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        int[] testCase = { 44, 36, 35, 78, 70, 92, 60, 17, 67, -1, 91, -1, 69, 54, 88, 58, 9, 90, 9, 12, 66, 21, 79, 99, -1, 18, 46, 78, 38, 15, 26, 82, -1, 65, -1, 44, 51, 3, 37, 60, -1, 59, -1, -1, 78, 97, 9, 90, 24, 75, 45, 65, 24, 87, 44, 100, 94, 98, -1, 97, 72, 50, -1, 50, 39, 70, 91, 25, 66, 79, 69, 46, 20, 99, 57, 34, 42, 84, 8, -1, 95, 5, 59, 98, 97, 36, 89, 4, -1, 29, 9, 97, 55, 30, 16, -1, -1, -1, 10, -1 };
        int[] solution = { 3, 4, 5, 8, 9, 9, 9, 9, 10, -1, 12, -1, 15, 16, 17, 18, 20, 21, 24, 24, 25, 26, 29, 30, -1, 34, 35, 36, 36, 37, 38, 39, -1, 42, -1, 44, 44, 44, 45, 46, -1, 46, -1, -1, 50, 50, 51, 54, 55, 57, 58, 59, 59, 60, 60, 65, 65, 66, -1, 66, 67, 69, -1, 69, 70, 70, 72, 75, 78, 78, 78, 79, 79, 82, 84, 87, 88, 89, 90, -1, 90, 91, 91, 92, 94, 95, 97, 97, -1, 97, 97, 98, 98, 99, 99, -1, -1, -1, 100, -1 };
        test(testCase, solution);
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

    private void test(int[] testCase, int[] solution){
        assertTimeout(Duration.ofSeconds(3),()->
                (new SortByHeight().sortByHeight(testCase.clone())));
        MatcherAssert.assertThat(new SortByHeight().sortByHeight(testCase.clone()),is(solution.clone()));
    }//private void test(int[] testCase, int[] solution){

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
            var preInternedSolution = (JSONArray)testInfo.get("output");
            internedSolution = new int[preInternedSolution.size()];
            for(int i=0;i<internedSolution.length;i++){
                internedSolution[i]=((Long) preInternedSolution.get(i)).intValue();
            }//for(int i=0;i<internedSolution.length;i++){
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class SortByHeightTest {