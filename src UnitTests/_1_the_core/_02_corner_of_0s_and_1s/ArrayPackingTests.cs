using Algorithms.src._1_the_core._02_corner_of_0s_and_1s;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._02_corner_of_0s_and_1s {
    [TestClass()]
    public class ArrayPackingTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase = { 24, 85, 0 };
            var solution = 21784;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase = { 23, 45, 39 };
            var solution = 2567447;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase = { 1, 2, 4, 8 };
            var solution = 134480385;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase = { 5 };
            var solution = 5;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase = { 187, 99, 42, 43 };
            var solution = 724198331;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase = { 0 };
            var solution = 0;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase = { 207, 78, 212, 28 };
            var solution = 483675855;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase = { 111, 8, 150 };
            var solution = 9832559;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[] testCase = { 242, 30 };
            var solution = 7922;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            int[] testCase = { 255, 255, 255, 127 };
            var solution = 2147483647;
            Test(testCase, solution);
        }//public void Test10() {

        private void Test(int[] testCase, int solution) {
            Assert.AreEqual(solution, new ArrayPacking().arrayPacking(testCase));
        }//private void Test(int[] testCase,int solution) {
    }//public class ArrayPackingTests {
}//namespace Algorithms.src_UnitTests._1_the_core._02_corner_of_0s_and_1s {
