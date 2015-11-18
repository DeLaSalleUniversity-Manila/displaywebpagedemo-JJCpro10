package com.example.janssen.displaywebpagedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    public void displayWebpage(){
        WebView wv = (WebView) findViewById(R.id.webViewdlsu);
        wv.loadUrl("http://www.dlsu.edu.ph");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayWebpage();
    }
}
