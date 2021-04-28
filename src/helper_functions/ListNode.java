/*
 * Authored by: Jason Wesley Howse
 */

package helper_functions;

public class ListNode<T> {
    public ListNode(T x) {
        value = x;
    }//public ListNode(T x) {
    public T value;
    public ListNode<T> next;
}//public class ListNode<T> {