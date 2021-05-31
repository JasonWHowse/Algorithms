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

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = "090a2";
            var solution = "090";
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = " 123";
            var solution = "";
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase = "233";
            var solution = "233";
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase = "1j2c42ciu5ie99xr0vq5w1slwhq985fp2239qc196d66m";
            var solution = "1";
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase = "812jo3qwj22i306273kz2iq6v6m4w68w66v8s77n727gj2o7s4364g78k6kgrk7wt291820m1";
            var solution = "812";
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase = "49325fx6t3g3t1j440903383567a522vt17a45yy31i9dve53mw8346il4uedqfj731rg3y3mjtug0nl0h4a0e64mak4gb1x83nr";
            var solution = "49325";
            Test(testCase, solution);
        }//public void Test12() {

        private void Test(string testCase, string solution) {
            Assert.AreEqual(solution, new LongestDigitsPrefix().longestDigitsPrefix(testCase));
        }//private void Test(string testCase,string solution) {
    }//public class LongestDigitsPrefixTests {
}//namespace Algorithms.src_UnitTests._0_intro._08_dark_wilderness {
