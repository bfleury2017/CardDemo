package com.nhti.carddemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Brian on 3/14/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    private String[] titles = {"Chapter one","Chapter two","Chapter three","Chapter four",
            "Chapter five","Chapter six","Chapter seven","Chapter eight"};

    private String[] details = {"Item one details","Item two details","Item three details", "Item four details",
            "Item five details","Item six details","Item seven details","Item eight details"};

    private int[] images = {android.R.drawable.ic_dialog_email,
            android.R.drawable.ic_dialog_alert,
            android.R.drawable.ic_dialog_info,
            android.R.drawable.ic_dialog_map,
            android.R.drawable.ic_dialog_dialer,
            android.R.drawable.ic_dialog_email,
            android.R.drawable.ic_dialog_dialer,
            android.R.drawable.ic_media_ff};

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.itemTitle.setText(titles[position]);
        holder.itemDetail.setText(details[position]);
        holder.itemImage.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;

        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle = (TextView) itemView.findViewById(R.id.item_title);
            itemDetail = (TextView) itemView.findViewById(R.id.item_detail);
        }
    }
}
