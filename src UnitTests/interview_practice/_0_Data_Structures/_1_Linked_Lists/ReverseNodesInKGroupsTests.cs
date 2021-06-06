using Algorithms.src.helper_functions;
using Algorithms.src.interview_practice._0_Data_Structures._1_Linked_Lists;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._1_Linked_Lists {
    [TestClass()]
    public class ReverseNodesInKGroupsTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\interview_practice\\_0_Data_Structures\\_1_Linked_Lists\\ReverseNodesInKGroups\\";
        private ListNode<int> internedTestCase1 = null;
        private int internedTestCase2 = 0;
        private ListNode<int> internedSolution = null;

        [TestMethod]
        public void Test1() {
            int[] preTestCase1 = { 1, 2, 3, 4, 5 };
            int[] preSolution = { 2, 1, 4, 3, 5 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 2;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test1() {

        [TestMethod]
        public void Test2() {
            int[] preTestCase1 = { 1, 2, 3, 4, 5 };
            int[] preSolution = { 1, 2, 3, 4, 5 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 1;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test2() {

        [TestMethod]
        public void Test3() {
            int[] preTestCase1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
            int[] preSolution = { 3, 2, 1, 6, 5, 4, 9, 8, 7, 10, 11 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 3;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test3() {

        [TestMethod]
        public void Test4() {
            int[] preTestCase1 = { 239 };
            int[] preSolution = { 239 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 1;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test4() {

        [TestMethod]
        public void Test5() {
            int[] preTestCase1 = { 1, 2, 3, 4 };
            int[] preSolution = { 2, 1, 4, 3 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 2;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test5() {

        [TestMethod]
        public void Test6() {
            int[] preTestCase1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
            int[] preSolution = { 3, 2, 1, 6, 5, 4, 9, 8, 7, 12, 11, 10 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 3;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test6() {

        [TestMethod]
        public void Test7() {
            int[] preTestCase1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
            int[] preSolution = { 4, 3, 2, 1, 8, 7, 6, 5, 12, 11, 10, 9 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 4;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test7() {

        [TestMethod]
        public void Test8() {
            int[] preTestCase1 = { 1000000000, -849483855, -1000000000, 376365554, -847904832 };
            int[] preSolution = { 376365554, -1000000000, -849483855, 1000000000, -847904832 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 4;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test8() {

        [TestMethod]
        public void Test9() {
            int[] preTestCase1 = { 376365554, -340557143, -849483855, 810952169, -847904832 };
            int[] preSolution = { 810952169, -849483855, -340557143, 376365554, -847904832 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 4;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test9() {

        [TestMethod]
        public void Test10() {
            int[] preTestCase1 = { 810952169, -849483855, -340557143, 376365554, -847904832 };
            int[] preSolution = { -849483855, 810952169, 376365554, -340557143, -847904832 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 2;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test10() {

        [TestMethod]
        public void Test11() {
            int[] preTestCase1 = { -503549928, -526666356, 262916773, -508129645, 992040586, 867794712, 24042453, -540165420, -417669299, 766910780 };
            int[] preSolution = { -526666356, -503549928, -508129645, 262916773, 867794712, 992040586, -540165420, 24042453, 766910780, -417669299 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 2;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test11() {

        [TestMethod]
        public void Test12() {
            int[] preTestCase1 = { -526666356, -503549928, -508129645, 262916773, 867794712, 992040586, -540165420, 24042453, 766910780, -417669299 };
            int[] preSolution = { 24042453, -540165420, 992040586, 867794712, 262916773, -508129645, -503549928, -526666356, 766910780, -417669299 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 8;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test12() {

        [TestMethod]
        public void Test13() {
            int[] preTestCase1 = { 24042453, -540165420, 992040586, 867794712, 262916773, -508129645, -503549928, -526666356, 766910780, -417669299 };
            int[] preSolution = { -508129645, 262916773, 867794712, 992040586, -540165420, 24042453, -503549928, -526666356, 766910780, -417669299 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 6;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test13() {

        [TestMethod]
        public void Test14() {
            int[] preTestCase1 = { 982985210, -609895784, -987653274, -454081152, 201201346, 241342809, -477449523, 549897167, 170436491, 443055473, 352969511, 908186367, 259057434, 29132638, 149369518, 801058084, 335064633, 431522687, 781795940, 523774860, 248055823, -261698071, -755135878, -771948253, 499722685, -247500361, 721729134, -327889421, 757902657, -436109776, 850654465, 408514637, 986104988, -193605892, -995985422, 365989992, -587001029, 799716411, 143522736, 546077164, 29152840, 814044738, 223747008, -356032464, 204829762, 794032902, -558212044, 822910947, 529454841, -949416077 };
            int[] preSolution = { -454081152, -987653274, -609895784, 982985210, 549897167, -477449523, 241342809, 201201346, 908186367, 352969511, 443055473, 170436491, 801058084, 149369518, 29132638, 259057434, 523774860, 781795940, 431522687, 335064633, -771948253, -755135878, -261698071, 248055823, -327889421, 721729134, -247500361, 499722685, 408514637, 850654465, -436109776, 757902657, 365989992, -995985422, -193605892, 986104988, 546077164, 143522736, 799716411, -587001029, -356032464, 223747008, 814044738, 29152840, 822910947, -558212044, 794032902, 204829762, 529454841, -949416077 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 4;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test14() {

        [TestMethod]
        public void Test15() {
            int[] preTestCase1 = { -454081152, -987653274, -609895784, 982985210, 549897167, -477449523, 241342809, 201201346, 908186367, 352969511, 443055473, 170436491, 801058084, 149369518, 29132638, 259057434, 523774860, 781795940, 431522687, 335064633, -771948253, -755135878, -261698071, 248055823, -327889421, 721729134, -247500361, 499722685, 408514637, 850654465, -436109776, 757902657, 365989992, -995985422, -193605892, 986104988, 546077164, 143522736, 799716411, -587001029, -356032464, 223747008, 814044738, 29152840, 822910947, -558212044, 794032902, 204829762, 529454841, -949416077 };
            int[] preSolution = { -771948253, 335064633, 431522687, 781795940, 523774860, 259057434, 29132638, 149369518, 801058084, 170436491, 443055473, 352969511, 908186367, 201201346, 241342809, -477449523, 549897167, 982985210, -609895784, -987653274, -454081152, 223747008, -356032464, -587001029, 799716411, 143522736, 546077164, 986104988, -193605892, -995985422, 365989992, 757902657, -436109776, 850654465, 408514637, 499722685, -247500361, 721729134, -327889421, 248055823, -261698071, -755135878, 814044738, 29152840, 822910947, -558212044, 794032902, 204829762, 529454841, -949416077 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 21;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test15() {

        [TestMethod]
        public void Test16() {
            int[] preTestCase1 = { -771948253, 335064633, 431522687, 781795940, 523774860, 259057434, 29132638, 149369518, 801058084, 170436491, 443055473, 352969511, 908186367, 201201346, 241342809, -477449523, 549897167, 982985210, -609895784, -987653274, -454081152, 223747008, -356032464, -587001029, 799716411, 143522736, 546077164, 986104988, -193605892, -995985422, 365989992, 757902657, -436109776, 850654465, 408514637, 499722685, -247500361, 721729134, -327889421, 248055823, -261698071, -755135878, 814044738, 29152840, 822910947, -558212044, 794032902, 204829762, 529454841, -949416077 };
            int[] preSolution = { 794032902, -558212044, 822910947, 29152840, 814044738, -755135878, -261698071, 248055823, -327889421, 721729134, -247500361, 499722685, 408514637, 850654465, -436109776, 757902657, 365989992, -995985422, -193605892, 986104988, 546077164, 143522736, 799716411, -587001029, -356032464, 223747008, -454081152, -987653274, -609895784, 982985210, 549897167, -477449523, 241342809, 201201346, 908186367, 352969511, 443055473, 170436491, 801058084, 149369518, 29132638, 259057434, 523774860, 781795940, 431522687, 335064633, -771948253, 204829762, 529454841, -949416077 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 47;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test16() {

        [TestMethod]
        public void Test17() {
            int[] preTestCase1 = { -252288244, -304723934, 204042102, -950562741, 787551241, -686871251, -667514043, -494826625, -40599485, -506462265, -23888334, 503514240, -120325155, 24098379, 591160751, 542656985, -915208241, -289936056, 613895846, 40460811, 341214789, 926721862, 335002396, 168726624, 292499588, -955003945, -800296467, 632291304, -406560358, -748089812, 639413215, 478320089, 946184359, 307558447, 940880115, -326701098, -390055828, -545191637, 508913894, -192941437, 417965683, -921418782, -478734615, -289725083, 168858778, 860591309, 359228731, -733782678, 404223954, 731826637, 795149053, 154692277, -396747896, 607757047, -737346024, 191657520, -244257191, 323278603, 77303794, 922709527, -994896484, 138880295, 96368424, -396233193, 205750029, -818970563, 681331955, 357551888, 134240728, -715919020, -772568101, -413489597, -210940346, 811424677, 595681725, 123208480, 20245540, 98755541, 614788152, 10536606, 724158720, 110992146, 804250037, 115346875, -669676299, -131578161, 246114268, 386026718, 146708327, 631009821, 469799373, -36579924, 364238098, -615292885, -547883123, -9306886, -179870247, 588092242, 987215675, -201877463 };
            int[] preSolution = { 787551241, -950562741, 204042102, -304723934, -252288244, -506462265, -40599485, -494826625, -667514043, -686871251, 591160751, 24098379, -120325155, 503514240, -23888334, 40460811, 613895846, -289936056, -915208241, 542656985, 292499588, 168726624, 335002396, 926721862, 341214789, -748089812, -406560358, 632291304, -800296467, -955003945, 940880115, 307558447, 946184359, 478320089, 639413215, -192941437, 508913894, -545191637, -390055828, -326701098, 168858778, -289725083, -478734615, -921418782, 417965683, 731826637, 404223954, -733782678, 359228731, 860591309, -737346024, 607757047, -396747896, 154692277, 795149053, 922709527, 77303794, 323278603, -244257191, 191657520, 205750029, -396233193, 96368424, 138880295, -994896484, -715919020, 134240728, 357551888, 681331955, -818970563, 595681725, 811424677, -210940346, -413489597, -772568101, 10536606, 614788152, 98755541, 20245540, 123208480, -669676299, 115346875, 804250037, 110992146, 724158720, 631009821, 146708327, 386026718, 246114268, -131578161, -547883123, -615292885, 364238098, -36579924, 469799373, -201877463, 987215675, 588092242, -179870247, -9306886 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 5;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test17() {

        [TestMethod]
        public void Test18() {
            int[] preTestCase1 = { 787551241, -950562741, 204042102, -304723934, -252288244, -506462265, -40599485, -494826625, -667514043, -686871251, 591160751, 24098379, -120325155, 503514240, -23888334, 40460811, 613895846, -289936056, -915208241, 542656985, 292499588, 168726624, 335002396, 926721862, 341214789, -748089812, -406560358, 632291304, -800296467, -955003945, 940880115, 307558447, 946184359, 478320089, 639413215, -192941437, 508913894, -545191637, -390055828, -326701098, 168858778, -289725083, -478734615, -921418782, 417965683, 731826637, 404223954, -733782678, 359228731, 860591309, -737346024, 607757047, -396747896, 154692277, 795149053, 922709527, 77303794, 323278603, -244257191, 191657520, 205750029, -396233193, 96368424, 138880295, -994896484, -715919020, 134240728, 357551888, 681331955, -818970563, 595681725, 811424677, -210940346, -413489597, -772568101, 10536606, 614788152, 98755541, 20245540, 123208480, -669676299, 115346875, 804250037, 110992146, 724158720, 631009821, 146708327, 386026718, 246114268, -131578161, -547883123, -615292885, 364238098, -36579924, 469799373, -201877463, 987215675, 588092242, -179870247, -9306886 };
            int[] preSolution = { 154692277, -396747896, 607757047, -737346024, 860591309, 359228731, -733782678, 404223954, 731826637, 417965683, -921418782, -478734615, -289725083, 168858778, -326701098, -390055828, -545191637, 508913894, -192941437, 639413215, 478320089, 946184359, 307558447, 940880115, -955003945, -800296467, 632291304, -406560358, -748089812, 341214789, 926721862, 335002396, 168726624, 292499588, 542656985, -915208241, -289936056, 613895846, 40460811, -23888334, 503514240, -120325155, 24098379, 591160751, -686871251, -667514043, -494826625, -40599485, -506462265, -252288244, -304723934, 204042102, -950562741, 787551241, 795149053, 922709527, 77303794, 323278603, -244257191, 191657520, 205750029, -396233193, 96368424, 138880295, -994896484, -715919020, 134240728, 357551888, 681331955, -818970563, 595681725, 811424677, -210940346, -413489597, -772568101, 10536606, 614788152, 98755541, 20245540, 123208480, -669676299, 115346875, 804250037, 110992146, 724158720, 631009821, 146708327, 386026718, 246114268, -131578161, -547883123, -615292885, 364238098, -36579924, 469799373, -201877463, 987215675, 588092242, -179870247, -9306886 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 54;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test18() {

        [TestMethod]
        public void Test19() {
            int[] preTestCase1 = { 154692277, -396747896, 607757047, -737346024, 860591309, 359228731, -733782678, 404223954, 731826637, 417965683, -921418782, -478734615, -289725083, 168858778, -326701098, -390055828, -545191637, 508913894, -192941437, 639413215, 478320089, 946184359, 307558447, 940880115, -955003945, -800296467, 632291304, -406560358, -748089812, 341214789, 926721862, 335002396, 168726624, 292499588, 542656985, -915208241, -289936056, 613895846, 40460811, -23888334, 503514240, -120325155, 24098379, 591160751, -686871251, -667514043, -494826625, -40599485, -506462265, -252288244, -304723934, 204042102, -950562741, 787551241, 795149053, 922709527, 77303794, 323278603, -244257191, 191657520, 205750029, -396233193, 96368424, 138880295, -994896484, -715919020, 134240728, 357551888, 681331955, -818970563, 595681725, 811424677, -210940346, -413489597, -772568101, 10536606, 614788152, 98755541, 20245540, 123208480, -669676299, 115346875, 804250037, 110992146, 724158720, 631009821, 146708327, 386026718, 246114268, -131578161, -547883123, -615292885, 364238098, -36579924, 469799373, -201877463, 987215675, 588092242, -179870247, -9306886 };
            int[] preSolution = { -201877463, 469799373, -36579924, 364238098, -615292885, -547883123, -131578161, 246114268, 386026718, 146708327, 631009821, 724158720, 110992146, 804250037, 115346875, -669676299, 123208480, 20245540, 98755541, 614788152, 10536606, -772568101, -413489597, -210940346, 811424677, 595681725, -818970563, 681331955, 357551888, 134240728, -715919020, -994896484, 138880295, 96368424, -396233193, 205750029, 191657520, -244257191, 323278603, 77303794, 922709527, 795149053, 787551241, -950562741, 204042102, -304723934, -252288244, -506462265, -40599485, -494826625, -667514043, -686871251, 591160751, 24098379, -120325155, 503514240, -23888334, 40460811, 613895846, -289936056, -915208241, 542656985, 292499588, 168726624, 335002396, 926721862, 341214789, -748089812, -406560358, 632291304, -800296467, -955003945, 940880115, 307558447, 946184359, 478320089, 639413215, -192941437, 508913894, -545191637, -390055828, -326701098, 168858778, -289725083, -478734615, -921418782, 417965683, 731826637, 404223954, -733782678, 359228731, 860591309, -737346024, 607757047, -396747896, 154692277, 987215675, 588092242, -179870247, -9306886 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 96;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test19() {

        [TestMethod]
        public void Test20() {
            SetTestCaseInfo("test-20.json");
            DoTest();
        }//public void Test20() {

        [TestMethod]
        public void Test21() {
            SetTestCaseInfo("test-21.json");
            DoTest();
        }//public void Test21() {

        [TestMethod]
        public void Test22() {
            SetTestCaseInfo("test-22.json");
            DoTest();
        }//public void Test22() {

        [TestMethod]
        public void Test23() {
            SetTestCaseInfo("test-23.json");
            DoTest();
        }//public void Test23() {

        [TestMethod]
        public void Test24() {
            SetTestCaseInfo("test-24.json");
            DoTest();
        }//public void Test24() {

        [TestMethod]
        public void Test25() {
            SetTestCaseInfo("test-25.json");
            DoTest();
        }//public void Test25() {

        private void Test(ListNode<int> testCase1, int testCase2, ListNode<int> solution) {
            ListNode<int> Actual = new ReverseNodesInKGroups().reverseNodesInKGroups(testCase1, testCase2);
            while (solution != null && Actual != null) {
                Assert.AreEqual(solution.value, Actual.value);
                solution = solution.next;
                Actual = Actual.next;
            }//while (solution != null && Actual != null) {
            Assert.IsTrue(solution == null && Actual == null);
        }//private void Test(ListNode<int> testCase1, int testCase2, ListNode<int> solution) {

        private void SetTestCaseInfo(string fileName) {
            JObject o = Helpers.GetJsonObject(fileName, path);
            if (o == null) {
                Assert.Fail("JObject for " + fileName + " returns null");
            } else {//if (o == null) {
                JArray preSolution = (JArray)o["output"];
                int[] preInternedSolution = new int[preSolution.Count];
                for(int i = 0; i < preInternedSolution.Length; i++) {
                    preInternedSolution[i] = (int)preSolution[i];
                }//for(int i = 0; i < preInternedSolution.Length; i++) {
                JArray preTestCase1 = (JArray)o["input"]["l"];
                int[] preInternedTestCase1 = new int[preTestCase1.Count];
                for (int i = 0; i < preInternedTestCase1.Length; i++) {
                    preInternedTestCase1[i] = (int)preTestCase1[i];
                }//for (int i = 0; i < internedTestCase.Length; i++) {
                internedTestCase1 = ListNodeBuilder.CollectionToListNode(preInternedTestCase1);
                internedTestCase2 = (int)o["input"]["k"];
                internedSolution = ListNodeBuilder.CollectionToListNode(preInternedSolution);
            }//else {
        }//public void SetTestCaseInfo(string fileName) {

        [Timeout(timeout)]
        private void DoTest() {
            Test(internedTestCase1, internedTestCase2, internedSolution);
        }//private void DoTest() {
    }//public class ReverseNodesInKGroupsTests {
}//namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._1_Linked_Lists {
