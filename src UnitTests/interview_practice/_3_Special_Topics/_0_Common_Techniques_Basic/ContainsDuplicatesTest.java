/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._3_Special_Topics._0_Common_Techniques_Basic;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static helper_functions.Helpers.getJsonObject;
import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicatesTest {
    private final static String path = "Test_Cases\\interview_practice\\_3_Special_Topics\\_0_Common_Techniques_Basic\\ContainsDuplicates\\";
    private int[] internedTestCase = new int[0];
    private boolean internedSolution = false;

    @Test
    public void test1(){
        int[] testCase = { 1, 2, 3, 1 };
        test(testCase, true);
    }//public void test1(){

    @Test
    public void test2(){
        int[] testCase = { 3, 1 };
        test(testCase, false);
    }//public void test2(){

    @Test
    public void test3(){
        int[] testCase = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        test(testCase, true);
    }//public void test3(){

    @Test
    public void test4(){
        int[] testCase = { };
        test(testCase, false);
    }//public void test4(){

    @Test
    public void test5(){
        int[] testCase = { 1 };
        test(testCase, false);
    }//public void test5(){

    @Test
    public void test6(){
        int[] testCase = { -1200000005, -1200000005 };
        test(testCase, true);
    }//public void test6(){

    @Test
    public void test7(){
        int[] testCase = { 0, 4, 5, 0, 3, 6 };
        test(testCase, true);
    }//public void test7(){

    @Test
    public void test8(){
        int[] testCase = { 1, 2, 3, 4 };
        test(testCase, false);
    }//public void test8(){

    @Test
    public void test9(){
        int[] testCase = { 0, 1, 0, -1 };
        test(testCase, true);
    }//public void test9(){

    @Test
    public void test10(){
        int[] testCase = { 2 };
        test(testCase, false);
    }//public void test10(){

    @Test
    public void test11(){
        int[] testCase = { 0 };
        test(testCase, false);
    }//public void test11(){

    @Test
    public void test12(){
        int[] testCase = { 1, 5, -2, -4, 0 };
        test(testCase, false);
    }//public void test12(){

    @Test
    public void test13(){
        int[] testCase = { 2, 14, 18, 22, 22 };
        test(testCase, true);
    }//public void test13(){

    @Test
    public void test14(){
        int[] testCase = { 3, 3 };
        test(testCase, true);
    }//public void test14(){

    @Test
    public void test15(){
        setTestCaseInfo("test-15.json");
        test(internedTestCase, internedSolution);
    }//public void test15(){

    @Test
    public void test16(){
        int[] testCase = { 7, 10, 5, 5, 6, 6, 4, 10, 5, 4, 9, 4, 9, 6, 5, 9, 6, 3, 6, 5, 6, 7, 7, 4, 9, 9, 10, 5, 8, 1, 8, 3, 2, 7, 5, 10, 1, 8, 5, 8, 4, 3, 6, 4, 9, 4, 2, 8, 3, 2, 2, 1, 5, 6, 3, 2, 6, 1, 8, 6, 2, 9, 1, 4, 5, 10, 8, 5, 10, 5, 10, 1, 4, 8, 3, 6, 4, 10, 9, 1, 1, 1, 2, 2, 9, 6, 6, 8, 1, 9, 2, 5, 5, 2, 1, 8, 5, 2, 3, 10 };
        test(testCase, true);
    }//public void test16(){

    @Test
    public void test17(){
        setTestCaseInfo("test-17.json");
        test(internedTestCase, internedSolution);
    }//public void test17(){

    @Test
    public void test18(){
        setTestCaseInfo("test-18.json");
        test(internedTestCase, internedSolution);
    }//public void test18(){

    @Test
    public void test19(){
        setTestCaseInfo("test-19.json");
        test(internedTestCase, internedSolution);
    }//public void test19(){

    @Test
    public void test20(){
        setTestCaseInfo("test-20.json");
        test(internedTestCase, internedSolution);
    }//public void test20(){

    private void test(int[] testCase, boolean solution){
        assertTimeout(Duration.ofSeconds(3),()->new ContainsDuplicates().containsDuplicates(testCase.clone()));
        if(solution){
            assertTrue(new ContainsDuplicates().containsDuplicates(testCase));
        }else{//if(solution){
            assertFalse(new ContainsDuplicates().containsDuplicates(testCase));
        }//else{
    }//private void test(int[] testCase, boolean solution){

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
            internedSolution = (boolean) testInfo.get("output");
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class ContainsDuplicatesTest {