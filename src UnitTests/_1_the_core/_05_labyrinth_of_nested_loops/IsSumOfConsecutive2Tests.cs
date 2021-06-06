using Algorithms.src._1_the_core._05_labyrinth_of_nested_loops;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._05_labyrinth_of_nested_loops {
    [TestClass()]
    public class IsSumOfConsecutive2Tests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = 9;
            var solution = 2;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = 8;
            var solution = 0;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = 15;
            var solution = 3;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = 24;
            var solution = 1;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = 13;
            var solution = 1;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = 25;
            var solution = 2;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = 99;
            var solution = 5;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = 880;
            var solution = 3;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase = 693;
            var solution = 11;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase = 4376;
            var solution = 1;
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase = 1233;
            var solution = 5;
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase = 1;
            var solution = 0;
            Test(testCase, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            var testCase = 4096;
            var solution = 0;
            Test(testCase, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            var testCase = 10000;
            var solution = 4;
            Test(testCase, solution);
        }//public void Test14() {

        private void Test(int testCase, int solution) {
            Assert.AreEqual(solution, new IsSumOfConsecutive2().isSumOfConsecutive2(testCase));
        }//private void Test(int testCase,int solution) {
    }//public class IsSumOfConsecutive2Tests {
}//namespace Algorithms.src_UnitTests._1_the_core._05_labyrinth_of_nested_loops {
