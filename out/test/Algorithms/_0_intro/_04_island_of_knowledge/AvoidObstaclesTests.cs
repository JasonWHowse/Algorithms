using Algorithms.src._0_intro._04_island_of_knowledge;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._04_island_of_knowledge {
    [TestClass()]
    public class AvoidObstaclesTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase = { 5, 3, 6, 7, 9 };
            var solution = 4;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase = { 2, 3 };
            var solution = 4;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase = { 1, 4, 10, 6, 2};
            var solution = 7;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase = { 1000, 999 };
            var solution = 6;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase = { 19, 32, 11, 23 };
            var solution = 3;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase = { 5, 8, 9, 13, 14 };
            var solution = 6;
            Test(testCase, solution);
        }//public void Test6() {

        private void Test(int[] testCase, int solution) {
            Assert.AreEqual(solution, new AvoidObstacles().avoidObstacles(testCase));
        }//private void Test(int[] testCase,int solution) {
    }//public class AvoidObstaclesTests {
}//namespace Algorithms.src_UnitTests._0_intro._04_island_of_knowledge {
