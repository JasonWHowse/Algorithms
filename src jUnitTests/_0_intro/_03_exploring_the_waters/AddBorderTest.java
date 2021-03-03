/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._03_exploring_the_waters;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;

class AddBorderTest {
    @Test
    void test1(){
        String[] testCase = new String[]{"abc",
                "ded"};
        String[] solution = new String[]{"*****",
                "*abc*",
                "*ded*",
                "*****"};
        assertTimeout(Duration.ofSeconds(3),()->
                (new AddBorder().addBorder(testCase.clone())));
        MatcherAssert.assertThat(new AddBorder().addBorder(testCase.clone()),
                is(solution.clone()));
    }//void test1(){

    @Test
    void test2(){
        String[] testCase = new String[]{"a"};
        String[] solution = new String[]{"***",
                "*a*",
                "***"};
        assertTimeout(Duration.ofSeconds(3),()->
                (new AddBorder().addBorder(testCase.clone())));
        MatcherAssert.assertThat(new AddBorder().addBorder(testCase.clone()),
                is(solution.clone()));
    }//void test2(){

    @Test
    void test3(){
        String[] testCase = new String[]{"aa",
                "**",
                "zz"};
        String[] solution = new String[]{"****",
                "*aa*",
                "****",
                "*zz*",
                "****"};
        assertTimeout(Duration.ofSeconds(3),()->
                (new AddBorder().addBorder(testCase.clone())));
        MatcherAssert.assertThat(new AddBorder().addBorder(testCase.clone()),
                is(solution.clone()));
    }//void test3(){

    @Test
    void test4(){
        String[] testCase = new String[]{"abcde",
                "fghij",
                "klmno",
                "pqrst",
                "uvwxy"};
        String[] solution = new String[]{"*******",
                "*abcde*",
                "*fghij*",
                "*klmno*",
                "*pqrst*",
                "*uvwxy*",
                "*******"};
        assertTimeout(Duration.ofSeconds(3),()->
                (new AddBorder().addBorder(testCase.clone())));
        MatcherAssert.assertThat(new AddBorder().addBorder(testCase.clone()),
                is(solution.clone()));
    }//void test4(){

    @Test
    void test5(){
        String[] testCase = new String[]{"wzy**"};
        String[] solution = new String[]{"*******",
                "*wzy***",
                "*******"};
        assertTimeout(Duration.ofSeconds(3),()->
                (new AddBorder().addBorder(testCase.clone())));
        MatcherAssert.assertThat(new AddBorder().addBorder(testCase.clone()),
                is(solution.clone()));
    }//void test5(){
}//class AddBorderTest {