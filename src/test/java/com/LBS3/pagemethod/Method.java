package com.LBS3.pagemethod;

import com.LBS3.page.Page;
import com.aventstack.extentreports.ExtentTest;
import com.listener.ExtentTestNGITestListener;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Method extends Page {
    //    点击右上角“登录”

    ExtentTestNGITestListener el = new ExtentTestNGITestListener();
    ExtentTest log = el.getlog();

    public void clickLogin() {
        log.info("点击右上角登录按钮");
        login.click();
    }

    public void clickMeIcon() {
        log.info("点击 我的 ");
        meicon.click();
    }

    public void clickMeIcon1() {
        log.info("点击 我的 ");
        meicon1.click();
    }

    //    点击页面空白处（用于进入修改环境）
    public void clickMonitor(AndroidDriver driver) {
        log.info("点击页面空白处（用于进入修改环境）");
        TouchAction action = new TouchAction(driver);
        int width = driver.manage().window().getSize().width;
        action.tap(width / 2, 1200).perform();
        action.tap(width / 2, 1200).perform();
        action.tap(width / 2, 1200).perform();
        action.tap(width / 2, 1200).perform();
    }

    //    修改渠道号
    public void updateQuDao(String qudaonum) {
        log.info("修改渠道号");
        qudao.click();
        qudao.clear();
        qudao.sendKeys(qudaonum);
    }


//    修改密码
    public void updataPassWord(){
        log.info("修改用户密码");
        modify_button.click();
        password.clear();
        password.sendKeys("qwe123123");
        btn_submit.click();
    }

    //    点击 右下角空白处（用于处理 进入空间时，消去覆盖的提示）
    public void clickMonitor1(AndroidDriver driver) {
        TouchAction action = new TouchAction(driver);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        action.tap(width - 1, height - 1).perform();
    }

    //    展开 注册地址一项
    public void clickAddress() {
        log.info("展开注册地址一项");
        address.click();
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

    //      滑动选择所在地址
    public void swipeAddress(AndroidDriver driver) {
        Duration duration = Duration.ofSeconds(1);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action1 = new TouchAction(driver).press(200, 950).waitAction(duration).moveTo(200, 690).release();
        action1.perform();
    }

    //      点击“确定”
    public void clickOK() {
        btn_ok.click();
    }

    //    点击“保存”
    public void clickSave() {
        btn_test_save.click();
    }

    //    点击“返回注册”
    public void clickRegist() {
        login_regist_button.click();
    }

    //    点击“我是男”
    public void clickMen() {
        log.info("点击 我是男");
        btn_men.click();
    }

    //    点击“我是女”
    public void clickWomen() {
        log.info("点击“我是女”");
        btn_women.click();
    }

    public void clickAnswers() {
        for (int i = 1; i <= 5; ) {
            log.info("回答第" + i + "个问题");
            answers.get(0).click();
            i++;
        }
    }


    //      点击上方未读信件 关闭 提示
    public void clickMsgClose() {
        log.info("点击上方未读信件 关闭 提示");
        msg_close.click();
    }

    //  获取上方模块名称
    public String getTopView() {
        log.info("获取上方模块名称");
        return topview.getText();
    }

    //  获取上方页面名称
    public String getTitleName() {
        log.info("获取上方页面名称");
        return title_name.getText();
    }


    //    点击 缘分页 第一排左侧用户头像左上方 心标
    public void clickSayHI1() {
        iv_sayhi.get(0).click();
    }

    //    获取缘分页第一个第一排左侧用户姓名
    public String getTvName() {
        return tv_name.get(0).getText();
    }

    //  点击缘分模块 第一个用户头像
    public void clickImg1() {
        img1.get(0).click();
    }

    //    点击缘分模块 第一排右边用户头像
    public void clickImg2() {
        img1.get(1).click();
    }

    //  点击 空间页中 查看更多资料 按钮
    public void clickMoreBtn() {
        more_button.click();
    }

    //  点击空间页中  查看视频 按钮
    public void clickVideoView() {
        video_view.click();
    }

    //  点击空间 升级vip对话框 取消按钮
    public void clickCancle() {
        btn_cancel.click();
    }

    //  点击 在线状态 按钮
    public void clickOnlineStatus() {
        online_status.click();
    }

    //    点击空间左上角返回
    public void clickLeftBtn() {
        left_btn.click();
    }

    //   点击左上角 返回
    public void clickBtnLeft() {
        log.info("点击左上角 返回");
        btn_left.click();
    }

    //    点击空间右上角展开
    public void clickRightTop() {
        right_top.click();
    }

    //    获取关注一项 文本
    public String getConversation() {
        return conversation.getText();
    }

    // log.info("点击“关注”");
    public void clickConversation() {
        conversation.click();
    }

    //  log.info("获取 拉黑 信息");
    public String getNotread() {
        return notread.getText();
    }

    //     log.info("点击“拉黑”" );
    public void clickNotread() {
        notread.click();
    }

    //log.info("获取 举报 信息");
    public String getUpgraded() {
        return upgraded.getText();
    }

    // log.info("点击“举报”");
    public void clickUpgraded() {
        upgraded.click();
    }

    //    log.info("点击“取消”");
    public void clickBtnCancle() {
        btn_cancel.click();
    }

    //    log.info("点击“确定”");
    public void clickBtnok() {
        btn_ok.click();
    }

    //    log.info("点击 举报中“其他”");
    public void clickOther() {
        other.click();
    }

    //log.info("点击 举报中“确定举报/返回”");
    public void clickSure() {
        sure.click();
    }

    //    获取 空间页 用户姓名
    public String getZoneName() {
        return zonename.getText();
    }

    //    点击 空间中 下一位按钮
    public void clickNext() {
        next_button.click();
    }

    //    点击空间中“打招呼”按钮
    public void clickAskBtn() {
        ask_button.click();
    }


    //    通用判断元素是否存在
    public boolean doesWebElementExist(WebElement webElement) {
        try {
            return webElement.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    //    空间向上滑动（用于处理 点击 视频，在线状态）
    public void swipeToUp(AndroidDriver driver) {
        Duration duration = Duration.ofSeconds(1);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action1 = new TouchAction(driver).press(20, 1300).waitAction(duration).moveTo(width / 2, 50).release();
        action1.perform();
    }


    public void clickYuanFen() {
        log.info("进入缘分模块");
        yuanfenicon.click();
    }

    public void clickYuanFen1() {
        log.info("进入缘分模块");
        yuanfenicon1.click();
    }

    public void clickTuijian() {
        tuijianicon.click();
    }

    public void clickTuijianList1() {
        tuijianlist1.click();
    }

    public void clickBtnVideoChat() {
        btn_video_chat.click();
    }

    public void clickJump() {
        jump.click();
    }


    public void clickMailBox() {
        log.info("点击 信箱 模块");
        mailboxicon.click();
    }

    public int getMailboxNum() {
        return Integer.parseInt(mailboxnum.getText());
    }

    public int getLetterNum() {
        return Integer.parseInt(letternum.getText());
    }

    public void clickImgLook() {
        img_look.click();
    }

    public String getUsername() {
        return user_name.getText();
    }

    public void clickNearIcon() {
        log.info("点击“附近”");
        nearicon.click();
    }

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


    public void swipeToDown(AndroidDriver driver) {
        Duration duration = Duration.ofSeconds(1);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action1 = new TouchAction(driver).press(width / 2, height / 4).waitAction(duration).moveTo(width / 2, height * 3 / 4).release();
        action1.perform();
    }


    //    点击 对对碰（用于点击右下角 对对碰）
    public void clickduiduipeng(AndroidDriver driver) {
        TouchAction action = new TouchAction(driver);
//        int width = driver.manage().window().getSize().width;
//        int height=driver.manage().window().getSize().height;
        action.tap(920, 1430).perform();
    }

    //    点击 强力推荐（用于点击右下角 对对碰）
    public void clickQiangLiTuiJian(AndroidDriver driver) {
        TouchAction action = new TouchAction(driver);
//        int width = driver.manage().window().getSize().width;
//        int height=driver.manage().window().getSize().height;
        action.tap(960, 1040).perform();
    }


    //    我的
    public void clickMemberCenter() {
        log.info("点击会员中心");
        member_center.click();
    }


    //    会员中心
//    豆币
    public void clickBean() {
        log.info("点击豆币");
        bean.click();
    }
//      写信包月
    public void clickWriteLetter() {
        log.info("点击写信包月");
        write_letters.click();
    }
//

    //    3天vip
//    点击 开通3天vip（用于点击3天vip）
    public void clickVIP(AndroidDriver driver) {
        TouchAction action = new TouchAction(driver);
//        int width = driver.manage().window().getSize().width;
//        int height=driver.manage().window().getSize().height;
        action.tap(530, 760).perform();
    }

    //    点击立即开通
    public void clickKaiTong() {
        log.info("点击立即开通");
        kaitong.click();
    }


    //    支付宝页面方法
    public void clickAgree() {
        agree.click();
    }

    public void clickIvClose() {
        iv_close.click();
    }


    //    发送密码
    public void sendKeyA(AndroidDriver driver) {
        TouchAction action = new TouchAction(driver);
//        int width = driver.manage().window().getSize().width;
//        int height=driver.manage().window().getSize().height;
        action.tap(505, 1225).perform();
    }

    public void sendKeyB(AndroidDriver driver) {
        TouchAction action = new TouchAction(driver);
//        int width = driver.manage().window().getSize().width;
//        int height=driver.manage().window().getSize().height;
        action.tap(522, 1549).perform();
    }

    public void sendKeyC(AndroidDriver driver) {
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

    public void sendKeyBack(AndroidDriver driver) {
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }

    public void clickAliPayClose() {
        nav_close.click();
    }

    public void clickCheck() {
        check.click();
    }

    public void clickQianWang() {
        qianwang.click();
    }

    public void clickBuYao() {
        buyao.click();
    }

    public void clickPayUnlock() {
        payunlock.click();
    }

    public void clickQueDing() {
        queding.click();
    }

    public String getOKText() {
        return btn_ok.getText();
    }

    public void clickBtnClose() {
        btn_close.click();
    }

    public void clickNavClose() {
        nav_close.click();
    }

    public void clickSayHello() {
        say_hello.click();
    }


    //    点击“右侧资料”
    public void clickMemberInfo() {
        log.info("点击右侧“资料”");
        memberinfo.click();
    }

    public void clickHeight(){
        height.click();
    }
    public void clickWeight(){
        weight.click();
    }
    public void clickBloodType(){
        bloodtype.click();
    }
    public void clickOKBtn(){
        OKBtn.click();
    }

    public void clickBtnSave(){
        save.click();
    }

    public void clickProperty(){
        property.click();
    }

    public void clickHobby(){
        hobby.click();
    }

    public void clickNativePlace(){
        nativeplace.click();
    }

    public void clickEducation(){
        education.click();
    }

    public void clickJob(){
        job.click();
    }

    public void clickIncome(){
        income.click();
    }

    public void clickPart(){
        part.click();
    }

    public void clickMaritalStatus(){
        maritalstatus.click();
    }

    public void clickHouse(){
        house.click();
    }

    public void clickYidilian(){
        yidilian.click();
    }

    public void clickOppositeSex(){
        oppositesex.click();
    }

    public void clickQinmi(){
        qinmi.click();
    }

    public void clickParent(){
        parent.click();
    }
    public void clickChild(){
        child.click();
    }

    public String getMemberInfo(){
        log.info("获取资料完整度");
        return  memberinfo.getText();
    }


    public void clickSetting(){
        log.info("点击“设置”");
        setting.click();
    }

    public void clickUserInfo(){
        log.info("点击“用户信息");
        userinfo.click();
    }

    public String getUserInfoUserName(){
        log.info("获取登录账号");
        return userinfo_username.getText();
    }

    public void userLogin(String useraccount){
        log.info("登录已注册用户");
        input_account.click();
        input_account.clear();
        input_account.sendKeys(useraccount);
        input_password.click();
        input_password.clear();
        input_password.sendKeys("qwe123123");
        btn_login.click();
    }

    public String getCurrentActivity(AndroidDriver driver){
        log.info("获取启动的APP名称");
        return  driver.currentActivity();
    }

    public void clickWecharPay(){
        log.info("选择 微信支付");
        wecharpay.click();
    }

    public void keyBack(AndroidDriver driver){
        log.info("点击物理返回键");
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }

    public void clickReload(){
        log.info("点击右上角刷新");
        btn_rigth.click();
    }

    public void clickBean800(){
        log.info("点击800语音豆");
        bean800.click();
    }
    public String getBean800Price(){
        log.info("获取800语音豆价格");
        return bean800price.getAttribute("name");
    }
    public void clickBean550(){
        log.info("点击550语音豆");
        bean550.click();
    }
    public String getBean550Price(){
        log.info("获取550语音豆价格");
        return bean550price.getAttribute("name");
    }

    public void clickLetterVip(){
        log.info("点击3天vip9元购");
        letter_vip.click();
    }
    public void clickLetter90(){
        log.info("点击90天会员");
        letter90.click();
    }
    public String getLetter90Price(){
        log.info("获取90天会员价格");
        return letter90price.getAttribute("name");
    }

    public void clickLetter30(){
        log.info("点击30天会员");
        letter30.click();
    }
    public String getLetter30Price(){
        log.info("获取30天会员价格");
        return letter30price.getAttribute("name");
    }
    public void clickLetter7(){
        log.info("点击7天会员");
        letter7.click();
    }
    public String getLetter7Price(){
        log.info("获取7天会员价格");
        return letter7price.getAttribute("name");
    }

    public void clickVipTitle(){
        log.info("点击星级服务");
        vip_title.click();
    }
    public void clickVip90(){
        log.info("点击90天vip");
        vip90.click();
    }
    public String getVip90price(){
        log.info("获取90天vip价格");
        return vip90.getAttribute("name");
    }
    public void clickVip30(){
        log.info("点击30天vip");
        vip30.click();
    }
    public String getVip30price(){
        log.info("获取30天vip价格");
        return vip30.getAttribute("name");
    }

    public void clickReceiveLetter(){
        log.info("点击收信宝");
        receive_letter.click();
    }
    public void clickUploadPic(){
        log.info("点击上传头像");
        uploadpic.click();
    }

    public void clickLocalPic(){
        log.info("选择本地照片");
        localpicture.click();
    }
    public void clickImg(){
        log.info("选择一个相册");
        img.click();
    }

    public void clickMonitorPic(AndroidDriver driver) {
        log.info("选择一张照片");
        TouchAction action = new TouchAction(driver);
        int width = driver.manage().window().getSize().width;
        action.tap(200, 400).perform();
    }

    public void clickImgOK(){
        log.info("选中照片");
        imgok.click();
    }
    public  void swipeToDownPIC(AndroidDriver driver) {
        log.info("随机滑动照片");
        Duration duration=Duration.ofSeconds(1);
        Random rand = new Random();
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
//        System.out.println(width);
//        System.out.println(height);
        TouchAction action1 = new TouchAction(driver).press(width / 2,height/4).waitAction(duration).moveTo(width /2, rand.nextInt(1080) + 1).release();
        action1.perform();
    }

    public void clickImgSure(){
        log.info("确认照片");
        imgsure.click();
    }

    public void clickDay1(){
        log.info("点击1天");
        day1.click();
    }
    public void clickDay3(){
        log.info("点击3天");
        day3.click();
    }
    public void clickDay7(){
        log.info("点击7天");
        day7.click();
    }
    public void clickDay15(){
        log.info("点击15天");
        day15.click();
    }

    public String getDay1Price(){
        log.info("获取1天价格");
        return day1.getAttribute("name");
    }
    public String getDay3Price(){
        log.info("获取3天价格");
        return day3.getAttribute("name");
    }
    public String getDay7Price(){
        log.info("获取7天价格");
        return day7.getAttribute("name");
    }
    public String getDay15Price(){
        log.info("获取15天价格");
        return day15.getAttribute("name");
    }

    public void clickMonitorPay(AndroidDriver driver) {
        log.info("点击立即付款");
        TouchAction action = new TouchAction(driver);
//        int width = driver.manage().window().getSize().width;
        action.tap(490, 1670).perform();
    }

    public void clickChangLiaoHuiYuan(){
        log.info("点击畅聊会员");
        changliaohuiyuan.click();
    }
}
