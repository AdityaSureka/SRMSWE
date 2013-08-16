package com.example.srmuswe;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Home extends Activity implements OnClickListener {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
		View v = findViewById(R.id.directory);
		//set event listener
	        v.setOnClickListener(this);
	}
	public void onClick(View arg0) {
		if(arg0.getId() == R.id.directory){
			//define a new Intent for the second Activity
			Intent intent = new Intent(this,Directory_main.class);
	 
			//start the second Activity
			this.startActivity(intent);
		}
	}

}
	 

