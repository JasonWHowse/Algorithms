using Algorithms.src._0_intro._03_exploring_the_waters;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._03_exploring_the_waters {
    [TestClass()]
    public class AreSimilarTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase1 = { 1, 2, 3 };
            int[] testCase2 = { 1, 2, 3 };
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase1 = { 1, 2, 3 };
            int[] testCase2 = { 2, 1, 3 };
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase1 = { 1, 2, 2 };
            int[] testCase2 = { 2, 1, 1 };
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase1 = { 1, 1, 4 };
            int[] testCase2 = { 1, 2, 3 };
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase1 = { 1, 2, 3 };
            int[] testCase2 = { 1, 10, 2 };
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase1 = { 2, 3, 1 };
            int[] testCase2 = { 1, 3, 2 };
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase1 = { 2, 3, 9 };
            int[] testCase2 = { 10, 3, 2 };
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase1 = { 4, 6, 3 };
            int[] testCase2 = { 3, 4, 6 };
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[] testCase1 = { 832, 998, 148, 570, 533, 561, 894, 147, 455, 279 };
            int[] testCase2 = { 832, 998, 148, 570, 533, 561, 455, 147, 894, 279 };
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            int[] testCase1 = { 832, 998, 148, 570, 533, 561, 894, 147, 455, 279 };
            int[] testCase2 = { 832, 570, 148, 998, 533, 561, 455, 147, 894, 279 };
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test10() {

        private void Test(int[] testCase1, int[] testCase2, bool solution) {
            if (solution) {
                Assert.IsTrue(new AreSimilar().areSimilar(testCase1,testCase2));
            } else {//if (solution) {
                Assert.IsFalse(new AreSimilar().areSimilar(testCase1, testCase2));
            }//else {
        }//private void Test(int[] testCase1,int[] testCase2,bool solution) {
    }//public class AreSimilarTests {
}//namespace Algorithms.src_UnitTests._0_intro._03_exploring_the_waters {
