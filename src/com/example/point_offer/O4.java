package com.example.point_offer;


/*


 */
class O4 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }


    public boolean Find(int target, int [][] array) {
        int i = 0;
        int j = array[0].length - 1;

        while (i < array.length && j >=0){
            int find = array[i][j];
            if (find == target) return true;
            else if (target < find){
                j--;
            }else {
                i ++;
            }
        }
        return false;
    }
}

