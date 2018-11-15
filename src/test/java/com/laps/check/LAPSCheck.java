package com.laps.check;

import com.aventstack.extentreports.ExtentTest;
import com.laps.method.ElementMethod;
import com.listener.ExtentTestNGITestListener;
import com.listener.WriteUserID;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;

public class LAPSCheck extends ElementMethod {
    ExtentTestNGITestListener el = new ExtentTestNGITestListener();
    ExtentTest log = el.getlog();
    WriteUserID wui=new WriteUserID();

    public void protocol() throws Exception {
        this.clickProtocol();
        if (!this.getTitleName().equals("注册协议")) {
            Assert.fail("点击注册页面下方“使用协议”，未进入注册协议页面");
        }
        this.clickBtnLeft();
        if (!this.doesWebElementExist(btn_men)) {
            Assert.fail("点击注册协议页面左上角返回，未返回注册界面");
        }
    }

    //    3线男注册
    public String manRegiste3(AndroidDriver driver, String qudaohao) throws Exception {
        this.clickLogin();
        Thread.sleep(2000);
        this.clickMonitor(driver);
        this.clickTestEnv();
        this.clickProduct();
//        this.clickTestEnv();
//        this.clickHuluprep();
        this.updateQuDao(qudaohao);
        this.clickAddress();
        this.swipeAddress(driver);
        this.clickBtnok();
        String address=this.getAddress();
        log.pass(address);
        this.clickSave();
        this.clickRegister();
        this.clickMen();
        this.clickBtnok();
        if(this.doesWebElementExist(btn_reg_dialog_reg)){
            this.clickLijireg();
        }
        this.waitElement(driver, title_name);
        if (!this.getTitleName().contains("附近")) {
            Assert.fail("三线男 注册后，未进入“附近”页面");
        }
        this.waitElement(driver, btn_left);
        this.clickBtnLeft();
        //5.5.9新新需求，双号弹出超级曝光页面
        log.info("判断新需求，超级曝光页是否弹出");
        if(this.doesWebElementExist(speed_dialog_title)){
            this.clickBtnSpeed();
        }
        this.waitElement(driver, mokuai.get(0));
//        log.info("判断是否进入缘分模块");
//        if (!this.getTopView().equals("缘分")) {
//            Assert.fail("登录成功后，未进入缘分模块");
//        }
        if (this.doesWebElementExist(msg_close)) {
            this.clickMsgClose();
        }
        String userid=this.getUserID(driver);
        wui.appendFile("E:\\LAPS.csv",this.getRegisterDate()+","+qudaohao+","+address+","+userid+"\r\n");
        log.pass(userid);
        this.clickBtnLeft();
        this.clickBtnLeft();
        this.clickYuanFenIcon();
        return userid;
    }

    //    1线男注册
    public String manRegiste1(AndroidDriver driver, String qudaohao) throws Exception {
        this.clickLogin();
        Thread.sleep(2000);
        this.clickMonitor(driver);
        this.clickTestEnv();
        this.clickProduct();
//        this.clickTestEnv();
//        this.clickHuluprep();
        this.updateQuDao(qudaohao);
        log.pass("渠道号：" + qudaohao);
//        this.clickAddress();
//        this.swipeAddress(driver);
//        this.clickBtnok();
        String address=this.getAddress();
        log.pass(address);
        this.clickSave();
        this.clickRegister();
        this.clickMen();
        this.clickBtnok();
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
        this.waitElement(driver, topview);
        log.info("判断是否进入缘分模块");
        if (!this.getTopView().equals("缘分")) {
            Assert.fail("注册成功后，未进入缘分模块");
        }
        if (this.doesWebElementExist(msg_close)) {
            this.clickMsgClose();
        }
        String userid=this.getUserID(driver);
        wui.appendFile("E:\\LAPS.csv",this.getRegisterDate()+","+qudaohao+","+address+","+userid+"\r\n");
        log.pass(userid);
        this.clickBtnLeft();
        this.clickBtnLeft();
        this.clickYuanFenIcon();
        return userid;
    }

