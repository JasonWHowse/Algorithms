using Algorithms.src._1_the_core._01_at_the_crossroads;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._01_at_the_crossroads {
    [TestClass()]
    public class ReachNextLevelTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = 10;
            var testCase2 = 15;
            var testCase3 = 5;
            bool solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = 10;
            var testCase2 = 15;
            var testCase3 = 4;
            bool solution = false;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = 3;
            var testCase2 = 6;
            var testCase3 = 4;
            bool solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = 84;
            var testCase2 = 135;
            var testCase3 = 36;
            bool solution = false;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = 74;
            var testCase2 = 170;
            var testCase3 = 58;
            bool solution = false;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = 80;
            var testCase2 = 199;
            var testCase3 = 15;
            bool solution = false;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = 97;
            var testCase2 = 57;
            var testCase3 = 7;
            bool solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = 235;
            var testCase2 = 293;
            var testCase3 = 4;
            bool solution = false;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = 222;
            var testCase2 = 137;
            var testCase3 = 58;
            bool solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = 16;
            var testCase2 = 23;
            var testCase3 = 16;
            bool solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test10() {

        private void Test(int testCase1, int testCase2, int testCase3, bool solution) {
            if (solution) {
                Assert.IsTrue(new ReachNextLevel().reachNextLevel(testCase1, testCase2, testCase3));
            } else {//if (solution) {
                Assert.IsFalse(new ReachNextLevel().reachNextLevel(testCase1, testCase2, testCase3));
            }//else {
        }//private void Test(int testCase1,int testCase2,int testCase3,bool solution) {
    }//public class ReachNextLevelTests {
}//namespace Algorithms.src_UnitTests._1_the_core._01_at_the_crossroads {
