/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._04_island_of_knowledge;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static helper_functions.Helpers.getJsonObject;
import static org.junit.jupiter.api.Assertions.*;

class AvoidObstaclesTest {
    private final static String path = "Test_Cases\\_0_intro\\_04_island_of_knowledge\\AvoidObstacles\\";
    int[] internedTestCase = new int[0];
    int internedSolution = 0;

    @Test
    public void test1() {
        int[] testCase = { 5, 3, 6, 7, 9 };
        var solution = 4;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        int[] testCase = { 2, 3 };
        var solution = 4;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        int[] testCase = { 1, 4, 10, 6, 2};
        var solution = 7;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        int[] testCase = { 1000, 999 };
        var solution = 6;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        int[] testCase = { 19, 32, 11, 23 };
        var solution = 3;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        int[] testCase = { 5, 8, 9, 13, 14 };
        var solution = 6;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        int[] testCase = { 10, 12 };
        var solution = 7;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        int[] testCase = { 460, 397, 91, 542, 326, 929, 592, 721, 547, 155, 975, 307, 426, 811, 303, 124, 270, 913, 899, 583, 67, 591, 925, 445, 916, 905, 585, 493, 606, 625, 443, 954, 309, 743, 75, 993, 683, 962, 92, 746, 733, 145, 845, 60, 560, 181, 934, 421, 964, 278 };
        var solution = 19;
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        int[] testCase = { 513, 15, 18, 20, 23, 539, 39, 42, 44, 53, 55, 575, 779, 68, 583, 584, 591, 598, 89, 90, 93, 607, 617, 106, 619, 109, 626, 627, 127, 642, 136, 139, 144, 366, 672, 674, 165, 679, 174, 176, 179, 694, 715, 802, 210, 724, 728, 744, 233, 722, 241, 639, 766, 767, 258, 774, 267, 268, 789, 289, 290, 805, 318, 323, 331, 338, 851, 342, 344, 863, 871, 878, 370, 884, 373, 889, 378, 390, 397, 913, 914, 921, 942, 946, 438, 440, 449, 450, 458, 504, 469, 472, 483, 485, 160, 509 };
        var solution = 47;
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

    private void test(int[] testCase, int solution){
        assertTimeout(Duration.ofSeconds(3),()->new AvoidObstacles().avoidObstacles(testCase.clone()));
        assertEquals(solution, new AvoidObstacles().avoidObstacles(testCase));
    }//private void test(int[] testCase, int solution){

    private void setTestCaseInfo(String fileName){
        JSONObject testInfo = getJsonObject(fileName, path);
        if(testInfo==null){
            fail("JObject for " + fileName + " returns null");
        }else{//if(testInfo==null){
            var preInternedTestCase = (JSONArray) ((JSONObject) testInfo.get("input")).get("inputArray");
            internedTestCase = new int[preInternedTestCase.size()];
            for(int i=0;i< internedTestCase.length;i++){
                internedTestCase[i] = ((Long) preInternedTestCase.get(i)).intValue();
            }//for(int i=0;i< internedTestCase.length;i++){
            internedSolution = ((Long) testInfo.get("output")).intValue();
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class AvoidObstaclesTest {