    //      一线男 缘分页打招呼
    public void manSayHi1(AndroidDriver driver, String qudaohao) throws Exception {
        String userid = this.manRegiste1(driver, qudaohao);
        Integer user = new Integer(userid);
//        int user1 = Integer.parseInt(userid);
        log.info("判断注册ID号是否为双号");//针对双号策略生效
        if(user%2==0){
            if(!this.doesWebElementExist(tv_age.get(0))){
                Assert.fail("双号没有展示缘分页三列女用户策略");
            }
            this.waitElement(driver,iv_action.get(0));
            this.clickIVAction();
            String  age = this.getTVAge();
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
            log.info("判断 点击头像进入空间后，年龄是否一致");
            if (this.getMemberInfoText().contains(age)) {
                this.clickLeftBtn();
            } else {
                Assert.fail("点击头像进入空间后，用户年龄不一致");
            }
        }else{
            this.waitElement(driver, iv_sayhi.get(0));
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

    }
    //      三线男 缘分页打招呼
    public void manSayHi3(AndroidDriver driver, String qudaohao) throws Exception {
        String userid = this.manRegiste3(driver, qudaohao);
        Integer user = new Integer(userid);
//        int user1 = Integer.parseInt(userid);
        log.info("判断注册ID号是否为双号");//针对双号策略生效
        if(user%2==0){
            if(!this.doesWebElementExist(tv_age.get(0))){
                Assert.fail("双号没有展示缘分页三列女用户策略");
            }
            this.waitElement(driver,iv_action.get(0));
            this.clickIVAction();
            String  age = this.getTVAge();
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
            log.info("判断 点击头像进入空间后，年龄是否一致");
            if (this.getMemberInfoText().contains(age)) {
                this.clickLeftBtn();
            } else {
                Assert.fail("点击头像进入空间后，用户年龄不一致");
            }
        }else{
            this.waitElement(driver, iv_sayhi.get(0));
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

    }

    //      一线男 空间页打招呼 下一个
    public void askbtn(AndroidDriver driver, String qudaohao) throws Exception {
        String name1;
        String name2;
        this.manRegiste1(driver, qudaohao);
        this.waitElement(driver, iv_action.get(0));
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
        name1 = this.getUserNameText();
        this.clickAskBtn();
        /**
         * 5.5.9需求，女用户空间页打招呼后停留在当前页
         */

//        if (this.doesWebElementExist(tips)) {
//            this.clickMonitor1(driver);
//        }
////        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
//        this.waitElementLoad(driver, piccount);
////      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
//        this.clickMonitor1(driver);
//        this.waitElement(driver, user_name_text);
//        name2 = this.getUserNameText();
//        if (name1.equals(name2)) {
//            Assert.fail("在空间中点击“打招呼”按钮后，未跳转至另一用户");
//        }
//        this.clickNext();
//        if (this.doesWebElementExist(tips)) {
//            this.clickMonitor1(driver);
//        }
////        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
//        this.waitElementLoad(driver, piccount);
////      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
//        this.clickMonitor1(driver);
//        this.waitElement(driver, user_name_text);
//        name1 = this.getUserNameText();
//        if (name1.equals(name2)) {
//            Assert.fail("在空间中点击“下一个”按钮后，未跳转至另一用户");
//        }
        this.clickLeftBtn();
    }

    //    一线男关注
    public void conversation(AndroidDriver driver, String qudaohao) throws Exception {
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
        String name1 = this.getUserNameText();
        if (this.doesWebElementExist(msg_close)) {
            this.clickMsgClose();
        }
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
        int i = this.getConversationPersonNum();
        this.clickConversationPerson();
        int j = user_headphoto.size();
        String name2 = this.getConversationPersonName();
        log.info("判断关注的人的数量，与列表中人数是否一致");
        if (i != j) {
            Assert.fail("显示关注的人 数量，与实际列表中不一致");
        }
        log.info("判断实际关注的人，与列表中显示的人是否一致");
        if (!name1.equals(name2)) {
            Assert.fail("实际关注的人与列表显示关注的人，名字不一致");
        }
    }

    //    一线男拉黑
    public void notread(AndroidDriver driver, String qudaohao) throws Exception {
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
//        this.waitElement(driver, right_top);
        if (this.doesWebElementExist(msg_close)) {
            this.clickMsgClose();
        }
        this.clickRightTop();
        log.info("判断默认是否为 未拉黑状态");
        if (this.getNotread().equals("拉黑")) {
            this.clickNotread();
            this.clickBtnCancle();
            this.clickRightTop();
            log.info("判断拉黑确认界面，点击取消后，是否为未拉黑状态");
            if (this.getNotread().equals("拉黑")) {
                this.clickNotread();
                this.clickBtnok();
                this.clickRightTop();
                log.info("判断拉黑确认界面，点击确认后，是否为拉黑状态");
                if (this.getNotread().equals("取消拉黑")) {
                    this.clickNotread();
                    this.clickBtnCancle();
                    this.clickRightTop();
                    log.info("判断取消拉黑确认界面，点击取消后，是否为拉黑状态");
                    if (this.getNotread().equals("取消拉黑")) {
                        this.clickNotread();
                        this.clickBtnok();
                        this.clickRightTop();
                        log.info("判断取消拉黑确认界面，点击确认后，是否为未拉黑状态");
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

    //一线男举报
    public void upgraded(AndroidDriver driver, String qudaohao) throws Exception {
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
        this.clickRightTop();
        log.info("判断是否弹出举报信息提交界面");
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

    //一线男 在线状态
    public void onlineStatus1(AndroidDriver driver, String qudaohao) throws Exception {
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
        this.waitElement(driver, online_status);
        this.clickOnlineStatus();
        this.waitElement(driver, title_name);
        log.info("判断是否进入皇冠特权页面");
        if (!this.getTitleName().equals("皇冠特权")) {
            Assert.fail("未进入皇冠特权页面");
        }
    }

    //    3线男 在线状态
    public void onlineStatus3(AndroidDriver driver, String qudaohao) throws Exception {
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
        if (this.doesWebElementExist(video_view)) {
            this.clickVideoView();
            Thread.sleep(1000);
            log.info("判断是否弹出升级vip提示");
            if (!this.doesWebElementExist(dialog_bg)) {
                Assert.fail("点击“视频”，未弹出升级vip提示");
            }
            this.clickCancle();
            this.clickVideoView();
            this.moreGetVip3(driver);
        } else {
            log.warning("三线男，查看女用户空间，无 视频");
        }
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

    //    3线男 完善个人资料
    public void myPersonData3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickMeIcon();
        this.clickMemberInfo();
        this.clickHeight();
        this.clickBtnok();
        this.clickWeight();
        this.clickBtnok();
        this.swipeToUp(driver);
        Thread.sleep(1000);
        this.clickBloodType();
        this.clickBtnok();
        this.clickInfoSave();
        Thread.sleep(1000);
        this.clickProperty();
        this.swipeToUp(driver);
        Thread.sleep(1000);
        this.clickHobby();
        this.clickInfoSave();
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
        Thread.sleep(1000);
        this.clickOppositeSex();
        this.clickBtnok();
        this.clickQinmi();
        this.clickBtnok();
        this.clickParent();
        this.clickBtnok();
        this.clickChild();
        this.clickBtnok();
        this.clickInfoSave();
        this.waitElement(driver, memberinfo);
        this.clickMemberInfo();
        log.info("判断个人资料完善度");
        if (!this.getTitleName().contains("95%")) {
            Assert.fail("修改资料后，未生效");
        }
    }

    //    1线男 完善个人资料
    public void myPersonData1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickMeIcon();
        this.clickMemberInfo();
        this.clickHeight();
        this.clickBtnok();
        this.clickWeight();
        this.clickBtnok();
        this.swipeToUp(driver);
        Thread.sleep(1000);
        this.clickBloodType();
        this.clickBtnok();
        this.clickInfoSave();
        Thread.sleep(1000);
        this.clickProperty();
        this.swipeToUp(driver);
        Thread.sleep(1000);
        this.clickHobby();
        this.clickInfoSave();
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
        Thread.sleep(1000);
        this.clickOppositeSex();
        this.clickBtnok();
        this.clickQinmi();
        this.clickBtnok();
        this.clickParent();
        this.clickBtnok();
        this.clickChild();
        this.clickBtnok();
        this.clickInfoSave();
        this.waitElement(driver, memberinfo);
        this.clickMemberInfo();
        log.info("判断个人资料完善度");
        if (!this.getTitleName().contains("95%")) {
            Assert.fail("修改资料后，未生效");
        }
    }

    //   3线男  征友条件
    public void myCondition3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickMeIcon();
        this.waitElement(driver, memberinfo);
        this.swipeToUp(driver);
        this.waitElement(driver, body_item_1);
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
        this.clickInfoSave();
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
        this.clickYuanFenIcon();
        this.waitElement(driver, topview);
        this.swipeToDown(driver);
        this.waitElementInvisibility(header_content);
        log.info("判断缘分模块，推荐的用户，是否与征友条件中城市一致");
        for (int i = 0; i < 4; i++) {
            iv_user.get(i).click();
            if (this.doesWebElementExist(tips)) {
                this.clickMonitor1(driver);
            }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
            this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
            this.clickMonitor1(driver);
            this.waitElement(driver, user_name_text);
            if (!this.getMemberInfoText().contains(local_view)) {
                System.out.println(this.getMemberInfoText());
                Assert.fail("缘分页中,第" + (i + 1) + "个用户，地区与征友条件中不一致");
            }
            this.keyBack(driver);
        }
    }

    //   1线男  征友条件
    public void myCondition1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickMeIcon();
        this.waitElement(driver, memberinfo);
        this.swipeToUp(driver);
        this.waitElement(driver, body_item_1);
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
        this.clickInfoSave();
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
        this.clickYuanFenIcon();
        this.waitElement(driver, topview);
        this.swipeToDown(driver);
        this.waitElementInvisibility(header_content);
        log.info("判断缘分模块，推荐的用户，是否与征友条件中城市一致");
        for (int i = 0; i < 4; i++) {
            iv_user.get(i).click();
            if (this.doesWebElementExist(tips)) {
                this.clickMonitor1(driver);
            }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
            this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
            this.clickMonitor1(driver);
            this.waitElement(driver, user_name_text);
            if (!this.getMemberInfoText().contains(local_view)) {
                System.out.println(this.getMemberInfoText());
                Assert.fail("缘分页中,第" + (i + 1) + "个用户，地区与征友条件中不一致");
            }
            this.keyBack(driver);
        }
    }

    //   3线男 我的个人问答
    public void myQuestion3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickMeIcon();
        this.waitElement(driver, memberinfo);
        this.swipeToUp(driver);
        this.clickMyQuestion();
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
    }

    //   1线男 我的个人问答
    public void myQuestion1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickMeIcon();
        this.waitElement(driver, memberinfo);
        this.swipeToUp(driver);
        this.clickMyQuestion();
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
    }

    //    3线男 我的标签
    public void myTag3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickMeIcon();
        this.waitElement(driver, mytag);
        this.clickMyTag();
        log.info("判读是否进入 我的标签页面");
        if (!this.getTitleName().equals("我的标签")) {
            Assert.fail("未能进入“我的标签”页面");
        }
        this.clickMatch();
        log.info("判断 点击匹配问答后，是否进入匹配问答页面");
        if (!this.getTitleName().equals("匹配问答")) {
            Assert.fail("在“我的标签”页，点击“匹配问答”，未能进入“匹配问答”页面");
        }
    }

    //    1线男 我的标签
    public void myTag1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickMeIcon();
        this.waitElement(driver, memberinfo);
        this.swipeToUp(driver);
        Thread.sleep(1000);
        this.waitElement(driver, mytag);
        this.clickMyTag();
        log.info("判读是否进入 我的标签页面");
        if (!this.getTitleName().equals("我的标签")) {
            Assert.fail("未能进入“我的标签”页面");
        }
        this.clickMatch();
        log.info("判断 点击匹配问答后，是否进入匹配问答页面");
        if (!this.getTitleName().equals("匹配问答")) {
            Assert.fail("在“我的标签”页，点击“匹配问答”，未能进入“匹配问答”页面");
        }
    }

    //    自我介绍
    public void myIntroduction3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickMeIcon();
        this.waitElement(driver, memberinfo);
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
    //    我的访客
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
    //    诚信等级
    public void myIntegrity3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickMeIcon();
        this.waitElement(driver, memberinfo);
        this.swipeToUp(driver);
        this.clickIntegrity();
        this.waitElement(driver, title_name);
        log.info("判断是否进入 诚信等级 页面");
        if (!this.getTitleName().equals("诚信等级")) {
            Assert.fail("未能进入诚信等级页面");
        }
        log.info("判断 身份认证 功能");
        this.clickIdentity();
        if (!this.getTitleName().equals("身份认证")) {
            Assert.fail("未能进入身份认证页面");
        }
        this.clickBtnLeft();
        log.info("判断 手机认证 功能");
        this.clickPhone();
        if (!this.getTitleName().equals("手机认证")) {
            Assert.fail("未能进入手机认证页面");
        }
        this.clickBtnLeft();
        log.info("判断 上传照片 功能");
        this.clickPhoto();
        if (!this.doesWebElementExist(localpicture)) {
            Assert.fail("未能弹出上传照片窗口");
        }
        this.clickMonitor(driver);
        log.info("判断 资料 功能");
        this.clickInformation();
        if (!this.getTitleName().contains("完善资料")) {
            Assert.fail("未能进入完善资料页面");
        }


    }

