package com.hulu.page;

import com.hulu.check.publicCheck;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * 存放11个底包中公共页面元素
 */
public class PageElements{

    /**华为手机授权
     *
     */

    //启动手机授权
    @FindBy(id = "android:id/alertTitle")
    @CacheLookup
    public WebElement alertTitle;

    //启动手机允许
    @FindBy(id = "com.huawei.systemmanager:id/btn_allow")
    @CacheLookup
    public WebElement btn_allow;


    //  通用
//    注册页面 左上角 回退，退回至选择登录页面
    @FindBy(id = "com.huizheng.lasq:id/btn_login")
    @CacheLookup
    public WebElement btn_back;

    //    上方加载信息
    @FindBy(id = "com.huizheng.lasq:id/header_content")
    @CacheLookup
    public WebElement header_content;

    //    1线下方N个模块
    @FindBy(className = "android.widget.RadioButton")
    @CacheLookup
    public List<WebElement> mokuai;

    //    左上角返回
    @FindBy(id = "com.huizheng.lasq:id/btn_left")
    @CacheLookup
    public WebElement btn_left;
    //    模块title
    @FindBy(id = "com.huizheng.lasq:id/id_topview")
    @CacheLookup
    public WebElement topview;
    //上方邮件提示
    @FindBy(id = "com.huizheng.lasq:id/head_menu_icon")
    @CacheLookup
    public WebElement head_menu_icon;
    //    上方私信关闭
    @FindBy(id = "com.huizheng.lasq:id/msg_close")
    @CacheLookup
    public WebElement msg_close;
    //    取消按钮
    @FindBy(id = "com.huizheng.lasq:id/btn_cancel")
    @CacheLookup
    public WebElement btn_cancel;
    //    确认
    @FindBy(id = "com.huizheng.lasq:id/btn_ok")
//    @CacheLookup
    public WebElement btn_ok;
    //    页面上方title
    @FindBy(id = "com.huizheng.lasq:id/title_name")
    @CacheLookup
    public WebElement title_name;

    //注册后发送约会邀请
    @FindBy(id = "com.huizheng.lasq:id/say_hello_layout")
    @CacheLookup
    public WebElement say_hello_layout;

    //开启约会管家
    @FindBy(id = "com.huizheng.lasq:id/msg_manager_ok")
    @CacheLookup
    public WebElement msg_manager_ok;

    //    环境修改
//    地址修改
    @FindBy(id = "com.huizheng.lasq:id/tv_test_address")
    @CacheLookup
    protected WebElement address;
    //    服务端环境
    @FindBy(id = "com.huizheng.lasq:id/rv_test_env")
    @CacheLookup
    public WebElement test_env;
    //    product环境
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.TextView[1]")
    @CacheLookup
    public WebElement product;
    //    huluprep
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.TextView[2]")
    @CacheLookup
    public WebElement huluprep;
    //    渠道号
    @FindBy(id = "com.huizheng.lasq:id/et_test_fid")
    @CacheLookup
    public WebElement qudao;
    //    保存
    @FindBy(id = "com.huizheng.lasq:id/btn_test_save")
    @CacheLookup
    public WebElement btn_test_save;

    //    注册页面
    // #   一键注册
    @FindBy(id = "com.huizheng.lasq:id/btn_register")
    @CacheLookup
    public WebElement btn_register;

//    一键注册
    @FindBy(id = "com.huizheng.lasq:id/login_regist_button")
    @CacheLookup
    public WebElement btn_reg;
    //    我是男
    @FindBy(id = "com.huizheng.lasq:id/btn_men")
    @CacheLookup
    public WebElement btn_men;
    //        女
    @FindBy(id = "com.huizheng.lasq:id/btn_women")
    @CacheLookup
    public WebElement btn_women;
    //  #  1线男 注册后第一个提示，上传照片
    @FindBy(id = "com.huizheng.lasq:id/upload_user_icon_image")
    @CacheLookup
    public WebElement upload_user_icon_image;

    //    直接登录
    @FindBy(id = "com.huizheng.lasq:id/btn_login")
    @CacheLookup
    public WebElement login;


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

    //    设置登录密码
    @FindBy(id = "com.huizheng.lasq:id/id_edittext_phone")
    @CacheLookup
    public WebElement id_edittext_phone;
    //   使用协议
    @FindBy(id="com.huizheng.lasq:id/btn_protocal")
    @CacheLookup
    public WebElement btn_protocol;

