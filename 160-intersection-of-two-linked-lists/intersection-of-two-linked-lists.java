/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode P1 = headA;
        ListNode P2 = headB;

        if(headA == null || headB == null) return null;
        while(P1 != P2){
            if(P1 == null){
                P1 = headB;
            }else{
                P1 = P1.next;
            }
            
            if(P2 == null){
                P2 = headA;
            }else{
                P2 = P2.next;
            }
        }
        return P1;
    }
}