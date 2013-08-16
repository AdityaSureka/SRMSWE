package com.example.srmuswe;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class Directory_main extends Activity {
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.directory_main);
        
        ArrayList<Directory_details> image_details = GetSearchResults();
        
        final ListView lv1 = (ListView) findViewById(R.id.listV_main);
        lv1.setAdapter(new Directory_ListAdapter(this, image_details));
        
        lv1.setOnItemClickListener(new OnItemClickListener() {
        	@Override
        	public void onItemClick(AdapterView<?> a, View v, int position, long id) { 
        		Object o = lv1.getItemAtPosition(position);
            	Directory_details obj_itemDetails = (Directory_details)o;
        		Toast.makeText(Directory_main.this, "You have chosen : " + " " + obj_itemDetails.getName(), Toast.LENGTH_LONG).show();
        	}  
        });
    }
    
    private ArrayList<Directory_details> GetSearchResults(){
    	ArrayList<Directory_details> results = new ArrayList<Directory_details>();
    	
    	Directory_details item_details = new Directory_details();
    	item_details.setName("Dr. C. Lakshmi");
    	item_details.setItemDescription("Professor & Head");
    	item_details.setImageNumber(1);
    	results.add(item_details);
    	
    	item_details = new Directory_details();
    	item_details.setName("Mr.T. Sabhanayagam");
    	item_details.setItemDescription("Asst. Professor(SG)");
    	item_details.setImageNumber(2);
    	results.add(item_details);
    	
    	item_details = new Directory_details();
    	item_details.setName("Mr.S. Karthik");
    	item_details.setItemDescription("Professor(Sr.G)");
    	item_details.setImageNumber(3);
    	results.add(item_details);
    	
    	item_details = new Directory_details();
    	item_details.setName("Mr.J. Prassanna");
    	item_details.setItemDescription("Asst. Professor(Sr.G)");
    	item_details.setImageNumber(4);
    	results.add(item_details);
    	
    	item_details = new Directory_details();
    	item_details.setName("Mr.G. Senthil Kumar");
    	item_details.setItemDescription("Asst. Professor(Sr.G)");
    	item_details.setImageNumber(5);
    	results.add(item_details);
    	
    	item_details = new Directory_details();
    	item_details.setName("Mrs.T.S. Shiny Angel");
    	item_details.setItemDescription("Asst. Professor(Sr.G)");
    	item_details.setImageNumber(6);
    	results.add(item_details);
    	
    	item_details = new Directory_details();
    	item_details.setName("Ms.N.Snehalatha");
    	item_details.setItemDescription("Asst. Professor(O.G)");
    	item_details.setImageNumber(7);
    	results.add(item_details);

    	item_details = new Directory_details();
    	item_details.setName("Mrs.Angeline Julia");
    	item_details.setItemDescription("Asst. Professor(O.G)");
    	item_details.setImageNumber(8);
    	results.add(item_details);

    	item_details = new Directory_details();
    	item_details.setName("Ms.Sasi Rekha Sankar");
    	item_details.setItemDescription("Asst. Professor(O.G)");
    	item_details.setImageNumber(9);
    	results.add(item_details);

    	item_details = new Directory_details();
    	item_details.setName("Ms.S. Krishnaveni");
    	item_details.setItemDescription("Asst. Professor(O.G)");
    	item_details.setImageNumber(10);
    	results.add(item_details);

    	item_details = new Directory_details();
    	item_details.setName("Mr.K. Vijayakumar");
    	item_details.setItemDescription("Asst. Professor(O.G)");
    	item_details.setImageNumber(11);
    	results.add(item_details);

    	item_details = new Directory_details();
    	item_details.setName("Mrs.C.G.Anupama");
    	item_details.setItemDescription("Asst. Professor(O.G)");
    	item_details.setImageNumber(12);
    	results.add(item_details);

    	item_details = new Directory_details();
    	item_details.setName("Mrs.D.Anitha");
    	item_details.setItemDescription("Asst. Professor(O.G)");
    	item_details.setImageNumber(13);
    	results.add(item_details);

    	item_details = new Directory_details();
    	item_details.setName("Mrs. S. Aruna Sankaralingam");
    	item_details.setItemDescription("Asst. Professor(O.G)");
    	item_details.setImageNumber(14);
    	results.add(item_details);

    	item_details = new Directory_details();
    	item_details.setName("Ms.A.Swathy Priya");
    	item_details.setItemDescription("Asst. Professor(O.G)");
    	item_details.setImageNumber(15);
    	results.add(item_details);

    	item_details = new Directory_details();
    	item_details.setName("Ms.Cinza Susan Abraham");
    	item_details.setItemDescription("Asst. Professor(O.G)");
    	item_details.setImageNumber(16);
    	results.add(item_details);

    	item_details = new Directory_details();
    	item_details.setName("Mrs.R.Renuga Devi");
    	item_details.setItemDescription("Asst. Professor(O.G)");
    	item_details.setImageNumber(17);
    	results.add(item_details);


    	return results;
    }
}