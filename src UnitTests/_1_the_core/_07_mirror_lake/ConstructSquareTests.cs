using Algorithms.src._1_the_core._07_mirror_lake;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._07_mirror_lake {
    [TestClass()]
    public class ConstructSquareTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = "ab";
            var solution = 81;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = "zzz";
            var solution = -1;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = "aba";
            var solution = 900;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = "abcbbb";
            var solution = 810000;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = "abc";
            var solution = 961;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = "aaaabbcde";
            var solution = 999950884;
            Test(testCase, solution);
        }//public void Test6() {

        private void Test(string testCase, int solution) {
            Assert.AreEqual(solution, new ConstructSquare().constructSquare(testCase));
        }//private void Test(string testCase, int solution) {
    }//public class ConstructSquareTests {
}//namespace Algorithms.src_UnitTests._1_the_core._07_mirror_lake {
