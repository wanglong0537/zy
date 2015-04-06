package com.wangmeng.zy;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

public class MyDialog extends Dialog{

	View view1;
	View view2;
	public MyDialog(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	public MyDialog(Context context, int theme){
        super(context, theme);
    }

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.my_dialog);
	}
	
	public void dismisDia(View view){
		dismiss();
	}
}
