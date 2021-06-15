using Algorithms.src._1_the_core._06_boom_market;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._06_boom_market {
    [TestClass()]
    public class EncloseInBracketsTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = "abacaba";
            var solution = "(abacaba)";
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = "abcdef";
            var solution = "(abcdef)";
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = "aaad";
            var solution = "(aaad)";
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = "if";
            var solution = "(if)";
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = "it";
            var solution = "(it)";
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = "doesnt";
            var solution = "(doesnt)";
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = "challenge";
            var solution = "(challenge)";
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = "you";
            var solution = "(you)";
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase = "itt";
            var solution = "(itt)";
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase = "wont";
            var solution = "(wont)";
            Test(testCase, solution);
        }//public void Test10() {

        private void Test(string testCase, string solution) {
            Assert.AreEqual(solution, new EncloseInBrackets().encloseInBrackets(testCase));
        }//private void Test(string testCase,string solution) {
    }//public class EncloseInBracketsTests {
}//namespace Algorithms.src_UnitTests._1_the_core._06_boom_market {
