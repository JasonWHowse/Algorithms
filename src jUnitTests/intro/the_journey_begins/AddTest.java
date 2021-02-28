/*
 * Authored by: Jason Wesley Howse
 */

package intro.the_journey_begins;

import intro.edge_of_the_ocean.ShapeArea;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class AddTest extends Add{
    @Test
    void test1() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new Add()).add(1,2));
        Assertions.assertEquals((new Add()).add(1,2),3);
    }//void test1() {

    @Test
    void test2() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new Add()).add(0,1000));
        Assertions.assertEquals((new Add()).add(0,1000),1000);
    }//void test2() {

    @Test
    void test3() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new Add()).add(2,-39));
        Assertions.assertEquals((new Add()).add(2,-39),-37);
    }//void test3() {

    @Test
    void test4() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new Add()).add(99,100));
        Assertions.assertEquals((new Add()).add(99,100),199);
    }//void test4() {

    @Test
    void test5() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new Add()).add(-100,100));
        Assertions.assertEquals((new Add()).add(-100,100),0);
    }//void test5() {

    @Test
    void test6() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new Add()).add(-1000,-1000));
        Assertions.assertEquals((new Add()).add(-1000,-1000),-2000);
    }//void test6() {
}//class AddTest extends Add{