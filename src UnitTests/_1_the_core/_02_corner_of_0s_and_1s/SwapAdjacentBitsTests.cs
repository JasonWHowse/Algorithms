using Algorithms.src._1_the_core._02_corner_of_0s_and_1s;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._02_corner_of_0s_and_1s {
    [TestClass()]
    public class SwapAdjacentBitsTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = 13;
            var solution = 14;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = 74;
            var solution = 133;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = 1073741823;
            var solution = 1073741823;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = 0;
            var solution = 0;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = 1;
            var solution = 2;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = 83748;
            var solution = 166680;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = 728782938;
            var solution = 397452453;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = 594225528;
            var solution = 328668852;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase = 407127113;
            var solution = 612927622;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase = 103885767;
            var solution = 154277835;
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase = 6977179;
            var solution = 9812327;
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase = 221046318;
            var solution = 236771613;
            Test(testCase, solution);
        }//public void Test12() {

        private void Test(int testCase, int solution) {
            Assert.AreEqual(solution, new SwapAdjacentBits().swapAdjacentBits(testCase));
        }//private void Test(int testCase,int solution) {
    }//public class SwapAdjacentBitsTests {
}//namespace Algorithms.src_UnitTests._1_the_core._02_corner_of_0s_and_1s {
