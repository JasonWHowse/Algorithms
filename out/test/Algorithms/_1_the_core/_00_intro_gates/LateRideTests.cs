using Algorithms.src._1_the_core._00_intro_gates;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._00_intro_gates {
    [TestClass()]
    public class LateRideTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = 240;
            var solution = 4;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = 808;
            var solution = 14;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = 1439;
            var solution = 19;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = 0;
            var solution = 0;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = 23;
            var solution = 5;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = 8;
            var solution = 8;
            Test(testCase, solution);
        }//public void Test6() {

        private void Test(int testCase, int solution) {
            Assert.AreEqual(solution, new LateRide().lateRide(testCase));
        }//private void Test(int testCase,int solution) {
    }//public class LateRideTests {
}//namespace Algorithms.src_UnitTests._1_the_core._00_intro_gates {
