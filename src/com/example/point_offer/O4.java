package com.example.point_offer;


/*


 */
class O4 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }


    public boolean Find(int target, int [][] array) {
        int i = array.length;
        int j = array[0].length;

        while (i >= 0 && j >=0){
            int find = array[0][j - 1];
            if (find == target) return true;
            else if (find < target) return false;
            else {
                if (j > 0){
                    j --;
                } else if (i > 0){
                    i --;
                }
                else {
                    return false;
                }
            }
        }
        return false;
    }
}

