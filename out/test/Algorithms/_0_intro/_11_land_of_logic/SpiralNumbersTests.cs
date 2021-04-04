using Algorithms.src._0_intro._11_land_of_logic;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._11_land_of_logic {
    [TestClass()]
    public class SpiralNumbersTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = 3;
            int[][] solution = {new int[]{ 1, 2, 3 }, new int[] { 8, 9, 4 }, new int[] { 7, 6, 5 } };
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = 5;
            int[][] solution = {new int[]{ 1, 2, 3, 4, 5 }, new int[] { 16, 17, 18, 19, 6 }, new int[] { 15, 24, 25, 20, 7 }, new int[] { 14, 23, 22, 21, 8 }, new int[] { 13, 12, 11, 10, 9 } };
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = 6;
            int[][] solution = {new int[]{ 1, 2, 3, 4, 5, 6 }, new int[] { 20, 21, 22, 23, 24, 7 }, new int[] { 19, 32, 33, 34, 25, 8 }, new int[] { 18, 31, 36, 35, 26, 9 }, new int[] { 17, 30, 29, 28, 27, 10 }, new int[] { 16, 15, 14, 13, 12, 11 } };
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = 7;
            int[][] solution = {new int[]{ 1, 2, 3, 4, 5, 6, 7 }, new int[] { 24, 25, 26, 27, 28, 29, 8 }, new int[] { 23, 40, 41, 42, 43, 30, 9 }, new int[] { 22, 39, 48, 49, 44, 31, 10 }, new int[] { 21, 38, 47, 46, 45, 32, 11 }, new int[] { 20, 37, 36, 35, 34, 33, 12 }, new int[] { 19, 18, 17, 16, 15, 14, 13 } };
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = 10;
            int[][] solution = {new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, new int[] { 36, 37, 38, 39, 40, 41, 42, 43, 44, 11 }, new int[] { 35, 64, 65, 66, 67, 68, 69, 70, 45, 12 }, new int[] { 34, 63, 84, 85, 86, 87, 88, 71, 46, 13 }, new int[] { 33, 62, 83, 96, 97, 98, 89, 72, 47, 14 }, new int[] { 32, 61, 82, 95, 100, 99, 90, 73, 48, 15 }, new int[] { 31, 60, 81, 94, 93, 92, 91, 74, 49, 16 }, new int[] { 30, 59, 80, 79, 78, 77, 76, 75, 50, 17 }, new int[] { 29, 58, 57, 56, 55, 54, 53, 52, 51, 18 }, new int[] { 28, 27, 26, 25, 24, 23, 22, 21, 20, 19 } };
            Test(testCase, solution);
        }//public void Test5() {

        private void Test(int testCase, int[][] solution) {
            int[][] expected = new SpiralNumbers().spiralNumbers(testCase);
            for (int i = 0; i < expected.Length; i++) {
                CollectionAssert.AreEqual(solution[i], expected[i]);
            }//for(int i=0;i<expected.Length;i++){
        }//private void Test(var testCase,var solution) {
    }//public class SpiralNumbersTests {
}//namespace Algorithms.src_UnitTests._0_intro._11_land_of_logic {
