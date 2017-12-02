package com.example.android.bar;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by Akash Lakhera on 12/3/2017.
 */

public class IssueAdapter extends ArrayAdapter<Issue> {
    public IssueAdapter (Context context, int resource, List<Issue> issue) {
        super(context, resource, issue);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_message, parent, false);
        }



        return convertView;
}