    //    初始搜索条件
    public void initSearch(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickSearchIcon();
        this.initSeachCondition();
    }

    //    搜索城市
    public void seachArea(AndroidDriver driver, String qudaohao) throws Exception {
        String area;
        this.manRegiste1(driver, qudaohao);
        this.clickSearchIcon();
        this.waitElement(driver, topview);
        this.clickSearchBtn();
        this.waitElement(driver, title_name);
        this.clickAreaText();
        this.clickDown();
        this.clickBtnok();
        area = this.getAreaText();
        this.clickSaveBtn();
        this.waitElement(driver, topview);
        this.swipeToDown(driver);
        this.waitElementInvisibility(header_content);
        log.info("判断搜索结果中的城市是否符合");
        if (list_area.size() > 0) {
            for (int i = 0; i < list_area.size(); i++) {
                if (!list_area.get(i).getText().equals(area)) {
                    System.out.println(list_area.get(i).getText());
                    Assert.fail("结果列表中，出现不符合条件的城市信息");
                }
            }
        } else if (!this.doesWebElementExist(search_fragment_net_error_tv)) {
            Assert.fail("搜索无结果时，未提示未找到符合要求的人");
        }
    }

    //    搜索年龄
    public void seachAge(AndroidDriver driver, String qudaohao) throws Exception {
        String age;
        this.manRegiste1(driver, qudaohao);
        this.clickSearchIcon();
        this.waitElement(driver, topview);
        this.clickSearchBtn();
        this.waitElement(driver, title_name);
        this.clickAgeText();
        this.clickDown();
        this.clickBtnok();
        age = this.getAgeText();
        this.clickSaveBtn();
        this.waitElement(driver, topview);
        this.swipeToDown(driver);
        this.waitElementInvisibility(header_content);
//        System.out.println(list_age.size());
        log.info("判断搜索结果中的年龄是否符合");
        if (list_age.size() > 0) {
            for (int i = 0; i < list_age.size(); i++) {
                if (!list_age.get(i).getText().equals(age)) {
//                System.out.println(list_age.get(i).getText());
                    Assert.fail("结果列表中，出现不符合条件的年龄信息");
                }
            }
        } else if (!this.doesWebElementExist(search_fragment_net_error_tv)) {
            Assert.fail("搜索无结果时，未提示未找到符合要求的人");
        }
    }

    //    搜索身高
    public void seachHeight(AndroidDriver driver, String qudaohao) throws Exception {
        String height;
        this.manRegiste1(driver, qudaohao);
        this.clickSearchIcon();
        this.waitElement(driver, topview);
        this.clickSearchBtn();
        this.waitElement(driver, title_name);
        this.clickHeightText();
        this.clickHeightDown();
        this.clickBtnok();
        height = this.getHeightText();
        this.clickSaveBtn();
        this.waitElement(driver, topview);
        this.swipeToDown(driver);
        this.waitElementInvisibility(header_content);
//        System.out.println(list_age.size());
        log.info("判断搜索结果中的身高是否符合");
        if (list_height.size() > 0) {
            for (int i = 0; i < list_height.size(); i++) {
                if (!list_height.get(i).getText().equals(height)) {
//                System.out.println(list_age.get(i).getText());
                    Assert.fail("结果列表中，出现不符合条件的身高信息");
                }
            }
        } else if (!this.doesWebElementExist(search_fragment_net_error_tv)) {
            Assert.fail("搜索无结果时，未提示未找到符合要求的人");
        }
    }

    //  搜索全部
    public void seachAll(AndroidDriver driver, String qudaohao) throws Exception {
//        String area;
        this.manRegiste1(driver, qudaohao);
        this.clickSearchIcon();
        this.waitElement(driver, topview);
        this.clickSearchBtn();
        this.waitElement(driver, title_name);
        this.clickAreaText();
        this.clickDown();
        this.clickBtnok();
        this.clickAgeText();
        this.clickDown();
        this.clickBtnok();
        this.clickHeightText();
        this.clickHeightDown();
        this.clickBtnok();
//        area = this.getAreaText();
        this.clickSaveBtn();
        this.waitElement(driver, topview);
        this.swipeToDown(driver);
        this.waitElementInvisibility(header_content);
        log.info("判断搜索是否有结果或无结果提示");
        if (!this.doesWebElementExist(search_fragment_net_error_tv) && !this.doesWebElementExist(hello_btn.get(0))) {
            Assert.fail("搜索无结果时，无提示信息");
        }
    }

    //    搜索页面打招呼
    public void seachHello(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickSearchIcon();
        this.waitElement(driver, topview);
        this.clickHello(0);
        String name = this.getNickNmae(0);
        this.clickPhoto(0);
        Thread.sleep(1000);
        this.clickMonitor1(driver);
        Thread.sleep(1000);
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

    //    3线推荐
    public void tuijian3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickSearchIcon();
        this.clickTuijianList1();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        this.waitElement(driver, user_name_text);
        log.info("判断推荐女用户，是否有语音聊天按钮");
        if (!this.doesWebElementExist(btn_video_chat)) {
            Assert.fail("空间中不存在“语音聊天”按钮");
        }
        this.clickBtnVideoChat();
        log.info("判断点击语音聊天，是否进入会员购买页面 或 手机验证页面");
        if (this.getTitleName().equals("手机验证")) {
            this.clickJump();
            this.waitElement(driver, title_name);
            if (!this.getTitleName().equals("会员服务")) {
                Assert.fail("点击“语音聊天”，进入手机验证页面后，再点击 右下角跳过，未进入 会员购买页面");
            }
        } else if (!this.getTitleName().equals("会员服务")) {
            Assert.fail("点击“语音聊天”，未进入豆币购买页面");
        }
    }

