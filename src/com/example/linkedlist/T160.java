package com.example.linkedlist;


import com.example.ListNode;

import java.util.ArrayList;
import java.util.List;

/*
 Intersection of Two Linked Lists

 */
class T160 {

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(4);

        ListNode b = new ListNode(2);
        b.next = new ListNode(4);


        new T160().getIntersectionNode(a,b);

    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }

        List<ListNode> listA = new ArrayList<>();
        List<ListNode> listB = new ArrayList<>();

        while (headA != null){
            listA.add(headA);
            headA = headA.next;
        }
        while (headB != null){
            listB.add(headB);
            headB = headB.next;
        }
        int lenA = listA.size();
        int lenB = listB.size();
        boolean hasRes = false;
        int last = Math.min(lenA,lenB);

        for (int i = last; i > 0; i--) {
            if (listA.get(lenA - 1).equals(listB.get(lenB - 1))){
                hasRes = true;
            }else {
                if (hasRes){
                    return lenB > lenA ? listA.get(lenA - 1).next : listB.get(lenB - 1).next;
                }else {
                    return null;
                }
            }
            lenB --;
            lenA --;
        }
        return lenB > lenA ? listA.get(0) : listB.get(0);
    }




//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//
//        HashMap<Integer, ListNode> mapA = new HashMap<>();
//        HashMap<Integer, ListNode> mapB = new HashMap<>();
//
//        if (headA.next != null){
//            headA = headA.next;
//            mapA.put(headA.val, headA);
//
//            if (mapB.keySet().contains(headA)){
//
//            }
//        }
//        if (headB.next != null){
//            headB = headB.next;
//            mapB.put(headB.val, headB);
//
//        }
//
//
//    }
}

