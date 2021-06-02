/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._09_eruption_of_light;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

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

    @Test
    public void test11() {
        var testCase = "x@oneletter.am";
        var solution = "oneletter.am";
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = "appugyl__un91n-3062@yopmail.com";
        var solution = "yopmail.com";
        test(testCase, solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase = "hr06122x@a4zerwak0d.gq";
        var solution = "a4zerwak0d.gq";
        test(testCase, solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase = "ralamosm@aol.com";
        var solution = "aol.com";
        test(testCase, solution);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase = "really@thuglife.de";
        var solution = "thuglife.de";
        test(testCase, solution);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase = "vyoucef.koko@axuwv6wnveqhwilbzer.gq";
        var solution = "axuwv6wnveqhwilbzer.gq";
        test(testCase, solution);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase = "m@qazwsxedcrfvtgbyhnujmiklopolksuiwnshdyuijlpo.com";
        var solution = "qazwsxedcrfvtgbyhnujmiklopolksuiwnshdyuijlpo.com";
        test(testCase, solution);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase = "boom@bo.co";
        var solution = "bo.co";
        test(testCase, solution);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase = "Hamojan@thebest.am";
        var solution = "thebest.am";
        test(testCase, solution);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase = "LemurTheWorst@ysu.am";
        var solution = "ysu.am";
        test(testCase, solution);
    }//public void test20() {

    private void test(String testCase, String solution){
        assertTimeout(Duration.ofSeconds(3),()-> new FindEmailDomain().findEmailDomain(testCase));
        assertEquals(new FindEmailDomain().findEmailDomain(testCase),solution);
    }//private void test(String testCase, String solution){
}//class FindEmailDomainTest {