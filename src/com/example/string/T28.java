package com.example.string;


/*
Implement strStr()

暴力- -

 */
class T28 {

    public static void main(String[] args) {
        String h = "mississippi";
        String n =  "pi";
        System.out.println(new T28().strStr(h,n));
    }


    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) return 0;
        int i = 0;
        int j = 0;
        int hl = haystack.length();
        int nl = needle.length();

        while (i < hl){
            if (haystack.charAt(i) == needle.charAt(j)) {
                if (j == nl - 1) return i - nl + 1;
                j++;
                i++;
            }else {
                i = i - j + 1;
                j = 0;

            }
        }
        return -1;
    }
}

