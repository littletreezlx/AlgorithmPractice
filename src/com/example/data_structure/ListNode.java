package com.example.data_structure;

public class ListNode {

    public ListNode(int x) { val = x; }

    public int val;
    public ListNode next;


    public ListNode(int[] array){
        val = array[0];
        for (int i = 1; i < array.length; i++) {
            this.addNext(array[i]);
        }
    }


    public ListNode addNext(int x){
        if (next == null){
            next = new ListNode(x);
            return this;
        }

        ListNode nl = next;
        while (nl.next!= null ){
            nl = nl.next;
        }
        nl.next = new ListNode(x);
        return this;
    }

}
