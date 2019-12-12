package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;


import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static java.lang.Integer.getInteger;
import static java.lang.Integer.valueOf;

public class MainActivity extends AppCompatActivity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button NPEButton = (Button)findViewById(R.id.button12);//TODO: change name of button to name of error that causes crash

		NPEButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				//null pointer exception
				int i = 0;
				try {
					i = getInteger(null);
				}
				catch(NullPointerException NPE){
					System.out.println("NullPointerException");
				}

			}
		});


	}

}



