package com.yyw.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PageElement {

    @FindBy(id = "com.huizheng.lasq:id/tv_back")
    @CacheLookup
    public WebElement tv_back;

//    页面title
    @FindBy(id="com.youyuan.yyhl:id/title_name")
    @CacheLookup
    public WebElement title_name;

//    我是男
    @FindBy(id="com.youyuan.yyhl:id/btn_men")
    @CacheLookup
    public WebElement btn_men;

//    我是女
    @FindBy(id="com.youyuan.yyhl:id/btn_women")
    @CacheLookup
    public WebElement btn_women;

//    确定
    @FindBy(id="com.youyuan.yyhl:id/btn_register")
    @CacheLookup
    public WebElement btn_register;

//    登录
    @FindBy(id="com.youyuan.yyhl:id/btn_right")
    @CacheLookup
    public WebElement btn_right;


//    用户名
    @FindBy(id="com.youyuan.yyhl:id/input_account")
    @CacheLookup
    public WebElement account;

//    密码
    @FindBy(id="com.youyuan.yyhl:id/input_password")
    @CacheLookup
    public WebElement password;

//    登录
    @FindBy(id="com.youyuan.yyhl:id/btn_login")
    @CacheLookup
    public WebElement btn_login;


//    环境修改
//    地址修改
    @FindBy(id = "com.youyuan.yyhl:id/rv_test_address")
    @CacheLookup
    protected WebElement address;
    //    服务端环境
    @FindBy(id = "com.youyuan.yyhl:id/rv_test_env")
    @CacheLookup
    public WebElement test_env;
    //    product环境
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.TextView[1]")
    @CacheLookup
    public WebElement product;
    //    prep环境
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.TextView[2]")
    @CacheLookup
    public WebElement prep;
    //    渠道号
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]")
    @CacheLookup
    public WebElement qudao;
    //    保存
    @FindBy(id = "com.youyuan.yyhl:id/btn_test_save")
    @CacheLookup
    public WebElement btn_test_save;


//    附近/女用户 消息
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]")
    @CacheLookup
    public WebElement near;

//    我的
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[4]")
    @CacheLookup
    public WebElement mine;


//    每天第一次登录引导问题答案
    @FindBy(id="com.youyuan.yyhl:id/male_ask_info_item_tv")
    @CacheLookup
    public WebElement ask_info;

//    登录付费引导
    @FindBy(id="com.youyuan.yyhl:id/btn_wish_guide_content2")
    @CacheLookup
    public WebElement btn_wish_guide_content2;

//    登录第一个引导
    @FindBy(id="com.youyuan.yyhl:id/btn_wish_guide_next")
    @CacheLookup
    public WebElement btn_wish_guide_next;


//    左侧第一个头像列表
    @FindBy(id="com.youyuan.yyhl:id/yf_new_ui_image_0")
    @CacheLookup
    public WebElement image;

//    左侧第一个姓名
    @FindBy(id = "com.youyuan.yyhl:id/yf_new_ui_name_0")
    @CacheLookup
    public  WebElement name;

//    左侧第一个年龄
    @FindBy(id="com.youyuan.yyhl:id/yf_new_ui_age_0")
    @CacheLookup
    public WebElement age;

//    左侧第一个匹配度
    @FindBy(id = "com.youyuan.yyhl:id/yf_match_level_0")
    @CacheLookup
    public WebElement match;

//    左侧第一个自我介绍
    @FindBy(id="com.youyuan.yyhl:id/yf_user_desc_0")
    @CacheLookup
    public WebElement user_desc;

//    女用户空间页 左上角消息关闭
    @FindBy(id="com.youyuan.yyhl:id/around_person_header_close")
    @CacheLookup
    public WebElement around_person_header_close;

//    女用户空间页 姓名
    @FindBy(id="com.youyuan.yyhl:id/personage_space_name")
    @CacheLookup
    public WebElement personage_space_name;

//    右上角邮件提示
    @FindBy(id="com.youyuan.yyhl:id/around_person_header_name")
    @CacheLookup
    public WebElement around_person_header_name;

//    空间匹配度
    @FindBy(id="com.youyuan.yyhl:id/personage_space_matching")
    @CacheLookup
    public WebElement personage_space_matching;

//    详细资料 昵称
    @FindBy(id="com.youyuan.yyhl:id/personage_main_dynamic_info_right")
    @CacheLookup
    public List<WebElement>  main_info;

