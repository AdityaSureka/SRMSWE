package com.example.srmuswe;

public class ImageAdapter extends BaseAdapter {

private Context ctx;

int imageBackground;

public ImageAdapter(Context c) {

ctx = c;

TypedArray ta = obtainStyledAttributes(R.styleable.Gallery1);

imageBackground = ta.getResourceId(

R.styleable.Gallery1_android_galleryItemBackground, 1);

ta.recycle();

}

@Override

public int getCount() {

return pics.length;

}

@Override

public Object getItem(int arg0) {

return arg0;

}

@Override

public long getItemId(int arg0) {

return arg0;

}

@Override

public View getView(int arg0, View arg1, ViewGroup arg2) {

ImageView iv = new ImageView(ctx);

iv.setImageResource(pics[arg0]);

iv.setScaleType(ImageView.ScaleType.FIT_XY);

iv.setLayoutParams(new Gallery.LayoutParams(150, 120));

iv.setBackgroundResource(imageBackground);

return iv;

}

}

}