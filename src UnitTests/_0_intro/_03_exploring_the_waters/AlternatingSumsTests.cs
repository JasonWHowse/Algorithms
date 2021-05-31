using Algorithms.src._0_intro._03_exploring_the_waters;
using Algorithms.src.helper_functions;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests._0_intro._03_exploring_the_waters {
    [TestClass()]
    public class AlternatingSumsTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\_0_intro\\_03_exploring_the_waters\\AlternatingSums\\";
        private int[] internedTestCase = new int[0];
        private int[] internedSolution = new int[0];

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

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase = { 100 };
            int[] solution = { 100, 0 };
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase = { 66, 85, 85, 65, 89, 67, 45, 49, 51, 82, 74, 63, 49, 87, 68, 85, 71, 93, 56, 53, 75, 67, 96, 90, 49, 48, 78, 66, 56, 82, 84, 86, 62, 67, 46, 54, 93, 95, 89, 59, 52, 94, 80, 62, 54, 60, 50, 80, 57, 78 };
            int[] solution = { 1675, 1817 };
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod]
        public void Test8() {
            SetTestCaseInfo("test-8.json");
            DoTest();
        }//public void Test8() {

        [TestMethod]
        public void Test9() {
            SetTestCaseInfo("test-9.json");
            DoTest();
        }//public void Test9() {

        [TestMethod]
        public void Test10() {
            SetTestCaseInfo("test-10.json");
            DoTest();
        }//public void Test10() {

        private void Test(int[] testCase, int[] solution) {
            CollectionAssert.AreEqual(solution, new AlternatingSums().alternatingSums(testCase));
        }//private void Test(int[] testCase,int[] solution) {

        private void SetTestCaseInfo(string fileName) {
            JObject o = Helpers.GetJsonObject(fileName, path);
            if (o == null) {
                Assert.Fail("JObject for " + fileName + " returns null");
            } else {//if (o == null) {
                JArray preSolution =(JArray)o["output"];
                internedSolution = new int[preSolution.Count];
                for(int i = 0; i< internedSolution.Length; i++) {
                    internedSolution[i] = (int)preSolution[i];
                }//for(int i = 0; i< internedSolution.Length; i++) {
                JArray preTestCase = (JArray)o["input"]["a"];
                internedTestCase = new int[preTestCase.Count];
                for (int i = 0; i < internedTestCase.Length; i++) {
                    internedTestCase[i] = (int)preTestCase[i];
                }//for (int i = 0; i < internedTestCase.Length; i++) {
            }//else {
        }//public void SetTestCaseInfo(string fileName) {

        [Timeout(timeout)]
        private void DoTest() {
            Test(internedTestCase, internedSolution);
        }//private void DoTest() {
    }//public class AlternatingSumsTests {
}//namespace Algorithms.src_UnitTests._0_intro._03_exploring_the_waters {
