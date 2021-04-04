using Algorithms.src._0_intro._03_exploring_the_waters;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._03_exploring_the_waters {
    [TestClass()]
    public class AlternatingSumsTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase = { 50, 60, 60, 45, 70 };
            int[] solution = { 180, 105 };
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase = { 100, 50 };
            int[] solution = { 100, 50 };
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase = { 80 };
            int[] solution = { 80, 0 };
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase = { 100, 50, 50, 100 };
            int[] solution = { 150, 150 };
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase = { 100, 51, 50, 100 };
            int[] solution = { 150, 151 };
            Test(testCase, solution);
        }//public void Test5() {

        private void Test(int[] testCase, int[] solution) {
            CollectionAssert.AreEqual(solution, new AlternatingSums().alternatingSums(testCase));
        }//private void Test(int[] testCase,int[] solution) {
    }//public class AlternatingSumsTests {
}//namespace Algorithms.src_UnitTests._0_intro._03_exploring_the_waters {