    //    女用户提示注册成功提示
    @FindBy(id = "com.huizheng.lasq:id/btn_i_know")
    @CacheLookup
    public WebElement btn_i_know;

    //    三线男用户注册进入基本资料页面，身高
    @FindBy(id = "com.huizheng.lasq:id/rv_reg_dialog_height")
    @CacheLookup
    public WebElement rv_reg_dialog_height;

    //三线男,注册页合理化
    @FindBy(id="com.huizheng.lasq:id/btn_reg_dialog_reg")
    @CacheLookup
    public WebElement btn_reg_dialog_reg;
    //注册引导，缘分页超级曝光页
    @FindBy(id="com.huizheng.lasq:id/iv_speed_top")
    @CacheLookup
    public WebElement speed_top;
    @FindBy(id="com.huizheng.lasq:id/speed_dialog_title")
    @CacheLookup
    public WebElement speed_dialog_title;//免费获得×10倍加速推荐，快来领!
    @FindBy(id="com.huizheng.lasq:id/iv_speed_item_image")
    @CacheLookup
    public List<WebElement> speed_item_image;//头像列表
    @FindBy(id="com.huizheng.lasq:id/btn_speed")
    @CacheLookup
    public WebElement btn_speed;//立即领取

    //    拍照
    @FindBy(id = "com.huizheng.lasq:id/upload_user_icon_take_photos")
    @CacheLookup
    public WebElement upload_user_icon_take_photos;

    //    快门
    @FindBy(id = "com.android.camera:id/camera_shutter_middle_button")
    @CacheLookup
    public WebElement camera_shutter_middle_button;
    //    华为快门
    @FindBy(id = "com.huawei.camera:id/shutter_button")
    @CacheLookup
    public WebElement shutter_button;


    //    拍照后对号
    @FindBy(id = "com.android.camera:id/save_btn")
    @CacheLookup
    public WebElement save_btn;

    //    华为拍照后对号
    @FindBy(id = "com.huawei.camera:id/btn_done")
    @CacheLookup
    public WebElement btn_done;

    //  下一步
    @FindBy(id = "com.huizheng.lasq:id/next_step")
    @CacheLookup
    public WebElement next_step;

    //注册成功的校验
    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView[1]")
    @CacheLookup
    public WebElement loginSuccess;
    //  注册后打招呼头像取消选中
    @FindBy(id = "com.huizheng.lasq:id/image_icon")
    @CacheLookup
    public List<WebElement> image_icon;



    //    每日推荐-喜欢左侧女孩
    @FindBy(id="com.huizheng.lasq:id/left_love_image")
    @CacheLookup
    public WebElement left_love_image;

    //    每日推荐-喜欢右侧女孩
    @FindBy(id="com.huizheng.lasq:id/right_love_image")
    @CacheLookup
    public WebElement right_love_image;


    // 我的
    @FindBy(id = "com.huizheng.lasq:id/top_me")
    @CacheLookup
    public  WebElement top_me;

    //   ---- 注册后约会问答

    //    第一个问题答案
    @FindBy(xpath = "//android.widget.ListView/android.widget.RelativeLayout[2]")
    public WebElement askInfo;



    /**
     * 緣分頁面
     */

    //  #  缘分语音页关注
    @FindBy(id = "com.huizheng.lasq:id/tv_attention")
    @CacheLookup
    public List<WebElement> tv_attention;

    /**
     * 瑞福缘动
     */
    //    热聊模块
    @FindBy(xpath = "//android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]")
    @CacheLookup
    public WebElement reliao;
    //    遇见模块
    @FindBy(xpath = "//android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]")
    @CacheLookup
    public WebElement yujian;
    //    附近模块
    @FindBy(xpath = "//android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]")
    @CacheLookup
    public WebElement fujin;
    //    主页模块
    @FindBy(xpath = "//android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[4]")
    @CacheLookup
    public WebElement zhuye;
    //    私信模块
    @FindBy(xpath = "//android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[5]")
    @CacheLookup
    public WebElement sixin;



    //   左上角我的
    @FindBy(id = "com.huizheng.lasq:id/top_me_layout")
    @CacheLookup
    public WebElement top_me_layout;


    /**
     * 我的完善资料页面元素
     *
     */

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
    public WebElement child;

    /**
     * 约会吧会员中心
     */


    //----------会员中心
    @FindBy(id = "com.huizheng.lasq:id/body_item_8")
    @CacheLookup
    public WebElement body_item_8;

