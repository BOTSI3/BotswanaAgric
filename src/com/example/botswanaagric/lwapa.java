package com.example.botswanaagric;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class lwapa extends Activity {

	Button b1,b2;
	RadioButton r1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lwapa);
    
    
        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        r1=(RadioButton)findViewById(R.id.radioButton1);
    b1.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
			Intent i1=new Intent(lwapa.this, ditholwana.class);
    		
    		
			startActivity(i1);

			
		}
	});
    
    b2.setOnClickListener(new View.OnClickListener() {
		
  		@Override
  		public void onClick(View arg0) {
  			// TODO Auto-generated method stub
  			
  			Intent i2=new Intent(lwapa.this, meroho.class);
      		
      		
  			startActivity(i2);

  			
  		}
  	});
 r1.setOnClickListener(new View.OnClickListener() {
		
  		@Override
  		public void onClick(View arg0) {
  			// TODO Auto-generated method stub
  			
  			Intent i2=new Intent(lwapa.this, phetolo.class);
      		
      		
  			startActivity(i2);

  			
  		}
  	});
    }
}