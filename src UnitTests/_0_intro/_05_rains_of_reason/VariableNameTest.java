/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._05_rains_of_reason;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class VariableNameTest {

    @Test
    void test1(){
        String testCase="var_1__Int";
        assertTimeout(Duration.ofSeconds(3),()->
                new VariableName().variableName(testCase));
        assertTrue(new VariableName().variableName(testCase));
    }//void test1(){

    @Test
    void test2(){
        String testCase="qq-q";
        assertTimeout(Duration.ofSeconds(3),()->
                new VariableName().variableName(testCase));
        assertFalse(new VariableName().variableName(testCase));
    }//void test2(){

    @Test
    void test3(){
        String testCase="2w2";
        assertTimeout(Duration.ofSeconds(3),()->
                new VariableName().variableName(testCase));
        assertFalse(new VariableName().variableName(testCase));
    }//void test3(){

    @Test
    void test4(){
        String testCase=" variable";
        assertTimeout(Duration.ofSeconds(3),()->
                new VariableName().variableName(testCase));
        assertFalse(new VariableName().variableName(testCase));
    }//void test4(){

    @Test
    void test5(){
        String testCase="va[riable0";
        assertTimeout(Duration.ofSeconds(3),()->
                new VariableName().variableName(testCase));
        assertFalse(new VariableName().variableName(testCase));
    }//void test5(){

    @Test
    void test6(){
        String testCase="variable0";
        assertTimeout(Duration.ofSeconds(3),()->
                new VariableName().variableName(testCase));
        assertTrue(new VariableName().variableName(testCase));
    }//void test6(){

    @Test
    void test7(){
        String testCase="a";
        assertTimeout(Duration.ofSeconds(3),()->
                new VariableName().variableName(testCase));
        assertTrue(new VariableName().variableName(testCase));
    }//void test7(){

    @Test
    void test8(){
        String testCase="_Aas_23";
        assertTimeout(Duration.ofSeconds(3),()->
                new VariableName().variableName(testCase));
        assertTrue(new VariableName().variableName(testCase));
    }//void test8(){

    @Test
    void test9(){
        String testCase="a a_2";
        assertTimeout(Duration.ofSeconds(3),()->
                new VariableName().variableName(testCase));
        assertFalse(new VariableName().variableName(testCase));
    }//void test9(){

    @Test
    void test10(){
        String testCase="0ss";
        assertTimeout(Duration.ofSeconds(3),()->
                new VariableName().variableName(testCase));
        assertFalse(new VariableName().variableName(testCase));
    }//void test10(){
}//class VariableNameTest {