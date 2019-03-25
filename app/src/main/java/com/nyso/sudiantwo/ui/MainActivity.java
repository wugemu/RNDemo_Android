package com.nyso.sudiantwo.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.test.andlang.andlangutil.BaseLangActivity;
import com.example.test.andlang.util.ActivityUtil;
import com.nyso.sudiantwo.R;
import com.nyso.sudiantwo.ui.web.RNViewActivity;

import java.util.Observable;

import butterknife.OnClick;

public class MainActivity extends BaseLangActivity {

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initData() {

    }

    @OnClick(R.id.tv_click)
    public void clickJumpRN(){
        //跳转RN
        Intent intent=new Intent(MainActivity.this, RNViewActivity.class);
        ActivityUtil.getInstance().start(MainActivity.this,intent);
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
