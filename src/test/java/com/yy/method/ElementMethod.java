package com.yy.method;

import com.aventstack.extentreports.ExtentTest;
import com.listener.ExtentTestNGITestListener;
import com.yy.page.PageElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Random;

public class ElementMethod extends PageElement {
    ExtentTestNGITestListener el = new ExtentTestNGITestListener();
    ExtentTest log = el.getlog();


    //    修改环境方法
//    修改测试环境方法
/*  公共
//    修改渠道号
    public void updateQuDao(String qudaonum) {
        log.info("修改渠道号");
        qudao.click();
        qudao.clear();
        qudao.sendKeys(qudaonum);
    }
*/

   /* 公共

   //  #  展开 注册地址一项
    public void clickAddress() {
        log.info("展开注册地址一项");
        address.click();
    }
*/
  /*公共
    //   #   滑动选择所在地址
    public void swipeAddress(AndroidDriver driver) {
        log.info("滑动修改城市");
        Duration duration = Duration.ofSeconds(1);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action1 = new TouchAction(driver).press(280, 850).waitAction(duration).moveTo(280, 1090).release();
        action1.perform();
    }*/

    //    点击 对对碰（用于点击右下角 对对碰）
    public void clickduiduipeng(AndroidDriver driver) {
        log.info("点击 对对碰");
        TouchAction action = new TouchAction(driver);
//        int width = driver.manage().window().getSize().width;
//        int height=driver.manage().window().getSize().height;
        action.tap(920, 1430).perform();
    }
    public String getToken(){
        log.info("获取令牌数");
        return token_txt.getText();
    }
/*
公共
    public String getAddress() {
        log.info("获取修改后的城市");
        return address.getText();
    }
*/

    //    展开测试环境一项
    public void clickTestEnv() {
        log.info("展开测试环境一项");
        test_env.click();
    }

    //    选择线上环境
    public void clickProduct() {
        log.info("选择线上环境");
        product.click();
    }

    //      选择预上线环境
    public void clickHuluprep() {
        log.info("选择预上线环境");
        huluprep.click();
    }

/*公共
    public void clickBtnSave() {
        log.info("点击修改测试环境上 保存");
        btn_test_save.click();
    }*/
/*
    public void sendAccount(String account) {
        log.info("输入用户名");
        input_account.click();
        input_account.clear();
        input_account.sendKeys(account);
    }

    public void sendPassword(String password) {
        log.info("输入密码");
        input_password.click();
        input_password.clear();
        input_password.sendKeys(password);
    }

    public void clickBtnLogin() {
        log.info("点击登录按钮");
        btn_login.click();
    }*/
    public  void btnManReg3(){
        log.info("三线男用户注册，进入基本资料页面点击立即注册按钮");
        btn_reg_dialog_reg.click();
    }


    //    通用
  /*  公共
  //   #点击左上角 返回
    public void clickBtnLeft() {
        log.info("点击左上角 返回");
        btn_left.click();
    }
    // #  超级曝光立即领取
    public void clickBtnSpeed() {
        log.info("点击超级曝光“立即领取”按钮");
        btn_speed.click();
    }
*/
    public void clickTvBack() {
        log.info("点击注册页面 左上角返回");
        tv_back.click();
    }

  /*移到公共包
    public void clickLogin() {
        log.info("点击 登录");
        btn_dialog_login.click();
    }
*/
    public String getTopView() {
        log.info("获取上方模块名称");
        return topview.getText();
    }
/* 公共
    public void clickMsgClose() {
        log.info("点击上方私信关闭按钮");
        msg_close.click();
    }

    public String getTitleName() {
        log.info("获取上方页面名称");
        return title_name.getText();
    }*/

    //  #  下方三个模块切换
    public void clickYuanFenIcon() {
        log.info("点击“缘分”");
        mokuai.get(0).click();
    }

    public void clickMailBoxIcon() {
        log.info("点击“聊天”");
        mokuai.get(1).click();
    }

    public void clickMeIcon() {
        log.info("点击“我的”");
        mokuai.get(2).click();
    }

    //    注册页面方法
/* 公共
//    点击一键注册
    public void clickRegister() {
        log.info("点击立即注册");
        btn_reg.click();
    }
*/

   /*公共
   public void clickLoginRegister() {
        log.info("点击 去注册");
        login_regist_button.click();
    }

    public void clickMen() {
        log.info("点击 我是男");
        btn_men.click();
    }*/

    public void clickWomen() {
        log.info("点击“我是女”");
        btn_women.click();
    }

