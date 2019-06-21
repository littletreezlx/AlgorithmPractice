package com.example.dp;


import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Triangle

[[2],[3,4],[6,5,7],[4,1,8,3]]

 */
class T120 {

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(-1));
        triangle.add(Arrays.asList(3,2));
        triangle.add(Arrays.asList(1,-2,3));


//        Integer[][] array = {{-1},{3,2},{1,-2,-1}};
        new T120().minimumTotal(triangle);



        int[] a = new int[3];

        System.out.println(Math.min(1, a[0]));



    }


    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0){
            return 0;
        }
        int min[] = new int[triangle.get(triangle.size()-1).size() + 1];

        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                min[j] = Math.min(min[j], min[j + 1]) + triangle.get(i).get(j);
            }
        }
        return min[0];
    }





    //dfs超出时间限制了。。。
//    public int minT = Integer.MAX_VALUE;
//
//    public int minimumTotal(List<List<Integer>> triangle) {
//
//        dfs(0, 0, 0, triangle);
//        return minT;
//    }
//
//    public void dfs(int i, int j, int total, List<List<Integer>> triangle){
//        if (i == triangle.size()){
//            if (total < minT){
//                minT = total;
//            }
//            return;
//        }
//        total += triangle.get(i).get(j);
//
//        dfs(i + 1, j, total, triangle);
//        dfs(i + 1, j + 1, total, triangle);
//    }


}

