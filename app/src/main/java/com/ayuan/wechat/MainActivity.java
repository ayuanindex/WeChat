package com.ayuan.wechat;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button weChat = (Button) findViewById(R.id.btn_wechat);
        Button contact = (Button) findViewById(R.id.btn_contact);
        Button discover = (Button) findViewById(R.id.btn_discover);
        Button mySelf = (Button) findViewById(R.id.btn_myself);

        //给按钮设置点击事件
        weChat.setOnClickListener(this);
        contact.setOnClickListener(this);
        discover.setOnClickListener(this);
        mySelf.setOnClickListener(this);

        /*//加载默认页面(微信）
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(android.R.id.content, new WeChatFragment());
        fragmentTransaction.commit();*/
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (v.getId()) {
            case R.id.btn_wechat:
                //点击了微信按钮
                /*addFragment(new WeChatFragment());*/
                fragmentTransaction.replace(R.id.ll, new WeChatFragment());
                break;
            case R.id.btn_contact:
                //点击了联系人按钮
                /*addFragment(new ContactFragment());*/
                fragmentTransaction.replace(R.id.ll, new ContactFragment());
                break;
            case R.id.btn_discover:
                //点击了发现按钮
                /*addFragment(new DiscoverFragment());*/
                fragmentTransaction.replace(R.id.ll, new DiscoverFragment());
                break;
            case R.id.btn_myself:
                //点击了我的按钮
                /*addFragment(new MyselfFragment());*/
                fragmentTransaction.replace(R.id.ll, new MyselfFragment());
                break;
        }
        fragmentTransaction.commit();
    }

    /*private void addFragment(Fragment fragment) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.ll, fragment);
        fragmentTransaction.commit();
    }*/
}