    /**
     * 会员中心
     */
    //    会员中心按钮
    @FindBy(id = "com.huizheng.lasq:id/left_member_center")
    @CacheLookup
    public WebElement member_center;

    /**
     * 支付宝页面元素
     */

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

    //    支付成功页面 ,安全提示，完成

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[3]/android.widget.TextView[2]")
    @CacheLookup
    public WebElement alianquantips;
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"完成\"]")
    @CacheLookup
    public WebElement wancheng;
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

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"同意协议并开通\"]")
    @CacheLookup
    public WebElement alisurexieyi;
    //支付宝支付输入密码页面标题
    @FindBy(id = "com.alipay.android.phone.mobilecommon.verifyidentity:id/paypwd_title")
    @CacheLookup
    public WebElement alipaypwd_title;
    //支付宝H5支付弹窗
    //立即付款
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[3]/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TextView")
    @CacheLookup
    public WebElement h5_alipay;
    //关闭
    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"退出\"]/android.widget.ImageView")
    @CacheLookup
    public WebElement h5_close;


    //    支付宝退出某计划
    @FindBy(id = "com.alipay.mobile.antui:id/cancel")
    @CacheLookup
    public WebElement cancel;

    /**
     * 会员中心页面
      */

    //  # 瑞福缘动 会员中心按钮
    @FindBy(id = "com.huizheng.lasq:id/body_item_member")
    @CacheLookup
    public WebElement body_item_member;


//    豆币
    @FindBy(id = "com.huizheng.lasq:id/member_center_bean_title")
    @CacheLookup
    public WebElement bean;
    //    右上角刷新
    @FindBy(id = "com.huizheng.lasq:id/btn_right")
    public WebElement btn_right;
    //    豆币详情
//    3天VIP 0元购
    @FindBy(xpath = "//android.view.View[@content-desc=\"0元3天\"]")
    public WebElement bean_vip;
    /* 瑞福缘动//    3天VIP 0元购
    @FindBy(xpath = "//android.view.View[@content-desc=\"3天VIP 0元购 限时\"]")
    @CacheLookup
    public WebElement bean_vip;*/
    //    1线 800语音豆
    @FindBy(xpath = "//android.view.View[@content-desc=\"0.1元/豆\"]")
    @CacheLookup
    public WebElement bean800;
    ///    3线 800语音豆
    @FindBy(xpath = "//android.view.View[@content-desc=\"800语音豆 开通再送208豆\"]")
    @CacheLookup
    public WebElement bean800_3;
    //    1线 800语音豆价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"共￥99\"]")
    @CacheLookup
    public WebElement bean800price;
    //    3线 800语音豆价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"￥99/月\"]")
    @CacheLookup
    public WebElement bean800price_3;
    //    1线 550语音豆
    @FindBy(xpath = "//android.view.View[@content-desc=\"0.16元/豆\"]")
    @CacheLookup
    public WebElement bean550;
    //    3线 550语音豆
    @FindBy(xpath = "//android.view.View[@content-desc=\"550语音豆\"]")
    @CacheLookup
    public WebElement bean550_3;
    //    1线 550语音豆价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"共￥89\"]")
    @CacheLookup
    public WebElement bean550price;
    //    3线 550语音豆价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"￥89/月\"]")
    @CacheLookup
    public WebElement bean550price_3;


    //    自动续费
    @FindBy(xpath = "//android.view.View[@content-desc=\"自动续费再减10元\"]")
//    @CacheLookup
    public WebElement xufei;
    @FindBy(xpath = "//android.view.View[@content-desc=\"立减10元\"]")
    public WebElement lijian;

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


    //    写信包月
    @FindBy(id = "com.huizheng.lasq:id/write_letters_title")
    @CacheLookup
    public WebElement write_letters;
    //    写信包月详情
