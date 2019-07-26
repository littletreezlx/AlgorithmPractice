package com.example;


/*
Add Binary

用长的做主体
第二次，补齐！！！ 虽然效率变低，但是代码整齐，思路清楚许多
 */
class T67 {

    public static void main(String[] args)
    {
        String a = "0";
        String b = "0";
        System.out.println(new T67().addBinary(a,b));
    }



    public String addBinary(String a, String b) {
        String longStr = a.length() >= b.length() ? a : b;
        String shortStr = a.length() >= b.length() ? b : a;
        String fillZero = "";
        for (int i = 0; i < longStr.length() - shortStr.length() + 1; i++) {
            fillZero += "0";
        }
        shortStr = fillZero + shortStr;
        longStr = "0" +longStr;
        char[] lon = longStr.toCharArray();
        char[] sho = shortStr.toCharArray();
        int li = lon.length - 1;
        int si = sho.length - 1;

        while (li > 0){
            if (lon[li] == '1' && sho[si] == '1'){
                lon[li] = '0';
                lon[li - 1] = lon[li - 1] == '1' ? '2':'1';
            }
            else if (lon[li] == '2'){
                lon[li] = sho[si];
                lon[li - 1] = lon[li - 1] == '1' ? '2':'1';
            }
            else if (lon[li] != sho[si]){
                lon[li] = '1';
            }
            li--;
            si--;
        }

        if (lon[0] == '0'){
            return new String(lon).substring(1);
        }else {
            return new String(lon);
        }
    }


//    public String addBinary(String a, String b) {
//        char[] as = a.toCharArray();
//        char[] bs = b.toCharArray();
//        char[] lon = as.length >= bs.length ? as : bs;
//        char[] sho = as.length >= bs.length ? bs : as;
//        int li = lon.length - 1;
//        int si = sho.length - 1;
//        boolean addOne = false;
//
//        while (li >= 0){
//
//            if (lon[li] == '1' && sho[si] == '1'){
//                lon[li] = '0';
//                if (li != 0){
//                    lon[li - 1] = lon[li - 1] == '1' ? '2':'1';
//                }else {
//                    addOne = true;
//                }
//            }
//            else if (lon[li] == '2'){
//                lon[li] = sho[si];
//                if (li != 0){
//                    lon[li - 1] = lon[li - 1] == '1' ? '2':'1';
//                }else {
//                    addOne = true;
//                }
//            }
//            else if (lon[li] != sho[si]){
//                lon[li] = '1';
//            }
//
//            li--;
//            if (si > 0){
//                si--;
//            }else {
//                sho[0] = '0';
//            }
//        }
//
//        if (addOne){
//            return '1' + new String(lon);
//        }else return new String(lon);
//    }
}

