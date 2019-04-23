package com.yy.page;

import com.hulu.check.publicCheck;
import com.hulu.method.ElementsMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PageElement extends publicCheck {

    //  通用
//    注册页面 左上角 回退，退回至选择登录页面
    @FindBy(id = "com.huizheng.lasq:id/tv_back")
    @CacheLookup
    public WebElement tv_back;
    //  #  登录按钮
    @FindBy(id = "com.huizheng.lasq:id/btn_login")
    @CacheLookup
    public WebElement btn_dialog_login;
 /*公共
  // #   一键注册
    @FindBy(id = "com.huizheng.lasq:id/btn_register")
    @CacheLookup
    public WebElement btn_reg;*/
   /*公共
   // #   返回注册
    @FindBy(id = "com.huizheng.lasq:id/login_regist_button")
    @CacheLookup
    public WebElement login_regist_button;*/

    //    环境修改元素
//    环境修改
/*公共
//  #  地址修改
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
    //    渠道号
    @FindBy(id = "com.huizheng.lasq:id/et_test_fid")
    @CacheLookup
    public WebElement qudao;
    //   # 保存
    @FindBy(id = "com.huizheng.lasq:id/btn_test_save")
    @CacheLookup
    public WebElement btn_test_save;
/*  公共
    //    用户名输入框
    @FindBy(id = "com.huizheng.lasq:id/input_account")
    @CacheLookup
    public WebElement input_account;
    //    密码输入框
    @FindBy(id = "com.huizheng.lasq:id/input_password")
    @CacheLookup
    public WebElement input_password;
    // #   登录按钮
    @FindBy(id = "com.huizheng.lasq:id/btn_login")
    public WebElement btn_login;


    //  #  左上角返回
    @FindBy(id = "com.huizheng.lasq:id/btn_left")
    @CacheLookup
    public WebElement btn_left;

    // #   超级曝光立即领取
    @FindBy(id = "com.huizheng.lasq:id/btn_speed")
    @CacheLookup
    public WebElement btn_speed;*/

    //    模块title
    @FindBy(id = "com.huizheng.lasq:id/id_topview")
    @CacheLookup
    public WebElement topview;
   /* 公共
   //  #  上方私信关闭
    @FindBy(id = "com.huizheng.lasq:id/msg_close")
    @CacheLookup
    public WebElement msg_close;
    //    取消按钮
    @FindBy(id = "com.huizheng.lasq:id/btn_cancel")
    @CacheLookup
    public WebElement btn_cancel;*/
    //  #  确认
    @FindBy(id = "com.huizheng.lasq:id/btn_ok")
    @CacheLookup
    public WebElement btn_ok;
  /* 公共
   //   # 页面上方title
    @FindBy(id = "com.huizheng.lasq:id/title_name")
    @CacheLookup
    public WebElement title_name;*/
    //    上方加载信息
    @FindBy(id = "com.huizheng.lasq:id/header_content")
    @CacheLookup
    public WebElement header_content;

   /* 公共//    1线下方3个模块
    @FindBy(className = "android.widget.RadioButton")
    @CacheLookup
    public List<WebElement> mokuai;*/

    //    附近
//    附近模块
//    身边人

//    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TabHost/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.TextView")
    @FindBy(xpath = "//android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]")
    @CacheLookup
    public WebElement nearpeople;
    // 身边人
    @FindBy(name = "身边人")
    @CacheLookup
    public WebElement womennearpeople;
    //    身边人头像
    @FindBy(id = "com.huizheng.lasq:id/iv_nearby_person_item_headphoto")
    @CacheLookup
    public List<WebElement> nearheadphoto;
    //    身边人姓名
    @FindBy(id = "com.huizheng.lasq:id/tv_nearby_person_item_nickname")
    @CacheLookup
    public List<WebElement> nearnickname;

    //  #  1线缘分页-筛选
    @FindBy(xpath = "//android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView")
    @CacheLookup
    public WebElement filter1;
    // #    1线缘分页-筛选条件-所在地
    @FindBy(id = "com.huizheng.lasq:id/search_condition_area_select")
    @CacheLookup
    public WebElement search_condition_area;
    // #    1线缘分页-筛选条件-身高
    @FindBy(id = "com.huizheng.lasq:id/search_condition_height")
    @CacheLookup
    public WebElement search_condition_height;
    // #    1线缘分页-筛选条件-年龄
    @FindBy(id = "com.huizheng.lasq:id/search_condition_age")
    @CacheLookup
    public WebElement search_condition_age;
    // #    1线缘分页-筛选条件-保存
    @FindBy(id = "com.huizheng.lasq:id/search_fragment_condition_save_btn")
    @CacheLookup
    public WebElement search_fragment_condition_save_btn;




    //    注册页面

   /* 移到公共包
   //   # 我是男
    @FindBy(id = "com.huizheng.lasq:id/btn_men")
    @CacheLookup
    public WebElement btn_men;*/
    //        女
    @FindBy(id = "com.huizheng.lasq:id/btn_women")
    @CacheLookup
    public WebElement btn_women;

    //    女用户提示注册成功提示
    @FindBy(id = "com.huizheng.lasq:id/btn_i_know")
    @CacheLookup
    public WebElement btn_i_know;

    //    三线男用户注册进入基本资料页面，身高
    @FindBy(id = "com.huizheng.lasq:id/rv_reg_dialog_height")
    @CacheLookup
    public WebElement rv_reg_dialog_height;

    //    三线男用户注册进入基本资料页面，点击立即注册按钮
    @FindBy(id = "com.huizheng.lasq:id/btn_reg_dialog_reg")
    @CacheLookup
    public WebElement btn_reg_dialog_reg;

    /* 公共
    //  # 使用协议
    @FindBy(id = "com.huizheng.lasq:id/btn_protocal")
    @CacheLookup
    public WebElement btn_protocal;

   //  #  1线男 注册后第一个提示，上传照片
    @FindBy(id = "com.huizheng.lasq:id/upload_user_icon_image")
    @CacheLookup
    public WebElement upload_user_icon_image;*/


    //  # 一线 缘分页头像
    @FindBy(id = "com.huizheng.lasq:id/iv_card_user_img")
    @CacheLookup
    public WebElement iv_card_user_img;

    //  #  三线缘分-语音页头像
    @FindBy(id = "com.huizheng.lasq:id/user_icon")
    @CacheLookup
    public List<WebElement> iv_user;

    //  #  一线缘分页用户名
    @FindBy(id = "com.huizheng.lasq:id/tv_card_user_name")
    @CacheLookup
    public WebElement tv_card_user_name;

    //  #  一线缘分页 打招呼按钮
    @FindBy(id = "com.huizheng.lasq:id/tv_card_sayhello")
    @CacheLookup
    public WebElement tv_card_sayhello;

    //    三线缘分页用户名
    @FindBy(id = "com.huizheng.lasq:id/tv_nickname")
    @CacheLookup
    public List<WebElement> tv_nickname;

    //    三线缘分页-语音tab语音按钮
    @FindBy(id = "com.huizheng.lasq:id/tv_voice")
    @CacheLookup
    public List<WebElement> tv_voice;

    //    对对碰
    @FindBy(id = "com.huizheng.lasq:id/dialog_bg")
    @CacheLookup
    public WebElement duiduipeng_dialog_bg;
    //    对对碰余额
    @FindBy(id="com.huizheng.lasq:id/token_txt")
    @CacheLookup
    public WebElement token_txt;

/*  公共
    //    每日推荐-喜欢左侧女孩
    @FindBy(id="com.huizheng.lasq:id/left_love_image")
    @CacheLookup
    public WebElement left_love_image;

    //    每日推荐-喜欢右侧女孩
    @FindBy(id="com.huizheng.lasq:id/right_love_image")
    @CacheLookup
    public WebElement right_love_image;*/

    //搜索结果列表打招呼
    @FindBy(id = "com.huizheng.lasq:id/search_list_item_user_hello")
    @CacheLookup
    public List<WebElement> hello_btn;


    //    用户空间页
    //  #  空间页用户名
    @FindBy(id = "com.huizheng.lasq:id/tv_name")
    public WebElement user_name_text;

    //  #  推荐-用户地址
    @FindBy(id = "com.huizheng.lasq:id/tv_card_address")
    @CacheLookup
    public WebElement  tv_card_address;
    //  #  推荐-用户身高
    @FindBy(id = "com.huizheng.lasq:id/tv_card_height")
    @CacheLookup
    public WebElement  tv_card_height;
    //  #  推荐-用户年龄
    @FindBy(id = "com.huizheng.lasq:id/tv_card_age")
    @CacheLookup
    public WebElement  tv_card_age;

    //  #  推荐-语音页用户名
    @FindBy(id = "com.huizheng.lasq:id/tv_name")
    @CacheLookup
    public List<WebElement>  user_name_list;

    //  #  缘分推荐页关注
    @FindBy(id = "com.huizheng.lasq:id/tv_card_attention")
    @CacheLookup
    public WebElement tv_card_attention;
   /* 公共
    //  #  缘分语音页关注
    @FindBy(id = "com.huizheng.lasq:id/tv_attention")
    @CacheLookup
    public List<WebElement> tv_attention;*/

    // #   空间页打招呼
    @FindBy(xpath = "//android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView")
    @CacheLookup
    public WebElement ask_button;
    //    空间页关注按钮
    @FindBy(xpath = "//android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView")
    @CacheLookup
    public WebElement attention_button;

    //    下一位
    @FindBy(id = "com.huizheng.lasq:id/next_button")
    @CacheLookup
    public WebElement next_button;
    //    更多资料
    @FindBy(id = "com.huizheng.lasq:id/more_button")
    @CacheLookup
    public WebElement more_button;
    // #   空间页回退按钮
    @FindBy(id = "com.huizheng.lasq:id/action_bar_left_top")
    @CacheLookup
    public WebElement left_btn;
    //    空间右上角按钮
    @FindBy(id = "com.huizheng.lasq:id/action_bar_right_top")
    @CacheLookup
    public WebElement right_top;

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
    //    女用户 手机验证提示框
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout")
    @CacheLookup
    public WebElement layout;
    //    空间页头像
    @FindBy(id = "com.huizheng.lasq:id/iv_user_img")
    @CacheLookup
    public WebElement piccount;
    //    空间页照片
    @FindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.GridView/android.widget.RelativeLayout")
    @CacheLookup
    public List<WebElement> picturecount;

    //    空间页关注提示浮层
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")
    @CacheLookup
    public WebElement tips;
    //    资料
    @FindBy(id = "com.huizheng.lasq:id/member_info_text")
    @CacheLookup
    public WebElement memberinfotext;
    //    完善资料弹框
    @FindBy(id = "com.huizheng.lasq:id/age_dialog_title")
    @CacheLookup
    public WebElement age_dialog_title;


    //    视频
    @FindBy(id = "com.huizheng.lasq:id/video_view")
    @CacheLookup
    public WebElement video_view;
    //    vip提示
    @FindBy(id = "com.huizheng.lasq:id/iv_dialog_bg")
    @CacheLookup
    public WebElement dialog_bg;
    //    更多资料 详情
    @FindBy(id = "com.huizheng.lasq:id/member_info_text_more")
    @CacheLookup
    public WebElement more_text;
    //    女用户 查看男用户空间 下方 广告
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[3]")
    @CacheLookup
    public WebElement advertiesment;

    //    信箱
//    女用户  开启缘分小助手 按钮
    @FindBy(id = "com.huizheng.lasq:id/ok")
    @CacheLookup
    public WebElement ok;
    //   完善资料标签
    @FindBy(id = "com.huizheng.lasq:id/ad_image_view")
    @CacheLookup
    public WebElement personal_data;

    //    通知标签
    @FindBy(xpath = "//android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]")
    @CacheLookup
    public WebElement tongzhi;
    //    私信标签
    @FindBy(xpath = "//android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]")
    @CacheLookup
    public WebElement sixin;
    //    最近联系标签
    @FindBy(xpath = "//android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[3]")
    @CacheLookup
    public WebElement lianxi;

    //    私信上未读的标记
    @FindBy(xpath = "//android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.TextView[2]")
//    @CacheLookup
    public WebElement letter_num;
    //    下方信箱上未读标记
    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.TextView")
//    @CacheLookup
    public WebElement mailbox_num;
    //    立即查看 私信按钮
    @FindBy(id = "com.huizheng.lasq:id/img_look")
    @CacheLookup
    public List<WebElement> img_look;
    //    私信里 的 用户头像
    @FindBy(id = "com.huizheng.lasq:id/message_member_image")
    @CacheLookup
    public WebElement message_member_image;
    //    从私信进入用户空间的 索要联系方式
    @FindBy(id = "com.huizheng.lasq:id/reply_ask_contact_tv")
    @CacheLookup
    public WebElement reply_ask;
    //    从私信进入用户空间的 索要联系方式-sp支付页面跳过
    @FindBy(id = "com.huizheng.lasq:id/tv_verif_jump")
    @CacheLookup
    public WebElement tv_verif_jump;

    //    空间页中上方照片
    @FindBy(id = "com.huizheng.lasq:id/image_view")
    @CacheLookup
    public WebElement image_view;


    //    我的
/*公共
//  #  会员中心按钮
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
    public WebElement myquestion;
    //  #  个人资料
    @FindBy(id = "com.huizheng.lasq:id/body_item_3")
    @CacheLookup
    public WebElement myquestion_3;

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
    //    第一个答案
    @FindBy(id = "com.huizheng.lasq:id/question_view")
    @CacheLookup
    public List<WebElement> question_view;
    /*//    第一个答案文本
    @FindBy(id = "com.huizheng.lasq:id/setting_item_name")
    @CacheLookup
    public List<WebElement> setting_item_name;*/

    //    提交答案按钮
    @FindBy(id = "com.huizheng.lasq:id/qa_send_question_id")
    @CacheLookup
    public WebElement send_question;
    //    查看我的匹配问答
    @FindBy(id = "com.huizheng.lasq:id/id_textview_matching")
    @CacheLookup
    public WebElement id_textview_matching;

    //    我的匹配问答 数量
    @FindBy(id = "com.huizheng.lasq:id/body_item_3_text")
    @CacheLookup
    public WebElement questionnum;
    //    我的匹配问答 回答的问题列表
    @FindBy(id = "com.huizheng.lasq:id/matching_qa_question_item")
//    @CacheLookup
    public List<WebElement> qa_q_ico;
    //    我的标签
    @FindBy(id = "com.huizheng.lasq:id/body_item_9")
    @CacheLookup
    public WebElement mytag;

    //---------------我的-诚信等级
    //  #  诚信等级
    @FindBy(id = "com.huizheng.lasq:id/body_item_2")
    @CacheLookup
    public WebElement integrityLevel;
    //快捷身份认证-去认证
    @FindBy(id = "com.huizheng.lasq:id/identity_auth_button")
    public WebElement identity_auth_button;
    //手机认证
    @FindBy(id = "com.huizheng.lasq:id/phone_auth_button")
    public WebElement phone_auth_button;
    //上传本人3张照片
    @FindBy(id = "com.huizheng.lasq:id/upload_photo_button")
    public WebElement upload_photo_button;
    //资料完善到达90%
    @FindBy(id = "com.huizheng.lasq:id/information_button")
    public WebElement information_button;

    //快捷身份认证-完善资料
    @FindBy(id = "com.huizheng.lasq:id/setting_identity_auth_information_layout")
    public WebElement setting_identity_auth_information_layout;
    //快捷身份认证-上传头像
    @FindBy(id = "com.huizheng.lasq:id/setting_identity_auth_upload_user_icon_layout")
    public WebElement setting_identity_auth_upload_user_icon_layout;
    //快捷身份认证-验证手机号
    @FindBy(id = "com.huizheng.lasq:id/setting_identity_auth_check_phone_number_layout")
    public WebElement setting_identity_auth_check_phone_number_layout;
    //快捷身份认证-上传头像-拍照
    @FindBy(id = "com.huizheng.lasq:id/take_picture")
    public WebElement take_picture;
    //快捷身份认证-上传头像-快门
    @FindBy(id = "com.huawei.camera:id/shutter_button")
    public WebElement shutter_button;
    //快捷身份认证-上传头像-快门-右上角对勾
    @FindBy(id = "com.huawei.camera:id/btn_done")
    public WebElement btn_done;
    //    我的照片
    @FindBy(id = "com.huizheng.lasq:id/body_item_bottle_text")
    @CacheLookup
    public WebElement body_item_bottle_text;
    //    我的照片-上传照片
    @FindBy(id = "com.huizheng.lasq:id/btn_upload_pic")
    @CacheLookup
    public WebElement btn_upload_pic;
    //    我的照片-上传的照片
    @FindBy(id = "com.huizheng.lasq:id/image_view_check")
    @CacheLookup
    public WebElement image_view_check;


    //    征友条件
    @FindBy(id = "com.huizheng.lasq:id/body_item_1")
    @CacheLookup
    public WebElement body_item_1;
    //    自我介绍
    @FindBy(id = "com.huizheng.lasq:id/self_introduction")
    @CacheLookup
    public WebElement self_introduction;
    //    重新录制
    @FindBy(id = "com.huizheng.lasq:id/record_again_button")
    @CacheLookup
    public WebElement record_again_button;
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
    // 条件选择，下一个按钮
    @FindBy(id = "com.huizheng.lasq:id/num_down_province")
    @CacheLookup
    public WebElement down;

    //    最近访客
    @FindBy(id = "com.huizheng.lasq:id/body_item_7")
    @CacheLookup
    public WebElement myvisitor;

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


    //  会员中心页面
  /* 公共
   //  #  豆币
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
    @FindBy(xpath = "//android.view.View[@content-desc=\"3天VIP 0元购 限时\"]")
    @CacheLookup
    public WebElement bean_vip;
    //    800语音豆
    @FindBy(xpath = "//android.view.View[@content-desc=\"800豆币\"]")
    @CacheLookup
    public WebElement bean800;

   //    800语音豆价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"共￥99\"]")
    @CacheLookup
    public WebElement bean800price;
    //    550语音豆
    @FindBy(xpath = "//android.view.View[@content-desc=\"550豆币\"]")
    @CacheLookup
    public WebElement bean550;
    //    550语音豆价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"共￥89\"]")
    @CacheLookup
    public WebElement bean550price;

    ///    3线 800语音豆
    @FindBy(xpath = "//android.view.View[@content-desc=\"800语音豆 开通再送208豆\"]")
    @CacheLookup
    public WebElement bean800_3;*/
    //    3线 800语音豆价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"￥99/月\"]")
    @CacheLookup
    public WebElement bean800price_3;
/* 公共
   //    3线 550语音豆
    @FindBy(xpath = "//android.view.View[@content-desc=\"550语音豆\"]")
    @CacheLookup
    public WebElement bean550_3;*/
    //    3线 550语音豆价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"￥89/月\"]")
    @CacheLookup
    public WebElement bean550price_3;

   /* 公共

   //    800优惠价额
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
    public WebElement yuanjia550;

    //  #  写信包月
    @FindBy(id = "com.huizheng.lasq:id/member_write_letters_layout")
    @CacheLookup
    public WebElement write_letters;
    //    写信包月详情
//    3天VIP 0元购
    @FindBy(xpath = "//android.view.View[@content-desc=\"3天VIP 0元购 限时\"]")
    @CacheLookup
    public WebElement letter_vip;
    //    90天会员
    @FindBy(xpath = "//android.view.View[@content-desc=\"90天无限畅聊 最值\"]")
    @CacheLookup
    public WebElement letter90;

    //   3线 90天会员
    @FindBy(xpath = "//android.view.View[@content-desc=\"90天无限畅聊 超值\"]")
    @CacheLookup
    public WebElement letter90_3;
    //   1线 90天会员价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"共￥109\"]")
    @CacheLookup
    public WebElement letter90price;*/
    //    3线 90天会员价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"￥109\"]")
    @CacheLookup
    public WebElement letter90price_3;
/*  公共  //   1线 30天会员
    @FindBy(xpath = "//android.view.View[@content-desc=\"30天无限畅聊\"]")
    @CacheLookup
    public WebElement letter30;
    //    3线 30天会员
    @FindBy(xpath = "//android.view.View[@content-desc=\"30天无限畅聊\"]")
    @CacheLookup
    public WebElement letter30_3;*/
    //    30天会员价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"共￥89\"]")
    @CacheLookup
    public WebElement letter30price;
    //    3线 30天会员价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"￥89\"]")
    @CacheLookup
    public WebElement letter30price_3;
/*   公共 //    7天会员
    @FindBy(xpath = "//android.view.View[@content-desc=\"7天无限畅聊\"]")
    @CacheLookup
    public WebElement letter7;
    //    3线 7天会员
    @FindBy(xpath = "//android.view.View[@content-desc=\"7天畅聊会员\"]")
    @CacheLookup
    public WebElement letter7_3;*/
    //    7天会员价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"共￥69\"]")
    @CacheLookup
    public WebElement letter7price;
    //    3线 7天会员价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"￥69\"]")
    @CacheLookup
    public WebElement letter7price_3;
/*  公共  //    90优惠价额
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
    public WebElement yuanjia7;
    //  #  星级服务
    @FindBy(id = "com.huizheng.lasq:id/member_center_vip_title")
    @CacheLookup
    public WebElement vip_title;
    //    星级服务详情
//    vip新手
    @FindBy(xpath = "//android.view.View[@content-desc=\"签约领取VIP新手礼包\"]")
//    @CacheLookup
    public WebElement newvip;
    //    vip90天
    @FindBy(xpath = "//android.view.View[@content-desc=\"连续包季VIP会员 ￥100\"]")
    @CacheLookup
    public WebElement vip90;
    //    vip30天
    @FindBy(xpath = "//android.view.View[@content-desc=\"连续包月VIP会员 ￥50\"]")
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

    //    收信宝
    @FindBy(id = "com.huizheng.lasq:id/member_center_receive_letter_layout")
    @CacheLookup
    public WebElement receive_letter;
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
 /* 公共  //    立即开通
    @FindBy(xpath = "//android.view.View[@content-desc=\"立即开通\"]")
//    @CacheLookup
    public WebElement kaitong;

    //    支付方式
//  微信支付
    @FindBy(xpath = "//android.view.View[@content-desc=\"微信支付\"]")
    @CacheLookup
    public WebElement wecharpay;*/
    //  微信支付-确认
    @FindBy(xpath = "//android.view.View[@content-desc=\"确认\"]")
    @CacheLookup
    public WebElement confirm;

    //  银联支付
    @FindBy(xpath = "//android.view.View[@content-desc=\"银联支付\"]")
    @CacheLookup
    public WebElement yinlianpay;

    //    支付宝页面
//    @FindBy(xpath = "//android.widget.Button[@content-desc=\"同意协议并开通\"]")
//    @CacheLookup
//    public WebElement agree;
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

    //    个人资料元素
//    个人资料页面
/* 公共
//  #  个人资料
//    身高
    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout[6]/android.widget.RelativeLayout")
//    @CacheLookup
    public WebElement height;
    //    体重
    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout[7]/android.widget.RelativeLayout")
//    @CacheLookup
    public WebElement weight;
    //    血型
    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout[8]/android.widget.RelativeLayout")
//    @CacheLookup
    public WebElement bloodtype;
    //  #  保存
    @FindBy(id = "com.huizheng.lasq:id/save")
    @CacheLookup
    public WebElement save;
    //    个性特征
    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.GridView[1]/android.widget.RelativeLayout[1]")
//    @CacheLookup
    public WebElement property;
    //    兴趣爱好
    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.GridView[2]/android.widget.RelativeLayout[2]")
//    @CacheLookup
    public WebElement hobby;
    //   籍贯
    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]")
//    @CacheLookup
    public WebElement nativeplace;
    //    学历
    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]")
//    @CacheLookup
    public WebElement education;
    //    职业
    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]")
//    @CacheLookup
    public WebElement job;
    //   收入
    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]")
//    @CacheLookup
    public WebElement income;
    //    魅力部位
    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[5]")
//    @CacheLookup
    public WebElement part;
    //    婚姻
    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[6]")
//    @CacheLookup
    public WebElement maritalstatus;
    //    住房情况
    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[7]")
//    @CacheLookup
    public WebElement house;
    //    异地恋
    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[8]")
//    @CacheLookup
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
    public WebElement child;*/
//    //    异性
//    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[8]")
////    @CacheLookup
//    public WebElement oppositesex;
//    //    亲密行为
//    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[9]")
////    @CacheLookup
//    public WebElement qinmi;
//    //    父母
//    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[10]")
////    @CacheLookup
//    public WebElement parent;
//    //    小孩
//    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[11]")
////    @CacheLookup
//    public WebElement child;


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
    //    推荐购买中的 服务组合
    @FindBy(xpath = "//android.view.View[@content-desc=\"开通90天自动续费写信服务+800语音豆\"]")

    @CacheLookup
    public WebElement service1;
    //    推荐购买中的 价格组合及优惠
    @FindBy(xpath = "//android.view.View[@content-desc=\"优惠价99+69元(赠您200话费)\"]")
    @CacheLookup
    public WebElement price1;
    //    第二次支付引导中 不聊
    @FindBy(xpath = "//android.view.View[@content-desc=\"不聊\"]")
    @CacheLookup
    public WebElement buliao;
    //    第二次引导中 付费组合
    @FindBy(xpath = "//android.view.View[@content-desc=\"90天自动续费写信包月+800语音豆\"]")
    @CacheLookup
    public WebElement service2;
    //    第二次引导中 付费价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"优惠价99+69元（赠您200话费）\"]")
    @CacheLookup
    public WebElement price2;








    //    实名拦截
//    实名拦截提示
    @FindBy(id="com.huizheng.lasq:id/phone_auth_text1")
//    @CacheLookup
    public WebElement phoneauth;

    // #   空间页 切换 按钮
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
    @FindBy(xpath = "//android.view.View/android.widget.ListView[1]/android.view.View[1]/android.view.View[1]")
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
/*
    //   支付按钮
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"同意协议并开通\"]")
    @CacheLookup
    public WebElement agree;*/
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
  /*  公共
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
   public WebElement alipayback;*/
   /*公共
    //    支付宝支付提示
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"确认开通并支付\"]")
    @CacheLookup
    public WebElement alisure;*/
    //    支付宝支付提示
    @FindBy(name = "请选择付款方式")
    @CacheLookup
    public WebElement alisure1;

    //    支付宝支付提示
    @FindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.TextView")
//    @CacheLookup
    public WebElement aliFuKuan;

    //  3线  注册引导 附近
    @FindBy(xpath = "//android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]")
    @CacheLookup
    public WebElement near1;


    //    附近模块元素
//    进入附近模块后，显示的用户头像

    @FindBy(xpath="//android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]")
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


}
