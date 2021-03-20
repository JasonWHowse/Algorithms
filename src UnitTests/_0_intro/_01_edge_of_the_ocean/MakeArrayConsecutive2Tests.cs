using Algorithms.src._0_intro._01_edge_of_the_ocean;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._01_edge_of_the_ocean {
    [TestClass()]
    public class MakeArrayConsecutive2Tests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void test1() {
            int[] testCase = {6, 2, 3, 8};
            var solution = 3;
            test(testCase, solution);
        }//public void test1() {

        [TestMethod(), Timeout(timeout)]
        public void test2() {
            int[] testCase = {0, 3};
            var solution = 2;
            test(testCase, solution);
        }//public void test2() {

        [TestMethod(), Timeout(timeout)]
        public void test3() {
            int[] testCase = {5, 4, 6};
            var solution = 0;
            test(testCase, solution);
        }//public void test3() {

        [TestMethod(), Timeout(timeout)]
        public void test4() {
            int[] testCase = {6, 3};
            var solution = 2;
            test(testCase, solution);
        }//public void test4() {

        [TestMethod(), Timeout(timeout)]
        public void test5() {
            int[] testCase = {1};
            var solution = 0;
            test(testCase, solution);
        }//public void test5() {

        private void test(int[] testCase,int solution) {
            Assert.AreEqual(solution,new MakeArrayConsecutive2().makeArrayConsecutive2(testCase));
        }//private void test(int[] testCase,int solution) {
    }//public class MakeArrayConsecutive2Tests {
}//namespace Algorithms.src_UnitTests._0_intro._01_edge_of_the_ocean {
