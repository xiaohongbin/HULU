package com.LBS3.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Page {
//    登录相关元素
//    直接登录
    @FindBy(id = "com.huizheng.plp:id/btn_login")
    @CacheLookup
    public WebElement login;
    //    地址修改
    @FindBy(id = "com.huizheng.plp:id/tv_test_address")
    @CacheLookup
    protected WebElement address;
    //  向下按钮
    @FindBy(id = "com.huizheng.plp:id/num_down_province")
    @CacheLookup
    public WebElement city_down;
    //    服务端环境
    @FindBy(id = "com.huizheng.plp:id/rv_test_env")
    @CacheLookup
    public WebElement test_env;
    //    product环境
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.TextView[1]")
    @CacheLookup
    public WebElement product;
    //    huluprep
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.TextView[3]")
    @CacheLookup
    public WebElement huluprep;

//    渠道号
    @FindBy(id="com.huizheng.plp:id/et_test_fid")
    @CacheLookup
    public WebElement qudao;


//    //    确定
//    @FindBy(id = "com.huizheng.plp:id/btn_ok")
//    @CacheLookup
//    public WebElement btn_ok;
    //  保存
    @FindBy(id = "com.huizheng.plp:id/btn_test_save")
    @CacheLookup
    public WebElement btn_test_save;
    //    注册
    @FindBy(id = "com.huizheng.plp:id/login_regist_button")
    @CacheLookup
    public WebElement login_regist_button;
    //    男
    @FindBy(id = "com.huizheng.plp:id/btn_men")
    @CacheLookup
    public WebElement btn_men;
    //    女
    @FindBy(id = "com.huizheng.plp:id/btn_women")
    @CacheLookup
    public WebElement btn_women;
//    账号
    @FindBy(id="com.huizheng.plp:id/nput_account")
    @CacheLookup
    public WebElement input_account;
//    密码
    @FindBy(id="com.huizheng.plp:id/input_password")
    @CacheLookup
    public WebElement input_password;
//    登录
    @FindBy(id="com.huizheng.plp:id/btn_login")
    @CacheLookup
    public WebElement btn_login;



//-------------------------------------------------------------------------------------------------------------------------------

//    三线男注册，5个问题下的回答选项
    @FindBy(id="com.huizheng.plp:id/male_ask_info_item_tv")
    @CacheLookup
    public List<WebElement> answers;


    //    下方模块icon
//    缘分模块
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.RadioButton")
    @CacheLookup
    public WebElement yuanfenicon;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.RadioButton")
    @CacheLookup
    public WebElement yuanfenicon1;
    //    推荐模块
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.RadioButton")
    @CacheLookup
    public WebElement tuijianicon;
    //    搜索图标
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]")
    @CacheLookup
    public WebElement searchicon;
    //    信箱模块
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.RadioButton")
    @CacheLookup
    public WebElement mailboxicon;
    //    附近
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.RadioButton")
    @CacheLookup
    public WebElement nearicon;
    //    3线我的
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[5]/android.widget.RadioButton")
    @CacheLookup
    public WebElement meicon;

//    1线我的
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[5]/android.widget.RadioButton")
    @CacheLookup
    public WebElement meicon1;
//    ------------------------------------------------------------------------------------------------------------------------------------------

//    部分通用元素
//    上方私信条关闭
    @FindBy(id = "com.huizheng.plp:id/msg_close")
    @CacheLookup
    public WebElement msg_close;
    //    模块title
    @FindBy(id = "com.huizheng.plp:id/id_topview")
    @CacheLookup
    public WebElement topview;
    //    页面title2
    @FindBy(id = "com.huizheng.plp:id/title_name")
    @CacheLookup
    public WebElement title_name;
    //    拒绝接听
    @FindBy(id = "com.huizheng.plp.video:id/id_video_refuse")
    @CacheLookup
    public WebElement video_refuse;
    //    接听
    @FindBy(id = "com.huizheng.plp.video:id/id_video_answer")
    @CacheLookup
    public WebElement video_answer;
    //    上方提问提示回复
    @FindBy(id = "com.huizheng.plp:id/tv_window_top_look")
    @CacheLookup
    public WebElement top_look;

//    确认
    @FindBy(id="com.huizheng.plp:id/btn_ok")
    @CacheLookup
    public WebElement btn_ok;

//----------------------------------------------------------------------------------------------------------------------------------

