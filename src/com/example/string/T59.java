package com.example.string;


/*
Length of Last Word

 */
class T59 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }


    public int lengthOfLastWord(String s) {
        int res = 0;
        int i = s.length() - 1;
        if (i == -1) return 0;

        while (i >= 0){
            if (s.charAt(i) != ' '){
                res ++;
            }else {
                if (res != 0) return res;
            }
            i--;
        }
        return res;
    }
}

