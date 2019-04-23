package com.laps.page;

import com.hulu.check.publicCheck;
import com.hulu.method.ElementsMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PageElement extends publicCheck {

    //  通用
    //    上方加载信息
    @FindBy(id = "com.huizheng.lasq:id/header_content")
    @CacheLookup
    public WebElement header_content;
/*  公共   //    左上角返回
    @FindBy(id = "com.huizheng.lasq:id/btn_left")
    @CacheLookup
    public WebElement btn_left;
    //    模块title
    @FindBy(id = "com.huizheng.lasq:id/id_topview")
    @CacheLookup
    public WebElement topview;
    //    上方私信关闭
    @FindBy(id = "com.huizheng.lasq:id/msg_close")
    @CacheLookup
    public WebElement msg_close;*/
    //    取消按钮
    @FindBy(id = "com.huizheng.lasq:id/btn_cancel")
    @CacheLookup
    public WebElement btn_cancel;
  /* 公共    //    确认
    @FindBy(id = "com.huizheng.lasq:id/btn_ok")
    @CacheLookup
    public WebElement btn_ok;
 //    页面上方title
    @FindBy(id = "com.huizheng.lasq:id/title_name")
    @CacheLookup
    public WebElement title_name;

    //    1线下方5个模块
    @FindBy(className = "android.widget.RadioButton")
    @CacheLookup
    public List<WebElement> mokuai;*/

    //    注册页面
//    一键注册
    @FindBy(id = "com.huizheng.lasq:id/login_regist_button")
    @CacheLookup
    public WebElement btn_reg;
 /*  公共 //    我是男
    @FindBy(id = "com.huizheng.lasq:id/btn_men")
    @CacheLookup
    public WebElement btn_men;
    //        女
    @FindBy(id = "com.huizheng.lasq:id/btn_women")
    @CacheLookup
    public WebElement btn_women;
    //    直接登录
    @FindBy(id = "com.huizheng.lasq:id/btn_login")
    @CacheLookup
    public WebElement login;*/
    //    女用户招呼关键开启按钮
    @FindBy(id = "com.huizheng.lasq:id/msg_manager_ok")
    @CacheLookup
    public WebElement zhaohuguanjia;
    //    用户名输入框
    @FindBy(id = "com.huizheng.lasq:id/input_account")
    @CacheLookup
    public WebElement input_account;
    //    密码输入框
    @FindBy(id = "com.huizheng.lasq:id/input_password")
    @CacheLookup
    public WebElement input_password;
//    登录按钮
    @FindBy(id="com.huizheng.lasq:id/btn_login")
    @CacheLookup
    public WebElement btn_login;
 /* 公共  //   使用协议
    @FindBy(id="com.huizheng.lasq:id/btn_protocal")
    @CacheLookup
    public WebElement btn_protocol;*/
/* 公共
    //    1线男 注册后第一个提示，上传照片
    @FindBy(id="com.huizheng.lasq:id/upload_user_icon_image")
    @CacheLookup
    public WebElement upload_user_icon_image;


    //    环境修改
//    地址修改
    @FindBy(id = "com.huizheng.lasq:id/tv_test_address")
    @CacheLookup
    protected WebElement address;*/
    //    服务端环境
    @FindBy(id = "com.huizheng.lasq:id/rv_test_env")
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
/*   公共 //    渠道号
    @FindBy(id = "com.huizheng.lasq:id/et_test_fid")
    @CacheLookup
    public WebElement qudao;
    //    保存
    @FindBy(id = "com.huizheng.lasq:id/btn_test_save")
    @CacheLookup
    public WebElement btn_test_save;*/

    //    女用户提示注册成功提示
    @FindBy(id = "com.huizheng.lasq:id/btn_i_know")
    @CacheLookup
    public WebElement btn_i_know;

    //    缘分页头像
    @FindBy(id = "com.huizheng.lasq:id/iv")
    @CacheLookup
    public List<WebElement> iv_user;
    //    缘分页用户名
    @FindBy(id = "com.huizheng.lasq:id/tv_name")
    @CacheLookup
    public List<WebElement> tv_nickname;

    //  缘分页 用户左上角打招呼
    @FindBy(id = "com.huizheng.lasq:id/iv_say")
    @CacheLookup
    public List<WebElement> iv_sayhi;
    //    对对碰
    @FindBy(id = "com.huizheng.lasq:id/dialog_bg")
    @CacheLookup
    public WebElement duiduipeng_dialog_bg;
    //    对对碰余额
    @FindBy(id="com.huizheng.lasq:id/token_txt")
    @CacheLookup
    public WebElement token_txt;


    //    用户空间页
//    空间页用户名
    @FindBy(id = "com.huizheng.lasq:id/user_name_text")

    public WebElement user_name_text;
    //    空间页打招呼
    @FindBy(id = "com.huizheng.lasq:id/ask_button")
    @CacheLookup
    public WebElement ask_button;
    //    下一位
    @FindBy(id = "com.huizheng.lasq:id/next_button")
    @CacheLookup
    public WebElement next_button;
    //    资料
    @FindBy(id = "com.huizheng.lasq:id/member_info_text")
    @CacheLookup
    public WebElement memberinfotext;
    //    更多资料
    @FindBy(id = "com.huizheng.lasq:id/more_button")
    @CacheLookup
    public WebElement more_button;
    //    vip提示
    @FindBy(id = "com.huizheng.lasq:id/iv_dialog_bg")
    @CacheLookup
    public WebElement dialog_bg;
    //    空间页回退按钮
    @FindBy(id = "com.huizheng.lasq:id/action_bar_left_top")
    @CacheLookup
    public WebElement left_btn;
    //    空间右上角按钮
    @FindBy(id = "com.huizheng.lasq:id/action_bar_right_top")
    @CacheLookup
    public WebElement right_top;
    //    关注
    @FindBy(id = "com.huizheng.lasq:id/send_conversation")
    //    @CacheLookup
    public WebElement conversation;
    //    拉黑
    @FindBy(id = "com.huizheng.lasq:id/neglect_not_read")
    @CacheLookup
    public WebElement notread;
    //    举报
    @FindBy(id = "com.huizheng.lasq:id/upgraded_members")
    @CacheLookup
    public WebElement upgraded;
    //    举报“其他”
    @FindBy(id = "com.huizheng.lasq:id/other")
    @CacheLookup
    public WebElement other;
    //   确定举报
    @FindBy(id = "com.huizheng.lasq:id/sure")
    @CacheLookup
    public WebElement sure;
    //    空间页 开通会员
    @FindBy(id = "com.huizheng.lasq:id/online_status_text")
    @CacheLookup
    public WebElement online_status;
    //    3线 语音聊天
    @FindBy(id = "com.huizheng.lasq:id/btn_video_chat")
    @CacheLookup
    public WebElement btn_video_chat;
    //    女用户 手机验证提示框
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout")
    @CacheLookup
    public WebElement layout;
    //    畅聊会员
    @FindBy(xpath = "//android.view.View[@content-desc=\"畅聊会员\"]")
    @CacheLookup
    public WebElement changliaohuiyuan;
    //    空间页头像
    @FindBy(id = "com.huizheng.lasq:id/pic_count")
    @CacheLookup
    public WebElement piccount;
    //    空间页关注提示浮层
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")
    @CacheLookup
    public WebElement tips;
    //    视频
    @FindBy(id = "com.huizheng.lasq:id/video_view")
    @CacheLookup
    public WebElement video_view;
    //    手机验证下方 跳过
    @FindBy(id="com.huizheng.lasq:id/tv_verif_jump")
    @CacheLookup
    public WebElement jump;

    //    更多资料 详情
    @FindBy(id = "com.huizheng.lasq:id/member_info_text_more")
    @CacheLookup
    public WebElement more_text;

//    女用户 查看男用户空间 下方 广告
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[3]")
    @CacheLookup
    public WebElement advertiesment;


    //    搜索模块
    //    右上角搜索按钮
    @FindBy(id = "com.huizheng.lasq:id/search_right_button")
    @CacheLookup
    public WebElement search_right_button;
    //搜索结果列表打招呼
    @FindBy(id = "com.huizheng.lasq:id/search_list_item_user_hello")
    @CacheLookup
    public List<WebElement> hello_btn;
    //    搜索结果用户昵称
    @FindBy(id = "com.huizheng.lasq:id/search_list_item_user_nickname")
    @CacheLookup
    public List<WebElement> search_list_item_user_nickname;
    //   搜索结果 用户头像
    @FindBy(id = "com.huizheng.lasq:id/search_list_item_user_headphoto")
    @CacheLookup
    public List<WebElement> search_list_item_user_headphoto;
    ///征友条件页面，所在地 信息
    @FindBy(id = "com.huizheng.lasq:id/search_condition_area_select")
    @CacheLookup
    public WebElement area_text;
    //征友条件页面 年龄 信息
    @FindBy(id = "com.huizheng.lasq:id/search_condition_age_select")
    @CacheLookup
    public WebElement age_text;
    //征友条件页面   身高 信息
    @FindBy(id = "com.huizheng.lasq:id/search_condition_height_select")
    @CacheLookup
    public WebElement height_text;
    // 征友条件页面   保存 按钮
    @FindBy(id = "com.huizheng.lasq:id/search_fragment_condition_save_btn")
    @CacheLookup
    public WebElement save_btn;
    // 条件选择，下一个按钮
    @FindBy(id = "com.huizheng.lasq:id/num_down_province")
    @CacheLookup
    public WebElement down;
    //    搜索结果列表中 地区
    @FindBy(id = "com.huizheng.lasq:id/search_list_item_user_area")
    @CacheLookup
    public List<WebElement> list_area;
    //    搜索结果列表中 年龄
    @FindBy(id = "com.huizheng.lasq:id/search_list_item_user_age")
    @CacheLookup
    public List<WebElement> list_age;
    //    搜索结果列表中 身高
    @FindBy(id = "com.huizheng.lasq:id/search_list_item_user_height")
    @CacheLookup
    public List<WebElement> list_height;
    //    搜索无结果提示
    @FindBy(id = "com.huizheng.lasq:id/search_fragment_net_error_tv")
    @CacheLookup
    public WebElement search_fragment_net_error_tv;
    //    推荐列表头像
    @FindBy(id = "com.huizheng.lasq:id/iv_nearby_person_item_headphoto")
    @CacheLookup
    public List<WebElement> tuijianlist;


    //    信箱
//    女用户  开启缘分小助手 按钮
    @FindBy(id = "com.huizheng.lasq:id/ok")
    @CacheLookup
    public WebElement ok;
    //    私信上未读的标记
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.TextView[2]")
//    @CacheLookup
    public WebElement letter_num;
    //    下方信箱上未读标记
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.TextView")
//    @CacheLookup
    public WebElement mailbox_num;
    //    立即查看 私信按钮
    @FindBy(id = "com.huizheng.lasq:id/img_look")
    @CacheLookup
    public List<WebElement> img_look;
//    //    立即查看 私信按钮
//    @FindBy(id = "com.huizheng.lasq:id/img_look")
//    @CacheLookup
//    public WebElement img_look1;
    //   完善资料标签
    @FindBy(id = "com.huizheng.lasq:id/ad_image_view")
    @CacheLookup
    public WebElement personal_data;
    //    通知标签
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.TextView")
    @CacheLookup
    public WebElement tongzhi;
    //    私信标签
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.TextView[1]")
    @CacheLookup
    public WebElement sixin;
    //    最近联系标签
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.TextView")
    @CacheLookup
    public WebElement lianxi;
    //    私信里 的 用户头像
    @FindBy(id="com.huizheng.lasq:id/message_member_image")
    @CacheLookup
    public WebElement message_member_image;
    //    从私信进入用户空间的 索要联系方式
    @FindBy(id="com.huizheng.lasq:id/reply_ask_contact_tv")
    @CacheLookup
    public WebElement reply_ask;
    //    空间页中上方照片
    @FindBy(id="com.huizheng.lasq:id/image_view")
    @CacheLookup
    public WebElement image_view;


//    附近模块元素
//    进入附近模块后，显示的用户头像
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[4]/android.widget.ImageView")
//    @CacheLookup
    public WebElement desc;
    //    不喜欢
    @FindBy(id = "com.huizheng.lasq:id/iv_no_like_map")
    @CacheLookup
    public WebElement no_like_map;
    //    喜欢
    @FindBy(id = "com.huizheng.lasq:id/iv_like_map")
    @CacheLookup
    public WebElement like_map;
    //    附近头像
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ImageView")
//    @CacheLookup
    public WebElement imageview;
    //    头像弹框
    @FindBy(id = "com.huizheng.lasq:id/iv_head_map")
    @CacheLookup
    public WebElement head_map;
    //    姓名
    @FindBy(id="com.huizheng.lasq:id/tv_name_map")
    @CacheLookup
    public WebElement tv_name_map;
    //    年龄
    @FindBy(id="com.huizheng.lasq:id/tv_age_map")
    @CacheLookup
    public WebElement tv_age_map;
    //    距离
    @FindBy(id="com.huizheng.lasq:id/tv_distance_map")
    @CacheLookup
    public WebElement tv_distance_map;

    //    附近
//    新鲜事
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.TextView")
    @CacheLookup
    public WebElement nearthing;
    //    身边人
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.TextView")
    @CacheLookup
    public WebElement nearpeople;
    //    身边人头像
    @FindBy(id="com.huizheng.lasq:id/iv_nearby_person_item_headphoto")
    @CacheLookup
    public List<WebElement> nearheadphoto;
    //    身边人姓名
    @FindBy(id="com.huizheng.lasq:id/tv_nearby_person_item_nickname")
    @CacheLookup
    public List<WebElement> nearnickname;
    //    身边人年龄
    @FindBy(id="com.huizheng.lasq:id/tv_nearby_person_item_age")
    @CacheLookup
    public List<WebElement> nearage;


    //    我的
/* 公共
//    会员中心按钮
    @FindBy(id = "com.huizheng.lasq:id/left_member_center")
    @CacheLookup
    public WebElement member_center;*/
    //    资料按钮
    @FindBy(id = "com.huizheng.lasq:id/right_member_info")
    @CacheLookup
    public WebElement memberinfo;
    //    匹配问答
    @FindBy(id = "com.huizheng.lasq:id/matching_qa")
    @CacheLookup
    public WebElement matching_qa;
    //    我的问答
    @FindBy(id = "com.huizheng.lasq:id/body_item_3")
    @CacheLookup
    public WebElement myquestion;
    //    未答题提示
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[1]")
    @CacheLookup
    public WebElement noquestion;
    //    去答题
    @FindBy(id = "com.huizheng.lasq:id/matching_qa_none_btn")
    @CacheLookup
    public WebElement matching_qa_none_btn;
    //    上方去答题按钮
    @FindBy(id = "com.huizheng.lasq:id/matching_qa_go")
    @CacheLookup
    public WebElement matching_qa_go;
    //    我的标签
    @FindBy(id = "com.huizheng.lasq:id/body_item_9")
    @CacheLookup
    public WebElement mytag;
    //    最近访客
    @FindBy(id = "com.huizheng.lasq:id/body_item_7")
    @CacheLookup
    public WebElement myvisitor;
    //    诚信登记
    @FindBy(id="com.huizheng.lasq:id/integrity_layout")
    @CacheLookup
    public WebElement integrity;
    //    身份认证
    @FindBy(id="com.huizheng.lasq:id/identity_auth_layout")
    @CacheLookup
    public WebElement identity;
    //    手机认证
    @FindBy(id ="com.huizheng.lasq:id/phone_auth_layout" )
    @CacheLookup
    public WebElement phone;
    //    上传照片
    @FindBy(id="com.huizheng.lasq:id/upload_photo_layout")
    @CacheLookup
    public WebElement photo;
    //    资料
    @FindBy(id="com.huizheng.lasq:id/information_layout")
    @CacheLookup
    public WebElement information;
    //    我的标签中匹配问答
    @FindBy(id = "com.huizheng.lasq:id/id_textview_matching")
    @CacheLookup
    public WebElement match;
    //    自我介绍
    @FindBy(id = "com.huizheng.lasq:id/self_introduction")
    @CacheLookup
    public WebElement self_introduction;
    //    重新录制
    @FindBy(id = "com.huizheng.lasq:id/record_again_button")
    @CacheLookup
    public WebElement record_again_button;
    //    征友条件
    @FindBy(id = "com.huizheng.lasq:id/body_item_1")
    @CacheLookup
    public WebElement body_item_1;
    //   征友条件 所在地条件
    @FindBy(id = "com.huizheng.lasq:id/myspace_location_view")
    @CacheLookup
    public WebElement location_view;
    //   征友条件 年龄 信息
    @FindBy(id = "com.huizheng.lasq:id/myspace_he_age_view")
    @CacheLookup
    public WebElement age_view;
    //    征友条件身高条件
    @FindBy(id = "com.huizheng.lasq:id/myspace_info_height_view")
    @CacheLookup
    public WebElement height_view;

    //    第一个答案
    @FindBy(id = "com.huizheng.lasq:id/question_view")
    @CacheLookup
    public WebElement question_view;
    //    提交答案按钮
    @FindBy(id = "com.huizheng.lasq:id/qa_send_question_id")
    @CacheLookup
    public WebElement send_question;
    //    我的匹配问答 数量
    @FindBy(id = "com.huizheng.lasq:id/body_item_3_text")
    @CacheLookup
    public WebElement questionnum;
    //    我的匹配问答 回答的问题列表
    @FindBy(id = "com.huizheng.lasq:id/matching_qa_q_ico")
//    @CacheLookup
    public List<WebElement> qa_q_ico;

    //    设置按钮
    @FindBy(id = "com.huizheng.lasq:id/body_item_6")
    @CacheLookup
    public WebElement setting;
    //  我关注的人
    @FindBy(id = "com.huizheng.lasq:id/body_item_5")
    @CacheLookup
    public WebElement conversationperson;
    //  我关注的人数量
    @FindBy(id = "com.huizheng.lasq:id/body_item_5_text")
    @CacheLookup
    public WebElement conversationpersonnum;
    //  我关注的人头像列表
    @FindBy(id = "com.huizheng.lasq:id/search_list_item_user_headphoto")
    @CacheLookup
    public List<WebElement> user_headphoto;
    //    我关注的人 姓名
    @FindBy(id = "com.huizheng.lasq:id/search_list_item_user_nickname")
    @CacheLookup
    public WebElement user_nickname;


    //    个人资料页面
//    个人资料
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
    //    保存
    @FindBy(id = "com.huizheng.lasq:id/save")
    @CacheLookup
    public WebElement save;
    //    个性特征
    @FindBy(id = "com.huizheng.lasq:id/item_text")
    @CacheLookup
    public WebElement property;
    //    兴趣爱好
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.GridView[2]/android.widget.RelativeLayout[1]/android.widget.TextView")
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
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout")
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
    public WebElement maritalstatus;
    //    住房情况
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[7]/android.widget.RelativeLayout")
    @CacheLookup
    public WebElement house;
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

    /**
     *
     */
    //  会员中心页面
/* 公共
    //    豆币
    @FindBy(id = "com.huizheng.lasq:id/member_center_bean_title")
    @CacheLookup
    public WebElement bean;

    //    右上角刷新
    @FindBy(id = "com.huizheng.lasq:id/btn_right")
    @CacheLookup
    public WebElement btn_right;*/
/* 公共
    //    自动续费
    @FindBy(xpath = "//android.view.View[@content-desc=\"自动续费再减10元\"]")
//    @CacheLookup
    public WebElement xufei;
    //    豆币详情

    //    3天VIP 0元购
    @FindBy(xpath = "//android.view.View[@content-desc=\"0元3天\"]")
    @CacheLookup
    public WebElement bean_vip;
    //    800语音豆
    @FindBy(xpath = "//android.view.View[@content-desc=\"0.1元/豆\"]")
    @CacheLookup
    public WebElement bean800;*/
//    //    800语音豆价格
//    @FindBy(xpath = "//android.view.View[@content-desc=\"共￥99\"]")
//    @CacheLookup
//    public WebElement bean800price;
/*  公共  //    550语音豆
    @FindBy(xpath = "//android.view.View[@content-desc=\"0.16元/豆\"]")
    @CacheLookup
    public WebElement bean550;*/
//    //    550语音豆价格
//    @FindBy(xpath = "//android.view.View[@content-desc=\"共￥89\"]")
//    @CacheLookup
//    public WebElement bean550price;

//    ///    3线 800语音豆
//    @FindBy(xpath = "//android.view.View[@content-desc=\"800语音豆 开通再送208豆\"]")
//    @CacheLookup
//    public WebElement bean800_3;
//    //    3线 800语音豆价格
//    @FindBy(xpath = "//android.view.View[@content-desc=\"￥99\"]")
//    @CacheLookup
//    public WebElement bean800price_3;
//    //    3线 550语音豆
//    @FindBy(xpath = "//android.view.View[@content-desc=\"550语音豆\"]")
//    @CacheLookup
//    public WebElement bean550_3;
//    //    3线 550语音豆价格
//    @FindBy(xpath = "//android.view.View[@content-desc=\"￥89\"]")
//    @CacheLookup
//    public WebElement bean550price_3;

 /* 公共  //    800优惠价额
    @FindBy(xpath = "//android.view.View[@content-desc=\"已优惠:-10元合计:￥89\"]")
//    @CacheLookup
    public WebElement youhuijiage800;
    //    800原价
    @FindBy(xpath = "//android.view.View[@content-desc=\"合计:￥99\"]")
//    @CacheLookup
    public WebElement yuanjia800;
    //    550优惠价额
    @FindBy(xpath = "//android.view.View[@content-desc=\"已优惠:-10元合计:￥79\"]")
//    @CacheLookup
    public WebElement youhuijiage550;
    //    550原价
    @FindBy(xpath = "//android.view.View[@content-desc=\"合计:￥89\"]")
//    @CacheLookup
    public WebElement yuanjia550;*/

    //    写信包月详情
/*  公共  //    写信包月
    @FindBy(id = "com.huizheng.lasq:id/member_write_letters_layout")
    @CacheLookup
    public WebElement write_letters;
//    3天VIP 0元购
    @FindBy(xpath = "//android.view.View[@content-desc=\"0元3天\"]")
    @CacheLookup
    public WebElement letter_vip;
    //    90天会员
    @FindBy(xpath = "//android.view.View[@content-desc=\"1.2元/天\"]")
    @CacheLookup
    public WebElement letter90;*/
//    //   3线 90天会员
//    @FindBy(xpath = "//android.view.View[@content-desc=\"90天畅聊会员 超值\"]")
//    @CacheLookup
//    public WebElement letter90_3;
//    //    90天会员价格
//    @FindBy(xpath = "//android.view.View[@content-desc=\"共￥109\"]")
//    @CacheLookup
//    public WebElement letter90price;
//    //    3线 90天会员价格
//    @FindBy(xpath = "//android.view.View[@content-desc=\"￥109\"]")
//    @CacheLookup
//    public WebElement letter90price_3;
/* 公共   //    30天会员
    @FindBy(xpath = "//android.view.View[@content-desc=\"2.9元/天\"]")
    @CacheLookup
    public WebElement letter30;*/
//    //    3线 30天会员
//    @FindBy(xpath = "//android.view.View[@content-desc=\"30天畅聊会员\"]")
//    @CacheLookup
//    public WebElement letter30_3;
//    //    30天会员价格
//    @FindBy(xpath = "//android.view.View[@content-desc=\"共￥89\"]")
//    @CacheLookup
//    public WebElement letter30price;
//    //    3线 30天会员价格
//    @FindBy(xpath = "//android.view.View[@content-desc=\"￥89\"]")
//    @CacheLookup
//    public WebElement letter30price_3;
/*  公共  //    7天会员
    @FindBy(xpath = "//android.view.View[@content-desc=\"9.8元/天\"]")
    @CacheLookup
    public WebElement letter7;*/
//    //    3线 7天会员
//    @FindBy(xpath = "//android.view.View[@content-desc=\"7天畅聊会员\"]")
//    @CacheLookup
//    public WebElement letter7_3;
//    //    7天会员价格
//    @FindBy(xpath = "//android.view.View[@content-desc=\"共￥69\"]")
//    @CacheLookup
//    public WebElement letter7price;
//    //    3线 7天会员价格
//    @FindBy(xpath = "//android.view.View[@content-desc=\"￥69\"]")
//    @CacheLookup
//    public WebElement letter7price_3;
/* 公共   //    90优惠价额
    @FindBy(xpath = "//android.view.View[@content-desc=\"已优惠:-10元合计:￥99\"]")
//    @CacheLookup
    public WebElement youhuijiage90;
    //    90原价
    @FindBy(xpath = "//android.view.View[@content-desc=\"合计:￥109\"]")
//    @CacheLookup
    public WebElement yuanjia90;
    //    30优惠价额
    @FindBy(xpath = "//android.view.View[@content-desc=\"已优惠:-10元合计:￥79\"]")
//    @CacheLookup
    public WebElement youhuijiage30;
    //    30原价
    @FindBy(xpath = "//android.view.View[@content-desc=\"合计:￥89\"]")
//    @CacheLookup
    public WebElement yuanjia30;
    //    7优惠价额
    @FindBy(xpath = "//android.view.View[@content-desc=\"已优惠:-10元合计:￥59\"]")
//    @CacheLookup
    public WebElement youhuijiage7;
    //    7原价
    @FindBy(xpath = "//android.view.View[@content-desc=\"合计:￥69\"]")
//    @CacheLookup
    public WebElement yuanjia7;*/

    //    星级服务详情
 /*公共   //    星级服务
    @FindBy(id = "com.huizheng.lasq:id/member_center_vip_title")
    @CacheLookup
    public WebElement vip_title;
//    vip新手
    @FindBy(xpath = "//android.view.View[@content-desc=\"签约领取VIP新手礼包\"]")
//    @CacheLookup
    public WebElement newvip;
    //    vip90天
    @FindBy(xpath = "//android.view.View[@content-desc=\"VIP会员 90天 ￥100\"]")
    @CacheLookup
    public WebElement vip90;
    //    vip30天
    @FindBy(xpath = "//android.view.View[@content-desc=\"VIP会员 30天 ￥50\"]")
    @CacheLookup
    public WebElement vip30;
    //    90vip优惠价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"已优惠:-10元合计:￥90\"]")
//    @CacheLookup
    public WebElement youhuijiage_vip90;
    //    90vip原价
    @FindBy(xpath = "//android.view.View[@content-desc=\"合计:￥100\"]")
//    @CacheLookup
    public WebElement yuanjia_vip90;
    //    30vip优惠价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"已优惠:-10元合计:￥40\"]")
//    @CacheLookup
    public WebElement youhuijiage_vip30;
    //    30vip原价
    @FindBy(xpath = "//android.view.View[@content-desc=\"合计:￥50\"]")
//    @CacheLookup
    public WebElement yuanjia_vip30;*/

/*  公共  //    收信宝
    @FindBy(id = "com.huizheng.lasq:id/member_center_receive_letter_layout")
    @CacheLookup
    public WebElement receive_letter;*/
    //    收信宝上传头像
    @FindBy(xpath = "//android.view.View[@content-desc=\"点此上传头像\"]")
    @CacheLookup
    public WebElement uploadpic;
    //    本地照片
    @FindBy(id = "com.huizheng.lasq:id/local_picture")
    @CacheLookup
    public WebElement localpicture;
    // 本地相册
    @FindBy(xpath = "//android.widget.ListView[@content-desc=\"本地相册\"]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.ImageView")
    @CacheLookup
    public WebElement img;
    //选中照片 右上角√
    @FindBy(id = "com.android.gallery3d:id/head_select_right")
    @CacheLookup
    public WebElement imgok;
    //  确认照片 右上角确定
    @FindBy(id = "com.huizheng.lasq:id/btn_right")
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
    //  咪咕
    @FindBy(id = "com.huizheng.lasq:id/tv_member_center_migu_title")
    @CacheLookup
    public WebElement migu;
    //    立即开通
    @FindBy(xpath = "//android.view.View[@content-desc=\"立即开通\"]")
//    @CacheLookup
    public WebElement kaitong;

    //    支付方式
/* 公共//  微信支付
    @FindBy(xpath = "//android.view.View[@content-desc=\"微信支付\"]")
    @CacheLookup
    public WebElement wecharpay;
    //  银联支付
    @FindBy(xpath = "//android.view.View[@content-desc=\"银联支付\"]")
    @CacheLookup
    public WebElement yinlianpay;*/


    //    设置页面
//    设置页面 用户信息
    @FindBy(id = "com.huizheng.lasq:id/setting_item_name")
    @CacheLookup
    public WebElement userinfo;

    //    用户信息页面 登录账号
    @FindBy(id = "com.huizheng.lasq:id/setting_userinfo_username")
    @CacheLookup
    public WebElement userinfo_username;

    //    修改密码按钮
    @FindBy(id = "com.huizheng.lasq:id/modify_button")
    @CacheLookup
    public WebElement modify_button;

    //    密码框
    @FindBy(id = "com.huizheng.lasq:id/account_manage_confirm_password")
    @CacheLookup
    public WebElement password;

    //    保存
    @FindBy(id = "com.huizheng.lasq:id/account_manage_btn_submit")
    @CacheLookup
    public WebElement btn_submit;


//    //    支付宝页面
//    @FindBy(xpath = "//android.widget.Button[@content-desc=\"同意协议并开通\"]")
//    @CacheLookup
//    public WebElement agree;
//
//    //    支付成功页面关闭
//    @FindBy(xpath = "//android.widget.Button[@content-desc=\"返回\"]")
//    @CacheLookup
//    public WebElement back;
//    //    支付宝页面 首页 按钮
//    @FindBy(id = "com.alipay.android.phone.openplatform:id/tab_description")
//    @CacheLookup
//    public WebElement alipay;
//    //    支付宝确实放弃支付
//    @FindBy(id = "com.alipay.mobile.antui:id/ensure")
//    @CacheLookup
//    public WebElement ensure;
//    //    支付宝付款界面 左上角回退
//    @FindBy(id = "com.alipay.mobile.nebula:id/h5_tv_nav_back")
//    @CacheLookup
//    public WebElement alipayback;
//    //    支付宝支付提示
//    @FindBy(xpath = "//android.widget.Button[@content-desc=\"确认开通并支付\"]")
//    @CacheLookup
//    public WebElement alisure;


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
    //    推荐购买中 不要
    @FindBy(xpath = "//android.view.View[@content-desc=\"不要\"]")
    @CacheLookup
    public WebElement buyao;
    //    第二次支付引导中 不聊
    @FindBy(xpath = "//android.view.View[@content-desc=\"不聊\"]")
    @CacheLookup
    public WebElement buliao;


    //    微信支付调起时，支付确认按钮
    @FindBy(xpath = "//android.view.View[@content-desc=\"确认 Link\"]")
//    @CacheLookup
    public WebElement queren;

    //    实名拦截
//    实名拦截提示
    @FindBy(id="com.huizheng.lasq:id/phone_auth_text1")
//    @CacheLookup
    public WebElement phoneauth;

    //    空间页 切换 按钮
    @FindBy(id="com.huizheng.lasq:id/change_button")
//    @CacheLookup
    public WebElement changebutton;
    //    短信传情购买提示
    @FindBy(id="com.huizheng.lasq:id/tv_sm_pay_dialog_2_content")
//    @CacheLookup
    public WebElement smpaydialog;

    @FindBy(id="com.huizheng.lasq:id/tv_sm_pay_dialog_2_close")
//    @CacheLookup
    public WebElement smpaydialogclose;

    //    收信宝礼包
    @FindBy(id="com.huizheng.lasq:id/receiver_letter_treasure_btn")
    @CacheLookup
    public WebElement receiver_letter_treasure_btn;

    //    打招呼按钮
    @FindBy(id="com.huizheng.lasq:id/sayhello")
    @CacheLookup
    public List<WebElement> sayhello;

    //    切换用户
    @FindBy(id="com.huizheng.lasq:id/setting_change_user_button")
    @CacheLookup
    public WebElement changeuser;

    //    提示上传头像 取消
    @FindBy(id="com.huizheng.lasq:id/man_upload_userportrait_cancle")
    @CacheLookup
    public WebElement manuploaduserportraitcancle;

    //    星级服务 下方到期提示
    @FindBy(id="com.huizheng.lasq:id/member_center_vip_explain")
    @CacheLookup
    public WebElement membercentervipexplain;

    //    私信页面 用户名列表
    @FindBy(id="com.huizheng.lasq:id/user_name")
    @CacheLookup
    public List<WebElement> user_name;

    //    管理员 第一份信内容
    @FindBy(id="com.huizheng.lasq:id/message_chat_content")
    @CacheLookup
    public WebElement message_chat_content;


    //    设置页面 用户信息
    @FindBy(id = "com.huizheng.lasq:id/setting_item_name")
    @CacheLookup
    public List<WebElement> set;

//    //    用户信息页面 登录账号
//    @FindBy(id = "com.huizheng.lasq:id/setting_userinfo_username")
//    @CacheLookup
//    public WebElement userinfo_username;
//
//    //    修改密码按钮
//    @FindBy(id = "com.huizheng.lasq:id/modify_button")
//    @CacheLookup
//    public WebElement modify_button;

//    //    密码框
//    @FindBy(id = "com.huizheng.lasq:id/account_manage_confirm_password")
//    @CacheLookup
//    public WebElement password;
//
//    //    保存
//    @FindBy(id = "com.huizheng.lasq:id/account_manage_btn_submit")
//    @CacheLookup
//    public WebElement btn_submit;

    //    安全指南
//    酒托
    @FindBy(xpath = "//android.view.View[@content-desc=\"酒托 Link\"]")
    @CacheLookup
    public WebElement jiutuo;
    //    酒托详细页面  左上角 酒托
    @FindBy(xpath = "//android.view.View[@content-desc=\"酒托\"]")
    @CacheLookup
    public WebElement jiutuohead;

    //    帮助
//    输入框
    @FindBy(xpath = "//android.view.View[@content-desc=\"帮助&反馈\"]/android.widget.EditText")
    @CacheLookup
    public WebElement input_help;
    //    查找
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"查找\"]")
    @CacheLookup
    public WebElement search;
    //    退订续费 帮助
    @FindBy(xpath = "//android.view.View[@content-desc=\"退订自动续费。 Link\"]")
    @CacheLookup
    public WebElement tuiding;
    //    退订详情 左上角 标题
    @FindBy(xpath = "//android.view.View[@content-desc=\"退订自动续费\"]")
    @CacheLookup
    public WebElement tuidinghead;

    //    在线客服
