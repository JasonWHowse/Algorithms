using Algorithms.src._0_intro._09_eruption_of_light;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._09_eruption_of_light {
    [TestClass()]
    public class ElectionsWinnersTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase1 = { 2, 3, 5, 2 };
            var testCase2 = 3;
            var solution = 2;
            Test(testCase1,testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase1 = { 1, 3, 3, 1, 1 };
            var testCase2 = 0;
            var solution = 0;
            Test(testCase1,testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase1 = { 5, 1, 3, 4, 1 };
            var testCase2 = 0;
            var solution = 1;
            Test(testCase1,testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase1 = { 1, 1, 1, 1 };
            var testCase2 = 1;
            var solution = 4;
            Test(testCase1,testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase1 = { 1, 1, 1, 1 };
            var testCase2 = 0;
            var solution = 0;
            Test(testCase1,testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase1 = { 3, 1, 1, 3, 1 };
            var testCase2 = 2;
            var solution = 2;
            Test(testCase1,testCase2, solution);
        }//public void Test6() {

        private void Test(int[] testCase1, int testCase2, int solution) {
            Assert.AreEqual(solution, new ElectionsWinners().electionsWinners(testCase1, testCase2));
        }//private void Test(int[] testCase1,int testCase2,int solution) {
    }//public class ElectionsWinnersTests {
}//namespace Algorithms.src_UnitTests._0_intro._09_eruption_of_light {
