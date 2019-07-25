package com.example.string;



/*
Count and Say

 */
class T38 {

    public static void main(String[] args) {
        System.out.println(new T38().countAndSay(6));
    }



    public String countAndSay(int n) {
        String str = "";
        if (n == 0) return str;
        if (n == 1) return "1";

        str = countAndSay(n - 1);
        String newStr = "";
        int i = 0;
        int len = str.length();
        while (i < len){
            int same = 1;
            while (i + 1 < len && str.charAt(i) == str.charAt(i + 1)){
                same ++;
                i++;
            }
            if (same > 1){
                newStr = newStr + same + str.charAt(i);
            }else {
                newStr = newStr + "1" + str.charAt(i);
            }
            i++;
        }
        return newStr;
    }

}

