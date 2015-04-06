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
		// ��һ��TAB
		View view1 = LayoutInflater.from(this).inflate(R.layout.tab_item, null, false);
//		ImageView image1 = (ImageView) view1.findViewById(R.id.tab_icon);
//		image1.setBackgroundResource(R.drawable.bottom_tab1);
		TextView textView1 = (TextView) view1.findViewById(R.id.tab_text);
		textView1.setText("�տ�");
		Intent intent1 = new Intent(this, Test1Activity.class);// �½�һ��Intent����Tab1��ʾ������
		spec = tabHost.newTabSpec("tab1")// �½�һ�� Tab
				.setIndicator(view1).setContent(intent1);// ������ʾ��intent������Ĳ���Ҳ������R.id.xxx
		tabHost.addTab(spec);// ��ӽ�tabHost
		hash.put("tab1", intent1);
		
		// �ڶ���TAB
		TabSpec spec2;
		View view2 = LayoutInflater.from(this).inflate(R.layout.tab_item, null, false);
//		ImageView image2 = (ImageView) view1.findViewById(R.id.tab_icon);
//				image1.setBackgroundResource(R.drawable.bottom_tab1);
		TextView textView2 = (TextView) view2.findViewById(R.id.tab_text);
		textView2.setText("��ˮ");
		Intent intent2 = new Intent(this, Test2Activity.class);// �½�һ��Intent����Tab1��ʾ������
		spec2 = tabHost.newTabSpec("tab2")// �½�һ�� Tab
				.setIndicator(view2).setContent(intent2);// ������ʾ��intent������Ĳ���Ҳ������R.id.xxx
		tabHost.addTab(spec2);// ��ӽ�tabHost
		hash.put("tab2", intent2);
		
		// ������TAB
		TabSpec spec3;
		View view3 = LayoutInflater.from(this).inflate(R.layout.tab_item, null, false);
//		ImageView image2 = (ImageView) view1.findViewById(R.id.tab_icon);
//				image1.setBackgroundResource(R.drawable.bottom_tab1);
		TextView textView3 = (TextView) view3.findViewById(R.id.tab_text);
		textView3.setText("����");
		Intent intent3 = new Intent(this, Test3Activity.class);// �½�һ��Intent����Tab1��ʾ������
		spec3 = tabHost.newTabSpec("tab3")// �½�һ�� Tab
				.setIndicator(view3).setContent(intent3);// ������ʾ��intent������Ĳ���Ҳ������R.id.xxx
		tabHost.addTab(spec3);// ��ӽ�tabHost
		hash.put("tab3", intent3);
	}


}
