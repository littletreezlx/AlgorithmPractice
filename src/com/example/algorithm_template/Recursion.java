package com.example.algorithm_template;

public class Recursion {

    public void recursion(int level, int parm1, int parm2){

        //判断输入或者状态是否非法
        if (level > 666){
            System.out.println("get it");
            return;
        }

        //处理数据，判断递归是否应该结束
        processData(0 ,1 ,2 );


        //将问题规模缩小，递归调用
        recursion(level + 1, parm1, parm2);

        //整合结束
        reverseData();
    }

    private void reverseData() {
    }

    private void processData(int level, int parm1, int parm2) {
    }
}
