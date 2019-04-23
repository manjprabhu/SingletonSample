package com.example.singletonsample;


public class LazyLoadingSingleton {

    private static LazyLoadingSingleton mLazyLoagingInstance;

    private LazyLoadingSingleton() {
    }

    public static LazyLoadingSingleton getLazyLoadingSingleton() {
        if(mLazyLoagingInstance == null) {
            synchronized (LazyLoadingSingleton.class) {
                if(mLazyLoagingInstance == null) {
                    mLazyLoagingInstance  = new LazyLoadingSingleton();
                }
            }
        }
        return mLazyLoagingInstance;
    }
}
