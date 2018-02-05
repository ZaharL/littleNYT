package com.zaharin.littlenyt.view.fragments.contentList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zaharin.littlenyt.R;

/**
 * Created by zah_arin on 2/5/18.
 */

public class ContentListFragment extends Fragment {
    private static final String ARG_SECTION_NUMBER = "section_number";

    public ContentListFragment() {
    }

    public static ContentListFragment newInstance(int sectionNumber) {
        ContentListFragment fragment = new ContentListFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_content_list, container, false);
        TextView textView = rootView.findViewById(R.id.section_label);
        textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
        return rootView;
    }
}
