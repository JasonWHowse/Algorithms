/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._02_smooth_sailing;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class IsLuckyTest {

    @Test
    void Test1() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new IsLucky().isLucky(1230)));
        assertTrue(new IsLucky().isLucky(1230));
    }//void Test1()

    @Test
    void Test2() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new IsLucky().isLucky(239017)));
        assertFalse(new IsLucky().isLucky(239017));
    }//void Test2()

    @Test
    void Test3() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new IsLucky().isLucky(134008)));
        assertTrue(new IsLucky().isLucky(134008));
    }//void Test3()

    @Test
    void Test4() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new IsLucky().isLucky(10)));
        assertFalse(new IsLucky().isLucky(10));
    }//void Test4()

    @Test
    void Test5() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new IsLucky().isLucky(11)));
        assertTrue(new IsLucky().isLucky(11));
    }//void Test5()

    @Test
    void Test6() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new IsLucky().isLucky(1010)));
        assertTrue(new IsLucky().isLucky(1010));
    }//void Test6()

    @Test
    void Test7() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new IsLucky().isLucky(261534)));
        assertFalse(new IsLucky().isLucky(261534));
    }//void Test7()

    @Test
    void Test8() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new IsLucky().isLucky(100000)));
        assertFalse(new IsLucky().isLucky(100000));
    }//void Test8()

    @Test
    void Test9() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new IsLucky().isLucky(999999)));
        assertTrue(new IsLucky().isLucky(999999));
    }//void Test9()

    @Test
    void Test10() {
        assertTimeout(Duration.ofSeconds(3),()->
                (new IsLucky().isLucky(123321)));
        assertTrue(new IsLucky().isLucky(123321));
    }//void Test10()
}//class IsLuckyTest {