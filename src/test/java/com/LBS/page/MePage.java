package com.LBS.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MePage {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[5]/android.widget.RadioButton")
    @CacheLookup
    public WebElement meIcon;

    @FindBy(id = "com.huizheng.plp:id/left_member_center")
    @CacheLookup
    public WebElement membercenter;

    @FindBy(id = "com.huizheng.plp:id/right_member_info")
    @CacheLookup
    public WebElement memberinfo;

    @FindBy(id="com.huizheng.plp:id/uplaod_pic")
    @CacheLookup
    public WebElement uploadpic;

    @FindBy(id="com.huizheng.plp:id/self_introduction")
    @CacheLookup
    public WebElement introduction;

    @FindBy(id="com.huizheng.plp:id/matching_qa")
    @CacheLookup
    public WebElement matching_qa;

    @FindBy(id="com.huizheng.plp:id/new_thing")
    @CacheLookup
    public WebElement new_thing;

    @FindBy(id="com.huizheng.plp:id/no_img_guide_text")
    @CacheLookup
    public WebElement noimg;

    @FindBy(id="com.huizheng.plp:id/image_view_check")
    @CacheLookup
    public WebElement imgcheck;

    @FindBy(id="com.huizheng.plp:id/local_picture")
    @CacheLookup
    public WebElement localpicture;

    @FindBy(xpath="//android.widget.ListView[@content-desc=\"本地相册\"]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.ImageView")
    @CacheLookup
    public WebElement img;

    @FindBy(id = "com.android.gallery3d:id/head_select_right")
    @CacheLookup
    public WebElement imgok;

    @FindBy(id="com.huizheng.plp:id/member_center_bean_layout")
    @CacheLookup
    public WebElement bean;

    @FindBy(id="com.huizheng.plp:id/member_write_letters_layout")
    @CacheLookup
    public WebElement letter;

    @FindBy(xpath = "//android.view.View[@content-desc=\"会员服务\"]/android.widget.ListView[1]/android.view.View[1]")
    @CacheLookup
    public WebElement buy90;

    @FindBy(xpath="//android.view.View[@content-desc=\"会员服务\"]/android.widget.ListView/android.view.View[1]")
    @CacheLookup
    public WebElement bean800;


    @FindBy(xpath = "//android.view.View[@content-desc=\"服务选择\"]/android.widget.ListView[2]/android.view.View/android.widget.ListView[1]/android.view.View[3]/android.widget.EditText")
    @CacheLookup
    public WebElement ok;


    @FindBy(id="com.huizheng.plp:id/title_name")
    @CacheLookup
    public WebElement title_name;

    @FindBy(id="com.huizheng.plp:id/member_center_bean_title")
    @CacheLookup
    public WebElement beannum;

    @FindBy(id="com.huizheng.plp:id/member_center_bean_explain")
    @CacheLookup
    public WebElement beanexplain;

    @FindBy(xpath = "//android.view.View[@content-desc=\"服务选择\"]/android.widget.ListView[1]/android.view.View[2]/android.view.View[2]")
    @CacheLookup
    public WebElement wecharpay;

    @FindBy(xpath = "//android.view.View[@content-desc=\"豆币专属特权\"]")
    @CacheLookup
    public WebElement beanpower;


//    /  上方信息提示关闭按钮
    @FindBy(id = "com.huizheng.plp:id/msg_close")
    @CacheLookup
    public WebElement msg_close;


//    身高
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[6]/android.widget.RelativeLayout")
    @CacheLookup
    public WebElement height;
//    体重
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[7]/android.widget.RelativeLayout")
    @CacheLookup
    public WebElement weight;
//    血型
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[8]/android.widget.RelativeLayout")
    @CacheLookup
    public WebElement bloodtype;
//    确认
    @FindBy(id="com.huizheng.plp:id/btn_ok")
    @CacheLookup
    public WebElement OKBtn;

//    保存
    @FindBy(id="com.huizheng.plp:id/save")
    @CacheLookup
    public WebElement save;

//    个性特征
    @FindBy(id="com.huizheng.plp:id/item_text")
    @CacheLookup
    public WebElement property;

//    兴趣爱好
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.GridView[2]/android.widget.RelativeLayout[1]/android.widget.TextView")
    @CacheLookup
    public WebElement hobby;

//   籍贯
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout")
    @CacheLookup
    public WebElement nativeplace;

//    学历
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout")
    @CacheLookup
    public WebElement education;

//    职业
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout")
    @CacheLookup
    public WebElement job;

//   收入
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout")
    @CacheLookup
    public WebElement income;

//    魅力部位
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.RelativeLayout")
    @CacheLookup
    public WebElement part;

//    婚姻
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[6]/android.widget.RelativeLayout")
    @CacheLookup
    public WebElement  maritalstatus;

//    住房情况
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[7]/android.widget.RelativeLayout")
    @CacheLookup
    public WebElement  house;

//    异地恋
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[8]/android.widget.RelativeLayout")
    @CacheLookup
    public WebElement yidilian;

//    异性
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[7]/android.widget.RelativeLayout")
    @CacheLookup
    public WebElement oppositesex;

//    亲密
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[8]/android.widget.RelativeLayout")
    @CacheLookup
    public WebElement qinmi;

//    父母
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[9]/android.widget.RelativeLayout")
    @CacheLookup
    public WebElement parent;

//    小孩
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[10]/android.widget.RelativeLayout")
    @CacheLookup
    public WebElement child;


//    征友条件
//    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]")
    @FindBy(id="com.huizheng.plp:id/body_item_1")
    @CacheLookup
    public WebElement bodyitem;

////    征友条件 所在地
//    @FindBy(id = "com.huizheng.plp:id/myspace_location_view_rel")
//    @CacheLookup
//    public WebElement local_condition;
//
////    征友条件 年龄
//    @FindBy(id="com.huizheng.plp:id/myspace_he_age_view_rel")
//    @CacheLookup
//    public WebElement age_condition;
//
////    征友条件 身高
//    @FindBy(id="com.huizheng.plp:id/myspace_info_height_view_rel")
//    @CacheLookup
//    public WebElement height_condition;


    //    下一个按钮
    @FindBy(id="com.huizheng.plp:id/num_down_province")
    @CacheLookup
    public WebElement down;


//    所在地条件
    @FindBy(id="com.huizheng.plp:id/myspace_location_view")
    @CacheLookup
    public WebElement location_view;

    //    所在地 信息
    @FindBy(id="com.huizheng.plp:id/search_condition_area_select")
    @CacheLookup
    public WebElement area_text;

//    年龄条件
    @FindBy(id="com.huizheng.plp:id/myspace_he_age_view")
    @CacheLookup
    public WebElement age_view;

    //    年龄 信息
    @FindBy(id="com.huizheng.plp:id/search_condition_age_select")
    @CacheLookup
    public WebElement age_text;


    //    身高条件
    @FindBy(id="com.huizheng.plp:id/myspace_info_height_view")
    @CacheLookup
    public WebElement height_view;


    //    身高 信息
    @FindBy(id="com.huizheng.plp:id/search_condition_height_select")
    @CacheLookup
    public WebElement height_text;

//    搜索 模块
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]")
    @CacheLookup
    public WebElement search_icon;


    //    右上角搜索按钮
    @FindBy(id="com.huizheng.plp:id/search_right_button")
    @CacheLookup
    public WebElement search_right_button;

