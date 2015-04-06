package com.wangmeng.zy;


import java.util.HashMap;

import junit.framework.Test;

import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

	TabHost tabHost = null;
	HashMap<String, Intent> hash = new HashMap();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.maintabs);
		tabHost = getTabHost(); // The activity TabHost
		TabSpec spec;
		// 第一个TAB
		View view1 = LayoutInflater.from(this).inflate(R.layout.tab_item, null, false);
//		ImageView image1 = (ImageView) view1.findViewById(R.id.tab_icon);
//		image1.setBackgroundResource(R.drawable.bottom_tab1);
		TextView textView1 = (TextView) view1.findViewById(R.id.tab_text);
		textView1.setText("收款");
		Intent intent1 = new Intent(this, Test1Activity.class);// 新建一个Intent用作Tab1显示的内容
		spec = tabHost.newTabSpec("tab1")// 新建一个 Tab
				.setIndicator(view1).setContent(intent1);// 设置显示的intent，这里的参数也可以是R.id.xxx
		tabHost.addTab(spec);// 添加进tabHost
		hash.put("tab1", intent1);
		
		// 第二个TAB
		TabSpec spec2;
		View view2 = LayoutInflater.from(this).inflate(R.layout.tab_item, null, false);
//		ImageView image2 = (ImageView) view1.findViewById(R.id.tab_icon);
//				image1.setBackgroundResource(R.drawable.bottom_tab1);
		TextView textView2 = (TextView) view2.findViewById(R.id.tab_text);
		textView2.setText("流水");
		Intent intent2 = new Intent(this, Test2Activity.class);// 新建一个Intent用作Tab1显示的内容
		spec2 = tabHost.newTabSpec("tab2")// 新建一个 Tab
				.setIndicator(view2).setContent(intent2);// 设置显示的intent，这里的参数也可以是R.id.xxx
		tabHost.addTab(spec2);// 添加进tabHost
		hash.put("tab2", intent2);
		
		// 第三个TAB
		TabSpec spec3;
		View view3 = LayoutInflater.from(this).inflate(R.layout.tab_item, null, false);
//		ImageView image2 = (ImageView) view1.findViewById(R.id.tab_icon);
//				image1.setBackgroundResource(R.drawable.bottom_tab1);
		TextView textView3 = (TextView) view3.findViewById(R.id.tab_text);
		textView3.setText("更多");
		Intent intent3 = new Intent(this, Test3Activity.class);// 新建一个Intent用作Tab1显示的内容
		spec3 = tabHost.newTabSpec("tab3")// 新建一个 Tab
				.setIndicator(view3).setContent(intent3);// 设置显示的intent，这里的参数也可以是R.id.xxx
		tabHost.addTab(spec3);// 添加进tabHost
		hash.put("tab3", intent3);
	}


}
