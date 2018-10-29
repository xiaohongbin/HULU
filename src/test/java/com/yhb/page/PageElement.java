package com.yhb.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PageElement {

    //    注册页面
    //    注册按钮或确定按钮
    @FindBy(id = "com.youyuan.yhb:id/btn_register")
    @CacheLookup
    public WebElement btn_register;

    //    登陆按钮
    @FindBy(id = "com.youyuan.yhb:id/btn_login")
    @CacheLookup
    public WebElement btn_login;

    //    注册点击男用户头像
    @FindBy(id = "com.youyuan.yhb:id/btn_men")
    @CacheLookup
    public WebElement btn_men;
    //    注册点击女用户头像
    @FindBy(id = "com.youyuan.yhb:id/btn_women")
    @CacheLookup
    public WebElement btn_women;

    //    设置登录密码
    @FindBy(id = "com.youyuan.yhb:id/id_edittext_phone")
    @CacheLookup
    public WebElement id_edittext_phone;

    //    确定按钮
    @FindBy(id = "com.youyuan.yhb:id/btn_ok")
    @CacheLookup
    public WebElement btn_ok;

    //    本地照片上传
    @FindBy(id = "com.youyuan.yhb:id/upload_user_icon_localhost_images")
    @CacheLookup
    public WebElement upload_user_icon_localhost_images;


    //    拍照
    @FindBy(id = "com.youyuan.yhb:id/upload_user_icon_take_photos")
    @CacheLookup
    public WebElement upload_user_icon_take_photos;

    //    快门
    @FindBy(id = "com.android.camera:id/camera_shutter_middle_button")
    @CacheLookup
    public WebElement camera_shutter_middle_button;


    //    拍照后对号
    @FindBy(id = "com.android.camera:id/save_btn")
    @CacheLookup
    public WebElement save_btn;



    //    确定照片和跳过按钮
    @FindBy(id = "com.youyuan.yhb:id/btn_right")
    public WebElement btn_right;
    //  下一步
    @FindBy(id = "com.youyuan.yhb:id/next_step")
    @CacheLookup
    public WebElement next_step;

    //  注册后录音
    @FindBy(id = "com.youyuan.yhb:id/id_iv_voice_icon")
    @CacheLookup
    public WebElement id_iv_voice_icon;

    //注册成功的校验
    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView[1]")
    @CacheLookup
    public WebElement loginSuccess;

    //注册后点击”知道了“
    @FindBy(id = "com.youyuan.yhb:id/btn_i_know")
    @CacheLookup
    public WebElement btn_i_know;



    // 返回
    @FindBy(id = "com.youyuan.yhb:id/btn_left")
    @CacheLookup
    public WebElement btn_left;

    //    男用户注册成功标识
    //    （约会信息title或约会问答（1/5））
    @FindBy(id = "com.youyuan.yhb:id/title_name")
    public WebElement title_name;

    //注册后发送约会邀请
    @FindBy(id = "com.youyuan.yhb:id/say_hello_layout")
    @CacheLookup
    public WebElement say_hello_layout;


    //开启约会管家
    @FindBy(id = "com.youyuan.yhb:id/msg_manager_ok")
    @CacheLookup
    public WebElement msg_manager_ok;

    // 我的
    @FindBy(id = "com.youyuan.yhb:id/top_me")
    @CacheLookup
    public  WebElement top_me;

    // 登陆-账号
    @FindBy(id = "com.youyuan.yhb:id/input_account")
    @CacheLookup
    public  WebElement input_account;


    // 登陆-密码
    @FindBy(id = "com.youyuan.yhb:id/input_password")
    @CacheLookup
    public  WebElement input_password;




 //   ---- 注册后约会问答

    //    第一个问题答案
    @FindBy(xpath = "//android.widget.ListView/android.widget.RelativeLayout[2]")
    public WebElement askInfo;

    //注册手机号认证弹框-取消
    @FindBy(id = "com.youyuan.yhb:id/btn_pv_dialog_yuanfen_1")
    public WebElement btn_pv_dialog_yuanfen_1;

    //注册手机号认证弹框-马上认证
    @FindBy(id = "com.youyuan.yhb:id/btn_pv_dialog_yuanfen_2")
    public WebElement btn_pv_dialog_yuanfen_2;

//   ---- 注册后完善约会信息

//    基本资料tab
    @FindBy(xpath = "//android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/" +
            "android.widget.LinearLayout[1]/android.widget.TextView[1]")
    public WebElement basic_information_text;

    //    基本资料比例
    @FindBy(xpath = "//android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/" +
            "android.widget.LinearLayout[1]/android.widget.TextView[2]")
    public WebElement basic_information_percent;

//    个性爱好tab
    @FindBy(xpath = "//android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/" +
            "android.widget.LinearLayout[2]/android.widget.TextView[1]")

    public WebElement specific_character_text;

    //    个性爱好比例
    @FindBy(xpath = "//android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/" +
            "android.widget.LinearLayout[2]/android.widget.TextView[2]")
    public WebElement specific_character_percent;


    //    详细信息tab
    @FindBy(xpath = "//android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/" +
            "android.widget.LinearLayout[3]/android.widget.TextView[1]")
    public WebElement detail_information_text;

    //    详细信息比例
    @FindBy(xpath = "//android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/" +
            "android.widget.LinearLayout[3]/android.widget.TextView[2]")
    public WebElement detail_information_percent;


    //昵称
    @FindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/" +
            "android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView[2]")
    @CacheLookup
    public WebElement name;

    //修改昵称
    @FindBy(id = "com.youyuan.yhb:id/et_input_dialog_content")
    @CacheLookup
    public WebElement editName;

    //   确定
    @FindBy(id = "com.youyuan.yhb:id/btn_ok")
    @CacheLookup
    public WebElement btnOk;

    //    生日
    @FindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/" +
            "android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView[2]")
    @CacheLookup
    public WebElement birthday;


    //    年龄
    @FindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/" +
            "android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView[2]")
    @CacheLookup
    public WebElement age;
    //    星座
    @FindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/" +
            "android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.TextView[2]")
    @CacheLookup
    public WebElement constellation;

    //   居住地
    @FindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/" +
            "android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.RelativeLayout/android.widget.TextView[2]")
    @CacheLookup
    public WebElement domicile;
    // 身高
    @FindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/" +
            "android.widget.LinearLayout/android.widget.LinearLayout[6]/android.widget.RelativeLayout/android.widget.TextView[2]")
    @CacheLookup
    public WebElement high;
    //体重
    @FindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/" +
            "android.widget.LinearLayout/android.widget.LinearLayout[7]/android.widget.RelativeLayout/android.widget.TextView[2]")
    @CacheLookup
    public WebElement weight;


    //   血型
    @FindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/" +
            "android.widget.LinearLayout/android.widget.LinearLayout[8]/android.widget.RelativeLayout/android.widget.TextView[2]")
    @CacheLookup
    public WebElement blood_type;


    // 下一步保存基本资料
    @FindBy(id = "com.youyuan.yhb:id/save")
    @CacheLookup
    public WebElement save;

    //   选中个性特征
    @FindBy(name = "感性")
    @CacheLookup
    public WebElement specific;

    //    选中兴趣爱好
    @FindBy(name = "宠物")
    @CacheLookup
    public WebElement hobbies;

    // 修改详细信息
    @FindBy(id = "com.youyuan.yhb:id/info_content")
    public List<WebElement> info_content;


    //   左上角我的
    @FindBy(id = "com.youyuan.yhb:id/top_me_layout")
    @CacheLookup
    public WebElement top_me_layout;

