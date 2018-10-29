package com.LBS.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

//
    @FindBy(id="com.huizheng.plp:id/login_regist_button")
    @CacheLookup
    public WebElement btn_regist;

    @FindBy(id = "com.huizheng.plp:id/btn_men")
    @CacheLookup
    public WebElement btn_men;


    @FindBy(id="com.huizheng.plp:id/btn_women")
    @CacheLookup
    public WebElement btn_women;

    @FindBy(id="com.huizheng.plp:id/btn_ok")
    @CacheLookup
    public WebElement btn_ok;

    @FindBy(id="com.huizheng.plp:id/btn_left")
    @CacheLookup
    public WebElement btn_left;

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    @CacheLookup
    public WebElement page_title;


    @FindBy(id="com.huizheng.plp:id/upload_user_icon_localhost_images")
    @CacheLookup
    public WebElement uploadlocalhostimages;

    @FindBy(xpath="//android.widget.ListView[@content-desc=\"本地相册\"]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.ImageView")
    @CacheLookup
    public WebElement img;


    @FindBy(id = "com.android.gallery3d:id/head_select_right")
    @CacheLookup
    public WebElement imgok;

    @FindBy(id="com.huizheng.plp:id/btn_right")
    @CacheLookup
    public WebElement imgsure;

    @FindBy(id="com.huizheng.plp:id/title_name")
    @CacheLookup
    public WebElement title_name;

    @FindBy(id="com.huizheng.plp:id/btn_i_know")
    @CacheLookup
    public WebElement btn_know;

    @FindBy(id="com.huizheng.plp:id/transcribe_voice_title_1")
    @CacheLookup
    public WebElement voice;

    @FindBy(id="com.huizheng.plp:id/id_topview")
    @CacheLookup
    public WebElement topview;

}
