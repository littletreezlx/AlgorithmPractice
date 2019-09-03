package com.example.recursion;


import java.util.ArrayList;
import java.util.List;

/*
Restore IP Addresses

 */
class T93 {

    public static void main(String[] args) {
        String s = "101023";
        System.out.println(new T93().restoreIpAddresses(s));

//        Arrays.sort();

    }


    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() > 12){
            return res;
        }
        List<String> subRes = new ArrayList<>();
        recursion(s, 4, subRes, res);
        return res;
    }


    public void recursion(String s, int n, List<String> subRes, List<String> res){
        if (n ==  1 && s.length() > 0 && s.length() < 4){
            if (s.length() > 1 && s.substring(0,1).equals("0")){
                return;
            }
            if (Integer.valueOf(s) <= 255){
                String str = subRes.get(0) + "." + subRes.get(1) + "." + subRes.get(2) + "." + s ;
                res.add(str);
            }
            return;
        }

        for (int i = 1; i <= 3 && i <= s.length(); i++) {
            String subStr = s.substring(0, i);
            if (Integer.valueOf(subStr) <= 255){
                subRes.add(subStr);
                n--;
                recursion(s.substring(i), n, subRes, res);
                n++;
                subRes.remove(subRes.size() - 1);
            }

            if (subStr.equals("0")){
                break;
            }
        }
    }

}

