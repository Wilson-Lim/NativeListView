package com.reactlibrary;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.image.ReactImageView;

import java.util.zip.Inflater;

public class NativeListViewManager extends SimpleViewManager<NativeListView> {

    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    public static final String REACT_CLASS = "NativeListView";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected NativeListView createViewInstance(ThemedReactContext reactContext) {

        LayoutInflater i = (LayoutInflater) reactContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        NativeListView rv = new NativeListView(reactContext);

        rv.setHasFixedSize(true);
        rv.setAdapter(new MyAdapter(new String[]{"abc", "de"}, reactContext));
        return rv;

    }

}