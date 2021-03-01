/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._02_smooth_sailing;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class ReverseInParenthesesTest {
    @Test
    void test1(){
        String testCase="(bar)";
        String solution="rab";
        assertTimeout(Duration.ofSeconds(3),()->
                (new ReverseInParentheses().reverseInParentheses(testCase)));
        assertEquals(new ReverseInParentheses().reverseInParentheses(testCase),solution);
    }//void test1(){

    @Test
    void test2(){
        String testCase="foo(bar)baz";
        String solution="foorabbaz";
        assertTimeout(Duration.ofSeconds(3),()->
                (new ReverseInParentheses().reverseInParentheses(testCase)));
        assertEquals(new ReverseInParentheses().reverseInParentheses(testCase),solution);
    }//void test2(){

    @Test
    void test3(){
        String testCase="foo(bar)baz(blim)";
        String solution="foorabbazmilb";
        assertTimeout(Duration.ofSeconds(3),()->
                (new ReverseInParentheses().reverseInParentheses(testCase)));
        assertEquals(new ReverseInParentheses().reverseInParentheses(testCase),solution);
    }//void test3(){

    @Test
    void test4(){
        String testCase="foo(bar(baz))blim";
        String solution="foobazrabblim";
        assertTimeout(Duration.ofSeconds(3),()->
                (new ReverseInParentheses().reverseInParentheses(testCase)));
        assertEquals(new ReverseInParentheses().reverseInParentheses(testCase),solution);
    }//void test4(){

    @Test
    void test5(){
        String testCase="";
        String solution="";
        assertTimeout(Duration.ofSeconds(3),()->
                (new ReverseInParentheses().reverseInParentheses(testCase)));
        assertEquals(new ReverseInParentheses().reverseInParentheses(testCase),solution);
    }//void test5(){

    @Test
    void test6(){
        String testCase="()";
        String solution="";
        assertTimeout(Duration.ofSeconds(3),()->
                (new ReverseInParentheses().reverseInParentheses(testCase)));
        assertEquals(new ReverseInParentheses().reverseInParentheses(testCase),solution);
    }//void test6(){

    @Test
    void test7(){
        String testCase="(abc)d(efg)";
        String solution="cbadgfe";
        assertTimeout(Duration.ofSeconds(3),()->
                (new ReverseInParentheses().reverseInParentheses(testCase)));
        assertEquals(new ReverseInParentheses().reverseInParentheses(testCase),solution);
    }//void test7(){
}//class ReverseInParenthesesTest {