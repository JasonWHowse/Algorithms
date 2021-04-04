using Algorithms.src._0_intro._01_edge_of_the_ocean;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._01_edge_of_the_ocean {
    [TestClass()]
    public class AlmostIncreasingSequenceTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase = { 1, 3, 2, 1 };
            var solution = false;
            Test(testCase,solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase = { 1, 3, 2 };
            var solution = true;
            Test(testCase,solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase = { 1, 2, 1, 2 };
            var solution = false;
            Test(testCase,solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase = { 3, 6, 5, 8, 10, 20, 15 };
            var solution = false;
            Test(testCase,solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase = { 1, 1, 2, 3, 4, 4 };
            var solution = false;
            Test(testCase,solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase = { 1, 4, 10, 4, 2 };
            var solution = false;
            Test(testCase,solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase = { 10, 1, 2, 3, 4, 5 };
            var solution = true;
            Test(testCase,solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase = { 1, 1, 1, 2, 3 };
            var solution = false;
            Test(testCase,solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[] testCase = { 0, -2, 5, 6 };
            var solution = true;
            Test(testCase,solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            int[] testCase = { 1, 2, 3, 4, 5, 3, 5, 6 };
            var solution = false;
            Test(testCase,solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            int[] testCase = { 40, 50, 60, 10, 20, 30 };
            var solution = false;
            Test(testCase,solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            int[] testCase = { 1, 1 };
            var solution = true;
            Test(testCase,solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            int[] testCase = { 1, 2, 5, 3, 5 };
            var solution = true;
            Test(testCase,solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            int[] testCase = { 1, 2, 5, 5, 5 };
            var solution = false;
            Test(testCase,solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            int[] testCase = { 10, 1, 2, 3, 4, 5, 6, 1 };
            var solution = false;
            Test(testCase,solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            int[] testCase = { 1, 2, 3, 4, 3, 6 };
            var solution = true;
            Test(testCase,solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            int[] testCase = { 1, 2, 3, 4, 99, 5, 6 };
            var solution = true;
            Test(testCase,solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            int[] testCase = { 123, -17, -5, 1, 2, 3, 12, 43, 45 };
            var solution = true;
            Test(testCase,solution);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            int[] testCase = { 3, 5, 67, 98, 3 };
            var solution = true;
            Test(testCase,solution);
        }//public void Test19() {

        private void Test(int[] testCase,bool solution) {
            if (solution) {
                Assert.IsTrue(new AlmostIncreasingSequence().almostIncreasingSequence(testCase));
            } else {//if (solution) {
                Assert.IsFalse(new AlmostIncreasingSequence().almostIncreasingSequence(testCase));
            }//else {
        }//private void Test(int[] testCase,var solution) {
    }//public class AlmostIncreasingSequenceTests {
}//namespace Algorithms.src_UnitTests._0_intro._01_edge_of_the_ocean {
