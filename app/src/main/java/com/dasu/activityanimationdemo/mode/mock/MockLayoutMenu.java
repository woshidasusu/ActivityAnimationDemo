package com.dasu.activityanimationdemo.mode.mock;


import com.dasu.activityanimationdemo.mode.home.LayoutMenu;
import com.dasu.activityanimationdemo.utils.LogUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by suxq on 2017/8/1.
 */

public class MockLayoutMenu {
    private static final String TAG = MockLayoutMenu.class.getSimpleName();

    public static List<LayoutMenu> mock() {
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<LayoutMenu>>(){}.getType();
        ArrayList<LayoutMenu> layoutMenus1 = gson.fromJson(layoutMenu1, type);
        LogUtils.v(TAG, "mock(), layoutMenu1:" + layoutMenus1.toString());
        return layoutMenus1;
    }

    static String layoutMenu1 = "[\n" +
            "    {\n" +
            "        \"menuId\": 12345,\n" +
            "        \"menuName\": \"推荐\",\n" +
            "        \"elementList\": [\n" +
            "            {\n" +
            "                \"cardList\": [\n" +
            "                    {\n" +
            "                        \"elementId\": 54321,\n" +
            "                        \"elementName\": \"极光之恋\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54322,\n" +
            "                        \"elementName\": \"猎场\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54323,\n" +
            "                        \"elementName\": \"我不是精英\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54324,\n" +
            "                        \"elementName\": \"解压影院\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54325,\n" +
            "                        \"elementName\": \"灿烂的日子\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54326,\n" +
            "                        \"elementName\": \"青春旅社\"\n" +
            "                    }\n" +
            "                ]\n" +
            "            }\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"menuId\": 12346,\n" +
            "        \"menuName\": \"电影\",\n" +
            "        \"elementList\": [\n" +
            "            {\n" +
            "                \"cardList\": [\n" +
            "                    {\n" +
            "                        \"elementId\": 54321,\n" +
            "                        \"elementName\": \"蟑螂\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54322,\n" +
            "                        \"elementName\": \"王牌报表\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54323,\n" +
            "                        \"elementName\": \"蜘蛛侠\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54324,\n" +
            "                        \"elementName\": \"事实\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54325,\n" +
            "                        \"elementName\": \"是破烂\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54326,\n" +
            "                        \"elementName\": \"超自然时间\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54323,\n" +
            "                        \"elementName\": \"蜘蛛侠\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54324,\n" +
            "                        \"elementName\": \"冉冉\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54325,\n" +
            "                        \"elementName\": \"天才\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54326,\n" +
            "                        \"elementName\": \"心里最\"\n" +
            "                    }\n" +
            "                ]\n" +
            "            }\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"menuId\": 12346,\n" +
            "        \"menuName\": \"dfdfg\",\n" +
            "        \"elementList\": [\n" +
            "            {\n" +
            "                \"cardList\": [\n" +
            "                    {\n" +
            "                        \"elementId\": 54321,\n" +
            "                        \"elementName\": \"我的\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54322,\n" +
            "                        \"elementName\": \"最近观看\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54323,\n" +
            "                        \"elementName\": \"收藏\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54324,\n" +
            "                        \"elementName\": \"消息\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54325,\n" +
            "                        \"elementName\": \"搜索\"\n" +
            "                    }\n" +
            "                ]\n" +
            "            },\n" +
            "            {\n" +
            "                \"cardList\": [\n" +
            "                    {\n" +
            "                        \"elementId\": 54321,\n" +
            "                        \"elementName\": \"电视剧\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54322,\n" +
            "                        \"elementName\": \"电影\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54323,\n" +
            "                        \"elementName\": \"综艺\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54324,\n" +
            "                        \"elementName\": \"动漫\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54323,\n" +
            "                        \"elementName\": \"综艺\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54324,\n" +
            "                        \"elementName\": \"动漫\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54325,\n" +
            "                        \"elementName\": \"儿童\"\n" +
            "                    }\n" +
            "                ]\n" +
            "            }\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"menuId\": 12346,\n" +
            "        \"menuName\": \"综艺\",\n" +
            "        \"elementList\": [\n" +
            "            {\n" +
            "                \"cardList\": [\n" +
            "                    {\n" +
            "                        \"elementId\": 54321,\n" +
            "                        \"elementName\": \"开心俱乐部\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54322,\n" +
            "                        \"elementName\": \"笑声传奇\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54323,\n" +
            "                        \"elementName\": \"今夜百叶门\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54324,\n" +
            "                        \"elementName\": \"我为喜剧\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54325,\n" +
            "                        \"elementName\": \"坑王\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54326,\n" +
            "                        \"elementName\": \"中奥好\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54323,\n" +
            "                        \"elementName\": \"中国好声音\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54324,\n" +
            "                        \"elementName\": \"郭德纲\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54325,\n" +
            "                        \"elementName\": \"梦想导师\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54326,\n" +
            "                        \"elementName\": \"快乐大本应\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54326,\n" +
            "                        \"elementName\": \"极限挑战\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54323,\n" +
            "                        \"elementName\": \"快乐男生\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54324,\n" +
            "                        \"elementName\": \"天使爱美丽\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54325,\n" +
            "                        \"elementName\": \"委靡修\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"elementId\": 54326,\n" +
            "                        \"elementName\": \"狼人杀\"\n" +
            "                    }\n" +
            "                ]\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "]";

}
