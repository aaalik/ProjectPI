package com.example.alik.projectpi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter3 extends BaseAdapter {
    private Context mContext;

    public ImageAdapter3(Context c) {
        mContext = c;
    }
    public int getCount() {
        return mThumbIds.length;
    }
    public Object getItem(int position) {
        return null;
    }
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(175, 175));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(0, 0, 0, 0); //left, top, right, bottom
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }
    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.a_kap, R.drawable.b_kap,
            R.drawable.c_kap, R.drawable.d_kap,
            R.drawable.e_kap, R.drawable.f_kap,
            R.drawable.g_kap, R.drawable.h_kap,
            R.drawable.i_kap, R.drawable.j_kap,
            R.drawable.k_kap, R.drawable.l_kap,
            R.drawable.m_kap, R.drawable.n_kap,
            R.drawable.o_kap, R.drawable.p_kap,
            R.drawable.r_kap, R.drawable.s_kap,
            R.drawable.t_kap, R.drawable.u_kap,
            R.drawable.v_kap, R.drawable.w_kap,
            R.drawable.y_kap, R.drawable.z_kap
    };
}