/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._01_edge_of_the_ocean;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class AdjacentElementsProductTest {

    @Test
    void test1() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{3, 6, -2, -5, 7, 3}));
        assertEquals((new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{3, 6, -2, -5, 7, 3})
                ,21);
    }//void test1() {

    @Test
    void test2() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{-1, -2}));
        assertEquals((new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{-1, -2})
                ,2);
    }//void test2() {

    @Test
    void test3() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{5, 1, 2, 3, 1, 4}));
        assertEquals((new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{5, 1, 2, 3, 1, 4})
                ,6);
    }//void test3() {

    @Test
    void test4() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{1, 2, 3, 0}));
        assertEquals((new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{1, 2, 3, 0})
                ,6);
    }//void test4() {

    @Test
    void test5() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{9, 5, 10, 2, 24, -1, -48}));
        assertEquals((new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{9, 5, 10, 2, 24, -1, -48})
                ,50);
    }//void test5() {

    @Test
    void test6() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{5, 6, -4, 2, 3, 2, -23}));
        assertEquals((new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{5, 6, -4, 2, 3, 2, -23})
                ,30);
    }//void test6() {

    @Test
    void test7() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{4, 1, 2, 3, 1, 5}));
        assertEquals((new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{4, 1, 2, 3, 1, 5})
                ,6);
    }//void test7() {

    @Test
    void test8() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{-23, 4, -3, 8, -12}));
        assertEquals((new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{-23, 4, -3, 8, -12})
                ,-12);
    }//void test8() {

    @Test
    void test9() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{1, 0, 1, 0, 1000}));
        assertEquals((new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{1, 0, 1, 0, 1000})
                ,0);
    }//void test9() {
}//class AdjacentElementsProductTest {