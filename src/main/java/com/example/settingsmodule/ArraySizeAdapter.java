package com.example.settingsmodule;

import static com.example.settingsmodule.SettingsActivity.textSize;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ArraySizeAdapter<String> extends ArrayAdapter<String> {

    public ArraySizeAdapter(Context t, ArrayList view) {
        super(t, android.R.layout.simple_list_item_1, view );
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup)
    {
        View v = super.getView(position, view, viewGroup);
        switch (textSize) {
            case 0:  ((TextView)v).setTextSize(16);
                break;
            case 1: ((TextView)v).setTextSize(20);
                break;
            case 2: ((TextView)v).setTextSize(24);
                break;
            default: break;
        }
        return v;
    }
}
