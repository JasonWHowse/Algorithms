using Algorithms.src._0_intro._02_smooth_sailing;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._02_smooth_sailing {
    [TestClass()]
    public class ReverseInParenthesesTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = "(bar)";
            var solution = "rab";
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = "foo(bar)baz";
            var solution = "foorabbaz";
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = "foo(bar)baz(blim)";
            var solution = "foorabbazmilb";
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = "foo(bar(baz))blim";
            var solution = "foobazrabblim";
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = "";
            var solution = "";
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = "()";
            var solution = "";
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = "(abc)d(efg)";
            var solution = "cbadgfe";
            Test(testCase, solution);
        }//public void Test7() {

        private void Test(string testCase, string solution) {
            Assert.AreEqual(solution, new ReverseInParentheses().reverseInParentheses(testCase));
        }//private void Test(string testCase,string solution) {
    }//public class ReverseInParenthesesTests {
}//namespace Algorithms.src_UnitTests._0_intro._02_smooth_sailing {
