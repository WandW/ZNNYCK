package com.example.znny;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class login extends Activity {
	 
	private Button login ;
	    protected void onCreate(Bundle savedInstanceState) {
	    	 Log.i("fuck", "������1");
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.login);
	      login =(Button)findViewById(R.id.login);
	      login.setOnClickListener(new OnClickListener() {
	    	  
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Log.i("fuck", "������2");
				Toast.makeText(login.this, "�����˵�½��ť1",Toast.LENGTH_LONG).show();
				new Thread(new Runnable() {
					public void run() {
						Log.i("fuck", "������3");	
					System.out.println("log");
						Toast.makeText(login.this, "�����˵�½��ť2",Toast.LENGTH_LONG).show();
					}
				}).start();
			}
		});
	    }

}
