package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MathError extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_math_error);
		Button Home = (Button)findViewById(R.id.button7);
		ImageView imview = (ImageView) findViewById(R.id.imageView);
		imview.setImageResource(0);
		Drawable draw = getResources().getDrawable(R.drawable.capture);
		draw = (draw);
		imview.setImageDrawable(draw);

		Home.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				//null pointer exception
				Intent i = new Intent(getApplicationContext(),MainActivity.class);
				startActivity(i);

			}
		});


	}
}
