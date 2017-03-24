package com.pheonixdev.weblog.viewHolder;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.pheonixdev.weblog.R;

/**
 * Created by SAB on 3/23/2017.
 */

public class ArticleItemViewHolder extends RecyclerView.ViewHolder {
    public TextView articleName;
    public CardView cardView;
    public ArticleItemViewHolder(View itemView) {
        super(itemView);
        articleName = (TextView) itemView.findViewById(R.id.articleName);
        cardView = (CardView) itemView.findViewById(R.id.cardView);
    }
}
