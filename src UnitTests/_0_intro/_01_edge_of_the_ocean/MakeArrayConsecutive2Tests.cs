using Algorithms.src._0_intro._01_edge_of_the_ocean;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._01_edge_of_the_ocean {
    [TestClass()]
    public class MakeArrayConsecutive2Tests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase = {6, 2, 3, 8};
            var solution = 3;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase = {0, 3};
            var solution = 2;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase = {5, 4, 6};
            var solution = 0;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase = {6, 3};
            var solution = 2;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase = { 1 };
            var solution = 0;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase = { 8, 1, 0, 4, 7 };
            var solution = 4;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10  };
            var solution = 0;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase = { 10  };
            var solution = 0;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[] testCase = { 4, 2, 7, 18 };
            var solution = 13;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            int[] testCase = { 4, 2, 9 };
            var solution = 5;
            Test(testCase, solution);
        }//public void Test10() {

        private void Test(int[] testCase,int solution) {
            Assert.AreEqual(solution,new MakeArrayConsecutive2().makeArrayConsecutive2(testCase));
        }//private void Test(int[] testCase,int solution) {
    }//public class MakeArrayConsecutive2Tests {
}//namespace Algorithms.src_UnitTests._0_intro._01_edge_of_the_ocean {
