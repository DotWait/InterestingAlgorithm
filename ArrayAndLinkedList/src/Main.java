import bean.ListNode;
import bean.PSNode;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class Main {
    /**
     * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
     *
     * k is a positive integer and is less than or equal to the length of the linked list.
     * If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
     *
     * Example:
     * Given this linked list: 1->2->3->4->5
     * For k = 2, you should return: 2->1->4->3->5
     * For k = 3, you should return: 3->2->1->4->5
     *
     * @param head
     * @param k
     * @return
     */
    public static ListNode reverseKGroup(ListNode head, int k){
        ListNode dummyNode = head;
        ListNode preListNode = head;
        ListNode reverseListNode = null;
        ListNode nextListNode = null;
        ListNode lastListNode = null;
        int len = 0;
        while (preListNode != null) {
            preListNode = preListNode.next;
            len ++;
        }
        if(len/k == 0)return head;
        preListNode = head;
        for (int i=0;i<len/k;i++){
            for(int j=0;j<k;j++){
                nextListNode = head.next;
                head.next = reverseListNode;
                reverseListNode = head;
                head = nextListNode;
            }
            if(i==0){
                dummyNode = reverseListNode;
                lastListNode = nextListNode;
            }else{
                preListNode.next = reverseListNode;
                preListNode = lastListNode;
                lastListNode = nextListNode;
            }
            reverseListNode = null;
        }
        preListNode.next = lastListNode;

        return dummyNode;
    }
    /**
     * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
     * @param head
     * @return
     */
    public static ListNode detectCycle(ListNode head){
        if (head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                slow = head;
                while (slow != fast){
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }

    /**
     * Given a linked list, determine if it has a cycle in it.
     * @param head
     * @return
     */
    public static boolean hasCycle(ListNode head){
        if (head == null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }

    /**
     * Given a linked list, swap every two adjacent nodes and return its head.
     *
     * Example:
     * Given 1->2->3->4, you should return the list as 2->1->4->3
     *
     * @param head
     * @return
     */
    public static ListNode swapPairs(ListNode head){
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode swapHead = head.next;
        ListNode nextNode = null;
        ListNode preNode = new ListNode(0);
        while(head != null && head.next != null){
            nextNode = head.next;
            head.next = nextNode.next;
            nextNode.next = head;
            preNode.next = nextNode;
            preNode = head;
            head = head.next;
        }
        return swapHead;
    }

    /**
     * reverse-linked-list
     *
     * Example:
     * Input: 1->2->3->4->5->NULL
     * Output: 5->4->3->2->1->NULL
     *
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head){
        ListNode reverseListNode = null;
        ListNode nextListNode = null;
        while(head != null){
            nextListNode = head.next;
            head.next = reverseListNode;
            reverseListNode = head;
            head = nextListNode;
        }
        return reverseListNode;
    }

    /**
     * init cycle linked list
     * @return
     */
    public static ListNode initCycleLinkedList(){
        ListNode listNode = null;
        ListNode head = new ListNode(0);
        ListNode preNode = head;
        for (int i=1;i<9;i++){
            listNode = new ListNode(i);
            preNode.next = listNode;
            preNode = listNode;
        }
        preNode.next = head;
        return head;
    }

    /**
     * init linked list
     * @return
     */
    public static ListNode initLinkedList(){
        ListNode listNode = null;
        ListNode head = new ListNode(0);
        ListNode preNode = head;
        for (int i=1;i<11;i++){
            listNode = new ListNode(i);
            preNode.next = listNode;
            preNode = listNode;
        }
        preNode.next = null;
        return head;
    }

    /**
     * print linked list
     * @param head
     */
    public static void printLinkedList(ListNode head){
        ListNode node = head;
        while(node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        //Test: reverse-linked-list
/*        ListNode head = initLinkedList();
        long start = System.currentTimeMillis();
        ListNode reverseList = reverseList(head);
        long end = System.currentTimeMillis();
        printLinkedList(reverseList);
        System.out.println("use time:"+(end - start));*/

        //Test: swapPairs
/*        ListNode head = initLinkedList();
        long start = System.currentTimeMillis();
        ListNode swapPairs = swapPairs(head);
        long end = System.currentTimeMillis();
        printLinkedList(swapPairs);
        System.out.println("use time:"+(end - start));*/

        //Test: hasCycle
/*        ListNode head = initCycleLinkedList();
        long start = System.currentTimeMillis();
        boolean hasCycle = hasCycle(head);
        long end = System.currentTimeMillis();
        System.out.println("hasCycle:"+hasCycle);
        System.out.println("use time:"+(end - start));*/

        //Test: detectCycle
/*        ListNode head = initCycleLinkedList();
        long start = System.currentTimeMillis();
        ListNode detectCycle = detectCycle(head);
        long end = System.currentTimeMillis();
        System.out.println("detectCycle:"+detectCycle);
        System.out.println("use time:"+(end - start));*/

        //Test: reverseKGroup
/*        ListNode head = initLinkedList();
        long start = System.currentTimeMillis();
        ListNode reverseKGroup = reverseKGroup(head,3);
        long end = System.currentTimeMillis();
        printLinkedList(reverseKGroup);
        System.out.println("use time:"+(end - start));*/

        //Test: isPalindromeString
        PSNode psNode = PalindromeStringLinkedListImpl.initPSLinkedList();
        boolean isPalidromeString = PalindromeStringLinkedListImpl.isPalindromeString(psNode);
        System.out.println("isPalidromeString : "+ isPalidromeString );
    }
}
