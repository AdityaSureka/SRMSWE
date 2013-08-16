package com.example.srmuswe;


import java.util.ArrayList;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Directory_ListAdapter extends BaseAdapter {
	private static ArrayList<Directory_details> itemDetailsrrayList;
	
	private Integer[] imgid = {
			R.drawable.clakshmi,
			R.drawable.sabhanayagham,
			R.drawable.skarthik,
			R.drawable.jprassanna,
			R.drawable.gsenthilkumar,
			R.drawable.shinyangel,
			R.drawable.snehalatha,
			R.drawable.angelinejulia,
			R.drawable.unknown,
			R.drawable.krishnaveni,
			R.drawable.unknown,
			R.drawable.anupama,
			R.drawable.anitha,
			R.drawable.saruna,
			R.drawable.swathypriya,
			R.drawable.cinzasusan,
			R.drawable.renugadevi
			};
	
	private LayoutInflater l_Inflater;

	public Directory_ListAdapter(Context context, ArrayList<Directory_details> results) {
		itemDetailsrrayList = results;
		l_Inflater = LayoutInflater.from(context);
	}

	public int getCount() {
		return itemDetailsrrayList.size();
	}

	public Object getItem(int position) {
		return itemDetailsrrayList.get(position);
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if (convertView == null) {
			convertView = l_Inflater.inflate(R.layout.directory_details_view, null);
			holder = new ViewHolder();
			holder.txt_itemName = (TextView) convertView.findViewById(R.id.name);
			holder.txt_itemDescription = (TextView) convertView.findViewById(R.id.itemDescription);
			holder.itemImage = (ImageView) convertView.findViewById(R.id.photo);

			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		
		holder.txt_itemName.setText(itemDetailsrrayList.get(position).getName());
		holder.txt_itemDescription.setText(itemDetailsrrayList.get(position).getItemDescription());
		holder.itemImage.setImageResource(imgid[itemDetailsrrayList.get(position).getImageNumber() - 1]);


		return convertView;
	}

	static class ViewHolder {
		TextView txt_itemName;
		TextView txt_itemDescription;
		ImageView itemImage;
	}
}
