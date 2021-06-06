using Algorithms.src.helper_functions;
using Algorithms.src.interview_practice._0_Data_Structures._1_Linked_Lists;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._1_Linked_Lists {
    [TestClass()]
    public class AddTwoHugeNumbersTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\interview_practice\\_0_Data_Structures\\_1_Linked_Lists\\AddTwoHugeNumbers\\";
        private ListNode<int> internedTestCase1 = null;
        private ListNode<int> internedTestCase2 = null;
        private ListNode<int> internedSolution = null;

        [TestMethod]
        public void Test1() {
            int[] preTestCase1 = { 9876, 5432, 1999 };
            int[] preTestCase2 = { 1, 8001 };
            int[] preSolution = { 9876, 5434, 0 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test1() {

        [TestMethod]
        public void Test2() {
            int[] preTestCase1 = { 123, 4, 5 };
            int[] preTestCase2 = { 100, 100, 100 };
            int[] preSolution = { 223, 104, 105 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test2() {

        [TestMethod]
        public void Test3() {
            int[] preTestCase1 = { 0 };
            int[] preTestCase2 = { 0 };
            int[] preSolution = { 0 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test3() {

        [TestMethod]
        public void Test4() {
            int[] preTestCase1 = { 1234, 1234, 0 };
            int[] preTestCase2 = { 0 };
            int[] preSolution = { 1234, 1234, 0 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test4() {

        [TestMethod]
        public void Test5() {
            int[] preTestCase1 = { 0 };
            int[] preTestCase2 = { 1234, 123, 0 };
            int[] preSolution = { 1234, 123, 0 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test5() {

        [TestMethod]
        public void Test6() {
            int[] preTestCase1 = { 1 };
            int[] preTestCase2 = { 9998, 9999, 9999, 9999, 9999, 9999 };
            int[] preSolution = { 9999, 0, 0, 0, 0, 0 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test6() {

        [TestMethod]
        public void Test7() {
            int[] preTestCase1 = { 1 };
            int[] preTestCase2 = { 9999, 9999, 9999, 9999, 9999, 9999 };
            int[] preSolution = { 1, 0, 0, 0, 0, 0, 0 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test7() {

        [TestMethod]
        public void Test8() {
            int[] preTestCase1 = { 8339, 4510 };
            int[] preTestCase2 = { 2309 };
            int[] preSolution = { 8339, 6819 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test8() {

        [TestMethod]
        public void Test9() {
            int[] preTestCase1 = { 9665 };
            int[] preTestCase2 = { 6933, 8443, 5132, 6809, 8519, 9096 };
            int[] preSolution = { 6933, 8443, 5132, 6809, 8520, 8761 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test9() {

        [TestMethod]
        public void Test10() {
            int[] preTestCase1 = { 626, 6726, 9980, 9738, 4562, 6376, 8940, 6921, 1676, 1107, 8959, 4623, 4324, 9083, 7716, 7800, 8042, 4337, 3616, 7983, 9701, 3275, 5680, 802, 2485, 4473, 7661, 9235, 5797, 5042, 7365, 3106, 7361, 2724, 5328, 8525, 7103, 755, 947, 7898 };
            int[] preTestCase2 = { 9651, 8173, 5384, 7798, 8467, 2360, 3375, 9054, 1161, 9880, 1427, 6573, 5907, 9061, 7900, 6516, 6546, 293, 3877, 9453, 4289, 4829, 7563, 4308, 7845, 4840, 3279, 7186, 9917, 25, 4220, 9052, 6867, 8567, 8308, 5917, 7251, 7236, 2581, 8901, 8372 };
            int[] preSolution = { 9651, 8800, 2111, 7779, 8205, 6922, 9752, 7994, 8083, 1556, 2535, 5533, 531, 3386, 6984, 4233, 4346, 8335, 8215, 3070, 2273, 4531, 838, 9988, 8647, 7325, 7753, 4848, 9152, 5822, 9263, 6417, 9974, 5929, 1033, 1246, 5777, 4339, 3336, 9849, 6270 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test10() {

        [TestMethod]
        public void Test11() {
            int[] preTestCase1 = { 1000, 8602, 8250, 7667, 4160, 3023, 2349, 9780, 2843, 6174, 4631, 5051, 4090, 4611, 5484, 7433, 1262, 8203, 7126, 1702, 3654, 7627, 7854 };
            int[] preTestCase2 = { 4452, 3300, 7905, 6154, 5614, 7477, 4199, 8120, 5023, 4389, 3586, 4981, 3919, 7779, 679, 2740, 7353, 4785, 6616, 4336, 7620, 657, 5687, 9724, 5319, 9541, 6199, 1336, 9600, 2636, 7360, 3788, 3512, 8152, 2493, 252, 7038, 1047, 9058, 8625, 9351, 6331, 7743, 1766, 776, 7269, 7804, 2452, 1580, 4480, 9472, 9495, 3867, 5344, 5562, 4404, 1742, 4010, 6410, 7214, 6751, 1266, 1542, 6124, 3569, 9238, 9573, 2235, 2705, 3582, 4277 };
            int[] preSolution = { 4452, 3300, 7905, 6154, 5614, 7477, 4199, 8120, 5023, 4389, 3586, 4981, 3919, 7779, 679, 2740, 7353, 4785, 6616, 4336, 7620, 657, 5687, 9724, 5319, 9541, 6199, 1336, 9600, 2636, 7360, 3788, 3512, 8152, 2493, 252, 7038, 1047, 9058, 8625, 9351, 6331, 7743, 1766, 776, 7269, 7804, 2452, 2581, 3083, 7723, 7162, 8027, 8367, 7912, 4184, 4586, 185, 1042, 2266, 841, 5877, 7027, 3557, 4832, 7442, 6699, 3937, 6360, 1210, 2131 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
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
            int[] preTestCase1 = { 0 };
            int[] preTestCase2 = { 9999, 9999, 9998, 0 };
            int[] preSolution = { 9999, 9999, 9998, 0 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test15() {

        [TestMethod]
        public void Test16() {
            int[] preTestCase1 = { 1 };
            int[] preTestCase2 = { 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999 };
            int[] preSolution = { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test16() {

        private void Test(ListNode<int> testCase1, ListNode<int> testCase2, ListNode<int> solution) {
            ListNode<int> Actual = new AddTwoHugeNumbers().addTwoHugeNumbers(testCase1, testCase2);
            while (solution != null && Actual != null) {
                Assert.AreEqual(solution.value, Actual.value);
                solution = solution.next;
                Actual = Actual.next;
            }//while(Actual!=null){
            Assert.IsTrue(solution == null && Actual == null);
        }//private void Test(ListNode<int> testCase1, ListNode<int> testCase2, ListNode<int> solution) {

        private void SetTestCaseInfo(string fileName) {
            JObject o = Helpers.GetJsonObject(fileName, path);
            if (o == null) {
                Assert.Fail("JObject for " + fileName + " returns null");
            } else {//if (o == null) {
                JArray preSolution = (JArray)o["output"];
                int[] preInternedSolution = new int[preSolution.Count];
                for (int i = 0; i < preInternedSolution.Length; i++) {
                    preInternedSolution[i] = (int)preSolution[i];
                }//for(int i = 0; i < preInternedSolution.Length; i++) {
                JArray preTestCase1 = (JArray)o["input"]["a"];
                int[] preInternedTestCase1 = new int[preTestCase1.Count];
                for (int i = 0; i < preInternedTestCase1.Length; i++) {
                    preInternedTestCase1[i] = (int)preTestCase1[i];
                }//for (int i = 0; i < internedTestCase.Length; i++) {
                JArray preTestCase2 = (JArray)o["input"]["b"];
                int[] preInternedTestCase2 = new int[preTestCase2.Count];
                for (int i = 0; i < preInternedTestCase2.Length; i++) {
                    preInternedTestCase2[i] = (int)preTestCase2[i];
                }//for(int i = 0; i < preInternedTestCase2.Length; i++) {
                internedTestCase1 = ListNodeBuilder.CollectionToListNode(preInternedTestCase1);
                internedTestCase2 = ListNodeBuilder.CollectionToListNode(preInternedTestCase2);
                internedSolution = ListNodeBuilder.CollectionToListNode(preInternedSolution);
            }//else {
        }//public void SetTestCaseInfo(string fileName) {

        [Timeout(timeout)]
        private void DoTest() {
            Test(internedTestCase1, internedTestCase2, internedSolution);
        }//private void DoTest() {
    }//public class AddTwoHugeNumbersTests {
}//namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._1_Linked_Lists {
