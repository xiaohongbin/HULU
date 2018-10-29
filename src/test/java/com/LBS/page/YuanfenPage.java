package com.LBS.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class YuanfenPage {
    //    页面title
    @FindBy(id = "com.huizheng.plp:id/id_topview")
    @CacheLookup
    public WebElement topview;

    //  第一行左侧用户左上角打招呼
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ImageView[2]")
    @CacheLookup
    public WebElement iv_sayhi1;

    //    第一行右侧用户左上角打招呼
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.ImageView[2]")
    @CacheLookup
    public WebElement iv_sayhi2;

    //    第一行左侧用户名
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[1]")
    @CacheLookup
    public WebElement name1;

    //  空间中用户名
    @FindBy(id = "com.huizheng.plp:id/user_name_text")
//    @CacheLookup
    public WebElement name1_1;

    //    上方信息提示关闭按钮
    @FindBy(id = "com.huizheng.plp:id/msg_close")
    @CacheLookup
    public WebElement msg_close;

    //    空间中 左上角回退按钮
    @FindBy(id = "com.huizheng.plp:id/action_bar_left_top")
    @CacheLookup
    public WebElement left_top;

    //第一行左侧用户头像
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ImageView[1]")
    @CacheLookup
    public WebElement img1;

    //  第一行右侧侧用户头像
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.ImageView[1]")
    @CacheLookup
    public WebElement img2;

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


    @FindBy(id="com.huizheng.plp:id/action_bar_right_top")
    @CacheLookup
    public WebElement right_top;

    @FindBy(id = "com.huizheng.plp:id/send_conversation")
    @CacheLookup
    public WebElement conversation;


    @FindBy(id="com.huizheng.plp:id/neglect_not_read")
    @CacheLookup
    public WebElement notread;


    @FindBy(id="com.huizheng.plp:id/upgraded_members")
    @CacheLookup
    public WebElement upgraded;


    @FindBy(id="com.huizheng.plp:id/btn_cancel")
    @CacheLookup
    public WebElement btn_cancle;


    @FindBy(id="com.huizheng.plp:id/btn_ok")
    @CacheLookup
    public WebElement btn_ok;

    @FindBy(id="com.huizheng.plp:id/other")
    @CacheLookup
    public WebElement other;

    @FindBy(id="com.huizheng.plp:id/sure")
    @CacheLookup
    public WebElement sure;


    @FindBy(id="com.huizheng.plp:id/online_status_text")
    @CacheLookup
    public WebElement online_status;

    @FindBy(id="com.huizheng.plp:id/title_name")
    @CacheLookup
    public WebElement title_name;


    @FindBy(id="com.huizheng.plp:id/btn_women")
    @CacheLookup
    public WebElement btn_women;

    @FindBy(id="com.huizheng.plp:id/btn_i_know")
    @CacheLookup
    public WebElement btn_know;

    @FindBy(id = "com.huizheng.plp:id/submit_button")
    @CacheLookup
    public WebElement submit_button;


    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[5]/android.widget.RadioButton")
    @CacheLookup
    public WebElement meIcon;

    @FindBy(id = "com.huizheng.plp:id/body_item_5")
    @CacheLookup
    public WebElement conversationperson;

    @FindBy(id="com.huizheng.plp:id/body_item_5_text")
    @CacheLookup
    public WebElement conversationpersonnum;

    @FindBy(id="com.huizheng.plp:id/search_list_item_user_nickname")
    @CacheLookup
    public WebElement user_nickname;

    @FindBy(id="com.huizheng.plp:id/search_list_item_user_headphoto")
    @CacheLookup
    public List<WebElement> user_headphoto;

}

