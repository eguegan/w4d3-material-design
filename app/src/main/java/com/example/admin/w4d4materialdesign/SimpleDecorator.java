package com.example.admin.w4d4materialdesign;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by admin on 4/21/2016.
 */
public class SimpleDecorator extends RecyclerView.ItemDecoration {
    private final int mSpace;

    public SimpleDecorator(int space) {
        this.mSpace = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.left = mSpace;
        outRect.right = mSpace;
        outRect.bottom = mSpace;

        // Add top margin only for the first item to avoid double space between items
        if (parent.getChildAdapterPosition(view) < 1)
            outRect.top = mSpace;
    }
}