//    约会吧上方title
    @FindBy(id="com.youyuan.yhb:id/top_bar")
    @CacheLookup
    public WebElement top_bar;


    //    约会信息-九宫格
    @FindBy(id = "com.youyuan.yhb:id/body_item_9")
    @CacheLookup
    public WebElement body_item_9;

    //    我的匹配问答 回答的问题列表
    @FindBy(id = "com.huizheng.lasq:id/matching_qa_q_ico")
    @CacheLookup
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

//-----------------首页
    //    首页用户主页描述，居住地策略
    @FindBy(id = "com.youyuan.yhb:id/member_monologue")
    public WebElement member_monologue;

    //    首页用户主页描述，居住地
    @FindBy(id = "com.youyuan.yhb:id/member_area")
    public WebElement member_area;


    //    首页用户主页描述，昵称
    @FindBy(id = "com.youyuan.yhb:id/user_name")
    public WebElement user_name;

    //    首页用户主页，不喜欢
    @FindBy(id = "com.youyuan.yhb:id/next_button")
    @CacheLookup
    public WebElement next_button;

    //    首页用户主页，喜欢
    @FindBy(id = "com.youyuan.yhb:id/ask_button")
    @CacheLookup
    public WebElement ask_button;


//-------------------消息

    //    点击右上角的消息按钮
    @FindBy(id = "com.youyuan.yhb:id/top_message_layout")
    @CacheLookup
    public WebElement top_message_layout;


    //    右上角的消息按钮旁的红色未读消息数
    @FindBy(id = "com.youyuan.yhb:id/img_look")
    public WebElement img_look;


    //    消息页面，私信tab旁未读消息
    @FindBy(xpath = "//android.widget.HorizontalScrollView/android.widget.LinearLayout" +
            "/android.widget.FrameLayout[2]/android.widget.TextView[2]")
    public WebElement img_look2;


    //    私信tab的管理员头像，进入消息详情页面
    @FindBy(id = "com.youyuan.yhb:id/user_icon")
    public WebElement user_icon;



    //    消息页面完善资料入口
    @FindBy(id = "com.youyuan.yhb:id/ad_image_view")
    public WebElement ad_image_view;


    //    消息页面下方猜你感兴趣列表-约TA按钮
    @FindBy(id = "com.youyuan.yhb:id/sayhello")
    public List<WebElement> sayhello;


