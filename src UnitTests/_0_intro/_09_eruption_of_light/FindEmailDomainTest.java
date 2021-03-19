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
    void test1() {
        String testCase="prettyandsimple@example.com";
        String solution="example.com";
        assertTimeout(Duration.ofSeconds(3),()->
                new FindEmailDomain().findEmailDomain(testCase));
        assertEquals(new FindEmailDomain().findEmailDomain(testCase),solution);
    }//void test1() {

    @Test
    void test2() {
        String testCase="fully-qualified-domain@codesignal.com";
        String solution="codesignal.com";
        assertTimeout(Duration.ofSeconds(3),()->
                new FindEmailDomain().findEmailDomain(testCase));
        assertEquals(new FindEmailDomain().findEmailDomain(testCase),solution);
    }//void test2() {

    @Test
    void test3() {
        String testCase="\\\" \\\"@space.com";
        String solution="space.com";
        assertTimeout(Duration.ofSeconds(3),()->
                new FindEmailDomain().findEmailDomain(testCase));
        assertEquals(new FindEmailDomain().findEmailDomain(testCase),solution);
    }//void test3() {

    @Test
    void test4() {
        String testCase="someaddress@yandex.ru";
        String solution="yandex.ru";
        assertTimeout(Duration.ofSeconds(3),()->
                new FindEmailDomain().findEmailDomain(testCase));
        assertEquals(new FindEmailDomain().findEmailDomain(testCase),solution);
    }//void test4() {

    @Test
    void test5() {
        String testCase="\\\" \\\"@xample.org";
        String solution="xample.org";
        assertTimeout(Duration.ofSeconds(3),()->
                new FindEmailDomain().findEmailDomain(testCase));
        assertEquals(new FindEmailDomain().findEmailDomain(testCase),solution);
    }//void test5() {

    @Test
    void test6() {
        String testCase="\\\"much.more unusual\\\"@yahoo.com";
        String solution="yahoo.com";
        assertTimeout(Duration.ofSeconds(3),()->
                new FindEmailDomain().findEmailDomain(testCase));
        assertEquals(new FindEmailDomain().findEmailDomain(testCase),solution);
    }//void test6() {

    @Test
    void test7() {
        String testCase="\\\"very.unusual.@.unusual.com\\\"@usual.com";
        String solution="usual.com";
        assertTimeout(Duration.ofSeconds(3),()->
                new FindEmailDomain().findEmailDomain(testCase));
        assertEquals(new FindEmailDomain().findEmailDomain(testCase),solution);
    }//void test7() {

    @Test
    void test8() {
        String testCase="admin@mailserver2.ru";
        String solution="mailserver2.ru";
        assertTimeout(Duration.ofSeconds(3),()->
                new FindEmailDomain().findEmailDomain(testCase));
        assertEquals(new FindEmailDomain().findEmailDomain(testCase),solution);
    }//void test8() {

    @Test
    void test9() {
        String testCase="example-indeed@strange-example.com";
        String solution="strange-example.com";
        assertTimeout(Duration.ofSeconds(3),()->
                new FindEmailDomain().findEmailDomain(testCase));
        assertEquals(new FindEmailDomain().findEmailDomain(testCase),solution);
    }//void test9() {

    @Test
    void test10() {
        String testCase="very.common@gmail.com";
        String solution="gmail.com";
        assertTimeout(Duration.ofSeconds(3),()->
                new FindEmailDomain().findEmailDomain(testCase));
        assertEquals(new FindEmailDomain().findEmailDomain(testCase),solution);
    }//void test10() {
}