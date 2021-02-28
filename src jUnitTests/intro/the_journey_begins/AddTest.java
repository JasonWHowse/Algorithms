/*
 * Authored by: Jason Wesley Howse
 */

package intro.the_journey_begins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest extends Add{
    @org.junit.jupiter.api.Test
    void test1() {
        Assertions.assertEquals((new Add()).add(1,2),3);
    }//void test1() {

    @org.junit.jupiter.api.Test
    void test2() {
        Assertions.assertEquals((new Add()).add(0,1000),1000);
    }//void test2() {

    @org.junit.jupiter.api.Test
    void test3() {
        Assertions.assertEquals((new Add()).add(2,-39),-37);
    }//void test3() {

    @org.junit.jupiter.api.Test
    void test4() {
        Assertions.assertEquals((new Add()).add(99,100),199);
    }//void test4() {

    @org.junit.jupiter.api.Test
    void test5() {
        Assertions.assertEquals((new Add()).add(-100,100),0);
    }//void test5() {

    @org.junit.jupiter.api.Test
    void test6() {
        Assertions.assertEquals((new Add()).add(-1000,-1000),-2000);
    }//void test6() {
}//class AddTest extends Add{