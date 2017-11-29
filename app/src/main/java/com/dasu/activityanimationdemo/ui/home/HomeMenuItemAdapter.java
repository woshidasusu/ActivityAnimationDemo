package com.dasu.activityanimationdemo.ui.home;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dasu.activityanimationdemo.R;
import com.dasu.activityanimationdemo.mode.home.LayoutMenu;
import com.dasu.activityanimationdemo.ui.view.base.AbsItemRecyclerAdapter;
import com.dasu.activityanimationdemo.utils.LogUtils;

import java.util.List;

/**
 * Created by suxq on 2017/11/27.
 */

public class HomeMenuItemAdapter extends AbsItemRecyclerAdapter<LayoutMenu.CardElement> {


    public HomeMenuItemAdapter(List<LayoutMenu.CardElement> data) {
        super(data);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LogUtils.v(TAG, "onCreateViewHolder(), parent children count: " + parent.getChildCount());
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_menu_item, parent, false);
        view.setOnFocusChangeListener(onItemFocusChanged());
        return new ViewHolder(view);
    }

    @Override
    protected void onBindView(RecyclerView.ViewHolder holder, LayoutMenu.CardElement data, int position) {

    }

    private View.OnFocusChangeListener onItemFocusChanged() {
        return new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    onItemFocus(v);
                } else {
                    onItemUnFocus(v);
                }
            }
        };
    }

    private void onItemFocus(View v) {

    }

    private void onItemUnFocus(View v) {

    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
