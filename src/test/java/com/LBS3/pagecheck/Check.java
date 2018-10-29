package com.LBS3.pagecheck;

import com.LBS3.pagemethod.Method;
import com.aventstack.extentreports.ExtentTest;
import com.listener.ExtentTestNGITestListener;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;

public class Check extends Method {

    ExtentTestNGITestListener el = new ExtentTestNGITestListener();
    ExtentTest log = el.getlog();
//    String userInfoUserName;


    public void checkLogin(AndroidDriver driver,String qudaohao) throws Exception{
        this.clickLogin();
        this.clickMonitor(driver);
        this.clickTestEnv();
        this.clickProduct();
        this.clickTestEnv();
        this.clickHuluprep();
        this.updateQuDao(qudaohao);
        this.clickAddress();
        this.swipeAddress(driver);
        this.clickOK();
        this.clickSave();
        this.clickRegist();
        this.clickMen();
        this.clickOK();
        Thread.sleep(30000);
        if(!this.getTitleName().equals("附近")){
            Assert.fail("3线男用户回答问题后，未进入附近推荐页面");
        }
        this.sendKeyBack(driver);
        if(!this.getTopView().equals("缘分")){
            Assert.fail("3线未能成功注册");
        }

//        userInfoUserName=this.getUserInfoUserName(driver);
        log.pass(this.getUserInfoUserName(driver));
//        String aaaa=this.getUserInfoUserName(driver);
//        System.out.println(aaaa);
//        Thread.sleep(30000);
        this.updataPassWord();
//        this.clickBtnLeft();
        this.clickBtnLeft();
//        Thread.sleep(5000);
        this.clickBtnLeft();
//        Thread.sleep(5000);
        this.clickYuanFen();
        Thread.sleep(5000);
//        Assert.fail("askdfjakdsjf");
    }

    public void checkSayHI1(AndroidDriver driver,String qudaohao) throws Exception{
        this.checkLogin(driver,qudaohao);
//        this.swipeToDown(driver);
//        this.clickMsgClose();
        this.clickSayHI1();
        String name = this.getTvName();
        this.clickImg1();
        Thread.sleep(1000);
        this.clickMonitor1(driver);
        Thread.sleep(1000);
        this.clickMonitor1(driver);
        if (this.doesWebElementExist(ask_button)) {
            Assert.fail("在列表上点击“打招呼后”，进入空间页中，出现“打招呼”按钮");
        }
        if (name.equals(this.getZoneName())) {
            this.clickLeftBtn();
        } else {
            Assert.fail("点击头像进入空间后，用户姓名不一致");
        }
//        this.clickBtnLeft();
//        final String userInfoUserName=this.getUserInfoUserName(driver);
//        System.out.println(userInfoUserName);
//        System.out.println(userInfoUserName);
//        this.updataPassWord();
    }

    public void checkAskBtn(AndroidDriver driver,String qudaohao) throws Exception{
        this.checkLogin(driver,qudaohao);
//        this.swipeToDown(driver);
        String name1;
        String name2;
//        this.clickMsgClose();
        this.clickImg2();
        this.clickMonitor1(driver);
        Thread.sleep(500);
        this.clickMonitor1(driver);
        Thread.sleep(500);
        if (!this.doesWebElementExist(ask_button)) {
            Assert.fail("未打招呼用户，进入空间后，无“打招呼”按钮");
        }
        name1 = this.getZoneName();
        this.clickAskBtn();
        Thread.sleep(1000);
        this.clickMonitor1(driver);
        Thread.sleep(500);
        name2 = this.getZoneName();
        if (name1.equals(name2)) {
            Assert.fail("在空间中点击“打招呼”按钮后，未跳转至另一用户");
        }
        name1 = this.getZoneName();
        this.clickNext();
        Thread.sleep(5000);
        this.clickMonitor1(driver);
        Thread.sleep(1000);
        this.clickMonitor1(driver);
        name2 = this.getZoneName();
        if (name1.equals(name2)) {
            Assert.fail("在空间中点击“下一个”按钮后，未跳转至另一用户");
        }
        this.clickLeftBtn();

        }

    public void checkConversation(AndroidDriver driver,String qudaohao) throws Exception{
       this.checkLogin(driver,qudaohao);
//        this.clickMsgClose();
        this.clickImg2();
        Thread.sleep(1000);
        this.clickMonitor1(driver);
        Thread.sleep(500);
        this.clickMonitor1(driver);
        Thread.sleep(500);
//        String name1=this.getZoneName();
        this.clickRightTop();
        if (this.getConversation().equals("关注")) {
            this.clickConversation();
            this.clickRightTop();
            if (this.getConversation().equals("取消关注")) {
                this.clickConversation();
                this.clickRightTop();
                if (this.getConversation().equals("关注")) {
                    this.clickConversation();
                    this.clickLeftBtn();
                }else{
                    Assert.fail("取消关注失败");
                }
            }else{
                Assert.fail("关注失败");
            }
        } else {
            Assert.fail("默认显示为“取消关注”");
        }
//        this.clickMeIcon();
//        Thread.sleep(500);
//        this.swipeToUp(driver);
//        Thread.sleep(500);
//        this.swipeToUp(driver);
//        Thread.sleep(500);
//        int i=this.getConversationPersonNum();
//        this.clickConversationPerson();
//        int j=user_headphoto.size();
//        String name2=this.getConversationPersonName();
//
//        if(i!=j){
//            Assert.fail("显示关注的人 数量，与实际列表中不一致");
//        }
//        if(!name1.equals(name2)){
//            Assert.fail("实际关注的人与列表显示关注的人，名字不一致");
//        }
    }

