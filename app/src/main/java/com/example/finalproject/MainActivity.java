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
		Button NPEButton = (Button)findViewById(R.id.button12);
		Button ArrayOOB = (Button)findViewById(R.id.button13);
		Button Arithmetic = (Button)findViewById(R.id.button2);
		Button UnclosedStr = (Button)findViewById(R.id.button3);
		Button AboutBtn = (Button)findViewById(R.id.button4);
		Button Home = (Button)findViewById(R.id.button5);

		Home.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				//null pointer exception
				Intent i = new Intent(getApplicationContext(),MainActivity.class);
				startActivity(i);

			}
		});


		NPEButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				//null pointer exception
				Intent i = new Intent(getApplicationContext(),nullpoint.class);
				startActivity(i);

			}
		});
		ArrayOOB.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				//null pointer exception
				Intent i = new Intent(getApplicationContext(),ArrayOOB.class);
				startActivity(i);

			}
		});
		Arithmetic.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				//null pointer exception
				Intent i = new Intent(getApplicationContext(),MathError.class);
				startActivity(i);

			}
		});
		UnclosedStr.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				//null pointer exception
				Intent i = new Intent(getApplicationContext(),OpenString.class);
				startActivity(i);

			}
		});
		AboutBtn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				//null pointer exception
				Intent i = new Intent(getApplicationContext(),About.class);
				startActivity(i);

			}
		});

	}
}



