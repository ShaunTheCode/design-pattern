package com.wxy.singleton;

public class NoneLazyIniSingleton {
    private static NoneLazyIniSingleton iniSingleton=new NoneLazyIniSingleton();

    private NoneLazyIniSingleton(){}

    public static NoneLazyIniSingleton getInstance(){
        return iniSingleton;
    }
}
