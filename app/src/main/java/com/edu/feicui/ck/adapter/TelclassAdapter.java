package com.edu.feicui.ck.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.edu.feicui.ck.bean.TelclassInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16245 on 2016/05/05.
 */
public class TelclassAdapter extends BaseAdapter{
    private LayoutInflater layoutInflater;
    public TelclassAdapter(Context context) {
        layoutInflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    private ArrayList<TelclassInfo> adapterDatas = new
            ArrayList<TelclassInfo>();
    public void addDataToAdapter(TelclassInfo e) {
        if (e != null) {
            adapterDatas.add(e);
        }
    }
    public void clearDataTOAdapter() {
        adapterDatas.clear();
    }
    // 添加数据到当前适配器集合
    public void addDataToAdapter(List<TelclassInfo> e) {
        if (e != null) {
            adapterDatas.addAll(e);
        }
    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
