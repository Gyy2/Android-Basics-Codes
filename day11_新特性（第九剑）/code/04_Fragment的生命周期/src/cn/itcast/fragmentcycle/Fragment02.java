package cn.itcast.fragmentcycle;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment02 extends Fragment {

	//系统调用，返回一个View对象，作为Fragment的显示内容 
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		//把布局文件填充成View对象，return出去
		View v = inflater.inflate(R.layout.fragment02, null);
		return v;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		System.out.println("02create");
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		System.out.println("02start");
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		System.out.println("02resume");
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		System.out.println("02pause");
	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		System.out.println("02stop");
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		System.out.println("02destroy");
	}
}
