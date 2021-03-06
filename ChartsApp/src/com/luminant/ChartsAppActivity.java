package com.luminant;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class ChartsAppActivity extends TabActivity {
    /** Called when the activity is first created. */
    @SuppressWarnings("deprecation")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Resources res = getResources(); //Resource object to get Drawables
        TabHost tabHost = getTabHost();	//The activity TabHost
        TabHost.TabSpec spec;			//Reusable TabSpec for each tab
        Intent intent;					//Reusable Intent for each tab
        
        //Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, Activity1.class);
        //Initialize a TabSpec for each tab and add it to the TabHost
        spec = tabHost.newTabSpec("tab1").setIndicator("Tab One", res.getDrawable(R.drawable.ic_tab_artists)).setContent(intent);
        tabHost.addTab(spec);
        
        //Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, Activity2.class);
        //Initialize a TabSpec for each tab and add it to the TabHost
        spec = tabHost.newTabSpec("tab2").setIndicator("Tab Two", res.getDrawable(R.drawable.ic_tab_artists)).setContent(intent);
        tabHost.addTab(spec); 
    
        //Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, Activity3.class);
	    //Initialize a TabSpec for each tab and add it to the TabHost
	    spec = tabHost.newTabSpec("tab3").setIndicator("Tab Three", res.getDrawable(R.drawable.ic_tab_artists)).setContent(intent);
	    tabHost.addTab(spec); 
	    
	    tabHost.setCurrentTab(2);
    }
}