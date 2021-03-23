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

        private void Test(int[] testCase, int solution) {
            Assert.AreEqual(solution, new ArrayPacking().arrayPacking(testCase));
        }//private void Test(int[] testCase,int solution) {
    }//public class ArrayPackingTests {
}//namespace Algorithms.src_UnitTests._1_the_core._02_corner_of_0s_and_1s {
