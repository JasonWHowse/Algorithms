/*
 * Authored by: Jason Wesley Howse
 */

package intro.edge_of_the_ocean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class ShapeAreaTest {

    @Test
    void test1() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new ShapeArea()).shapeArea(2));
        Assertions.assertEquals((new ShapeArea()).
                shapeArea(2),5);
    }//void test1() {

    @Test
    void test2() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new ShapeArea()).shapeArea(3));
        Assertions.assertEquals((new ShapeArea()).
                shapeArea(3),13);
    }//void test2() {

    @Test
    void test3() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new ShapeArea()).shapeArea(1));
        Assertions.assertEquals((new ShapeArea()).
                shapeArea(1),1);
    }//void test3() {

    @Test
    void test4() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new ShapeArea()).shapeArea(5));
        Assertions.assertEquals((new ShapeArea()).
                shapeArea(5),41);
    }//void test4() {

    @Test
    void test5() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new ShapeArea()).shapeArea(7000));
        Assertions.assertEquals((new ShapeArea()).
                shapeArea(7000),97986001);
    }//void test5() {

    @Test
    void test6() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new ShapeArea()).shapeArea(8000));
        Assertions.assertEquals((new ShapeArea()).
                shapeArea(8000),127984001);
    }//void test6() {

    @Test
    void test7() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new ShapeArea()).shapeArea(9999));
        Assertions.assertEquals((new ShapeArea()).
                shapeArea(9999),199940005);
    }//void test7() {

    @Test
    void test8() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new ShapeArea()).shapeArea(9999));
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new ShapeArea()).shapeArea(9998));
        Assertions.assertEquals((new ShapeArea()).
                shapeArea(9998),199900013);
    }//void test8() {

    @Test
    void test9() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new ShapeArea()).shapeArea(8999));
        Assertions.assertEquals((new ShapeArea()).
                shapeArea(8999),161946005);
    }//void test9() {

    @Test
    void test10() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new ShapeArea()).shapeArea(100));
        Assertions.assertEquals((new ShapeArea()).
                shapeArea(100),19801);
    }//void test10() {
}//class ShapeAreaTest {