package com.example.rv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rv2.recycler.Car;

public class DetailActivity extends AppCompatActivity {
	TextView name;
	ImageView imageView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		initID();
		getExtra();
	}

	private void getExtra() {
		String carName = getIntent().getStringExtra("car");
		name.setText(carName);
		imageView.setImageResource(getIntent().getIntExtra("image",0));
	}

	private void initID() {
		name = findViewById(R.id.tvNew);
		imageView = findViewById(R.id.imageViewNew);
	}

}