//    缘分icon
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]")
    @CacheLookup
    public WebElement yuanfen_icon;

//    头像
    @FindBy(id="com.huizheng.plp:id/iv")
    @CacheLookup
    public List<WebElement> iv;



    //    空间页面下部
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")
    @CacheLookup
    public WebElement tabs;

    //    滑动查看照片
    @FindBy(id="com.huizheng.plp:id/user_name_text")
    @CacheLookup
    public WebElement user_name_text;

//    个人信息
    @FindBy(id = "com.huizheng.plp:id/member_info_text")
    @CacheLookup
    public WebElement memberinfotext;


    //    空间中 左上角 回退 按钮
    @FindBy(id = "com.huizheng.plp:id/action_bar_left_top")
    @CacheLookup
    public WebElement left_btn;


    @FindBy(id = "com.huizheng.plp:id/btn_left")
    @CacheLookup
    public WebElement left;


    @FindBy(id="com.huizheng.plp:id/btn_women")
    @CacheLookup
    public WebElement btn_women;

    @FindBy(id="com.huizheng.plp:id/btn_ok")
    @CacheLookup
    public WebElement btn_ok;

    @FindBy(id="com.huizheng.plp:id/question_view")
    @CacheLookup
    public WebElement question_view;

    @FindBy(id="com.huizheng.plp:id/qa_send_question_id")
    @CacheLookup
    public WebElement send_question;


    @FindBy(id="com.huizheng.plp:id/body_item_3_text")
    @CacheLookup
    public WebElement questionnum;

    @FindBy(id="com.huizheng.plp:id/matching_qa_q_ico")
    @CacheLookup
    public List<WebElement> qa_q_ico;

    @FindBy(id="com.huizheng.plp:id/body_item_9")
    @CacheLookup
    public WebElement mytag;

    @FindBy(id="com.huizheng.plp:id/id_textview_matching")
    @CacheLookup
    public WebElement match;

}