//---------------我的-诚信等级
    @FindBy(id = "com.youyuan.yhb:id/body_item_2")
    public WebElement body_item_2;
    //快捷身份认证
    @FindBy(id = "com.youyuan.yhb:id/identity_auth_button")
    public WebElement identity_auth_button;
    //手机认证
    @FindBy(id = "com.youyuan.yhb:id/phone_auth_button")
    public WebElement phone_auth_button;
    //上传本人3张照片
    @FindBy(id = "com.youyuan.yhb:id/upload_photo_button")
    public WebElement upload_photo_button;
    //资料完善到达90%
    @FindBy(id = "com.youyuan.yhb:id/information_button")
    public WebElement information_button;

    //快捷身份认证-完善资料
    @FindBy(id = "com.youyuan.yhb:id/setting_identity_auth_information_layout")
    public WebElement setting_identity_auth_information_layout;
    //快捷身份认证-上传头像
    @FindBy(id = "com.youyuan.yhb:id/setting_identity_auth_upload_user_icon_layout")
    public WebElement setting_identity_auth_upload_user_icon_layout;
    //快捷身份认证-验证手机号
    @FindBy(id = "com.youyuan.yhb:id/setting_identity_auth_check_phone_number_layout")
    public WebElement setting_identity_auth_check_phone_number_layout;

    //快捷身份认证-上传头像-选择第一张图片
    @FindBy(id = "com.youyuan.yhb:id/id_item_image")
    public List<WebElement> id_item_image;

    //我的相册
    @FindBy(id = "com.youyuan.yhb:id/body_item_4")
    public WebElement body_item_4;

    //我的相册-添加照片
    @FindBy(id = "com.youyuan.yhb:id/image_view_check")
    public List<WebElement> image_view_check;

    //我的相册-添加照片-选择第一张照片
    @FindBy(id = "com.youyuan.yhb:id/id_item_select")
    public List<WebElement> id_item_select;

    //我的相册-添加照片-选择第一张照片-正在上传
    @FindBy(id = "com.youyuan.yhb:id/loading_message")
    public WebElement loading_message;

    //约会要求
    @FindBy(id = "com.youyuan.yhb:id/body_item_1")
    public WebElement body_item_1;

    //约会要求-所在地
    @FindBy(id = "com.youyuan.yhb:id/myspace_location_view")
    public WebElement myspace_location_view;
    //约会要求-年龄
    @FindBy(id = "com.youyuan.yhb:id/myspace_he_age_view")
    public WebElement myspace_he_age_view;
    //约会要求-身高
    @FindBy(id = "com.youyuan.yhb:id/myspace_info_height_view")
    public WebElement myspace_info_height_view;

    //约会要求-学历
    @FindBy(id = "com.youyuan.yhb:id/myspace_he_education_view")
    public WebElement myspace_he_education_view;

    //自我介绍
    @FindBy(id = "com.youyuan.yhb:id/body_item_5")
    public WebElement body_item_5;

    //语音未录制
    @FindBy(id = "com.youyuan.yhb:id/introduce_myself_hint")
    public WebElement introduce_myself_hint;

    //自我介绍-按住语音-提交
    @FindBy(id = "com.youyuan.yhb:id/id_bt_voice_commit")
    public WebElement id_bt_voice_commit;

    //问答游戏
    @FindBy(id = "com.youyuan.yhb:id/body_item_3")
    @CacheLookup
    public WebElement body_item_3;

    //问答游戏-答题获得缘分
    @FindBy(id = "com.youyuan.yhb:id/matching_qa_none_btn")
    @CacheLookup
    public WebElement matching_qa_none_btn;

    //问答游戏-问题标题
    @FindBy(id = "com.youyuan.yhb:id/quesdtion_title")
    public WebElement quesdtion_title;

    //问答游戏-答题获得缘分-答案
    @FindBy(id = "com.youyuan.yhb:id/setting_item_name")
    @CacheLookup
    public List<WebElement> setting_item_name;

    //问答游戏-答题获得缘分-提交答案
    @FindBy(id = "com.youyuan.yhb:id/qa_send_question_id")
    @CacheLookup
    public WebElement qa_send_question_id;

    //问答游戏-答题获得缘分-换一题
    @FindBy(id = "com.youyuan.yhb:id/qa_change_question_id")
    @CacheLookup
    public WebElement qa_change_question_id;

    //问答游戏-判断问题的答案被选中-对号
    @FindBy(xpath = "//android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.LinearLayout/" +
            "android.widget.RelativeLayout[3]/android.widget.ImageView")
    public WebElement duihao;

    //问答游戏-判断问题的答案被选中-对号对应的答案
    @FindBy(xpath = "//android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.LinearLayout/" +
            "android.widget.RelativeLayout[3]/android.widget.TextView")
    public WebElement answer;

    //----------会员中心
    @FindBy(id = "com.youyuan.yhb:id/body_item_8")
    @CacheLookup
    public WebElement body_item_8;

    //刷新页面
    @FindBy(id = "com.youyuan.yhb:id/btn_right")
    @CacheLookup
    public WebElement reload;

