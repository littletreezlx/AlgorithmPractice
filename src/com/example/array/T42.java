package com.example.array;



/*
Trapping Rain Water

!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
审题！找出一个大的规则，而不是去找出一个细节！不要沉迷在细节、流程里！

 */
class T42 {

    public static void main(String[] args) {
        int[] array = {1,9,7,1,3,6,4,7,4,8,3,6,3,5,3,7};
        System.out.println(new T42().trap(array));
    }

    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int res = 0;

        while (left < right){

            if (height[left] < height[right]){
                leftMax = Math.max(height[left], leftMax);
                res += leftMax - height[left];
                left ++;
            }
            else {
                rightMax = Math.max(height[right], rightMax);
                res += rightMax - height[right];
                right --;
            }
        }
        return res;
    }




    //sad- -
//
//        public int trap(int[] height) {
//        if (height.length < 3) return 0;
//        List<Integer> list = new ArrayList<>();
//        int res = 0;
//        if (height[0] > height[1]){
//            list.add(0);
//        }
//        for (int i = 1; i < height.length - 1; i++) {
//            if (height[i] > 0 && height[i] >= height[i - 1] && height[i] >= height[i + 1]){
//                list.add(i);
//            }
//        }
//        if (height[height.length - 1] > height[height.length - 2]){
//            list.add(height.length - 1);
//        }
//
//
////        int lastHigh = 0;
////        int lastLow = 0;
//        List<Integer> toRemove = new ArrayList<>();
//        List<Integer> tempToRemove = new ArrayList<>();
//        int lastHigh, lastLow;
//        lastHigh = list.get(0);
//        lastLow  = -1;
//
//        for (int i = 1; i < list.size(); i++) {
//            int now = list.get(i);
//            int a = height[now];
//            int b = height[lastHigh];
////            if (lastHigh < lastLow && lastLow < now && height[now] >= height[lastLow]){
////                tempToRemove.add(lastLow);
////            }
//            if (lastLow != -1 && height[now] >= height[lastLow]){
//                toRemove.addAll(tempToRemove);
//                tempToRemove.clear();
//            }
//
//            if (height[now] >= height[lastHigh]){
//               lastHigh = now;
//               lastLow = -1;
//                toRemove.addAll(tempToRemove);
//                tempToRemove.clear();
//            }else {
//                tempToRemove.add(now);
//                if (lastLow == -1){
//                    lastLow = now;
//                } else if (height[now] >= height[lastLow]){
//                    lastLow = now;
//                }
//            }
////            if (lastLow == 0 || height[now] <= height[lastLow]){
////                lastLow = now;
////            }
//        }
//
//        list.removeAll(toRemove);
//        for (int i = 0; i < list.size() - 1; i++) {
//            int left = list.get(i);
//            int right = list.get(i + 1);
//            int depth = Math.min(height[left], height[right]);
//            int rain = depth * (right - left - 1);
//            for (int j = left + 1; j < right; j++) {
//                rain -= Math.min(height[j], depth);
//            }
//            res += rain;
//        }
//        return res;
//    }
}

