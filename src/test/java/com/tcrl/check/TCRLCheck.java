package com.tcrl.check;

import com.LBS3.pagemethod.Method;
import com.aventstack.extentreports.ExtentTest;
import com.listener.ExtentTestNGITestListener;
import com.listener.WriteUserID;
import com.tcrl.method.ElementMethod;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TCRLCheck extends ElementMethod {

    ExtentTestNGITestListener el = new ExtentTestNGITestListener();
    ExtentTest log = el.getlog();
    WriteUserID wui=new WriteUserID();

    public void protocal(AndroidDriver driver) throws Exception {
        this.waitElement(driver,btn_men);
        this.clickProtocal();
        if (!this.getTitleName().equals("注册协议")) {
            Assert.fail("点击注册页面下方“使用协议”，未进入注册协议页面");
        }
        this.clickBtnLeft();
        if (!this.doesWebElementExist(btn_men)) {
            Assert.fail("点击注册协议页面左上角返回，未返回注册界面");
        }
    }

    //    1线男注册
    public void manRegiste1(AndroidDriver driver, String qudaohao) throws Exception {
        this.waitElement(driver,btn_men);
        this.clickTvBack();
        this.clickLogin();
        Thread.sleep(2000);
        this.clickMonitor(driver);
        this.clickTestEnv();
        this.clickProduct();
//        this.clickTestEnv();
//        this.clickHuluprep();
        this.updateQuDao(qudaohao);
        log.info("渠道号：" + qudaohao);
//        this.clickAddress();
//        this.swipeAddress(driver);
//        this.clickBtnok();
        String address=this.getAddress();
        log.pass(address);
        this.clickBtnSave();
        this.clickLoginRegister();
        this.clickMen();
        this.clickRegister();
        if(this.doesWebElementExist(btn_reg_dialog_reg)){
            this.clickLijireg();
        }
//        if (!this.doesWebElementExist(upload_user_icon_image)) {
//            Assert.fail("1线男用户注册，第一个页面未提示上传头像");
//        }
        this.waitElement(driver, btn_left);
        this.clickBtnLeft();
        this.waitElement(driver, title_name);
        if (!this.getTitleName().contains("完善资料")) {
            Assert.fail("男用户注册，未提示完善资料");
        }
        this.clickBtnLeft();
//        this.waitElement(driver, topview);
        log.info("判断是否进入缘分模块");
        if (!this.doesWebElementExist(mokuai.get(2))) {
            Assert.fail("注册成功后，未进入缘分模块");
        }
        if (this.doesWebElementExist(msg_close)) {
            this.clickMsgClose();
        }
        String userid=this.getUserID(driver);
        wui.appendFile("E:\\TCRL.csv",this.getRegisterDate()+","+qudaohao+","+address+","+userid+"\r\n");
        log.pass(userid);
        this.clickBtnLeft();
        this.clickBtnLeft();
        this.clickTongChengIcon();
    }

    //    3线男注册
    public void manRegiste3(AndroidDriver driver, String qudaohao) throws Exception {
        this.waitElement(driver,btn_men);
        this.clickTvBack();
        this.clickLogin();
        Thread.sleep(2000);
        this.clickMonitor(driver);
        this.clickTestEnv();
        this.clickProduct();
//        this.clickTestEnv();
//        this.clickHuluprep();
        this.updateQuDao(qudaohao);
        log.info("渠道号：" + qudaohao);
        this.clickAddress();
        this.swipeAddress(driver);
//        测试快速点击，跳过上海（停留在上海后，程序崩溃）
//        this.ttttt(driver);
        this.clickBtnok();
        String address=this.getAddress();
        log.pass(address);
        this.clickBtnSave();
        this.clickLoginRegister();
        this.clickMen();
        this.clickRegister();
        if(this.doesWebElementExist(btn_reg_dialog_reg)){
            this.clickLijireg();
        }
//        if(!this.doesWebElementExist(upload_user_icon_image)){
//            Assert.fail("1线男用户注册，第一个页面未提示上传头像");
//        }
//        this.waitElement(driver, btn_left);
//        this.clickBtnLeft();
//        this.waitElement(driver, title_name);
//        if (!this.getTitleName().contains("完善资料")) {
//            Assert.fail("男用户注册，未提示完善资料");
//        }
        this.waitElement(driver, title_name);
        log.info("判断3线男注册，是否进入“附近”");
        if (!this.getTitleName().equals("附近")) {
            Assert.fail("3线男用户注册，未进入“附近”");
        }
        this.clickBtnLeft();
//        this.waitElement(driver, topview);
        //5.5.9新新需求，双号弹出超级曝光页面
        log.info("判断新需求，超级曝光页是否弹出");
        if(this.doesWebElementExist(speed_dialog_title)){
            this.clickBtnSpeed();
        }
        log.info("判断是否进入缘分模块");
        if (!this.doesWebElementExist(mokuai.get(2))) {
            Assert.fail("注册成功后，未进入缘分模块");
        }
        if (this.doesWebElementExist(msg_close)) {
            this.clickMsgClose();
        }
        String userid=this.getUserID(driver);
        wui.appendFile("E:\\TCRL.csv",this.getRegisterDate()+","+qudaohao+","+address+","+userid+"\r\n");
        log.pass(userid);
        this.clickBtnLeft();
        this.clickBtnLeft();
        this.clickTongChengIcon();
    }

    //    1线男打招呼
    public void manSayHi1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.waitElement(driver, tv_sayhello.get(0));
        this.clickTVSayHello();
        String name = this.getTVNickName();
        this.clickIVUser();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        this.waitElement(driver, user_name_text);
        log.info("判断打招呼后，进入空间，是否无打招呼按钮");
        if (this.doesWebElementExist(ask_button)) {
            Assert.fail("在列表上点击“打招呼后”，进入空间页中，出现“打招呼”按钮");
        }
        log.info("判断 点击头像进入空间后，姓名是否一致");
        if (name.equals(this.getUserNameText())) {
            this.clickLeftBtn();
        } else {
            Assert.fail("点击头像进入空间后，用户姓名不一致");
        }
    }

    //    3线男 缘分页打招呼
    public void manSayHi3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.waitElement(driver, tv_sayhello.get(0));
        this.clickTVSayHello();
        String name = this.getTVNickName();
        this.clickIVUser();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        this.waitElement(driver, user_name_text);
        log.info("判断打招呼后，进入空间，是否无打招呼按钮");
        if (this.doesWebElementExist(ask_button)) {
            Assert.fail("在列表上点击“打招呼后”，进入空间页中，出现“打招呼”按钮");
        }
        log.info("判断 点击头像进入空间后，姓名是否一致");
        if (name.equals(this.getUserNameText())) {
            this.clickLeftBtn();
        } else {
            Assert.fail("点击头像进入空间后，用户姓名不一致");
        }
    }

    //    1线男空间页打招呼，及下一个
    public void manAskbtn1(AndroidDriver driver, String qudaohao) throws Exception {
        String name1;
        String name2;
        this.manRegiste1(driver, qudaohao);
        this.waitElement(driver, iv_user.get(0));
        this.clickIVUser();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
        Thread.sleep(1000);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        this.waitElement(driver, user_name_text);
        if (!this.doesWebElementExist(ask_button)) {
            Assert.fail("未打招呼用户，进入空间后，无“打招呼”按钮");
        }
        name1 = this.getUserNameText();
        this.clickAskBtn();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
        Thread.sleep(1000);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        this.waitElement(driver, user_name_text);
        name2 = this.getUserNameText();
        if (name1.equals(name2)) {
            Assert.fail("在空间中点击“打招呼”按钮后，未跳转至另一用户");
        }
        this.clickNext();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
        Thread.sleep(1000);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        this.waitElement(driver, user_name_text);
        name1 = this.getUserNameText();
        if (name1.equals(name2)) {
            Assert.fail("在空间中点击“下一个”按钮后，未跳转至另一用户");
        }
        this.clickLeftBtn();
    }

    //  1线男 关注
    public void manConversation1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.waitElement(driver, iv_user.get(0));
        this.clickIVUser();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        this.waitElement(driver, user_name_text);
        if (this.doesWebElementExist(msg_close)) {
            this.clickMsgClose();
        }
        String name1 = this.getUserNameText();
        this.clickRightTop();
        log.info("判断 默认是否为 “关注”");
        if (this.getConversation().equals("关注")) {
            this.clickConversation();
            this.clickRightTop();
            log.info("判断 关注后，是否为“取消关注”");
            if (this.getConversation().equals("取消关注")) {
                this.clickConversation();
                this.clickRightTop();
                log.info("判断取消关注后，是否为“关注”");
                if (this.getConversation().equals("关注")) {
                    this.clickConversation();
                    this.clickLeftBtn();
                } else {
                    Assert.fail("取消关注失败");
                }
            } else {
                Assert.fail("关注失败");
            }
        } else {
            Assert.fail("默认显示为“取消关注”");
        }
        this.clickMeIcon();
        this.waitElement(driver, member_center);
        this.swipeToUp(driver);
        this.waitElement(driver, conversationperson);
        this.clickConversationPerson();
        String name2 = this.getConversationPersonName();
        if (!name1.equals(name2)) {
            Assert.fail("实际关注的人与列表显示关注的人，名字不一致");
        }
    }

    // 1线男 拉黑
    public void mannNotread1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.waitElement(driver, iv_user.get(0));
        this.clickIVUser();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        if (this.doesWebElementExist(msg_close)) {
            this.clickMsgClose();
        }
        this.clickRightTop();
        if (this.getNotread().equals("拉黑")) {
            this.clickNotread();
            this.clickBtnCancle();
            this.clickRightTop();
            if (this.getNotread().equals("拉黑")) {
                this.clickNotread();
                this.clickBtnok();
                this.clickRightTop();
                if (this.getNotread().equals("取消拉黑")) {
                    this.clickNotread();
                    this.clickBtnCancle();
                    this.clickRightTop();
                    if (this.getNotread().equals("取消拉黑")) {
                        this.clickNotread();
                        this.clickBtnok();
                        this.clickRightTop();
                        if (this.getNotread().equals("拉黑")) {
                            this.clickConversation();
                            this.clickLeftBtn();
                        } else {
                            Assert.fail("取消拉黑失败");
                        }
                    } else {
                        Assert.fail("放弃“取消拉黑”失败");
                    }
                } else {
                    Assert.fail("拉黑失败");
                }
            } else {
                Assert.fail("放弃“拉黑”失败");
            }
        } else {
            Assert.fail("默认为非拉黑状态");
        }
    }

    // 1线男 举报
    public void manUpgraded1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.waitElement(driver, iv_user.get(0));
        this.clickIVUser();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        if (this.doesWebElementExist(msg_close)) {
            this.clickMsgClose();
        }
        this.clickRightTop();
        if (this.getUpgraded().equals("举报")) {
            this.clickUpgraded();
            this.clickOther();
            this.clickSure();
            this.clickSure();
            this.clickLeftBtn();
        } else {
            Assert.fail("默认为被举报状态");
        }
    }

    // 1线男 在线状态
    public void manOnlineStatus1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.waitElement(driver, iv_user.get(0));
        this.clickIVUser();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        this.swipeToUp(driver);
        Thread.sleep(1000);
        this.clickOnlineStatus();
        this.waitElement(driver, title_name);
        log.info("判断是否进入皇冠特权页面");
        if (!this.getTitleName().equals("皇冠特权")) {
            Assert.fail("未进入皇冠特权页面");
        }
    }

    //    3线男 查看视频
    public void manVideo3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.waitElement(driver, iv_user.get(0));
        this.clickIVUser();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        this.waitElement(driver, user_name_text);
        this.swipeToUp(driver);
        Thread.sleep(1000);
        this.waitElement(driver, more_button);
        this.clickVideoView();
        Thread.sleep(1000);
        log.info("判断是否弹出升级vip提示");
        if (!this.doesWebElementExist(dialog_bg)) {
            Assert.fail("点击“更多详细资料”，未弹出升级vip提示");
        }
        this.clickCancle();
        this.clickVideoView();
        this.moreGetVip3(driver);
    }

    //    3线男 查看更多资料
    public void manMore3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.waitElement(driver, iv_user.get(0));
        this.clickIVUser();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        this.waitElement(driver, user_name_text);
        this.swipeToUp(driver);
        this.waitElement(driver, more_button);
        this.clickMoreBtn();
        Thread.sleep(1000);
        log.info("判断是否弹出升级vip提示");
        if (!this.doesWebElementExist(dialog_bg)) {
            Assert.fail("点击“更多详细资料”，未弹出升级vip提示");
        }
        this.clickCancle();
        this.clickMoreBtn();
        this.moreGetVip3(driver);
    }

    //    1线男 查看更多资料
    public void manMore1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.waitElement(driver, iv_user.get(0));
        this.clickIVUser();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        this.waitElement(driver, user_name_text);
        this.swipeToUp(driver);
        Thread.sleep(1000);
        this.waitElement(driver, more_button);
        this.clickMoreBtn();
        Thread.sleep(1000);
        log.info("判断是否无 升级提示，直接展开更多资料");
        if (!this.doesWebElementExist(more_text)) {
            Assert.fail("1线男，点击“更多详细资料”，未能展开更多资料详情");
        }

    }

    //    1线男 附近
    public void manNear1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickNearIcon();
        this.near1(driver);
    }

    //    信箱校验
    //    信箱三项
    public void manMailbox1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickMailBoxIcon();
