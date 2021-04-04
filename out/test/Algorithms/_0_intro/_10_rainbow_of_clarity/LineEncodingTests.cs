using Algorithms.src._0_intro._10_rainbow_of_clarity;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._10_rainbow_of_clarity {
    [TestClass()]
    public class LineEncodingTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = "aabbbc";
            var solution = "2a3bc";
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = "abbcabb";
            var solution = "a2bca2b";
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = "abcd";
            var solution = "abcd";
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = "zzzz";
            var solution = "4z";
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = "wwwwwwwawwwwwww";
            var solution = "7wa7w";
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = "ccccccccccccccc";
            var solution = "15c";
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = "qwertyuioplkjhg";
            var solution = "qwertyuioplkjhg";
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = "ssiiggkooo";
            var solution = "2s2i2gk3o";
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase = "adfaaa";
            var solution = "adf3a";
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase = "bbjaadlkjdl";
            var solution = "2bj2adlkjdl";
            Test(testCase, solution);
        }//public void Test10() {

        private void Test(string testCase, string solution) {
            Assert.AreEqual(solution, new LineEncoding().lineEncoding(testCase));
        }//private void Test(string testCase,string solution) {
    }//public class LineEncodingTests {
}//namespace Algorithms.src_UnitTests._0_intro._10_rainbow_of_clarity {
