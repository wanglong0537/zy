package com.wangmeng.zy;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Test2Activity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView tv = new TextView(this);
		tv.setText("test2");
		setContentView(tv);
	}
}
