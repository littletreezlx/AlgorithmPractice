package com.example.array;


import java.util.*;

/*
Find Common Characters

 */
class T1002 {

    public static void main(String[] args) {
        String[] str = {"bella","label","roller"};
        System.out.println(new T1002().commonChars(str));
    }


    public List<String> commonChars(String[] A) {
        HashMap<Character, Integer> commonMap;
        commonMap = toHashMap(A[0]);

        for (int i = 1; i < A.length; i++) {
            HashMap<Character, Integer> map = toHashMap(A[i]);
            Iterator<Character> iterator = commonMap.keySet().iterator();

            while (iterator.hasNext()){
                char c = iterator.next();
                if (!map.containsKey(c)){
                    iterator.remove();
                }else {
                    commonMap.put(c, Math.min(commonMap.get(c), map.get(c)));
                }
            }


//            for (Character c : commonMap.keySet()){
//                if (!map.containsKey(c)){
//                    commonMap.remove(c);
//                }else {
//                    commonMap.put(c, Math.min(commonMap.get(c), map.get(c)));
//                }
//            }
        }

        List<String> res = new ArrayList<>();


        for (Character c : commonMap.keySet()){
            int n = commonMap.get(c);
            for (int i = 0; i < n; i++) {
                res.add(c.toString());
            }
        }

        return res;
    }


    public HashMap toHashMap(String str){
        char[] A0 = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap();
        for (int i = 0; i < A0.length; i++) {
            char c = A0[i];
            if (map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else {
                map.put(c, 1);
            }
        }
        return map;
    }
}

