/*
 * Authored by: Jason Wesley Howse
 */

/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._0_Arrays;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class FirstDuplicateTest {
    @Test
    void test1() {
        int[] testCase = {2, 1, 3, 5, 3, 2};
        int solution =3;
        test(testCase, solution);
    }//void test1() {

    @Test
    void test2() {
        int[] testCase = {2,2};
        int solution =2;
        test(testCase, solution);
    }//void test2() {

    @Test
    void test3() {
        int[] testCase = {2, 4, 3, 5, 1};
        int solution =-1;
        test(testCase, solution);
    }//void test3() {

    @Test
    void test4() {
        int[] testCase = {1};
        int solution =-1;
        test(testCase, solution);
    }//void test4() {

    @Test
    void test5() {
        int[] testCase = {5, 5, 5, 5, 5};
        int solution =5;
        test(testCase, solution);
    }//void test5() {

    @Test
    void test6() {
        int[] testCase = {2, 1};
        int solution =-1;
        test(testCase, solution);
    }//void test6() {

    @Test
    void test7() {
        int[] testCase = {2, 1, 3};
        int solution =-1;
        test(testCase, solution);
    }//void test7() {

    @Test
    void test8() {
        int[] testCase = {2, 3, 3};
        int solution =3;
        test(testCase, solution);
    }//void test8() {

    @Test
    void test9() {
        int[] testCase = {3, 3, 3};
        int solution =3;
        test(testCase, solution);
    }//void test9() {

    @Test
    void test10() {
        int[] testCase = {8, 4, 6, 2, 6, 4, 7, 9, 5, 8};
        int solution =6;
        test(testCase, solution);
    }//void test10() {

    @Test
    void test11() {
        int[] testCase = {10, 6, 8, 4, 9, 1, 7, 2, 5, 3};
        int solution =-1;
        test(testCase, solution);
    }//void test11() {

    @Test
    void test12() {
        int[] testCase = {1, 1, 2, 2, 1};
        int solution =1;
        test(testCase, solution);
    }//void test12() {


    void test(int []testCase,int solution){
        assertTimeout(Duration.ofSeconds(3),()->
                new FirstDuplicate().firstDuplicate(testCase.clone()));
        assertEquals(new FirstDuplicate().firstDuplicate(testCase),solution);
    }//void test(int []testCase,int solution){
}//class FirstDuplicateTest {