//        信箱模块上方 不为topview，
        this.waitElement(driver, title_name);
        if (!this.doesWebElementExist(tongzhi)) {
            Assert.fail("信箱中不存在 通知 标签");
        }
        if (!this.doesWebElementExist(sixin)) {
            Assert.fail("信箱中不存在 私信 标签");
        }
        if (!this.doesWebElementExist(lianxi)) {
            Assert.fail("信箱中不存在 最近联系 标签");
        }
    }

    //    信息未读数量
    public void manMailboxNum1(AndroidDriver driver, String qudaohao) throws Exception {
        int letter_beforenum;
        int mailbox_beforenum;
        this.manRegiste1(driver, qudaohao);
        this.clickMailBoxIcon();
        this.waitElement(driver, personal_data);
        letter_beforenum = this.getLetterNum();
        mailbox_beforenum = this.getMailboxNum();
        if (letter_beforenum != 1 || mailbox_beforenum != 1) {
            Assert.fail("存在未读邮件时，‘私信’与‘信箱’显示不一致");
        }
        this.clickLook();
        this.waitElement(driver, btn_left);
        this.clickBtnLeft();
        this.waitElement(driver, personal_data);
        if (this.doesWebElementExist(letter_num)) {
            Assert.fail("读取邮件后，上方未读标示未消失");
        }
        if (this.doesWebElementExist(mailbox_num)) {
            Assert.fail("读取邮件后，下方未读标示未消失");
        }
    }

    // 收信里进入空间
    public void manMailboxZone3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickMailBoxIcon();
        this.waitElement(driver, personal_data);
        this.clickLook();
        this.waitElement(driver, title_name);
        this.clickMessageImage();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        this.waitElement(driver, user_name_text);
        this.clickReplyAsk();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.waitElement(driver, title_name);
        log.info("判断点击 回复并索要联系方式，是否进入会员购买页面,且默认为 畅聊会员");
        if (!this.getTitleName().equals("会员服务")) {
            Assert.fail("点击 回复并索要联系方式，未进入会员服务页面");
        }
//        if (!this.doesWebElementExist(letter90)) {
//            Assert.fail("点击 回复并索要联系方式，会员服务页未在“畅聊会员”标签");
//        }
        this.clickBtnLeft();

    }

    //    3线男 查看更多照片
    public void manMailboxZonePic3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickMailBoxIcon();
        this.waitElement(driver, img_look.get(0));
        this.clickLook();
        this.waitElement(driver, title_name);
        this.clickMessageImage();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        Thread.sleep(1000);
        System.out.println(this.getPicCount());
        if (!this.getPicCount().contains("/1")) {
            log.info("判断3线男，在空间页中，查看女用户多张照片，是否提示会员购买");
            this.swipePic(driver);
//            this.swipePic(driver);
            Thread.sleep(1000);
            this.clickZonePic();
            this.moreGetVip3(driver);
        } else {
            log.pass("该女用户只有一张照片");
        }

    }

    //    信箱上方完善信息
    public void manMailboxPersonData1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickMailBoxIcon();
        this.waitElement(driver, personal_data);
        this.clickPersonalData();
        this.waitElement(driver, title_name);
        log.info("判断 点击信箱上方 完善资料，是否进入 完善信息页面");
        if (!this.getTitleName().equals("完善信息")) {
            Assert.fail("点击“完善资料”，未进入“完善信息”页");
        }
    }

    //  1线男可购买项
    public void VIPCenter1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickMeIcon();
        this.clickMemberCenter();
        this.waitElement(driver, title_name);
        this.getVipCenter();
    }
    //  可购买项
    public void VIPCenter3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickMeIcon();
        this.clickMemberCenter();
        this.waitElement(driver, title_name);
        this.getVipCenter();
    }

    //  1线男豆币校验
    public void BeanList1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickMeIcon();
        this.clickMemberCenter();
        this.clickBean();
        this.beanPrice1(driver);
    }

    //    3线男豆币校验
    public void BeanList3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickMeIcon();
        this.clickMemberCenter();
        this.clickBean();
        this.beanPrice3(driver);
    }

    //    1线男写信包月
    public void LetterList1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickMeIcon();
        this.clickMemberCenter();
        this.clickWriteLetter();
        this.letterPrice1(driver);
    }

    //    3线男写信包月
    public void LetterList3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickMeIcon();
        this.clickMemberCenter();
        this.clickWriteLetter();
        this.letterPrice3(driver);
    }

    //  1线男 皇冠特权
    public void VipList1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickMeIcon();
        this.clickMemberCenter();
        this.clickVipTitle();
        this.VipPrice1(driver);
    }

    // 3线男 皇冠特权
    public void VipList3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickMeIcon();
        this.clickMemberCenter();
        this.clickVipTitle();
        this.VipPrice3(driver);
    }

    //    我的
//    个人资料
    public void myPersonData(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickMeIcon();
        this.clickMemberInfo();
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
        this.swipeToUp(driver);
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
        this.clickOppositeSex();
        this.clickBtnok();
        this.clickQinmi();
        this.clickBtnok();
        this.clickParent();
        this.clickBtnok();
        this.clickChild();
        this.clickBtnok();
        this.clickSave();
        this.waitElement(driver, memberinfo);
        this.clickMemberInfo();
//        System.out.println(this.getMemberInfo());
        if (!this.getTitleName().contains("95%")) {
            Assert.fail("修改资料后，未生效");
        }
    }

    //    征友条件
    public void myCondition(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickMeIcon();
        this.waitElement(driver, memberinfo);
        this.swipeToUp(driver);
        Thread.sleep(500);
        this.clickMyCondition();
        this.clickLocalView();
        this.clickDown();
        this.clickBtnok();
        this.clickAgeView();
        this.clickDown();
        this.clickBtnok();
        this.clickHeightView();
        this.clickHeightDown();
        this.clickBtnok();
        String local_view = this.getLocalView();
        String age_view = this.getAgeView();
        String height_view = this.getHeightView();
        this.clickSave();
//        this.clickSearchIcon();
//        this.clickSearchBtn();
//        String local_text = this.getAreaText();
//        String age_text = this.getAgeText();
//        String height_text = this.getHeightText();
//        if (!local_text.equals(local_view)) {
//            Assert.fail("搜索中 所在地与征友条件中所在地 不一致");
//        }
//        if (!age_text.contains(age_view)) {
//            Assert.fail("搜索中年龄与征友条件中年龄不一致");
//        }
//        if (!height_text.contains(height_view)) {
//            Assert.fail("搜索中身高与征友条件中身高不一致");
//        }
//        this.keyBack(driver);
//        this.waitElement(driver, topview);
        this.clickTongChengIcon();
        this.waitElement(driver, topview);
        this.swipeToDown(driver);
        Thread.sleep(1000);
        this.waitElementInvisibility(header_content);
        for (int i = 0; i < iv_user.size(); i++) {
            iv_user.get(i).click();
            this.clickMonitor1(driver);
            Thread.sleep(1000);
            this.clickMonitor1(driver);
            Thread.sleep(1000);
            if (!this.getMemberInfoText().contains(local_view)) {
                Assert.fail("缘分页中,第" + (i + 1) + "个用户，地区与征友条件中不一致");
            }
            this.keyBack(driver);
        }
    }

    //    1线男 我的个人问答
    public void myQuestion1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickMeIcon();
        this.waitElement(driver, myquestion);
        this.clickMyQuestion();
        this.waitElement(driver, title_name);
//        log.info("判断是否进入我的匹配问答页面，且出现未做匹配问答提示");
//        if (!this.doesWebElementExist(matching_qa_none_btn)) {
//            Assert.fail("未做匹配问答时，没有出现提示");
//        }
//        this.clickAnswerQuetion();
//        log.info("判读是否进入匹配问答页面");
//        if (!this.getTitleName().equals("匹配问答")) {
//            Assert.fail("未能进入匹配问答页面");
//        }
//        this.clickQuestionView();
        this.clickSendQuestion();
        this.clickBtnLeft();
        this.waitElement(driver, qa_q_ico.get(0));
        if (qa_q_ico.size() != 1) {
            Assert.fail("匹配问答的数量不对");
        }
    }

    //3线男 我的个人问答
    public void myQuestion3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickMeIcon();
        this.waitElement(driver, memberinfo);
        this.swipeToUp(driver);
        this.clickMyQuestion3();
        this.waitElement(driver, title_name);
        log.info("判断是否进入我的匹配问答页面，且出现未答题提示");
        if (!this.doesWebElementExist(noquestion)) {
            Assert.fail("未做匹配问答时，没有出现提示");
        }
        this.clickAnswerQuetion();
        log.info("判读是否进入匹配问答页面");
        if (!this.getTitleName().equals("匹配问答")) {
            Assert.fail("未能进入匹配问答页面");
        }
        this.clickQuestionView();
        this.clickSendQuestion();
        this.clickBtnLeft();
        this.waitElement(driver, qa_q_ico.get(0));
        log.info("判断答题数量是否为1");
        if (qa_q_ico.size() != 1) {
            Assert.fail("匹配问答的数量不对");
        }
        this.clickAnswerQuestion();
        log.info("判读是否进入匹配问答页面");
        if (!this.getTitleName().equals("匹配问答")) {
            Assert.fail("未能进入匹配问答页面");
        }
        this.clickQuestionView();
        this.clickSendQuestion();
        this.clickBtnLeft();
        this.waitElement(driver, qa_q_ico.get(0));
        log.info("判断答题数量是否为2");
        if (qa_q_ico.size() != 2) {
            Assert.fail("匹配问答的数量不对");
        }
        this.clickBtnLeft();

        if (this.getQuestionNum() != 2) {
            Assert.fail("我的--匹配问答一项显示的数量不对");
        }
    }

    //    自我介绍
    public void myIntroduction3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickMeIcon();
        this.waitElement(driver, memberinfo);
//        this.swipeToUp(driver);
        this.clickIntroduction();
        this.waitElement(driver, title_name);
        log.info("判断是否进入 自我介绍 页面");
        if (!this.getTitleName().equals("录制语音介绍")) {
            Assert.fail("未能进入自我介绍页面");
        }
        this.longPressRecord(driver);
        if (!this.doesWebElementExist(record_again_button)) {
            Assert.fail("录制自我介绍失败");
        }
    }

    // 我的访客
    public void myVisitor3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickMeIcon();
        this.waitElement(driver, memberinfo);
        this.swipeToUp(driver);
        this.clickMyvisitor();
        this.waitElement(driver, title_name);
        log.info("判断是否进入 最近访客 页面");
        if (!this.getTitleName().equals("最近访客")) {
            Assert.fail("未能进入最近访客页面");
        }
    }

    //    我的标签
    public void myTag(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickMeIcon();
        this.waitElement(driver, mytag);
//        this.swipeToUp(driver);
        this.clickMyTag();
        log.info("判读是否进入 我的标签页面");
        if (!this.getTitleName().equals("我的标签")) {
            Assert.fail("未能进入“我的标签”页面");
        }
        this.clickMatch();
        if (!this.getTitleName().equals("匹配问答")) {
            Assert.fail("在“我的标签”页，点击“匹配问答”，未能进入“匹配问答”页面");
        }
    }

