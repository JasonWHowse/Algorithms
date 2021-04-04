using Algorithms.src._1_the_core._04_list_forest_edge;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._04_list_forest_edge {
    [TestClass()]
    public class MakeArrayConsecutive2Tests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase = { 6, 2, 3, 8 };
            var solution = 3;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase = { 0, 3 };
            var solution = 2;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase = { 5, 4, 6 };
            var solution = 0;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase = { 6, 3 };
            var solution = 2;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase = { 1 };
            var solution = 0;
            Test(testCase, solution);
        }//public void Test5() {

        private void Test(int[] testCase, int solution) {
            Assert.AreEqual(solution, new MakeArrayConsecutive2().makeArrayConsecutive2(testCase));
        }//private void Test(int[] testCase,int solution) {
    }//public class MakeArrayConsecutive2Tests {
}//namespace Algorithms.src_UnitTests._1_the_core._04_list_forest_edge {
