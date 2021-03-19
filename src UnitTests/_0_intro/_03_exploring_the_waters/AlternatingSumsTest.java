/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._03_exploring_the_waters;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class AlternatingSumsTest {
    @Test
    void test1(){
        int[] testCase = new int[]{50, 60, 60, 45, 70};
        int[] solution = new int[]{180, 105};
        assertTimeout(Duration.ofSeconds(3),()->
                (new AlternatingSums().alternatingSums(testCase.clone())));
        MatcherAssert.assertThat(new AlternatingSums().
                alternatingSums(testCase.clone()),is(solution.clone()));
    }//void test1{

    @Test
    void test2(){
        int[] testCase = new int[]{100, 50};
        int[] solution = new int[]{100, 50};
        assertTimeout(Duration.ofSeconds(3),()->
                (new AlternatingSums().alternatingSums(testCase.clone())));
        MatcherAssert.assertThat(new AlternatingSums().
                alternatingSums(testCase.clone()),is(solution.clone()));

    }//void test2{

    @Test
    void test3(){
        int[] testCase = new int[]{80};
        int[] solution = new int[]{80, 0};
        assertTimeout(Duration.ofSeconds(3),()->
                (new AlternatingSums().alternatingSums(testCase.clone())));
        MatcherAssert.assertThat(new AlternatingSums().
                alternatingSums(testCase.clone()),is(solution.clone()));

    }//void test3{

    @Test
    void test4(){
        int[] testCase = new int[]{100, 50, 50, 100};
        int[] solution = new int[]{150, 150};
        assertTimeout(Duration.ofSeconds(3),()->
                (new AlternatingSums().alternatingSums(testCase.clone())));
        MatcherAssert.assertThat(new AlternatingSums().
                alternatingSums(testCase.clone()),is(solution.clone()));

    }//void test4{

    @Test
    void test5(){
        int[] testCase = new int[]{100, 51, 50, 100};
        int[] solution = new int[]{150, 151};
        assertTimeout(Duration.ofSeconds(3),()->
                (new AlternatingSums().alternatingSums(testCase.clone())));
        MatcherAssert.assertThat(new AlternatingSums().
                alternatingSums(testCase.clone()),is(solution.clone()));

    }//void test5{
}