//    3天VIP 0元购
    @FindBy(xpath = "//android.view.View[@content-desc=\"0元3天\"]")
    @CacheLookup
    public WebElement letter_vip;
    //    90天会员
    @FindBy(xpath = "//android.view.View[@content-desc=\"1.2元/天\"]")
    @CacheLookup
    public WebElement letter90;

    //   3线 90天会员
    @FindBy(xpath = "//android.view.View[@content-desc=\"90天畅聊会员 超值\"]")
    @CacheLookup
    public WebElement letter90_3;
    //    90天会员价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"共￥109\"]")
    @CacheLookup
    public WebElement letter90price;
    //    3线 90天会员价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"￥109\"]")
    @CacheLookup
    public WebElement letter90price_3;
    //    30天会员
    @FindBy(xpath = "//android.view.View[@content-desc=\"2.9元/天\"]")
    @CacheLookup
    public WebElement letter30;
    //    3线 30天会员
    @FindBy(xpath = "//android.view.View[@content-desc=\"30天畅聊会员\"]")
    @CacheLookup
    public WebElement letter30_3;
    //    30天会员价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"共￥89\"]")
    @CacheLookup
    public WebElement letter30price;
    //    3线 30天会员价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"￥89\"]")
    @CacheLookup
    public WebElement letter30price_3;
    //    7天会员
    @FindBy(xpath = "//android.view.View[@content-desc=\"9.8元/天\"]")
    @CacheLookup
    public WebElement letter7;
    //    3线 7天会员
    @FindBy(xpath = "//android.view.View[@content-desc=\"7天畅聊会员\"]")
    @CacheLookup
    public WebElement letter7_3;
    //    7天会员价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"共￥69\"]")
    @CacheLookup
    public WebElement letter7price;
    //    3线 7天会员价格
    @FindBy(xpath = "//android.view.View[@content-desc=\"￥69\"]")
    @CacheLookup
    public WebElement letter7price_3;
    //    90优惠价额
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

    //    星级服务
    @FindBy(id = "com.huizheng.lasq:id/member_center_vip_title")
    @CacheLookup
    public WebElement vip_title;
    //    星级服务详情
//    vip新手
    @FindBy(xpath = "//android.view.View[@content-desc=\"签约领取VIP新手礼包\"]")
    @CacheLookup
    public WebElement newvip;
    //    vip90天
    @FindBy(xpath = "//android.view.View[@content-desc=\"连续包季VIP会员 ￥100\"]")
    @CacheLookup
    public WebElement vip90;

    //    vip30天
    @FindBy(xpath = "//android.view.View[@content-desc=\"连续包月VIP会员 ￥50\"]")
    @CacheLookup
    public WebElement vip30;

    //    vip90天
    @FindBy(xpath = "//android.view.View[@content-desc=\"90天VIP会员 ￥100\"]")
    @CacheLookup
    public WebElement vip90shuanghao;
    //    vip30天
    @FindBy(xpath = "//android.view.View[@content-desc=\"30天VIP会员 ￥50\"]")
    @CacheLookup
    public WebElement vip30shuanghao;

    //    vip90天
    @FindBy(xpath = "//android.view.View[@content-desc=\"VIP会员 90天 ￥100\"]")
    @CacheLookup
    public WebElement vip90danhao;
    //    vip30天
    @FindBy(xpath = "//android.view.View[@content-desc=\"VIP会员 30天 ￥50\"]")
    @CacheLookup
    public WebElement vip30danhao;
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
    public WebElement yuanjia_vip30;
    //    立即开通
    @FindBy(xpath = "//android.view.View[@content-desc=\"立即开通\"]")
//    @CacheLookup
    public WebElement kaitong;

    //    支付宝支付提示
    @FindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.TextView")
//    @CacheLookup
    public WebElement aliFuKuan;

    //    支付宝支付退出
    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"退出\"]")
    @CacheLookup
    public WebElement quit;

    //    支付方式
//  微信支付
    @FindBy(xpath = "//android.view.View[@content-desc=\"微信支付\"]")
    @CacheLookup
    public WebElement wecharpay;

    //  微信左上角返回
    @FindBy(id = "com.tencent.mm:id/kb")
    @CacheLookup
    public WebElement wechatBack;

    //  银联支付
    @FindBy(xpath = "//android.view.View[@content-desc=\"银联支付\"]")
    @CacheLookup
    public WebElement yinlianpay;
    /**
     * 收信宝+上传头像
     */
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
    @FindBy(xpath = "//android.widget.ListView[@content-desc=\"本地相册\"]/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.ImageView")
    @CacheLookup
    public WebElement img;


    //   拍照上传
    @FindBy(id = "com.huizheng.lasq:id/take_picture")
    @CacheLookup
    public WebElement take_picture;

    // 本地相册
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

    //    收信宝银联快捷支付
    @FindBy(xpath = "//android.view.View[@content-desc=\"银联快捷支付\"]")
    @CacheLookup
    public WebElement yinlianshortcutpay;



    //以上为收信宝和咪咕

}
