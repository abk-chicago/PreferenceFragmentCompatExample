package com.feliperoriz.settingsexample;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.preference.PreferenceCategory;
import android.support.v7.preference.PreferenceViewHolder;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by feliperoriz on 10/15/16.
 */

public class CustomCategoryPreference extends PreferenceCategory {
    public CustomCategoryPreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public CustomCategoryPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomCategoryPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomCategoryPreference(Context context) {
        super(context);
    }

    @Override
    public void onBindViewHolder(PreferenceViewHolder holder) {
        super.onBindViewHolder(holder);

        TextView title = (TextView) holder.findViewById(android.R.id.title);
        title.setTextColor(Color.GRAY);
    }
}