//    打招呼
    @FindBy(id="com.youyuan.yyhl:id/btn_like_text")
    @CacheLookup
    public WebElement btn_like_text;

//    下一个
    @FindBy(id="com.youyuan.yyhl:id/btn_next_user")
    @CacheLookup
    public WebElement btn_next_user;

//    左上角返回
    @FindBy(id="com.youyuan.yyhl:id/btn_left")
    @CacheLookup
    public WebElement btn_left;

////    右上角
//    @FindBy(id="com.youyuan.yyhl:id/btn_right")
//    @CacheLookup
//    public WebElement btn_right;

//    拉黑
    @FindBy(id="com.youyuan.yyhl:id/neglect_not_read")
    @CacheLookup
    public WebElement neglect_not_read;
//    拉黑确定
    @FindBy(id="com.youyuan.yyhl:id/btn_ok")
    @CacheLookup
    public WebElement btn_ok;
//    拉黑 取消
    @FindBy(id = "com.youyuan.yyhl:id/btn_cancel")
    @CacheLookup
    public WebElement btn_cancel;

//    举报
    @FindBy(id="com.youyuan.yyhl:id/upgraded_members")
    @CacheLookup
    public WebElement upgraded_members;

//    举报名
    @FindBy(id="com.youyuan.yyhl:id/report_name")
    @CacheLookup
    public WebElement report_name;

//    举报原因--酒托
    @FindBy(id="com.youyuan.yyhl:id/eat_tube")
    @CacheLookup
    public WebElement eat_tube;

//    确定举报
    @FindBy(id="com.youyuan.yyhl:id/sure")
    @CacheLookup
    public WebElement sure;

//    搜索
    @FindBy(id="com.youyuan.yyhl:id/btn_right_search")
    @CacheLookup
    public WebElement btn_right_search;

// 地区
    @FindBy(id="com.youyuan.yyhl:id/myspace_location_view")
    @CacheLookup
    public  WebElement location;

//    保存
    @FindBy(id="com.youyuan.yyhl:id/save")
    @CacheLookup
    public WebElement save;

//    列表中地区
    @FindBy(id="com.youyuan.yyhl:id/yf_new_ui_city_0")
    @CacheLookup
    public List<WebElement> ui_city;


//    征友条件
    @FindBy(id="com.youyuan.yyhl:id/space_center_condition")
    @CacheLookup
    public WebElement condition;

//    征友地区
    @FindBy(id="com.youyuan.yyhl:id/myspace_location_view")
    @CacheLookup
    public WebElement myspace_location_view;

//    寻缘自我介绍 编辑框
    @FindBy(id="com.youyuan.yyhl:id/edit_text")
    @CacheLookup
    public WebElement edit_text;

//    自我介绍 发送
    @FindBy(id="com.youyuan.yyhl:id/send_btn")
    @CacheLookup
    public WebElement send_btn;

//    立即提问
    @FindBy(id="com.youyuan.yyhl:id/id_love_energy_know")
    @CacheLookup
    public WebElement love_energy_know;

//    右上角 关闭提问
    @FindBy(id="com.youyuan.yyhl:id/id_bt_answer_hello_close")
    @CacheLookup
    public WebElement id_bt_answer_hello_close;

//    群聊关闭
    @FindBy(id="com.youyuan.yyhl:id/group_chat_close")
    @CacheLookup
    public WebElement group_chat_close;


//    寻缘成就
    @FindBy(id="com.youyuan.yyhl:id/achievement_title")
    @CacheLookup
    public WebElement achievement_title;

//    收到回应
    @FindBy(id="com.youyuan.yyhl:id/achievement_respond_number")
    @CacheLookup
    public WebElement achievement_respond_number;

//    召唤人数
    @FindBy(id="com.youyuan.yyhl:id/achievement_summon_number")
    @CacheLookup
    public WebElement achievement_summon_number;

//    返回首页
    @FindBy(id="com.youyuan.yyhl:id/achievement_summon_back")
    @CacheLookup
    public WebElement achievement_summon_back;

//    附近模块
//    姓名
    @FindBy(id="com.youyuan.yyhl:id/user_name")
    @CacheLookup
    public List<WebElement> user_name;

//    打招呼
    @FindBy(id="com.youyuan.yyhl:id/post_letter")
    @CacheLookup
    public WebElement post_letter;

