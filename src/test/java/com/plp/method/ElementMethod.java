package com.plp.method;

import com.aventstack.extentreports.ExtentTest;
import com.plp.page.PageElement;
import com.listener.ExtentTestNGITestListener;
import io.appium.java_client.AppiumDriver;
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


    //    通用
//   点击左上角 返回
    public void clickBtnLeft() {
        log.info("点击左上角 返回");
        btn_left.click();
    }

    public String getTopView() {
        log.info("获取上方模块名称");
        return topview.getText();
    }

    public void clickMsgClose() {
        log.info("点击上方私信关闭按钮");
        msg_close.click();
    }

    public void clickMsgIcon() {
        log.info("点击上方私信条");
        head_menu_icon.click();
    }

    public String getTitleName() {
        log.info("获取上方页面名称");
        return title_name.getText();
    }

    //5.5.9新增页面元素方法
    public void clickLijireg(){
        log.info("合理化，注册页点击 立即注册");
        btn_reg_dialog_reg.click();
    }
    public void clickBtnSpeed(){
        log.info("合理化，双号，超级曝光页点击 立即领取");
        btn_speed.click();
    }

    //    下方五个模块切换
    public void clickYuanFenIcon() {
        log.info("点击“缘分”ICON");
        mokuai.get(0).click();
    }

    public void clickSearchIcon() {
        log.info("点击下方“搜索/推荐”ICON");
        mokuai.get(1).click();
    }

    public void clickMailBoxIcon() {
        log.info("点击“信箱”ICON");
        mokuai.get(2).click();
    }

    public void clickNearIcon() {
        log.info("点击“附近”");
        mokuai.get(3).click();
    }

    public void clickMeIcon() {
        log.info("点击“我的”");
        mokuai.get(4).click();
    }

    //    注册页面方法
//    点击一键注册
    public void clickRegister() {
        log.info("点击一键注册");
        btn_reg.click();
    }


    public void clickMen() {
        log.info("点击 我是男");
        btn_men.click();
    }

    public void clickWomen() {
        log.info("点击“我是女”");
        btn_women.click();
    }

    public void clickIKnown() {
        log.info("点击 知道了");
        btn_i_know.click();
    }

    public void clickLogin() {
        log.info("点击登录按钮");
        login.click();
    }

    public void clickZhaoHuGuanJia() {
        log.info("点击 注册提示中的 开启招呼管家");
        zhaohuguanjia.click();
    }

    public void clickProtocal() {
        log.info("点击“协议”");
        btn_protocal.click();
    }



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
    }

    //    修改测试环境方法
//    修改渠道号
    public void updateQuDao(String qudaonum) {
        log.info("修改渠道号");
        qudao.click();
        qudao.clear();
        qudao.sendKeys(qudaonum);
    }

    //    展开 注册地址一项
    public void clickAddress() {
        log.info("展开注册地址一项");
        address.click();
    }

    public String getAddress() {
        log.info("获取修改后的城市");
        return address.getText();
    }

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

    public void clickSave() {
        log.info("点击修改测试环境上 保存");
        btn_test_save.click();
    }


    //    缘分模块方法
//    点击左上角用户头像
    public void clickIVUser() {
        log.info("点击左上角第一个用户头像");
        iv_user.get(0).click();
    }

    public String getTVNickName() {
        log.info("获取缘分列表上的用户名");
        return tv_nickname.get(0).getText();
    }

    public void clickTVSayHello() {
        log.info("点击缘分页上第一个打招呼按钮");
        iv_sayhi.get(0).click();
    }

    //缘分页，三列头像。5.5.9需求
    public void clickIVAction() {
        log.info("5.5.9新需求，点击缘分页上第一个打招呼按钮");
        iv_action.get(0).click();
    }
    public String getTVAge(){
        log.info("5.5.9新需求,获取缘分页，第一个女用户头像上显示的年龄");
        return tv_age.get(0).getText();
    }



    //    空间页方法