//    豆币
    @FindBy(id = "com.youyuan.yhb:id/member_center_bean_layout")
    @CacheLookup
    public WebElement bean;

    //    支付宝退出某计划
    @FindBy(id = "com.alipay.mobile.antui:id/cancel")
    @CacheLookup
    public WebElement cancel;

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

    //    写信包月
    @FindBy(id = "com.youyuan.yhb:id/member_write_letters_layout")
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
    //    90天会员价格
    @FindBy(xpath = "\t//android.view.View[@content-desc=\"共￥109\"]")
    @CacheLookup
    public WebElement letter90price;
    //    30天会员
    @FindBy(xpath = "//android.view.View[@content-desc=\"30天无限畅聊\"]")
    @CacheLookup
    public WebElement letter30;
    //    30天会员价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"共￥89\"]")
    @CacheLookup
    public WebElement letter30price;
    //    7天会员
    @FindBy(xpath = "//android.view.View[@content-desc=\"7天无限畅聊\"]")
    @CacheLookup
    public WebElement letter7;
    //    7天会员价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"共￥69\"]")
    @CacheLookup
    public WebElement letter7price;

    //    星级服务VIP
    @FindBy(id = "com.youyuan.yhb:id/member_center_vip_layout")
    @CacheLookup
    public WebElement vip;
    //    星级服务详情
    //    vip90天
    @FindBy(xpath = "//android.view.View[@content-desc=\"VIP会员 90天 ￥100\"]")
    @CacheLookup
    public WebElement vip90;
    //    vip30天
    @FindBy(xpath = "//android.view.View[@content-desc=\"VIP会员 30天 ￥50\"]")
    @CacheLookup
    public WebElement vip30;

   /* //    收信宝-以废掉
    @FindBy(id = "com.youyuan.yhb:id/member_center_receive_letters_layout")
    @CacheLookup
    public WebElement receive_letter;
    //    收信宝上传头像
    @FindBy(xpath = "//android.view.View[@content-desc=\"点此上传头像\"]")
    @CacheLookup
    public WebElement uploadpic;

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
    public WebElement day15;*/
    //  咪咕
    @FindBy(id = "com.youyuan.yhb:id/iv")
    @CacheLookup
    public WebElement migu;
    //    订购咪咕约会吧VIP会员
    @FindBy(xpath = "//android.view.View[@content-desc=\"订购咪咕约会吧VIP会员\"]")
