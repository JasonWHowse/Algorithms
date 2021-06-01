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

class AddBorderTest {
    private final static String path = "Test_Cases\\_0_intro\\_03_exploring_the_waters\\AddBorder\\";
    private String[] internedTestCase = new String[0];
    private String[] internedSolution = new String[0];

    @Test
    public void test1() {
        String[] testCase = { "abc", "ded" };
        String[] solution = { "*****", "*abc*", "*ded*", "*****" };
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        String[] testCase = { "a" };
        String[] solution = { "***", "*a*", "***" };
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        String[] testCase = { "aa", "**", "zz" };
        String[] solution = { "****", "*aa*", "****", "*zz*", "****" };
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        String[] testCase = { "abcde", "fghij", "klmno", "pqrst", "uvwxy" };
        String[] solution = { "*******", "*abcde*", "*fghij*", "*klmno*", "*pqrst*", "*uvwxy*", "*******" };
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        String[] testCase = { "wzy**" };
        String[] solution = { "*******", "*wzy***", "*******" };
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        String[] testCase = { "yhopw", "hpplz", "idbnb", "*wehb", "swbbg" };
        String[] solution = { "*******", "*yhopw*", "*hpplz*", "*idbnb*", "**wehb*", "*swbbg*", "*******" };
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        String[] testCase = { "**", "**", "*e" };
        String[] solution = { "****", "****", "****", "**e*", "****" };
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        String[] testCase = { "a", "a" };
        String[] solution = { "***", "*a*", "*a*", "***" };
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

    private void test(String[] testCase, String[] solution){
        assertTimeout(Duration.ofSeconds(3),()->new AddBorder().addBorder(testCase.clone()));
        MatcherAssert.assertThat(new AddBorder().addBorder(testCase),is(solution));
    }//private void test(String[] testCase, String[] solution){

    private void setTestCaseInfo(String fileName){
        JSONObject testInfo = getJsonObject(fileName, path);
        if(testInfo==null){
            fail("JObject for " + fileName + " returns null");
        }else{//if(testInfo==null){
            var preInternedTestCase = (JSONArray) ((JSONObject) testInfo.get("input")).get("picture");
            internedTestCase = new String[preInternedTestCase.size()];
            for(int i=0;i< internedTestCase.length;i++){
                internedTestCase[i] = (String) preInternedTestCase.get(i);
            }//for(int i=0;i< internedTestCase.length;i++){
            var preInternedSolution = (JSONArray)testInfo.get("output");
            internedSolution=new String[preInternedSolution.size()];
            for(int i=0;i<internedSolution.length;i++){
                internedSolution[i]=(String)preInternedSolution.get(i);
            }//for(int i=0;i<internedSolution.length;i++){
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class AddBorderTest {