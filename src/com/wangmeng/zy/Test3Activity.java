package com.wangmeng.zy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class Test3Activity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test3);
		findViewById(R.id.item_iv_01).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(Test3Activity.this,Test4Activity.class));
			}
		});
		findViewById(R.id.item_iv_02).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(Test3Activity.this,Test7Activity.class));
			}
		});
		findViewById(R.id.item_iv_04).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(Test3Activity.this,Test5Activity.class));
			}
		});
		findViewById(R.id.item_iv_05).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(Test3Activity.this,Test6Activity.class));
			}
		});
	}
}
