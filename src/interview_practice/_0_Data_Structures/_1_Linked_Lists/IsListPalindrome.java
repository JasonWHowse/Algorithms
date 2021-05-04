/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._1_Linked_Lists;

import com.sun.source.tree.WhileLoopTree;
import helper_functions.ListNode;

import java.util.ArrayList;
import java.util.List;

public class IsListPalindrome {

    /*
Note: Try to solve this task in O(n) time using O(1) additional space, where n is the number of elements in l, since this is what you'll be asked to do during an interview.

Given a singly linked list of integers, determine whether or not it's a palindrome.

Note: in examples below and tests preview linked lists are presented as arrays just for simplicity of visualization: in real data you will be given a head node l of the linked list
     */

    boolean isListPalindrome(ListNode<Integer> l){
        List<Integer> FrontHalf = new ArrayList<>();
        ListNode<Integer> SpeedHead = l;
        while(SpeedHead!=null&&SpeedHead.next!=null){
            FrontHalf.add(l.value);
            l=l.next;
            SpeedHead=SpeedHead.next.next;
            if(SpeedHead!=null && SpeedHead.next==null){
                l=l.next;
            }//if(SpeedHead!=null && SpeedHead.next==null){
        }//while(SpeedHead!=null&&SpeedHead.next!=null){
        for(int i=FrontHalf.size()-1;i>=0;i--){
            if(l.value.intValue() != FrontHalf.get(i).intValue()){
                return false;
            }//if(l.value.intValue() != FrontHalf.get(i).intValue()){
            l=l.next;
        }//for(int i=FrontHalf.size()-1;i>=0;i--){
        return true;
    }//boolean isListPalindrome(ListNode<Integer> l){

    /*
Input/Output

[execution time limit] 3 seconds (cs)

[input] linkedlist.integer l

A singly linked list of integers.

Guaranteed constraints:
0 ≤ list size ≤ 5 · 105,
-109 ≤ element value ≤ 109.

[output] boolean

Return true if l is a palindrome, otherwise return false.
     */

}//public class IsListPalindrome {
