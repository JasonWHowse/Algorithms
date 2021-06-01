/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._03_exploring_the_waters;

import org.hamcrest.MatcherAssert;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static helper_functions.Helpers.getJsonObject;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.fail;

class AlternatingSumsTest {
    private final static String path = "Test_Cases\\_0_intro\\_03_exploring_the_waters\\AlternatingSums\\";
    private int[] internedTestCase = new int[0];
    private int[] internedSolution = new int[0];

    @Test
    public void test1() {
        int[] testCase = { 50, 60, 60, 45, 70 };
        int[] solution = { 180, 105 };
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        int[] testCase = { 100, 50 };
        int[] solution = { 100, 50 };
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        int[] testCase = { 80 };
        int[] solution = { 80, 0 };
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        int[] testCase = { 100, 50, 50, 100 };
        int[] solution = { 150, 150 };
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        int[] testCase = { 100, 51, 50, 100 };
        int[] solution = { 150, 151 };
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        int[] testCase = { 100 };
        int[] solution = { 100, 0 };
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        int[] testCase = { 66, 85, 85, 65, 89, 67, 45, 49, 51, 82, 74, 63, 49, 87, 68, 85, 71, 93, 56, 53, 75, 67, 96, 90, 49, 48, 78, 66, 56, 82, 84, 86, 62, 67, 46, 54, 93, 95, 89, 59, 52, 94, 80, 62, 54, 60, 50, 80, 57, 78 };
        int[] solution = { 1675, 1817 };
        test(testCase, solution);
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

    private void test(int[] testCase, int[] solution){
        assertTimeout(Duration.ofSeconds(3),()->new AlternatingSums().alternatingSums(testCase.clone()));
        MatcherAssert.assertThat(new AlternatingSums().alternatingSums(testCase),is(solution));
    }//void test(int[] testCase, int[] solution){

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
                internedSolution[i] = ((Long) preInternedSolution.get(i)).intValue();
            }//for(int i=0;i<internedSolution.length;i++){
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class AlternatingSumsTest {