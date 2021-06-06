/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._09_eruption_of_light;

public class ElectionsWinners {

/*
Elections are in progress!

Given an array of the numbers of votes given to each
of the candidates so far, and an integer k equal to
the number of voters who haven't cast their vote yet,
find the number of candidates who still have a chance
to win the election.

The winner of the election must secure strictly more
votes than any other candidate. If two or more
candidates receive the same (maximum) number of votes,
assume there is no winner at all.
 */

    int electionsWinners(int[] votes, int k) {
        int output = 0;
        int max=0;
        int maxCount=0;
        for(int a:votes){
            if(a==max){
                maxCount++;
            }//if(a==max){
            if(a>max){
                maxCount=1;
                max=a;
            }//if(a>max){
        }//for(int a:votes){
        if(maxCount>1&&k==0){
            return 0;
        }//if(maxCount>1&&k==0){
        for(int a:votes){
            if(a+k>max||a==max){
                output++;
            }//if(a+k>max||a==max){
        }//for(int a:votes){
        return output;
    }//int electionsWinners(int[] votes, int k) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer votes

A non-empty array of non-negative integers. Its ith element denotes the number of votes cast for the ith candidate.

Guaranteed constraints:
4 ≤ votes.length ≤ 105,
0 ≤ votes[i] ≤ 104.

[input] integer k

The number of voters who haven't cast their vote yet.

Guaranteed constraints:
0 ≤ k ≤ 105.

[output] integer


 */

}//public class ElectionsWinners {
