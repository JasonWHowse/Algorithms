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

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase = "aaaaa";
            var solution = "5a";
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase = "fifteenletters";
            var solution = "fift2enle2ters";
            Test(testCase, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            var testCase = "abaddddddddddaa";
            var solution = "aba10d2a";
            Test(testCase, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            var testCase = "qqqqqqqqqqpqqqq";
            var solution = "10qp4q";
            Test(testCase, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            var testCase = "fifteenletterrs";
            var solution = "fift2enle2te2rs";
            Test(testCase, solution);
        }//public void Test15() {
        
        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            var testCase = "fourteen";
            var solution = "fourt2en";
            Test(testCase, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            var testCase = "thebesttest";
            var solution = "thebes2test";
            Test(testCase, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            var testCase = "sassasssasssa";
            var solution = "sa2sa3sa3sa";
            Test(testCase, solution);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            var testCase = "aaaaabbaaaabhhh";
            var solution = "5a2b4ab3h";
            Test(testCase, solution);
        }//public void Test19() {

        private void Test(string testCase, string solution) {
            Assert.AreEqual(solution, new LineEncoding().lineEncoding(testCase));
        }//private void Test(string testCase,string solution) {
    }//public class LineEncodingTests {
}//namespace Algorithms.src_UnitTests._0_intro._10_rainbow_of_clarity {