    public void clickIKnown() {
        log.info("点击 知道了");
        btn_i_know.click();
    }

   /* 公共
   public void clickProtocal() {
        log.info("点击“协议”");
        btn_protocal.click();
    }
    public void clickLeftLoveImage() {
        log.info("点击左侧“喜欢Ta”");
        left_love_image.click();
    }
    public void clickRightLoveImage() {
        log.info("点击右侧“喜欢Ta”");
        right_love_image.click();
    }
*/
    //    附近模块
    public void clickNearPeople() {
        log.info("点击 附近");
        nearpeople.click();
    }
    //    附近模块
    public void clickWomenNearPeople() {
        log.info("点击 附近-身边人");
        womennearpeople.click();
    }


    public String getNearNickName() {
        log.info("获取附近人姓名");
        return nearnickname.get(0).getText();
    }

    public void clickHello(int i) {
        log.info("点击第" + (i + 1) + "个用户打招呼");
        hello_btn.get(i).click();
    }
    public void clickNearHeadPhoto() {
        log.info("点击 附近人 头像");
        nearheadphoto.get(0).click();
    }

    public void clickFilter1() {
        log.info("点击缘分-筛选");
        filter1.click();
    }
    public void clickFilterAddress() {
        log.info("点击缘分-筛选所在地");
        search_condition_area.click();
    }
    public void clickDown() throws Exception {
        log.info("点击下翻");
        down.click();
        down.click();
    }

    public String getFilterAddressText() {
        log.info("获取缘分-筛选已选的所在地");
        return search_condition_area.getText();
    }

    public void clickFilterHeight() {
        log.info("点击缘分-筛选身高");
        search_condition_height.click();
    }
    public void clickFilterAge() {
        log.info("点击缘分-筛选年龄");
        search_condition_age.click();
    }
    public void clickFilterSave() {
        log.info("点击缘分-筛选保存");
        search_fragment_condition_save_btn.click();
    }



    //    缘分模块方法
    //   # 一线点击用户头像
    public void clickIVUser() {
        log.info("点击用户头像");
        iv_card_user_img.click();
    }

    //  #  三线点击左上角用户头像
    public void clickIVUser3() {
        log.info("点击左上角第一个用户头像");
        iv_user.get(0).click();
    }

    public String getTVNickName() {
        log.info("获取缘分上的用户名");
        return tv_card_user_name.getText();
    }

    public String getTVCardAddress() {
        log.info("获取缘分上的用户地址");
        return tv_card_address.getText();
    }

    public String getTVCardHeight() {
        log.info("获取缘分上的用户身高");
        return tv_card_height.getText();
    }

    public String getTVCardAge() {
        log.info("获取缘分上的用户年龄");
        return tv_card_age.getText();
    }

    public String getTVNickName3() {
        log.info("获取缘分-语音上的第一个用户名");
        return user_name_list.get(0).getText();
    }


    public void clickTVSayHello() {
        log.info("点击缘分页上打招呼按钮");
        tv_card_sayhello.click();
    }

    public String clickTVSayHelloText() {
        log.info("点击缘分页上打招呼按钮文案");
        return tv_card_sayhello.getText();
    }

    public void clickTVCardAttention() {
        log.info("点击缘分页上关注按钮");
        tv_card_attention.click();
    }
    public String clickTVCardAttentionText() {
        log.info("点击缘分页上关注按钮文案");
        return tv_card_attention.getText();
    }
    public void clickTVVoice() {
        log.info("点击缘分页-语音tab上语音按钮");
        tv_voice.get(0).click();
    }

    public void clickTVAttention() {
        log.info("点击缘分页-语音tab上关注按钮");
        tv_attention.get(0).click();
    }


    //    空间页方法
    //  #  获取空间中用户名
    public String getUserNameText() {
        log.info("获取空间中用户名");
        return user_name_text.getText();
    }

    public void clickMoreBtn() {
        log.info("点击“更多详细资料”");
        more_button.click();
    }

    public void clickAskBtn() {
        log.info("点击空间中“打招呼”按钮");
        ask_button.click();
    }

    public void clickOnlineStatus() {
        log.info("点击空间页中开通会员");
        online_status.click();
    }

    public void clickLeftBtn() {
        log.info("点击空间左上角返回");
        left_btn.click();
    }

    public void clickRightTop() {
        log.info("点击空间右上角展开");
        right_top.click();
    }

    public String getAttentionText() {
        log.info("获取关注一项 文本："+attention_button.getText());
        return attention_button.getText();
    }

    public void clickAttentionBtn() {
        log.info("点击“关注”");
        attention_button.click();
    }

