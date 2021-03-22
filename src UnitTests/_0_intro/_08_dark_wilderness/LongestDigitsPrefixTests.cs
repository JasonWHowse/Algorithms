using Algorithms.src._0_intro._08_dark_wilderness;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._08_dark_wilderness {
    [TestClass()]
    public class LongestDigitsPrefixTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = "123aa1";
            var solution = "123";
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = "0123456789";
            var solution = "0123456789";
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = "  3) always check for whitespaces";
            var solution = "";
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = "12abc34";
            var solution = "12";
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = "the output is 42";
            var solution = "";
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = "aaaaaaa";
            var solution = "";
            Test(testCase, solution);
        }//public void Test6() {

        private void Test(string testCase, string solution) {
            Assert.AreEqual(solution, new LongestDigitsPrefix().longestDigitsPrefix(testCase));
        }//private void Test(string testCase,string solution) {
    }//public class LongestDigitsPrefixTests {
}//namespace Algorithms.src_UnitTests._0_intro._08_dark_wilderness {
