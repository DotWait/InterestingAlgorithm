import bean.PSNode;

public class PalindromeStringLinkedListImpl {
    /**
     * 初始化LinkedList实现的回文字符串
     *
     * @return
     */
    public static PSNode initPSLinkedList() {
        PSNode psNode = new PSNode("q");
        PSNode psNode1 = new PSNode("w");
//        PSNode psNode2 = new PSNode("e");
        PSNode psNode3 = new PSNode("e");
        PSNode psNode4 = new PSNode("w");
        PSNode psNode5 = new PSNode("q");
        psNode.next = psNode1;
//        psNode1.next = psNode2;
        psNode1.next = psNode3;
        psNode3.next = psNode4;
        psNode4.next = psNode5;
        psNode5.next = null;
        return psNode;
    }

    /**
     * 设置快慢指针，快指针走到尾部，慢指针走到链表中部，
     * 将前半部指针逆序，与后半部的指针进行对比，如果都相同则为回文字符串
     *
     * @param psNode
     * @return
     */
    public static boolean isPalindromeString(PSNode psNode) {
        if (psNode == null) return false;
        PSNode fast = psNode;
        PSNode slow = psNode;
        PSNode invertedFirstHalf = slow, preNode = null, nextNode = null;
        while (fast != null && fast.next != null ) {
            fast = fast.next.next;
            invertedFirstHalf = slow;
            nextNode = slow.next;
            invertedFirstHalf.next = preNode;
            preNode = slow;
            slow = nextNode;
        }
        if(fast != null && fast.next == null) slow = slow.next;
        while (slow != null) {
            if (!invertedFirstHalf.val.equals(slow.val)) return false;
            invertedFirstHalf = invertedFirstHalf.next;
            slow = slow.next;
        }
        return true;
    }
}
