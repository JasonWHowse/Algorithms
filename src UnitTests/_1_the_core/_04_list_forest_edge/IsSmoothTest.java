/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._04_list_forest_edge;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static helper_functions.Helpers.getJsonObject;
import static org.junit.jupiter.api.Assertions.*;

class IsSmoothTest {
    private final static String path = "Test_Cases\\_1_the_core\\_04_list_forest_edge\\IsSmooth\\";
    private int[] internedTestCase = new int[0];
    private boolean internedSolution = false;

    @Test
    public void test1() {
        int[] testCase = { 7, 2, 2, 5, 10, 7 };
        test(testCase, true);
    }//public void test1() {

    @Test
    public void test2() {
        int[] testCase = { -5, -5, 10 };
        test(testCase, false);
    }//public void test2() {

    @Test
    public void test3() {
        int[] testCase = { 4, 2 };
        test(testCase, false);
    }//public void test3() {

    @Test
    public void test4() {
        int[] testCase = { 45, 23, 12, 33, 12, 453, -234, -45 };
        test(testCase, false);
    }//public void test4() {

    @Test
    public void test5() {
        int[] testCase = { -12, 34, 40, -5, -12, 4, 0, 0, -12 };
        test(testCase, true);
    }//public void test5() {

    @Test
    public void test6() {
        int[] testCase = { 9, 0, 15, 9 };
        test(testCase, false);
    }//public void test6() {

    @Test
    public void test7() {
        int[] testCase = { -6, 6, -6 };
        test(testCase, false);
    }//public void test7() {

    @Test
    public void test8() {
        int[] testCase = { 26, 26, -17 };
        test(testCase, false);
    }//public void test8() {

    @Test
    public void test9() {
        int[] testCase = { -7, 5, 5, 10 };
        test(testCase, false);
    }//public void test9() {

    @Test
    public void test10() {
        int[] testCase = { 3, 4, 5 };
        test(testCase, false);
    }//public void test10() {

    @Test
    public void test11() {
        int[] testCase = { -5, 3, -1, 9 };
        test(testCase, false);
    }//public void test11() {

    @Test
    public void test12() {
        int[] testCase = { 5, 5, 10 };
        test(testCase, false);
    }//public void test12() {

    @Test
    public void test13() {
        int[] testCase = { 222, 23, 12, 210, 12, 453, -234, -222 };
        test(testCase, false);
    }//public void test13() {

    @Test
    public void test14() {
        int[] testCase = { 0, 0, 1, 0 };
        test(testCase, false);
    }//public void test14() {

    @Test
    public void test15() {
        int[] testCase = { -200, 50, 200, 50, -200 };
        test(testCase, false);
    }//public void test15() {

    @Test
    public void test16() {
        int[] testCase = { 55, 55, 54 };
        test(testCase, false);
    }//public void test16() {

    @Test
    public void test17() {
        int[] testCase = { 435, 23, 12, 435, -23, 0, 435 };
        test(testCase, true);
    }//public void test17() {

    @Test
    public void test18() {
        int[] testCase = { 17, -6, 23, 17 };
        test(testCase, true);
    }//public void test18() {

    @Test
    public void test19() {
        setTestCaseInfo("test-19.json");
        test(internedTestCase, internedSolution);
    }//public void test19() {

    @Test
    public void test20() {
        int[] testCase = { 0, 0 };
        test(testCase, true);
    }//public void test20() {

    private void test(int[] testCase,boolean solution) {
        assertTimeout(Duration.ofSeconds(3), () -> new IsSmooth().isSmooth(testCase));
        if(solution) {
            assertTrue(new IsSmooth().isSmooth(testCase.clone()));
        }else {//if(solution) {
            assertFalse(new IsSmooth().isSmooth(testCase.clone()));
        }//else {
    }//private void test(int[] testCase,boolean solution) {

    private void setTestCaseInfo(String fileName){
        JSONObject testInfo = getJsonObject(fileName, path);
        if(testInfo==null){
            fail("JObject for " + fileName + " returns null");
        }else{//if(testInfo==null){
            var preInternedTestCase = (JSONArray) ((JSONObject) testInfo.get("input")).get("arr");
            internedTestCase = new int[preInternedTestCase.size()];
            for(int i=0;i< internedTestCase.length;i++){
                internedTestCase[i] = ((Long) preInternedTestCase.get(i)).intValue();
            }//for(int i=0;i< internedTestCase.length;i++){
            internedSolution = (boolean) testInfo.get("output");
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class IsSmoothTest {