//    头像
    @FindBy(id="com.youyuan.yyhl:id/id_photo")
    @CacheLookup
    public WebElement id_photo;

//    右上角关闭
    @FindBy(id="com.youyuan.yyhl:id/dynamic_back")
    @CacheLookup
    public WebElement dynamic_back;

//    女用户查看男用户  解锁
    @FindBy(id="com.youyuan.yyhl:id/add_contacts_left_add")
    @CacheLookup
    public WebElement add_contacts_left_add;

//    女用户 开通vip
    @FindBy(id="com.youyuan.yyhl:id/add_contacts_intercept_pay")
    @CacheLookup
    public WebElement add_contacts_intercept_pay;


//    邮箱/心愿港
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]")
    @CacheLookup
    public WebElement mailbox;

//    最近来访
    @FindBy(id="com.youyuan.yyhl:id/receive_message_count")
    @CacheLookup
    public WebElement receive_message_count;

//    开通写信会员
    @FindBy(id="com.youyuan.yyhl:id/visitor_me_bt")
    @CacheLookup
    public WebElement visitor_me_bt;

//    进入 消息后 的头像
    @FindBy(id="com.youyuan.yyhl:id/message_member_image")
    @CacheLookup
    public WebElement message_member_image;

//    点击头像进入空间，回复并索要联系方式
    @FindBy(id="com.youyuan.yyhl:id/personage_space_pay")
    @CacheLookup
    public WebElement personage_space_pay;

//  登录后引导提示关闭按钮
    @FindBy(id="com.youyuan.yyhl:id/im_wish_guide_close")
    @CacheLookup
    public WebElement im_wish_guide_close;

//    女用户 心愿港--我要发布
    @FindBy(id = "com.youyuan.yyhl:id/im_release_wish")
    @CacheLookup
    public WebElement im_release_wish;

//    心愿一级列表
    @FindBy(id="com.youyuan.yyhl:id/tv_release_wish_group")
    @CacheLookup
    public List<WebElement> wish_group;

//    心愿二级列表
    @FindBy(id="com.youyuan.yyhl:id/tv_release_wish_child")
    @CacheLookup
    public List<WebElement> wish_child;

//    左上角 已发布的心愿 按钮
    @FindBy(id="com.youyuan.yyhl:id/im_my_wish")
    @CacheLookup
    public WebElement im_my_wish;

//    已发布的心愿列表
    @FindBy(id="com.youyuan.yyhl:id/tv_my_wish_content")
    @CacheLookup
    public List<WebElement> my_wish_content;

//    已解锁的人
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[2]")
    @CacheLookup
    public WebElement unlock_people;


//    附近
//    用户小头像
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[6]/android.widget.ImageView")
    @CacheLookup
    public WebElement nearwoman;

//    用户大头像
    @FindBy(id ="com.youyuan.yyhl:id/iv_head_map" )
    @CacheLookup
    public WebElement iv_head_map;

//    用户昵称
    @FindBy(id="com.youyuan.yyhl:id/tv_name_map")
    @CacheLookup
    public WebElement tv_name_map;

//    用户年龄
    @FindBy(id="com.youyuan.yyhl:id/tv_age_map")
    @CacheLookup
    public WebElement tv_age_map;

//    距离
    @FindBy(id="com.youyuan.yyhl:id/tv_distance_map")
    @CacheLookup
    public WebElement tv_distance_map;

//    不喜欢
    @FindBy(id="com.youyuan.yyhl:id/iv_no_like_map")
    @CacheLookup
    public WebElement iv_no_like_map;

//    喜欢
    @FindBy(id="com.youyuan.yyhl:id/iv_like_map")
    @CacheLookup
    public WebElement iv_like_map;


//    女用户搜索 用户名输入框
    @FindBy(id="com.youyuan.yyhl:id/et_search_dialog_content")
    @CacheLookup
    public WebElement et_search_dialog_content;

//    三线支付页面
//    写信包月，3个月
    @FindBy(xpath = "//android.view.View[@content-desc=\"3个月费用,￥33.33/月,加送100元话费\"]")
    @CacheLookup
    public WebElement letter3_3;

//    写信包月，1个月
    @FindBy(xpath = "//android.view.View[@content-desc=\"一个月费用,￥50.00/月\"]")
    @CacheLookup
    public WebElement letter1_3;

