/*
 * Authored by: Jason Wesley Howse
 */

package intro.the_journey_begins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CenturyFromYearTest {
    @org.junit.jupiter.api.Test
    void test1() {
        Assertions.assertEquals((new CenturyFromYear())
                .centuryFromYear(1905),20);
    }//void test1() {

    @org.junit.jupiter.api.Test
    void test2() {
        Assertions.assertEquals((new CenturyFromYear())
                .centuryFromYear(1700),17);
    }//void test2() {

    @org.junit.jupiter.api.Test
    void test3() {
        Assertions.assertEquals((new CenturyFromYear())
                .centuryFromYear(1988),20);
    }//void test3() {

    @org.junit.jupiter.api.Test
    void test4() {
        Assertions.assertEquals((new CenturyFromYear())
                .centuryFromYear(2000),20);
    }//void test4() {

    @org.junit.jupiter.api.Test
    void test5() {
        Assertions.assertEquals((new CenturyFromYear())
                .centuryFromYear(2001),21);
    }//void test5() {

    @org.junit.jupiter.api.Test
    void test6() {
        Assertions.assertEquals((new CenturyFromYear())
                .centuryFromYear(200),2);
    }//void test6() {

    @org.junit.jupiter.api.Test
    void test7() {
        Assertions.assertEquals((new CenturyFromYear())
                .centuryFromYear(374),4);
    }//void test7() {

    @org.junit.jupiter.api.Test
    void test8() {
        Assertions.assertEquals((new CenturyFromYear())
                .centuryFromYear(45),1);
    }//void test8() {

    @org.junit.jupiter.api.Test
    void test9() {
        Assertions.assertEquals((new CenturyFromYear())
                .centuryFromYear(8),1);
    }//void test9() {
}//class CenturyFromYearTest {