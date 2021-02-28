/*
 * Authored by: Jason Wesley Howse
 */

package intro.the_journey_begins;

import org.junit.jupiter.api.Test;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class AddTest extends Add{
    @Test
    void test1() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new Add()).add(1,2));
        assertEquals((new Add()).add(1,2),3);
    }//void test1() {

    @Test
    void test2() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new Add()).add(0,1000));
        assertEquals((new Add()).add(0,1000),1000);
    }//void test2() {

    @Test
    void test3() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new Add()).add(2,-39));
        assertEquals((new Add()).add(2,-39),-37);
    }//void test3() {

    @Test
    void test4() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new Add()).add(99,100));
        assertEquals((new Add()).add(99,100),199);
    }//void test4() {

    @Test
    void test5() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new Add()).add(-100,100));
        assertEquals((new Add()).add(-100,100),0);
    }//void test5() {

    @Test
    void test6() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new Add()).add(-1000,-1000));
        assertEquals((new Add()).add(-1000,-1000),-2000);
    }//void test6() {
}//class AddTest extends Add{