package com.LBS.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage {

//    下方搜索图标
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]")
    @CacheLookup
    public WebElement search_icon;

//  上方信息提示关闭按钮
    @FindBy(id = "com.huizheng.plp:id/msg_close")
    @CacheLookup
    public WebElement msg_close;

// 上方页面标题
    @FindBy(id = "com.huizheng.plp:id/id_topview")
    @CacheLookup
    public WebElement topview;

//    右上角搜索按钮
    @FindBy(id="com.huizheng.plp:id/search_right_button")
    @CacheLookup
    public WebElement search_right_button;

//    列表打招呼
    @FindBy(id="com.huizheng.plp:id/search_list_item_user_hello")
    @CacheLookup
    public List<WebElement> hello_btn;

//    征友title
    @FindBy(id="com.huizheng.plp:id/title_name")
    @CacheLookup
    public WebElement titlename;


//    所在地 一行
    @FindBy(id="com.huizheng.plp:id/search_condition_area")
    @CacheLookup
    public WebElement area;

//    所在地 信息
    @FindBy(id="com.huizheng.plp:id/search_condition_area_select")
    @CacheLookup
    public WebElement area_text;

//    所在地  上一个按钮
    @FindBy(id="com.huizheng.plp:id/num_up_province")
    @CacheLookup
    public WebElement area_up;

//    所在地 下一个按钮
    @FindBy(id="com.huizheng.plp:id/num_down_province")
    @CacheLookup
    public WebElement area_down;

//    确定 按钮
    @FindBy(id="com.huizheng.plp:id/btn_ok")
    @CacheLookup
    public WebElement btn_ok;

//    年龄 一行
    @FindBy(id="com.huizheng.plp:id/search_condition_age")
    @CacheLookup
    public WebElement age;

//    年龄 信息
    @FindBy(id="com.huizheng.plp:id/search_condition_age_select")
    @CacheLookup
    public WebElement age_text;

//    开始 年龄 上一个
    @FindBy(id="com.huizheng.plp:id/num_up_province")
    @CacheLookup
    public WebElement begin_age_up;

//    开始 年龄 下一个
    @FindBy(id="com.huizheng.plp:id/num_down_province")
    @CacheLookup
    public WebElement begin_age_down;

//    结束 年龄 上一个
    @FindBy(id="com.huizheng.plp:id/num_up_city")
    @CacheLookup
    public WebElement end_age_up;

//    结束年龄 下一个
    @FindBy(id="com.huizheng.plp:id/num_down_city")
    @CacheLookup
    public WebElement end_age_down;

//    身高 一行
    @FindBy(id="com.huizheng.plp:id/search_condition_height")
    @CacheLookup
    public WebElement height;

//    身高 信息
    @FindBy(id="com.huizheng.plp:id/search_condition_height_select")
    @CacheLookup
    public WebElement height_text;

//    开始身高 上一个
    @FindBy(id="com.huizheng.plp:id/num_up_province")
    @CacheLookup
    public WebElement begin_height_up;

//    开始身高 下一个
    @FindBy(id="com.huizheng.plp:id/num_down_province")
    @CacheLookup
    public WebElement begin_height_down;



//    结束身高 上一个
    @FindBy(id="com.huizheng.plp:id/num_up_city")
    @CacheLookup
    public WebElement end_height_up;

//    结束身高 上一个
    @FindBy(id="com.huizheng.plp:id/num_down_city")
    @CacheLookup
    public WebElement end_height_down;

//    列表中 地区
    @FindBy(id="com.huizheng.plp:id/search_list_item_user_area")
    @CacheLookup
    public  List<WebElement> list_area;

//    列表中 年龄
    @FindBy(id="com.huizheng.plp:id/search_list_item_user_age")
    @CacheLookup
    public List<WebElement> list_age;

//    列表中 身高
    @FindBy(id="com.huizheng.plp:id/search_list_item_user_height")
    @CacheLookup
    public List<WebElement> list_height;

//    保存 按钮
    @FindBy(id="com.huizheng.plp:id/search_fragment_condition_save_btn")
    @CacheLookup
    public WebElement save_btn;






//    用户头像
    @FindBy(id="com.huizheng.plp:id/search_list_item_user_headphoto")
    @CacheLookup
    public List<WebElement> img;


//    用户昵称
    @FindBy(id = "com.huizheng.plp:id/search_list_item_user_nickname")
    @CacheLookup
    public List<WebElement> nickname;


    //    空间中打招呼按钮
    @FindBy(id = "com.huizheng.plp:id/ask_button")
    @CacheLookup
    public WebElement ask_button;

    //    空间中 下一位 按钮
    @FindBy(id = "com.huizheng.plp:id/next_button")
    @CacheLookup
    public WebElement next_button;

    //    空间中 左上角 回退 按钮
    @FindBy(id = "com.huizheng.plp:id/action_bar_left_top")
    @CacheLookup
    public WebElement left_btn;

    //    空间页面下部
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")
    @CacheLookup
    public WebElement tabs;


    //    滑动查看照片
    @FindBy(id="com.huizheng.plp:id/user_name_text")
    @CacheLookup
    public WebElement user_name_text;

    //  空间中用户名
    @FindBy(id = "com.huizheng.plp:id/user_name_text")
    @CacheLookup
    public WebElement name1_1;

    //    空间中 左上角回退按钮
    @FindBy(id = "com.huizheng.plp:id/action_bar_left_top")
    @CacheLookup
    public WebElement left_top;

}
