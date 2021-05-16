package com.wxy.singleton;

/**
 * lazy-ini
 */
public class BasicSingleton {

    private BasicSingleton(){}

    private static BasicSingleton instance=null;

    public static BasicSingleton getInstance(){
        if(instance==null){
            return new BasicSingleton();
        }
        return instance;
    }
}
