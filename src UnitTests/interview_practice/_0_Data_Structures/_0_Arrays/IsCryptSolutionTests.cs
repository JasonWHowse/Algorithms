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

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            string[] testCase1 = {
 "BAA",
 "CAB",
 "DAB"};
            char[][] testCase2 = {
 new char[]{'A','0'},
 new char[]{'B','1'},
 new char[]{'C','2'},
 new char[]{'D','3'}};
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            string[] testCase1 = {
 "BAA",
 "BAA",
 "CAA"};
            char[][] testCase2 = {
 new char[]{'A','0'},
 new char[]{'B','1'},
 new char[]{'C','2'}};
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            string[] testCase1 = {
 "AA",
 "BB",
 "AA"};
            char[][] testCase2 = {
 new char[]{'A','1'},
 new char[]{'B','0'}};
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            string[] testCase1 = {
 "FOUR",
 "FOUR",
 "EIGHT"};
            char[][] testCase2 = {
 new char[]{'F','5'},
 new char[]{'O','2'},
 new char[]{'U','3'},
 new char[]{'R','9'},
 new char[]{'E','1'},
 new char[]{'I','0'},
 new char[]{'G','4'},
 new char[]{'H','7'},
 new char[]{'T','8'}};
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            string[] testCase1 = {
"AAAAAAAAAAAAAA",
 "BBBBBBBBBBBBBB",
 "CCCCCCCCCCCCCC"};
            char[][] testCase2 = {
 new char[]{'A','0'},
 new char[]{'B','1'},
 new char[]{'C','2'}};
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            string[] testCase1 = {
"AAAAAAAAAAAAAA",
 "BBBBBBBBBBBBBB",
 "CCCCCCCCCCCCCC"};
            char[][] testCase2 = {
 new char[]{'A','1'},
 new char[]{'B','2'},
 new char[]{'C','3'}};
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            string[] testCase1 = {
"WASD",
 "IJKL",
 "OPAS"};
            char[][] testCase2 = {
 new char[]{'W','2'},
 new char[]{'A','4'},
 new char[]{'S','7'},
 new char[]{'D','9'},
 new char[]{'I','1'},
 new char[]{'J','0'},
 new char[]{'K','6'},
 new char[]{'L','8'},
 new char[]{'O','3'},
 new char[]{'P','5'}};
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            string[] testCase1 = {
"WASD",
 "IJKL",
 "OPAS"};
            char[][] testCase2 = {
 new char[]{'W','2'},
 new char[]{'A','0'},
 new char[]{'S','4'},
 new char[]{'D','1'},
 new char[]{'I','5'},
 new char[]{'J','8'},
 new char[]{'K','6'},
 new char[]{'L','3'},
 new char[]{'O','7'},
 new char[]{'P','9'}};
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            string[] testCase1 = {
"WASD",
 "IJKL",
 "AOPAS"};
            char[][] testCase2 = {
 new char[]{'W','2'},
 new char[]{'A','0'},
 new char[]{'S','4'},
 new char[]{'D','1'},
 new char[]{'I','5'},
 new char[]{'J','8'},
 new char[]{'K','6'},
 new char[]{'L','3'},
 new char[]{'O','7'},
 new char[]{'P','9'}};
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test19() {

        [TestMethod(), Timeout(timeout)]
        public void Test20() {
            string[] testCase1 = {
"BLACK",
 "BLUE",
 "APPLE"};
            char[][] testCase2 = {
 new char[]{'B','5'},
 new char[]{'L','8'},
 new char[]{'A','6'},
 new char[]{'C','7'},
 new char[]{'K','0'},
 new char[]{'U','1'},
 new char[]{'E','9'},
 new char[]{'P','4'}};
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test20() {

        private void Test(string[] testCase1, char[][] testCase2, bool solution) {
            if (solution) {
                Assert.IsTrue(new IsCryptSolution().isCryptSolution(testCase1, testCase2));
            } else {//if (solution) {
                Assert.IsFalse(new IsCryptSolution().isCryptSolution(testCase1, testCase2));
            }//else {
        }//private void Test(string[] testCase1, char[][] testCase2, bool solution) {
    }//public class IsCryptSolutionTests {
}//namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._0_Arrays {
