using Algorithms.src.helper_functions;
using Algorithms.src.interview_practice._0_Data_Structures._2_Hash_Tables;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._2_Hash_Tables {
    [TestClass()]
    public class GroupingDishesTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\interview_practice\\_0_Data_Structures\\_2_Hash_Tables\\GroupingDishes\\";
        private string[][] internedTestCase = new string[0][];
        private string[][] internedSolution = new string[0][];

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            string[][] testCase = { new string[] { "Salad", "Tomato", "Cucumber", "Salad", "Sauce" }, new string[] { "Pizza", "Tomato", "Sausage", "Sauce", "Dough" }, new string[] { "Quesadilla", "Chicken", "Cheese", "Sauce" }, new string[] { "Sandwich", "Salad", "Bread", "Tomato", "Cheese" } };
            string[][] solution = { new string[] { "Cheese", "Quesadilla", "Sandwich" }, new string[] { "Salad", "Salad", "Sandwich" }, new string[] { "Sauce", "Pizza", "Quesadilla", "Salad" }, new string[] { "Tomato", "Pizza", "Salad", "Sandwich" } };
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            string[][] testCase = { new string[] { "Pasta", "Tomato Sauce", "Onions", "Garlic" }, new string[] { "Chicken Curry", "Chicken", "Curry Sauce" }, new string[] { "Fried Rice", "Rice", "Onions", "Nuts" }, new string[] { "Salad", "Spinach", "Nuts" }, new string[] { "Sandwich", "Cheese", "Bread" }, new string[] { "Quesadilla", "Chicken", "Cheese" } };
            string[][] solution = { new string[] { "Cheese", "Quesadilla", "Sandwich" }, new string[] { "Chicken", "Chicken Curry", "Quesadilla" }, new string[] { "Nuts", "Fried Rice", "Salad" }, new string[] { "Onions", "Fried Rice", "Pasta" } };
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            string[][] testCase = { new string[] { "Pasta", "Tomato Sauce", "Onions", "Garlic" }, new string[] { "Chicken Curry", "Chicken", "Curry Sauce" }, new string[] { "Fried Rice", "Rice", "Onion", "Nuts" }, new string[] { "Salad", "Spinach", "Nut" }, new string[] { "Sandwich", "Cheese", "Bread" }, new string[] { "Quesadilla", "Chickens", "Cheeseeee" } };
            string[][] solution = { };
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            string[][] testCase = { new string[] { "First", "a", "b", "c", "d", "e", "f", "g", "h", "i" }, new string[] { "Second", "i", "h", "g", "f", "e", "x", "c", "b", "a" } };
            string[][] solution = { new string[] { "a", "First", "Second" }, new string[] { "b", "First", "Second" }, new string[] { "c", "First", "Second" }, new string[] { "e", "First", "Second" }, new string[] { "f", "First", "Second" }, new string[] { "g", "First", "Second" }, new string[] { "h", "First", "Second" }, new string[] { "i", "First", "Second" } };
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            string[][] testCase = { new string[] { "dSaLKJGbxlxcBBv kMNOmzdojCluYeCb", "zjxwKcRmpQTPSPRUKLfAhkIXxfzniZjsDfaKOJOcVDaxAnCF" }, new string[] { "R GBgXIv", "fPhNHIdOTeKPnqaIPAYXScGrDyGWwlqktYtyOzondayKp", "xJ hfufIWL", "YduFVZrZEeqVmvACdSTdQd uMswBcadvet", "WHYOLUzwSHKUuCNry" }, new string[] { "kvHxWutzASOCBHV", "wpzmQKLROsw ", "sxgFkhrwFKB", "reRqP TFlpmiQa GoZTuErWVB", "LA", "BGQgMdEGXutmmE InKtapSHbwZlPHrvPwbSmRWclamnTW", "QgBClPTxsIpAl", "SWbXtEIFeVqoUgtSfXKcVmnwDrijLYsPeXfUauFVbBkbEmGDa" }, new string[] { "Hgpu", "fvORUPNvHmBtpKpbTRbmdXzicYOZotLmfoLmQIqBInPnbCFN", "WHYOLUzwSHKUuCNry" }, new string[] { "gZxWYomyYO", "fvORUPNvHmBtpKpbTRbmdXzicYOZotLmfoLmQIqBInPnbCFN", "YduFVZrZEeqVmvACdSTdQd uMswBcadvet", "XxRAIFwrGmaarKfz", "yJffViKwbqCATxHcQFDLgMX", "poEnqRtrANh", "QgBClPTxsIpAl", "dyqdvHDdflvzxVAGRyxWPMBtIDJhv paNyJbWab" }, new string[] { "rMSYkYkFKlcdBTrUpCTdFgEIdgdTOcEucJdPqiLUWUZNjcoL", "YduFVZrZEeqVmvACdSTdQd uMswBcadvet", "QgBClPTxsIpAl", "fPhNHIdOTeKPnqaIPAYXScGrDyGWwlqktYtyOzondayKp", "udzzsbLVValZOWpRLhUKumkROw", "dyqdvHDdflvzxVAGRyxWPMBtIDJhv paNyJbWab", "WHYOLUzwSHKUuCNry", "LA", "fvORUPNvHmBtpKpbTRbmdXzicYOZotLmfoLmQIqBInPnbCFN" }, new string[] { "GrWh ROg zHXhYguurdcGjNAv", "dyqdvHDdflvzxVAGRyxWPMBtIDJhv paNyJbWab", "YduFVZrZEeqVmvACdSTdQd uMswBcadvet", "AQglifKDgZIivthzfoWRklaKs", "UcIBqQckdEJgLeWMlaRPlqfkhVRXjtZHAYDVRhPsFqPOuEVN", "LA", "MWhqbkFrSTnOuWKexjPewdd AOISBnSCilJ", "QgBClPTxsIpAl" }, new string[] { "dLuvsltPzUjfXkynBCMgxBUTXhVCd", "udzzsbLVValZOWpRLhUKumkROw", "BGQgMdEGXutmmE InKtapSHbwZlPHrvPwbSmRWclamnTW", "BjRRCVKznaySRzyAuNxAbkSYTmcUGlvOND", "wpzmQKLROsw ", "qLKOIfeBowxWwxPJWrWjtVXMkG NXOLxYxvCKoAagSHYRxVgK", "WdfleYASWwVMQKoBINhwpjDbVBEaOOogkKMZ", "AQglifKDgZIivthzfoWRklaKs", "qRUsCllaFzNWuXIMvbOsNtTTAlbR" }, new string[] { "jOubIROdYWOKxwbZTLDueBiln", "fTUBneoUSWxFERZjwPMrAQq", "NPuomEOeOXBiozrNZXlXcKKB", "ibogPWJoEbermlJfuizYaE", "zpNFvjef mpEbEqy rdudPTGpzo n FwxTA" }, new string[] { "BiNYUHMFrRoSICZ", "ufYAxvBidQjinsDCurHyjlzRHrOQ MbIVKGLwAq", "nvHaaRJdHgRIgXXQteAchX MKldBbM", "TdBMoUrYiEcJPlERejkAQdxYMTatLYXX", "qLKOIfeBowxWwxPJWrWjtVXMkG NXOLxYxvCKoAagSHYRxVgK" } };
            string[][] solution = { new string[] { "AQglifKDgZIivthzfoWRklaKs", "GrWh ROg zHXhYguurdcGjNAv", "dLuvsltPzUjfXkynBCMgxBUTXhVCd" }, new string[] { "BGQgMdEGXutmmE InKtapSHbwZlPHrvPwbSmRWclamnTW", "dLuvsltPzUjfXkynBCMgxBUTXhVCd", "kvHxWutzASOCBHV" }, new string[] { "LA", "GrWh ROg zHXhYguurdcGjNAv", "kvHxWutzASOCBHV", "rMSYkYkFKlcdBTrUpCTdFgEIdgdTOcEucJdPqiLUWUZNjcoL" }, new string[] { "QgBClPTxsIpAl", "GrWh ROg zHXhYguurdcGjNAv", "gZxWYomyYO", "kvHxWutzASOCBHV", "rMSYkYkFKlcdBTrUpCTdFgEIdgdTOcEucJdPqiLUWUZNjcoL" }, new string[] { "WHYOLUzwSHKUuCNry", "Hgpu", "R GBgXIv", "rMSYkYkFKlcdBTrUpCTdFgEIdgdTOcEucJdPqiLUWUZNjcoL" }, new string[] { "YduFVZrZEeqVmvACdSTdQd uMswBcadvet", "GrWh ROg zHXhYguurdcGjNAv", "R GBgXIv", "gZxWYomyYO", "rMSYkYkFKlcdBTrUpCTdFgEIdgdTOcEucJdPqiLUWUZNjcoL" }, new string[] { "dyqdvHDdflvzxVAGRyxWPMBtIDJhv paNyJbWab", "GrWh ROg zHXhYguurdcGjNAv", "gZxWYomyYO", "rMSYkYkFKlcdBTrUpCTdFgEIdgdTOcEucJdPqiLUWUZNjcoL" }, new string[] { "fPhNHIdOTeKPnqaIPAYXScGrDyGWwlqktYtyOzondayKp", "R GBgXIv", "rMSYkYkFKlcdBTrUpCTdFgEIdgdTOcEucJdPqiLUWUZNjcoL" }, new string[] { "fvORUPNvHmBtpKpbTRbmdXzicYOZotLmfoLmQIqBInPnbCFN", "Hgpu", "gZxWYomyYO", "rMSYkYkFKlcdBTrUpCTdFgEIdgdTOcEucJdPqiLUWUZNjcoL" }, new string[] { "qLKOIfeBowxWwxPJWrWjtVXMkG NXOLxYxvCKoAagSHYRxVgK", "BiNYUHMFrRoSICZ", "dLuvsltPzUjfXkynBCMgxBUTXhVCd" }, new string[] { "udzzsbLVValZOWpRLhUKumkROw", "dLuvsltPzUjfXkynBCMgxBUTXhVCd", "rMSYkYkFKlcdBTrUpCTdFgEIdgdTOcEucJdPqiLUWUZNjcoL" }, new string[] { "wpzmQKLROsw ", "dLuvsltPzUjfXkynBCMgxBUTXhVCd", "kvHxWutzASOCBHV" } };
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod]
        public void Test6() {
            SetTestCaseInfo("test-6.json");
            DoTest();
        }//public void Test6() {

        [TestMethod]
        public void Test7() {
            SetTestCaseInfo("test-7.json");
            DoTest();
        }//public void Test7() {

        [TestMethod]
        public void Test8() {
            SetTestCaseInfo("test-8.json");
            DoTest();
        }//public void Test8() {

        private void Test(string[][] testCase, string[][] solution) {
            string[][] actual = new GroupingDishes().groupingDishes(testCase);
            Assert.AreEqual(solution.Length, actual.Length);
            for(int i = 0; i < solution.Length; i++) {
                CollectionAssert.AreEqual(solution[i], actual[i],"At Index "+i);
            }//for(int i = 0; i < solution.Length; i++) {
        }//private void Test(string[][] testCase, string[][] solution) {

        private void SetTestCaseInfo(string fileName) {
            JObject o = Helpers.GetJsonObject(fileName, path);
            if (o == null) {
                Assert.Fail("JObject for " + fileName + " returns null");
            } else {//if (o == null) {
                JArray preSolution = (JArray)o["output"];
                internedSolution = new string[preSolution.Count][];
                for(int x = 0; x < internedSolution.Length; x++) {
                    internedSolution[x] = new string[((JArray)preSolution[x]).Count];
                    for (int y = 0; y < internedSolution[x].Length; y++) {
                        internedSolution[x][y] = (string)preSolution[x][y];
                    }//for (int y = 0; y < internedSolution[x].Length; y++) {
                }//for(int x = 0; x < internedSolution.Length; x++) {
                JArray preTestCase = (JArray)o["input"]["dishes"];
                internedTestCase = new string[preTestCase.Count][];
                for (int x = 0; x < internedTestCase.Length; x++) {
                    internedTestCase[x] = new string[((JArray)preTestCase[x]).Count];
                    for(int y = 0; y < internedTestCase[x].Length; y++) {
                        internedTestCase[x][y] = (string)preTestCase[x][y];
                    }//for(int y = 0; y < internedTestCase[x].Length; x++) {
                }//for (int x = 0; x < internedTestCase.Length; x++) {
            }//else {
        }//public void SetTestCaseInfo(string fileName) {

        [Timeout(timeout)]
        private void DoTest() {
            Test(internedTestCase, internedSolution);
        }//private void DoTest() {
    }//public class GroupingDishesTests {
}//namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._2_Hash_Tables {
