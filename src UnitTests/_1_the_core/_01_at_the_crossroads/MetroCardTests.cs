using Algorithms.src._1_the_core._01_at_the_crossroads;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._01_at_the_crossroads {
    [TestClass()]
    public class MetroCardTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = 30;
            int[] solution = { 31 };
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = 31;
            int[] solution = { 28, 30, 31 };
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = 28;
            int[] solution = { 31 };
            Test(testCase, solution);
        }//public void Test3() {

        private void Test(int testCase, int[] solution) {
            CollectionAssert.AreEqual(solution, new MetroCard().metroCard(testCase));
        }//private void Test(int testCase,int[] solution) {
    }//public class MetroCardTests {
}//namespace Algorithms.src_UnitTests._1_the_core._01_at_the_crossroads {
