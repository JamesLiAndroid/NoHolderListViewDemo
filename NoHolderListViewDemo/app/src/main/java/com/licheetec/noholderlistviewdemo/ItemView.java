package com.licheetec.noholderlistviewdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by licheetec on 2015/3/21.
 */
public class ItemView extends RelativeLayout {

    private ImageView ivImage;
    private TextView tvTitle;
    private TextView tvContent;

    public ItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    // 获取ItemView
    public static ItemView newInstance(ViewGroup parent) {
        ItemView view = (ItemView) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        view.setupChildren();
        return view;
    }

    // 获取子View对象的引用
    private void setupChildren() {
        ivImage = (ImageView) findViewById(R.id.iv_image);
        tvTitle = (TextView) findViewById(R.id.tv_title);
        tvContent = (TextView) findViewById(R.id.tv_content);
    }

    // 填充数据
    public void populateData(Item item) {
        ivImage.setImageResource(item.getImgId());
        tvTitle.setText(item.getTitle());
        tvContent.setText(item.getContent());
    }

}