//    public void reciveLetter1(AndroidDriver driver) throws Exception {
//        this.manRegiste1(driver);
//        this.clickMeIcon();
//        this.clickMemberCenter();
//        this.clickReceiveLetter();
//        this.waitElement(driver, title_name);
//        this.upLoadPic(driver);
//        this.waitElement(driver, day1);
//        this.receiveLetterPrice1(driver);
//    }
//
//    public void migu(AndroidDriver driver) throws Exception {
//        this.manRegiste1(driver);
//        this.clickMeIcon();
//        this.clickMemberCenter();
//        this.clickMigu();
//        this.waitElement(driver, title_name);
//        log.info("判断是否进入咪咕动漫");
//        if (!this.getTitleName().contains("动漫")) {
//            Assert.fail("未进入咪咕动漫");
//        }
//    }
//
//    public void womanRegiste1(AndroidDriver driver) throws Exception {
//        this.clickWomen();
//        this.clickRegister();
//        this.waitElement(driver, title_name);
//        log.info("判断是否为完善资料，上传照片页面");
//        if (!this.getTitleName().equals("完善资料")) {
//            Assert.fail("女用户注册，第一个页面不为完善资料上传照片");
//        }
//        this.keyBack(driver);
//        this.clickIKnown();
//        this.waitElement(driver, title_name);
//        log.info("判断是否 进入 推荐附近人页面");
//        if (!this.getTitleName().equals("结识附近的新朋友")) {
//            Assert.fail("女用户注册，点击“知道了”后，未进入推荐附近人页面");
//        }
//        this.keyBack(driver);
//        this.waitElement(driver, title_name);
//        log.info("判断 是否 进入 招呼管家页面");
//        if (!this.getTitleName().equals("招呼管家")) {
//            Assert.fail("女用户 未进入招呼管家页面");
//        }
//        this.keyBack(driver);
//        this.waitElement(driver, topview);
//        log.info("判断是否进入缘分模块");
//        if (!this.getTopView().equals("缘分")) {
//            Assert.fail("登录成功后，未进入缘分模块");
//        }
//        if (this.doesWebElementExist(msg_close)) {
//            this.clickMsgClose();
//        }
//        log.pass(this.getUserID(driver));
//        this.clickBtnLeft();
//        this.clickBtnLeft();
//        this.clickTongChengIcon();
//    }
//
//    public void womenSayHi(AndroidDriver driver) throws Exception {
//        this.womanRegiste1(driver);
//        this.waitElement(driver, iv_user.get(0));
//        this.clickIVUser();
//        if (this.doesWebElementExist(tips)) {
//            this.clickMonitor1(driver);
//        }
////        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
//        this.waitElementLoad(driver, piccount);
////      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
//        this.clickMonitor1(driver);
//        this.waitElement(driver, user_name_text);
//        if (!this.doesWebElementExist(ask_button)) {
//            Assert.fail("未打招呼用户，进入空间后，无“打招呼”按钮");
//        }
//        this.clickAskBtn();
//        if (this.doesWebElementExist(tips)) {
//            this.clickMonitor1(driver);
//        }
////        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
//        this.waitElementLoad(driver, piccount);
////      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
//        this.clickMonitor1(driver);
//        this.waitElement(driver, user_name_text);
//        this.clickAskBtn();
//        if (this.doesWebElementExist(tips)) {
//            this.clickMonitor1(driver);
//        }
////        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
//        this.waitElementLoad(driver, piccount);
////      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
//        this.clickMonitor1(driver);
//        this.waitElement(driver, user_name_text);
//        this.clickAskBtn();
//        log.info("判断第三个人打招呼，是否出现 手机验证提示");
//        if (!this.doesWebElementExist(layout)) {
//            Assert.fail("女用户打招呼，超过2个后，未要求手机验证");
//        }
//    }
//
//    public void womenYuanFenZhuShou(AndroidDriver driver) throws Exception {
//        this.womanRegiste1(driver);
//        this.clickMailBoxIcon();
//        log.info("判断是否进入缘分小助手页面");
//        if (!this.getTitleName().equals("缘分小助手")) {
//            Assert.fail("未进入 缘分小助手页面");
//        }
//        this.clickOK();
//        log.info("判断开启缘分小助手后，是否进入信箱");
//        if (!this.getTitleName().equals("信箱")) {
//            Assert.fail("开启助手后，未进入 信箱页");
//        }
//        this.clickMeIcon();
//        this.clickMailBoxIcon();
//        log.info("判断开启缘分小助手后，重新进入信箱，是否不再显示 缘分小助手");
//        if (!this.getTitleName().equals("信箱")) {
//            Assert.fail("退出信箱后，重新点击“信箱”，未进入 信箱页");
//        }
//    }
//
//    public void womenMemberCenter(AndroidDriver driver) throws Exception {
//        this.womanRegiste1(driver);
//        this.clickMeIcon();
//        log.info("判断女用户是否无 会员中心");
//        if (this.doesWebElementExist(member_center)) {
//            Assert.fail("女用户登录，有“会员中心”");
//        }
//    }

    //      对对碰，免密开通及两次支付引导
    public void duiDuiPeng(AndroidDriver driver, String qudaohao, int beannum) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickduiduipeng(driver);
        log.info("判断点击“对对碰”后，是否弹出对对碰对话框");
        if (!this.doesWebElementExist(duiduipeng_dialog_bg)) {
            Assert.fail("点击右下角“对对碰”，没有弹出 对对碰 对话框");
        }
        this.clickBtnok();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.waitElement(driver, title_name);
        log.info("判断对对碰，点击“解锁”后，是否进入会员服务页面,且默认在 畅聊会员标签");
        if (!this.getTitleName().equals("会员服务")) {
            Assert.fail("对对碰，点击“解锁”，未能进入“会员服务”页");
        }
//        if (!this.doesWebElementExist(letter90)) {
//            Assert.fail("对对碰，点击解锁后，会员服务页未在“畅聊会员”标签");
//        }
        this.clickBtnLeft();
        this.waitElement(driver, topview);
        this.clickMeIcon();
        this.waitElement(driver, member_center);
        this.clickMemberCenter();
        log.info("判断初始豆币是不是0个");
        if (this.getBeanNum() != beannum) {
            Assert.fail("初始豆币个数和预期不一致");
        }
        this.clickBean();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickBeanVip();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickKaiTong();
        this.qianYueZhifubao(driver);
        this.clickCheck();
        log.info("判断开通免密后，是否提示开通成功");
        if (!this.doesWebElementExist(qianwang)) {
            Assert.fail("开通免密后，没有成功提示");
        }
        this.clickQianWang();
        log.info("判断第一次支付引导,付费组合及价格");
        if (!this.doesWebElementExist(service1)) {
            Assert.fail("开通免密后，第一次支付引导中，付费组合 不对");
        }
        if (!this.doesWebElementExist(price1)) {
            Assert.fail("开通免密后，第一次支付引导中，付费价格 不对");
        }
        this.clickBuYao();
        this.waitElement(driver, title_name);
        this.clickMeIcon();
        this.waitElement(driver, member_center);
        this.clickMemberCenter();
        log.info("判断初始豆币是不是增加4个");
        if (this.getBeanNum() != beannum + 4) {
            Assert.fail("豆币个数未增加4个");
        }
        this.clickBean();
        log.info("判断第二次支付引导,付费组合及价格");
        if (!this.doesWebElementExist(service2)) {
            Assert.fail("开通免密后，第二次支付引导中，付费组合 不对");
        }
        if (!this.doesWebElementExist(price2)) {
            Assert.fail("开通免密后，第二次支付引导中，付费价格 不对");
        }
        this.clickBuLiao();
        this.waitElement(driver, title_name);
        this.clickBtnLeft();
        this.clickBtnLeft();
        this.clickTongChengIcon();
        this.clickduiduipeng(driver);
        Thread.sleep(2000);
        log.info("判断开通免密后，对对碰中是否提示购买会员");
        if (!this.getOKText().equals("免密解锁：99元90天畅聊")) {
            Assert.fail("开通免密后，对对碰中提示信息未改变");
        }
    }
    //      写信包月，免密开通及两次支付引导
    public void letterMianMi(AndroidDriver driver, String qudaohao, int beannum) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickMeIcon();
        this.waitElement(driver, member_center);
        this.clickMemberCenter();
        log.info("判断初始豆币是不是0个");
        if (this.getBeanNum() != beannum) {
            Assert.fail("初始豆币个数和预期不一致");
        }
        this.clickWriteLetter();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickLetterVip();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickKaiTong();
        this.qianYueZhifubao(driver);
        this.clickCheck();
        log.info("判断开通免密后，是否提示开通成功");
        if (!this.doesWebElementExist(success)) {
            Assert.fail("开通免密后，没有成功提示");
        }
        this.clickQianWang();
        log.info("判断第一次支付引导");
        this.clickBuYao();
        this.waitElement(driver, personal_data);
        this.clickMeIcon();
        this.waitElement(driver, member_center);
        this.clickMemberCenter();
        log.info("判断初始豆币是不是增加4个");
        if (this.getBeanNum() != beannum + 4) {
            Assert.fail("豆币个数未增加4个");
        }
        this.clickWriteLetter();
        log.info("判断第二次支付引导");
        this.clickBuLiao();
        this.waitElement(driver, title_name);
        this.clickBtnLeft();
        this.clickBtnLeft();
        this.clickTongChengIcon();
        this.clickduiduipeng(driver);
        Thread.sleep(2000);
        log.info("判断开通免密后，对对碰中是否提示购买会员");
        if (!this.getOKText().equals("免密解锁：99元90天畅聊")) {
            Assert.fail("开通免密后，对对碰中提示信息未改变");
        }


    }
    //      皇冠特权，免密开通及两次支付引导
    public void vipMianMi(AndroidDriver driver, String qudaohao, int beannum) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickduiduipeng(driver);
        log.info("判断点击“对对碰”后，是否弹出对对碰对话框");
        if (!this.doesWebElementExist(duiduipeng_dialog_bg)) {
            Assert.fail("点击右下角“对对碰”，没有弹出 对对碰 对话框");
        }
        log.info("判断初始令牌数");
        if (!this.getToken().equals("您的令牌余额为：0")) {
            Assert.fail("初始令牌数不为0");
        }
        this.clickBtnok();
        log.info("判断点击“解锁”后，是否进入会员服务页面");
        if (!this.getTitleName().equals("会员服务")) {
            Assert.fail("未能进入“会员服务”页");
        }
        this.clickBtnLeft();
        this.waitElement(driver, topview);
        this.clickMeIcon();
        this.waitElement(driver, member_center);
        this.clickMemberCenter();
//        log.info("判断初始豆币是不是0个");
//        if (this.getBeanNum() != beannum) {
//            Assert.fail("初始豆币个数和预期不一致");
//        }
        this.clickVipTitle();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickNewVip();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickKaiTong();
        this.qianYueZhifubao(driver);
        this.clickCheck();
        log.info("判断开通免密后，是否提示开通成功");
        if (!this.doesWebElementExist(success)) {
            Assert.fail("开通免密后，没有成功提示");
        }
        this.clickQianWang();
        log.info("判断第一次支付引导");
        this.clickBuYao();
//        this.waitElement(driver, personal_data);
//        this.clickMeIcon();
//        this.waitElement(driver, member_center);
//        this.clickMemberCenter();
////        log.info("判断初始豆币是不是增加4个");
////        if (this.getBeanNum() != beannum + 4) {
////            Assert.fail("豆币个数未增加4个");
////        }
//        this.clickVipTitle();
//        log.info("判断第二次支付引导");
//        this.clickBuLiao();
//        this.waitElement(driver, title_name);
//        this.clickBtnLeft();
//        this.clickBtnLeft();
        this.clickTongChengIcon();
        this.clickduiduipeng(driver);
        Thread.sleep(2000);
        log.info("判断开通免密后，对对碰中令牌是否增加");
        if (!this.getToken().contains("3")) {
            Assert.fail("开通免密后，对对碰中令牌数未增加");
        }
        log.info("判断开通免密后，对对碰中是否提示购买会员");
        if (!this.getOKText().contains("开始")) {
            Assert.fail("开通免密后，对对碰中提示信息未改变");
        }
    }

    //    1线男，会员中心 可购买项
    public void getVipCenter() throws Exception {
        log.info("判断是否进会员中心");
        if (!this.getTitleName().equals("会员中心")) {
            Assert.fail("未进入会员中心页面");
        }
        log.info("判断是否有 豆币购买服务");
        if (!this.doesWebElementExist(bean)) {
            Assert.fail("豆币一项不存在");
        }
        log.info("判断是否有 写信包月服务");
        if (!this.doesWebElementExist(write_letters)) {
            Assert.fail("写信包月一项不存在");
        }
        log.info("判断是否有 星级服务");
        if (!this.doesWebElementExist(vip_title)) {
            Assert.fail("星级服务一项不存在");
        }
//        log.info("判断是否有 收信宝服务");
//        if (!this.doesWebElementExist(receive_letter)) {
//            Assert.fail("收信宝一项不存在");
//        }
//        log.info("判断是否有 咪咕联合会员服务");
//        if (!this.doesWebElementExist(migu)) {
//            Assert.fail("咪咕联合会员一项不存在");
//        }
    }

    //    1线男，会员中心 豆币报价
    public void beanPrice1(AndroidDriver driver) throws Exception {
        this.waitElement(driver, title_name);
        this.clickReload();
        if (this.doesWebElementExist(bean_vip)) {
            Assert.fail("1线男，豆币购买存在 0元签约");
        }
        if (!this.doesWebElementExist(bean800)) {
            Assert.fail("800语音豆不存在");
        }
        if (!this.getBean800Price().contains("￥99")) {
            Assert.fail("800语音豆价格有误");
        }
        if (!this.doesWebElementExist(bean550)) {
            Assert.fail("550语音豆不存在");
        }
        if (!this.getBean550Price().contains("￥89")) {
            Assert.fail("550语音豆价格有误");
        }
        this.clickBean800();
        this.waitElement(driver, title_name);
        log.info("判断800豆币，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("800豆币，支付宝无自动续费");
        }
        if (!this.doesWebElementExist(youhuijiage800)) {
            Assert.fail("800豆币，支付宝默认未勾选 自动续费，不为优惠后价格");
        }
        this.clickXufei();
        log.info("判断800豆币，支付宝取消 自动续费后，恢复为原价");
        if (!this.doesWebElementExist(yuanjia800)) {
            Assert.fail("800豆币，支付宝取消 自动续费后，不为原价");
        }
        this.clickKaiTong();
        log.info("判断800豆币，支付宝调起");
        this.waitElement(driver, alisure);
        if (!this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            Assert.fail("800豆币未启动支付宝");
        }
        this.clickAlipayBack();
        this.clickEnsure();
        this.waitElement(driver, alipay);
        this.keyBack(driver);
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("800豆币，微信支付 存在自动续费 选项");
        }
