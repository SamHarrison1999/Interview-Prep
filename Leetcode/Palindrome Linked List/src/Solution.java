
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode previousNode = null;
        ListNode currentNode = slow.next;
        slow.next = null;
        ListNode nextNode = currentNode.next;

        while(currentNode != null){
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
            if(nextNode != null){
                nextNode = nextNode.next;
            }
        }

        slow = head;
        while(slow != null){
            if(previousNode != null && slow.val != previousNode.val){
                return false;
            }
            slow = slow.next;
            previousNode = (previousNode==null)?null:previousNode.next;
        }
        return true;
    }
}