package com.example.linkedlist;


import com.example.ListNode;

/*
Palindrome Linked List



 */
class T234 {

    public static void main(String[] args)
    {

//        ListNode l = new ListNode(1);
//        l.addNext(2);
//        l.addNext(3);
//        l.addNext(2);

        int[] array = {1,2,3,2,1};
        ListNode l = new ListNode(array);

        new T234().isPalindrome(l);

    }



    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null){
            return true;
        }
        ListNode slow = head, fast = head, first = head;
        boolean isOdd = false;
        while (fast.next!= null && fast.next.next != null){
            fast = fast.next.next;
            slow = first.next;

            first.next = slow.next;
            slow.next = first;
        }
        if (fast.next == null){
            isOdd = true;
        }else {
            isOdd = false;
        }

        first = first.next;
        if (isOdd){
            slow = slow.next;
        }

        while (first.next != null){
            if (slow.val != first.val){
                return false;
            }
            first = first.next;
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