//    豆币 100元
    @FindBy(xpath = "//android.view.View[@content-desc=\"[100元]1000豆送300豆,加送100元话费\"]")
    @CacheLookup
    public WebElement bean100_3;

//    豆币50元
    @FindBy(xpath = "//android.view.View[@content-desc=\"[50元]500豆送100豆\"]")
    @CacheLookup
    public WebElement bean50_3;

//    豆币30元
    @FindBy(xpath = "//android.view.View[@content-desc=\"[30元]300豆\"]")
    @CacheLookup
    public WebElement bean30_3;

//    活动介绍
    @FindBy(xpath = "//android.view.View[@content-desc=\"查看活动介绍\"]")
    @CacheLookup
    public WebElement huodong;

//    90天活动
    @FindBy(xpath = "//android.view.View[@content-desc=\"90天 | ￥109\"]")
    @CacheLookup
    public WebElement huodong_letter;

//    1000豆币
    @FindBy(xpath = "//android.view.View[@content-desc=\"1000豆币|￥99\"]")
    @CacheLookup
    public WebElement huodong_bean;

//    微信支付
    @FindBy(xpath = "//android.webkit.WebView[@content-desc=\"会员支付\"]/android.view.View[2]/android.widget.ListView[1]/android.view.View[2]")
    @CacheLookup
    public WebElement wechar;

//    1线微信
    @FindBy(xpath = "//android.webkit.WebView[@content-desc=\"服务选择\"]/android.widget.ListView[1]/android.view.View[2]/android.view.View[1]")
    @CacheLookup
    public WebElement wechar1;

//    立即开tong

    @FindBy(xpath = "//android.view.View[@content-desc=\"立即开通\"]")
//    @CacheLookup
    public WebElement kaitong;


//    一线男 写信包月
//    90天
    @FindBy(xpath = "//android.view.View[@content-desc=\"90天无限畅聊 最值\"]")
    @CacheLookup
    public WebElement letter90;

//    1天
    @FindBy(xpath = "//android.view.View[@content-desc=\"1天无限畅聊\"]")
    @CacheLookup
    public WebElement letter1;

    //    7天
    @FindBy(xpath = "//android.view.View[@content-desc=\"7天无限畅聊\"]")
    @CacheLookup
    public WebElement letter7;

//    购买豆币
    @FindBy(xpath = "//android.view.View[@content-desc=\"购买豆币\"]")
    @CacheLookup
    public WebElement buyBean;

//    800豆币
    @FindBy(xpath = "//android.view.View[@content-desc=\"800豆币\"]")
    @CacheLookup
    public WebElement bean800;

//    550豆币
    @FindBy(xpath = "//android.view.View[@content-desc=\"550豆币\"]")
    @CacheLookup
    public WebElement bean550;

    //    自动续费
    @FindBy(xpath = "//android.view.View[@content-desc=\"自动续费再减10元\"]")
//    @CacheLookup
    public WebElement xufei;

    //    90优惠价额
    @FindBy(xpath = "//android.view.View[@content-desc=\"已优惠:-10元合计:￥99\"]")
//    @CacheLookup
    public WebElement youhuijiage90;

    //    90原价
    @FindBy(xpath = "//android.view.View[@content-desc=\"合计:￥109\"]")
//    @CacheLookup
    public WebElement yuanjia90;


//    女用户 30天vip
    @FindBy(xpath = "//android.view.View[@content-desc=\"98元\"]")
    @CacheLookup
    public WebElement vip_30;

//    女用户 90天vip
    @FindBy(xpath = "//android.view.View[@content-desc=\"198元\"]")
    @CacheLookup
    public WebElement vip_90;

//    女用户微信
    @FindBy(id = "item-1")
    @CacheLookup
    public WebElement wechar_nv;

//    90天付款
    @FindBy(xpath = "//android.view.View[@content-desc=\"立即付款：198元\"]")
//    @CacheLookup
    public WebElement fukuan_198;

//    30天付款
    @FindBy(xpath = "//android.view.View[@content-desc=\"立即付款：98元\"]")
//    @CacheLookup
    public WebElement fukuan_98;

//




//    开通
//    @FindBy(xpath = "//android.view.View[@content-desc=\"立即开通\"]")
//    public WebElement kaitong;

//    小米 权限允许
    @FindBy(id="android:id/button1")
    @CacheLookup
    public WebElement button1;

}

