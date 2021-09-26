package com.example.botswanaagric;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class phetolo extends Activity {

	
	EditText e1,e2,e3,e4,e5,e6,e7;
	RadioButton r1,r2;
	Button b1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback);
    
        e1 =(EditText)findViewById(R.id.editText1);
        e2 =(EditText)findViewById(R.id.editText2);
        e3 =(EditText)findViewById(R.id.editText3);
        e4 =(EditText)findViewById(R.id.editText4);
        e5 =(EditText)findViewById(R.id.editText5);
        e6 =(EditText)findViewById(R.id.editText6);
        e7 =(EditText)findViewById(R.id.editText7);
        r1=(RadioButton)findViewById(R.id.radioButton1);
        r1=(RadioButton)findViewById(R.id.radioButton2);
        b1=(Button) findViewById(R.id.button1);
        
        b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent i1=new Intent(phetolo.this, thankyou1.class);
				i1.putExtra("name", e1.getText().toString());
				i1.putExtra("email", e5.getText().toString());
				
				startActivity(i1);
				
				
			}
		});
        
     

    
    
   
    }
}