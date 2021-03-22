using Algorithms.src._0_intro._11_land_of_logic;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._11_land_of_logic {
    [TestClass()]
    public class LongestWordTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = "Ready, steady, go";
            var solution = "steady";
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = "Ready[[[, steady, go!";
            var solution = "steady";
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = "ABCd";
            var solution = "ABCd";
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = "To be or not to be";
            var solution = "not";
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = "You are the best!!!!!!!!!!!! CodeFighter ever!";
            var solution = "CodeFighter";
            Test(testCase, solution);
        }//public void Test5() {

        private void Test(string testCase, string solution) {
            Assert.AreEqual(solution, new LongestWord().longestWord(testCase));
        }//private void Test(string testCase,string solution) {
    }//public class LongestWordTests {
}//namespace Algorithms.src_UnitTests._0_intro._11_land_of_logic {