    public String getNotread() {
        log.info("获取 拉黑 信息");
        return notread.getText();
    }

    public void clickNotread() {
        log.info("点击“拉黑”");
        notread.click();
    }

    public void clickBtnCancle() {
        log.info("点击“取消”");
        btn_cancel.click();
    }

  /*  公共
    public void clickBtnok() {
//        log.info("点击“确定”");
        btn_ok.click();
    }*/

    public String getUpgraded() {
        log.info("获取 举报 信息");
        return upgraded.getText();
    }

    public void clickUpgraded() {
        log.info("点击“举报”");
        upgraded.click();
    }

    public void clickOther() {
        log.info("点击 举报中“其他”");
        other.click();
    }

    public void clickSure() {
        log.info("点击“确定/返回”");
        sure.click();
    }

    public String getMemberInfoText() {
        log.info("获取用户基本资料");
        return memberinfotext.getText();
    }

    //  点击空间页中  查看视频 按钮
    public void clickVideoView() {
        log.info("点击查看视频");
        video_view.click();
    }
/*
 公共
    public void clickCancle() {
        log.info("点击取消按钮");
        btn_cancel.click();
    }
*/

    public String getPicCount() {
        log.info("获取照片数量");
        return piccount.getText();
    }
    public int getPictureCount() {
        log.info("获取照片数量");
        return picturecount.size();
    }
    public void lookSecendPic() {
        log.info("获取照片数量");
        picturecount.get(1).click();
    }


    public void swipePic(AndroidDriver driver) throws Exception {
        log.info("查看第二张照片");
        Duration duration = Duration.ofSeconds(1);
        TouchAction action1 = new TouchAction(driver);
//        .longPress(700, 650).waitAction(duration).moveTo(50, 650).perform();
//        TouchAction(driver).longPress(700, 650).waitAction(duration).moveTo(50, 650).perform();
        action1.longPress(1000, 650, duration).moveTo(50, 650);
        action1.release();
        action1.perform();
    }

    public void clickZonePic() {
        log.info("点击空间中照片");
        image_view.click();
    }


    //    信箱方法
//
    public void clickOK() {
        log.info("点击开启缘分小助手");
        ok.click();
    }

    public void clickPersonalData() {
        log.info("点击完善资料");
        personal_data.click();
    }

    /*公共
    //完善资料
    protected void personalData(AndroidDriver driver) throws Exception {
        log.info("完善个人资料");
        this.clickHeight();
        this.clickBtnok();
        this.clickWeight();
        this.clickBtnok();
        this.swipeToUp(driver);
        this.clickBloodType();
        this.clickBtnok();
        this.clickSave();
        Thread.sleep(1000);
        this.clickProperty();
//        this.swipeToUp(driver);
        this.clickHobby();
        this.clickSave();
        Thread.sleep(1000);
        this.clickNativePlace();
        this.clickBtnok();
        this.clickEducation();
        this.clickBtnok();
        this.clickJob();
        this.clickBtnok();
        this.clickIncome();
        this.clickBtnok();
        this.clickPart();
        this.clickBtnok();
        this.clickMaritalStatus();
        this.clickBtnok();
        this.clickHouse();
        this.clickBtnok();
        this.clickYidilian();
        this.clickBtnok();
        this.swipeToUp(driver);
        Thread.sleep(500);
        this.clickOppositeSex();
        this.clickBtnok();
        this.clickQinmi();
        this.clickBtnok();
        this.clickParent();
        this.clickBtnok();
        this.clickChild();
        this.clickBtnok();
        this.clickSave();

    }*/

    public int getLetterNum() {
        log.info("获取 私信 未读条数");
        return Integer.parseInt(letter_num.getText());
    }

    public int getMailboxNum() {
        log.info("获取 信箱 未读条数");
        return Integer.parseInt(mailbox_num.getText());
    }

    public void clickLook() {
        log.info("点击“立即查看”");
        img_look.get(0).click();
    }

    //      回复并索要联系方式
    public void clickReplyAsk() {
        log.info("点击 回复并索要联系方式");
        reply_ask.click();
    }
    //      回复并索要联系方式,点击跳过按钮
    public void clickTvVerifJump() {
        log.info("点击 回复并索要联系方式，进入sp手机验证页面，点击跳过按钮");
        tv_verif_jump.click();
    }


    //    信箱 信件中 用户头像
    public void clickMessageImage() {
        log.info("点击 私信中用户头像");
        message_member_image.click();
    }

