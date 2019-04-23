package com.example.singletonsample;

public class StaticLoadingSingletone {

    private static StaticLoadingSingletone mMySingleTone = new StaticLoadingSingletone();

    public static StaticLoadingSingletone getmMySingleTone() {
        return mMySingleTone;
    }
}
