package com.tanglang.ypt.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.lidroid.xutils.BitmapUtils;
import com.tanglang.ypt.R;
import com.tanglang.ypt.bean.Company;
import com.tanglang.ypt.utils.BitmapHelper;

import java.util.List;

/**
 * Author： Administrator
 */
public class HomeCompanyAdapter extends BaseAdapter {
    private List<Company> mData;
    private BitmapUtils bitmapUtils;
    private Context mContext;

    public HomeCompanyAdapter(Context context, List<Company> data) {
        this.mData = data;
        mContext = context;
        bitmapUtils = BitmapHelper.getBitmapUtils(context);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(mContext).inflate(R.layout.homegrid_item, parent, false);
        TextView tvText = (TextView) convertView.findViewById(R.id.homegrid_item_name);
        ImageView ivImage = (ImageView) convertView.findViewById(R.id.homegrid_item_image);
        bitmapUtils.display(ivImage, mData.get(position).titleimg);
        tvText.setText(mData.get(position).namecn);
        return convertView;
    }
}
