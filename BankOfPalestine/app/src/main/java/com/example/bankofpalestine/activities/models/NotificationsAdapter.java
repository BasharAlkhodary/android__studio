package com.example.bankofpalestine.activities.models;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.bankofpalestine.R;

import java.util.ArrayList;

public class NotificationsAdapter extends BaseAdapter {
    Context context;
    ArrayList<Notifications> notif;
    LayoutInflater layoutInflater;

    public NotificationsAdapter(Context context, ArrayList<Notifications> notif) {
        this.context = context;
        this.notif = notif;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return notif.size();
    }

    @Override
    public Object getItem(int i) {
        return notif.get(i);
    }

    @Override
    public long getItemId(int i) {
        return notif.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View root = layoutInflater.inflate(R.layout.notif_item , null);
        TextView date = root.findViewById(R.id.tv_date1);
        TextView pay = root.findViewById(R.id.tv_pay);
        TextView post = root.findViewById(R.id.tv_post);

        date.setText(notif.get(i).getDate());
        pay.setText(notif.get(i).getPay());
        post.setText(notif.get(i).getPost());

        return root;
    }
}
