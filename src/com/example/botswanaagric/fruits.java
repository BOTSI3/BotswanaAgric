package com.example.botswanaagric;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class fruits extends Activity {

   Button b1,b2,b3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fruits);
    
    
        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        
    b1.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
Intent i1=new Intent(fruits.this, grapes.class);
    		
    		
			startActivity(i1);
		}
	});
    b2.setOnClickListener(new View.OnClickListener() {
		
  		@Override
  		public void onClick(View arg0) {
  			// TODO Auto-generated method stub
  Intent i1=new Intent(fruits.this, mango.class);
      		
      		
  			startActivity(i1);
  		}
  	});
b3.setOnClickListener(new View.OnClickListener() {
		
  		@Override
  		public void onClick(View arg0) {
  			// TODO Auto-generated method stub
  Intent i1=new Intent(fruits.this, oranges.class);
      		
      		
  			startActivity(i1);
  		}
  	});
    
    
    
    }
  
    }
    