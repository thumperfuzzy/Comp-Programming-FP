package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;

import static java.lang.Integer.getInteger;

public class nullpoint extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nullpoint);
		Button Home = (Button)findViewById(R.id.button);
		int i = 0;
		try {
			i = getInteger(null);
		}
		catch(NullPointerException NPE){
			System.out.println("NullPointerException");
		}






		Home.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				//null pointer exception
				Intent i = new Intent(getApplicationContext(),MainActivity.class);
				startActivity(i);

			}
		});
	}
}