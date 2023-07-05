public class LeetCodeLinkedList01 {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
    }

    ListNode slow = head;
    ListNode fast = head;
    int flag=0;while(slow!=null&&fast!=null&&fast.next!=null)
    {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fasr) {
            flag = 1;
            break;
        }
    }
    if(flag==0)
    {
        return false;
    }
    else{
        return true;
    }
}