//    缘分页
//  缘分页 用户左上角打招呼
    @FindBy(id = "com.huizheng.plp:id/iv_say")
    @CacheLookup
    public List<WebElement> iv_sayhi;

    //缘分页 用户头像
    @FindBy(id = "com.huizheng.plp:id/iv")
    @CacheLookup
    public List<WebElement> img1;

    //  缘分页用户名
    @FindBy(id = "com.huizheng.plp:id/tv_name")
    @CacheLookup
    public List<WebElement> tv_name;

//    ---------------------------------------——————————————————————————————————————————

//    空间页元素
//    开通会员
    @FindBy(id = "com.huizheng.plp:id/online_status_text")
    @CacheLookup
    public WebElement online_status;
    //    打招呼
    @FindBy(id = "com.huizheng.plp:id/ask_button")
//    @CacheLookup
    public WebElement ask_button;
    //    下一位
    @FindBy(id = "com.huizheng.plp:id/next_button")
    @CacheLookup
    public WebElement next_button;
    //    语音聊天
    @FindBy(id = "com.huizheng.plp:id/btn_video_chat")
    @CacheLookup
    public WebElement btn_video_chat;
    //    更多资料
    @FindBy(id = "com.huizheng.plp:id/more_button")
    @CacheLookup
    public WebElement more_button;
    //  空间中用户名
    @FindBy(id = "com.huizheng.plp:id/user_name_text")
//    @CacheLookup
    public WebElement zonename;
    //    空间 左上角 回退 按钮
    @FindBy(id = "com.huizheng.plp:id/action_bar_left_top")
//    @CacheLookup
    public WebElement left_btn;
//    空间右上角按钮
    @FindBy(id="com.huizheng.plp:id/action_bar_right_top")
    @CacheLookup
    public WebElement right_top;
//    关注
    @FindBy(id = "com.huizheng.plp:id/send_conversation")
    @CacheLookup
    public WebElement conversation;
//    拉黑
    @FindBy(id="com.huizheng.plp:id/neglect_not_read")
    @CacheLookup
    public WebElement notread;
//    举报
    @FindBy(id="com.huizheng.plp:id/upgraded_members")
    @CacheLookup
    public WebElement upgraded;
//    举报“其他”
    @FindBy(id="com.huizheng.plp:id/other")
    @CacheLookup
    public WebElement other;
//   确定举报
    @FindBy(id="com.huizheng.plp:id/sure")
    @CacheLookup
    public WebElement sure;
    //    视频
    @FindBy(id = "com.huizheng.plp:id/video_view")
    @CacheLookup
    public WebElement video_view;
    //    右上角关闭
    @FindBy(id = "com.huizheng.plp:id/btn_cancel")
    @CacheLookup
    public WebElement btn_cancel;
    //    跳过
    @FindBy(id = "com.huizheng.plp:id/tv_verif_jump")
    @CacheLookup
    public WebElement jump;
    //    vip提示
    @FindBy(id = "com.huizheng.plp:id/iv_dialog_bg")
    @CacheLookup
    public WebElement dialog_bg;
//    畅聊会员
    @FindBy(xpath="//android.view.View[@content-desc=\"畅聊会员\"]")
    @CacheLookup
    public WebElement changliaohuiyuan;


    @FindBy(id = "com.huizheng.plp:id/dialog_bg")
    @CacheLookup
    public WebElement duiduipeng_dialog_bg;
//    --------------------------------------------------------------------------------------------------------------------------------


    //    推荐列表第一个
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[1]")
    @CacheLookup
    public WebElement tuijianlist1;


    //    信息 未读数量
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.TextView")
    @CacheLookup
    public WebElement mailboxnum;

    //    私信 未读数量
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.TextView[2]")
    @CacheLookup
    public WebElement letternum;




//  附近模块元素
    //    不喜欢
    @FindBy(id = "com.huizheng.plp:id/iv_no_like_map")
    @CacheLookup
    public WebElement no_like_map;
    //    喜欢
    @FindBy(id = "com.huizheng.plp:id/iv_like_map")
    @CacheLookup
    public WebElement like_map;
    //    附近头像
    @FindBy(className = "android.widget.ImageView")
    @CacheLookup
    public WebElement imageview;
    //    头像弹框
    @FindBy(id = "com.huizheng.plp:id/iv_head_map")
    @CacheLookup
    public WebElement head_map;
//    姓名
    @FindBy(id="com.huizheng.plp:id/tv_name_map")
    @CacheLookup
    public WebElement tv_name_map;
//    年龄
    @FindBy(id="com.huizheng.plp:id/tv_age_map")
    @CacheLookup
    public WebElement tv_age_map;
