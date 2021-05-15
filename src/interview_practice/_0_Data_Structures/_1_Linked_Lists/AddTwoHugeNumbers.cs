using Algorithms.src.helper_functions;
using System.Collections.Generic;

namespace Algorithms.src.interview_practice._0_Data_Structures._1_Linked_Lists {
    public class AddTwoHugeNumbers {

        /*

You're given 2 huge integers represented by linked lists. Each linked list element is a number from 0 to 9999 that represents a number with exactly 4 digits. The represented number might have leading zeros. Your task is to add up these huge integers and return the result in the same format.

Example

For a = [9876, 5432, 1999] and b = [1, 8001], the output should be
addTwoHugeNumbers(a, b) = [9876, 5434, 0].

Explanation: 987654321999 + 18001 = 987654340000.

For a = [123, 4, 5] and b = [100, 100, 100], the output should be
addTwoHugeNumbers(a, b) = [223, 104, 105].

Explanation: 12300040005 + 10001000100 = 22301040105.

Input/Output

[execution time limit] 3 seconds (cs)

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

        public
        ListNode<int> addTwoHugeNumbers(ListNode<int> a, ListNode<int> b) {
            ListNodeBF NewA = new ListNodeBF() {
                Last = null
            };
            ListNodeBF NewB = new ListNodeBF {
                Last = null
            };
            while (a!=null || b!=null) {
                if (a != null) {
                    NewA.Value = a.value;
                    a = a.next;
                    NewA.Next = new ListNodeBF {
                        Last = NewA
                    };
                    NewA = NewA.Next;
                }//if (a != null) {
                if (b != null) {
                    NewB.Value = b.value;
                    b = b.next;
                    NewB.Next = new ListNodeBF {
                        Last = NewB
                    };
                    NewB = NewB.Next;
                }//if (b != null) {
            }//while (a!=null || b!=null) {
            NewA = NewA.Last;
            NewB = NewB.Last;
            ListNodeBF NewOutput = new ListNodeBF {
                Next = null
            };
            int remainder = 0;
            while(NewA != null || NewB != null || remainder!=0) {
                NewOutput.Value = ((NewA != null ? NewA.Value : 0) + (NewB != null ? NewB.Value : 0) + remainder)%10000;
                remainder= ((NewA != null ? NewA.Value : 0) + (NewB != null ? NewB.Value : 0) + remainder) / 10000;
                NewA = NewA?.Last;
                NewB = NewB?.Last;
                NewOutput.Last = new ListNodeBF {
                    Next = NewOutput
                };
                NewOutput = NewOutput.Last;
            }//while(NewA != null || NewB != null || remainder!=0) {
            NewOutput = NewOutput.Next;
            ListNode<int> Output = new ListNode<int>();
            ListNode<int> OHead = Output;
            while (NewOutput != null) {
                OHead.value = NewOutput.Value;
                if (NewOutput.Next != null) {
                    OHead.next = new ListNode<int>();
                    OHead = OHead.next;
                }//if (NewOutput.next != null) {
                NewOutput = NewOutput.Next;
            }//while (NewOutput != null) {
            return Output;
        }//ListNode<int> addTwoHugeNumbers(ListNode<int> a, ListNode<int> b) {

        private class ListNodeBF{
            public int Value { get; set; }
            public ListNodeBF Next { get; set; }
            public ListNodeBF Last { get; set;  }
        }//private class ListNodeBF{
    }//public class AddTwoHugeNumbers {
}//namespace Algorithms.src.interview_practice._0_Data_Structures._1_Linked_Lists {