  /*  公共
  //    我的模块 方法
    public void clickMemberCenter() {
        log.info("点击会员中心");
        member_center.click();
    }
*/
    public void clickConversationPerson() {
        log.info("点击 我关注的人");
        conversationperson.click();
    }

    public int getConversationPersonNum() {
        log.info("获取我关注的人 数量");
        return Integer.parseInt(conversationpersonnum.getText());
    }

    public String getConversationPersonName() {
        log.info("获取我关注的人姓名");
        return user_nickname.getText();
    }

    //    诚信等级相关
    public void clickIntegrityLevel() {
        log.info("点击诚信等级");
        integrityLevel.click();
    }
    //    诚信等级相关-快捷身份认证
    public void clickIdentityAuthButton() {
        log.info("点击诚信等级相关-快捷身份认证");
        identity_auth_button.click();
    }
    //    诚信等级相关-手机认证
    public void clickPhoneAuthButton() {
        log.info("点击诚信等级相关-手机认证");
        phone_auth_button.click();
    }
    //    诚信等级相关-上传本人3张照片
    public void clickUploadPhotoButton() {
        log.info("点击诚信等级相关-上传本人3张照片");
        upload_photo_button.click();
    }
    //    诚信等级相关-资料完善到达90%
    public void clickInformationButton() {
        log.info("点击诚信等级相关-资料完善到达90%");
        information_button.click();
    }
    //    诚信等级相关-快捷身份认证-完善资料
    public void settingIdentityAuthInformationLayout() {
        log.info("点击快捷身份认证-完善资料");
        setting_identity_auth_information_layout.click();
    }

    //    诚信等级相关-快捷身份认证-上传头像
    public void settingIdentityAuthUploadUserIconLayout() {
        log.info("点击快捷身份认证-上传头像");
        setting_identity_auth_upload_user_icon_layout.click();
    }
    //    诚信等级相关-快捷身份认证-验证手机号
    public void settingIdentityAuthCheckPhoneNumberLayout() {
        log.info("点击快捷身份认证-验证手机号");
        setting_identity_auth_check_phone_number_layout.click();
    }
    //    诚信等级相关-快捷身份认证-上传头像-拍照
    public void takePicture() {
        log.info("点击快捷身份认证-上传头像");
        take_picture.click();
    }
    //    诚信等级相关-快捷身份认证-上传头像-快门
    public void clickShutterButton() {
        shutter_button.click();
    }
    //    诚信等级相关-快捷身份认证-上传头像-对勾
    public void clickBtnDone() {
        btn_done.click();
    }
    //    我的照片
    public void clickMyPicture() {
        log.info("点击我的照片");
        body_item_bottle_text.click();
    }

    //    我的照片-上传照片
    public void clickBtnUploadPic() {
        log.info("点击我的照片");
        btn_upload_pic.click();
    }

    //    匹配问答相关
    public void clickMyQuestion() {
        log.info("点击匹配问答");
        myquestion.click();
    }

    //    匹配问答相关
    public void clickMyQuestion3() {
        log.info("点击匹配问答");
        myquestion_3.click();
    }

    public void clickAnswerQuetion() {
        log.info("点击去答题");
        matching_qa_none_btn.click();
    }

    public void clickAnswerQuestion() {
        log.info("点击上方去答题");
        matching_qa_go.click();
    }

    public void clickQuestionView() {
        log.info("选择第一个答案");
        question_view.get(0).click();
    }
   /* public String clickQuestionName() {
        log.info("选择第一个答案");
        return setting_item_name.get(0).getText();
    }
*/

    public void clickSendQuestion() {
        log.info("点击提交答案");
        send_question.click();
    }

    public void clickTextMatching() {
        log.info("点击查看我的匹配答案");
        id_textview_matching.click();
    }

    public void clickQuestionNum() {
        log.info("点击我的匹配问答数量");
        questionnum.click();
    }

    public int getQuestionNum() {
        log.info("获取我的匹配问答数量");
        return Integer.parseInt(questionnum.getText());
    }

    public void clickSetting() {
        log.info("点击“设置”");
        setting.click();
    }

    public void clickIntroduction() {
        log.info("点击 自我介绍");
        self_introduction.click();
    }

    public void clickUserInfo() {
        log.info("点击“用户信息");
        userinfo.click();
    }

    public String getUserInfoUserName() {
        log.info("获取登录账号");
        return userinfo_username.getText();
    }

    public void clickMyTag() {
        log.info("点击我的标签");
        mytag.click();
    }

    public void clickAttentionPeople() {
        log.info("点击关注的人");
        conversationpersonnum.click();
    }

