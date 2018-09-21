package com.saiyandapalli.midterm;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.firebase.ui.storage.images.FirebaseImageLoader;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;


public class ListAdapter extends RecyclerView.Adapter<ListAdapter.CustomViewHolder> {

    private Context context;
    private ArrayList<Post> data;

    public ListAdapter(Context context, ArrayList<Post> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_view, parent, false);
        return new CustomViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final CustomViewHolder holder, final int position) {
        Post m = data.get(position);
        holder.nameView.setText("Title: "+ m.name);
        holder.emailView.setText("By: " + m.email);
        StorageReference storageReference = FirebaseStorage.getInstance().getReference().child(m.firebaseImageUrl + ".png");
        Glide.with(context).using(new FirebaseImageLoader()).load(storageReference).into(holder.imageView);
    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    /**
     * A card displayed in the RecyclerView
     */
    class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView nameView;
        ImageView imageView;
        TextView emailView;

        public CustomViewHolder (View view) {
            super(view);
            this.emailView = (TextView) view.findViewById(R.id.emailView);
            this.nameView = (TextView) view.findViewById(R.id.emailloginView);
            this.imageView = (ImageView) view.findViewById(R.id.imageView);
        }
    }
}
