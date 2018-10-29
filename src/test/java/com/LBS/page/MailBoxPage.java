package com.LBS.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MailBoxPage {

    //    弹窗 中 取消绑定
    @FindBy(id = "com.huizheng.plp:id/btn_pv_dialog_yuanfen_1")
    @CacheLookup
    public WebElement cancle;

    //    页面下方信箱icon
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.RadioButton")
    @CacheLookup
    public WebElement mailbox_icon;


    //    页面 上 通知 页签
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.TextView")
    @CacheLookup
    public WebElement notice;

    //    页面上 私信 页签
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.TextView")
    @CacheLookup
    public WebElement letter;

//    页面上 最近联系 页签
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.TextView")
    @CacheLookup
    public WebElement contact;

//   完善资料标签
    @FindBy(id=	"com.huizheng.plp:id/ad_image_view")
    @CacheLookup
    public WebElement personal_data;

//    私信上未读的标记
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.TextView[2]")
//    @CacheLookup
    public WebElement letter_num;

//    下方信箱上未读标记
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.TextView")
//    @CacheLookup
    public WebElement mailbox_num;


////    打招呼按钮
//    @FindBy(id="com.huizheng.plp:id/sayhello")
//    @CacheLookup
//    public WebElement sayhello;

//    立即查看 私信按钮
    @FindBy(id="com.huizheng.plp:id/img_look")
    @CacheLookup
    public WebElement img_look;

//    完善信息title页
    @FindBy(id="com.huizheng.plp:id/title_name")
    @CacheLookup
    public WebElement title_name;

//    完善信息 回退按钮
    @FindBy(id="com.huizheng.plp:id/btn_left")
    @CacheLookup
    public WebElement btn_left;

//    打招呼按钮
    @FindBy(id="com.huizheng.plp:id/sayhello")
    @CacheLookup
    public List<WebElement> sayhello;


    @FindBy(id="com.huizheng.plp:id/btn_women")
    @CacheLookup
    public WebElement btn_women;

    @FindBy(id="com.huizheng.plp:id/btn_ok")
    @CacheLookup
    public WebElement btn_ok;


    @FindBy(id="com.huizheng.plp:id/ok")
    @CacheLookup
    public WebElement ok;


    //    下方搜索图标
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]")
    @CacheLookup
    public WebElement search_icon;
}