//    距离
    @FindBy(id="com.huizheng.plp:id/tv_distance_map")
    @CacheLookup
    public WebElement tv_distance_map;


    //    左上角返回
    @FindBy(id = "com.huizheng.plp:id/btn_left")
    @CacheLookup
    public WebElement btn_left;

    //    用户名
    @FindBy(id = "com.huizheng.plp:id/user_name")
    @CacheLookup
    public WebElement user_name;

    //    立即查看
    @FindBy(id = "com.huizheng.plp:id/img_look")
    @CacheLookup
    public WebElement img_look;



//    我的
//    会员中心按钮
    @FindBy(id="com.huizheng.plp:id/left_member_center")
    @CacheLookup
    public WebElement member_center;

//    资料按钮
    @FindBy(id = "com.huizheng.plp:id/right_member_info")
    @CacheLookup
    public WebElement memberinfo;

//    设置按钮
    @FindBy(id="com.huizheng.plp:id/body_item_6")
    @CacheLookup
    public WebElement setting;

//    设置页面 用户信息
    @FindBy(id="com.huizheng.plp:id/setting_item_name")
    @CacheLookup
    public WebElement userinfo;

//    用户信息页面 登录账号
    @FindBy(id="com.huizheng.plp:id/setting_userinfo_username")
    @CacheLookup
    public WebElement userinfo_username;

//    修改密码按钮
    @FindBy(id="com.huizheng.plp:id/modify_button")
    @CacheLookup
    public WebElement modify_button;

//    密码框
    @FindBy(id="com.huizheng.plp:id/account_manage_confirm_password")
    @CacheLookup
    public WebElement password;

//    保存
    @FindBy(id="com.huizheng.plp:id/account_manage_btn_submit")
    @CacheLookup
    public WebElement btn_submit;





//    资料详情
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




//    会员中心页
//    豆币
    @FindBy(id="com.huizheng.plp:id/member_center_bean_title")
    @CacheLookup
    public WebElement bean;
//    右上角刷新
    @FindBy(id="com.huizheng.plp:id/btn_right")
    @CacheLookup
    public WebElement btn_rigth;
//    豆币详情
//    3天VIP 0元购
    @FindBy(xpath = "//android.view.View[@content-desc=\"3天VIP 0元购 限时\"]")
    @CacheLookup
    public WebElement bean_vip;
//    800语音豆
    @FindBy(xpath = "//android.view.View[@content-desc=\"800语音豆 开通再送208豆\"]")
    @CacheLookup
    public WebElement bean800;
//    800语音豆价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"￥99\"]")
    @CacheLookup
    public WebElement bean800price;
//    550语音豆
    @FindBy(xpath = "//android.view.View[@content-desc=\"550语音豆\"]")
    @CacheLookup
    public WebElement bean550;
//    550语音豆价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"￥89\"]")
    @CacheLookup
    public WebElement bean550price;

//    写信包月
    @FindBy(id="com.huizheng.plp:id/member_write_letters_layout")
    @CacheLookup
    public WebElement write_letters;
//    写信包月详情
//    3天VIP 0元购
    @FindBy(xpath="//android.view.View[@content-desc=\"3天VIP 0元购 限时\"]")
    @CacheLookup
    public WebElement letter_vip;
//    90天会员
    @FindBy(xpath = "//android.view.View[@content-desc=\"90天畅聊会员 超值\"]")
    @CacheLookup
    public WebElement letter90;
//    90天会员价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"￥109\"]")
    @CacheLookup
    public WebElement letter90price;
//    30天会员
    @FindBy(xpath = "//android.view.View[@content-desc=\"30天畅聊会员\"]")
    @CacheLookup
    public WebElement letter30;
//    30天会员价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"￥89\"]")
    @CacheLookup
    public WebElement letter30price;
//    7天会员
    @FindBy(xpath = "//android.view.View[@content-desc=\"7天畅聊会员\"]")
    @CacheLookup
    public WebElement letter7;
//    7天会员价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"￥69\"]")
    @CacheLookup
    public WebElement letter7price;

//    星级服务
    @FindBy(id="com.huizheng.plp:id/member_center_vip_title")
    @CacheLookup
    public WebElement vip_title;
//    星级服务详情
//    vip新手
    @FindBy(xpath = "//android.view.View[@content-desc=\"签约领取VIP新手礼包\"]")
    @CacheLookup
    public WebElement newvip;
//    vip90天
    @FindBy(xpath = "//android.view.View[@content-desc=\"VIP会员 90天 ￥100\"]")
    @CacheLookup
    public WebElement vip90;
