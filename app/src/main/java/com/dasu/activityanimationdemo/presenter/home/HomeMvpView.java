package com.dasu.activityanimationdemo.presenter.home;


import com.dasu.activityanimationdemo.mode.home.LayoutMenu;
import com.dasu.activityanimationdemo.presenter.BaseMvpView;

import java.util.List;

/**
 * Created by suxq on 2017/8/1.
 */

public interface HomeMvpView extends BaseMvpView {
    void mvpUpdateHomeLayout(List<LayoutMenu> layoutMenus);

}
