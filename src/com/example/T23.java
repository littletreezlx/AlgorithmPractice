package com.example;


import com.example.data_structure.ListNode;

/*
Merge k Sorted Lists

 */
class T23 {

    public static void main(String[] args) {
        int[] a1 = {1,4,5};
        int[] a2 = {1,3,4};
        int[] a3 = {2,6};

        ListNode[] lists = {new ListNode(a1), new ListNode(a2), new ListNode(a3)};
        System.out.println(new T23().mergeKLists(lists));
    }


    public ListNode mergeKLists(ListNode[] lists) {
        int realLen = lists.length;
        if (realLen == 0) return null;
        if (realLen == 1) return lists[0];

        int i = 0;
        ListNode leftOne = null;
        if (lists.length % 2 == 1) {
            leftOne = lists[lists.length - 1];
            realLen --;
        }

        while (realLen > 1){
            lists[i] = mergeTwo(lists[i * 2], lists[i * 2 + 1]);
            i ++;
            if (i * 2 >= realLen){
                i = 0;
                realLen = (realLen + 1) / 2;
                lists[realLen] = null;
            }
        }

        return mergeTwo(lists[0], leftOne);
    }


    public ListNode mergeTwo(ListNode l1, ListNode l2){
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val){
            l1.next = mergeTwo(l1.next, l2);
            return l1;
        }else {
            l2.next = mergeTwo(l1, l2.next);
            return l2;
        }
    }
}

