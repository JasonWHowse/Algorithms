/*
 * Authored by: Jason Wesley Howse
 */

package intro.edge_of_the_ocean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class AdjacentElementsProductTest {

    @Test
    void test1() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{3, 6, -2, -5, 7, 3}));
        Assertions.assertEquals((new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{3, 6, -2, -5, 7, 3})
                ,21);
    }//void test1() {

    @Test
    void test2() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{-1, -2}));
        Assertions.assertEquals((new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{-1, -2})
                ,2);
    }//void test2() {

    @Test
    void test3() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{5, 1, 2, 3, 1, 4}));
        Assertions.assertEquals((new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{5, 1, 2, 3, 1, 4})
                ,6);
    }//void test3() {

    @Test
    void test4() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{1, 2, 3, 0}));
        Assertions.assertEquals((new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{1, 2, 3, 0})
                ,6);
    }//void test4() {

    @Test
    void test5() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{9, 5, 10, 2, 24, -1, -48}));
        Assertions.assertEquals((new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{9, 5, 10, 2, 24, -1, -48})
                ,50);
    }//void test5() {

    @Test
    void test6() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{5, 6, -4, 2, 3, 2, -23}));
        Assertions.assertEquals((new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{5, 6, -4, 2, 3, 2, -23})
                ,30);
    }//void test6() {

    @Test
    void test7() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{4, 1, 2, 3, 1, 5}));
        Assertions.assertEquals((new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{4, 1, 2, 3, 1, 5})
                ,6);
    }//void test7() {

    @Test
    void test8() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{-23, 4, -3, 8, -12}));
        Assertions.assertEquals((new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{-23, 4, -3, 8, -12})
                ,-12);
    }//void test8() {

    @Test
    void test9() {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                (new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{1, 0, 1, 0, 1000}));
        Assertions.assertEquals((new AdjacentElementsProduct()).
                adjacentElementsProduct(new int[]{1, 0, 1, 0, 1000})
                ,0);
    }//void test9() {
}//class AdjacentElementsProductTest {