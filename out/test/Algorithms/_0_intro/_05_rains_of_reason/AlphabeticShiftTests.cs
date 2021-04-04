using Algorithms.src._0_intro._05_rains_of_reason;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._05_rains_of_reason {
    [TestClass()]
    public class AlphabeticShiftTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = "crazy";
            var solution = "dsbaz";
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = "z";
            var solution = "a";
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = "aaaabbbccd";
            var solution = "bbbbcccdde";
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = "fuzzy";
            var solution = "gvaaz";
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = "codesignal";
            var solution = "dpeftjhobm";
            Test(testCase, solution);
        }//public void Test5() {

        private void Test(string testCase, string solution) {
            Assert.AreEqual(solution, new AlphabeticShift().alphabeticShift(testCase));
        }//private void Test(string testCase,string solution) {
    }//public class AlphabeticShiftTests {
}//namespace Algorithms.src_UnitTests._0_intro._05_rains_of_reason {