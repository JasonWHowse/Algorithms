/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._06_book_market;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindEmailDomainTest {

    @Test
    public void test1() {
        var testCase = "prettyandsimple@example.com";
        var solution = "example.com";
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = "fully-qualified-domain@codesignal.com";
        var solution = "codesignal.com";
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = "\" \"@space.com";
        var solution = "space.com";
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = "someaddress@yandex.ru";
        var solution = "yandex.ru";
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = "\" \"@xample.org";
        var solution = "xample.org";
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = "\"much.more unusual\"@yahoo.com";
        var solution = "yahoo.com";
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = "\"very.unusual.@.unusual.com\"@usual.com";
        var solution = "usual.com";
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = "admin@mailserver2.ru";
        var solution = "mailserver2.ru";
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = "example-indeed@strange-example.com";
        var solution = "strange-example.com";
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = "very.common@gmail.com";
        var solution = "gmail.com";
        test(testCase, solution);
    }//public void test10() {

    private void test(String testCase, String solution){
        assertTimeout(Duration.ofSeconds(3),()-> new FindEmailDomain().findEmailDomain(testCase));
        assertEquals(solution,new FindEmailDomain().findEmailDomain(testCase));
    }//private void test(String testCase, String solution){
}//class FindEmailDomainTest {