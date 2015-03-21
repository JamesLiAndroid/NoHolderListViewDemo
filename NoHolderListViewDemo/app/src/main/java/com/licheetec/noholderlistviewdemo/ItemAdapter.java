package com.licheetec.noholderlistviewdemo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by licheetec on 2015/3/21.
 */
public class ItemAdapter extends ArrayAdapter<Item> {
    public ItemAdapter(Context context, List<Item> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ItemView view = (ItemView) convertView;
        if (view == null) {
            view = ItemView.newInstance(parent);
        }
        view.populateData(getItem(position));
        return view;
    }
}
