/*
 * Authored by: Jason Wesley Howse
 */

package helper_functions;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.jupiter.api.Assertions.*;

class HelpersTest {

    @Test
    void test1() {//tests the primitive as int
        int[][] testCase=new int[][]{   {0,1,1,2},
                {0,5,0,0},
                {2,0,3,3}};
        int[][] solution=new int[][]{   {0,1,1,2},
                {0,5,0,0},
                {2,0,3,3}};
        mutator(Helpers.deepClone(testCase));
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
        mutator(Helpers.deepClone(testCase));
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
        mutator(Helpers.deepClone(testCase));
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
        mutator(Helpers.deepClone(testCase));
//        mutator((testCase[0]));//tests that array is mutated
        MatcherAssert.assertThat(testCase,is(solution));
    }//void test4() {

    @Test
    void test5() {//tests the primitive as int
        Integer[][] testCase=new Integer[][]{   {0,1,1,2},
                {0,5,0,0},
                {2,0,3,3}};
        Integer[][] solution=new Integer[][]{   {0,1,1,2},
                {0,5,0,0},
                {2,0,3,3}};
        mutator(Helpers.deepClone(testCase));
//        mutator((testCase));//tests that array is mutated
        MatcherAssert.assertThat(testCase,is(solution));
    }//void test5() {

    @Test
    void test6() {//tests the generic as Integer
        Integer[][] testCase=new Integer[][]{   {0,1,1,2},
                {0,5,0,0},
                {2,0,3,3}};
        Integer[][] solution=new Integer[][]{   {0,1,1,2},
                {0,5,0,0},
                {2,0,3,3}};
        mutator(Helpers.deepClone(testCase));
//        mutator((testCase));//tests that array is mutated
        MatcherAssert.assertThat(testCase,is(solution));
    }//void test6() {

    @Test
    void test7() {//tests the generic as String
        String[][] testCase=new String[][]{   {"asdf","sdf","sde","s"},
                {"0","5","0","0"},
                {"2","0","3","3"}};
        String[][] solution=new String[][]{   {"asdf","sdf","sde","s"},
                {"0","5","0","0"},
                {"2","0","3","3"}};
        mutator(Helpers.deepClone(testCase));
//        mutator((testCase));//tests that array is mutated
        MatcherAssert.assertThat(testCase,is(solution));
    }//void tes7() {

    @Test
    void test8() {//tests 3d the generic as String
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
        mutator(Helpers.deepClone(testCase));
//        mutator((testCase));//tests that array is mutated
        MatcherAssert.assertThat(testCase,is(solution));
    }//void test8() {

    @Test
    void test9() {//tests 4d the generic as Integer
        Integer[][][][] testCase =new Integer[5][5][5][5];
        for(int x=0;x<testCase.length;x++){
            for(int y=0;y<testCase[x].length;y++){
                for(int z=0;z<testCase[x][y].length;z++){
                    for(int i=0;i<testCase[x][y][z].length;i++){
                        testCase[x][y][z][i]=x*y+x*z+y*z+x*i+y*i+z*i;
                    }//for(int i=0;i<solution[x][y][z].length;i++){
                }//for(int z=0;z<testCase[x][y].length;z++){
            }//for(int y=0;y<solution[x].length;y++){
        }//for(int x=0;x<testCase.length;x++){
        Integer[][][][] solution =new Integer[5][5][5][5];
        for(int x=0;x<solution.length;x++){
            for(int y=0;y<solution[x].length;y++){
                for(int z=0;z<solution[x][y].length;z++){
                    for(int i=0;i<solution[x][y][z].length;i++){
                        solution[x][y][z][i]=x*y+x*z+y*z+x*i+y*i+z*i;
                    }//for(int i=0;i<solution[x][y][z].length;i++){
                }//for(int z=0;z<testCase[x][y].length;z++){
            }//for(int y=0;y<solution[x].length;y++){
        }//for(int x=0;x<testCase.length;x++){
        mutator(Helpers.deepClone(testCase));
//        mutator((testCase));//tests that array is mutated
        MatcherAssert.assertThat(testCase,is(solution));
    }//void test9() {



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
                }//for(int k=0;k<toMutate[i][j].length;k++) {
            }//for (int i=0;i<toMutate.length;i++){
        }//for (int i=0;i<toMutate.length;i++){
    }//private void mutator(String[][][] toMutate){

    private void mutator(Integer[][][][] toMutate){
        for (int i=0;i<toMutate.length;i++){
            for (int j=0;j<toMutate[i].length;j++){
                for(int k=0;k<toMutate[i][j].length;k++) {
                    for(int l=0;l<toMutate[i][j][k].length;l++) {
                        toMutate[i][j][k][l] = toMutate[i][j][k][l] + (Integer) 1;
                    }//for(int l=0;l<toMutate[i][j][k].length;l++) {
                }//for(int k=0;k<toMutate[i][j].length;k++) {
            }//for (int j=0;j<toMutate[i].length;j++){
        }//for (int i=0;i<toMutate.length;i++){
    }//private void mutator(Integer[][][][] toMutate){
}//class HelpersTest {