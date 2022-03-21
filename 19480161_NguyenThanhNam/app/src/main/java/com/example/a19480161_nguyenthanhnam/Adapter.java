package com.example.a19480161_nguyenthanhnam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import org.xmlpull.v1.XmlPullParser;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    private Context ctx;
    private LayoutInflater layout;
    private ArrayList<Goods> arrayList;

    public Adapter(Context ctx, ArrayList<Goods> arrayList) {
        this.ctx = ctx;
        this.arrayList = arrayList;
        this.layout = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=LayoutInflater.from(ctx).inflate((XmlPullParser) layout,viewGroup,false);

        return view;
    }
}
