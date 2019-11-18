package com.example.esprainscri.ui.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.esprainscri.R;
import com.example.esprainscri.ui.Student;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<Student> mDataset;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public TextView nbView;
        public ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            nbView = itemView.findViewById(R.id.textView4);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }


    public MyAdapter(List<Student> myDataset) {
        mDataset = myDataset;
    }



    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.nbView.setText(String.valueOf(position+1));
        holder.textView.setText(mDataset.get(position).getName());
        if (mDataset.get(position).getSex() == 0)
            holder.imageView.setImageResource(R.drawable.male_50px);
        else
            holder.imageView.setImageResource(R.drawable.female_50px);

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}