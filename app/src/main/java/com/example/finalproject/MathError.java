package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MathError extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_math_error);
		Button Home = (Button)findViewById(R.id.button7);

		Home.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				//null pointer exception
				Intent i = new Intent(getApplicationContext(),MainActivity.class);
				startActivity(i);

			}
		});
		int i = 1/2;
		int k = 10/i;

	}
}