//        Thread.sleep(5000);
        this.clickKaiTong();
        Thread.sleep(5000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("800豆币未启动微信");
        }
        this.keyBack(driver);
        this.clickQueRen();
        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断800豆币，银联支付是否默认 价格优惠10元");
//        if(!this.doesWebElementExist(xufei)){
//            Assert.fail("800豆币，银联支付无自动续费");
//        }
        if (!this.doesWebElementExist(youhuijiage800)) {
            Assert.fail("800豆币，银联支付默认 不为优惠后价格");
        }
        this.clickBtnLeft();
        this.clickReload();
        this.clickBean550();
        this.waitElement(driver, title_name);
        log.info("判断550豆币，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("550豆币，支付宝无自动续费");
        }
        if (!this.doesWebElementExist(youhuijiage550)) {
            Assert.fail("550豆币，支付宝 默认未勾选 自动续费，不为优惠后价格");
        }
        this.clickXufei();
        log.info("判断550豆币，支付宝取消 自动续费后，恢复为原价");
        if (!this.doesWebElementExist(yuanjia550)) {
            Assert.fail("550豆币，支付宝 取消 自动续费后，不为原价");
        }
        this.clickKaiTong();
        log.info("判断550豆币，支付宝调起");
        this.waitElement(driver, alisure);
        if (!this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
//            System.out.println(this.getCurrentActivity(driver));
            Assert.fail("550豆币未启动支付宝");
        }
        this.clickAlipayBack();
        this.clickEnsure();
        this.waitElement(driver, alipay);
        this.keyBack(driver);
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("550豆币，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("550豆币未启动微信");
        }
        this.keyBack(driver);
        this.clickQueRen();
        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断550豆币，银联支付是否默认价格优惠10元");
        if (!this.doesWebElementExist(youhuijiage550)) {
            Assert.fail("550豆币，银联支付 默认不为优惠后价格");
        }
    }

    //    三线男豆币价格及支付调起
    public void beanPrice3(AndroidDriver driver) throws Exception {
        this.waitElement(driver, title_name);
        this.clickReload();
        this.waitElement(driver, title_name);
        log.info("判断3线,是否存在0元购");
        if (!this.doesWebElementExist(bean_vip)) {
            Assert.fail("3天vip0元购不存在");
        }
        log.info("判断3线,800豆币及价格");
        if (!this.doesWebElementExist(bean800_3)) {
            Assert.fail("800语音豆不存在");
        }

        if (!this.getBean800Price_3().contains("￥99")) {
            Assert.fail("800语音豆价格有误");
        }
        log.info("判断3线,550豆币及价格");
        if (!this.doesWebElementExist(bean550_3)) {
            Assert.fail("550语音豆不存在");
        }
        if (!this.getBean550Price_3().contains("￥89")) {
            Assert.fail("550语音豆价格有误");
        }
        this.clickBean800_3();
        this.waitElement(driver, title_name);
        log.info("判断800豆币，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("800豆币，支付宝无自动续费");
        }
        if (!this.doesWebElementExist(youhuijiage800)) {
            Assert.fail("800豆币，支付宝默认未勾选 自动续费，不为优惠后价格");
        }
        this.clickXufei();
        log.info("判断800豆币，支付宝取消 自动续费后，恢复为原价");
        if (!this.doesWebElementExist(yuanjia800)) {
            Assert.fail("800豆币，支付宝取消 自动续费后，不为原价");
        }
        this.clickKaiTong();
        log.info("判断800豆币，支付宝调起");
        this.waitElement(driver, alisure);
        if (!this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            Assert.fail("800豆币未启动支付宝");
        }
        this.clickAlipayBack();
        this.clickEnsure();
        this.waitElement(driver, alipay);
        this.keyBack(driver);
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("800豆币，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        log.info("判断800豆币，微信调起");
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
//            System.out.println(this.getCurrentActivity(driver));
            Assert.fail("800豆币未启动微信");
        }
        this.keyBack(driver);
        this.clickQueRen();
        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断800豆币，银联支付是否默认 价格优惠10元");
//        if(!this.doesWebElementExist(xufei)){
//            Assert.fail("800豆币，银联支付无自动续费");
//        }
        if (!this.doesWebElementExist(youhuijiage800)) {
            Assert.fail("800豆币，银联支付默认 不为优惠后价格");
        }
//        this.clickXufei();
//        if(!this.doesWebElementExist(yuanjia800)){
//            Assert.fail("800豆币，银联支付取消 自动续费后，不为原价");
//        }

        this.clickBtnLeft();
        this.clickReload();
        this.clickBean550_3();
        this.waitElement(driver, title_name);
        log.info("判断550豆币，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("550豆币，支付宝无自动续费");
        }
        if (!this.doesWebElementExist(youhuijiage550)) {
            Assert.fail("550豆币，支付宝 默认未勾选 自动续费，不为优惠后价格");
        }
        this.clickXufei();
        log.info("判断550豆币，支付宝取消 自动续费后，恢复为原价");
        if (!this.doesWebElementExist(yuanjia550)) {
            Assert.fail("550豆币，支付宝 取消 自动续费后，不为原价");
        }
        this.clickKaiTong();
        log.info("判断550豆币，支付宝调起");
        this.waitElement(driver, alisure);
        if (!this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
//            System.out.println(this.getCurrentActivity(driver));
            Assert.fail("550豆币未启动支付宝");
        }
        this.clickAlipayBack();
        this.clickEnsure();
        this.waitElement(driver, alipay);
        this.keyBack(driver);
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("550豆币，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        log.info("判断550豆币，微信调起");
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
//            System.out.println(this.getCurrentActivity(driver));
            Assert.fail("550豆币未启动微信");
        }
        this.keyBack(driver);
        this.clickQueRen();
        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断550豆币，银联支付是否默认价格优惠10元");
        if (!this.doesWebElementExist(youhuijiage550)) {
            Assert.fail("550豆币，银联支付 默认不为优惠后价格");
        }
    }

    //    1线男， 会员中心  写信包月报价
    public void letterPrice1(AndroidDriver driver) throws Exception {
        this.waitElement(driver, title_name);
        this.clickReload();
        this.waitElement(driver, title_name);
        if (this.doesWebElementExist(letter_vip)) {
            Assert.fail("1线男，写信包月存在0元签约");
        }
        if (!this.doesWebElementExist(letter90)) {
            Assert.fail("1线男，写信包月，90天畅聊不存在");
        }
        if (!this.getLetter90Price().contains("￥109")) {
            Assert.fail("1线男，写信包月，90天畅聊价格有误");
        }
        if (!this.doesWebElementExist(letter30)) {
            Assert.fail("1线男，写信包月，30天畅聊不存在");
        }
        if (!this.getLetter30Price().contains("￥89")) {
            Assert.fail("1线男，写信包月，30天畅聊价格有误");
        }
        if (!this.doesWebElementExist(letter7)) {
            Assert.fail("71线男，写信包月，天畅聊不存在");
        }
        if (!this.getLetter7Price().contains("￥69")) {
            Assert.fail("1线男，写信包月，7天畅聊价格有误");
        }
        this.clickLetter90();
        this.waitElement(driver, title_name);
        log.info("判断写信包月90天，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("一线男，写信包月90天，支付宝无自动续费");
        }
        if (!this.doesWebElementExist(youhuijiage90)) {
            Assert.fail("一线男，写信包月90天，支付宝默认未勾选 自动续费，不为优惠后价格");
        }
        this.clickXufei();
        log.info("判断写信包月90天，支付宝取消 自动续费后，恢复为原价");
        if (!this.doesWebElementExist(yuanjia90)) {
            Assert.fail("写信包月90天，支付宝取消 自动续费后，不为原价");
        }
        this.clickKaiTong();
        log.info("判断写信包月90天，支付宝调起");
        this.waitElement(driver, alisure);
        if (!this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            Assert.fail("90天畅聊未启动支付宝");
        }
        this.clickAlipayBack();
        this.clickEnsure();
        this.waitElement(driver, alipay);
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("写信包月90天，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("90天畅聊未启动微信");
        }
        this.keyBack(driver);
        this.clickQueRen();
        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断写信包月90天，银联支付是否默认价格优惠10元");
//        if(!this.doesWebElementExist(xufei)){
//            Assert.fail("写信包月90天，银联支付无自动续费");
//        }
        if (!this.doesWebElementExist(youhuijiage90)) {
            Assert.fail("写信包月90天，银联支付默认未勾选 自动续费，不为优惠后价格");
        }
//        this.clickXufei();
//        if(!this.doesWebElementExist(yuanjia90)){
//            Assert.fail("写信包月90天，银联支付取消 自动续费后，不为原价");
//        }
        this.clickBtnLeft();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.waitElement(driver, title_name);
        this.clickLetter30();
        this.waitElement(driver, title_name);
        log.info("判断写信包月30天，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("写信包月30天，支付宝无自动续费");
        }
        if (!this.doesWebElementExist(youhuijiage30)) {
            Assert.fail("写信包月30天，支付宝默认未勾选 自动续费，不为优惠后价格");
        }
        this.clickXufei();
        log.info("判断写信包月30天，支付宝 取消 自动续费，是否恢复原价");
        if (!this.doesWebElementExist(yuanjia30)) {
            Assert.fail("写信包月30天，支付宝取消 自动续费后，不为原价");
        }
        this.clickKaiTong();
        log.info("判断写信包月30天，支付宝调起");
        this.waitElement(driver, alisure);
        if (!this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            Assert.fail("30天畅聊未启动支付宝");
        }
//        this.keyBack(driver);
        this.clickAlipayBack();
        this.clickEnsure();
        this.waitElement(driver, alipay);
        this.keyBack(driver);
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("写信包月30天，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("30天畅聊未启动微信");
        }
        this.keyBack(driver);
        this.clickQueRen();
        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断写信包月30天，银联支付是否默认价格优惠10元");
//        if(!this.doesWebElementExist(xufei)){
//            Assert.fail("写信包月30天，银联支付无自动续费");
//        }
        if (!this.doesWebElementExist(youhuijiage30)) {
            Assert.fail("写信包月30天，银联支付默认未勾选 自动续费，不为优惠后价格");
        }
//        this.clickXufei();
//        if(!this.doesWebElementExist(yuanjia30)){
//            Assert.fail("写信包月30天，银联支付取消 自动续费后，不为原价");
//        }
        this.clickBtnLeft();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickLetter7();
        this.waitElement(driver, title_name);
        log.info("判断写信包月7天，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("写信包月7天，支付宝无自动续费");
        }
        if (!this.doesWebElementExist(youhuijiage7)) {
            Assert.fail("写信包月7天，支付宝默认未勾选 自动续费，不为优惠后价格");
        }
        this.clickXufei();
        log.info("判断写信包月7天，支付宝取消 自动续费，恢复原价");
        if (!this.doesWebElementExist(yuanjia7)) {
            Assert.fail("写信包月7天，支付宝取消 自动续费后，不为原价");
        }
        this.clickKaiTong();
        log.info("判断写信包月7天，支付宝调起");
        this.waitElement(driver, alisure);
        if (!this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            Assert.fail("7天畅聊未启动支付宝");
        }
//        this.keyBack(driver);
        this.clickAlipayBack();
        this.clickEnsure();
        this.waitElement(driver, alipay);
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("写信包月7天，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("7天未启动微信");
        }
        this.keyBack(driver);
        this.clickQueRen();
        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断写信包月7天，银联支付是否默认勾价格优惠10元");
        if (!this.doesWebElementExist(youhuijiage7)) {
            Assert.fail("写信包月7天，银联支付默认未勾选 自动续费，不为优惠后价格");
        }
    }

    //   3线男， 会员中心  写信包月报价
    public void letterPrice3(AndroidDriver driver) throws Exception {
        this.waitElement(driver, title_name);
        this.clickReload();
        this.waitElement(driver, title_name);
        log.info("判断3线写信包月0元购");
        if (!this.doesWebElementExist(letter_vip)) {
            Assert.fail("写信包月0元购不存在");
        }
        log.info("判断3线写信包月90天及价格");
        if (!this.doesWebElementExist(letter90_3)) {
            Assert.fail("90天畅聊不存在");
        }
        if (!this.getLetter90Price_3().contains("￥109")) {
            Assert.fail("90天畅聊价格有误");
        }
        log.info("判断3线写信包月30天及价格");
        if (!this.doesWebElementExist(letter30_3)) {
            Assert.fail("30天畅聊不存在");
        }
        if (!this.getLetter30Price_3().contains("￥89")) {
            Assert.fail("30天畅聊价格有误");
        }
        log.info("判断3线写信包月7天及价格");
        if (!this.doesWebElementExist(letter7_3)) {
            Assert.fail("7天畅聊不存在");
        }
        if (!this.getLetter7Price_3().contains("￥69")) {
            Assert.fail("7天畅聊价格有误");
        }
        this.clickLetter90_3();
        this.waitElement(driver, title_name);
        log.info("判断写信包月90天，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("写信包月90天，支付宝无自动续费");
        }
        if (!this.doesWebElementExist(youhuijiage90)) {
            Assert.fail("写信包月90天，支付宝默认未勾选 自动续费，不为优惠后价格");
        }
        this.clickXufei();
        log.info("判断写信包月90天，支付宝取消 自动续费后，恢复为原价");
        if (!this.doesWebElementExist(yuanjia90)) {
            Assert.fail("写信包月90天，支付宝取消 自动续费后，不为原价");
        }
        this.clickKaiTong();
        log.info("判断写信包月90天，支付宝调起");
        this.waitElement(driver, alisure);
        if (!this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            Assert.fail("写信包月90天，未启动支付宝");
        }
        this.clickAlipayBack();
        this.clickEnsure();
        this.waitElement(driver, alipay);
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("写信包月90天，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        log.info("判断写信包月90天，微信调起");
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("90天畅聊未启动微信");
        }
        this.keyBack(driver);
        this.clickQueRen();
        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断写信包月90天，银联支付是否默认价格优惠10元");
//        if(!this.doesWebElementExist(xufei)){
//            Assert.fail("写信包月90天，银联支付无自动续费");
//        }
        if (!this.doesWebElementExist(youhuijiage90)) {
            Assert.fail("写信包月90天，银联支付默认未勾选 自动续费，不为优惠后价格");
        }
//        this.clickXufei();
//        if(!this.doesWebElementExist(yuanjia90)){
//            Assert.fail("写信包月90天，银联支付取消 自动续费后，不为原价");
//        }
        this.clickBtnLeft();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.waitElement(driver, title_name);
        this.clickLetter30_3();
        this.waitElement(driver, title_name);
        log.info("判断写信包月30天，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("写信包月30天，支付宝无自动续费");
        }
        if (!this.doesWebElementExist(youhuijiage30)) {
            Assert.fail("写信包月30天，支付宝默认未勾选 自动续费，不为优惠后价格");
        }
        this.clickXufei();
        log.info("判断写信包月30天，支付宝 取消 自动续费，是否恢复原价");
        if (!this.doesWebElementExist(yuanjia30)) {
            Assert.fail("写信包月30天，支付宝取消 自动续费后，不为原价");
        }
        this.clickKaiTong();
//        Thread.sleep(5000);
        log.info("判断写信包月30天，支付宝调起");
        this.waitElement(driver, alisure);
        if (!this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            Assert.fail("30天畅聊未启动支付宝");
        }
//        this.keyBack(driver);
        this.clickAlipayBack();
        this.clickEnsure();
        this.waitElement(driver, alipay);
        this.keyBack(driver);
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("写信包月30天，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        log.info("判断写信包月30天，微信调起");
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("30天畅聊未启动微信");
        }
        this.keyBack(driver);
        this.clickQueRen();
        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断写信包月30天，银联支付是否默认价格优惠10元");
//        if(!this.doesWebElementExist(xufei)){
//            Assert.fail("写信包月30天，银联支付无自动续费");
//        }
        if (!this.doesWebElementExist(youhuijiage30)) {
            Assert.fail("写信包月30天，银联支付默认未勾选 自动续费，不为优惠后价格");
        }
//        this.clickXufei();
//        if(!this.doesWebElementExist(yuanjia30)){
//            Assert.fail("写信包月30天，银联支付取消 自动续费后，不为原价");
//        }
        this.clickBtnLeft();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickLetter7_3();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.waitElement(driver, title_name);
        log.info("判断写信包月7天，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("写信包月7天，支付宝无自动续费");
        }
        if (!this.doesWebElementExist(youhuijiage7)) {
            Assert.fail("写信包月7天，支付宝默认未勾选 自动续费，不为优惠后价格");
        }
        this.clickXufei();
        log.info("判断写信包月7天，支付宝取消 自动续费，恢复原价");
        if (!this.doesWebElementExist(yuanjia7)) {
            Assert.fail("写信包月7天，支付宝取消 自动续费后，不为原价");
        }
        this.clickKaiTong();
//        Thread.sleep(5000);
        log.info("判断写信包月7天，支付宝调起");
        this.waitElement(driver, alisure);
        if (!this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            Assert.fail("7天畅聊未启动支付宝");
        }
//        this.keyBack(driver);
        this.clickAlipayBack();
        this.clickEnsure();
        this.waitElement(driver, alipay);
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("写信包月7天，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        log.info("判断写信包月7天，微信调起");
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("7天畅聊未启动微信");
        }
        this.keyBack(driver);
        this.clickQueRen();
        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断写信包月7天，银联支付是否默认勾价格优惠10元");
//        if(!this.doesWebElementExist(xufei)){
//            Assert.fail("写信包月7天，银联支付无自动续费");
//        }
        if (!this.doesWebElementExist(youhuijiage7)) {
            Assert.fail("写信包月7天，银联支付默认未勾选 自动续费，不为优惠后价格");
        }
//        this.clickXufei();
//        if(!this.doesWebElementExist(yuanjia7)){
//            Assert.fail("写信包月7天，银联支付取消 自动续费后，不为原价");
//        }
    }

    //        1线男，会员中心 皇冠特权
    public void VipPrice1(AndroidDriver driver) throws Exception {
        this.waitElement(driver, title_name);
        this.clickReload();
        this.waitElement(driver, title_name);
        log.info("判断3线 皇冠特权中 0元签约");
        if (this.doesWebElementExist(newvip)) {
            Assert.fail("3线男，签约领取vip新手礼包不存在");
        }
        if (!this.doesWebElementExist(vip90)) {
            Assert.fail("90天vip不存在");
        }
        if (!this.getVip90price().contains("￥100")) {
            Assert.fail("90天vip价格错误");
        }
        if (!this.doesWebElementExist(vip30)) {
            Assert.fail("30天vip不存在");
        }
        if (!this.getVip30price().contains("￥50")) {
            Assert.fail("30天vip价格有误");
        }
        this.clickVip90();
        this.waitElement(driver, title_name);
        log.info("判断90天vip，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("90天vip，支付宝无自动续费");
        }
        if (!this.doesWebElementExist(youhuijiage_vip90)) {
            Assert.fail("90天vip，支付宝默认未勾选 自动续费，不为优惠后价格");
        }
        this.clickXufei();
        log.info("判断 90天vip，支付宝取消 自动续费，恢复原价");
        if (!this.doesWebElementExist(yuanjia_vip90)) {
            Assert.fail("90天vip，支付宝取消 自动续费后，不为原价");
        }
        this.clickXufei();
        this.clickKaiTong();
        log.info("判断90天vip，支付宝调起");
        this.waitElement(driver, alisure);
        if (!this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            Assert.fail("90天vip未启动支付宝");
        }
//        this.keyBack(driver);
        this.clickAlipayBack();
        this.clickEnsure();
        this.waitElement(driver, alipay);
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("90天vip，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("90天vip未启动微信");
        }
        this.keyBack(driver);
        this.clickQueRen();
        this.clickYinlianPay();
        this.waitElement(driver, title_name);
        log.info("判断90天vip，银联支付是否默认价格优惠10元");
//        if(!this.doesWebElementExist(xufei)){
//            Assert.fail("90天vip，银联支付无自动续费");
//        }
        if (!this.doesWebElementExist(youhuijiage_vip90)) {
            Assert.fail("90天vip，银联支付默认未勾选 自动续费，不为优惠后价格");
        }
//        this.clickXufei();
//        if(!this.doesWebElementExist(yuanjia_vip90)){
//            Assert.fail("90天vip，银联支付取消 自动续费后，不为原价");
//        }
        this.clickBtnLeft();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickVip30();
        this.waitElement(driver, title_name);
        this.clickReload();
        log.info("判断30天vip，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("30天vip，支付宝无自动续费");
        }
        if (!this.doesWebElementExist(youhuijiage_vip30)) {
            Assert.fail("30天vip，支付宝默认未勾选 自动续费，不为优惠后价格");
        }
        this.clickXufei();
        log.info("判断 30天vip，支付宝取消 自动续费，恢复原价");
        if (!this.doesWebElementExist(yuanjia_vip30)) {
            Assert.fail("30天vip，支付宝取消 自动续费后，不为原价");
        }
        this.clickXufei();
        this.clickKaiTong();
        log.info("判断30天vip，支付宝调起");
        this.waitElement(driver, alisure);
        if (!this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            Assert.fail("30天vip未启动支付宝");
        }
//        this.keyBack(driver);
        this.clickAlipayBack();
        this.clickEnsure();
        this.waitElement(driver, alipay);
        this.keyBack(driver);
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("30天vip，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("30天vip未启动微信");
        }
        this.keyBack(driver);
        this.clickQueRen();
        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断30天vip，银联支付是否默认价格优惠10元");
//        if(!this.doesWebElementExist(xufei)){
//            Assert.fail("30天vip，银联支付无自动续费");
//        }
        if (!this.doesWebElementExist(youhuijiage_vip30)) {
            Assert.fail("30天vip，银联支付默认未勾选 自动续费，不为优惠后价格");
        }
//        this.clickXufei();
//        if(!this.doesWebElementExist(yuanjia_vip30)){
//            Assert.fail("30天vip，银联支付取消 自动续费后，不为原价");
//        }
    }

    //    3线男 皇冠特权价格及支付调起
    public void VipPrice3(AndroidDriver driver) throws Exception {
        this.waitElement(driver, title_name);
        this.clickReload();
        this.waitElement(driver, title_name);
        log.info("判断3线 皇冠特权中 0元签约");
        if (!this.doesWebElementExist(newvip)) {
            Assert.fail("3线男，签约领取vip新手礼包不存在");
        }
        log.info("判断3线 皇冠特权中 90天vip及价格");
        if (!this.doesWebElementExist(vip90)) {
            Assert.fail("90天vip不存在");
        }
        if (!this.getVip90price().contains("￥100")) {
            Assert.fail("90天vip价格错误");
        }
        log.info("判断3线 皇冠特权中 30天vip及价格");
        if (!this.doesWebElementExist(vip30)) {
            Assert.fail("30天vip不存在");
        }
        if (!this.getVip30price().contains("￥50")) {
            Assert.fail("30天vip价格有误");
        }
        this.clickVip90();
        this.waitElement(driver, title_name);
        log.info("判断90天vip，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("90天vip，支付宝无自动续费");
        }
        if (!this.doesWebElementExist(youhuijiage_vip90)) {
            Assert.fail("90天vip，支付宝默认未勾选 自动续费，不为优惠后价格");
        }
        this.clickXufei();
        log.info("判断 90天vip，支付宝取消 自动续费，恢复原价");
        if (!this.doesWebElementExist(yuanjia_vip90)) {
            Assert.fail("90天vip，支付宝取消 自动续费后，不为原价");
        }
        this.clickXufei();
        this.clickKaiTong();
//        Thread.sleep(5000);
        log.info("判断90天vip，支付宝调起");
        this.waitElement(driver, alisure);
        if (!this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            Assert.fail("90天vip未启动支付宝");
        }
//        this.keyBack(driver);
        this.clickAlipayBack();
        this.clickEnsure();
        this.waitElement(driver, alipay);
        this.keyBack(driver);
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("90天vip，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        log.info("判断90天vip，微信调起");
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("90天vip未启动微信");
        }
        this.keyBack(driver);
        this.clickQueRen();
        this.clickYinlianPay();
        this.waitElement(driver, title_name);
        log.info("判断90天vip，银联支付是否默认价格优惠10元");
//        if(!this.doesWebElementExist(xufei)){
//            Assert.fail("90天vip，银联支付无自动续费");
//        }
        if (!this.doesWebElementExist(youhuijiage_vip90)) {
            Assert.fail("90天vip，银联支付默认未勾选 自动续费，不为优惠后价格");
        }
//        this.clickXufei();
//        if(!this.doesWebElementExist(yuanjia_vip90)){
//            Assert.fail("90天vip，银联支付取消 自动续费后，不为原价");
//        }
        this.clickBtnLeft();
        this.clickReload();
        this.clickVip30();
        this.waitElement(driver, title_name);
        log.info("判断30天vip，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("30天vip，支付宝无自动续费");
        }
        if (!this.doesWebElementExist(youhuijiage_vip30)) {
            Assert.fail("30天vip，支付宝默认未勾选 自动续费，不为优惠后价格");
        }
        this.clickXufei();
        log.info("判断 30天vip，支付宝取消 自动续费，恢复原价");
        if (!this.doesWebElementExist(yuanjia_vip30)) {
            Assert.fail("30天vip，支付宝取消 自动续费后，不为原价");
        }
        this.clickXufei();
        this.clickKaiTong();
//        Thread.sleep(5000);
        log.info("判断30天vip，支付宝调起");
        this.waitElement(driver, alisure);
        if (!this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            Assert.fail("30天vip未启动支付宝");
        }
//        this.keyBack(driver);
        this.clickAlipayBack();
        this.clickEnsure();
        this.waitElement(driver, alipay);
        this.keyBack(driver);
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("30天vip，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        log.info("判断30天vip，微信调起");
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("30天vip未启动微信");
        }
        this.keyBack(driver);
        this.clickQueRen();
        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断30天vip，银联支付是否默认价格优惠10元");
//        if(!this.doesWebElementExist(xufei)){
//            Assert.fail("30天vip，银联支付无自动续费");
//        }
        if (!this.doesWebElementExist(youhuijiage_vip30)) {
            Assert.fail("30天vip，银联支付默认未勾选 自动续费，不为优惠后价格");
        }
//        this.clickXufei();
//        if(!this.doesWebElementExist(yuanjia_vip30)){
//            Assert.fail("30天vip，银联支付取消 自动续费后，不为原价");
//        }
    }
