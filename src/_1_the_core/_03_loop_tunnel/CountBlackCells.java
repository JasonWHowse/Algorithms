/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

public class CountBlackCells {

    /*
Imagine a white rectangular grid of n rows and m columns
divided into two parts by a diagonal line running from
the upper left to the lower right corner. Now let's paint
the grid in two colors according to the following rules:

    A cell is painted black if it has at least one point
    in common with the diagonal;

    Otherwise, a cell is painted white.

Count the number of cells painted black.
     */

    int countBlackCells(int n, int m) {
        int out=0;
        if(n>m){
            n=n^m;
            m=n^m;
            n=n^m;
        }
        int lastTrueIndex=1;
        float slope=(float)n/(float)m;
        for(int i=1;i<=n;i++){
            boolean flag=false;
            for(int j=lastTrueIndex;j<=m;j++){
                if((j*slope<=i         &&      j*slope>=i-1)   ||
                   ((j-1)*slope>=i     &&      (j-1)*slope<=i)     ||
                   ((j-1)*slope>=i-1   &&      j*slope<=i-1)   ||
                   ((j-1)*slope>=i-1   &&      (j-1)*slope<=i)
                ){
                    out++;
                    if(!flag){
                        lastTrueIndex=j;
                    }//if(!flag){
                    flag=true;
                }else if (flag){//if((j*slope<=i         &&      j*slope>=i-1)   ||
                    break;
                }//else if (flag){
            }//for(int j=lastTrueIndex;j<=m;j++){
        }//for(int i=1;i<=n;i++){
        return out;
    }//int countBlackCells(int n, int m) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

The number of rows.

Guaranteed constraints:
1 ≤ n ≤ 105.

[input] integer m

The number of columns.

Guaranteed constraints:
1 ≤ m ≤ 105.

[output] integer

The number of black cells.
     */

}//public class CountBlackCells {
