package com.davie.junitdemo;

import android.app.Activity;
import android.content.SyncStatusObserver;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        int a = 3,b = 5;

        int max = max(a,b);

        if(5 == max){

        }

        String [] st = StringUtils.splitString("bc",",");
        for(int i = 0;i<st.length;i++){
            String s = st[i];
        }
    }

    public boolean isEmpty(String s){
        boolean ret = true;
        ret = StringUtils.isEmpty(s);

        return ret;
    }

    /**
     * 获取最大值
     *
     * @param a
     * @param b
     * @return
     */
    public int max(int a, int b){
        int ret = a;
        if(a > b){
            ret = a;
        }else {
            ret = b;
        }
        return ret;
    }
}