//
//    //    1线男，会员中心 收信宝
//    public void receiveLetterPrice1(AndroidDriver driver) throws Exception {
//        if (!this.doesWebElementExist(day1)) {
//            Assert.fail("1天展示不存在");
//        }
//        if (!this.doesWebElementExist(day3)) {
//            Assert.fail("3天展示不存在");
//        }
//        if (!this.doesWebElementExist(day7)) {
//            Assert.fail("7天展示不存在");
//        }
//        if (!this.doesWebElementExist(day15)) {
//            Assert.fail("15天展示不存在");
//        }
//        if (!this.getDay1Price().equals("1天(80豆币/10元)")) {
//            Assert.fail("1天展示价格不对");
//        }
//        if (!this.getDay3Price().equals("3天(300豆币/30元)")) {
//            Assert.fail("3天展示价格不对");
//        }
//        if (!this.getDay7Price().equals("7天(600豆币/50元)")) {
//            Assert.fail("7天展示价格不对");
//        }
//        if (!this.getDay15Price().equals("15天(1300豆币/100元)")) {
//            Assert.fail("15天展示价格不对");
//        }
//        this.clickDay1();
//        this.waitElement(driver, title_name);
//        this.clickReload();
//        this.waitElement(driver, title_name);
//        this.clickMonitorPay(driver);
//        Thread.sleep(3000);
//        if (!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")) {
//            Assert.fail("1天展示未启动支付宝");
//        }
//        this.keyBack(driver);
//        this.waitElement(driver, title_name);
//        this.clickWecharPay();
//        this.waitElement(driver, title_name);
//        this.clickMonitorPay(driver);
//        Thread.sleep(2000);
//        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
//            Assert.fail("1天展示未启动微信");
//        }
//        this.keyBack(driver);
//        this.clickBtnLeft();
//        this.waitElement(driver, title_name);
//        this.clickReload();
//        this.clickDay3();
//        this.clickReload();
//        this.waitElement(driver, title_name);
//        this.clickMonitorPay(driver);
//        Thread.sleep(1000);
//        if (!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")) {
//            Assert.fail("3天展示未启动支付宝");
//        }
//        this.keyBack(driver);
//        this.clickWecharPay();
//        Thread.sleep(1000);
//        this.clickMonitorPay(driver);
//        Thread.sleep(1000);
//        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
//            Assert.fail("3天展示未启动微信");
//        }
//        this.keyBack(driver);
//        this.clickBtnLeft();
//        this.clickReload();
//        this.clickDay7();
//        this.clickReload();
//        Thread.sleep(1000);
//        this.clickMonitorPay(driver);
//        Thread.sleep(1000);
//        if (!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")) {
//            Assert.fail("7天展示未启动支付宝");
//        }
//        this.keyBack(driver);
//        this.clickWecharPay();
//        Thread.sleep(1000);
//        this.clickMonitorPay(driver);
//        Thread.sleep(1000);
//        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
//            Assert.fail("7天展示未启动微信");
//        }
//        this.keyBack(driver);
//        this.clickBtnLeft();
//        this.clickReload();
//        this.clickDay15();
//        this.clickReload();
//        Thread.sleep(1000);
//        this.clickMonitorPay(driver);
//        Thread.sleep(1000);
//        if (!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")) {
//            Assert.fail("15天展示未启动支付宝");
//        }
//        this.keyBack(driver);
//        this.clickWecharPay();
//        Thread.sleep(1000);
//        this.clickMonitorPay(driver);
//        Thread.sleep(1000);
//        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
//            Assert.fail("15天展示未启动微信");
//        }
//    }
//
//    //    上传头像
//    public void upLoadPic(AndroidDriver driver) throws Exception {
//        this.clickUploadPic();
//        this.clickLocalPic();
//        this.clickImg();
//        this.clickMonitorPic(driver);
//        this.clickImgOK();
//        this.swipeToDownPIC(driver);
//        this.clickImgSure();
//    }
//
//    //    获取用户id
//    private String getUserID(AndroidDriver driver) throws Exception {
//        this.clickMeIcon();
//        this.waitElement(driver, memberinfo);
//        this.swipeToUp(driver);
//        Thread.sleep(500);
//        this.swipeToUp(driver);
//        Thread.sleep(500);
//        this.waitElement(driver, setting);
//        this.clickSetting();
//        this.clickUserInfo();
//        return this.getUserInfoUserName();
//    }

    //    获取用户id
    private String getUserID(AndroidDriver driver) throws Exception {
        this.clickMeIcon();
        this.waitElement(driver, memberinfo);
        this.swipeToUp(driver);
        Thread.sleep(500);
        this.swipeToUp(driver);
        Thread.sleep(500);
        this.waitElement(driver, setting);
        this.clickSetting();
        this.clickUserInfo();
        return this.getUserInfoUserName();
    }

    //    3线 空间查看 视频，微信等，领取vip时进入会员购买页
    public void moreGetVip3(AndroidDriver driver) throws Exception {
        this.clickBtnok();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.waitElement(driver, title_name);
        log.info("判断点击领取vip，是否进入会员购买页面,");//且默认为 畅聊会员
        if (!this.getTitleName().equals("会员服务")) {
            Assert.fail("点击 领取vip服务，未进入会员服务页面");
        }
//        if (!this.doesWebElementExist(letter90)) {
//            Assert.fail("点击 领取vip服务，会员服务页未在“畅聊会员”标签");
//        }
        this.clickBtnLeft();
    }

    //    1线女登录
    public void womanLogin1(AndroidDriver driver, String qudaohao, String account, String password) throws Exception {
        this.clickTvBack();
        this.clickLogin();
        Thread.sleep(2000);
        this.clickMonitor(driver);
        this.clickTestEnv();
        this.clickProduct();
        this.clickTestEnv();
        this.clickHuluprep();
        this.updateQuDao(qudaohao);
        log.pass("渠道号：" + qudaohao);
        log.pass(this.getAddress());
        this.clickBtnSave();
        this.sendAccount(account);
        this.sendPassword(password);
        this.clickBtnLogin();
//        取消地理位置的切换
        if (this.doesWebElementExist(btn_cancel)) {
            this.clickCancle();
        }
        if (!this.getTopView().equals("缘分")) {
            Assert.fail("登录成功后，未进入缘分模块");
        }
    }

    //    3线女登录
    public void womanLogin3(AndroidDriver driver, String qudaohao, String account, String password) throws Exception {
        this.clickTvBack();
        this.clickLogin();
        Thread.sleep(2000);
        this.clickMonitor(driver);
        this.clickTestEnv();
        this.clickProduct();
        this.clickTestEnv();
        this.clickHuluprep();
        this.updateQuDao(qudaohao);
        log.pass("渠道号：" + qudaohao);
        log.pass(this.getAddress());
        this.clickBtnSave();
        this.sendAccount(account);
        this.sendPassword(password);
        this.clickBtnLogin();
//        取消地理位置的切换
        if (this.doesWebElementExist(btn_cancel)) {
            this.clickCancle();
        }
        if (!this.getTopView().equals("缘分")) {
            Assert.fail("登录成功后，未进入缘分模块");
        }
    }

    //    3线女用户打招呼
    public void womanSayHi3(AndroidDriver driver, String qudaohao, String account, String password) throws Exception {
        this.womanLogin3(driver, qudaohao, account, password);
        this.waitElement(driver, iv_user.get(0));
        this.clickIVUser();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        this.waitElement(driver, user_name_text);
        if (!this.doesWebElementExist(ask_button)) {
            Assert.fail("未打招呼用户，进入空间后，无“打招呼”按钮");
        }
        this.clickAskBtn();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        this.waitElement(driver, user_name_text);
        this.clickAskBtn();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        this.waitElement(driver, user_name_text);
        this.clickAskBtn();
        log.info("判断第三个人打招呼，是否出现 手机验证提示");
        if (this.doesWebElementExist(title_name)) {
            if (!this.getTitleName().equals("身份认证")) {
                Assert.fail("女用户打招呼，超过2个后，未要求身份认证");
            }
        } else if (!this.doesWebElementExist(layout)) {
            Assert.fail("女用户打招呼，超过2个后，未要求手机验证");
        }
    }

    //女用户 判断无付款入口
    public void womanMemberCenter3(AndroidDriver driver, String qudaohao, String account, String password) throws Exception {
        this.womanLogin3(driver, qudaohao, account, password);
        this.clickMeIcon();
        log.info("判断女用户是否无 会员中心");
        if (this.doesWebElementExist(member_center)) {
            Assert.fail("女用户登录，有“会员中心”");
        }
    }

    //    女用户 空间页 查看更多资料
    public void womanMore3(AndroidDriver driver, String qudaohao, String account, String password) throws Exception {
        this.womanLogin3(driver, qudaohao, account, password);
        this.waitElement(driver, iv_user.get(0));
        this.clickIVUser();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        this.waitElement(driver, user_name_text);
        this.swipeToUp(driver);
        Thread.sleep(1000);
        if (this.doesWebElementExist(more_button)) {
            this.clickMoreBtn();
            Thread.sleep(1000);
            log.info("判断是否无 升级提示，直接展开更多资料");
            if (!this.doesWebElementExist(more_text)) {
                Assert.fail("3线女，点击“更多详细资料”，未能展开更多资料详情");
            }
        } else {
            log.pass("该男用户无 更多资料");
        }
    }

    //    女用户 空间页 下方广告
    public void womanAdvertisement3(AndroidDriver driver, String qudaohao, String account, String password) throws Exception {
        this.womanLogin3(driver, qudaohao, account, password);
        this.waitElement(driver, iv_user.get(0));
        this.clickIVUser();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        this.waitElement(driver, user_name_text);
        this.swipeToUp(driver);
        Thread.sleep(1000);
        log.info("判断是否无 在线状态 入口");
        if (this.doesWebElementExist(online_status)) {
            Assert.fail("3线女，进入男用户空间页，下方存在 在线状态");
        }
        log.info("判断是否 有广告入口");
        if (!this.doesWebElementExist(advertiesment)) {
            Assert.fail("3线女，进入男用户空间页，下方不存在 广告");
        }
    }

    //    1线女 附近
    public void womanNear1(AndroidDriver driver, String qudaohao, String account, String password) throws Exception {
        this.womanLogin1(driver, qudaohao, account, password);
        this.clickNearIcon();
        this.near1(driver);
    }

    //    1线附近人判断方法
    public void near1(AndroidDriver driver) throws Exception {
        this.waitElement(driver, nearpeople);
        this.clickNearPeople();
        this.waitElement(driver, nearnickname.get(0));
        String name = this.getNearNickName();
        this.clickHello(0);
        this.clickNearHeadPhoto();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        this.waitElement(driver, user_name_text);
        log.info("判断搜索结果列表打招呼后，进入空间是否出现 “打招呼”");
        if (this.doesWebElementExist(ask_button)) {
            Assert.fail("在列表上点击“打招呼后”，进入空间页中，出现“打招呼”按钮");
        } else {
            log.info("空间页中无“打招呼”按钮");
        }
        log.info("判断搜索结果列表，点击头像进入空间，姓名是否一致");
        if (!name.equals(this.getUserNameText())) {
            Assert.fail("点击头像进入空间后，用户姓名不一致");
        }
    }




    public void manSecurity(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickMeIcon();
        this.waitElement(driver, memberinfo);
        this.swipeToUp(driver);
        Thread.sleep(1000);
        this.swipeToUp(driver);
        this.waitElement(driver, setting);
        this.clickSetting();
        this.clickSecurity();
        this.waitElement(driver, title_name);
        if (!this.getTitleName().equals("安全指南")) {
            Assert.fail("未成功进入安全指南页面");
        }
        this.clickJiuTuo();
        this.waitElement(driver, title_name);
        System.out.println(this.getJiuTuoHead());
        if (!this.getJiuTuoHead().equals("酒托")) {
            Assert.fail("未成功进入酒托页面");
        }
    }

    public void manHelp(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickMeIcon();
        this.waitElement(driver, memberinfo);
        this.swipeToUp(driver);
        Thread.sleep(1000);
        this.swipeToUp(driver);
        this.waitElement(driver, setting);
        this.clickSetting();
        this.clickHelp();
        this.waitElement(driver, title_name);
        this.clickReload();
        if (!this.getTitleName().contains("帮助")) {
            Assert.fail("未成功进入 帮助 页面");
        }
        this.waitElement(driver, title_name);
        this.sendSearchKey();
        this.clickSearch();
        this.clickTuiDing();
        this.waitElement(driver, title_name);
        if (!this.getTuiDingHead().contains("退订")) {
            Assert.fail("未成功进入 退订 页面");
        }
    }

    public void manKeFu(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickMeIcon();
        this.waitElement(driver, memberinfo);
        this.swipeToUp(driver);
        Thread.sleep(1000);
        this.swipeToUp(driver);
        this.waitElement(driver, setting);
        this.clickSetting();
        this.clickKeFu();
        this.waitElement(driver, title_name);
        if (!this.getTitleName().contains("在线客服")) {
            Assert.fail("未成功进入 在线客服 页面");
        }
        this.clickQuestion1();
        if (!this.doesWebElementExist(answer1)) {
            Assert.fail("点击第一个问题，未能出现回答");
        }
        if (!this.getAnswer1().contains("写信包月")) {
            Assert.fail("点击第一个问题，回答内容有误");
        }
    }

    public void manCustomCall(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.buyLetter3(driver);
        this.clickMeIcon();
//        点击左上角回退，跳出推荐
        this.clickBtnLeft();
        this.waitElement(driver, memberinfo);
        this.swipeToUp(driver);
        Thread.sleep(1000);
        this.swipeToUp(driver);
        this.waitElement(driver, setting);
        this.clickSetting();
        this.clickCustomCall();
        this.waitElement(driver, title_name);
        if (!this.getTitleName().contains("自定义招呼")) {
            Assert.fail("未成功进入 自定义招呼 页面");
        }
//        定义自定义招呼
        String customcall1 = "自定义招呼1";
        String customcall2 = "自定义招呼2";
        this.sendCustomCall(customcall1);
        this.clickCustomCallSubmitButton();
        this.waitElement(driver, title_name);
//        再次进入自定义招呼
        this.clickCustomCall();
        if (!this.getCustomCall().equals(customcall1)) {
            Assert.fail(" 自定义招呼 未提交成功");
        }
        this.sendCustomCall(customcall2);
        this.clickCustomCallSubmitButton();
        this.waitElement(driver, title_name);
//        再次进入自定义招呼
        this.clickCustomCall();
        if (!this.getCustomCall().equals(customcall2)) {
            Assert.fail(" 自定义招呼 未修改成功");
        }
    }

    public void manSayHILanjie3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.buyLetter3(driver);
        this.clickTVSayHello();