    public void matchClick(AndroidDriver driver) {
        log.info("点击匹配问答");
        TouchAction action1 = new TouchAction(driver).press(130, 1380).release();
        action1.perform();
    }

    public void clickMemberInfo() {
        log.info("点击个人资料");
        myquestion_3.click();
    }
/*  公共

    //    完善个人资料方法
//    完善资料方法
    public void clickHeight() {
        height.click();
    }

    public void clickWeight() {
        weight.click();
    }

    public void clickBloodType() {
        bloodtype.click();
    }

    public void clickInfoSave() {
        save.click();
    }

    public void clickProperty() {
        log.info("点击个性特征");
        property.click();
    }

    public void clickHobby() {
        log.info("点击兴趣爱好");
        hobby.click();
    }

    public void clickNativePlace() {
        log.info("点击籍贯");
        nativeplace.click();
    }

    public void clickEducation() {
        education.click();
    }

    public void clickJob() {
        job.click();
    }

    public void clickIncome() {
        income.click();
    }

    public void clickPart() {
        part.click();
    }

    public void clickMaritalStatus() {
        maritalstatus.click();
    }

    public void clickHouse() {
        house.click();
    }

    public void clickYidilian() {
        yidilian.click();
    }

    public void clickOppositeSex() {
        oppositesex.click();
    }

    public void clickQinmi() {
        qinmi.click();
    }

    public void clickParent() {
        parent.click();
    }

    public void clickChild() {
        child.click();
    }

    public void clickSave() {
        log.info("点击保存");
        save.click();
    }
*/


    //    征友条件
    //  #  征友條件相關方法
    public void clickMyCondition() {
        log.info("点击征友条件");
        body_item_1.click();
    }

    //    征友条件页面方法
    public String getLocalView() {
        log.info("获取征友地区信息");
        return location_view.getText();
    }

    public void clickLocalView() {
        log.info("点击征友地区");
        location_view.click();
    }

    public String getAgeView() {
        log.info("获取征友年龄信息");
        return age_view.getText();
    }

    public void clickAgeView() {
        log.info("点击征友年龄");
        age_view.click();
    }

    public String getHeightView() {
        log.info("获取征友身高信息");
        return height_view.getText();
    }

    public void clickHeightView() {
        log.info("点击征友身高");
        height_view.click();
    }

    //    搜索模块
    public void clickDown(AndroidDriver driver) throws Exception {
        log.info("点击下翻");
        selectDown(driver,260);
        selectDown(driver,450);
        selectDown(driver,450);
    }

    public void clickHeightDown() throws Exception {
        log.info("点击下翻");
        for (int i = 0; i < 15; i++) {
            down.click();
        }
    }

    public void longPressRecord(AndroidDriver driver) {
        log.info("录制语音介绍");
        Duration duration = Duration.ofSeconds(7);
        TouchAction action = new TouchAction(driver);
        action.longPress(520, 1230, duration).perform();
//        元素longpress有问题
//        action.longPress(transcribe_record_button,duration).perform();
    }

    public void clickMyvisitor() {
        log.info("点击 最近访客");
        myvisitor.click();
    }

/*  公共

    //    会员中心方法
    public void clickBean() {
        log.info("点击豆币");
        bean.click();
    }


    public void clickBeanVip() {
        log.info("点击vip0元购");
        bean_vip.click();
    }

    public int getBeanNum() {
        log.info("获取初始豆币个数");
        String b = bean.getText().replace("豆币", "").replace("个", "");
        return Integer.parseInt(b);
    }


    public void clickWriteLetter() {
        log.info("点击写信包月");
        write_letters.click();
    }


    public void clickVipTitle() {
        log.info("点击星级服务");
        vip_title.click();
    }
*/
    public void clickReceiveLetter() {
        log.info("点击收信宝");
        receive_letter.click();
    }
/*公共
    public void clickReload() {
        log.info("点击右上角刷新");
        btn_right.click();
    }

    public void clickXufei() {
        log.info("点击自动续费");
        xufei.click();
    }

    public void clickBean800() {
        log.info("点击800语音豆");
        bean800.click();
    }

    public String getBean800Price() {
        log.info("获取800语音豆价格");
        return bean800price.getAttribute("name");
    }

    public void clickBean550() {
        log.info("点击550语音豆");
        bean550.click();
    }


    public String getBean550Price() {
        log.info("获取550语音豆价格");
        return bean550price.getAttribute("name");
    }

    public String getBean800Price_3() {
        log.info("获取800语音豆价格");
        return bean800price_3.getAttribute("name");
    }

    public String getBean550Price_3() {
        log.info("获取550语音豆价格");
        return bean550price_3.getAttribute("name");
    }

    public void clickBean800_3() {
        log.info("点击800语音豆");
        bean800_3.click();
    }

    public void clickBean550_3() {
        log.info("点击550语音豆");
        bean550_3.click();
    }

    public void clickLetterVip() {
        log.info("点击3天vip0元购");
        letter_vip.click();
    }

    public void clickLetter90() {
        log.info("点击90天会员");
        letter90.click();
    }
*/

