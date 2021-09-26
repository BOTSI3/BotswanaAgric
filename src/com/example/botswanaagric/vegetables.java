package com.example.botswanaagric;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class vegetables extends Activity {

 
    
Button b1,b2,b3;
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.vegetables);


    b1=(Button) findViewById(R.id.button1);
    b2=(Button) findViewById(R.id.button2);
    b3=(Button) findViewById(R.id.button3);
    
b1.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
Intent i1=new Intent(vegetables.this, asparagas.class);
		
		
		startActivity(i1);
	}
});
b2.setOnClickListener(new View.OnClickListener() {
	
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
Intent i1=new Intent(vegetables.this, carrot.class);
  		
  		
			startActivity(i1);
		}
	});
b3.setOnClickListener(new View.OnClickListener() {
	
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
Intent i1=new Intent(vegetables.this, sweetp.class);
  		
  		
			startActivity(i1);
		}
	});



}

}
