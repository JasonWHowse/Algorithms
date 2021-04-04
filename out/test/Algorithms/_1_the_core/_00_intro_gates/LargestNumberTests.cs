using Algorithms.src._1_the_core._00_intro_gates;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._00_intro_gates {
    [TestClass()]
    public class LargestNumberTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = 2;
            var solution = 99;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = 1;
            var solution = 9;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = 7;
            var solution = 9999999;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = 4;
            var solution = 9999;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = 3;
            var solution = 999;
            Test(testCase, solution);
        }//public void Test5() {

        private void Test(int testCase, int solution) {
            Assert.AreEqual(solution, new LargestNumber().largestNumber(testCase));
        }//private void Test(int testCase,int solution) {
    }//public class LargestNumberTests {
}//namespace Algorithms.src_UnitTests._1_the_core._00_intro_gates {
