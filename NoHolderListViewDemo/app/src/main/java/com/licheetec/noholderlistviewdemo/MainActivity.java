package com.licheetec.noholderlistviewdemo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private ListView listView;
    private List<Item> items;
    private ItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        listView = (ListView) findViewById(R.id.listView);
        initData();
        adapter = new ItemAdapter(this, items);
        listView.setAdapter(adapter);

    }

    private void initData() {
        items = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            Item item = new Item();
            item.setImgId(i % 2 == 0 ? R.drawable.img_doge : R.drawable.img_cat);
            item.setTitle("Title No." + i);
            item.setContent("The content of No."+i);
            items.add(item);
        }
    }
}
