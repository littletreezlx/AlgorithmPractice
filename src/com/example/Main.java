package com.example;


public class Main {

    public static void main(String[] args) {
        Test  t = new Test(1);
        System.out.println(t.getI());
        change(t);
        System.out.println(t.getI());



    }




    static void change(Test t){
        t.setI(9);
    }

    static class Test{
        private int i;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public Test(int i) {
            this.i = i;
        }
    }





}