//        判断手机认证
        if (!this.doesWebElementExist(phoneauth)) {
            Assert.fail("三线男，购买写信包月后，缘分页打招呼未出现实名拦截");
        }
        this.keyBack(driver);
//       点击头像，进入空间
        this.clickIVUser();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        this.waitElement(driver, user_name_text);
        this.clickAskBtn();
//        空间页打招呼判断
        if (!this.doesWebElementExist(phoneauth)) {
            Assert.fail("三线男，购买写信包月后，空间页打招呼未出现实名拦截");
        }
        this.keyBack(driver);
//        判断是否能切换短信打招呼
        if (!this.doesWebElementExist(changebutton)) {
            Assert.fail("三线男，购买写信包月后，空间页无 切换 短信打招呼 按钮");
        }
        this.clickChangeButton();
        System.out.println(this.getAskButtonText());
//        短信打招呼与打招呼按钮在UI上重叠（ID不同），切换后，判断短信购买即可
//        if(!this.getAskButtonText().contains("短信打招呼")){
//            Assert.fail("三线男，购买写信包月后，点击切换按钮，未切换至短信打招呼功能");
//        }
        this.clickAskBtn();
//        判断短信打招呼 购买提示
        if (!this.doesWebElementExist(smpaydialog)) {
            Assert.fail("三线男，短信打招呼 未弹出购买提示");
        }
        this.clickSMPayDialogClose();
        this.swipeToUp(driver);
        this.waitElement(driver, more_button);
        if(this.doesWebElementExist(msg_close)){
            this.clickMsgClose();
        }
        this.clickMoreBtn();
        if (!this.doesWebElementExist(more_text)){
            Assert.fail("三线男，购买短信包月后，查看更多资料未展开");
        }
        this.keyBack(driver);
