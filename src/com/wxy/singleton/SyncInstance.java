package com.wxy.singleton;

public class SyncInstance {

    private SyncInstance() {
    }

    private static SyncInstance instance = null;

    public static SyncInstance getInstance() {
        synchronized (SyncInstance.class) {
            if (instance == null) {
                return new SyncInstance();
            }
        }
        return instance;
    }
}
