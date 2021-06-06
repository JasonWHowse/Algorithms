/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._1_Linked_Lists;

import helper_functions.ListNode;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import java.time.Duration;

import static helper_functions.Helpers.getJsonObject;
import static helper_functions.ListNodeBuilder.CollectionToListNode;
import static org.junit.jupiter.api.Assertions.*;

class ReverseNodesInKGroupsTest {
    private final static String path = "Test_Cases\\interview_practice\\_0_Data_Structures\\_1_Linked_Lists\\ReverseNodesInKGroups\\";
    private ListNode<Integer> internedTestCase1 = null;
    private int internedTestCase2 = 0;
    private ListNode<Integer> internedSolution = null;

    @Test
    public void test1() {
        Integer[] preTestCase1 = { 1, 2, 3, 4, 5 };
        Integer[] preSolution = { 2, 1, 4, 3, 5 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 2;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test1() {

    @Test
    public void test2() {
        Integer[] preTestCase1 = { 1, 2, 3, 4, 5 };
        Integer[] preSolution = { 1, 2, 3, 4, 5 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 1;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test2() {

    @Test
    public void test3() {
        Integer[] preTestCase1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        Integer[] preSolution = { 3, 2, 1, 6, 5, 4, 9, 8, 7, 10, 11 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 3;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test3() {

    @Test
    public void test4() {
        Integer[] preTestCase1 = { 239 };
        Integer[] preSolution = { 239 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 1;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test4() {

    @Test
    public void test5() {
        Integer[] preTestCase1 = { 1, 2, 3, 4 };
        Integer[] preSolution = { 2, 1, 4, 3 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 2;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test5() {

    @Test
    public void test6() {
        Integer[] preTestCase1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        Integer[] preSolution = { 3, 2, 1, 6, 5, 4, 9, 8, 7, 12, 11, 10 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 3;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test6() {

    @Test
    public void test7() {
        Integer[] preTestCase1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        Integer[] preSolution = { 4, 3, 2, 1, 8, 7, 6, 5, 12, 11, 10, 9 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 4;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test7() {

    @Test
    public void test8() {
        Integer[] preTestCase1 = { 1000000000, -849483855, -1000000000, 376365554, -847904832 };
        Integer[] preSolution = { 376365554, -1000000000, -849483855, 1000000000, -847904832 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 4;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test8() {

    @Test
    public void test9() {
        Integer[] preTestCase1 = { 376365554, -340557143, -849483855, 810952169, -847904832 };
        Integer[] preSolution = { 810952169, -849483855, -340557143, 376365554, -847904832 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 4;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test9() {

    @Test
    public void test10() {
        Integer[] preTestCase1 = { 810952169, -849483855, -340557143, 376365554, -847904832 };
        Integer[] preSolution = { -849483855, 810952169, 376365554, -340557143, -847904832 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 2;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test10() {

    @Test
    public void test11() {
        Integer[] preTestCase1 = { -503549928, -526666356, 262916773, -508129645, 992040586, 867794712, 24042453, -540165420, -417669299, 766910780 };
        Integer[] preSolution = { -526666356, -503549928, -508129645, 262916773, 867794712, 992040586, -540165420, 24042453, 766910780, -417669299 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 2;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test11() {

    @Test
    public void test12() {
        Integer[] preTestCase1 = { -526666356, -503549928, -508129645, 262916773, 867794712, 992040586, -540165420, 24042453, 766910780, -417669299 };
        Integer[] preSolution = { 24042453, -540165420, 992040586, 867794712, 262916773, -508129645, -503549928, -526666356, 766910780, -417669299 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 8;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test12() {

    @Test
    public void test13() {
        Integer[] preTestCase1 = { 24042453, -540165420, 992040586, 867794712, 262916773, -508129645, -503549928, -526666356, 766910780, -417669299 };
        Integer[] preSolution = { -508129645, 262916773, 867794712, 992040586, -540165420, 24042453, -503549928, -526666356, 766910780, -417669299 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 6;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test13() {

    @Test
    public void test14() {
        Integer[] preTestCase1 = { 982985210, -609895784, -987653274, -454081152, 201201346, 241342809, -477449523, 549897167, 170436491, 443055473, 352969511, 908186367, 259057434, 29132638, 149369518, 801058084, 335064633, 431522687, 781795940, 523774860, 248055823, -261698071, -755135878, -771948253, 499722685, -247500361, 721729134, -327889421, 757902657, -436109776, 850654465, 408514637, 986104988, -193605892, -995985422, 365989992, -587001029, 799716411, 143522736, 546077164, 29152840, 814044738, 223747008, -356032464, 204829762, 794032902, -558212044, 822910947, 529454841, -949416077 };
        Integer[] preSolution = { -454081152, -987653274, -609895784, 982985210, 549897167, -477449523, 241342809, 201201346, 908186367, 352969511, 443055473, 170436491, 801058084, 149369518, 29132638, 259057434, 523774860, 781795940, 431522687, 335064633, -771948253, -755135878, -261698071, 248055823, -327889421, 721729134, -247500361, 499722685, 408514637, 850654465, -436109776, 757902657, 365989992, -995985422, -193605892, 986104988, 546077164, 143522736, 799716411, -587001029, -356032464, 223747008, 814044738, 29152840, 822910947, -558212044, 794032902, 204829762, 529454841, -949416077 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 4;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test14() {

    @Test
    public void test15() {
        Integer[] preTestCase1 = { -454081152, -987653274, -609895784, 982985210, 549897167, -477449523, 241342809, 201201346, 908186367, 352969511, 443055473, 170436491, 801058084, 149369518, 29132638, 259057434, 523774860, 781795940, 431522687, 335064633, -771948253, -755135878, -261698071, 248055823, -327889421, 721729134, -247500361, 499722685, 408514637, 850654465, -436109776, 757902657, 365989992, -995985422, -193605892, 986104988, 546077164, 143522736, 799716411, -587001029, -356032464, 223747008, 814044738, 29152840, 822910947, -558212044, 794032902, 204829762, 529454841, -949416077 };
        Integer[] preSolution = { -771948253, 335064633, 431522687, 781795940, 523774860, 259057434, 29132638, 149369518, 801058084, 170436491, 443055473, 352969511, 908186367, 201201346, 241342809, -477449523, 549897167, 982985210, -609895784, -987653274, -454081152, 223747008, -356032464, -587001029, 799716411, 143522736, 546077164, 986104988, -193605892, -995985422, 365989992, 757902657, -436109776, 850654465, 408514637, 499722685, -247500361, 721729134, -327889421, 248055823, -261698071, -755135878, 814044738, 29152840, 822910947, -558212044, 794032902, 204829762, 529454841, -949416077 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 21;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test15() {

    @Test
    public void test16() {
        Integer[] preTestCase1 = { -771948253, 335064633, 431522687, 781795940, 523774860, 259057434, 29132638, 149369518, 801058084, 170436491, 443055473, 352969511, 908186367, 201201346, 241342809, -477449523, 549897167, 982985210, -609895784, -987653274, -454081152, 223747008, -356032464, -587001029, 799716411, 143522736, 546077164, 986104988, -193605892, -995985422, 365989992, 757902657, -436109776, 850654465, 408514637, 499722685, -247500361, 721729134, -327889421, 248055823, -261698071, -755135878, 814044738, 29152840, 822910947, -558212044, 794032902, 204829762, 529454841, -949416077 };
        Integer[] preSolution = { 794032902, -558212044, 822910947, 29152840, 814044738, -755135878, -261698071, 248055823, -327889421, 721729134, -247500361, 499722685, 408514637, 850654465, -436109776, 757902657, 365989992, -995985422, -193605892, 986104988, 546077164, 143522736, 799716411, -587001029, -356032464, 223747008, -454081152, -987653274, -609895784, 982985210, 549897167, -477449523, 241342809, 201201346, 908186367, 352969511, 443055473, 170436491, 801058084, 149369518, 29132638, 259057434, 523774860, 781795940, 431522687, 335064633, -771948253, 204829762, 529454841, -949416077 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 47;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test16() {

    @Test
    public void test17() {
        Integer[] preTestCase1 = { -252288244, -304723934, 204042102, -950562741, 787551241, -686871251, -667514043, -494826625, -40599485, -506462265, -23888334, 503514240, -120325155, 24098379, 591160751, 542656985, -915208241, -289936056, 613895846, 40460811, 341214789, 926721862, 335002396, 168726624, 292499588, -955003945, -800296467, 632291304, -406560358, -748089812, 639413215, 478320089, 946184359, 307558447, 940880115, -326701098, -390055828, -545191637, 508913894, -192941437, 417965683, -921418782, -478734615, -289725083, 168858778, 860591309, 359228731, -733782678, 404223954, 731826637, 795149053, 154692277, -396747896, 607757047, -737346024, 191657520, -244257191, 323278603, 77303794, 922709527, -994896484, 138880295, 96368424, -396233193, 205750029, -818970563, 681331955, 357551888, 134240728, -715919020, -772568101, -413489597, -210940346, 811424677, 595681725, 123208480, 20245540, 98755541, 614788152, 10536606, 724158720, 110992146, 804250037, 115346875, -669676299, -131578161, 246114268, 386026718, 146708327, 631009821, 469799373, -36579924, 364238098, -615292885, -547883123, -9306886, -179870247, 588092242, 987215675, -201877463 };
        Integer[] preSolution = { 787551241, -950562741, 204042102, -304723934, -252288244, -506462265, -40599485, -494826625, -667514043, -686871251, 591160751, 24098379, -120325155, 503514240, -23888334, 40460811, 613895846, -289936056, -915208241, 542656985, 292499588, 168726624, 335002396, 926721862, 341214789, -748089812, -406560358, 632291304, -800296467, -955003945, 940880115, 307558447, 946184359, 478320089, 639413215, -192941437, 508913894, -545191637, -390055828, -326701098, 168858778, -289725083, -478734615, -921418782, 417965683, 731826637, 404223954, -733782678, 359228731, 860591309, -737346024, 607757047, -396747896, 154692277, 795149053, 922709527, 77303794, 323278603, -244257191, 191657520, 205750029, -396233193, 96368424, 138880295, -994896484, -715919020, 134240728, 357551888, 681331955, -818970563, 595681725, 811424677, -210940346, -413489597, -772568101, 10536606, 614788152, 98755541, 20245540, 123208480, -669676299, 115346875, 804250037, 110992146, 724158720, 631009821, 146708327, 386026718, 246114268, -131578161, -547883123, -615292885, 364238098, -36579924, 469799373, -201877463, 987215675, 588092242, -179870247, -9306886 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 5;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test17() {

    @Test
    public void test18() {
        Integer[] preTestCase1 = { 787551241, -950562741, 204042102, -304723934, -252288244, -506462265, -40599485, -494826625, -667514043, -686871251, 591160751, 24098379, -120325155, 503514240, -23888334, 40460811, 613895846, -289936056, -915208241, 542656985, 292499588, 168726624, 335002396, 926721862, 341214789, -748089812, -406560358, 632291304, -800296467, -955003945, 940880115, 307558447, 946184359, 478320089, 639413215, -192941437, 508913894, -545191637, -390055828, -326701098, 168858778, -289725083, -478734615, -921418782, 417965683, 731826637, 404223954, -733782678, 359228731, 860591309, -737346024, 607757047, -396747896, 154692277, 795149053, 922709527, 77303794, 323278603, -244257191, 191657520, 205750029, -396233193, 96368424, 138880295, -994896484, -715919020, 134240728, 357551888, 681331955, -818970563, 595681725, 811424677, -210940346, -413489597, -772568101, 10536606, 614788152, 98755541, 20245540, 123208480, -669676299, 115346875, 804250037, 110992146, 724158720, 631009821, 146708327, 386026718, 246114268, -131578161, -547883123, -615292885, 364238098, -36579924, 469799373, -201877463, 987215675, 588092242, -179870247, -9306886 };
        Integer[] preSolution = { 154692277, -396747896, 607757047, -737346024, 860591309, 359228731, -733782678, 404223954, 731826637, 417965683, -921418782, -478734615, -289725083, 168858778, -326701098, -390055828, -545191637, 508913894, -192941437, 639413215, 478320089, 946184359, 307558447, 940880115, -955003945, -800296467, 632291304, -406560358, -748089812, 341214789, 926721862, 335002396, 168726624, 292499588, 542656985, -915208241, -289936056, 613895846, 40460811, -23888334, 503514240, -120325155, 24098379, 591160751, -686871251, -667514043, -494826625, -40599485, -506462265, -252288244, -304723934, 204042102, -950562741, 787551241, 795149053, 922709527, 77303794, 323278603, -244257191, 191657520, 205750029, -396233193, 96368424, 138880295, -994896484, -715919020, 134240728, 357551888, 681331955, -818970563, 595681725, 811424677, -210940346, -413489597, -772568101, 10536606, 614788152, 98755541, 20245540, 123208480, -669676299, 115346875, 804250037, 110992146, 724158720, 631009821, 146708327, 386026718, 246114268, -131578161, -547883123, -615292885, 364238098, -36579924, 469799373, -201877463, 987215675, 588092242, -179870247, -9306886 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 54;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test18() {

    @Test
    public void test19() {
        Integer[] preTestCase1 = { 154692277, -396747896, 607757047, -737346024, 860591309, 359228731, -733782678, 404223954, 731826637, 417965683, -921418782, -478734615, -289725083, 168858778, -326701098, -390055828, -545191637, 508913894, -192941437, 639413215, 478320089, 946184359, 307558447, 940880115, -955003945, -800296467, 632291304, -406560358, -748089812, 341214789, 926721862, 335002396, 168726624, 292499588, 542656985, -915208241, -289936056, 613895846, 40460811, -23888334, 503514240, -120325155, 24098379, 591160751, -686871251, -667514043, -494826625, -40599485, -506462265, -252288244, -304723934, 204042102, -950562741, 787551241, 795149053, 922709527, 77303794, 323278603, -244257191, 191657520, 205750029, -396233193, 96368424, 138880295, -994896484, -715919020, 134240728, 357551888, 681331955, -818970563, 595681725, 811424677, -210940346, -413489597, -772568101, 10536606, 614788152, 98755541, 20245540, 123208480, -669676299, 115346875, 804250037, 110992146, 724158720, 631009821, 146708327, 386026718, 246114268, -131578161, -547883123, -615292885, 364238098, -36579924, 469799373, -201877463, 987215675, 588092242, -179870247, -9306886 };
        Integer[] preSolution = { -201877463, 469799373, -36579924, 364238098, -615292885, -547883123, -131578161, 246114268, 386026718, 146708327, 631009821, 724158720, 110992146, 804250037, 115346875, -669676299, 123208480, 20245540, 98755541, 614788152, 10536606, -772568101, -413489597, -210940346, 811424677, 595681725, -818970563, 681331955, 357551888, 134240728, -715919020, -994896484, 138880295, 96368424, -396233193, 205750029, 191657520, -244257191, 323278603, 77303794, 922709527, 795149053, 787551241, -950562741, 204042102, -304723934, -252288244, -506462265, -40599485, -494826625, -667514043, -686871251, 591160751, 24098379, -120325155, 503514240, -23888334, 40460811, 613895846, -289936056, -915208241, 542656985, 292499588, 168726624, 335002396, 926721862, 341214789, -748089812, -406560358, 632291304, -800296467, -955003945, 940880115, 307558447, 946184359, 478320089, 639413215, -192941437, 508913894, -545191637, -390055828, -326701098, 168858778, -289725083, -478734615, -921418782, 417965683, 731826637, 404223954, -733782678, 359228731, 860591309, -737346024, 607757047, -396747896, 154692277, 987215675, 588092242, -179870247, -9306886 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 96;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test19() {

    @Test
    public void test20() {
        setTestCaseInfo("test-20.json");
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test20() {

    @Test
    public void test21() {
        setTestCaseInfo("test-21.json");
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test21() {

    @Test
    public void test22() {
        setTestCaseInfo("test-22.json");
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test22() {

    @Test
    public void test23() {
        setTestCaseInfo("test-23.json");
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test23() {

    @Test
    public void test24() {
        setTestCaseInfo("test-24.json");
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test24() {

    @Test
    public void test25() {
        setTestCaseInfo("test-25.json");
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test25() {

    private void test(ListNode<Integer> testCase1, int testCase2, ListNode<Integer> solution){
        assertTimeout(Duration.ofSeconds(3),()-> new ReverseNodesInKGroups().reverseNodesInKGroups(testCase1,testCase2));
        var Actual = new ReverseNodesInKGroups().reverseNodesInKGroups(testCase1, testCase2);
        while(solution!=null && Actual!=null ){
            assertEquals(solution.value,Actual.value);
            solution=solution.next;
            Actual=Actual.next;
        }//while(solution!=null && Actual!=null ){
        assertTrue(solution==null&&Actual==null);
    }//private void test(ListNode<Integer> testCase1, int testCase2, ListNode<Integer> solution){

    private void setTestCaseInfo(String fileName){
        JSONObject testInfo = getJsonObject(fileName, path);
        if(testInfo==null){
            fail("JObject for " + fileName + " returns null");
        }else{//if(testInfo==null){
            var preInternedTestCase1 = (JSONArray) ((JSONObject) testInfo.get("input")).get("l");
            Integer[] preInternedTestCase1AsArray = new Integer[preInternedTestCase1.size()];
            for(int i=0;i< preInternedTestCase1AsArray.length;i++){
                preInternedTestCase1AsArray[i] = ((Long) preInternedTestCase1.get(i)).intValue();
            }//for(int i=0;i< internedTestCase1.length;i++){
            internedTestCase1 = CollectionToListNode(preInternedTestCase1AsArray);
            internedTestCase2 = ((Long)((JSONObject)testInfo.get("input")).get("k")).intValue();
            var preInternedSolution = (JSONArray) testInfo.get("output");
            Integer[] preInternedSolutionAsArray = new Integer[preInternedSolution.size()];
            for(int i=0;i< preInternedSolutionAsArray.length;i++){
                preInternedSolutionAsArray[i] = ((Long) preInternedSolution.get(i)).intValue();
            }//for(int i=0;i< preInternedSolutionAsArray.length;i++){
            internedSolution = CollectionToListNode(preInternedSolutionAsArray);
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class ReverseNodesInKGroupsTest {