//    vip30天
    @FindBy(xpath = "//android.view.View[@content-desc=\"VIP会员 30天 ￥50\"]")
    @CacheLookup
    public WebElement vip30;

//    收信宝
    @FindBy(id="com.huizheng.plp:id/member_center_receive_letter_layout")
    @CacheLookup
    public WebElement receive_letter;
//    收信宝上传头像
    @FindBy(xpath = "//android.view.View[@content-desc=\"点此上传头像\"]")
    @CacheLookup
    public WebElement uploadpic;
//    本地照片
    @FindBy(id="com.huizheng.plp:id/local_picture")
    @CacheLookup
    public WebElement localpicture;
// 本地相册
    @FindBy(xpath="//android.widget.ListView[@content-desc=\"本地相册\"]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.ImageView")
    @CacheLookup
    public WebElement img;
//选中照片 右上角√
    @FindBy(id = "com.android.gallery3d:id/head_select_right")
    @CacheLookup
    public WebElement imgok;
//  确认照片 右上角确定
    @FindBy(id="com.huizheng.plp:id/btn_right")
    @CacheLookup
    public WebElement imgsure;
//    支付详情
//    1天
    @FindBy(xpath = "//android.view.View[@content-desc=\"1天(80豆币/10元)\"]")
    @CacheLookup
    public WebElement day1;
//    3天
    @FindBy(xpath = "//android.view.View[@content-desc=\"3天(300豆币/30元)\"]")
    @CacheLookup
    public WebElement day3;
//    7天
    @FindBy(xpath = "//android.view.View[@content-desc=\"7天(600豆币/50元)\"]")
    @CacheLookup
    public WebElement day7;
//    15天
    @FindBy(xpath = "//android.view.View[@content-desc=\"15天(1300豆币/100元)\"]")
    @CacheLookup
    public WebElement day15;




//  立即开通
    @FindBy(xpath = "//android.view.View[@content-desc=\"立即开通\"]")
//    @CacheLookup
    public WebElement kaitong;

//  微信支付
    @FindBy(xpath = "//android.view.View[@content-desc=\"微信支付\"]")
    @CacheLookup
    public WebElement wecharpay;

//    开通后 查询完成情况
    @FindBy(xpath = "//android.view.View[@content-desc=\"查询 Link\"]")
    @CacheLookup
    public WebElement check;

//    开通免密成功图片
    @FindBy(xpath = "//android.view.View[@content-desc=\"服务选择\"]/android.view.View[8]/android.widget.Image")
    @CacheLookup
    public WebElement success;

//    成功图片下 前往
    @FindBy(xpath = "//android.view.View[@content-desc=\"前往\"]")
    @CacheLookup
    public WebElement qianwang;

//    推荐中 不要
    @FindBy(xpath = "//android.view.View[@content-desc=\"不要\"]")
    @CacheLookup
    public WebElement buyao;

//    推荐中 支付解锁
    @FindBy(xpath = "//android.view.View[@content-desc=\"立即支付并解锁\"]")
    @CacheLookup
    public WebElement payunlock;

//    解锁成功提示
    @FindBy(xpath = "//android.view.View[@content-desc=\"确定 Link\"]")
    @CacheLookup
    public WebElement queding;

//    对对碰右上角关闭
    @FindBy(id="com.huizheng.plp:id/btn_close")
    @CacheLookup
    public WebElement btn_close;

//    强力推荐购买提示
    @FindBy(id="com.huizheng.plp:id/root_view")
    @CacheLookup
    public WebElement root_view;

//    强力推荐购买提示 右上角关闭
    @FindBy(id="com.huizheng.plp:id/iv_close")
    @CacheLookup
    public WebElement iv_close;

//    推荐妹子头像
    @FindBy(id="com.huizheng.plp:id/id_photo")
    @CacheLookup
    public List<WebElement> id_photo;

//    会员福利 打招呼
    @FindBy(id="com.huizheng.plp:id/id_say_hello")
    @CacheLookup
    public WebElement say_hello;

//    上传头像提示
    @FindBy(id="com.huizheng.plp:id/id_upload")
    @CacheLookup
    public WebElement upload;



//    支付宝页面
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"同意协议并开通\"]")
    @CacheLookup
    public WebElement agree;

//    支付成功页面关闭
    @FindBy(id="com.alipay.mobile.nebula:id/h5_nav_close")
    @CacheLookup
    public WebElement nav_close;
}
