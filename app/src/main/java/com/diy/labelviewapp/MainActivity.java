package com.diy.labelviewapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.diy.labelview.Tag;
import com.diy.labelview.TagListView;
import com.diy.labelview.TagView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements TagListView.OnTagCheckedChangedListener,TagListView.OnTagClickListener {

    private TagListView mTagListView;
    private final List<Tag> mTags = new ArrayList<Tag>();
    private final String[] titles = { "安全必备", "音乐", "父母学", "上班族必备",
            "360手机卫士", "QQ","输入法", "微信", "最美应用", "AndevUI", "蘑菇街"
            ,"安全必备", "音乐", "父母学", "上班族必备", "安全必备", "音乐", "父母学", "上班族必备", "安全必备", "音乐", "父母学", "上班族必备"
            ,"安全必备", "音乐", "父母学", "上班族必备", "安全必备","安全必备", "音乐", "父母学", "上班族必备", "安全必备"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        mTagListView = (TagListView) findViewById(R.id.tagview);
        mTagListView.setDeleteMode(true);
        setUpData();
        mTagListView.setTags(mTags);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private void setUpData() {
        for (int i = 0; i < titles.length; i++) {
            Tag tag = new Tag();
            tag.setId(i);
            tag.setChecked(true);
            tag.setTitle(titles[i]);
            mTags.add(tag);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTagCheckedChanged(TagView tagView, Tag tag) {

    }

    @Override
    public void onTagClick(TagView tagView, Tag tag) {

    }
}
