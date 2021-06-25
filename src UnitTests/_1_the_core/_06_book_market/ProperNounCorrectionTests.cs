using Algorithms.src._1_the_core._06_book_market;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._06_book_market {
    [TestClass()]
    public class ProperNounCorrectionTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = "pARiS";
            var solution = "Paris";
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = "John";
            var solution = "John";
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = "mary";
            var solution = "Mary";
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = "a";
            var solution = "A";
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = "B";
            var solution = "B";
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = "yFZMlGvUQP";
            var solution = "Yfzmlgvuqp";
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = "HQQrrDxuqe";
            var solution = "Hqqrrdxuqe";
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = "atDh";
            var solution = "Atdh";
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase = "pJHSYVAZB";
            var solution = "Pjhsyvazb";
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase = "dKrqO";
            var solution = "Dkrqo";
            Test(testCase, solution);
        }//public void Test10() {

        private void Test(string testCase, string solution) {
            Assert.AreEqual(solution, new ProperNounCorrection().properNounCorrection(testCase));
        }//private void Test(string testCase,string solution) {
    }//public class ProperNounCorrectionTests {
}//namespace Algorithms.src_UnitTests._1_the_core._06_book_market {
