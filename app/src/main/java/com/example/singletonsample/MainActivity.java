package com.example.singletonsample;

import android.accounts.Account;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    private final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        checkStaticSingleton();
        CheckLazyLoading();
    }

    private void checkStaticSingleton() {
        StaticLoadingSingletone loadingSingletone = StaticLoadingSingletone.getmMySingleTone();

        Log.v(TAG,"1st==>"+loadingSingletone.hashCode());

        StaticLoadingSingletone loadingSingletone1 = StaticLoadingSingletone.getmMySingleTone();

        Log.v(TAG,"2nd==>"+loadingSingletone1.hashCode());

    }

    private void CheckLazyLoading() {
        LazyLoadingSingleton lazyLoadingSingleton = LazyLoadingSingleton.getLazyLoadingSingleton();

        Log.v(TAG,"1st==>"+lazyLoadingSingleton.hashCode());

        LazyLoadingSingleton lazyLoadingSingleton1 = LazyLoadingSingleton.getLazyLoadingSingleton();

        Log.v(TAG,"2nd==>"+lazyLoadingSingleton1.hashCode());
    }



}