//        this.clickSearchIcon();
//        this.waitElement(driver, title_name);
//        if (!this.getTitleName().equals("会员福利")) {
//            Assert.fail("三线男，购买写信包月后,进入推荐模块，未进入会员福利 页面");
//        }
//        this.clickBtnLeft();
//        this.clickTuijianList1();
//        if (this.doesWebElementExist(tips)) {
//            this.clickMonitor1(driver);
//        }
////        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
//        this.waitElementLoad(driver, piccount);
////      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
//        this.clickMonitor1(driver);
//        this.waitElement(driver, user_name_text);
//        this.clickAskBtn();
////        空间页打招呼判断
//        if (!this.doesWebElementExist(phoneauth)) {
//            Assert.fail("三线男，购买写信包月后，推荐模块 空间页打招呼未出现实名拦截");
//        }
//        this.keyBack(driver);
////        判断是否能切换短信打招呼
//        if (!this.doesWebElementExist(changebutton)) {
//            Assert.fail("三线男，购买写信包月后，推荐模块 空间页无 切换 短信打招呼 按钮");
//        }
//        this.clickChangeButton();
////        if(!this.getAskButtonText().contains("打招呼")){
////            Assert.fail("三线男，购买写信包月后，推荐模块 点击切换按钮，未切换至短信打招呼功能");
////        }
//        this.clickAskBtn();
////        判断短信打招呼 购买提示
//        if (!this.doesWebElementExist(smpaydialog)) {
//            Assert.fail("三线男，推荐模块 短信打招呼 未弹出购买提示");
//        }
//        this.clickSMPayDialogClose();
//        this.keyBack(driver);
        this.clickNearIcon();
        this.waitElement(driver, title_name);
        if (!this.getTitleName().equals("会员福利")) {
            Assert.fail("三线男，购买写信包月后,进入附近模块，未进入会员福利 页面");
        }
        this.clickBtnLeft();
        this.clickMeIcon();
        this.waitElement(driver, title_name);
        if (!this.getTitleName().equals("会员福利")) {
            Assert.fail("三线男，购买写信包月后,进入 我 模块，未进入会员福利 页面");
        }
        this.clickBtnLeft();
        this.clickTongChengIcon();
        this.waitElement(driver, title_name);
        if (!this.getTitleName().equals("会员福利")) {
            Assert.fail("三线男，购买写信包月后,进入 缘分 模块，未进入会员福利 页面");
        }
        this.clickBtnLeft();
        this.clickMailBoxIcon();
        this.waitElement(driver, title_name);
        if (!this.getTitleName().equals("会员福利")) {
            Assert.fail("三线男，购买写信包月后,进入 信箱 模块，未进入会员福利 页面");
        }
        this.clickBtnLeft();
        if (!this.doesWebElementExist(receiver_letter_treasure_btn)) {
            Assert.fail("三线男，购买写信包月后,进入 信箱 模块，无 领取收信宝礼包提示");
        }
        this.clickReceiverLetterTreasureBtn();
//        this.keyBack(driver);
        this.swipeToUp(driver);
        Thread.sleep(1000);
        this.waitElement(driver, img_look.get(0));
        this.clickLook();
        this.waitElement(driver, title_name);
        this.clickMessageImage();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        Thread.sleep(1000);
        System.out.println(this.getPicCount());
        if (!this.getPicCount().contains("/1")) {
            log.info("判断3线男，在空间页中，查看女用户多张照片，是否提示会员购买");
            this.swipePic(driver);
//            this.swipePic(driver);
            Thread.sleep(1000);
            this.clickZonePic();
            if(this.doesWebElementExist(btn_ok)){
                Assert.fail("三线男，购买写信包月后,查看女用户多张照片，提示购买会员");
            }
            this.keyBack(driver);
        } else {
            log.pass("该女用户只有一张照片");
        }
        this.keyBack(driver);
        this.clickBtnLeft();
        this.clickAdmin(driver);
        if(!this.getTitleName().equals("管理员")){
            Assert.fail("未进入管理员 私信页面");
        }
//        向下滑动页面，防止多封信，支付成功通知被覆盖
        this.swipeToDown(driver);
        Thread.sleep(1000);
        if(!this.getMessageChatContent().contains("支付成功")){
            Assert.fail("一线男，购买写信包月后，管理员 未发送 支付成功私信");
        }
        this.keyBack(driver);

    }

    public void manSayHILanjie1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.buyLetter1(driver);
        this.clickTVSayHello();
//        判断手机认证
        if (!this.doesWebElementExist(phoneauth)) {
            Assert.fail("一线男，购买写信包月后，缘分页打招呼未出现实名拦截");
        }
        this.keyBack(driver);
//       点击头像，进入空间
        this.clickIVUser();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        this.waitElement(driver, user_name_text);
        this.clickAskBtn();
//        空间页打招呼判断
        if (!this.doesWebElementExist(phoneauth)) {
            Assert.fail("一线男，购买写信包月后，空间页打招呼未出现实名拦截");
        }
        this.keyBack(driver);
//        判断是否能切换短信打招呼
        if (!this.doesWebElementExist(changebutton)) {
            Assert.fail("一线男，购买写信包月后，空间页无 切换 短信打招呼 按钮");
        }
        this.clickChangeButton();
        System.out.println(this.getAskButtonText());
//        短信打招呼与打招呼按钮在UI上重叠（ID不同），切换后，判断短信购买即可
//        if(!this.getAskButtonText().contains("短信打招呼")){
//            Assert.fail("三线男，购买写信包月后，点击切换按钮，未切换至短信打招呼功能");
//        }
        this.clickAskBtn();
//        判断短信打招呼 购买提示
        if (!this.doesWebElementExist(smpaydialog)) {
            Assert.fail("一线男，短信打招呼 未弹出购买提示");
        }
        this.clickSMPayDialogClose();
        this.keyBack(driver);
