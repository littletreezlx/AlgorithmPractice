package com.example.linkedlist;


import com.example.ListNode;

/*
Palindrome Linked List

好难- -
反转链表pre用null，小心产生循环


 */
class T234 {

    public static void main(String[] args)
    {

//        ListNode l = new ListNode(1);
//        l.addNext(2);
//        l.addNext(3);
//        l.addNext(2);

        int[] array = {1,1};
        ListNode l = new ListNode(array);

        new T234().isPalindrome(l);

    }



    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null){
            return true;
        }
        ListNode slow = head, fast = head;
        while (fast.next!= null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //奇偶
        slow = slow.next;
        if (fast.next != null){
            fast = fast.next;
        }

        ListNode pre = null, cur = slow;
        while (cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }


        while (fast != null){
            if (fast.val != head.val){
                return false;
            }
            fast = fast.next;
            head = head.next;
        }
        return true;
    }



//    public boolean isPalindrome(ListNode head) {
//        Deque<Integer> q = new ArrayDeque<>();
//        while (head != null){
//            q.add(head.val);
//            head = head.next;
//        }
//        int length = q.size() / 2;
//        for (int i = 0; i < length; i++) {
//            if (!q.pollFirst().equals(q.pollLast())){
//                return false;
//            }
//        }
//        return true;
//    }
}

