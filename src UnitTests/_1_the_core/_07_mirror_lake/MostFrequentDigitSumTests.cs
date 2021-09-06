using Algorithms.src._1_the_core._07_mirror_lake;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._07_mirror_lake {
    [TestClass()]
    public class MostFrequentDigitSumTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = 88;
            var solution = 9;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = 8;
            var solution = 8;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = 1;
            var solution = 1;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = 17;
            var solution = 9;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = 239;
            var solution = 9;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = 994;
            var solution = 9;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = 99999;
            var solution = 18;
            Test(testCase, solution);
        }//public void Test7() {

        private void Test(int testCase, int solution) {
            Assert.AreEqual(solution, new MostFrequentDigitSum().mostFrequentDigitSum(testCase));
        }//private void Test(int testCase, int solution) {
    }//public class MostFrequentDigitSumTests {
}//namespace Algorithms.src_UnitTests._1_the_core._07_mirror_lake {
