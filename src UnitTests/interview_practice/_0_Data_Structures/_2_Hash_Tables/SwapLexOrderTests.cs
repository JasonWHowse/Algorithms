using Algorithms.src.helper_functions;
using Algorithms.src.interview_practice._0_Data_Structures._2_Hash_Tables;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._2_Hash_Tables {
    [TestClass()]
    public class SwapLexOrderTests {

        private const int Timeout = 3000;
        private const string path = "Test_Cases\\interview_practice\\_0_Data_Structures\\_2_Hash_Tables\\SwapLexOrder\\";
        private string internedTestCase1 = "";
        private int[][] internedTestCase2 = new int[0][];
        private string internedSolution = "";

        [TestMethod(), Timeout(Timeout)]
        public void Test1() {
            var testCase1 = "abdc";
            int[][] testCase2 = {  new int[] { 1, 4 }, new int[] { 3, 4 } };
            var solution = "dbca";
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(Timeout)]
        public void Test2() {
            var testCase1 = "abcdefgh";
            int[][] testCase2 = { new int[] { 1, 4 }, new int[] { 7, 8 } };
            var solution = "dbcaefhg";
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(Timeout)]
        public void Test3() {
            var testCase1 = "acxrabdz";
            int[][] testCase2 = { new int[] { 1, 3 }, new int[] { 6, 8 }, new int[] { 3, 8 }, new int[] { 2, 7 } };
            var solution = "zdxrabca";
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(Timeout)]
        public void Test4() {
            var testCase1 = "z";
            int[][] testCase2 = { };
            var solution = "z";
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(Timeout)]
        public void Test5() {
            var testCase1 = "dznsxamwoj";
            int[][] testCase2 = { new int[] { 1, 2 }, new int[] { 3, 4 }, new int[] { 6, 5 }, new int[] { 8, 10 } };
            var solution = "zdsnxamwoj";
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(Timeout)]
        public void Test6() {
            var testCase1 = "fixmfbhyutghwbyezkveyameoamqoi";
            int[][] testCase2 = { new int[] { 8, 5 }, new int[] { 10, 8 }, new int[] { 4, 18 }, new int[] { 20, 12 }, new int[] { 5, 2 }, new int[] { 17, 2 }, new int[] { 13, 25 }, new int[] { 29, 12 }, new int[] { 22, 2 }, new int[] { 17, 11 } };
            var solution = "fzxmybhtuigowbyefkvhyameoamqei";
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(Timeout)]
        public void Test7() {
            var testCase1 = "lvvyfrbhgiyexoirhunnuejzhesylojwbyatfkrv";
            int[][] testCase2 = { new int[] { 13, 23 }, new int[] { 13, 28 }, new int[] { 15, 20 }, new int[] { 24, 29 }, new int[] { 6, 7 }, new int[] { 3, 4 }, new int[] { 21, 30 }, new int[] { 2, 13 }, new int[] { 12, 15 }, new int[] { 19, 23 }, new int[] { 10, 19 }, new int[] { 13, 14 }, new int[] { 6, 16 }, new int[] { 17, 25 }, new int[] { 6, 21 }, new int[] { 17, 26 }, new int[] { 5, 6 }, new int[] { 12, 24 } };
            var solution = "lyyvurrhgxyzvonohunlfejihesiebjwbyatfkrv";
            Test(testCase1, testCase2, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(Timeout)]
        public void Test8() {
            var testCase1 = "a";
            int[][] testCase2 = { };
            var solution = "a";
            Test(testCase1, testCase2, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(Timeout)]
        public void Test9() {
            var testCase1 = "hprjxqshxddnujbnkmugymkdpqkfvmwlrkpqstxx";
            int[][] testCase2 = { new int[] { 10, 25 }, new int[] { 1, 20 }, new int[] { 11, 24 }, new int[] { 6, 8 }, new int[] { 13, 28 }, new int[] { 1, 6 }, new int[] { 1, 3 }, new int[] { 21, 22 }, new int[] { 15, 26 }, new int[] { 13, 26 }, new int[] { 12, 20 }, new int[] { 27, 29 }, new int[] { 3, 4 }, new int[] { 4, 7 }, new int[] { 10, 18 }, new int[] { 10, 27 }, new int[] { 20, 26 }, new int[] { 20, 30 }, new int[] { 1, 24 } };
            var solution = "upsrxqqnxvmjhjhnkpugymkfmdkddbwlrkpqstxx";
            Test(testCase1, testCase2, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(Timeout)]
        public void Test10() {
            var testCase1 = "qvspxdrbvwfuaahtzbpjudfyzccgzwynkgihwmdshvfnvyvfjc";
            int[][] testCase2 = { new int[] { 16, 26 }, new int[] { 2, 25 }, new int[] { 25, 27 }, new int[] { 19, 20 }, new int[] { 13, 20 }, new int[] { 4, 26 }, new int[] { 19, 27 }, new int[] { 18, 26 }, new int[] { 13, 23 }, new int[] { 1, 4 }, new int[] { 11, 19 }, new int[] { 16, 19 }, new int[] { 25, 28 }, new int[] { 19, 30 }, new int[] { 19, 25 }, new int[] { 1, 11 }, new int[] { 2, 20 }, new int[] { 10, 22 }, new int[] { 6, 19 }, new int[] { 7, 26 }, new int[] { 3, 30 }, new int[] { 15, 23 }, new int[] { 12, 26 }, new int[] { 1, 3 }, new int[] { 3, 12 }, new int[] { 3, 26 }, new int[] { 16, 30 }, new int[] { 2, 16 }, new int[] { 4, 13 } };
            var solution = "zwvuxtsbvwrqpapjzhgfudfydccbzaynkgihwmdshvfnvyvfjc";
            Test(testCase1, testCase2, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(Timeout)]
        public void Test11() {
            var testCase1 = "wdbmjpxusweoaxfybkikectlgvrxyracjxeghyctvvexpoxibunjvswhuwduirybhrfvcybuaisbujcngdiaotysffkxocnajloq";
            int[][] testCase2 = { new int[] { 60, 65 }, new int[] { 41, 93 }, new int[] { 41, 58 }, new int[] { 87, 92 }, new int[] { 34, 87 }, new int[] { 37, 56 }, new int[] { 35, 79 }, new int[] { 10, 54 }, new int[] { 35, 73 }, new int[] { 56, 57 }, new int[] { 5, 65 }, new int[] { 69, 91 }, new int[] { 6, 65 }, new int[] { 72, 95 }, new int[] { 8, 49 }, new int[] { 35, 62 }, new int[] { 26, 73 }, new int[] { 38, 58 }, new int[] { 14, 88 }, new int[] { 38, 41 }, new int[] { 25, 66 }, new int[] { 29, 47 }, new int[] { 4, 65 }, new int[] { 44, 59 }, new int[] { 40, 89 }, new int[] { 7, 86 }, new int[] { 26, 53 }, new int[] { 39, 81 }, new int[] { 6, 8 }, new int[] { 3, 68 }, new int[] { 88, 91 }, new int[] { 42, 71 }, new int[] { 8, 67 }, new int[] { 34, 89 }, new int[] { 5, 53 }, new int[] { 76, 79 }, new int[] { 16, 75 }, new int[] { 44, 70 }, new int[] { 37, 44 }, new int[] { 62, 94 }, new int[] { 66, 83 }, new int[] { 42, 70 }, new int[] { 3, 76 }, new int[] { 22, 37 }, new int[] { 27, 36 }, new int[] { 81, 96 }, new int[] { 11, 25 }, new int[] { 29, 58 }, new int[] { 33, 81 }, new int[] { 36, 44 } };
            var solution = "wdvvvuxuswroaxfybkikeytlirxxyracjypvuygxxrehpowimunjjswhgvdhifybegccscbubisbujbncdeaotxktfcfoanajloq";
            Test(testCase1, testCase2, solution);
        }//public void Test11() {

        [TestMethod]
        public void Test12() {
            SetTestCaseInfo("test-12.json");
            DoTest();
        }//public void Test12() {

        [TestMethod]
        public void Test13() {
            SetTestCaseInfo("test-13.json");
            DoTest();
        }//public void Test13() {

        [TestMethod]
        public void Test14() {
            SetTestCaseInfo("test-14.json");
            DoTest();
        }//public void Test14() {

        [TestMethod]
        public void Test15() {
            SetTestCaseInfo("test-15.json");
            DoTest();
        }//public void Test15() {

        private void Test(string testCase1, int[][] testCase2, string solution) {
            Assert.AreEqual(solution, new SwapLexOrder().swapLexOrder(testCase1, testCase2));
        }//private void Test(string testCase1, int[][] testCase2,string solution) {

        private void SetTestCaseInfo(string fileName) {
            JObject o = Helpers.GetJsonObject(fileName, path);
            if (o == null) {
                Assert.Fail("JObject for " + fileName + " returns null");
            } else {//if (o == null) {
                internedSolution = (string)o["output"];
                internedTestCase1 = (string)o["input"]["str"];
                JArray preTestCase2 = (JArray)o["input"]["pairs"];
                internedTestCase2 = new int[preTestCase2.Count][];
                for (int x = 0; x < internedTestCase2.Length; x++) {
                    internedTestCase2[x] = new int[((JArray)preTestCase2[x]).Count];
                    for(int y = 0; y < internedTestCase2[x].Length; y++) {
                        internedTestCase2[x][y] = (int)preTestCase2[x][y];
                    }//for(int y = 0; y < internedTestCase2[x].Length; y++) {
                }//for (int x = 0; x < internedTestCase.Length; x++) {
            }//else {
        }//public void SetTestCaseInfo(string fileName) {

        [Timeout(Timeout)]
        private void DoTest() {
            Test(internedTestCase1, internedTestCase2, internedSolution);
        }//private void DoTest() {
    }//public class SwapLexOrderTests {
}//namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._2_Hash_Tables {
