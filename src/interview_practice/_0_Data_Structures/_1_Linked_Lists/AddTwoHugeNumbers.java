/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._1_Linked_Lists;

import helper_functions.ListNode;

public class AddTwoHugeNumbers {

    /*
You're given 2 huge integers represented by linked lists. Each linked list element is a number from 0 to 9999 that represents a number with exactly 4 digits. The represented number might have leading zeros. Your task is to add up these huge integers and return the result in the same format.
     */

    // Singly-linked lists are already defined with this interface:
    // class ListNode<T> {
    //   ListNode(T x) {
    //     value = x;
    //   }
    //   T value;
    //   ListNode<T> next;
    // }
    //
    ListNode<Integer> addTwoHugeNumbers(ListNode<Integer> a, ListNode<Integer> b) {
        ListNodeBF NewA = new ListNodeBF();
        ListNodeBF NewB = new ListNodeBF();
        while (a!=null || b!=null) {
            if (a != null) {
                NewA.Value = a.value;
                a = a.next;
                NewA.Next = new ListNodeBF();
                NewA.Next.Last = NewA;
                NewA = NewA.Next;
            }//if (a != null) {
            if (b != null) {
                NewB.Value = b.value;
                b = b.next;
                NewB.Next = new ListNodeBF();
                NewB.Next.Last = NewB;
                NewB = NewB.Next;
            }//if (b != null) {
        }//while (a!=null || b!=null) {
        NewA = NewA.Last;
        NewB = NewB.Last;
        ListNodeBF NewOutput = new ListNodeBF();
        int remainder = 0;
        while(NewA != null || NewB != null || remainder!=0) {
            int tempTotal = ((NewA != null ? NewA.Value : 0) + (NewB != null ? NewB.Value : 0) + remainder);
            NewOutput.Value = tempTotal %10000;
            remainder= tempTotal / 10000;
            NewA = NewA==null?null:NewA.Last;
            NewB = NewB==null?null:NewB.Last;
            NewOutput.Last = new ListNodeBF();
            NewOutput.Last.Next = NewOutput;
            NewOutput = NewOutput.Last;
        }//while(NewA != null || NewB != null || remainder!=0) {
        NewOutput = NewOutput.Next;
        ListNode<Integer> Output = new ListNode<>(0);
        ListNode<Integer> OHead = Output;
        while (NewOutput != null) {
            OHead.value = NewOutput.Value;
            if (NewOutput.Next != null) {
                OHead.next = new ListNode<>(0);
                OHead = OHead.next;
            }//if (NewOutput.next != null) {
            NewOutput = NewOutput.Next;
        }//while (NewOutput != null) {
        return Output;
    }//ListNode<Integer> addTwoHugeNumbers(ListNode<Integer> a, ListNode<Integer> b) {

    private static class ListNodeBF{
        public Integer Value;
        public ListNodeBF Next = null;
        public ListNodeBF Last = null;
    }//private class ListNodeBF{
    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] linkedlist.integer a

The first number, without its leading zeros.

Guaranteed constraints:
0 ≤ a size ≤ 104,
0 ≤ element value ≤ 9999.

[input] linkedlist.integer b

The second number, without its leading zeros.

Guaranteed constraints:
0 ≤ b size ≤ 104,
0 ≤ element value ≤ 9999.

[output] linkedlist.integer

The result of adding a and b together, returned without leading zeros in the same format.
     */

}//public class AddTwoHugeNumbers {
