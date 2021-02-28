/*
 * Authored by: Jason Wesley Howse
 */

package intro.edge_of_the_ocean;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class ShapeAreaTest {
    @Test
    void test1() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new ShapeArea()).shapeArea(2));
        assertEquals((new ShapeArea()).
                shapeArea(2),5);
    }//void test1() {

    @Test
    void test2() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new ShapeArea()).shapeArea(3));
        assertEquals((new ShapeArea()).
                shapeArea(3),13);
    }//void test2() {

    @Test
    void test3() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new ShapeArea()).shapeArea(1));
        assertEquals((new ShapeArea()).
                shapeArea(1),1);
    }//void test3() {

    @Test
    void test4() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new ShapeArea()).shapeArea(5));
        assertEquals((new ShapeArea()).
                shapeArea(5),41);
    }//void test4() {

    @Test
    void test5() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new ShapeArea()).shapeArea(7000));
        assertEquals((new ShapeArea()).
                shapeArea(7000),97986001);
    }//void test5() {

    @Test
    void test6() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new ShapeArea()).shapeArea(8000));
        assertEquals((new ShapeArea()).
                shapeArea(8000),127984001);
    }//void test6() {

    @Test
    void test7() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new ShapeArea()).shapeArea(9999));
        assertEquals((new ShapeArea()).
                shapeArea(9999),199940005);
    }//void test7() {

    @Test
    void test8() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new ShapeArea()).shapeArea(9999));
        assertTimeout(Duration.ofSeconds(3),()->
                (new ShapeArea()).shapeArea(9998));
        assertEquals((new ShapeArea()).
                shapeArea(9998),199900013);
    }//void test8() {

    @Test
    void test9() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new ShapeArea()).shapeArea(8999));
        assertEquals((new ShapeArea()).
                shapeArea(8999),161946005);
    }//void test9() {

    @Test
    void test10() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new ShapeArea()).shapeArea(100));
        assertEquals((new ShapeArea()).
                shapeArea(100),19801);
    }//void test10() {
}//class ShapeAreaTest {