    //    信箱
//    3线 信息未读数量
    public void mailboxNum3(AndroidDriver driver, String qudaohao) throws Exception {
        int letter_beforenum;
        int mailbox_beforenum;
        this.manRegiste3(driver, qudaohao);
        this.clickMailBoxIcon();
        this.waitElement(driver, personal_data);
        letter_beforenum = this.getLetterNum();
        mailbox_beforenum = this.getMailboxNum();
        log.info("判断信箱与私信上未读标示中数量是否一致");
        if (letter_beforenum != mailbox_beforenum) {
            Assert.fail("存在未读邮件时，‘私信’与‘信箱’显示不一致");
        }
        this.clickLook();
        this.waitElement(driver, btn_left);
        this.clickBtnLeft();
//        this.waitElement(driver, personal_data);
//        if (this.doesWebElementExist(letter_num)) {
//            Assert.fail("读取邮件后，上方未读标示未消失");
//        }
//        if (this.doesWebElementExist(mailbox_num)) {
//            Assert.fail("读取邮件后，下方未读标示未消失");
//        }

//        if(img_look.size()<5){
//            System.out.println(img_look.size());
//            Assert.fail("3线男收信数量不够");
//        }
    }

    //  1线 信息未读数量
    public void mailboxNum1(AndroidDriver driver, String qudaohao) throws Exception {
        int letter_beforenum;
        int mailbox_beforenum;
        this.manRegiste1(driver, qudaohao);
        this.clickMailBoxIcon();
        this.waitElement(driver, personal_data);
        letter_beforenum = this.getLetterNum();
        mailbox_beforenum = this.getMailboxNum();
        log.info("判断信箱与私信上未读标示中数量是否一致");
        if (letter_beforenum != mailbox_beforenum) {
            Assert.fail("存在未读邮件时，‘私信’与‘信箱’显示不一致");
        }
        this.clickLook();
        this.waitElement(driver, btn_left);
        this.clickBtnLeft();
//        this.waitElement(driver, personal_data);
//        if (this.doesWebElementExist(letter_num)) {
//            Assert.fail("读取邮件后，上方未读标示未消失");
//        }
//        if (this.doesWebElementExist(mailbox_num)) {
//            Assert.fail("读取邮件后，下方未读标示未消失");
//        }

//        if(img_look.size()<5){
//            System.out.println(img_look.size());
//            Assert.fail("3线男收信数量不够");
//        }
    }

    //    3线 信箱上方完善信息
    public void mailboxPersonData3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickMailBoxIcon();
        this.waitElement(driver, personal_data);
        this.clickPersonalData();
        this.waitElement(driver, title_name);
        log.info("判断 点击信箱上方 完善资料，是否进入 完善信息页面");
        if (!this.getTitleName().equals("完善信息")) {
            Assert.fail("点击“完善资料”，未进入“完善信息”页");
        }
    }

    //    1线 信箱上方完善信息
    public void mailboxPersonData1(AndroidDriver driver, String qudaohao) throws Exception {
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

    //    信箱三项
    public void mailbox(AndroidDriver driver, String qudaohao) throws Exception {
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

    //   收信里进入空间
    public void mailboxZone3(AndroidDriver driver, String qudaohao) throws Exception {
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

    //    空间里查看多张照片
    public void mailboxZonePic3(AndroidDriver driver, String qudaohao) throws Exception {
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

    //一线线男 会员中心可购买项
    public void VIP1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickMeIcon();
        this.clickMemberCenter();
        this.waitElement(driver, title_name);
        this.VipCenter();
    }
    //三线线男 会员中心可购买项
    public void VIP3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickMeIcon();
        this.clickMemberCenter();
        this.waitElement(driver, title_name);
        this.VipCenter();
    }

    //    三线男 豆币价格
    public void beanList3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickMeIcon();
        this.clickMemberCenter();
        this.clickBean();
        this.beanPrice3(driver);
    }

    //    一线男 豆币价格
    public void beanList1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickMeIcon();
        this.clickMemberCenter();
        this.clickBean();
        this.beanPrice1(driver);
    }

    //    三线男 写信包月价格
    public void letterList3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickMeIcon();
        this.clickMemberCenter();
        this.clickWriteLetter();
        this.letterPrice3(driver);
    }

    //    一线男 写信包月价格
    public void letterList1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickMeIcon();
        this.clickMemberCenter();
        this.clickWriteLetter();
        this.letterPrice1(driver);
    }

    //    三线男 皇冠特权
    public void VipList3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickMeIcon();
        this.clickMemberCenter();
        this.clickVipTitle();
        this.VipPrice3(driver);
    }

    //    1线男 皇冠特权
    public void VipList1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickMeIcon();
        this.clickMemberCenter();
        this.clickVipTitle();
        this.VipPrice1(driver);
    }

    //      对对碰，免密开通及两次支付引导
    public void duiDuiPeng3(AndroidDriver driver, String qudaohao, int beannum) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickduiduipeng(driver);
        log.info("判断点击“对对碰”后，是否弹出对对碰对话框");
        if (!this.doesWebElementExist(duiduipeng_dialog_bg)) {
            Assert.fail("点击右下角“对对碰”，没有弹出 对对碰 对话框");
        }
        this.clickBtnok();
        log.info("判断点击“解锁”后，是否进入会员服务页面");
        if (!this.getTitleName().equals("会员服务")) {
            Assert.fail("未能进入“会员服务”页");
        }
        this.clickBtnLeft();
        this.waitElement(driver, topview);
//        this.waitElement(driver, wancheng);
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
        this.clickCheck();
//        log.info("判断开通免密后，是否提示开通成功");
//        if (!this.doesWebElementExist(success)) {
//            Assert.fail("开通免密后，没有成功提示");
//        }
        this.clickQianWang();
        log.info("判断第一次支付引导");
        this.clickBuYao();
        this.waitElement(driver, title_name);
//        this.waitElement(driver, personal_data);
        this.clickMeIcon();
        this.waitElement(driver, member_center);
        this.clickMemberCenter();
        log.info("判断初始豆币是不是增加4个");
        if (this.getBeanNum() != beannum + 4) {
            Assert.fail("豆币个数未增加4个");
        }
        this.clickBean();
        log.info("判断第二次支付引导");
        this.clickBuLiao();
        this.waitElement(driver, title_name);
        this.clickBtnLeft();
        this.clickBtnLeft();
        this.clickYuanFenIcon();
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
//        this.clickduiduipeng(driver);
//        log.info("判断点击“对对碰”后，是否弹出对对碰对话框");
//        if (!this.doesWebElementExist(duiduipeng_dialog_bg)) {
//            Assert.fail("点击右下角“对对碰”，没有弹出 对对碰 对话框");
//        }
//        this.clickBtnok();
//        log.info("判断点击“解锁”后，是否进入会员服务页面");
//        if (!this.getTitleName().equals("会员服务")) {
//            Assert.fail("未能进入“会员服务”页");
//        }
//        this.clickBtnLeft();
//        this.waitElement(driver, topview);
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
        this.waitElement(driver, alisure);
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
        this.clickCheck();
//        log.info("判断开通免密后，是否提示开通成功");
//        if (!this.doesWebElementExist(success)) {
//            Assert.fail("开通免密后，没有成功提示");
//        }
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
        this.clickYuanFenIcon();
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
        this.waitElement(driver, alisure);
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
        this.clickCheck();
