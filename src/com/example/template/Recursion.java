package com.example.template;

public class Recursion {

    public void recursion(int level, int parm1, int parm2){

        if (level > 666){
            System.out.println("get it");
            return;
        }

        //
        processData(0 ,1 ,2 );


        //
        recursion(level + 1, parm1, parm2);

        //
        reverseData();
    }

    private void reverseData() {
    }

    private void processData(int level, int parm1, int parm2) {
    }
}
