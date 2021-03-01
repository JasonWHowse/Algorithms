/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._03_exploring_the_waters;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class AreSimilarTest {
    @Test
    void test1(){
        int[] testCase1=new int[]{1, 2, 3};
        int[] testCase2=new int[]{1, 2, 3};
        assertTimeout(Duration.ofSeconds(3),()->
                (new AreSimilar().areSimilar(testCase1.clone(),testCase2.clone())));
        assertTrue(new AreSimilar().areSimilar(testCase1.clone(),testCase2.clone()));
    }//void test1{

    @Test
    void test2(){
        int[] testCase1=new int[]{1, 2, 3};
        int[] testCase2=new int[]{2, 1, 3};
        assertTimeout(Duration.ofSeconds(3),()->
                (new AreSimilar().areSimilar(testCase1.clone(),testCase2.clone())));
        assertTrue(new AreSimilar().areSimilar(testCase1.clone(),testCase2.clone()));
    }//void test2{

    @Test
    void test3(){
        int[] testCase1=new int[]{1, 2, 2};
        int[] testCase2=new int[]{2, 1, 1};
        assertTimeout(Duration.ofSeconds(3),()->
                (new AreSimilar().areSimilar(testCase1.clone(),testCase2.clone())));
        assertFalse(new AreSimilar().areSimilar(testCase1.clone(),testCase2.clone()));
    }//void test3{

    @Test
    void test4(){
        int[] testCase1=new int[]{1, 1, 4};
        int[] testCase2=new int[]{1, 2, 3};
        assertTimeout(Duration.ofSeconds(3),()->
                (new AreSimilar().areSimilar(testCase1.clone(),testCase2.clone())));
        assertFalse(new AreSimilar().areSimilar(testCase1.clone(),testCase2.clone()));
    }//void test4{

    @Test
    void test5(){
        int[] testCase1=new int[]{1, 2, 3};
        int[] testCase2=new int[]{1, 10, 2};
        assertTimeout(Duration.ofSeconds(3),()->
                (new AreSimilar().areSimilar(testCase1.clone(),testCase2.clone())));
        assertFalse(new AreSimilar().areSimilar(testCase1.clone(),testCase2.clone()));
    }//void test5{

    @Test
    void test6(){
        int[] testCase1=new int[]{2, 3, 1};
        int[] testCase2=new int[]{1, 3, 2};
        assertTimeout(Duration.ofSeconds(3),()->
                (new AreSimilar().areSimilar(testCase1.clone(),testCase2.clone())));
        assertTrue(new AreSimilar().areSimilar(testCase1.clone(),testCase2.clone()));
    }//void test6{

    @Test
    void test7(){
        int[] testCase1=new int[]{2, 3, 9};
        int[] testCase2=new int[]{10, 3, 2};
        assertTimeout(Duration.ofSeconds(3),()->
                (new AreSimilar().areSimilar(testCase1.clone(),testCase2.clone())));
        assertFalse(new AreSimilar().areSimilar(testCase1.clone(),testCase2.clone()));
    }//void test7{

    @Test
    void test8(){
        int[] testCase1=new int[]{4, 6, 3};
        int[] testCase2=new int[]{3, 4, 6};
        assertTimeout(Duration.ofSeconds(3),()->
                (new AreSimilar().areSimilar(testCase1.clone(),testCase2.clone())));
        assertFalse(new AreSimilar().areSimilar(testCase1.clone(),testCase2.clone()));
    }//void test8{

    @Test
    void test9(){
        int[] testCase1=new int[]{832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
        int[] testCase2=new int[]{832, 998, 148, 570, 533, 561, 455, 147, 894, 279};
        assertTimeout(Duration.ofSeconds(3),()->
                (new AreSimilar().areSimilar(testCase1.clone(),testCase2.clone())));
        assertTrue(new AreSimilar().areSimilar(testCase1.clone(),testCase2.clone()));
    }//void test9{

    @Test
    void test10(){
        int[] testCase1=new int[]{832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
        int[] testCase2=new int[]{832, 570, 148, 998, 533, 561, 455, 147, 894, 279};
        assertTimeout(Duration.ofSeconds(3),()->
                (new AreSimilar().areSimilar(testCase1.clone(),testCase2.clone())));
        assertFalse(new AreSimilar().areSimilar(testCase1.clone(),testCase2.clone()));
    }//void test10{
}//class AreSimilarTest