//    如何写信
    @FindBy(xpath = "//android.view.View[@content-desc=\"1、如何与异性聊天写信？\"]")
    @CacheLookup
    public WebElement question1;
    //    回答
    @FindBy(xpath = "//android.view.View[@content-desc=\"建议您登陆后点击“我→会员中心→选择写信包月或购买豆币”，即可写信聊。\"]")
    @CacheLookup
    public WebElement answer1;

    //    自定义招呼
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout")
    @CacheLookup
    public WebElement customcall;
    //    招呼内容
    @FindBy(id="com.huizheng.lasq:id/custom_call_edittext")
//    @CacheLookup
    public WebElement customcalledittext;
    //    提交
    @FindBy(id="com.huizheng.lasq:id/custom_call_submit_button")
    @CacheLookup
    public WebElement customcallsubmitbutton;


    //    支付宝页面
//    同意协议勾选
    @FindBy(xpath = "//android.widget.CheckBox[@content-desc=\"我已阅读并同意\"]")
//    @CacheLookup
    public WebElement alimianmi;
    //   支付按钮
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"确认开通并支付\"]")
//    @CacheLookup
    public WebElement agreepay;

    //    支付成功后 支付宝 返回按钮
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"返回\"]")
    @CacheLookup
    public WebElement aliback;

    //   支付按钮
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"同意协议并开通\"]")
    @CacheLookup
    public WebElement agree;
    //    成功支付页面，右上角完成
    @FindBy(id="com.alipay.android.app:id/nav_right_textview")
    @CacheLookup
    public WebElement aliright;

    //    支付宝立即付款按钮
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[3]/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout")
    @CacheLookup
    public WebElement alipaynow;

    //    支付成功页面关闭
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"返回\"]")
    @CacheLookup
    public WebElement back;
    //    支付宝页面 首页 按钮
    @FindBy(id = "com.alipay.android.phone.openplatform:id/tab_description")
    @CacheLookup
    public WebElement alipay;
    //    支付宝确认放弃支付
    @FindBy(id = "com.alipay.mobile.antui:id/ensure")
    @CacheLookup
    public WebElement ensure;
    //    支付宝付款界面 左上角回退
    @FindBy(id = "com.alipay.mobile.nebula:id/h5_tv_nav_back")
    @CacheLookup
    public WebElement alipayback;
    //    支付宝支付提示
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"确认开通并支付\"]")
    @CacheLookup
    public WebElement alisure;


    //    微信
    @FindBy(id = "com.huizheng.lasq:id/img_wx_look")
    @CacheLookup
    public WebElement wx_look;
    //    qq
    @FindBy(id = "com.huizheng.lasq:id/img_qq_look")
    @CacheLookup
    public WebElement qq_look;

    //    生活圈
    @FindBy(id="com.huizheng.lasq:id/tv_yuanfen_video")
    @CacheLookup
    public WebElement tv_yuanfen_video;
    //    生活圈 第一列头像
    @FindBy(id="com.huizheng.lasq:id/gif_short_item_1")
    @CacheLookup
    public List<WebElement>  gif_short_item_1;
    //    生活圈 第一列关注
    @FindBy(id="com.huizheng.lasq:id/iv_short_item_follow_1")
    @CacheLookup
    public List<WebElement> iv_short_item_follow_1;
    //    生活圈 第一列姓名
    @FindBy(id="com.huizheng.lasq:id/tv_short_item_name_1")
    @CacheLookup
    public List<WebElement> tv_short_item_name_1;
    //    生活圈 第一列年龄
    @FindBy(id="com.huizheng.lasq:id/tv_short_item_age_1")
    @CacheLookup
    public List<WebElement> tv_short_item_age_1;
    //    生活圈空间 返回
    @FindBy(id="com.huizheng.lasq:id/iv_video_space_back")
    @CacheLookup
    public WebElement iv_video_space_back;
    //    生活圈空间 头像
    @FindBy(id="com.huizheng.lasq:id/iv_video_space_head")
    @CacheLookup
    public WebElement iv_video_space_head;
    //    生活圈空间 姓名
    @FindBy(id="com.huizheng.lasq:id/tv_video_space_name")
    @CacheLookup
    public WebElement tv_video_space_name;
    //    生活圈空间 关注
    @FindBy(id="com.huizheng.lasq:id/iv_video_space_follow")
    @CacheLookup
    public WebElement iv_video_space_follow;
    //    生活圈空间 在线状态
    @FindBy(id="com.huizheng.lasq:id/tv_video_space_online")
    @CacheLookup
    public WebElement tv_video_space_online;
    //    生活圈空间 关注数
    @FindBy(id="com.huizheng.lasq:id/tv_video_space_zan_count")
//    @CacheLookup
    public WebElement tv_video_space_zan_count;
    //    生活圈空间 语音
    @FindBy(id="com.huizheng.lasq:id/ll_video_with_ta")
    @CacheLookup
    public WebElement ll_video_with_ta;
    //    生活圈空间 进入用户空间 返回
    @FindBy(id="com.huizheng.lasq:id/action_bar_left_top")
    @CacheLookup
    public WebElement lefttop;

    //    信箱中 视频 第一个头像
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.ImageView[1]")
    @CacheLookup
    public WebElement maibox_video;

    @FindBy(id="com.huizheng.lasq:id/tv_hangup")
    @CacheLookup
    public WebElement tv_hangup;

    @FindBy(id="com.huizheng.lasq:id/tv_desc")
    @CacheLookup
    public WebElement tv_desc;


    //  3线  注册引导 附近
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[4]/android.widget.ImageView")
    @CacheLookup
    public WebElement near1;

    //    3线 附近模块 附近
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[4]/android.widget.ImageView")
    @CacheLookup
    public WebElement near;


}