//    @CacheLookup
    public WebElement dinggou;
    //进入咪咕游戏联合会员专区
    @FindBy(xpath = "//android.view.View[@content-desc=\"进入咪咕游戏联合会员专区\"]")
    public WebElement zhuanqu;

    //    立即开通
    @FindBy(xpath = "//android.view.View[@content-desc=\"立即开通\"]")
//    @CacheLookup
    public WebElement kaitong;

    //    支付方式
//  手机支付
    @FindBy(xpath = "//android.view.View[@content-desc=\"包月费用：￥30.00\"]")
    @CacheLookup
    public WebElement baoyue;

    @FindBy(xpath = "//android.view.View[@content-desc=\"沙盒：进化\"]")
    @CacheLookup
    public WebElement game;

    //    设置页面
//    设置页面
    @FindBy(id = "com.youyuan.yhb:id/body_item_6")
    @CacheLookup
    public WebElement set;

    //    设置页面-用户信息
    @FindBy(id = "com.youyuan.yhb:id/setting_item_name")
    @CacheLookup
    public WebElement userinfo;

    //    用户信息页面 登录账号
    @FindBy(id = "com.youyuan.yhb:id/setting_userinfo_username")
    @CacheLookup
    public WebElement userinfo_username;

    //    修改密码按钮
    @FindBy(id = "com.youyuan.yhb:id/modify_button")
    @CacheLookup
    public WebElement modify_button;

    //    密码框
    @FindBy(id = "com.youyuan.yhb:id/account_manage_confirm_password")
    @CacheLookup
    public WebElement password;

    //    保存
    @FindBy(id = "com.youyuan.yhb:id/account_manage_btn_submit")
    @CacheLookup
    public WebElement btn_submit;
    //    登陆页面登录账号
    @FindBy(id = "com.youyuan.yhb:id/input_account")
    @CacheLookup
    public WebElement inputAccount;

    //    登陆页面登录密码
    @FindBy(id = "com.youyuan.yhb:id/input_password")
    @CacheLookup
    public WebElement inputPassword;


    //女用户-信箱-缘分小助手-问题类型
    @FindBy(id = "com.youyuan.yhb:id/QA_type_select_tv")
    public WebElement QA_type_select_tv;
    //女用户-信箱-缘分小助手-问题类型列表
    @FindBy(id = "com.youyuan.yhb:id/textview")
        public List<WebElement> QA;
    //女用户-信箱-缘分小助手-问题1
    @FindBy(id = "com.youyuan.yhb:id/QA_content_select_tv")
//    @CacheLookup
    public WebElement QA_content_select_tv;
    //女用户-信箱-缘分小助手-问题2
    @FindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/" +
            "android.widget.LinearLayout[3]/android.widget.TextView[2]")
//    @CacheLookup
    public WebElement QA2_content_select_tv;
    //女用户-信箱-缘分小助手-开启
    @FindBy(id = "com.youyuan.yhb:id/ok")
//    @CacheLookup
    public WebElement ok;
    //男用户登陆后每日推荐-约TA
    @FindBy(id = "com.youyuan.yhb:id/yue_ta_2")
//    @CacheLookup
    public WebElement yue_ta_2;

    //男用户登陆后每日推荐-约TA-右侧用户得昵称
    @FindBy(id = "com.youyuan.yhb:id/right_name")
    //    @CacheLookup
    public WebElement right_name;


}