    public void clickLetter90_3() {
        log.info("点击90天会员");
        letter90_3.click();
    }
/*
公共
    public String getLetter90Price() {
        log.info("获取90天会员价格");
        return letter90price.getAttribute("name");
    }

    public String getLetter90Price_3() {
        log.info("获取90天会员价格");
        return letter90price_3.getAttribute("name");
    }

     public void clickLetter30() {
        log.info("点击30天会员");
        letter30.click();
    }

    public void clickLetter30_3() {
        log.info("点击30天会员");
        letter30_3.click();
    }

    public String getLetter30Price() {
        log.info("获取30天会员价格");
        return letter30price.getAttribute("name");
    }
*/

    public String getLetter30Price_3() {
        log.info("获取30天会员价格");
        return letter30price_3.getAttribute("name");
    }

    public void clickLetter7() {
        log.info("点击7天会员");
        letter7.click();
    }

    public void clickLetter7_3() {
        log.info("点击7天会员");
        letter7_3.click();
    }
/*
公共
    public String getLetter7Price() {
        log.info("获取7天会员价格");
        return letter7price.getAttribute("name");
    }
*/

    public String getLetter7Price_3() {
        log.info("获取7天会员价格");
        return letter7price_3.getAttribute("name");
    }
/* 公共
    public void clickNewVip(){
        log.info("点击vip新手");
        newvip.click();
    }

    public void clickVip90() {
        log.info("点击90天vip");
        vip90.click();
    }

    public String getVip90price() {
        log.info("获取90天vip价格");
        return vip90.getAttribute("name");

    }*/
/*
公共
    public void clickVip30() {
        log.info("点击30天vip");
        vip30.click();
    }

    public String getVip30price() {
        log.info("获取30天vip价格");
        return vip30.getAttribute("name");

    }
*/

    public String fukuan() {
//        支付宝确认付款
        return aliFuKuan.getText();
    }

    public void clickUploadPic() {
        log.info("点击上传头像");
        uploadpic.click();
    }

    public void clickLocalPic() {
        log.info("选择本地照片");
        localpicture.click();
    }

    public void clickImg() {
        log.info("选择一个相册");
        img.click();
    }

    public void clickMonitorPic(AndroidDriver driver) {
        log.info("选择一张照片");
        TouchAction action = new TouchAction(driver);
        int width = driver.manage().window().getSize().width;
        action.tap(200, 400).perform();
    }

    public void clickImgOK() {
        log.info("选中照片");
        imgok.click();
    }

    public void swipeToDownPIC(AndroidDriver driver) {
        log.info("随机滑动照片");
        Duration duration = Duration.ofSeconds(1);
        Random rand = new Random();
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action1 = new TouchAction(driver).press(width / 2, height / 4).waitAction(duration).moveTo(width / 2, rand.nextInt(1080) + 1).release();
        action1.perform();
    }

    public void clickImgSure() {
        log.info("确认照片");
        imgsure.click();
    }

    public void clickDay1() {
        log.info("点击1天");
        day1.click();
    }

    public void clickDay3() {
        log.info("点击3天");
        day3.click();
    }

    public void clickDay7() {
        log.info("点击7天");
        day7.click();
    }

    public void clickDay15() {
        log.info("点击15天");
        day15.click();
    }

    public String getDay1Price() {
        log.info("获取1天价格");
        return day1.getAttribute("name");
    }

    public String getDay3Price() {
        log.info("获取3天价格");
        return day3.getAttribute("name");
    }

    public String getDay7Price() {
        log.info("获取7天价格");
        return day7.getAttribute("name");
    }

    public String getDay15Price() {
        log.info("获取15天价格");
        return day15.getAttribute("name");
    }

    //
    public void clickMonitorPay(AndroidDriver driver) {
        log.info("点击立即付款");
        TouchAction action = new TouchAction(driver);
        action.tap(490, 1670).perform();
    }
/*
公共
    public void clickKaiTong() {
        log.info("点击立即开通");
        kaitong.click();
    }
*/