    public void checkNotread(AndroidDriver driver,String qudaohao) throws Exception{
        this.checkLogin(driver,qudaohao);
//        this.clickMsgClose();
        this.clickImg2();
        Thread.sleep(1000);
        this.clickMonitor1(driver);
        Thread.sleep(500);
        this.clickMonitor1(driver);
        Thread.sleep(1000);
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

    public void checkUpgraded(AndroidDriver driver,String qudaohao) throws Exception{
        this.checkLogin(driver,qudaohao);
//        this.clickMsgClose();
        this.clickImg2();
        Thread.sleep(1000);
        this.clickMonitor1(driver);
        Thread.sleep(1000);
        this.clickMonitor1(driver);
        Thread.sleep(1000);
        this.clickRightTop();
        if (this.getUpgraded().equals("举报")) {
            this.clickUpgraded();
            this.clickOther();
            this.clickSure();
            this.clickSure();
            this.clickLeftBtn();
        }else{
            Assert.fail("默认为被举报状态");
        }
    }

    public void checkOnlineStatus(AndroidDriver driver,String qudaohao)throws Exception{
        this.checkLogin(driver,qudaohao);
        this.swipeToDown(driver);
//        this.clickMsgClose();
        this.clickImg2();
        this.clickMonitor1(driver);
        this.clickMonitor1(driver);
        this.swipeToUp(driver);
        this.clickOnlineStatus();
        Thread.sleep(3000);
        if(!this.getTitleName().equals("皇冠特权")) {
            Assert.fail("未进入 特权页面");
        }
    }

    public void checkMore(AndroidDriver driver,String qudaohao)throws Exception{
        this.checkLogin(driver,qudaohao);
        this.clickImg1();
        Thread.sleep(5000);
        this.clickMonitor1(driver);
        Thread.sleep(500);
        this.clickMonitor1(driver);
        Thread.sleep(500);
        this.swipeToUp(driver);
        Thread.sleep(2000);
        this.clickMoreBtn();
        Thread.sleep(1000);
        if(!this.doesWebElementExist(dialog_bg)){
            Assert.fail("点击“更多详细资料”，未弹出升级vip提示");
        }
        this.clickCancle();
//        Thread.sleep(2000);
        this.clickVideoView();
        this.clickOK();
        if(!this.getTitleName().equals("会员服务")){
            Assert.fail("点击 领取vip服务，未进入会员服务页面");
        }
        this.clickMoreBtn();
        Thread.sleep(1000);
        this.clickOK();
        if(!this.getTitleName().equals("会员服务")){
            Assert.fail("点击 领取vip服务，未进入会员服务页面");
        }
        this.clickBtnLeft();
        this.clickOnlineStatus();
        Thread.sleep(2000);
        if(!this.getTitleName().equals("皇冠特权")){
            Assert.fail("点击 在线状态，未进入皇冠特权 页面");
        }
        this.clickBtnLeft();
    }

    public void checkTuijian(AndroidDriver driver,String qudaohao)throws Exception {
        this.checkLogin(driver,qudaohao);
        this.clickTuijian();
        this.clickTuijianList1();
        Thread.sleep(5000);
        this.clickMonitor1(driver);
        this.clickMonitor1(driver);
        if(!this.doesWebElementExist(btn_video_chat)){
            Assert.fail("空间中不存在“语音聊天”按钮");
        }
        this.clickBtnVideoChat();
        if (!this.getTitleName().equals("会员服务")){
            Assert.fail("点击“语音聊天”，未进入豆币购买页面");
        }
        this.clickReload();
        if(!this.doesWebElementExist(bean_vip)){
            Assert.fail("3天vip0元购不存在");
        }
        if(!this.doesWebElementExist(bean800)){
            Assert.fail("800语音豆不存在");
        }

        if(!this.getBean800Price().equals("￥99")){
            Assert.fail("800语音豆价格有误");
        }
        if(!this.doesWebElementExist(bean550)){
            Assert.fail("550语音豆不存在");
        }
        if(!this.getBean550Price().equals("￥89")){
            Assert.fail("550语音豆价格有误");
        }
        this.clickChangLiaoHuiYuan();
        Thread.sleep(3000);
        if(!this.doesWebElementExist(letter_vip)){
            Assert.fail("3天vip0元购不存在");
        }
        if(!this.doesWebElementExist(letter90)){
            Assert.fail("90天畅聊不存在");
        }

        if(!this.getLetter90Price().equals("￥109")){
            Assert.fail("90天畅聊价格有误");
        }
        if(!this.doesWebElementExist(letter30)){
            Assert.fail("30天畅聊不存在");
        }
        if(!this.getLetter30Price().equals("￥89")){
            Assert.fail("30天畅聊价格有误");
        }
        if(!this.doesWebElementExist(letter7)){
            Assert.fail("7天畅聊不存在");
        }
        if(!this.getLetter7Price().equals("￥69")){
            Assert.fail("7天畅聊价格有误");
        }

//        this.clickJump();
//        if(!this.getTitleName().equals("会员服务")){
//            Assert.fail("手机验证页面，点击“跳过”，未进入 会员服务 页面");
//        }
    }

    public void checkMailNum(AndroidDriver driver,String qudaohao)throws Exception{
        this.checkLogin(driver,qudaohao);
//        this.checkPersonalData(driver);
//        this.clickLogin();
//        System.out.println(userInfoUserName);
//        this.userLogin(userInfoUserName);
        int letter_beforenum;
        int letter_afternum;
        int mailbox_beforenum;
        int mailbox_afternum;

        this.clickMailBox();

        letter_beforenum=this.getLetterNum();
        mailbox_beforenum=this.getMailboxNum();
        System.out.println("----------------------------------------------------------------------");
        System.out.println(letter_beforenum);
        System.out.println("----------------------------------------------------------------------");
        if(letter_beforenum!=mailbox_beforenum){
            Assert.fail("存在未读邮件时，‘私信’与‘信箱’显示不一致");
        }
        String name1=this.getUsername();
        this.clickImgLook();
        String name2=this.getTitleName();
        if (!name1.equals(name2)){
            Assert.fail("查看邮件时，上方姓名与列表中姓名不一致");
        }
        this.clickBtnLeft();
//        letter_afternum=this.getLetterNum();
//        mailbox_afternum=this.getMailboxNum();
//        if(letter_afternum!=mailbox_afternum){
//            Assert.fail("读取一封邮件后，‘私信’与‘信箱’显示不一致");
//        }
    }

    public void checkNear(AndroidDriver driver)throws Exception{
        this.clickLogin();
        this.clickMonitor(driver);
        this.clickTestEnv();
        this.clickProduct();
        this.clickTestEnv();
        this.clickHuluprep();
        this.clickAddress();
        this.swipeAddress(driver);
        this.clickOK();
        this.clickSave();
        this.clickRegist();
        this.clickMen();
        this.clickOK();
        Thread.sleep(20000);
        this.sendKeyBack(driver);
//        this.checkLogin(driver,qudaohao);
        this.clickNearIcon();
        Thread.sleep(10000);

        this.clickImageView();
        if(!this.doesWebElementExist(head_map)){
            Assert.fail("附近 点击头像，未弹出头像框");
        }
        if(!this.doesWebElementExist(tv_name_map)){
            Assert.fail("头像框中无姓名");
        }
        if(!this.doesWebElementExist(tv_age_map)){
            Assert.fail("头像框中无年龄");
        }
        if(!this.doesWebElementExist(tv_distance_map)){
            Assert.fail("头像框中无距离");
        }

        this.clickNolike();
        if(this.doesWebElementExist(head_map)){
            Assert.fail("点击不喜欢，未关闭头像框");
        }
        this.clickImageView();
        if(!this.doesWebElementExist(head_map)){
            Assert.fail("附近 点击头像，未弹出头像框");
        }
        this.clickLike();
        if(this.doesWebElementExist(head_map)){
            Assert.fail("点击喜欢，未关闭头像框");
        }
    }

    private String getUserInfoUserName(AndroidDriver driver) throws Exception{
        this.clickMeIcon();
        this.clickMsgClose();
//        Thread.sleep(30000);
        this.swipeToUp(driver);
        Thread.sleep(1000);
        this.clickSetting();
        this.clickUserInfo();
        return this.getUserInfoUserName();

    }
    public void checkPersonalData(AndroidDriver driver) throws Exception{
        this.clickMeIcon();
//        this.clickMsgClose();
        this.clickMemberInfo();
        this.clickHeight();
        this.clickOKBtn();
        this.clickWeight();
        this.clickOKBtn();
        this.swipeToUp(driver);
        this.clickBloodType();
        this.clickOKBtn();
        this.clickBtnSave();
        Thread.sleep(2000);
        this.clickProperty();
        this.swipeToUp(driver);
        this.clickHobby();
        this.clickBtnSave();
        this.clickNativePlace();
        this.clickOKBtn();
        this.clickEducation();
        this.clickOKBtn();
        this.clickJob();
        this.clickOKBtn();
        this.clickIncome();
        this.clickOKBtn();
        this.clickPart();
        this.clickOKBtn();
        this.clickMaritalStatus();
        this.clickOKBtn();
        this.clickHouse();
        this.clickOKBtn();
        this.clickYidilian();
        this.clickOKBtn();
        this.swipeToUp(driver);
        this.clickOppositeSex();
        this.clickOKBtn();
        this.clickQinmi();
        this.clickOKBtn();
        this.clickParent();
        this.clickOKBtn();
        this.clickChild();
        this.clickOKBtn();
        this.clickBtnSave();
        Thread.sleep(5000);
//        System.out.println(this.getMemberInfo());
        if(!this.getMemberInfo().contains("95%")){
            Assert.fail("修改资料后，未生效");
        }

    }

    public void checkDuiDuiPeng(AndroidDriver driver,String qudaohao)throws Exception{
        this.checkLogin(driver,qudaohao);
        this.clickduiduipeng(driver);
        if(!this.doesWebElementExist(duiduipeng_dialog_bg)){
            Assert.fail("点击右下角“对对碰”，没有弹出 对对碰 对话框");
        }
        this.clickOK();
        if(!this.getTitleName().equals("会员服务")){
            Assert.fail("未能进入“会员服务”页");
        }
    }

    public void checkBuyBean(AndroidDriver driver,String qudaohao)throws Exception{
        this.checkLogin(driver,qudaohao);
        this.clickMeIcon();
//        this.clickMsgClose();
        this.clickMemberCenter();
        this.clickBean();
        Thread.sleep(10000);
        this.clickVIP(driver);
        this.clickKaiTong();
        Thread.sleep(30000);
        this.clickAgree();
        Thread.sleep(3000);
        this.sendKeyA(driver);
        this.sendKeyA(driver);
        this.sendKeyB(driver);
        this.sendKeyC(driver);
        this.sendKeyD(driver);
        this.sendKeyA(driver);
        Thread.sleep(3000);
        this.clickNavClose();
        Thread.sleep(10000);
        this.sendKeyBack(driver);
//        Thread.sleep(30000);
        this.clickCheck();
        if(!this.doesWebElementExist(success)){
            Assert.fail("开通免密后，没有成功提示");
        }
        this.clickQianWang();
        this.clickBuYao();
        Thread.sleep(10000);
        this.clickYuanFen();
        this.clickduiduipeng(driver);
        if(!this.getOKText().equals("免密解锁：99元90天畅聊")){
            Assert.fail("开通免密后，对对碰中提示信息未改变");
        }
    }

    public void checkBuyLetter(AndroidDriver driver,String qudaohao)throws Exception{
        this.checkLogin(driver,qudaohao);
        this.clickMeIcon();
//        this.clickMsgClose();
        this.clickMemberCenter();
        this.clickWriteLetter();
        Thread.sleep(10000);
        this.clickVIP(driver);
        this.clickKaiTong();
        Thread.sleep(30000);
        this.clickAgree();
        Thread.sleep(3000);
        this.sendKeyA(driver);
        Thread.sleep(500);
        this.sendKeyA(driver);
        Thread.sleep(500);
        this.sendKeyB(driver);
        Thread.sleep(500);
        this.sendKeyC(driver);
        Thread.sleep(500);
        this.sendKeyD(driver);
        Thread.sleep(500);
        this.sendKeyA(driver);
        Thread.sleep(10000);
        this.sendKeyBack(driver);
        Thread.sleep(10000);
        this.sendKeyBack(driver);
//        Thread.sleep(30000);
        this.clickCheck();
        if(!this.doesWebElementExist(success)){
            Assert.fail("开通免密后，没有成功提示");
        }
        this.clickQianWang();
        this.clickPayUnlock();
        Thread.sleep(30000);
        this.clickQueDing();
        this.clickBtnLeft();
        Thread.sleep(2000);
        this.clickBtnLeft();
        Thread.sleep(2000);
        this.clickBtnLeft();
        this.clickYuanFen();
        this.clickduiduipeng(driver);
        if(!this.getOKText().equals("开始")){
            Assert.fail("付费后，对对碰未成为无限制使用");
        }
        this.clickBtnClose();
        this.clickQiangLiTuiJian(driver);
        if(!this.doesWebElementExist(root_view)){
            Assert.fail("点击强力推荐，未弹出提示");
        }
        this.clickIvClose();
        this.clickTuijian();
        Thread.sleep(5000);
        if(!this.getTitleName().equals("会员福利")){
            Assert.fail("付费后，没有进入会员福利页面");
        }
        if(id_photo.size()!=9){
            Assert.fail("会员福利页面，推荐女用户个数不为9");
        }
        this.clickSayHello();
        if(!this.doesWebElementExist(upload)){
            Assert.fail("会员福利页面，打招呼未提示需要上传头像");
        }
    }

    public void checkVipCenter(AndroidDriver driver,String qudaohao) throws Exception{
        this.checkLogin(driver,qudaohao);
        this.clickMeIcon();
//        this.clickMsgClose();
        this.clickMemberCenter();
        Thread.sleep(3000);
        if(!this.getTitleName().equals("会员中心")){
            Assert.fail("未进入会员中心页面");
        }
        if(!this.doesWebElementExist(bean)){
            Assert.fail("豆币一项不存在");
        }
        if(!this.doesWebElementExist(write_letters)){
            Assert.fail("写信包月一项不存在");
        }
        if(!this.doesWebElementExist(vip_title)){
            Assert.fail("星级服务一项不存在");
        }
        if(!this.doesWebElementExist(receive_letter)){
            Assert.fail("收信宝一项不存在");
        }
    }

    public void checkBean(AndroidDriver driver,String qudaohao)throws Exception{
        this.checkLogin(driver,qudaohao);
        this.clickMeIcon();
//        this.clickMsgClose();
        this.clickMemberCenter();
        this.clickBean();
        Thread.sleep(5000);
        this.check3BeanList(driver);
    }

    public void checkLetter(AndroidDriver driver,String qudaohao)throws Exception{
        this.checkLogin(driver,qudaohao);
        this.clickMeIcon();
//        this.clickMsgClose();
        this.clickMemberCenter();
        this.clickWriteLetter();
        Thread.sleep(5000);
        this.clickReload();
        Thread.sleep(5000);
//        if(!this.doesWebElementExist(letter_vip)){
//            Assert.fail("3天vip0元购不存在");
//        }
//        if(!this.doesWebElementExist(letter90)){
//            Assert.fail("90天畅聊不存在");
//        }
//
//        if(!this.getLetter90Price().equals("￥109")){
//            Assert.fail("90天畅聊价格有误");
//        }
//        if(!this.doesWebElementExist(letter30)){
//            Assert.fail("30天畅聊不存在");
//        }
//        if(!this.getLetter30Price().equals("￥89")){
//            Assert.fail("30天畅聊价格有误");
//        }
//
//        if(!this.doesWebElementExist(letter7)){
//            Assert.fail("7天畅聊不存在");
//        }
//        if(!this.getLetter7Price().equals("￥69")){
//            Assert.fail("7天畅聊价格有误");
//        }
//
//        this.clickLetter90();
//        this.clickKaiTong();
//        Thread.sleep(5000);
//        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
////            System.out.println(this.getCurrentActivity(driver));
//            Assert.fail("90天畅聊未启动支付宝");
//        }
//        this.keyBack(driver);
//        Thread.sleep(5000);
//        this.clickWecharPay();
//        Thread.sleep(5000);
//        this.clickKaiTong();
//        Thread.sleep(5000);
//        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
////            System.out.println(this.getCurrentActivity(driver));
//            Assert.fail("90天畅聊未启动微信");
//        }
//        this.keyBack(driver);
//        this.clickBtnLeft();
//        this.clickReload();
//        this.clickLetter30();
//        Thread.sleep(5000);
//        this.clickReload();
//        this.clickKaiTong();
//        Thread.sleep(5000);
//        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
////            System.out.println(this.getCurrentActivity(driver));
//            Assert.fail("30天畅聊未启动支付宝");
//        }
//        this.keyBack(driver);
//        this.clickWecharPay();
//        this.clickKaiTong();
//        Thread.sleep(5000);
//        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
////            System.out.println(this.getCurrentActivity(driver));
//            Assert.fail("30天畅聊未启动微信");
//        }
//
//        this.keyBack(driver);
//        this.clickBtnLeft();
//        this.clickReload();
//        this.clickLetter7();
//        Thread.sleep(5000);
//        this.clickReload();
//        this.clickKaiTong();
//        Thread.sleep(5000);
//        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
////            System.out.println(this.getCurrentActivity(driver));
//            Assert.fail("7天畅聊未启动支付宝");
//        }
//        this.keyBack(driver);
//        this.clickWecharPay();
//        this.clickKaiTong();
//        Thread.sleep(5000);
//        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
////            System.out.println(this.getCurrentActivity(driver));
//            Assert.fail("7天未启动微信");
//        }
        this.check3LetterList(driver);
    }

    public void checkVipTitle(AndroidDriver driver,String qudaohao)throws Exception{
        this.checkLogin(driver,qudaohao);
        this.clickMeIcon();
//        this.clickMsgClose();
        this.clickMemberCenter();
        this.clickVipTitle();
        Thread.sleep(5000);
        this.check3VipTitle(driver);
    }

    public void checkReciveLetter(AndroidDriver driver,String qudaohao)throws Exception{
        this.checkLogin(driver,qudaohao);
        this.clickMeIcon();
//        this.clickMsgClose();
        this.clickMemberCenter();
        this.clickReceiveLetter();
        this.clickUploadPic();
        this.clickLocalPic();
        this.clickImg();
        this.clickMonitorPic(driver);
        this.clickImgOK();
        this.swipeToDownPIC(driver);
        this.clickImgSure();
        Thread.sleep(1000);
//        if(!this.doesWebElementExist(day1)){
//            Assert.fail("1天展示不存在");
//        }
//        if(!this.doesWebElementExist(day3)){
//            Assert.fail("3天展示不存在");
//        }
//        if(!this.doesWebElementExist(day7)){
//            Assert.fail("7天展示不存在");
//        }
//        if(!this.doesWebElementExist(day15)){
//            Assert.fail("15天展示不存在");
//        }
//
//        if(!this.getDay1Price().equals("1天(80豆币/10元)")){
//            Assert.fail("1天展示价格不对");
//        }
//        if(!this.getDay3Price().equals("3天(300豆币/30元)")){
//            Assert.fail("3天展示价格不对");
//        }
//        if(!this.getDay7Price().equals("7天(600豆币/50元)")){
//            Assert.fail("7天展示价格不对");
//        }
//        if(!this.getDay15Price().equals("15天(1300豆币/100元)")){
//            Assert.fail("15天展示价格不对");
//        }
//        this.clickDay1();
//        this.clickReload();
//        Thread.sleep(3000);
//        this.clickMonitorPay(driver);
//        Thread.sleep(3000);
//        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
//            Assert.fail("1天展示未启动支付宝");
//        }
//        this.keyBack(driver);
//        Thread.sleep(1000);
//        this.clickWecharPay();
//        Thread.sleep(3000);
//        this.clickMonitorPay(driver);
//        Thread.sleep(1000);
//        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
//            Assert.fail("1天展示未启动微信");
//        }
//        this.keyBack(driver);
//        this.clickBtnLeft();
//        this.clickReload();
//        this.clickDay3();
//        this.clickReload();
//        Thread.sleep(1000);
//        this.clickMonitorPay(driver);
//        Thread.sleep(1000);
//        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
////            System.out.println(this.getCurrentActivity(driver));
//            Assert.fail("3天展示未启动支付宝");
//        }
//        this.keyBack(driver);
//        this.clickWecharPay();
//        Thread.sleep(1000);
//        this.clickMonitorPay(driver);
//        Thread.sleep(1000);
//        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
////            System.out.println(this.getCurrentActivity(driver));
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
//        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
////            System.out.println(this.getCurrentActivity(driver));
//            Assert.fail("7天展示未启动支付宝");
//        }
//        this.keyBack(driver);
//        this.clickWecharPay();
//        Thread.sleep(1000);
//        this.clickMonitorPay(driver);
//        Thread.sleep(1000);
//        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
////            System.out.println(this.getCurrentActivity(driver));
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
//        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
//            Assert.fail("15天展示未启动支付宝");
//        }
//        this.keyBack(driver);
//        this.clickWecharPay();
//        Thread.sleep(1000);
//        this.clickMonitorPay(driver);
//        Thread.sleep(1000);
//        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
//            Assert.fail("15天展示未启动微信");
//        }
        this.checkReceiveLetter(driver);

    }

    public void check3BeanList(AndroidDriver driver) throws Exception{
        this.clickReload();
        Thread.sleep(5000);
        if(!this.doesWebElementExist(bean_vip)){
            Assert.fail("3天vip0元购不存在");
        }
        if(!this.doesWebElementExist(bean800)){
            Assert.fail("800语音豆不存在");
        }

        if(!this.getBean800Price().equals("￥99")){
            Assert.fail("800语音豆价格有误");
        }
        if(!this.doesWebElementExist(bean550)){
            Assert.fail("550语音豆不存在");
        }
        if(!this.getBean550Price().equals("￥89")){
            Assert.fail("550语音豆价格有误");
        }
        this.clickBean800();
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
//            System.out.println(this.getCurrentActivity(driver));
            Assert.fail("800豆币未启动支付宝");
        }
        this.keyBack(driver);
        Thread.sleep(5000);
        this.clickWecharPay();
        Thread.sleep(5000);
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
//            System.out.println(this.getCurrentActivity(driver));
            Assert.fail("800豆币未启动微信");
        }
        this.keyBack(driver);
        this.clickBtnLeft();
        this.clickReload();
        this.clickBean550();
        Thread.sleep(5000);
        this.clickReload();
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
//            System.out.println(this.getCurrentActivity(driver));
            Assert.fail("550豆币未启动支付宝");
        }
        this.keyBack(driver);
        this.clickWecharPay();
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
//            System.out.println(this.getCurrentActivity(driver));
            Assert.fail("550豆币未启动微信");
        }
    }

    public void check3LetterList(AndroidDriver driver) throws Exception{
        this.clickReload();
        Thread.sleep(5000);
        if(!this.doesWebElementExist(letter_vip)){
            Assert.fail("3天vip0元购不存在");
        }
        if(!this.doesWebElementExist(letter90)){
            Assert.fail("90天畅聊不存在");
        }
        if(!this.getLetter90Price().equals("￥109")){
            Assert.fail("90天畅聊价格有误");
        }
        if(!this.doesWebElementExist(letter30)){
            Assert.fail("30天畅聊不存在");
        }
        if(!this.getLetter30Price().equals("￥89")){
            Assert.fail("30天畅聊价格有误");
        }
        if(!this.doesWebElementExist(letter7)){
            Assert.fail("7天畅聊不存在");
        }
        if(!this.getLetter7Price().equals("￥69")){
            Assert.fail("7天畅聊价格有误");
        }
        this.clickLetter90();
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
            Assert.fail("90天畅聊未启动支付宝");
        }
        this.keyBack(driver);
        Thread.sleep(5000);
        this.clickWecharPay();
        Thread.sleep(5000);
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
            Assert.fail("90天畅聊未启动微信");
        }
        this.keyBack(driver);
        this.clickBtnLeft();
        this.clickReload();
        this.clickLetter30();
        Thread.sleep(5000);
        this.clickReload();
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
            Assert.fail("30天畅聊未启动支付宝");
        }
        this.keyBack(driver);
        this.clickWecharPay();
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
            Assert.fail("30天畅聊未启动微信");
        }
        this.keyBack(driver);
        this.clickBtnLeft();
        this.clickReload();
        this.clickLetter7();
        Thread.sleep(5000);
        this.clickReload();
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
            Assert.fail("7天畅聊未启动支付宝");
        }
        this.keyBack(driver);
        this.clickWecharPay();
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
            Assert.fail("7天未启动微信");
        }
    }

    public void check3VipTitle(AndroidDriver driver)throws Exception{
        this.clickReload();
        Thread.sleep(5000);
        if(!this.doesWebElementExist(newvip)){
            Assert.fail("签约领取vip新手礼包不存在");
        }
        if(!this.doesWebElementExist(vip90)){
            Assert.fail("90天vip不存在");
        }
        if(!this.getVip90price().contains("￥100")){
            Assert.fail("90天vip价格错误");
        }
        if(!this.doesWebElementExist(vip30)){
            Assert.fail("30天vip不存在");
        }
        if(!this.getVip30price().contains("￥50")){
            Assert.fail("30天vip价格有误");
        }
        this.clickVip90();
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
            Assert.fail("90天vip未启动支付宝");
        }
        this.keyBack(driver);
        Thread.sleep(5000);
        this.clickWecharPay();
        Thread.sleep(5000);
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
            Assert.fail("90天vip未启动微信");
        }
        this.keyBack(driver);
        this.clickBtnLeft();
        this.clickReload();
        this.clickVip30();
        Thread.sleep(5000);
        this.clickReload();
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
            Assert.fail("30天vip未启动支付宝");
        }
        this.keyBack(driver);
        this.clickWecharPay();
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
            Assert.fail("30天vip未启动微信");
        }
    }

    public void check1BeanList(AndroidDriver driver) throws Exception{
        this.clickReload();
        Thread.sleep(5000);
        if(!this.doesWebElementExist(bean800)){
            Assert.fail("800语音豆不存在");
        }

        if(!this.getBean800Price().equals("￥99")){
            Assert.fail("800语音豆价格有误");
        }
        if(!this.doesWebElementExist(bean550)){
            Assert.fail("550语音豆不存在");
        }
        if(!this.getBean550Price().equals("￥89")){
            Assert.fail("550语音豆价格有误");
        }
        this.clickBean800();
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
//            System.out.println(this.getCurrentActivity(driver));
            Assert.fail("800豆币未启动支付宝");
        }
        this.keyBack(driver);
        Thread.sleep(5000);
        this.clickWecharPay();
        Thread.sleep(5000);
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
//            System.out.println(this.getCurrentActivity(driver));
            Assert.fail("800豆币未启动微信");
        }
        this.keyBack(driver);
        this.clickBtnLeft();
        this.clickReload();
        this.clickBean550();
        Thread.sleep(5000);
        this.clickReload();
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
//            System.out.println(this.getCurrentActivity(driver));
            Assert.fail("550豆币未启动支付宝");
        }
        this.keyBack(driver);
        this.clickWecharPay();
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
//            System.out.println(this.getCurrentActivity(driver));
            Assert.fail("550豆币未启动微信");
        }
    }

    public void check1LetterList(AndroidDriver driver) throws Exception{
        this.clickReload();
        Thread.sleep(5000);
        if(!this.doesWebElementExist(letter90)){
            Assert.fail("90天畅聊不存在");
        }
        if(!this.getLetter90Price().equals("￥109")){
            Assert.fail("90天畅聊价格有误");
        }
        if(!this.doesWebElementExist(letter30)){
            Assert.fail("30天畅聊不存在");
        }
        if(!this.getLetter30Price().equals("￥89")){
            Assert.fail("30天畅聊价格有误");
        }
        if(!this.doesWebElementExist(letter7)){
            Assert.fail("7天畅聊不存在");
        }
        if(!this.getLetter7Price().equals("￥69")){
            Assert.fail("7天畅聊价格有误");
        }
        this.clickLetter90();
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
            Assert.fail("90天畅聊未启动支付宝");
        }
        this.keyBack(driver);
        Thread.sleep(5000);
        this.clickWecharPay();
        Thread.sleep(5000);
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
            Assert.fail("90天畅聊未启动微信");
        }
        this.keyBack(driver);
        this.clickBtnLeft();
        this.clickReload();
        this.clickLetter30();
        Thread.sleep(5000);
        this.clickReload();
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
            Assert.fail("30天畅聊未启动支付宝");
        }
        this.keyBack(driver);
        this.clickWecharPay();
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
            Assert.fail("30天畅聊未启动微信");
        }
        this.keyBack(driver);
        this.clickBtnLeft();
        this.clickReload();
        this.clickLetter7();
        Thread.sleep(5000);
        this.clickReload();
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
            Assert.fail("7天畅聊未启动支付宝");
        }
        this.keyBack(driver);
        this.clickWecharPay();
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
            Assert.fail("7天未启动微信");
        }
    }

    public void check1VipTitle(AndroidDriver driver)throws Exception{
        this.clickReload();
        Thread.sleep(5000);
        if(!this.doesWebElementExist(vip90)){
            Assert.fail("90天vip不存在");
        }
        if(!this.getVip90price().contains("￥100")){
            Assert.fail("90天vip价格错误");
        }
        if(!this.doesWebElementExist(vip30)){
            Assert.fail("30天vip不存在");
        }
        if(!this.getVip30price().contains("￥50")){
            Assert.fail("30天vip价格有误");
        }
        this.clickVip90();
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
            Assert.fail("90天vip未启动支付宝");
        }
        this.keyBack(driver);
        Thread.sleep(5000);
        this.clickWecharPay();
        Thread.sleep(5000);
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
            Assert.fail("90天vip未启动微信");
        }
        this.keyBack(driver);
        this.clickBtnLeft();
        this.clickReload();
        this.clickVip30();
        Thread.sleep(5000);
        this.clickReload();
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
            Assert.fail("30天vip未启动支付宝");
        }
        this.keyBack(driver);
        this.clickWecharPay();
        this.clickKaiTong();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
            Assert.fail("30天vip未启动微信");
        }
    }

    public void checkReceiveLetter(AndroidDriver driver) throws Exception{
        if(!this.doesWebElementExist(day1)){
            Assert.fail("1天展示不存在");
        }
        if(!this.doesWebElementExist(day3)){
            Assert.fail("3天展示不存在");
        }
        if(!this.doesWebElementExist(day7)){
            Assert.fail("7天展示不存在");
        }
        if(!this.doesWebElementExist(day15)){
            Assert.fail("15天展示不存在");
        }
        if(!this.getDay1Price().equals("1天(80豆币/10元)")){
            Assert.fail("1天展示价格不对");
        }
        if(!this.getDay3Price().equals("3天(300豆币/30元)")){
            Assert.fail("3天展示价格不对");
        }
        if(!this.getDay7Price().equals("7天(600豆币/50元)")){
            Assert.fail("7天展示价格不对");
        }
        if(!this.getDay15Price().equals("15天(1300豆币/100元)")){
            Assert.fail("15天展示价格不对");
        }
        this.clickDay1();
        this.clickReload();
        Thread.sleep(1000);
        this.clickMonitorPay(driver);
        Thread.sleep(3000);
        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
            Assert.fail("1天展示未启动支付宝");
        }
        this.keyBack(driver);
        Thread.sleep(1000);
        this.clickWecharPay();
        Thread.sleep(3000);
        this.clickMonitorPay(driver);
        Thread.sleep(2000);
        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
            Assert.fail("1天展示未启动微信");
        }
        this.keyBack(driver);
        this.clickBtnLeft();
        this.clickReload();
        this.clickDay3();
        this.clickReload();
        Thread.sleep(1000);
        this.clickMonitorPay(driver);
        Thread.sleep(1000);
        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
            Assert.fail("3天展示未启动支付宝");
        }
        this.keyBack(driver);
        this.clickWecharPay();
        Thread.sleep(1000);
        this.clickMonitorPay(driver);
        Thread.sleep(1000);
        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
            Assert.fail("3天展示未启动微信");
        }
        this.keyBack(driver);
        this.clickBtnLeft();
        this.clickReload();
        this.clickDay7();
        this.clickReload();
        Thread.sleep(1000);
        this.clickMonitorPay(driver);
        Thread.sleep(1000);
        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
            Assert.fail("7天展示未启动支付宝");
        }
        this.keyBack(driver);
        this.clickWecharPay();
        Thread.sleep(1000);
        this.clickMonitorPay(driver);
        Thread.sleep(1000);
        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
            Assert.fail("7天展示未启动微信");
        }
        this.keyBack(driver);
        this.clickBtnLeft();
        this.clickReload();
        this.clickDay15();
        this.clickReload();
        Thread.sleep(1000);
        this.clickMonitorPay(driver);
        Thread.sleep(1000);
        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
            Assert.fail("15天展示未启动支付宝");
        }
        this.keyBack(driver);
        this.clickWecharPay();
        Thread.sleep(1000);
        this.clickMonitorPay(driver);
        Thread.sleep(1000);
        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
            Assert.fail("15天展示未启动微信");
        }
    }

    public void checkVipCenter()throws Exception{
        if(!this.getTitleName().equals("会员中心")){
            Assert.fail("未进入会员中心页面");
        }
        if(!this.doesWebElementExist(bean)){
            Assert.fail("豆币一项不存在");
        }
        if(!this.doesWebElementExist(write_letters)){
            Assert.fail("写信包月一项不存在");
        }
        if(!this.doesWebElementExist(vip_title)){
            Assert.fail("星级服务一项不存在");
        }
        if(!this.doesWebElementExist(receive_letter)){
            Assert.fail("收信宝一项不存在");
        }
    }

    public void login1(AndroidDriver driver,String qudaohao) throws Exception{
        this.clickLogin();
        this.clickMonitor(driver);
        this.clickTestEnv();
        this.clickProduct();
        this.clickTestEnv();
        this.clickHuluprep();
        this.updateQuDao(qudaohao);
        this.clickSave();
        this.clickRegist();
        this.clickMen();
        this.clickOK();
        Thread.sleep(1000);
//        if (!this.getTitleName().equals("完善资料")) {
//            Assert.fail("未进入“完善资料”页面");
//        }
        this.clickBtnLeft();
        this.clickBtnLeft();
        Thread.sleep(5000);
        log.pass(this.getUserInfoUserName1(driver));
        this.clickBtnLeft();
        this.clickBtnLeft();
        this.clickYuanFen1();
        Thread.sleep(5000);
    }

    public void check1VipCenter(AndroidDriver driver,String qudaohao) throws Exception{
        this.login1(driver,qudaohao);
        this.clickMeIcon1();
        this.clickMemberCenter();
        Thread.sleep(3000);
        this.checkVipCenter();
    }

    private String getUserInfoUserName1(AndroidDriver driver) throws Exception{
        this.clickMeIcon1();
        this.clickMsgClose();
//        Thread.sleep(30000);
        this.swipeToUp(driver);
        this.clickSetting();
        this.clickUserInfo();
        return this.getUserInfoUserName();

    }

    public void answerQuestions(){
        if(!this.getTitleName().contains("回答问题")){
            Assert.fail("3线男用户注册后，未进入5个问题页面");
        }
        this.clickAnswers();
    }

}
