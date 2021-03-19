/*
 * Authored by: Jason Wesley Howse
 */

package helper_functions;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;

class HelpersTest {

    @Test
    void test1() {//tests the primitive as int
        int[][] testCase=new int[][]{   {0,1,1,2},
                {0,5,0,0},
                {2,0,3,3}};
        int[][] solution=new int[][]{   {0,1,1,2},
                {0,5,0,0},
                {2,0,3,3}};
        mutator(Helpers.deepCopy(testCase));
//        mutator((testCase));//tests that array is mutated
        MatcherAssert.assertThat(testCase,is(solution));
    }//void test1() {

    @Test
    void test2() {//tests the generic as Integer
        Integer[][] testCase=new Integer[][]{   {0,1,1,2},
                {0,5,0,0},
                {2,0,3,3}};
        Integer[][] solution=new Integer[][]{   {0,1,1,2},
                {0,5,0,0},
                {2,0,3,3}};
        mutator(Helpers.deepCopy(testCase));
//        mutator((testCase));//tests that array is mutated
        MatcherAssert.assertThat(testCase,is(solution));
    }//void test2() {

    @Test
    void test3() {//tests the generic as String
        String[][] testCase=new String[][]{   {"asdf","sdf","sde","s"},
                {"0","5","0","0"},
                {"2","0","3","3"}};
        String[][] solution=new String[][]{   {"asdf","sdf","sde","s"},
                {"0","5","0","0"},
                {"2","0","3","3"}};
        mutator(Helpers.deepCopy(testCase));
//        mutator((testCase));//tests that array is mutated
        MatcherAssert.assertThat(testCase,is(solution));
    }//void test3() {



    @Test
    void test4() {//tests 3d the generic as String
        String[][][] testCase=new String[][][]{{   {"asdf","sdf","sde","s"},
                {"0","5","0","0"},
                {"2","0","3","3"}},{   {"0","1","2","3"},
                {"0","5","0","0"},
                {"2","0","3","3"}}};
        String[][][] solution=new String[][][]{{   {"asdf","sdf","sde","s"},
                {"0","5","0","0"},
                {"2","0","3","3"}},{   {"0","1","2","3"},
            {"0","5","0","0"},
            {"2","0","3","3"}}};
        mutator(Helpers.deepCopy(testCase));
//        mutator((testCase[0]));//tests that array is mutated
        MatcherAssert.assertThat(testCase,is(solution));
    }//void test3() {

    private void mutator(int[][] toMutate){
        for (int i=0;i<toMutate.length;i++){
            for (int j=0;j<toMutate[i].length;j++){
                toMutate[i][j]=toMutate[i][j]+1;
            }//for (int i=0;i<toMutate.length;i++){
        }//for (int j=0;j<toMutate[i].length;j++){
    }//private void mutator(int[][] toMutate){

    private void mutator(Integer[][] toMutate){
        for (int i=0;i<toMutate.length;i++){
            for (int j=0;j<toMutate[i].length;j++){
                toMutate[i][j]=toMutate[i][j]+1;
            }//for (int j=0;j<toMutate[i].length;j++){
        }//for (int i=0;i<toMutate.length;i++){
    }//private void mutator(Integer[][] toMutate){

    private void mutator(String[][] toMutate){
        for (int i=0;i<toMutate.length;i++){
            for (int j=0;j<toMutate[i].length;j++){
                toMutate[i][j]=toMutate[i][j]+"1";
            }//for (int i=0;i<toMutate.length;i++){
        }//for (int i=0;i<toMutate.length;i++){
    }//private void mutator(String[][] toMutate){

    private void mutator(String[][][] toMutate){
        for (int i=0;i<toMutate.length;i++){
            for (int j=0;j<toMutate[i].length;j++){
                for(int k=0;k<toMutate[i][j].length;k++) {
                    toMutate[i][j][k] = toMutate[i][j][k] + "1";
                }
            }//for (int i=0;i<toMutate.length;i++){
        }//for (int i=0;i<toMutate.length;i++){
    }//private void mutator(String[][] toMutate){
}