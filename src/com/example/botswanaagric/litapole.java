package com.example.botswanaagric;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;
import android.widget.Button;

public class litapole extends Activity {

    WebView w1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.litapole);
        
       w1= (WebView)findViewById(R.id.webView1);
       w1.loadUrl("file:///android_asset/litapole.html");
    
    
    
    
    
    
    }
  
    }
    