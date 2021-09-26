package com.example.botswanaagric;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;


public class thankyou1 extends Activity {
	 
	TextView t1;
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thankyou1);
        
        t1=(TextView)findViewById(R.id.textView1);
        String name=getIntent().getStringExtra("name");
        String email=getIntent().getStringExtra("email");
        
        t1.setText("Rea leboha"+name+"ya atereseng ena ya imeile"+email+"bakeng sa ditshwaelo tsa hao");
   
    }
    
}