    public void clickMigu() {
        log.info("点击咪咕联合会员");
        migu.click();
    }

/*公共
    // #   支付方式
    public void clickWecharPay() {
        log.info("选择 微信支付");
        wecharpay.click();
    }*/
    // #  微信支付-确认
    public void clickConfirm() {
        confirm.click();
    }

/*公共
    public void clickYinlianPay() {
        log.info("选择 银联支付");
        yinlianpay.click();
    }*/

//    public void clickAgree() {
//        agree.click();
//    }
//
//    public void clickEnsure() {
////        支付宝确认放弃支付
//        ensure.click();
//    }
//
//    public void clickAlipayBack() {
//        log.info("点击支付宝付款页面 回退");
//        alipayback.click();
//    }

    //手机物理方法
    public void clickMonitor1(AndroidDriver driver) {
        log.info("点击 右下角空白处（用于处理 进入空间时，消去覆盖的提示）");
        TouchAction action = new TouchAction(driver);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        action.tap(width - 1, height - 1).perform();
    }

    public void swipeToDown(AndroidDriver driver) {
        log.info("向下滑动屏幕");
        Duration duration = Duration.ofSeconds(1);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action1 = new TouchAction(driver).press(width / 2, height / 4).waitAction(duration).moveTo(width / 2, height * 3 / 4).release();
        action1.perform();
    }

   /*公共
   public void swipeToUp(AndroidDriver driver) {
        log.info("向上滑动屏幕");
        Duration duration = Duration.ofSeconds(1);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action1 = new TouchAction(driver).press(width / 2, height*3/4).waitAction(duration).moveTo(width / 2, height/4).release();
        action1.perform();
    }*/

    //年龄或身高筛选框
    public void  selectDown(AndroidDriver driver, int width) {
        log.info("向上滑动屏幕");
        Duration duration = Duration.ofSeconds(1);
//        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action1 = new TouchAction(driver).press(width, 750).waitAction(duration).moveTo(width, 570).release();
        action1.perform();
    }


    public void swipeToLeft(AndroidDriver driver) {
        log.info("向左下角滑动屏幕");
        Duration duration = Duration.ofSeconds(1);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action1 = new TouchAction(driver).press(width * 3/ 4, height / 4).waitAction(duration).moveTo(width / 4, height * 3/ 4).release();
        action1.perform();
    }


    public void swipeToMyTag(AndroidDriver driver) {
        log.info("滑动至“我的标签”");
        Duration duration = Duration.ofSeconds(1);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
//        System.out.println(width);
//        System.out.println(height);
        TouchAction action1 = new TouchAction(driver).press(500, 1400).waitAction(duration).moveTo(500, 600).release();
        action1.perform();
    }


   /*  公共
    //    #    点击页面空白处（用于进入修改环境）
    public void clickMonitor(AndroidDriver driver) {
        log.info("点击页面空白处（用于进入修改环境）");
        TouchAction action = new TouchAction(driver);
        int width = driver.manage().window().getSize().width;
        action.tap(width - 10, 150).perform();
        action.tap(width - 10, 150).perform();
        action.tap(width - 10, 150).perform();
       // action.tap(width - 10, 150).perform();
    }

    //    发送密码
    public void sendKeyA(AndroidDriver driver,int x,int y) {
        TouchAction action = new TouchAction(driver);
//        int width = driver.manage().window().getSize().width;
//        int height=driver.manage().window().getSize().height;
        action.tap(x, y).perform();
    }
*/
//    public void clickBack() {
//        back.click();
//    }

    public void clickCheck() {
        log.info("查询免密开通情况");
        check.click();
    }

    public void clickQianWang() {
        log.info("点击前往");
        qianwang.click();
    }

    public void clickBuYao() {
        log.info("点击不要");
        buyao.click();
    }

    public void clickBuLiao() {
        log.info("点击不聊");
        buliao.click();
    }

    public String getOKText() {
        log.info("获取按钮变化后的内容");
        return btn_ok.getText();
    }

    //    设置--安全指南
    public void clickSecurity() {
        log.info("点击 安全指南");
        set.get(1).click();
    }

    public void clickJiuTuo(){
        log.info("点击 酒托");
        jiutuo.click();
    }
    public String getJiuTuoHead(){
        log.info("获取内容标题");
        return jiutuohead.getAttribute("name");
    }

    //    设置--帮助
    public void clickHelp() {
        log.info("点击 帮助");
        set.get(2).click();
    }

