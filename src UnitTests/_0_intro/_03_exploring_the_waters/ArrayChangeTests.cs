using Algorithms.src._0_intro._03_exploring_the_waters;
using Algorithms.src.helper_functions;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests._0_intro._03_exploring_the_waters {
    [TestClass()]
    public class ArrayChangeTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\_0_intro\\_03_exploring_the_waters\\ArrayChange\\";
        private int[] internedTestCase = new int[0];
        private int internedSolution = 0;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase = { 1, 1, 1 };
            var solution = 3;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase = { -1000, 0, -2, 0 };
            var solution = 5;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase = { 2, 1, 10, 1 };
            var solution = 12;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase = { 2, 3, 3, 5, 5, 5, 4, 12, 12, 10, 15 };
            var solution = 13;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase = { 3122, -645, 2616, 13213, -8069 };
            var solution = 25559;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase = { -787, -773, -93, 867, -28, 118, 372, 255, 355, 598, -179, -752, 794, 961, -84, 296, -714, 14, 666, -265, -905, 942, -691, -379, -698, -650, 637, 523, 709, -674, 574, -239, 805, -434, 597, -677, 664, 384, 726, -389, -387, 772, -603, 685, 249, 446, -631, 454, 983, 867, -158, 932, -440, 891, -12, 400, -916, 503, 185, -802, -255, 207, -952, -506, -689, 425, 747, -907, -30, 102, 553, 981, -664, 75, -957, -42, 99, -750, -277, 686, -884, -972, 470, 32, 439, 163, 887, 895, -555, -654, 793, 333, 143, 73, 181, -512, -915, -68, 542, 799 };
            var solution = 89510;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase = { -28943, -29728, -24726, -15090, -2555, -9551, -11025, 36442, -23240, -46093, 48516, 44580, -21573, 39172, -38017, -19354, -13460, 38212, -35646, -22288, 36832, -33115, 39055, -15935, -19300, -10419, -18548, 21742, -32032, 27988, -45323, 27454, -5683, -14209, -4168, 51188, 45552, 9899, 49241, -25939, -8344, -25788, 6808, 6931, 6145, -30802, -518, -42362 };
            var solution = 2020705;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase = { 9796, 1283, -2825, 3870, -6727, -8616, -10191, -7727, 7074, 1580, -4583, 162, 2980, -3861, 9452, 8145, 1222, -1125, 5142, -5657, -974, -986, -9627, 5244, 8866, 3336, -9946, -5271, 10582, 3013, 8030, 4471, -3420, 9496, -3533, -8030, 10007, 2549, -8195, 7119, 302, -5322, -3537, 209, -8134, -9176, 6336, -1771, 9851, 3644, 9629, -2603, 3988, 10579, 2221, 1101, 1465, 5002, -6203, -8864, 596, 6005, 4554, 8526, 2178, -5447, -232, -9734, 7402, -3984, -7161, -2139, -3181, 10445, 4535, 6926, 7156 };
            var solution = 737073;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[] testCase = { -24875, -6401, 58256, 44456, 2244, -25333, -42389, -5975, 7650, -46343, -62011, -55366, 7802, -37699, 15461, 13309, -58664, 54557, 56324, -34397, -33024, -21934, -18861, -23196, 56542, -63986, 59833, -45610, -16948, 399, -7405, 54701, -57348, -32627, 65534, 615 };
            var solution = 2199614;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod]
        public void Test10() {
            SetTestCaseInfo("test-10.json");
            DoTest();
        }//public void Test10() {

        [TestMethod]
        public void Test11() {
            SetTestCaseInfo("test-11.json");
            DoTest();
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            int[] testCase = { 20710, -4566, 28514, -27877, 10082, -22496, -22994, 5089, 11296, -24822, -16624, -17015, 12477, 29805, 31185, 16492, 564, -413, -28417, 1992, -28897, 31399, 19780, 9900, -17980 };
            var solution = 711669;
            Test(testCase, solution);
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

        [TestMethod]
        public void Test16() {
            SetTestCaseInfo("test-16.json");
            DoTest();
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            int[] testCase = { 1976, 4676, 4653, 1782, 180, -4162, -5308, 968, -2405, 4100, 4435, 1326, 3731, -4483, 1419, 1311, 4747, 5211, -312, 5322, -5724, -994, 5914, -4059, -1169, -5361, -1519, -2298, 5118, -283, -2905 };
            var solution = 140735;
            Test(testCase, solution);
        }//public void Test17() {

        [TestMethod]
        public void Test18() {
            SetTestCaseInfo("test-18.json");
            DoTest();
        }//public void Test18() {

        [TestMethod]
        public void Test19() {
            SetTestCaseInfo("test-19.json");
            DoTest();
        }//public void Test19() {

        [TestMethod]
        public void Test20() {
            SetTestCaseInfo("test-20.json");
            DoTest();
        }//public void Test20() {

        private void Test(int[] testCase, int solution) {
            Assert.AreEqual(solution, new ArrayChange().arrayChange(testCase));
        }//private void Test(int[] testCase,int solution) {

        private void SetTestCaseInfo(string fileName) {
            JObject o = Helpers.GetJsonObject(fileName, path);
            if (o == null) {
                Assert.Fail("JObject for " + fileName + " returns null");
            } else {//if (o == null) {
                internedSolution = (int)o["output"];
                JArray preTestCase = (JArray)o["input"]["inputArray"];
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
    }//public class ArrayChangeTests {
}//namespace Algorithms.src_UnitTests._0_intro._03_exploring_the_waters {