//        this.clickSearchIcon();
//        this.waitElement(driver, title_name);
//        if (!this.getTitleName().equals("会员福利")) {
//            Assert.fail("一线男，购买写信包月后,进入搜索模块，未进入会员福利 页面");
//        }
//        this.clickBtnLeft();
//        this.waitElement(driver, topview);
//        this.clickHello(0);
//        if (!this.doesWebElementExist(phoneauth)) {
//            Assert.fail("一线男，购买写信包月后，进入搜索列表，打招呼未出现实名拦截");
//        }
//        this.keyBack(driver);
//        this.clickPhoto(0);
//        if (this.doesWebElementExist(tips)) {
//            this.clickMonitor1(driver);
//        }
////        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
//        this.waitElementLoad(driver, piccount);
////      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
//        this.clickMonitor1(driver);
//        this.waitElement(driver, user_name_text);
//        this.clickAskBtn();
////        空间页打招呼判断
//        if (!this.doesWebElementExist(phoneauth)) {
//            Assert.fail("一线男，购买写信包月后，搜索模块 空间页打招呼未出现实名拦截");
//        }
//        this.keyBack(driver);
////        判断是否能切换短信打招呼
//        if (!this.doesWebElementExist(changebutton)) {
//            Assert.fail("一线男，购买写信包月后，推荐模块 空间页无 切换 短信打招呼 按钮");
//        }
//        this.clickChangeButton();
//        this.clickAskBtn();
////        判断短信打招呼 购买提示
//        if (!this.doesWebElementExist(smpaydialog)) {
//            Assert.fail("一线男，推荐模块 短信打招呼 未弹出购买提示");
//        }
//        this.clickSMPayDialogClose();
//        this.keyBack(driver);
        this.clickNearIcon();
        this.waitElement(driver, title_name);
        if (!this.getTitleName().equals("会员福利")) {
            Assert.fail("一线男，购买写信包月后,进入附近模块，未进入会员福利 页面");
        }
        this.clickBtnLeft();
        this.clickNearPeople();
        this.waitElement(driver, nearnickname.get(0));
        this.clickHello(0);
        if (!this.doesWebElementExist(phoneauth)) {
            Assert.fail("一线男，购买写信包月后，附近模块 空间页打招呼未出现实名拦截");
        }
        this.keyBack(driver);
        this.clickNearHeadPhoto();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        this.waitElement(driver, user_name_text);
        this.clickAskBtn();
//        空间页打招呼判断
        if (!this.doesWebElementExist(phoneauth)) {
            Assert.fail("一线男，购买写信包月后，附近模块 空间页打招呼未出现实名拦截");
        }
        this.keyBack(driver);
//        判断是否能切换短信打招呼
        if (!this.doesWebElementExist(changebutton)) {
            Assert.fail("一线男，购买写信包月后，附近模块 空间页无 切换 短信打招呼 按钮");
        }
        this.clickChangeButton();
//        if(!this.getAskButtonText().contains("打招呼")){
//            Assert.fail("三线男，购买写信包月后，推荐模块 点击切换按钮，未切换至短信打招呼功能");
//        }
        this.clickAskBtn();
//        判断短信打招呼 购买提示
        if (!this.doesWebElementExist(smpaydialog)) {
            Assert.fail("一线男，附近模块 短信打招呼 未弹出购买提示");
        }
        this.clickSMPayDialogClose();
        this.keyBack(driver);
        this.clickMeIcon();
        this.waitElement(driver, title_name);
        if (!this.getTitleName().equals("会员福利")) {
            Assert.fail("三线男，购买写信包月后,进入 我 模块，未进入会员福利 页面");
        }
        this.clickBtnLeft();
        this.clickTongChengIcon();
        this.waitElement(driver, title_name);
        if (!this.getTitleName().equals("会员福利")) {
            Assert.fail("一线男，购买写信包月后,进入 缘分 模块，未进入会员福利 页面");
        }
        this.clickBtnLeft();
        this.clickMailBoxIcon();
        this.waitElement(driver, title_name);
        if (!this.getTitleName().equals("会员福利")) {
            Assert.fail("一线男，购买写信包月后,进入 信箱 模块，未进入会员福利 页面");
        }
        this.clickBtnLeft();
        if (!this.doesWebElementExist(receiver_letter_treasure_btn)) {
            Assert.fail("一线男，购买写信包月后,进入 信箱 模块，无 领取收信宝礼包提示");
        }
        this.clickReceiverLetterTreasureBtn();
        this.clickSayHello();
        //        判断短信打招呼 购买提示
        if (!this.doesWebElementExist(phoneauth)) {
            Assert.fail("一线男，信箱模块打招呼，未出现实名拦截");
        }
        this.keyBack(driver);
        this.clickAdmin(driver);
        if(!this.getTitleName().equals("管理员")){
            Assert.fail("未进入管理员 私信页面");
        }
//        向下滑动页面，防止多封信，支付成功通知被覆盖
        this.swipeToDown(driver);
        Thread.sleep(1000);
        if(!this.getMessageChatContent().contains("支付成功")){
            Assert.fail("一线男，购买写信包月后，管理员 未发送 支付成功私信");
        }

    }

    public void manBuyVip3(AndroidDriver driver, String qudaohao)throws Exception{
        this.manRegiste3(driver, qudaohao);
        this.buyVip3(driver);
        this.clickMeIcon();
        this.waitElement(driver, memberinfo);
        this.swipeToUp(driver);
        Thread.sleep(1000);
        this.swipeToUp(driver);
        this.waitElement(driver, setting);
        this.clickSetting();
//        退出后重新登录，会员中心才能看到 服务有效期
        this.clickChangeUser();
        this.clickBtnok();
        this.clickBtnLogin();
//        取消地理位置的切换
        if (this.doesWebElementExist(btn_cancel)) {
            this.clickCancle();
        }
//        取消头像上传
        if(this.doesWebElementExist(manuploaduserportraitcancle)){
            manuploaduserportraitcancle.click();
        }
        this.clickIVUser();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        this.waitElement(driver,user_name_text);
        this.swipeToUp(driver);
        Thread.sleep(1000);
        this.clickMoreBtn();
        if (!this.doesWebElementExist(more_text)){
            Assert.fail("三线男，购买30天vip后，查看更多资料未展开");
        }
        if(this.getOnlineStatus().contains("开通会员")){
            Assert.fail("三线男，购买30天vip后，无法查看 女用户在线状态");
        }
        this.keyBack(driver);
        this.clickMailBoxIcon();
        this.clickAdmin(driver);
        if(!this.getTitleName().equals("管理员")){
            Assert.fail("未进入管理员 私信页面");
        }
//        向下滑动页面，防止多封信，支付成功通知被覆盖
        this.swipeToDown(driver);
        Thread.sleep(1000);
        if(!this.getMessageChatContent().contains("支付成功")){
            Assert.fail("三线男，购买30天vip后，管理员 未发送 支付成功私信");
        }
        this.keyBack(driver);
        this.clickMeIcon();
        this.waitElement(driver, member_center);
        this.clickMemberCenter();
        if (!this.getMemberCenterVipExplain().contains(this.getDate())){
            Assert.fail("三线男，购买30天vip后，有效期显示不对");
        }

    }

//    public void manBuyBean3(AndroidDriver driver, String qudaohao)throws Exception{
//        this.manRegiste3(driver, qudaohao);
//        this.buyBean3(driver);
//        this.clickSearchIcon();
//        this.clickTuijianList1();
//        if (this.doesWebElementExist(tips)) {
//            this.clickMonitor1(driver);
//        }
////        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
//        this.waitElementLoad(driver, piccount);
////      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
//        this.clickMonitor1(driver);
//        this.waitElement(driver, user_name_text);
//        log.info("判断推荐女用户，是否有语音聊天按钮");
//        if (!this.doesWebElementExist(btn_video_chat)) {
//            Assert.fail("空间中不存在“语音聊天”按钮");
//        }
//        this.clickBtnVideoChat();
//        if (!this.doesWebElementExist(phoneauth)) {
//            Assert.fail("三线男，购买550豆币，空间页打招呼未出现实名拦截");
//        }
//        this.keyBack(driver);
//        this.waitElement(driver, user_name_text);
//        this.keyBack(driver);
//        this.clickMailBoxIcon();
//        this.clickAdmin(driver);
//        if(!this.getTitleName().equals("管理员")){
//            Assert.fail("未进入管理员 私信页面");
//        }
////        向下滑动页面，防止多封信，支付成功通知被覆盖
//        this.swipeToDown(driver);
//        Thread.sleep(1000);
//        if(!this.getMessageChatContent().contains("支付成功")){
//            Assert.fail("三线男，购买550豆币，管理员 未发送 支付成功私信");
//        }
//        this.keyBack(driver);
//        this.clickMeIcon();
//        this.waitElement(driver,member_center);
//        this.clickMemberCenter();
//        if(this.getBeanNum()!=550){
//            Assert.fail("三线男，购买550豆币，会员中心显示不对");
//        }
//    }

    public void buyLetter3(AndroidDriver driver) throws Exception {
        this.clickMeIcon();
        this.waitElement(driver, member_center);
        this.clickMemberCenter();
        this.clickWriteLetter();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickLetter7();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickKaiTong();
        this.fufeiZhifubao(driver);
//        三次回退，至 我 模块
        this.clickBtnLeft();
//        this.clickBuLiao();
        this.clickBtnLeft();
        this.clickBtnLeft();
        //      切换至 缘分模块（只有重新进入 我 ，购买项才生效）
        this.clickTongChengIcon();
        this.waitElement(driver, topview);
//
    }

    public void buyLetter1(AndroidDriver driver) throws Exception {
        this.clickMeIcon();
        this.waitElement(driver, member_center);
        this.clickMemberCenter();
        this.clickWriteLetter();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickLetter7();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickKaiTong();
        this.fufeiZhifubao(driver);
//        三次回退，至 我 模块
        this.clickBtnLeft();
//        this.clickBuLiao();
        this.clickBtnLeft();
        this.clickBtnLeft();
        //      切换至 缘分模块（只有重新进入 我 ，购买项才生效）
        this.clickTongChengIcon();
        this.waitElement(driver, mokuai.get(0));
    }

    public void buyVip3(AndroidDriver driver) throws Exception{
        this.clickMeIcon();
        this.waitElement(driver, member_center);
        this.clickMemberCenter();
        this.clickVipTitle();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickVip30();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickKaiTong();
        this.fufeiZhifubao(driver);
//        三次回退，至 我 模块
        this.clickBtnLeft();
//        this.clickBuLiao();
        this.clickBtnLeft();
        this.clickBtnLeft();
        //      切换至 缘分模块（只有重新进入 我 ，购买项才生效）
        this.clickTongChengIcon();
        this.waitElement(driver, topview);
    }

    public void buyBean3(AndroidDriver driver) throws Exception{
        this.clickMeIcon();
        this.waitElement(driver, member_center);
        this.clickMemberCenter();
        this.clickBean();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickBean550();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickKaiTong();
        this.fufeiZhifubao(driver);
//        三次回退，至 我 模块
        this.clickBtnLeft();
        this.clickBuLiao();
        this.clickBtnLeft();
        this.clickBtnLeft();
        //      切换至 缘分模块（只有重新进入 我 ，购买项才生效）
        this.clickTongChengIcon();
        this.waitElement(driver, topview);
    }


    public void registeNear3(AndroidDriver driver, String qudaohao)throws Exception{
        this.waitElement(driver,btn_men);
        this.clickTvBack();
        this.clickLogin();
        Thread.sleep(2000);
        this.clickMonitor(driver);
        this.clickTestEnv();
        this.clickProduct();
//        this.clickTestEnv();
//        this.clickHuluprep();
        this.updateQuDao(qudaohao);
        log.info("渠道号：" + qudaohao);
        this.clickAddress();
        this.swipeAddress(driver);
//        测试快速点击，跳过上海（停留在上海后，程序崩溃）
//        this.ttttt(driver);
        this.clickBtnok();
        log.pass(this.getAddress());
        this.clickBtnSave();
        this.clickLoginRegister();
        this.clickMen();
        this.clickRegister();
        this.waitElement(driver, near1);
        this.clickNear1();
        Thread.sleep(1000);
        if (!this.doesWebElementExist(head_map)) {
            Assert.fail("附近 点击头像，未弹出头像框");
        }
        if (!this.doesWebElementExist(tv_name_map)) {
            Assert.fail("头像框中无姓名");
        }
        if (!this.doesWebElementExist(tv_age_map)) {
            Assert.fail("头像框中无年龄");
        }
        if (!this.doesWebElementExist(tv_distance_map)) {
            Assert.fail("头像框中无距离");
        }
        this.clickNolike();
        if (this.doesWebElementExist(head_map)) {
            Assert.fail("点击不喜欢，未关闭头像框");
        }
        this.clickNear1();
        if (!this.doesWebElementExist(head_map)) {
            Assert.fail("附近 点击头像，未弹出头像框");
        }
        this.clickLike();
        if (this.doesWebElementExist(head_map)) {
            Assert.fail("点击喜欢，未关闭头像框");
        }
        this.clickNear1();
        String name = this.getNearNickName3();
        this.clickHeadmap();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        this.waitElement(driver, user_name_text);
//        log.info("判断打招呼后，进入空间，是否无打招呼按钮");
//        if (! this.doesWebElementExist(ask_button)) {
//            Assert.fail("进入空间页中，无“打招呼”按钮");
//        }
        log.info("判断 点击头像进入空间后，姓名是否一致");
        if (name.equals(this.getUserNameText())) {
            this.clickLeftBtn();
        } else {
            Assert.fail("点击头像进入空间后，用户姓名不一致");
        }
    }

}
