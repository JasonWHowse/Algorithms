/*
 * Authored by: Jason Wesley Howse
 */

package helper_functions;

public class ListNodeBuilder {
    public static <T> ListNode<T> CollectionToListNode(T[] values) {
        if (values.length == 0) {
            return null;
        }//if (values.length == 0) {
        ListNode<T> Head = new ListNode<T>(null);
        ListNode<T> Output = Head;
        for(int i=0;i<values.length;){
            Head.value = values[i];
            if (++i < values.length) {
                Head.next = new ListNode<T>(null);
                Head = Head.next;
            }//if (++i < values.length) {
        }//for(int i=0;i<values.length;){
        return Output;
    }//public static <T> ListNode<T> CollectionToListNode(T[] values) {
}//public class ListNodeBuilder<T> {