//        log.info("判断开通免密后，是否提示开通成功");
//        if (!this.doesWebElementExist(success)) {
//            Assert.fail("开通免密后，没有成功提示");
//        }
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
        this.clickYuanFenIcon();
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

    //    附近
//    1线男用户 附近
    public void manNear1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickNearIcon();
        this.waitElement(driver, nearpeople);
        this.clickNearPeople();
        this.near1(driver);
    }

    //    3线男用户 附近
    public void manNear3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickNearIcon();
//        this.waitElement(driver, nearpeople);
//        this.clickNearPeople();
        this.near3(driver);
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

    //  3线 附近的人判断方法
    public void near3(AndroidDriver driver) throws Exception {
//        this.clickNearIcon();
//        this.waitElement(driver, desc);
        this.clickNear();
//        this.clickImageView();
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
        this.clickNear();
//        this.clickImageView();
        if (!this.doesWebElementExist(head_map)) {
            Assert.fail("附近 点击头像，未弹出头像框");
        }
        this.clickLike();
        if (this.doesWebElementExist(head_map)) {
            Assert.fail("点击喜欢，未关闭头像框");
        }
        this.clickNear();
//        this.clickImageView();
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

    //    三线男 会员中心可以购买项
    public void VipCenter() throws Exception {
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
        log.info("判断是否有 收信宝服务");
        if (!this.doesWebElementExist(receive_letter)) {
            Assert.fail("收信宝一项不存在");
        }
    }

    //    1线男，会员中心 豆币报价
    public void beanPrice11(AndroidDriver driver) throws Exception {
        this.waitElement(driver, title_name);
        this.clickReload();
        if (this.doesWebElementExist(bean_vip)) {
            Assert.fail("1线男，豆币购买存在 0元签约");
        }
        if (!this.doesWebElementExist(bean800)) {
            Assert.fail("800语音豆不存在");
        }
//        if (!this.getBean800Price().contains("￥99")) {
//            Assert.fail("800语音豆价格有误");
//        }
        if (!this.doesWebElementExist(bean550)) {
            Assert.fail("550语音豆不存在");
        }
//        if (!this.getBean550Price().contains("￥89")) {
//            Assert.fail("550语音豆价格有误");
//        }
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
        //        2018年8月23版本变更
        this.clickQueRen();
//        this.waitElement(driver, title_name);
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
        //        2018年8月23版本变更
        this.clickQueRen();
//        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断550豆币，银联支付是否默认价格优惠10元");
        if (!this.doesWebElementExist(youhuijiage550)) {
            Assert.fail("550豆币，银联支付 默认不为优惠后价格");
        }
    }
    public void beanPrice1(AndroidDriver driver) throws Exception {
        this.waitElement(driver, title_name);
        this.clickReload();
        if (this.doesWebElementExist(bean_vip)) {
            Assert.fail("1线男，豆币购买存在 0元签约");
        }
        if (!this.doesWebElementExist(bean800)) {
            Assert.fail("800语音豆不存在");
        }
//        if (!this.getBean800Price().contains("￥99")) {
//            Assert.fail("800语音豆价格有误");
//        }
        if (!this.doesWebElementExist(bean550)) {
            Assert.fail("550语音豆不存在");
        }
//        if (!this.getBean550Price().contains("￥89")) {
//            Assert.fail("550语音豆价格有误");
//        }
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
        this.waitElement(driver,alisure);
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
        //        2018年8月23版本变更
        this.clickQueRen();
//        this.waitElement(driver, title_name);
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
        //        2018年8月23版本变更
        this.clickQueRen();
//        this.waitElement(driver, title_name);
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
        if (!this.doesWebElementExist(bean800)) {
            Assert.fail("800语音豆不存在");
        }

//        if (!this.getBean800Price_3().contains("￥99")) {
//            Assert.fail("800语音豆价格有误");
//        }
        log.info("判断3线,550豆币及价格");
        if (!this.doesWebElementExist(bean550)) {
            Assert.fail("550语音豆不存在");
        }
//        if (!this.getBean550Price_3().contains("￥89")) {
//            Assert.fail("550语音豆价格有误");
//        }
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
        this.clickKaiTong();
        Thread.sleep(5000);
        log.info("判断800豆币，微信调起");
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
//            System.out.println(this.getCurrentActivity(driver));
            Assert.fail("800豆币未启动微信");
        }
        this.keyBack(driver);
        //        2018年8月23版本变更
        this.clickQueRen();
//        this.waitElement(driver, title_name);
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
        log.info("判断550豆币，微信调起");
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
//            System.out.println(this.getCurrentActivity(driver));
            Assert.fail("550豆币未启动微信");
        }
        this.keyBack(driver);
        //        2018年8月23版本变更
        this.clickQueRen();
//        this.waitElement(driver, title_name);
        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断550豆币，银联支付是否默认价格优惠10元");
//        if(!this.doesWebElementExist(xufei)){
//            Assert.fail("550豆币，银联支付无自动续费");
//        }
        if (!this.doesWebElementExist(youhuijiage550)) {
            Assert.fail("550豆币，银联支付 默认不为优惠后价格");
        }
//        this.clickXufei();
//        if(!this.doesWebElementExist(yuanjia550)){
//            Assert.fail("550豆币，银联支付 取消 自动续费后，不为原价");
//        }
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
//        if (!this.getLetter90Price().contains("￥109")) {
//            Assert.fail("1线男，写信包月，90天畅聊价格有误");
//        }
        if (!this.doesWebElementExist(letter30)) {
            Assert.fail("1线男，写信包月，30天畅聊不存在");
        }
//        if (!this.getLetter30Price().contains("￥89")) {
//            Assert.fail("1线男，写信包月，30天畅聊价格有误");
//        }
        if (!this.doesWebElementExist(letter7)) {
            Assert.fail("1线男，写信包月，天畅聊不存在");
        }
//        if (!this.getLetter7Price().contains("￥69")) {
//            Assert.fail("1线男，写信包月，7天畅聊价格有误");
//        }
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
        //        2018年8月23版本变更
        this.clickQueRen();
//        this.waitElement(driver, title_name);
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
        //        2018年8月23版本变更
        this.clickQueRen();
//        this.waitElement(driver, title_name);
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
        //        2018年8月23版本变更
        this.clickQueRen();
//        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断写信包月7天，银联支付是否默认勾价格优惠10元");
//        if(!this.doesWebElementExist(xufei)){
//            Assert.fail("写信包月7天，银联支付无自动续费");
//        }
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
        if (!this.doesWebElementExist(letter90)) {
            Assert.fail("90天畅聊不存在");
        }
//        if (!this.getLetter90Price_3().contains("￥109")) {
//            Assert.fail("90天畅聊价格有误");
//        }
        log.info("判断3线写信包月30天及价格");
        if (!this.doesWebElementExist(letter30)) {
            Assert.fail("30天畅聊不存在");
        }
//        if (!this.getLetter30Price_3().contains("￥89")) {
//            Assert.fail("30天畅聊价格有误");
//        }
        log.info("判断3线写信包月7天及价格");
        if (!this.doesWebElementExist(letter7)) {
            Assert.fail("7天畅聊不存在");
        }
//        if (!this.getLetter7Price_3().contains("￥69")) {
//            Assert.fail("7天畅聊价格有误");
//        }
        this.clickLetter90();
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
        //        2018年8月23版本变更
        this.clickQueRen();
//        this.waitElement(driver, title_name);
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
        //        2018年8月23版本变更
        this.clickQueRen();
//        this.waitElement(driver, title_name);
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
        //        2018年8月23版本变更
        this.clickQueRen();
