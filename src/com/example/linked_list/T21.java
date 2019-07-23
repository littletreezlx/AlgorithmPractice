package com.example.linked_list;


import com.example.data_structure.ListNode;


/*
Merge Two Sorted Lists

 */
class T21 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}

