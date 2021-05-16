package com.wxy.singleton;

public class JudgeSyncSingleton {
    private JudgeSyncSingleton() {
    }

    private volatile static JudgeSyncSingleton instance = null;

    public static JudgeSyncSingleton getInstance() {
        if (instance == null) {
            synchronized (JudgeSyncSingleton.class) {
                if (instance == null) {
                    return new JudgeSyncSingleton();
                }
            }
        }
        return instance;
    }
}
