using Algorithms.src._1_the_core._06_book_market;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._06_book_market {
    [TestClass()]
    public class HtmlEndTagByStartTagTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = "<button type='button' disabled>";
            var solution = "</button>";
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = "<i>";
            var solution = "</i>";
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = "<div id='my_area' class='data' title='This is a test for title on Div tag'>";
            var solution = "</div>";
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = "<html>";
            var solution = "</html>";
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = "<TABLE border='1'>";
            var solution = "</TABLE>";
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = "<li class='test'>";
            var solution = "</li>";
            Test(testCase, solution);
        }//public void Test6() {

        private void Test(string testCase, string solution) {
            Assert.AreEqual(solution, new HtmlEndTagByStartTag().htmlEndTagByStartTag(testCase));
        }//private void Test(string testCase,string solution) {
    }//public class HtmlEndTagByStartTagTests {
}//namespace Algorithms.src_UnitTests._1_the_core._06_book_market {
