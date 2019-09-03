package com.example.mult_threads;

public class DCL {


    public static volatile DCL instance;

    public static DCL getInstance(){
        if (instance == null){
            synchronized (DCL.class){
                if (instance == null){
                    instance = new DCL();
                }
            }

        }
        return instance;

    }





}
