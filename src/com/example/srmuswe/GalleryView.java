package com.example.srmuswe;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class GalleryView extends MainActivity {
	Integer[] pics = { R.drawable.antartica1, R.drawable.antartica2,

			R.drawable.antartica3, R.drawable.antartica4,

			R.drawable.antartica5, R.drawable.antartica6,

			R.drawable.antartica7, R.drawable.antartica8,

			R.drawable.antartica9, R.drawable.antartica10 ,

			R.drawable.antartica3, R.drawable.antartica4,

			R.drawable.antartica5, R.drawable.antartica6,

			R.drawable.antartica7, R.drawable.antartica8,

			R.drawable.antartica9, R.drawable.antartica10 };

			LinearLayout imageView;


			/** Called when the activity is first created. */

			@Override

			public void onCreate(Bundle savedInstanceState) {

			super.onCreate(savedInstanceState);

			setContentView(R.layout.activity_images);

			try {

			// InputStream in = (new URL("www.google.com").openStream());

			} catch (Exception e) {

			e.getMessage();

			}

			Gallery ga = (Gallery) findViewById(R.id.Gallery01);

			ga.setAdapter(new ImageAdapter(this));


			imageView = (LinearLayout) findViewById(R.id.ImageView01);

			ga.setOnItemClickListener(new OnItemClickListener() {

			@Override

			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,

			long arg3) {

			Toast.makeText(

			getBaseContext(),

			"You have selected picture " + (arg2 + 1)

			+ " of Antartica", Toast.LENGTH_SHORT).show();

			try {

			imageView.removeAllViews();

			} catch (Exception e) {

			e.getMessage();

			}

			TouchImageView touchImageView = new TouchImageView(GalleryView.this);

			touchImageView.setImageResource(pics[arg2]);

			LayoutParams lp=new LayoutParams(LayoutParams.FILL_PARENT,     LayoutParams.FILL_PARENT);

			imageView.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);

			touchImageView.setLayoutParams(lp);

			imageView.addView(touchImageView);

			}


			});

			}
	

}
