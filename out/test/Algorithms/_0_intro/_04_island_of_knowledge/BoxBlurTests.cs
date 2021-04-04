using Algorithms.src._0_intro._04_island_of_knowledge;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._04_island_of_knowledge {
    [TestClass()]
    public class BoxBlurTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[][] testCase = { new int[]{ 1, 1, 1 }, new int[]{ 1, 7, 1 }, new int[]{ 1, 1, 1 } };
            int[][] solution = { new int[]{ 1 } };
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[][] testCase = { new int[]{ 0, 18, 9 }, new int[]{ 27, 9, 0 }, new int[]{ 81, 63, 45 } };
            int[][] solution = { new int[]{ 28 } };
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[][] testCase = { new int[]{ 36, 0, 18, 9 }, new int[]{ 27, 54, 9, 0 }, new int[]{ 81, 63, 72, 45 } };
            int[][] solution = { new int[]{ 40, 30 } };
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[][] testCase = { new int[]{ 7, 4, 0, 1 }, new int[]{ 5, 6, 2, 2 }, new int[]{ 6, 10, 7, 8 }, new int[]{ 1, 4, 2, 0 } };
            int[][] solution = { new int[]{ 5, 4 }, new int[]{ 4, 4 } };
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[][] testCase = { new int[]{ 36, 0, 18, 9, 9, 45, 27 }, new int[]{ 27, 0, 54, 9, 0, 63, 90 }, new int[]{ 81, 63, 72, 45, 18, 27, 0 }, new int[]{ 0, 0, 9, 81, 27, 18, 45 }, new int[]{ 45, 45, 27, 27, 90, 81, 72 }, new int[]{ 45, 18, 9, 0, 9, 18, 45 }, new int[]{ 27, 81, 36, 63, 63, 72, 81 } };
            int[][] solution = { new int[]{ 39, 30, 26, 25, 31 }, new int[]{ 34, 37, 35, 32, 32 }, new int[]{ 38, 41, 44, 46, 42 }, new int[]{ 22, 24, 31, 39, 45 }, new int[]{ 37, 34, 36, 47, 59 } };
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[][] testCase = { new int[]{ 36, 0, 18, 9, 9, 45, 27 }, new int[]{ 27, 0, 254, 9, 0, 63, 90 }, new int[]{ 81, 255, 72, 45, 18, 27, 0 }, new int[]{ 0, 0, 9, 81, 27, 18, 45 }, new int[]{ 45, 45, 227, 227, 90, 81, 72 }, new int[]{ 45, 18, 9, 255, 9, 18, 45 }, new int[]{ 27, 81, 36, 127, 255, 72, 81 } };
            int[][] solution = { new int[]{ 82, 73, 48, 25, 31 }, new int[]{ 77, 80, 57, 32, 32 }, new int[]{ 81, 106, 88, 68, 42 }, new int[]{ 44, 96, 103, 89, 45 }, new int[]{ 59, 113, 137, 126, 80 } };
            Test(testCase, solution);
        }//public void Test6() {

        private void Test(int[][] testCase, int[][] solution) {
            int[][] actual= new BoxBlur().boxBlur(testCase);
            for (int i = 0; i < actual.Length; i++) {
                CollectionAssert.AreEqual(solution[i], actual[i]);
            }//for (int i = 0; i < actual.Length; i++) {
        }//private void Test(int[][] testCase,int[][] solution) {
    }//public class BoxBlurTests {
}//namespace Algorithms.src_UnitTests._0_intro._04_island_of_knowledge {
