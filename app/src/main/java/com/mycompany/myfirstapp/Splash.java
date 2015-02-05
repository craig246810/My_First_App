package com.mycompany.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by craig on 04/02/2015.
 */
public class Splash extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }catch (InterruptedException e){
                    // for debugging
                    e.printStackTrace();
                }finally {
                    Intent openStartingPoint = new Intent("com.mycompany.myfirstapp.STARTINGPOINT");
                    startActivity(openStartingPoint);
                }
            }
        };
        timer.start();
    }
}
