using Algorithms.src._1_the_core._02_corner_of_0s_and_1s;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._02_corner_of_0s_and_1s {
    [TestClass()]
    public class SecondRightmostZeroBitTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = 37;
            var solution = 8;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = 1073741824;
            var solution = 2;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = 83748;
            var solution = 2;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = 4;
            var solution = 2;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = 728782938;
            var solution = 4;
            Test(testCase, solution);
        }//public void Test5() {

        private void Test(int testCase, int solution) {
            Assert.AreEqual(solution, new SecondRightmostZeroBit().secondRightmostZeroBit(testCase));
        }//private void Test(int testCase,int solution) {
    }//public class SecondRightmostZeroBitTests {
}//namespace Algorithms.src_UnitTests._1_the_core._02_corner_of_0s_and_1s {
