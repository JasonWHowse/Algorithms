using Algorithms.src._0_intro._01_edge_of_the_ocean;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._01_edge_of_the_ocean {
    [TestClass()]
    public class AlmostIncreasingSequenceTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void test1() {
            int[] testCase = { 1, 3, 2, 1 };
            var solution = false;
            test(testCase,solution);
        }//public void test1() {

        [TestMethod(), Timeout(timeout)]
        public void test2() {
            int[] testCase = { 1, 3, 2 };
            var solution = true;
            test(testCase,solution);
        }//public void test2() {

        [TestMethod(), Timeout(timeout)]
        public void test3() {
            int[] testCase = { 1, 2, 1, 2 };
            var solution = false;
            test(testCase,solution);
        }//public void test3() {

        [TestMethod(), Timeout(timeout)]
        public void test4() {
            int[] testCase = { 3, 6, 5, 8, 10, 20, 15 };
            var solution = false;
            test(testCase,solution);
        }//public void test4() {

        [TestMethod(), Timeout(timeout)]
        public void test5() {
            int[] testCase = { 1, 1, 2, 3, 4, 4 };
            var solution = false;
            test(testCase,solution);
        }//public void test5() {

        [TestMethod(), Timeout(timeout)]
        public void test6() {
            int[] testCase = { 1, 4, 10, 4, 2 };
            var solution = false;
            test(testCase,solution);
        }//public void test6() {

        [TestMethod(), Timeout(timeout)]
        public void test7() {
            int[] testCase = { 10, 1, 2, 3, 4, 5 };
            var solution = true;
            test(testCase,solution);
        }//public void test7() {

        [TestMethod(), Timeout(timeout)]
        public void test8() {
            int[] testCase = { 1, 1, 1, 2, 3 };
            var solution = false;
            test(testCase,solution);
        }//public void test8() {

        [TestMethod(), Timeout(timeout)]
        public void test9() {
            int[] testCase = { 0, -2, 5, 6 };
            var solution = true;
            test(testCase,solution);
        }//public void test9() {

        [TestMethod(), Timeout(timeout)]
        public void test10() {
            int[] testCase = { 1, 2, 3, 4, 5, 3, 5, 6 };
            var solution = false;
            test(testCase,solution);
        }//public void test10() {

        [TestMethod(), Timeout(timeout)]
        public void test11() {
            int[] testCase = { 40, 50, 60, 10, 20, 30 };
            var solution = false;
            test(testCase,solution);
        }//public void test11() {

        [TestMethod(), Timeout(timeout)]
        public void test12() {
            int[] testCase = { 1, 1 };
            var solution = true;
            test(testCase,solution);
        }//public void test12() {

        [TestMethod(), Timeout(timeout)]
        public void test13() {
            int[] testCase = { 1, 2, 5, 3, 5 };
            var solution = true;
            test(testCase,solution);
        }//public void test13() {

        [TestMethod(), Timeout(timeout)]
        public void test14() {
            int[] testCase = { 1, 2, 5, 5, 5 };
            var solution = false;
            test(testCase,solution);
        }//public void test14() {

        [TestMethod(), Timeout(timeout)]
        public void test15() {
            int[] testCase = { 10, 1, 2, 3, 4, 5, 6, 1 };
            var solution = false;
            test(testCase,solution);
        }//public void test15() {

        [TestMethod(), Timeout(timeout)]
        public void test16() {
            int[] testCase = { 1, 2, 3, 4, 3, 6 };
            var solution = true;
            test(testCase,solution);
        }//public void test16() {

        [TestMethod(), Timeout(timeout)]
        public void test17() {
            int[] testCase = { 1, 2, 3, 4, 99, 5, 6 };
            var solution = true;
            test(testCase,solution);
        }//public void test17() {

        [TestMethod(), Timeout(timeout)]
        public void test18() {
            int[] testCase = { 123, -17, -5, 1, 2, 3, 12, 43, 45 };
            var solution = true;
            test(testCase,solution);
        }//public void test18() {

        [TestMethod(), Timeout(timeout)]
        public void test19() {
            int[] testCase = { 3, 5, 67, 98, 3 };
            var solution = true;
            test(testCase,solution);
        }//public void test19() {

        private void test(int[] testCase,bool solution) {
            if (solution) {
                Assert.IsTrue(new AlmostIncreasingSequence().almostIncreasingSequence(testCase));
            } else {//if (solution) {
                Assert.IsFalse(new AlmostIncreasingSequence().almostIncreasingSequence(testCase));
            }//else {
        }//private void test(int[] testCase,var solution) {
    }//public class AlmostIncreasingSequenceTests {
}//namespace Algorithms.src_UnitTests._0_intro._01_edge_of_the_ocean {
