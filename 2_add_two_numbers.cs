
// Definition for singly-linked list.
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int val=0, ListNode next=null) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2) {
        ListNode startNode = null, curNode = null;
        int sum = 0, carry = 0;
        while(l1 != null && l2 != null) {
            if (startNode == null) {
                startNode = new ListNode();
                curNode = startNode;
            }
            else {
                curNode.next = new ListNode();
                curNode = curNode.next;
            }
            sum = l1.val + l2.val + carry;
            carry = sum/10;
            curNode.val = sum - carry*10;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        while (l1 != null) {
            curNode.next = new ListNode();
            curNode = curNode.next;
            sum = l1.val + carry;
            carry = sum/10;
            curNode.val = sum - carry*10;
            l1 = l1.next;
        }
        
        while (l2 != null) {
            curNode.next = new ListNode();
            curNode = curNode.next;
            sum = l2.val + carry;
            carry = sum/10;
            curNode.val = sum - carry*10;
            l2 = l2.next;
        }
        
        if (carry > 0) {
            curNode.next = new ListNode();
            curNode = curNode.next;
            curNode.val = carry;
        }
        
        return startNode;
    }
}