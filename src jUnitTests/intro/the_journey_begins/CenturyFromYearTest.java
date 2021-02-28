/*
 * Authored by: Jason Wesley Howse
 */

package intro.the_journey_begins;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class CenturyFromYearTest {
    @Test
    void test1() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CenturyFromYear()).centuryFromYear(1905));
        assertEquals((new CenturyFromYear())
                .centuryFromYear(1905),20);
    }//void test1() {

    @Test
    void test2() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CenturyFromYear()).centuryFromYear(1700));
        assertEquals((new CenturyFromYear())
                .centuryFromYear(1700),17);
    }//void test2() {

    @Test
    void test3() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CenturyFromYear()).centuryFromYear(1988));
        assertEquals((new CenturyFromYear())
                .centuryFromYear(1988),20);
    }//void test3() {

    @Test
    void test4() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CenturyFromYear()).centuryFromYear(2000));
        assertEquals((new CenturyFromYear())
                .centuryFromYear(2000),20);
    }//void test4() {

    @Test
    void test5() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CenturyFromYear()).centuryFromYear(2001));
        assertEquals((new CenturyFromYear())
                .centuryFromYear(2001),21);
    }//void test5() {

    @Test
    void test6() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CenturyFromYear()).centuryFromYear(200));
        assertEquals((new CenturyFromYear())
                .centuryFromYear(200),2);
    }//void test6() {

    @Test
    void test7() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CenturyFromYear()).centuryFromYear(374));
        assertEquals((new CenturyFromYear())
                .centuryFromYear(374),4);
    }//void test7() {

    @Test
    void test8() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CenturyFromYear()).centuryFromYear(45));
        assertEquals((new CenturyFromYear())
                .centuryFromYear(45),1);
    }//void test8() {

    @Test
    void test9() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new CenturyFromYear()).centuryFromYear(8));
        assertEquals((new CenturyFromYear())
                .centuryFromYear(8),1);
    }//void test9() {
}//class CenturyFromYearTest {