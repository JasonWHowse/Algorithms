using Algorithms.src._0_intro._10_rainbow_of_clarity;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._10_rainbow_of_clarity {
    [TestClass()]
    public class ChessKnightTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = "a1";
            var solution = 2;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = "c2";
            var solution = 6;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = "d4";
            var solution = 8;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = "g6";
            var solution = 6;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = "a3";
            var solution = 4;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = "b7";
            var solution = 4;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = "h8";
            var solution = 2;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = "h6";
            var solution = 4;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase = "g8";
            var solution = 3;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase = "a5";
            var solution = 4;
            Test(testCase, solution);
        }//public void Test10() {

        private void Test(string testCase, int solution) {
            Assert.AreEqual(solution, new ChessKnight().chessKnight(testCase));
        }//private void Test(string testCase,int solution) {
    }//public class ChessKnightTests {
}//namespace Algorithms.src_UnitTests._0_intro._10_rainbow_of_clarity {
