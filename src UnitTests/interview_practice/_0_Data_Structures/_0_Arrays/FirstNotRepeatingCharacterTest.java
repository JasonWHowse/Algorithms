/*
 * Authored by: Jason Wesley Howse
 */

/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._0_Arrays;

import interview_practice._0_Data_Structures._0_Arrays.FirstNotRepeatingCharacter;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class FirstNotRepeatingCharacterTest {
    @Test
    void test1() {
        String testCase = "abacabad";
        char solution = 'c';
        test(testCase, solution);
    }//void test1() {

    @Test
    void test2() {
        String testCase = "abacabaabacaba";
        char solution = '_';
        test(testCase, solution);
    }//void test2() {

    @Test
    void test3() {
        String testCase = "z";
        char solution = 'z';
        test(testCase, solution);
    }//void test3() {

    @Test
    void test4() {
        String testCase = "bcb";
        char solution = 'c';
        test(testCase, solution);
    }//void test4() {

    @Test
    void test5() {
        String testCase = "bcccccccb";
        char solution = '_';
        test(testCase, solution);
    }//void test5() {

    @Test
    void test6() {
        String testCase = "abcdefghijklmnopqrstuvwxyziflskecznslkjfabe";
        char solution = 'd';
        test(testCase, solution);
    }//void test6() {

    @Test
    void test7() {
        String testCase = "zzz";
        char solution = '_';
        test(testCase, solution);
    }//void test7() {

    @Test
    void test8() {
        String testCase = "bcccccccccccccyb";
        char solution = 'y';
        test(testCase, solution);
    }//void test8() {

    @Test
    void test9() {
        String testCase = "xdnxxlvupzuwgigeqjggosgljuhliybkjpibyatofcjbfxwtalc";
        char solution = 'd';
        test(testCase, solution);
    }//void test9() {

    @Test
    void test10() {
        String testCase = "ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof";
        char solution = 'g';
        test(testCase, solution);
    }//void test10() {

    void test(String testCase,char solution){
        assertTimeout(Duration.ofSeconds(3),()->
                new FirstNotRepeatingCharacter().firstNotRepeatingCharacter(testCase));
        assertEquals(solution,new FirstNotRepeatingCharacter().firstNotRepeatingCharacter(testCase));
    }//void test(String testCase,char solution){
}//class FirstNotRepeatingCharacterTest {