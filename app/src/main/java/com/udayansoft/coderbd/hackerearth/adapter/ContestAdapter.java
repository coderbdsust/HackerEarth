package com.udayansoft.coderbd.hackerearth.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.android.volley.Network;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.paging.listview.PagingBaseAdapter;
import com.udayansoft.coderbd.hackerearth.AppController;
import com.udayansoft.coderbd.hackerearth.R;
import com.udayansoft.coderbd.hackerearth.pojo.Contest;

import java.util.ArrayList;

/**
 * Created by Biswajit Debnath on 26-Sep-16.
 */

public class ContestAdapter extends ArrayAdapter<Contest> {

    private ImageLoader imageLoader  = AppController.getInstance().getImageLoader();

    public ContestAdapter(Context context,ArrayList<Contest> contests){
        super(context, 0 ,contests);
    }


    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(parent.getContext()).inflate(
                    R.layout.paging_list_item, parent, false);
        }
        if(imageLoader==null)
            imageLoader=AppController.getInstance().getImageLoader();

        Contest contest = getItem(position);
        TextView contestNameTextView = (TextView)listItemView.findViewById(R.id.contest_name_textview);
        contestNameTextView.setText(contest.getName());

        TextView categoryTextView = (TextView) listItemView.findViewById(R.id.category_textview);
        categoryTextView.setText(contest.getCategory());

        NetworkImageView nImageView = (NetworkImageView) listItemView.findViewById(R.id.contest_imageview);
        nImageView.setImageUrl(contest.getImage(),imageLoader);

        return listItemView;
    }

}