//        this.waitElement(driver, title_name);
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

    //1线男，会员中心 皇冠特权
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
        //        2018年8月23版本变更
        this.clickQueRen();
//        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        this.waitElement(driver, title_name);
        log.info("判断90天vip，银联支付是否默认价格优惠10元");
        if (!this.doesWebElementExist(youhuijiage_vip90)) {
            Assert.fail("90天vip，银联支付默认未勾选 自动续费，不为优惠后价格");
        }

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
        //        2018年8月23版本变更
        this.clickQueRen();
//        this.waitElement(driver, title_name);
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
            Assert.fail("签约领取vip新手礼包不存在");
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
        //        2018年8月23版本变更
        this.clickQueRen();
//        this.waitElement(driver, title_name);
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
        //        2018年8月23版本变更
        this.clickQueRen();
//        this.waitElement(driver, title_name);
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

    //    搜索条件初始验证
    public void initSeachCondition() {
        String area;
        String age;
        String height;
        if (!this.getTopView().equals("搜索")) {
            Assert.fail("未进入“搜索”模块");
        } else {
            log.info("成功进入“搜索”模块");
        }
        this.clickSearchBtn();
        if (this.getTitleName().equals("征友条件")) {
            log.info("成功进入搜索条件");
        } else {
            Assert.fail("未进入 搜索条件 页");
        }
        area = this.getAreaText();
        if (area.equals("不限制") || area.equals("不限")) {
            log.info("所在地 初始条件正确");
        } else {
            Assert.fail("所在地 初始条件 错误");
        }
        age = this.getAgeText();
        if (age.equals("不限制") || age.equals("不限")) {
            log.info("年龄初始条件正确");
        } else {
            Assert.fail("年龄初始条件错误");
        }
        height = this.getHeightText();
        if (height.equals("不限制") || height.equals("不限")) {
            log.info("身高初始条件正确");
        } else {
            Assert.fail("身高初始条件错误");
        }
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

    //    获取用户id
    private String getUserID(AndroidDriver driver) throws Exception {
        this.clickMeIcon();
        this.waitElement(driver, memberinfo);
        this.swipeToUp(driver);
        Thread.sleep(1000);
        this.swipeToUp(driver);
        this.waitElement(driver, setting);
        this.clickSetting();
        this.clickUserInfo();
        return this.getUserInfoUserName();
    }

    //    1线女用户注册
    public void womanRegiste1(AndroidDriver driver, String qudaohao) throws Exception {
        this.clickLogin();
        Thread.sleep(2000);
        this.clickMonitor(driver);
        this.clickTestEnv();
        this.clickProduct();
        this.clickTestEnv();
        this.clickHuluprep();
        this.updateQuDao(qudaohao);
        log.pass("渠道号：" + qudaohao);
//        this.clickAddress();
//        this.swipeAddress(driver);
//        this.clickBtnok();
        log.pass(this.getAddress());
        this.clickSave();
        this.clickRegister();
        this.clickWomen();
        this.clickBtnok();
        this.waitElement(driver, title_name);
        log.info("判断是否为完善资料，上传照片页面");
        if (!this.getTitleName().equals("完善资料")) {
            Assert.fail("女用户注册，第一个页面不为完善资料上传照片");
        }
        this.keyBack(driver);
        this.clickIKnown();
        this.waitElement(driver, title_name);
        log.info("判断是否 进入 推荐附近人页面");
        if (!this.getTitleName().equals("结识附近的新朋友")) {
            Assert.fail("女用户注册，点击“知道了”后，未进入推荐附近人页面");
        }
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        log.info("判断 是否 进入 招呼管家页面");
        if (!this.getTitleName().equals("招呼管家")) {
            Assert.fail("女用户 未进入招呼管家页面");
        }
        this.clickZhaoHuGuanJia();
        this.waitElement(driver, topview);
        log.info("判断是否进入缘分模块");
        if (!this.getTopView().equals("缘分")) {
            Assert.fail("登录成功后，未进入缘分模块");
        }
        log.pass(this.getUserID(driver));
        this.clickBtnLeft();
        this.clickBtnLeft();
        this.clickYuanFenIcon();
    }

    //  3线女用户注册
    public void womanRegiste3(AndroidDriver driver, String qudaohao) throws Exception {
        this.clickLogin();
        Thread.sleep(2000);
        this.clickMonitor(driver);
        this.clickTestEnv();
        this.clickProduct();
        this.clickTestEnv();
        this.clickHuluprep();
        this.updateQuDao(qudaohao);
        log.pass("渠道号：" + qudaohao);
        this.clickAddress();
        this.swipeAddress(driver);
        this.clickBtnok();
        log.pass(this.getAddress());
        this.clickSave();
        this.clickRegister();
        this.clickWomen();
        this.clickBtnok();
        this.waitElement(driver, title_name);
        log.info("判断是否为完善资料，上传照片页面");
        if (!this.getTitleName().equals("完善资料")) {
            Assert.fail("女用户注册，第一个页面不为完善资料上传照片");
        }
        this.keyBack(driver);
        this.clickIKnown();
        this.waitElement(driver, title_name);
        log.info("判断是否 进入 推荐附近人页面");
        if (!this.getTitleName().equals("结识附近的新朋友")) {
            Assert.fail("女用户注册，点击“知道了”后，未进入推荐附近人页面");
        }
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        log.info("判断 是否 进入 招呼管家页面");
        if (!this.getTitleName().equals("招呼管家")) {
            Assert.fail("女用户 未进入招呼管家页面");
        }
        this.clickZhaoHuGuanJia();
        this.waitElement(driver, topview);
        log.info("判断是否进入缘分模块");
        if (!this.getTopView().equals("缘分")) {
            Assert.fail("登录成功后，未进入缘分模块");
        }
        log.pass(this.getUserID(driver));
        this.clickBtnLeft();
        this.clickBtnLeft();
        this.clickYuanFenIcon();
    }

    //    1线女登录
    public void womanLogin1(AndroidDriver driver, String qudaohao, String account, String password) throws Exception {
        this.clickLogin();
        Thread.sleep(2000);
        this.clickMonitor(driver);
        this.clickTestEnv();
        this.clickProduct();
//        this.clickTestEnv();
//        this.clickHuluprep();
        this.updateQuDao(qudaohao);
        log.pass("渠道号：" + qudaohao);
//        this.clickAddress();
//        this.swipeAddress(driver);
//        this.clickBtnok();
        log.pass(this.getAddress());
        this.clickSave();
        this.sendAccount(account);
        this.sendPassword(password);
        this.clickBtnLogin();
//        取消地理位置的切换
        if(this.doesWebElementExist(btn_cancel)) {
            this.clickCancle();
        }
        if (!this.getTopView().equals("缘分")) {
            Assert.fail("登录成功后，未进入缘分模块");
        }
    }

    //    3线女登录
    public void womanLogin3(AndroidDriver driver, String qudaohao, String account, String password) throws Exception {
        this.clickLogin();
        Thread.sleep(2000);
        this.clickMonitor(driver);
        this.clickTestEnv();
        this.clickProduct();
//        this.clickTestEnv();
//        this.clickHuluprep();
        this.updateQuDao(qudaohao);
        log.pass("渠道号：" + qudaohao);
//        this.clickAddress();
//        this.swipeAddress(driver);
//        this.clickBtnok();
        log.pass(this.getAddress());
        this.clickSave();
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
        this.waitElement(driver, more_button);
        this.clickMoreBtn();
        Thread.sleep(1000);
        if(this.doesWebElementExist(more_button)) {
            this.clickMoreBtn();
            Thread.sleep(1000);
            log.info("判断是否无 升级提示，直接展开更多资料");
            if (!this.doesWebElementExist(more_text)) {
                Assert.fail("3线女，点击“更多详细资料”，未能展开更多资料详情");
            }
        }else{
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

    //    1线女 缘分小助手
    public void womanYuanfenZhuShou1(AndroidDriver driver, String qudaohao, String account, String password) throws Exception {
        this.womanLogin1(driver, qudaohao, account, password);
        this.clickMailBoxIcon();
        log.info("判断是否进入缘分小助手页面");
        if (!this.getTitleName().equals("缘分小助手")) {
            Assert.fail("未进入 缘分小助手页面");
        }
        this.clickOK();
        log.info("判断开启缘分小助手后，是否进入信箱");
        if (!this.getTitleName().equals("信箱")) {
            Assert.fail("开启助手后，未进入 信箱页");
        }
        this.clickMeIcon();
        this.clickMailBoxIcon();
        log.info("判断开启缘分小助手后，重新进入信箱，是否不再显示 缘分小助手");
        if (!this.getTitleName().equals("信箱")) {
            Assert.fail("退出信箱后，重新点击“信箱”，未进入 信箱页");
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

    //    3线女 附近
    public void womanNear3(AndroidDriver driver, String qudaohao, String account, String password) throws Exception {
        this.womanLogin3(driver, qudaohao, account, password);
        this.clickNearIcon();
        this.near3(driver);
    }

    //    1线女 附近
    public void womanNear1(AndroidDriver driver, String qudaohao, String account, String password) throws Exception {
        this.womanLogin1(driver, qudaohao, account, password);
        this.clickNearIcon();
        this.waitElement(driver, nearpeople);
        this.clickNearPeople();
        this.near1(driver);
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
        this.clickSearchIcon();
        this.waitElement(driver, title_name);
        if (!this.getTitleName().equals("会员福利")) {
            Assert.fail("三线男，购买写信包月后,进入推荐模块，未进入会员福利 页面");
        }
        this.clickBtnLeft();
        this.clickTuijianList1();
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
            Assert.fail("三线男，购买写信包月后，推荐模块 空间页打招呼未出现实名拦截");
        }
        this.keyBack(driver);
//        判断是否能切换短信打招呼
        if (!this.doesWebElementExist(changebutton)) {
            Assert.fail("三线男，购买写信包月后，推荐模块 空间页无 切换 短信打招呼 按钮");
        }
        this.clickChangeButton();
//        if(!this.getAskButtonText().contains("打招呼")){
//            Assert.fail("三线男，购买写信包月后，推荐模块 点击切换按钮，未切换至短信打招呼功能");
//        }
        this.clickAskBtn();
//        判断短信打招呼 购买提示
        if (!this.doesWebElementExist(smpaydialog)) {
            Assert.fail("三线男，推荐模块 短信打招呼 未弹出购买提示");
        }
        this.clickSMPayDialogClose();
        this.keyBack(driver);
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
        this.clickYuanFenIcon();
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
        this.clickSearchIcon();
        this.waitElement(driver, title_name);
        if (!this.getTitleName().equals("会员福利")) {
            Assert.fail("一线男，购买写信包月后,进入搜索模块，未进入会员福利 页面");
        }
        this.clickBtnLeft();
        this.waitElement(driver, topview);
        this.clickHello(0);
        if (!this.doesWebElementExist(phoneauth)) {
            Assert.fail("一线男，购买写信包月后，进入搜索列表，打招呼未出现实名拦截");
        }
        this.keyBack(driver);
        this.clickPhoto(0);
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
            Assert.fail("一线男，购买写信包月后，搜索模块 空间页打招呼未出现实名拦截");
        }
        this.keyBack(driver);
//        判断是否能切换短信打招呼
        if (!this.doesWebElementExist(changebutton)) {
            Assert.fail("一线男，购买写信包月后，推荐模块 空间页无 切换 短信打招呼 按钮");
        }
        this.clickChangeButton();
        this.clickAskBtn();
//        判断短信打招呼 购买提示
        if (!this.doesWebElementExist(smpaydialog)) {
            Assert.fail("一线男，推荐模块 短信打招呼 未弹出购买提示");
        }
        this.clickSMPayDialogClose();
        this.keyBack(driver);
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
        this.clickYuanFenIcon();
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

    public void manBuyBean3(AndroidDriver driver, String qudaohao)throws Exception{
        this.manRegiste3(driver, qudaohao);
        this.buyBean3(driver);
        this.clickSearchIcon();
        this.clickTuijianList1();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        this.waitElement(driver, user_name_text);
        log.info("判断推荐女用户，是否有语音聊天按钮");
        if (!this.doesWebElementExist(btn_video_chat)) {
            Assert.fail("空间中不存在“语音聊天”按钮");
        }
        this.clickBtnVideoChat();
        if (!this.doesWebElementExist(phoneauth)) {
            Assert.fail("三线男，购买550豆币，空间页打招呼未出现实名拦截");
        }
        this.keyBack(driver);
        this.waitElement(driver, user_name_text);
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
            Assert.fail("三线男，购买550豆币，管理员 未发送 支付成功私信");
        }
        this.keyBack(driver);
        this.clickMeIcon();
        this.waitElement(driver,member_center);
        this.clickMemberCenter();
        if(this.getBeanNum()!=550){
            Assert.fail("三线男，购买550豆币，会员中心显示不对");
        }
    }

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
//        三次回退，至 我 模块
        this.clickBtnLeft();
//        this.clickBuLiao();
        this.clickBtnLeft();
        this.clickBtnLeft();
        //      切换至 缘分模块（只有重新进入 我 ，购买项才生效）
        this.clickYuanFenIcon();
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
        this.waitElement(driver, mianmititle);
        this.clickMonitorAliMianMi(driver);
        this.clickMonitorAgreePay(driver);
        Thread.sleep(3000);
        this.clickAliPayNow();
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
        this.waitElement(driver, alipay);
        this.keyBack(driver);
//        三次回退，至 我 模块
        this.clickBtnLeft();
//        this.clickBuLiao();
        this.clickBtnLeft();
        this.clickBtnLeft();
        //      切换至 缘分模块（只有重新进入 我 ，购买项才生效）
        this.clickYuanFenIcon();
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
        this.waitElement(driver, mianmititle);
        this.clickMonitorAliMianMi(driver);
        this.clickMonitorAgreePay(driver);
        Thread.sleep(3000);
        this.clickAliPayNow();
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
//        三次回退，至 我 模块
        this.clickBtnLeft();
//        this.clickBuLiao();
        this.clickBtnLeft();
        this.clickBtnLeft();
        //      切换至 缘分模块（只有重新进入 我 ，购买项才生效）
        this.clickYuanFenIcon();
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
        this.waitElement(driver, mianmititle);
        this.clickMonitorAliMianMi(driver);
        this.clickMonitorAgreePay(driver);
        Thread.sleep(3000);
        this.clickAliPayNow();
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
//        三次回退，至 我 模块
        this.clickBtnLeft();
        this.clickBuLiao();
        this.clickBtnLeft();
        this.clickBtnLeft();
        //      切换至 缘分模块（只有重新进入 我 ，购买项才生效）
        this.clickYuanFenIcon();
        this.waitElement(driver, topview);
    }


    //    查看qq、微信
    public void wechar3(AndroidDriver driver, String qudaohao) throws Exception {
        this.evenUser3(driver, qudaohao);
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
        this.clickWXLook();
        Thread.sleep(1000);
        log.info("判断是否弹出升级vip提示");
        if (!this.doesWebElementExist(dialog_bg)) {
            Assert.fail("点击“查看微信”，未弹出升级vip提示");
        }
        this.moreGetVip3(driver);
    }

    public void qq3(AndroidDriver driver, String qudaohao) throws Exception {
        this.evenUser3(driver, qudaohao);
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
//        this.waitElement(driver, qq_look);
        this.clickQQLook();
        Thread.sleep(1000);
        log.info("判断是否弹出升级vip提示");
        if (!this.doesWebElementExist(dialog_bg)) {
            Assert.fail("点击“查看qq”，未弹出升级vip提示");
        }
        this.moreGetVip3(driver);
    }

    public void wechar1(AndroidDriver driver, String qudaohao) throws Exception {
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
        this.clickWXLook();
        log.info("判断是否弹出升级vip提示");
        if (!this.doesWebElementExist(dialog_bg)) {
            Assert.fail("点击“查看微信”，未弹出升级vip提示");
        }
        this.moreGetVip1(driver);
    }

    public void qq1(AndroidDriver driver, String qudaohao) throws Exception {
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
//        this.waitElement(driver, qq_look);
        this.clickQQLook();
        log.info("判断是否弹出升级vip提示");
        if (!this.doesWebElementExist(dialog_bg)) {
            Assert.fail("点击“查看QQ”，未弹出升级vip提示");
        }
        this.moreGetVip1(driver);
    }
    public void moreGetVip1(AndroidDriver driver) throws Exception {
        this.clickBtnok();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.waitElement(driver, title_name);
        log.info("判断点击升级vip，是否进入会员购买页面,且默认为 畅聊会员");
        if (!this.getTitleName().equals("会员服务")) {
            Assert.fail("点击 领取vip服务，未进入会员服务页面");
        }
        if (!this.doesWebElementExist(letter90)) {
            Assert.fail("点击 领取vip服务，会员服务页未在“畅聊会员”标签");
        }
        this.clickBtnLeft();
    }

    //    双号生活圈及视频
    public void space3(AndroidDriver driver, String qudaohao) throws Exception{
        this.evenUser3(driver,qudaohao);
        log.info("判断 三线男，双号用户是否有生活圈功能");
        if(!this.doesWebElementExist(tv_yuanfen_video)){
            Assert.fail("三线男，双号用户无 生活圈功能");
        }
        this.clickYuanfenVideo();
        String name1=this.getItemName();
//        点击，进行关注
        this.clickItemFollow();
        this.clickShortItem();
        this.clickMonitor1(driver);
        this.waitElement(driver,tv_video_space_name);
        log.info("判断列表中姓名与生活圈空间右上角姓名是否一致");
        if(!name1.equals(this.getVideoSpaceName())){
            Assert.fail("生活圈空间中 姓名与列表中姓名不一致");
        }
        this.clickVideoSpaceHead();
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
        this.clickRightTop();
//        在列表中已关注
        log.info("判断 默认是否为 “取消关注”");
        if (!this.getConversation().equals("取消关注")) {
            Assert.fail("用户空间中，不为已关注状态");
        }
        this.clickMonitor1(driver);
        if(!name1.equals(this.getUserNameText())){
            Assert.fail("用户空间中 姓名与列表中姓名不一致");
        }
        this.clickLeftTop();
        int zan_count=this.getVideoSpaceZanCount();
        this.clickVideoSpaceFollow();
        if (this.getVideoSpaceZanCount()!=zan_count-1){
            Assert.fail("在生活圈空间中，点击取消关注，关注数量未减少");
        }
        this.clickVideoSpaceFollow();
        if (this.getVideoSpaceZanCount()!=zan_count){
            Assert.fail("在生活圈空间中，点击关注，关注数量未增加");
        }
        this.clickVideoWithTa();
        this.waitElement(driver,title_name);
        if(!this.getTitleName().equals("会员服务")){
            Assert.fail("在生活圈空间中，点击语音，未进入会员购买页面");
        }
        this.clickBtnLeft();
        this.clickVideoSpaceBack();
        this.clickMeIcon();
        this.waitElement(driver, member_center);
        this.swipeToUp(driver);
        this.waitElement(driver, conversationperson);
        int i = this.getConversationPersonNum();
        this.clickConversationPerson();
        int j = user_headphoto.size();
        String name2 = this.getConversationPersonName();
        log.info("判断关注的人的数量，与列表中人数是否一致");
        if (i != j) {
            Assert.fail("显示关注的人 数量，与实际列表中不一致");
        }
        log.info("判断实际关注的人，与列表中显示的人是否一致");
        if (!name1.equals(name2)) {
            Assert.fail("实际关注的人与列表显示关注的人，名字不一致");
        }
        this.clickBtnLeft();
        this.clickMailBoxIcon();
//        this.waitElement(driver,sixin);
        if(!this.doesWebElementExist(maibox_video)){
            Assert.fail("双号用户，信箱中无 视频功能");
        }
        this.clickMaiboxVideo();
        this.clickTVHangup();
        this.keyBack(driver);
        this.waitElement(driver,btn_cancel);
        if(!this.getTVDesc().contains("支付宝红包未领取")){
            Assert.fail("双号用户，退出应用未出现支付宝拉新页面");
        }
    }

    //    注册双号用户
    public void evenUser3(AndroidDriver driver, String qudaohao) throws Exception {
        this.clickLogin();
        for (; ; ) {
            if (this.manID3(driver,qudaohao)) {
                this.clickBtnLeft();
                this.clickBtnLeft();
                this.clickYuanFenIcon();
                break;
            }else{
                this.clickBtnLeft();
                this.clickChangeUser();
                this.clickBtnok();
            }
        }
    }

    //    3线男ID
    public boolean manID3(AndroidDriver driver, String qudaohao) throws Exception {
        Thread.sleep(2000);
        this.clickMonitor(driver);
        this.clickTestEnv();
        this.clickProduct();
//        this.clickTestEnv();
//        this.clickHuluprep();
        this.updateQuDao(qudaohao);
        this.clickAddress();
        this.swipeAddress(driver);
        this.clickBtnok();
        String address=this.getAddress();
        log.pass(address);
        this.clickSave();
        this.clickRegister();
        this.clickMen();
        this.clickBtnok();
        this.waitElement(driver, title_name);
        if (!this.getTitleName().contains("附近")) {
            Assert.fail("三线男 注册后，未进入“附近”页面");
        }
        this.waitElement(driver, btn_left);
        this.clickBtnLeft();
//        this.waitElement(driver, topview);
        log.info("判断是否进入缘分模块");
        if (!this.doesWebElementExist(mokuai.get(0))) {
            Assert.fail("登录成功后，未进入缘分模块");
        }
//        if (this.doesWebElementExist(msg_close)) {
//            this.clickMsgClose();
//        }
        String ID1 = this.getUserID(driver);
        wui.appendFile("E:\\LAPS.csv",this.getRegisterDate()+","+qudaohao+","+address+","+ID1+"\r\n");
        int ID = Integer.parseInt(ID1);
        if (ID % 2 != 0) {
            return false;
        } else {
            return true;
        }
//        this.clickBtnLeft();
//        this.clickBtnLeft();
//        this.clickYuanFenIcon();
    }

    public void registeNear3(AndroidDriver driver, String qudaohao)throws Exception {
        this.clickLogin();
        Thread.sleep(2000);
        this.clickMonitor(driver);
        this.clickTestEnv();
        this.clickProduct();
//        this.clickTestEnv();
//        this.clickHuluprep();
        this.updateQuDao(qudaohao);
        this.clickAddress();
        this.swipeAddress(driver);
        this.clickBtnok();
        log.pass(this.getAddress());
        this.clickSave();
        this.clickRegister();
        this.clickMen();
        this.clickBtnok();
//        this.near3(driver);
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