//    获取空间中用户名
    public String getUserNameText() {
        log.info("获取空间中用户名");
        return user_name_text.getText();
    }

    public void clickMoreBtn() {
        log.info("点击更多资料");
        more_button.click();
    }
    public void clickWXLook(){
        log.info("点击 查看微信");
        wx_look.click();
    }
    public void clickQQLook(){
        log.info("点击 查看qq");
        qq_look.click();
    }

    //  点击空间页中  查看视频 按钮
    public void clickVideoView() {
        log.info("点击查看视频");
        video_view.click();
    }

    public void clickCancle() {
        log.info("点击取消按钮");
        btn_cancel.click();
    }

    public void clickAskBtn() {
        log.info("点击空间中“打招呼”按钮");
        ask_button.click();
    }

    public void clickNext() {
        log.info("点击 空间中 下一位按钮");
        next_button.click();
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

    public String getConversation() {
        log.info("获取关注一项 文本");
        return conversation.getText();
    }

    public void clickConversation() {
        log.info("点击“关注”");
        conversation.click();
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

    public void clickBtnok() {
        log.info("点击“确定”");
        btn_ok.click();
    }

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
        log.info("点击 举报中“确定举报/返回”");
        sure.click();
    }

    public String getMemberInfoText() {
        log.info("获取用户基本资料");
        return memberinfotext.getText();
    }

    public void clickBtnVideoChat() {
        log.info("点击语音聊天按钮");
        btn_video_chat.click();
    }

    public void clickChangLiaoHuiYuan() {
        log.info("点击畅聊会员");
        changliaohuiyuan.click();
    }
    public String getPicCount(){
        log.info("获取照片数量");
        return piccount.getText();
    }
    public void clickZonePic(){
        log.info("点击空间中照片");
        image_view.click();
    }


    //    搜索模块
    public void clickDown() throws Exception {
        log.info("点击下翻");
        down.click();
        down.click();
    }

    public void clickSearchBtn() {
        log.info("点击右上角 搜索");
        search_right_button.click();
    }

    public String getAreaText() {
        log.info("获取 所在地 条件");
        return area_text.getText();
    }

    public String getAgeText() {
        log.info("获取 年龄 条件");
        return age_text.getText();
    }

    public String getHeightText() {
        log.info("获取 身高 条件");
        return height_text.getText();
    }

    public void clickAreaText() {
        log.info("点击 所在地 条件");
        area_text.click();
    }

    public void clickAgeText() {
        log.info("点击 年龄 条件");
        age_text.click();
    }

    public void clickHeightText() {
        log.info("点击 身高 条件");
        height_text.click();
    }

    public void clickHeightDown() throws Exception {
        log.info("点击下翻");
        for (int i = 0; i < 15; i++) {
            down.click();
        }
    }

    public void clickSaveBtn() {
        log.info("点击“保存”");
        save_btn.click();
    }

    public void clickHello(int i) {
        log.info("点击第" + (i + 1) + "个用户打招呼");
        hello_btn.get(i).click();
    }

    public String getNickNmae(int i) {
        log.info("点击第" + (i + 1) + "个用户姓名");
        return search_list_item_user_nickname.get(i).getText();
    }

    public void clickPhoto(int i) {
        log.info("点击第" + (i + 1) + "个用户头像");
        search_list_item_user_headphoto.get(i).click();
    }

    public void clickTuijianList1() {
        log.info("点击第一个推荐用户头像");
        tuijianlist.get(0).click();
    }

    public void clickJump(){
        log.info("点击 手机验证 下方的跳过");
        jump.click();
    }



    //    信箱方法
//
    public void clickOK() {
        log.info("点击开启缘分小助手");
        ok.click();
    }

    //    信箱方法
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

    public void clickPersonalData() {
        log.info("点击完善资料");
        personal_data.click();
    }
    public void clickMessageImage(){
        log.info("点击 私信中用户头像");
        message_member_image.click();
    }
    public void clickReplyAsk(){
        log.info("点击 回复并索要联系方式");
        reply_ask.click();
    }

    //    附近 方法
//    附近模块
    public void clickImageView() {
        log.info("点击附近一人的头像");
        imageview.click();
    }
    public void clickNolike() {
        log.info("点击不喜欢");
        no_like_map.click();
    }

    public void clickLike() {
        log.info("点击喜欢");
        like_map.click();
    }

    public void clickNearPeople() {
        log.info("点击身边人");
        nearpeople.click();
    }

    public void clickNearHeadPhoto() {
        log.info("点击 附近人 头像");
        nearheadphoto.get(0).click();
    }
    public void clickHeadmap() {
        log.info("点击 弹出中的头像");
        head_map.click();
    }

    public String getNearNickName() {
        log.info("获取附近人姓名");
        return nearnickname.get(0).getText();
    }
    public String getNearNickName3() {
        log.info("获取附近人姓名");
        return tv_name_map.getText();
    }

    public String getNearAge() {
        log.info("获取附近人年龄");
        return nearage.get(0).getText();
    }

    //    我的模块 方法
    public void clickMemberCenter() {
        log.info("点击会员中心");
        member_center.click();
    }

    public void clickMyTag() {
        log.info("点击我的标签");
        mytag.click();
    }

    public void clickMatch() {
        log.info("点击匹配问答");
        match.click();
    }
    public void clickHeadView(){
        log.info("点击上传头像");
        head_view.click();
    }

    public void clickConversationPerson() {
        log.info("点击 我关注的人");
        conversationperson.click();
    }

    public int getConversationPersonNum() {
        log.info("获取我关注的人 数量");
        return Integer.parseInt(conversationpersonnum.getText());
    }

    public void clickSetting() {
        log.info("点击“设置”");
        setting.click();
    }

    public void clickUserInfo() {
        log.info("点击“用户信息");
        userinfo.click();
    }

    public String getUserInfoUserName() {
        log.info("获取登录账号");
        return userinfo_username.getText();
    }

    public String getConversationPersonName() {
        log.info("获取我关注的人姓名");
        return user_nickname.getText();
    }

    public void clickIntroduction() {
        log.info("点击 自我介绍");
        self_introduction.click();
    }

    public void longPressRecord(AndroidDriver driver){
        log.info("录制语音介绍");
        Duration duration = Duration.ofSeconds(7);
        TouchAction action = new TouchAction(driver);
        action.longPress(520,1230,duration).perform();
//        元素longpress有问题
//        action.longPress(transcribe_record_button,duration).perform();
    }

    public void clickMyvisitor() {
        log.info("点击 最近访客");
        myvisitor.click();
    }

    public void clickIntegrity() {
        log.info("点击 诚信等级");
        integrity.click();
    }

    public void clickIdentity() {
        log.info("点击 身份认证");
        identity.click();
    }

    public void clickPhone() {
        log.info("点击 手机认证");
        phone.click();
    }

    public void clickPhoto() {
        log.info("点击 上传照片");
        photo.click();
    }

    public void clickInformation() {
        log.info("点击 资料");
        information.click();
    }

    //    匹配问答相关
    public void clickMatchingQa() {
        log.info("点击匹配问答");
        matching_qa.click();
    }

    public void clickMyQuestion() {
        log.info("点击我的问答");
        myquestion.click();
    }

    public void clickAnswerQuetion() {
        log.info("点击去答题");
        matching_qa_none_btn.click();
    }
    public void clickAnswerQuestion(){
        log.info("点击上方去答题");
        matching_qa_go.click();
    }

    public void clickQuestionView() {
        log.info("选择第一个答案");
        question_view.click();
    }

    public void clickSendQuestion() {
        log.info("点击提交答案");
        send_question.click();
    }

    public void clickQuestionNum() {
        log.info("点击我的匹配问答数量");
        questionnum.click();
    }

    public int getQuestionNum() {
        log.info("获取我的匹配问答数量");
        return Integer.parseInt(questionnum.getText());
    }


    public void clickMemberInfo() {
        log.info("点击个人资料");
        memberinfo.click();
    }

    public void clickMiGuVip(){
        log.info("点击 咪咕约会吧vip");
        miguvip.click();
    }
    public void clickDingGouMiGu(){
        log.info("点击 订购咪咕");
        dinggoumiguvip.click();
    }

    //    征友條件相關方法
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
        property.click();
    }

    public void clickHobby() {
        hobby.click();
    }

    public void clickNativePlace() {
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


    //    会员中心方法

    public int getBeanNum() {
        log.info("获取豆币个数");
        String b = bean.getText().replace("豆币", "").replace("个", "");
        return Integer.parseInt(b);
    }

    public void clickBean() {
        log.info("点击豆币");
        bean.click();
    }


    public void clickWriteLetter() {
        log.info("点击写信包月");
        write_letters.click();
    }

    public void clickVipTitle() {
        log.info("点击星级服务");
        vip_title.click();
    }

    public void clickReceiveLetter() {
        log.info("点击收信宝");
        receive_letter.click();
    }

    public void clickReload() {
        log.info("点击右上角刷新");
        btn_rigth.click();
    }

    public void clickBeanVip() {
        log.info("点击vip0元购");
        bean_vip.click();
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

    public void clickLetter90_3() {
        log.info("点击90天会员");
        letter90_3.click();
    }

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

    public String getLetter7Price() {
        log.info("获取7天会员价格");
        return letter7price.getAttribute("name");
    }

    public String getLetter7Price_3() {
        log.info("获取7天会员价格");
        return letter7price_3.getAttribute("name");
    }

    public void clickNewVip() {
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
    }

    public void clickVip30() {
        log.info("点击30天vip");
        vip30.click();
    }

    public String getVip30price() {
        log.info("获取30天vip价格");
        return vip30.getAttribute("name");
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

    public void clickKaiTong() {
        log.info("点击立即开通");
        kaitong.click();
    }

    public void clickMigu() {
        log.info("点击咪咕联合会员");
        migu.click();
    }


    //    支付方式
    public void clickWecharPay() {
        log.info("选择 微信支付");
        wecharpay.click();
    }
    public void clickYinlianPay() {
        log.info("选择 银联支付");
        yinlianpay.click();
    }

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

    public void swipeToUp(AndroidDriver driver) {
        log.info("向上滑动屏幕");
        Duration duration = Duration.ofSeconds(1);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action1 = new TouchAction(driver).press(width / 2, 1550).waitAction(duration).moveTo(width / 2, 50).release();
        action1.perform();
    }

    public String getCurrentActivity(AndroidDriver driver) {
        log.info("获取启动的APP名称");
        return driver.currentActivity();
    }

    //    通用判断元素是否存在
    public boolean doesWebElementExist(WebElement webElement) {
        try {
            return webElement.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void keyBack(AndroidDriver driver) {
        log.info("点击物理返回键");
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }
//    public void hideKeyboard(AndroidDriver driver) {
//        log.info("收起软键盘");
//        driver.hideKeyboard();
//    }


    public void waitElement(AndroidDriver driver, WebElement webelement) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(webelement));
    }


    //    修改环境方法
//    点击页面空白处（用于进入修改环境）
    public void clickMonitor(AndroidDriver driver) {
        log.info("点击页面空白处（用于进入修改环境）");
        TouchAction action = new TouchAction(driver);
        int width = driver.manage().window().getSize().width;
        action.tap(width - 10, 150).perform();
        action.tap(width - 10, 150).perform();
        action.tap(width - 10, 150).perform();
        action.tap(width - 10, 150).perform();
    }

    //向上滑动选择一线城市
    public void swipeAddressUp(AndroidDriver driver) {
        log.info("滑动修改城市，选择一线城市");
        Duration duration = Duration.ofSeconds(1);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action1 = new TouchAction(driver).press(200, 950).waitAction(duration).moveTo(200, 1320).release();
        action1.perform();
    }

    //      滑动选择所在地址
    public void swipeAddress(AndroidDriver driver) {
        log.info("滑动修改城市");
        Duration duration = Duration.ofSeconds(1);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action1 = new TouchAction(driver).press(200, 950).waitAction(duration).moveTo(200, 690).release();
        action1.perform();
    }

    //  永远判断，下拉刷新后，列表上的 某些元素是否存在（死循环），如果不存在，则跳出该方法，继续后续方法
    public void waitElementInvisibility(WebElement webelement) throws Exception {
        for (int i = 0; i < 1; ) {
            if (!this.doesWebElementExist(webelement)) {
                break;
            }
        }
    }

    public void swipePic(AndroidDriver driver)throws Exception{
        log.info("滑动查看下一张照片");
        Duration duration = Duration.ofSeconds(1);
        TouchAction action1 = new TouchAction(driver);
//        .longPress(700, 650).waitAction(duration).moveTo(50, 650).perform();
//        TouchAction(driver).longPress(700, 650).waitAction(duration).moveTo(50, 650).perform();
        action1.longPress(1000, 650,duration).moveTo(50, 650);
        action1.release();
        action1.perform();
    }


    //    支付宝页面方法
    public void clickAgree() {
        agree.click();
    }

    public void clickEnsure() {
//        支付宝确认放弃支付
        ensure.click();
    }

    public void clickAlipayBack() {
        log.info("点击支付宝付款页面 回退");
        alipayback.click();
    }

    public void clickBack() {
        back.click();
    }
    public void clickMonitorBack(AndroidDriver driver) {
        log.info("支付宝免密签约成功页面，点击 返回");
        TouchAction action = new TouchAction(driver);
        action.tap(530, 1160).perform();
    }
    public void qianYueZhifubao(AndroidDriver driver) throws Exception{
        log.info("签约支付宝");
        this.waitElement(driver, mianmititle);
        this.clickMonitorAgree(driver);
        Thread.sleep(3000);
        this.sendKeyA(driver);
        Thread.sleep(500);
        this.sendKeyA(driver);
        Thread.sleep(500);
        this.sendKeyA(driver);
        Thread.sleep(500);
        this.sendKeyB(driver);
        Thread.sleep(500);
        this.sendKeyA(driver);
        Thread.sleep(500);
        this.sendKeyC(driver);
        Thread.sleep(500);
        this.waitElement(driver, wancheng);
        this.clickMonitorBack(driver);
        this.waitElement(driver, alipay);
        this.keyBack(driver);
    }
    public void fufeiZhifubao(AndroidDriver driver) throws Exception{
        log.info("打开支付宝完成支付");
        this.waitElement(driver, mianmititle);
        this.clickMonitorAliMianMi(driver);
        this.clickMonitorAgreePay(driver);
        Thread.sleep(3000);
        this.clickAliPayNow();//尚未修改
        Thread.sleep(2000);
        this.sendKeyA(driver);
        Thread.sleep(500);
        this.sendKeyA(driver);
        Thread.sleep(500);
        this.sendKeyA(driver);
        Thread.sleep(500);
        this.sendKeyB(driver);
        Thread.sleep(500);
        this.sendKeyA(driver);
        Thread.sleep(500);
        this.sendKeyC(driver);
        Thread.sleep(500);
        this.waitElement(driver, aliback);
        this.clickAliBack();
//        this.waitElement(driver, back);
//        this.clickBack();
        this.waitElement(driver, alipay);
        this.keyBack(driver);
    }

    //    发送密码
    public void sendKeyAA(AndroidDriver driver) {
        TouchAction action = new TouchAction(driver);
//        int width = driver.manage().window().getSize().width;
//        int height=driver.manage().window().getSize().height;
        action.tap(505, 1225).perform();
    }

    public void sendKeyBB(AndroidDriver driver) {
        TouchAction action = new TouchAction(driver);
//        int width = driver.manage().window().getSize().width;
//        int height=driver.manage().window().getSize().height;
        action.tap(522, 1549).perform();
    }

    public void sendKeyCC(AndroidDriver driver) {
        TouchAction action = new TouchAction(driver);
//        int width = driver.manage().window().getSize().width;
//        int height=driver.manage().window().getSize().height;
        action.tap(900, 1230).perform();
    }

    public void sendKeyD(AndroidDriver driver) {
        TouchAction action = new TouchAction(driver);
//        int width = driver.manage().window().getSize().width;
//        int height=driver.manage().window().getSize().height;
        action.tap(180, 1200).perform();
    }
    public void sendKeyA(AndroidDriver driver) {
        TouchAction action = new TouchAction(driver);
//        int width = driver.manage().window().getSize().width;
//        int height=driver.manage().window().getSize().height;
        action.tap(190, 1225).perform();
    }

    public void sendKeyB(AndroidDriver driver) {
        TouchAction action = new TouchAction(driver);
//        int width = driver.manage().window().getSize().width;
//        int height=driver.manage().window().getSize().height;
        action.tap(540, 1725).perform();
    }

    public void sendKeyC(AndroidDriver driver) {
        TouchAction action = new TouchAction(driver);
//        int width = driver.manage().window().getSize().width;
//        int height=driver.manage().window().getSize().height;
        action.tap(900, 1225).perform();
    }

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

    public void waitElementLoad(AndroidDriver driver, WebElement webelement) throws Exception {
//        log.info("等待页面加载完成");
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.textToBePresentInElement(webelement, "1"));
    }


    public void clickQueRen(){
        log.info("放弃微信支付回退后,确认页面，点击确认");
        queren.click();
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
    //    取消头像上传
    public void clickManUploadUserportraitCancle(){

        manuploaduserportraitcancle.click();
    }

    public String getMemberCenterVipExplain(){
        log.info("获取 会员中心--星级服务--到期日期");
        return membercentervipexplain.getText();
    }

    public String getOnlineStatus(){
        log.info("获取 空间页--在线状态 文本");
        return online_status.getText();
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
    public void clickMonitorAliMianMi(AndroidDriver driver) {
        log.info("支付宝免密支付页面，点击 同意协议并开通");
        TouchAction action = new TouchAction(driver);
        action.tap(190, 1382).perform();
    }
    //    确认开通并支付
    public void clickMonitorAgreePay(AndroidDriver driver){
        log.info("支付宝付款页面，点击 确认开通并支付");
        TouchAction action = new TouchAction(driver);
        action.tap(500, 1530).perform();
    }
    public void clickAgreePay(){
        agreepay.click();
    }

    public void clickMonitorAgree(AndroidDriver driver) {
        log.info("支付宝免密支付页面，点击 同意协议并开通");
        TouchAction action = new TouchAction(driver);
        action.tap(530, 1320).perform();
    }
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

    //    点击生活圈
    public void clickYuanfenVideo(){
        log.info("点击 生活圈");
        tv_yuanfen_video.click();
    }
    //    点击第一列右上角关注
    public void clickItemFollow(){
        log.info("点击第一列右上角关注");
        iv_short_item_follow_1.get(0).click();
    }
    //    获取生活圈姓名
    public String getItemName(){
        log.info("获取生活圈姓名");
        return tv_short_item_name_1.get(0).getText();
    }
    //    点击生活圈头像
    public void clickShortItem(){
        log.info("点击生活圈头像");
        gif_short_item_1.get(0).click();
    }
    //    点击生活圈空间 头像
    public void clickVideoSpaceHead(){
        log.info("点击生活圈空间中头像");
        iv_video_space_head.click();
    }
    //    获取生活圈空间 姓名
    public String getVideoSpaceName(){
        log.info("获取生活圈空间中姓名");
        return tv_video_space_name.getText();
    }

    //    点击生活圈空间  关注
    public void clickVideoSpaceFollow(){
        log.info("点击生活圈空间中关注");
        iv_video_space_follow.click();
    }
    //    获取生活圈空间 关注数
    public int getVideoSpaceZanCount(){
        log.info("获取生活圈空间 关注数");
        return Integer.parseInt(tv_video_space_zan_count.getText());
    }
    //    点击语音
    public void clickVideoWithTa(){
        log.info("点击与ta语音");
        ll_video_with_ta.click();
    }
    //    点击生活圈空间 返回
    public void clickVideoSpaceBack(){
        log.info("点击生活圈空间 返回");
        iv_video_space_back.click();
    }
    //    点击生活圈空间 进入用户空间 返回
    public void clickLeftTop(){
        log.info("点击用户空间左上角 返回");
        lefttop.click();
    }
    //    点击 信箱中的 视频
    public void clickMaiboxVideo(){
        log.info("点击信箱上方 视频");
        maibox_video.click();
    }
    //    点击视频 挂断
    public void clickTVHangup(){
        log.info("点击视频 挂断");
        tv_hangup.click();
    }
    //    获取 红包引导
    public String getTVDesc(){
        return tv_desc.getText();
    }

    public void clickNear1(){
        near1.click();
    }

    //    3线男 附近  第一个头像
    public void clickNear(){
        near.click();
    }

    public String getRegisterDate() {
        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.DATE);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String d = sdf.format(calendar.getTime());
        return d;
    }


}
