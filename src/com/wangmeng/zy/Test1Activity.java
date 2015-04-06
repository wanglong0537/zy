package com.wangmeng.zy;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Test1Activity extends Activity {

	TextView num1_tv;
	TextView num2_tv;
	TextView num3_tv;
	TextView result_tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test1);
		result_tv = (TextView) findViewById(R.id.result_tv);
		num1_tv = (TextView) findViewById(R.id.num1_tv);
		num2_tv = (TextView) findViewById(R.id.num2_tv);
		num3_tv = (TextView) findViewById(R.id.num3_tv);
	}
	
	public void numClick(View view){
		result_tv.setText(view.getTag()+"");
	}
	
	public void showDia(View view){
		new MyDialog(this,R.style.myDialog).show();
	}
}
