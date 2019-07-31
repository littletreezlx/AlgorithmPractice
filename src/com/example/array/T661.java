package com.example.array;


/*
Image Smoother

问题??? (int) (22/3.0 + 29/ 3.0 + 30/3.0) /3 = 8 ?
单独拿出来算是9啊。。


 */
class T661 {

    public static void main(String[] args)
    {
        int[][] array = {{0,5,17},{19,0,10},{13,8,9}};

        System.out.println(new T661().imageSmoother(array));
    }

    public int[][] imageSmoother(int[][] M) {
        int lon = M.length;
        int width = M[0].length;

        int[][] T = new int[lon][width];
        for (int i = 0; i < lon; i++) {
            for (int j = 0; j < width; j++) {
                if (width == 1) T[i][j] = M[i][j] * 6;
                else if (j == 0) T[i][j] = ( M[i][j]  + M[i][j + 1] ) * 3;
                else if (j == width - 1) T[i][j] = ( M[i][j]  + M[i][j - 1] ) * 3;
                else T[i][j] = (M[i][j] + M[i][j - 1] + M[i][j + 1] ) * 2;
            }
        }
        for (int i = 0; i < lon; i++) {
            for (int j = 0; j < width; j++) {
                if (lon == 1) M[i][j] = T[i][j] / 6;
                else if (i == 0)  M[i][j] =  ( T[i][j]  + T[i + 1][j] ) / (2 * 6);
                else if (i == lon - 1)  M[i][j] = ( T[i][j]  + T[i - 1][j] ) / (2 * 6);
                else M[i][j] = ( T[i][j]  + T[i + 1][j] + T[i - 1][j] ) / (3 * 6);
            }
        }
        return M;
    }


}