    public void sendSearchKey(){
        log.info("输入帮助内容--退订");
        input_help.click();
        input_help.sendKeys("退订");
    }
    public void clickSearch(){
        log.info("点击 查找");
        search.click();
    }
    public void clickTuiDing(){
        log.info("点击 退订");
        tuiding.click();
    }
    public String getTuiDingHead(){
        log.info("获取内容标题");
        return tuidinghead.getAttribute("name");
    }
    //    设置--在线客服
    public void clickKeFu(){
        log.info("点击 在线客服");
        set.get(3).click();
    }
    public void clickQuestion1(){
        log.info("点击 第一个问题");
        question1.click();
    }
    public String getAnswer1(){
        log.info("获取 回答内容");
        return answer1.getAttribute("name");
    }

    //    自定义招呼
    public void clickCustomCall(){
        log.info("点击 自定义招呼");
        customcall.click();
    }

    public void sendCustomCall(String  customcall){
        log.info("输入自定义招呼");
        customcalledittext.click();
        customcalledittext.clear();
        customcalledittext.sendKeys(customcall);
    }

    public String getCustomCall(){
        log.info("获取自定义招呼内容");
        return customcalledittext.getText();
    }

    public void clickCustomCallSubmitButton(){
        log.info("点击提交");
        customcallsubmitbutton.click();
    }

    //    空间页 切换
    public void clickChangeButton(){
        log.info("点击 切换");
        changebutton.click();
    }
    //    获取 打招呼按钮 内容
    public String getAskButtonText(){
        log.info("获取 打招呼按钮 文本");
        return ask_button.getText();
    }
    //    关闭短信传情购买提示
    public void clickSMPayDialogClose(){
        log.info("关闭短信传情购买提示");
        smpaydialogclose.click();
    }

    //    领取收信宝礼包
    public void clickReceiverLetterTreasureBtn(){
        log.info("点击 领取收信宝礼包");
        receiver_letter_treasure_btn.click();
    }
    //    一线男 信箱中打招呼
    public void clickSayHello(){
        log.info("点击“打招呼”");
        sayhello.get(0).click();
    }

    //    切换用户
    public void clickChangeUser(){
        log.info("点击切换用户");
        changeuser.click();
    }

    public void clickAdmin(AndroidDriver driver){
        log.info("查看管理员私信");
        for(int i=0;i<user_name.size();i++){
            if(user_name.get(i).getText().equals("管理员")){
                user_name.get(i).click();
                break;
            }else{
                this.swipeToUp(driver);
            }
        }
    }

    //    获取 管理员 私信
    public String getMessageChatContent(){
        return message_chat_content.getText();
    }

    //    支付宝页面方法
//    支付宝关闭免密
    public void clickAliMianMi() {
        alimianmi.click();
    }
    //    确认开通并支付
    public void clickAgreePay(){
        agreepay.click();
    }
/*  公共
    public void clickAgree() {
        agree.click();
    }*/
    //    点击支付宝 立即付款
    public void clickAliPayNow(){
        log.info("点击支付宝 立即付款");
        alipaynow.click();
    }

    //    支付成功后，返回按钮
    public void clickAliBack(){
        aliback.click();
    }

    //    点击成功支付页面，右上角完成
    public void clickAliRight() {
        aliright.click();
    }

/*
公共
    public void clickEnsure() {
//        支付宝确认放弃支付
        ensure.click();
    }

    public void clickAlipayBack() {
        log.info("点击支付宝付款页面 回退");
        alipayback.click();
    }
*/

    public void clickBack() {
        back.click();
    }

    public String getOnlineStatus(){
        log.info("获取 空间页--在线状态 文本");
        return online_status.getText();
    }

    public String getMemberCenterVipExplain(){
        log.info("获取 会员中心--星级服务--到期日期");
        return membercentervipexplain.getText();
    }

    public String getDate(){
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.DATE,+30);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        String d=sdf.format(calendar.getTime());
        return d;
    }


    public void clickNear1(){
        log.info("点击 附近");
        near1.click();
    }

    public void clickDesc(){
        log.info("点击 附近，用户头像");
        desc.click();
    }

    public void clickNolike() {
        log.info("点击不喜欢");
        no_like_map.click();
    }

    public void clickLike() {
        log.info("点击喜欢");
        like_map.click();
    }
    public String getNearNickName3() {
        log.info("获取附近人姓名");
        return tv_name_map.getText();
    }
    public void clickHeadmap() {
        log.info("点击 弹出中的头像");
        head_map.click();
    }

    public String getRegisterDate() {
        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.DATE);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String d = sdf.format(calendar.getTime());
        return d;
    }

}
