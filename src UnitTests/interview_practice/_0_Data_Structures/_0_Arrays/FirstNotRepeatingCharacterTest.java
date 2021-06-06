/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._0_Arrays;

import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static helper_functions.Helpers.getJsonObject;
import static org.junit.jupiter.api.Assertions.*;

class FirstNotRepeatingCharacterTest {
    private final static String path = "Test_Cases\\interview_practice\\_0_Data_Structures\\_0_Arrays\\FirstNotRepeatingCharacter\\";
    private String internedTestCase = "";
    private char internedSolution = 'a';

    @Test
    public void test1() {
        var testCase = "abacabad";
        var solution = 'c';
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = "abacabaabacaba";
        var solution = '_';
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = "z";
        var solution = 'z';
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = "bcb";
        var solution = 'c';
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = "bcccccccb";
        var solution = '_';
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = "abcdefghijklmnopqrstuvwxyziflskecznslkjfabe";
        var solution = 'd';
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = "zzz";
        var solution = '_';
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = "bcccccccccccccyb";
        var solution = 'y';
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = "xdnxxlvupzuwgigeqjggosgljuhliybkjpibyatofcjbfxwtalc";
        var solution = 'd';
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = "ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof";
        var solution = 'g';
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = "vbijvdpmxfztmlgiewuloeaudyokfjcoriqfwxuwdfxrllddihadvaeohgkjxiepvzmzhmpnuvgchqgabimpekppnewthrrbpvtfc";
        var solution = 'y';
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = "vbijvdpmxfztmlgieywuloeaudyokfjcoriqfwxuwdfxrllddihadvaeohgkjxiepvzmzhmpnuvgchqgabimpekppnewthrrbpvtfc";
        var solution = '_';
        test(testCase, solution);
    }//public void test12() {

    @Test
    public void test13() {
        setTestCaseInfo("test-13.json");
        test(internedTestCase, internedSolution);
    }//public void test13() {

    @Test
    public void test14() {
        setTestCaseInfo("test-14.json");
        test(internedTestCase, internedSolution);
    }//public void test14() {

    @Test
    public void test15() {
        setTestCaseInfo("test-15.json");
        test(internedTestCase, internedSolution);
    }//public void test15() {

    private void test(String testCase,char solution){
        assertTimeout(Duration.ofSeconds(3),()-> new FirstNotRepeatingCharacter().firstNotRepeatingCharacter(testCase));
        assertEquals(solution,new FirstNotRepeatingCharacter().firstNotRepeatingCharacter(testCase));
    }//void private test(String testCase,char solution){

    private void setTestCaseInfo(String fileName){
        JSONObject testInfo = getJsonObject(fileName, path);
        if(testInfo==null){
            fail("JObject for " + fileName + " returns null");
        }else{//if(testInfo==null){
            internedTestCase = (String) ((JSONObject) testInfo.get("input")).get("s");
            internedSolution = ((String) testInfo.get("output")).charAt(0);
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class FirstNotRepeatingCharacterTest {