package com.reactlibrary;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private String[] mDataset;
    Context context;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public LinearLayout myBtn;

        public MyViewHolder(LinearLayout v) {
            super(v);
            myBtn = v;
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(String[] myDataset, Context context) {
        mDataset = myDataset;
        this.context = context;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_btn, parent, false);


        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        TextView b = holder.myBtn.findViewById(R.id.textView);
        b.setText(mDataset[position]);

        TextView c = holder.myBtn.findViewById(R.id.button);
        Typeface font = Typeface.createFromAsset(this.context.getAssets(), "fonts/MaterialIcons.ttf");
        c.setTypeface(font);
            c.setText(Character.toString((char)58824));
//        ImageView iv = holder.myBtn.findViewById(R.id.imageView2);

//        Glide.with(context).load(mDataset[position]).into(iv);
//
//        URL newurl = null;
//        try {
//            newurl = new URL("https://facebook.github.io/react-native/img/header_logo.png");
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//        try {
//            Bitmap mIcon_val = BitmapFactory.decodeStream(newurl.openConnection().getInputStream());
//            iv.setImageBitmap(mIcon_val);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}