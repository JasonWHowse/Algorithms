using Algorithms.src.interview_practice._0_Data_Structures._0_Arrays;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._0_Arrays {
    [TestClass()]
    public class IsCryptSolutionTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            string[] testCase1 = {
 "SEND",
 "MORE",
 "MONEY"};
            char[][] testCase2 = {
new char[] {'O','0'},
new char[] {'M','1'},
new char[] {'Y','2'},
new char[] {'E','5'},
new char[] {'N','6'},
new char[] {'D','7'},
new char[] {'R','8'},
new char[] {'S','9'}};
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            string[] testCase1 = {
 "TEN",
 "TWO",
 "ONE"};
            char[][] testCase2 = {
new char[] {'O','1'},
new char[] {'T','0'},
new char[] {'W','9'},
new char[] {'E','5'},
new char[] {'N','4'}};
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            string[] testCase1 = {
 "ONE",
 "ONE",
 "TWO"};
            char[][] testCase2 = {
new char[] {'O','2'},
new char[] {'T','4'},
new char[] {'W','6'},
new char[] {'E','1'},
new char[] {'N','3'}};
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            string[] testCase1 = {
 "ONE",
 "ONE",
 "TWO"};
            char[][] testCase2 = {
new char[] {'O','0'},
new char[] {'T','1'},
new char[] {'W','2'},
new char[] {'E','5'},
new char[] {'N','6'}};
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            string[] testCase1 = {
 "A",
 "A",
 "A"};
            char[][] testCase2 = {
new char[] {'A','0'}};
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            string[] testCase1 = {
 "A",
 "B",
 "C"};
            char[][] testCase2 = {
new char[] {'A','5'},
new char[] {'B','6'},
new char[] {'C','1'}};
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            string[] testCase1 = {
 "AA",
 "AA",
 "AA"};
            char[][] testCase2 = {
new char[] {'A','0'}};
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            string[] testCase1 = {
 "A",
 "A",
 "A"};
            char[][] testCase2 = {
new char[] {'A','1'}};
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            string[] testCase1 = {
 "AA",
 "AA",
 "BB"};
            char[][] testCase2 = {
new char[] {'A','1'},
new char[] {'B','2'}};
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            string[] testCase1 = {
 "BAA",
 "CAB",
 "DAB"};
            char[][] testCase2 = {
new char[] {'A','0'},
new char[] {'B','1'},
new char[] {'C','2'},
new char[] {'D','4'}};
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test10() {

        private void Test(string[] testCase1, char[][] testCase2, bool solution) {
            if (solution) {
                Assert.IsTrue(new IsCryptSolution().isCryptSolution(testCase1, testCase2));
            } else {//if (solution) {
                Assert.IsFalse(new IsCryptSolution().isCryptSolution(testCase1, testCase2));
            }//else {
        }//private void Test(string[] testCase1, char[][] testCase2, bool solution) {
    }//public class IsCryptSolutionTests {
}//namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._0_Arrays {
