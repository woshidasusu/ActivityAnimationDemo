package com.dasu.activityanimationdemo.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v17.leanback.widget.VerticalGridView;
import android.view.View;

import com.dasu.activityanimationdemo.R;
import com.dasu.activityanimationdemo.mode.home.LayoutMenu;
import com.dasu.activityanimationdemo.presenter.home.HomeMvpView;
import com.dasu.activityanimationdemo.presenter.home.HomePresenter;
import com.dasu.activityanimationdemo.ui.anim.ActivityAnimationHelper;
import com.dasu.activityanimationdemo.ui.base.BaseActivity;
import com.dasu.activityanimationdemo.ui.videodetail.VideoDetailActivity;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends BaseActivity implements HomeMvpView{

    private VerticalGridView mContentGridView;

    private List<LayoutMenu> mLayoutMenus;
    private HomeMenuAdapter mMenuAdapter;
    private HomePresenter mHomePresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mContentGridView = (VerticalGridView)findViewById(R.id.vg_home_content);

        mLayoutMenus = new ArrayList<>();
        mMenuAdapter = new HomeMenuAdapter(mLayoutMenus);
        mMenuAdapter.setOnMenuItemClickListener(onMenuItemClick());
        mContentGridView.setAdapter(mMenuAdapter);
        mContentGridView.setVerticalSpacing(20);
        mHomePresenter = new HomePresenter(this, this);
        mHomePresenter.loadData();
    }

    private HomeMenuAdapter.onMenuItemClickListener onMenuItemClick() {
        return new HomeMenuAdapter.onMenuItemClickListener() {
            @Override
            public void onMenuItemClick(View view, LayoutMenu.CardElement data, int menuPosition, int elementPosition, int cardPosition) {
                Intent intent = new Intent(mContext, VideoDetailActivity.class);
                ActivityAnimationHelper.startActivity(mContext, intent, view);
            }
        };
    }

    @Override
    public void mvpUpdateHomeLayout(List<LayoutMenu> layoutMenus) {
        if (layoutMenus == null || layoutMenus.size() == 0) {
            return;
        }
        mLayoutMenus.clear();
        mLayoutMenus.addAll(layoutMenus);
        mContentGridView.setItemViewCacheSize(mLayoutMenus.size());
        mMenuAdapter.notifyDataSetChanged();
    }
}
