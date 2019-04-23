package com.rd.check;

import com.aventstack.extentreports.ExtentTest;
import com.hulu.check.publicCheck;
import com.listener.ExtentTestNGITestListener;
import com.listener.WriteUserID;
import com.rd.method.ElementMethod;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RDCheck extends ElementMethod {

    ExtentTestNGITestListener el = new ExtentTestNGITestListener();
    ExtentTest log = el.getlog();
    WriteUserID wui=new WriteUserID();
/*
    //注册协议
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
    }*/

    //    1线男注册
    public void manRegiste1(AndroidDriver driver, String qudaohao) throws Exception {
        this.waitElement(driver,btn_register);
       // this.clickTvBack();
        this.clickTvBack();
        this.clickMonitor(driver);

        this.updateQuDao(qudaohao);
        log.info("渠道号：" + qudaohao);
        System.out.println("渠道号：" + qudaohao);
        this.clickSave();
        this.oneClickRegister();
        this.clickRegister();
        if (!this.doesWebElementExist(upload_user_icon_image)) {
            Assert.fail("1线男用户注册，第一个页面未提示上传头像");
        }
        this.waitElement(driver, btn_left);
        this.clickBtnLeft();
        this.waitElement(driver, title_name);
        if (!this.getTitleName().contains("完善资料")) {
            Assert.fail("男用户注册，未提示完善资料");
        }
        this.clickBtnLeft();
//        this.waitElement(driver, topview);
        if (!this.getTopView().equals("热聊")) {
            Assert.fail("注册成功后，未进入热聊页面");
        }
        log.info("注册成功后进入热聊页面");

    }

    //    3线男注册
    public void manRegiste3(AndroidDriver driver, String qudaohao) throws Exception {
        this.waitElement(driver,btn_register);
        // this.clickTvBack();
        this.clickTvBack();
        this.clickMonitor(driver);
        this.updateQuDao(qudaohao);
        log.info("渠道号：" + qudaohao);
        System.out.println("渠道号：" + qudaohao);
        this.clickAddress();
        this.swipeAddress(driver);
        this.clickBtnok();
        String address=this.getAddress();
        log.pass(address);
        log.info("修改后地址：" + address);
        this.clickSave();
        this.oneClickRegister();
        this.clickRegister();
        Thread.sleep(5000);
        if (!this.doesWebElementExist(rv_reg_dialog_height)) {
            Assert.fail("男用户注册，未提示基本资料");
        }

        this.clickLijireg();
        Thread.sleep(5000);
        log.info("判断3线男注册，是否进入“附近”");
        if (!this.getTitleName().equals("附近")) {
            Assert.fail("3线男用户注册，未进入“附近”");
        }

        this.clickBtnLeft();
//        this.waitElement(driver, topview);
        if(this.doesWebElementExist(btn_speed)){
            clickBtnSpeed();
        }
        Thread.sleep(1000);
        if (!this.getTopView().equals("热聊")) {
            Assert.fail("注册成功后，未进入热聊页面");
        }
        log.info("注册成功后进入热聊页面");

    }

    //    1线男遇见页打招呼
    public void manSayHi1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickYuJian();
        this.waitElement(driver,iv_right_click);
        this.clickIVRight();
        this.clickTVSayHello();
        String name = this.getTVNickName();
        this.clickIVUser();
        /*if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }*/
//        this.clickMonitor1(driver);
        this.waitElement(driver, user_name_text);

        if (name.equals(this.getUserNameText())) {
            log.info("点击头像进入空间后，姓名一致");
            this.clickLeftBtn();
        } else {
            Assert.fail("点击头像进入空间后，用户姓名不一致");
        }
    }
    //    3线男遇见页语音
    public void manVoice3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickYuJian();
        this.waitElement(driver,iv_right_click);
        this.clickIVRight();
        this.clickTVVoice();
        this.clickReload();
        String name = this.getTitleName();

        if (name.equals("手机验证")||name.equals("会员服务")) {
            if(this.doesWebElementExist(bean800)){
                log.info("进入手机sp或购买语音豆流程");
            }
        } else {
            Assert.fail("未进入手机sp或购买语音豆流程");
        }
    }

    //  1线男 遇见页面查看下一个用户
    public void manNextPeople1(AndroidDriver driver) throws Exception {
        this.clickYuJian();
        this.waitElement(driver,iv_right_click);
        this.clickIVRight();
        String name = this.getTVNickName();
        this.swipeToLeft(driver);
        String name2 = this.getTVNickName();
        System.out.println("昵称："+name+"------"+name2);
        this.clickIVUser();
        this.clickNextBtn();
        if (!name2.equals(this.getUserNameText())) {
            log.info("空间页点击下一位后，用户姓名不一致");
            this.clickLeftBtn();
        } else {
            Assert.fail("空间页点击下一位后，用户姓名一致");
        }


    }


    //  1线男 对方空间页关注
    public void manCancleAttention1(AndroidDriver driver) throws Exception {
        this.clickYuJian();
        this.waitElement(driver,iv_right_click);
        this.clickIVRight();
        this.clickIVUser();
        this.waitElement(driver, user_name_text);
        String name = this.getUserNameText();
        this.clickRightTop();
        this.clickAttentionBtn();
        Thread.sleep(1000);
        log.info("已关注状态再次点击后判断是否为“取消关注”");
        this.clickRightTop();
//        this.clickAttentionBtn();
        if(this.getAttentionText().equals("取消关注")) {
            log.info("关注后，按钮状态为“取消关注”");
            this.clickAttentionBtn();
            Thread.sleep(1000);
            this.clickRightTop();
            if(this.getAttentionText().equals("关注")) {
                this.clickAttentionBtn();
                Thread.sleep(1000);
                this.clickLeftBtn();
                this.waitElement(driver,iv_card_user_img);
                this.clickZhuYe();
                Thread.sleep(1000);
                this.swipeToUp(driver);
                if(this.getConversationPersonNum()!=1){
                    Assert.fail("对方空间页关注用户后，关注的人列表数不正确");
                }else{
                    this.clickConversationPerson();
                    if(this.doesWebElementExist(msg_close)){
                        this.clickMsgClose();
                        if(name.equals(this.getConversationPersonName())){
                            log.info("对方空间页关注用户后，关注的人列表数据正确");
                        }
                    }
                }
            }else{
                Assert.fail("取消关注失败");
            }

        }else{
            Assert.fail("关注失败");
        }



    }

    // 1线男 拉黑
    public void mannNotread1(AndroidDriver driver) throws Exception {
        this.clickYuJian();
        this.waitElement(driver,iv_right_click);
        this.clickIVRight();
        this.clickIVUser();
        this.waitElement(driver, user_name_text);
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
                           log.info("拉黑和取消拉黑操作成功");
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
    public void manUpgraded1(AndroidDriver driver) throws Exception {
        this.clickYuJian();
        this.waitElement(driver,iv_right_click);
        this.clickIVRight();
        this.clickIVUser();
        this.waitElement(driver, user_name_text);
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
        this.clickYuJian();
        this.waitElement(driver,iv_right_click);
        this.clickIVRight();
        this.clickIVUser();
        Thread.sleep(1000);
        this.swipeToUp(driver);
        Thread.sleep(1000);
        this.clickKaiTong1(driver);
//        this.clickOnlineStatus();
        this.waitElement(driver, title_name);
        log.info("判断是否进入皇冠特权页面");
        System.out.println("name:"+this.getTitleName());
        if (!this.getTitleName().equals("皇冠特权")) {
            Assert.fail("未进入皇冠特权页面");
        }
        log.info("进入皇冠特权页面");
    }

    //    3线男 查看视频
    public void manVideo3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickReLiao();
//        String name = this.getIVCardUserName();
        this.clickIVCardUserName();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
//
        this.waitElement(driver, user_name_text);
        this.swipeToUp(driver);
        Thread.sleep(1000);
        this.waitElement(driver, video_view);
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

    //    1线男 查看更多资料
    public void manMore1(AndroidDriver driver) throws Exception {
        this.clickYuJian();
        this.waitElement(driver,iv_right_click);
        this.clickIVRight();
        this.clickIVUser();

        this.waitElement(driver, piccount);
        this.swipeToUp(driver);
        this.clickMoreBtn();

        log.info("判断是否有完善资料提示还是直接展开更多资料");
        if(this.doesWebElementExist(age_dialog_title)){
            this.clickSure();
            this.waitElement(driver,title_name);
            if(this.getTitleName().contains("完善资料")){
                this.personalData(driver);
//                this.waitElement(driver, piccount);
                if(this.doesWebElementExist(more_text)){
                    log.info("1线男，点击“更多详细资料”按钮展开更多资料详情");
                }
            }

        }else if (!this.doesWebElementExist(more_text)) {
            Assert.fail("1线男，点击“更多详细资料”，未能展开更多资料详情");
        }

    }
    //    3线男 查看更多资料
    public void manMore3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickYuJian();
        this.waitElement(driver,iv_right_click);
        this.clickIVRight();
        this.clickIVUser();

        this.waitElement(driver, piccount);
        this.swipeToUp(driver);
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
        this.clickSaveData();
        Thread.sleep(1000);
        this.clickProperty();
//        this.swipeToUp(driver);
        this.clickHobby();
        this.clickSaveData();
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
        // this.swipeToUp(driver);
        this.clickOppositeSex();
        this.clickBtnok();
        this.clickQinmi();
        this.clickBtnok();
        this.clickParent();
        this.clickBtnok();
        this.clickChild();
        this.clickBtnok();
        this.clickSaveData();

    }

    //    3线男 附近
    public  void  manNear3(AndroidDriver driver, String qudaohao) throws Exception {
        manRegiste3(driver,qudaohao);
        this.waitElement(driver, fujin);
        this.clickFuJin();
        Thread.sleep(2000);
        if (!this.doesWebElementExist(desc.get(0))) {
            Assert.fail("附近 未显示头像框");
        }
        this.clickDesc();
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
        this.clickDesc();
        String name = this.getNearNickName3();
        if (!this.doesWebElementExist(head_map)) {
            Assert.fail("附近 点击头像，未弹出头像框");
        }
        this.clickLike();
        if (this.doesWebElementExist(head_map)) {
            Assert.fail("点击喜欢，未关闭头像框");
        }
        this.clickDesc();
        this.clickHeadmap();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
/*//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);*/
        this.waitElement(driver, user_name_text);
//        log.info("判断打招呼后，进入空间，是否无打招呼按钮");
//        if (! this.doesWebElementExist(ask_button)) {
//            Assert.fail("进入空间页中，无“打招呼”按钮");
//        }
        log.info("判断 点击头像进入空间后，姓名是否一致，打招呼按钮是否不显示");
        if (name.equals(this.getUserNameText())) {
            this.clickLeftBtn();
            log.info("附近地图喜欢对方后，进入空间页姓名显示正确");
        } else {
            Assert.fail("点击头像进入空间后，用户姓名不一致");
        }
    }

/*    //1线男热聊页
    public void manReLiao1(AndroidDriver driver, String qudaohao)  throws Exception{

//        this.clickReLiao();
        String name = this.getIVCardUserName();
        this.clickIVCardUserName();

        if(name.equals(this.getUserNameText())){
            log.info("热聊页用户昵称与空间页用户昵称一致");
        }else
            Assert.fail("热聊页用户昵称与空间页用户昵称不一致");

    }*/
    //筛选条件选中后的筛选结果逻辑判断
    public void filter1(AndroidDriver driver,String local_view ) throws Exception {
        this.clickReLiao();
        this.waitElement(driver, iv_card_user_name);
        this.clickIVCardUserName();
        String address = this.getTVCardAddress();
        System.out.println("address:"+address);
       /* String height = this.getTVCardHeight();
        String age = this.getTVCardAge();*/
        if(!address.equals(local_view)){
            Assert.fail("热聊中 所在地与征友条件中所在地 不一致");
        }
       /* if (!height.contains(height_view)) {
            Assert.fail("搜索中身高与征友条件中身高不一致");
        }
        if (!age.contains(age_view)) {
            Assert.fail("搜索中年龄与征友条件中年龄不一致");
        }*/
        log.info("热聊页面用户所在地与征友条件的结果一致");
       /* this.swipeToDown(driver);
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
        }*/


    }


    //    信箱校验
    //    信箱三项
    public void manMailbox1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickSiXin();
//        信箱模块上方 不为topview，
        Thread.sleep(1000);
        if (!this.doesWebElementExist(tongzhitab)) {
            Assert.fail("信箱中不存在 通知 标签");
        }else log.info("信箱中存在 通知 标签");
        if (!this.doesWebElementExist(sixin)) {
            Assert.fail("信箱中不存在 全部私信 标签");
        }else log.info("信箱中存在 全部私信 标签");
        if (!this.doesWebElementExist(lianxitab)) {
            Assert.fail("信箱中不存在 最近联系 标签");
        }else log.info("信箱中存在 最近联系 标签");
    }

    //    信息未读数量
    public void manMailboxNum1(AndroidDriver driver, String qudaohao) throws Exception {
        int letter_beforenum;
        int mailbox_beforenum;
        this.manRegiste1(driver, qudaohao);
        this.clickSiXin();
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
    public void manMailboxZone3(AndroidDriver driver,String account,String password) throws Exception {
        this.womanLogin3(account,password);
        this.clickSiXin();
        this.waitElement(driver, personal_data);
        if(!this.doesWebElementExist(iv_msg_icon_type.get(0))) {
            this.swipeToUp(driver);
        }
        //this.clickLook();
        this.clickMsgIconType();
        this.waitElement(driver, title_name);

        if(this.doesWebElementExist(reply_ask)) {
            this.clickReplyAsk();
            this.waitElement(driver, title_name);
            if (this.getTitleName().equals("手机验证")) {
                log.info("点击回复并索要联系方式后默认进入手机验证sp支付页面");
                this.clickTvVerifJump();
            }
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
        }else
            log.info("私信页没有‘回复并索要联系方式’按钮");

    }

    //    3线男 查看更多照片
    public void manMailboxZonePic3(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.clickSiXin();
        this.waitElement(driver, img_look.get(0));
        this.clickLook();
        this.waitElement(driver, title_name);
        this.clickMessageImage();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
/*//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);*/
        Thread.sleep(1000);
        System.out.println(this.getPictureCount());
        if (this.getPictureCount()>2) {
            log.info("判断3线男，在空间页中，查看女用户多张照片，是否提示会员购买");
            this.lookSecendPic();
            Thread.sleep(300);
            log.info("点击“前往领取”会员");
            this.moreGetVip3(driver);
        } else {
            log.pass("该女用户只有一张照片");
        }

    }

    //    信箱上方完善信息
    public void manMailboxPersonData1(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickSiXin();
        this.waitElement(driver, personal_data);
        this.clickPersonalData();
        this.waitElement(driver, title_name);
        log.info("判断 点击信箱上方 完善资料，是否进入 完善信息页面");
        if (!this.getTitleName().equals("完善信息")) {
            Assert.fail("点击“完善资料”，未进入“完善信息”页");
        }else{
            log.info("信箱点击完善资料进入完善信息页面");
        }
    }

    //  1线男可购买项
    public void VIPCenter1(AndroidDriver driver, String qudaohao) throws Exception {
        this.clickZhuYe();
        this.clickRDMemberCenter();
        this.waitElement(driver, title_name);
//        this.getVipCenter();
        this.judgeVipCenter();
    }
    //  可购买项
    public void VIPCenter3(AndroidDriver driver, String qudaohao) throws Exception {
        this.clickZhuYe();
        this.clickRDMemberCenter();
        this.waitElement(driver, title_name);
//        this.getVipCenter();
        this.judgeVipCenter();
    }

    //  男豆币校验
    public void BeanList1(AndroidDriver driver) throws Exception {
        this.clickZhuYe();
        this.clickRDMemberCenter();
        this.waitElement(driver, title_name);
        log.info("判断是否进会员中心");
        if (!this.getTitleName().equals("会员中心")) {
            Assert.fail("未进入会员中心页面");
        }
        log.info("判断是否有 豆币购买服务");
        if (!this.doesWebElementExist(bean)) {
            Assert.fail("豆币一项不存在");
        }
        this.clickBean();
        this.beanPrice1(driver);
    }

    //    3线男豆币校验
    public void BeanList3(AndroidDriver driver) throws Exception {
        this.clickZhuYe();
        this.clickRDMemberCenter();
        this.waitElement(driver, title_name);
        log.info("判断是否进会员中心");
        if (!this.getTitleName().equals("会员中心")) {
            Assert.fail("未进入会员中心页面");
        }
        log.info("判断是否有 豆币购买服务");
        if (!this.doesWebElementExist(bean)) {
            Assert.fail("豆币一项不存在");
        }
        this.clickBean();
        this.beanPrice3(driver);
    }

    //    1线男写信包月
    public void LetterList1(AndroidDriver driver) throws Exception {
        this.clickZhuYe();
        this.clickRDMemberCenter();
        this.waitElement(driver, title_name);
        log.info("判断是否进会员中心");
        if (!this.getTitleName().equals("会员中心")) {
            Assert.fail("未进入会员中心页面");
        }
        log.info("判断是否有 写信包月服务");
        if (!this.doesWebElementExist(write_letters)) {
            Assert.fail("写信包月一项不存在");
        }
        this.clickWriteLetter();
        this.letterPrice1(driver);
    }

    //  1线男 皇冠特权
    public void VipList1(AndroidDriver driver) throws Exception {

        this.clickZhuYe();
        this.clickRDMemberCenter();
        this.waitElement(driver, title_name);
        log.info("判断是否进会员中心");
        if (!this.getTitleName().equals("会员中心")) {
            Assert.fail("未进入会员中心页面");
        }
        log.info("判断是否有 星级服务");
        if (!this.doesWebElementExist(vip_title)) {
            Assert.fail("星级服务一项不存在");
        }
        this.clickVipTitle();
        this.VipPrice1(driver);
    }

    // 3线男 皇冠特权
    public void VipList3(AndroidDriver driver) throws Exception {

        this.clickZhuYe();
        this.clickRDMemberCenter();
        this.waitElement(driver, title_name);
        log.info("判断是否进会员中心");
        if (!this.getTitleName().equals("会员中心")) {
            Assert.fail("未进入会员中心页面");
        }
        log.info("判断是否有 星级服务");
        if (!this.doesWebElementExist(vip_title)) {
            Assert.fail("星级服务一项不存在");
        }
        this.clickVipTitle();
        this.VipPrice1(driver);
    }

    //    我的
    // #   个人资料
    public void myPersonData(AndroidDriver driver) throws Exception {
        this.clickZhuYe();
        this.clickMemberInfo();
        this.personalData(driver);
        this.waitElement(driver, myquestion_3);
        this.clickMemberInfo();
//        System.out.println(this.getMemberInfo());
        if (!this.getTitleName().contains("95%")) {
            Assert.fail("修改资料后，未生效");
        }
        log.info("资料完善成功");
    }
    // #   诚信等级
    public void integrityLevel(AndroidDriver driver) throws Exception {
        this.clickZhuYe();
        Thread.sleep(2000);
        this.swipeToUp(driver);
        this.clickIntegrityLevel();
        this.clickIdentityAuthButton();
        this.settingIdentityAuthInformationLayout();
        Assert.assertEquals(this.getTitleName(),"完善资料(15%)","未进入到完善资料页面");
        log.info("进入到完善资料页面");
        this.clickBtnLeft(); //返回

        //////上传头像
        if(this.doesWebElementExist(setting_identity_auth_upload_user_icon_layout)){
            this.settingIdentityAuthUploadUserIconLayout();
            this.takePicture();
            this.clickShutterButton();
            this.clickBtnDone();
            this.clickReload();
            this.clickIdentityAuthButton();
        }

        //////验证手机号
        this.settingIdentityAuthCheckPhoneNumberLayout();
        this.phoneCheck();
        //手机认证
        this.clickPhoneAuthButton();
        this.phoneCheck();
        //上传本人3张照片
        this.clickUploadPhotoButton();
        this.takePicture();
        this.clickShutterButton();
        this.clickBtnDone();
        //资料完善到达90%
        this.clickInformationButton();
        Assert.assertEquals(this.getTitleName(),"完善资料(15%)","未进入到完善资料页面");
        log.info("进入到完善资料页面");
        this.clickBtnLeft(); //返回
        log.info("诚信等级提交成功");

    }

    //诚信认证-手机号验证
    public void phoneCheck(){
        Assert.assertEquals(this.getTitleName(),"手机认证","未进入到手机号验证页面");
        log.info("进入到手机认证页面");
        this.clickBtnLeft(); //返回
    }
    // #   我的头像
    public void myPicture(AndroidDriver driver) throws Exception {
        this.clickZhuYe();
        this.clickMyPicture();
        this.takePicture();
        this.clickShutterButton();
        this.clickBtnDone();
        this.clickReload();
        if(!this.doesWebElementExist(image_view_check)){
            Assert.fail("上传照片后没有显示");
        }
        log.info("上传照片成功");

    }

    //    自我介绍
    public void myIntroduction1(AndroidDriver driver) throws Exception {
        this.clickZhuYe();
        this.waitElement(driver, self_introduction);
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
        }else{
            log.info("录制自我介绍成功");
        }
    }

    //  #  征友条件
    public void myCondition(AndroidDriver driver) throws Exception {
        this.clickZhuYe();
        Thread.sleep(2000);
        this.swipeToUp(driver);
        this.waitElement(driver, body_item_1);
//        this.swipeToUp(driver);

        this.clickMyCondition();
        this.clickLocalView();
        //this.selectDown(driver,300);
        this.clickHeightDown();
        this.clickBtnok();
        String local_view = this.getLocalView();
        System.out.println("local:"+local_view);
        this.clickSaveData();
        this.filter1(driver,local_view);


    }

    //1线男 我的个人问答
    public void myAnswerQuestions1(AndroidDriver driver) throws Exception {

        this.clickZhuYe();
        Thread.sleep(2000);
        this.swipeToUp(driver);
        this.waitElement(driver, body_item_qa);
        this.clickItemQa();

        if (!this.getTitleName().equals("匹配问答")) {
            Assert.fail("未能进入“匹配问答”页面");
        }
        String QaTitle = this.getQuesdtionTitle();
        this.clickQuestionView();
        this.clickSendQuestion();
        String QaTitle2 = this.getQuesdtionTitle();
        if(!QaTitle.equals(QaTitle2)){
            log.info("提交答案后，题目自动更换");
            this.clickBtnLeft();

        }
    }



    // 我的访客
    public void myVisitor1(AndroidDriver driver) throws Exception {
        this.clickZhuYe();
        Thread.sleep(2000);
//        this.waitElement(driver, memberinfo);
        this.swipeToUp(driver);
        this.swipeToUp(driver);
        this.clickMyvisitor();
        this.waitElement(driver, title_name);
        log.info("判断是否进入 最近访客 页面");
        if (!this.getTitleName().equals("最近访客")) {
            Assert.fail("未能进入最近访客页面");
        }else
            log.info("成功进入最近访客页面");
    }

    //    我的标签
    public void myTag(AndroidDriver driver) throws Exception {
        this.clickZhuYe();
        this.waitElement(driver, mytag);
        this.clickMyTag();
        log.info("判读是否进入 我的标签页面");
        if (!this.getTitleName().equals("我的标签")) {
            Assert.fail("未能进入“我的标签”页面");
        }
        this.matchClick(driver);
        if (!this.getTitleName().equals("匹配问答")) {
            Assert.fail("未能进入“匹配问答”页面");
        }
        String QaTitle = this.getQuesdtionTitle();
        this.clickQuestionView();
        this.clickSendQuestion();
        String QaTitle2 = this.getQuesdtionTitle();
        if(!QaTitle.equals(QaTitle2)){
            log.info("提交答案后，题目自动更换");
            this.clickBtnLeft();

        }

    }

    //缘分小助手
    public void womenYuanFenZhuShou(AndroidDriver driver,String qudao) throws Exception {
        this.womanRegiste1(driver,qudao);
        this.clickSiXin();
        log.info("判断是否进入缘分小助手页面");
        if (!this.getTitleName().equals("缘分小助手")) {
            Assert.fail("未进入 缘分小助手页面");
        }
        this.clickOK();
        log.info("判断开启缘分小助手后，是否进入信箱");
        if (!this.getTitleName().equals("私信")) {
            Assert.fail("开启助手后，未进入 信箱页");
        }
        this.clickZhuYe();
        this.clickSiXin();
        log.info("判断开启缘分小助手后，重新进入信箱，是否不再显示 缘分小助手");
        if (!this.getTitleName().equals("私信")) {
            Assert.fail("退出信箱后，重新点击“信箱”，未进入 信箱页");
        }
    }
//
//    public void womenMemberCenter(AndroidDriver driver) throws Exception {
//        this.womanRegiste1(driver);
//        this.clickZhuYe();
//        log.info("判断女用户是否无 会员中心");
//        if (this.doesWebElementExist(member_center)) {
//            Assert.fail("女用户登录，有“会员中心”");
//        }
//    }


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
        this.judgeBeanPrice(driver);
        this.clickBean800();
        //this.checkBean800(driver);
        this.checkBean(driver,yuanjia800,"800");

        this.clickBtnLeft();
        this.clickReload();
        this.clickBean550();

        this.checkBean(driver,yuanjia550,"550");
    }

    //判断会员中心豆币
    public void judgeBeanPrice(AndroidDriver driver) throws Exception {

        this.waitElement(driver, title_name);
        this.clickReload();
        this.waitElement(driver, title_name);
        if (this.doesWebElementExist(bean_vip)) {
            Assert.fail("豆币购买存在 0元签约");
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
    }

    //检查语音豆
    public void checkBean(AndroidDriver driver, WebElement element, String beanNum) throws Exception {
        this.waitElement(driver, title_name);
        log.info("判断"+beanNum+"豆币，支付宝是否默认为原价");

        if (!this.doesWebElementExist(element)) {
            Assert.fail(beanNum+"豆币，支付宝 默认不为原价");
        }
        this.clickKaiTong();
        log.info("判断"+beanNum+"豆币，支付宝调起");
        this.waitElement(driver, aliFuKuan);
        if(!this.fukuan().equals("确认付款")){
            Assert.fail(beanNum+"豆币未弹出支付宝确认付款弹框");
        }
        if (!this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            Assert.fail(beanNum+"豆币未启动支付宝");
        }
        this.clickAlipayQuit();
        this.clickWecharPay();
        if (this.doesWebElementExist(element)) {
            log.info(beanNum+"豆币，微信默认为原价");
        }else{
            Assert.fail(beanNum+"豆币，微信默认为优惠后价格");
        }
        this.clickKaiTong();
        Thread.sleep(10000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")&!this.getCurrentActivity(driver).contains("WeChatSplashActivity")) {
            Assert.fail(beanNum+"豆币未启动微信");
        }
        this.clickWecharBack();
        this.waitElement(driver, title_name);

        this.clickYinlianPay();
        log.info("判断"+beanNum+"豆币，银联支付是否默认原价");
        if (!this.doesWebElementExist(element)) {
            Assert.fail(beanNum+"豆币，银联支付 默认为优惠后价格");
        }else
            log.info(beanNum+"豆币，银联支付 默认为原价");
    }

    //    三线男豆币价格及支付调起
    public void beanPrice3(AndroidDriver driver) throws Exception {
        this.waitElement(driver, title_name);
        this.clickReload();
        this.waitElement(driver, title_name);
        log.info("判断3线,是否存在0元购");
        if (this.doesWebElementExist(bean_vip)) {
            Assert.fail("3天vip0元购存在");
        }
        log.info("判断3线,800豆币及价格");
        if (!this.doesWebElementExist(bean800)) {
            Assert.fail("800语音豆不存在");
        }

        if (!this.getBean800Price().contains("￥99")) {
            Assert.fail("800语音豆价格有误");
        }
        log.info("判断3线,550豆币及价格");
        if (!this.doesWebElementExist(bean550_3)) {
            Assert.fail("550语音豆不存在");
        }
        if (!this.getBean550Price().contains("￥89")) {
            Assert.fail("550语音豆价格有误");
        }
        this.clickBean800();

        this.checkBean(driver,yuanjia800,"800");

        this.clickBtnLeft();
        this.clickReload();
        this.clickBean550_3();

        this.checkBean(driver,yuanjia550,"550");
    }

    //    1线男， 会员中心  写信包月报价
    public void letterPrice1(AndroidDriver driver) throws Exception {
        this.waitElement(driver, title_name);
        this.clickReload();
        this.waitElement(driver, title_name);
        if (this.doesWebElementExist(letter_vip)) {
            Assert.fail("写信包月存在0元签约");
        }
        if (!this.doesWebElementExist(letter90)) {
            Assert.fail("写信包月，90天畅聊不存在");
        }
        if (!this.getLetter90Price().contains("￥109")) {
            Assert.fail("写信包月，90天畅聊价格有误");
        }
        if (!this.doesWebElementExist(letter30)) {
            Assert.fail("写信包月，30天畅聊不存在");
        }
        if (!this.getLetter30Price().contains("￥89")) {
            Assert.fail("写信包月，30天畅聊价格有误");
        }
        if (!this.doesWebElementExist(letter7)) {
            Assert.fail("写信包月，天畅聊不存在");
        }
        if (!this.getLetter7Price().contains("￥69")) {
            Assert.fail("写信包月，7天畅聊价格有误");
        }
        this.clickLetter90();
        this.checkLetter(driver,yuanjia90,"写信包月90");
        this.clickBtnLeft();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.waitElement(driver, title_name);
        this.clickLetter30();
        this.checkLetter(driver,yuanjia30,"写信包月30");
        this.clickBtnLeft();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickLetter7();
        this.checkLetter(driver,yuanjia7,"写信包月7");

    }
    //检查7天写信包月
    private void checkLetter7(AndroidDriver driver) throws Exception {
        this.waitElement(driver, title_name);
        log.info("判断写信包月7天，支付宝是否默认显示原价");

        if (!this.doesWebElementExist(yuanjia7)) {
            Assert.fail("写信包月7天，支付宝不显示原价");
        }else{
            log.info("一线男，写信包月7天，支付宝显示原价");
        }
        this.clickKaiTong();
        log.info("判断写信包月7天，支付宝调起");
        this.waitElement(driver, aliFuKuan);
        if(!this.fukuan().equals("确认付款")){
            Assert.fail("写信包月7天未弹出支付宝确认付款弹框");
        }
        System.out.println("支付宝-----"+this.getCurrentActivity(driver).toLowerCase());
        if (!this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            Assert.fail("写信包月7天未启动支付宝");
        }
        this.clickAlipayQuit();

        this.clickWecharPay();
        if(!this.doesWebElementExist(yuanjia7)){
            Assert.fail("写信包月7天微信支付方式显示的不是原价");
        }
        this.clickKaiTong();
        Thread.sleep(10000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")&!this.getCurrentActivity(driver).contains("WeChatSplashActivity")) {
            Assert.fail("7天畅聊未启动微信");
        }
        this.clickWecharBack();
        this.waitElement(driver, title_name);

        this.clickYinlianPay();
        log.info("判断写信包月7天，银联支付是否默认价格为原价");

        if (!this.doesWebElementExist(yuanjia7)) {
            Assert.fail("写信包月7天，银联支付默认不为原价");
        }else{
            log.info("写信包月7天，银联支付默认为原价");
        }
    }

    //检查30天写信包月
    private void checkLetter30(AndroidDriver driver) throws Exception {
        this.waitElement(driver, title_name);
        log.info("判断写信包月30天，支付宝是否默认显示原价");

        if (!this.doesWebElementExist(yuanjia30)) {
            Assert.fail("写信包月30天，支付宝不显示原价");
        }else{
            log.info("一线男，写信包月30天，支付宝显示原价");
        }
        this.clickKaiTong();
        log.info("判断写信包月30天，支付宝调起");
        this.waitElement(driver, aliFuKuan);
        if(!this.fukuan().equals("确认付款")){
            Assert.fail("写信包月30天未弹出支付宝确认付款弹框");
        }
        System.out.println("支付宝-----"+this.getCurrentActivity(driver).toLowerCase());
        if (!this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            Assert.fail("写信包月30天未启动支付宝");
        }
        this.clickAlipayQuit();

        this.clickWecharPay();
        if(!this.doesWebElementExist(yuanjia30)){
            Assert.fail("写信包月30天微信支付方式显示的不是原价");
        }
        this.clickKaiTong();
        Thread.sleep(10000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")&!this.getCurrentActivity(driver).contains("WeChatSplashActivity")) {
            Assert.fail("30天畅聊未启动微信");
        }
        this.clickWecharBack();
        this.waitElement(driver, title_name);

        this.clickYinlianPay();
        log.info("判断写信包月30天，银联支付是否默认价格为原价");

        if (!this.doesWebElementExist(yuanjia30)) {
            Assert.fail("写信包月30天，银联支付默认不为原价");
        }else{
            log.info("写信包月30天，银联支付默认为原价");
        }
    }
    //检查写信包月
    private void checkLetter(AndroidDriver driver,WebElement element,String letterNum) throws Exception {
        this.waitElement(driver, title_name);
        log.info("判断"+letterNum+"天，支付宝是否默认显示原价");

        if (!this.doesWebElementExist(element)) {
            Assert.fail(letterNum+"天，支付宝不显示原价");
        }else{
            log.info(letterNum+"天，支付宝显示原价");
        }
        this.clickKaiTong();
        log.info("判断"+letterNum+"天，支付宝调起");
        this.waitElement(driver, aliFuKuan);
        if(!this.fukuan().equals("确认付款")){
            Assert.fail(letterNum+"天未弹出支付宝确认付款弹框");
        }
        System.out.println("支付宝-----"+this.getCurrentActivity(driver).toLowerCase());
        if (!this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            Assert.fail(letterNum+"天未启动支付宝");
        }
        this.clickAlipayQuit();

        this.clickWecharPay();
        if(!this.doesWebElementExist(element)){
            Assert.fail(letterNum+"天微信支付方式显示的不是原价");
        }
        this.clickKaiTong();
        Thread.sleep(10000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")&!this.getCurrentActivity(driver).contains("WeChatSplashActivity")) {
            Assert.fail(letterNum+"天未启动微信");
        }
        this.clickWecharBack();
        this.waitElement(driver, title_name);

        this.clickYinlianPay();
        log.info("判断"+letterNum+"天，银联支付是否默认价格为原价");

        if (!this.doesWebElementExist(element)) {
            Assert.fail(letterNum+"天，银联支付默认不为原价");
        }else{
            log.info(letterNum+"天，银联支付默认为原价");
        }

    }


    //        1线男，会员中心 皇冠特权
    public void VipPrice1(AndroidDriver driver) throws Exception {
        this.waitElement(driver, title_name);
        this.clickReload();
        this.waitElement(driver, title_name);
        log.info("判断1线 皇冠特权中 0元签约");
        if (this.doesWebElementExist(newvip)) {
            Assert.fail("1线男，签约领取vip新手礼包存在");
        }
        if (!this.doesWebElementExist(vip90danhao)) {
            Assert.fail("90天vip不存在");
        }
        if (!this.getVip90priceDanhao().contains("100")) {
            Assert.fail("90天vip价格错误");
        }
        if (!this.doesWebElementExist(vip30danhao)) {
            Assert.fail("30天vip不存在");
        }
        if (!this.getVip30priceDanhao().contains("50")) {
            Assert.fail("30天vip价格有误");
        }
        this.clickVip90Danhao();
        this.checkLetter(driver,yuanjia_vip90,"皇冠特权90");
        this.clickBtnLeft();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.waitElement(driver, title_name);
        this.clickVip30Danhao();
        this.checkLetter(driver,yuanjia_vip30,"皇冠特权30");

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
//        this.clickZhuYe();
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
        this.clickZhuYe();
        this.waitElement(driver, member_center);
        this.swipeToUp(driver);

        this.waitElement(driver, setting);
        this.clickSetting();
        this.clickUserInfo();
        return this.getUserInfoUserName();
    }

    //  #  3线 空间查看 视频，微信等，领取vip时进入会员购买页
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
    public void manLogin1(AndroidDriver driver, String qudaohao, String account, String password) throws Exception {
        this.clickTvBack();
        Thread.sleep(2000);

        this.sendAccount(account);
        this.sendPassword(password);
        this.clickTvBack();
//        取消地理位置的切换
        if (this.doesWebElementExist(btn_cancel)) {
            this.clickCancle();
        }
        System.out.println("用户登陆");
        Thread.sleep(1000);
        if(this.doesWebElementExist(right_love_image)){
            log.info("1线男用户登录后显示每次推荐用户");
            String titleName = this.getTitleName();
            if(titleName.contains("1/5")){
                this.clickLeftLoveImage();
                titleName = this.getTitleName();
                if(titleName.contains("2/5")){
                    log.info("喜欢TA后进度正确");
                    this.clickRightLoveImage();
                    this.clickRightLoveImage();
                    this.clickRightLoveImage();
                    this.clickRightLoveImage();
                }
            }else
                Assert.fail("每日推荐用户数不正确");
        }
        if (!this.doesWebElementExist(iv_card_user_name)) {
            Assert.fail("登录成功后，未进入热聊模块");
        }else
            log.info("登录成功后，进入热聊模块");
    }

    //    3线女登录
    public void womanLogin3(String account, String password) throws Exception {
        this.clickTvBack();
        Thread.sleep(2000);

        this.sendAccount(account);
        this.sendPassword(password);
        this.clickTvBack();
//        取消地理位置的切换
        if (this.doesWebElementExist(btn_cancel)) {
            this.clickCancle();
        }
        Thread.sleep(1000);
        if (!this.doesWebElementExist(iv_card_user_name)) {
            Assert.fail("登录成功后，未进入热聊模块");
        }else
            log.info("登录成功后，进入热聊模块");
    }

  /*  //    3线女用户打招呼
    public void womanSayHi3(AndroidDriver driver, String qudaohao, String account, String password) throws Exception {
        this.womanLogin3( account, password);
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
    }*/

    //女用户 判断无付款入口
    public void womanMemberCenter3(AndroidDriver driver, String qudaohao, String account, String password) throws Exception {
        this.womanLogin3(account, password);
        this.clickZhuYe();
        log.info("判断女用户是否无 会员中心");
        if (this.doesWebElementExist(member_center)) {
            Assert.fail("女用户登录，有“会员中心”");
        }
    }
/*

    //    女用户 空间页 查看更多资料
    public void womanMore1(AndroidDriver driver) throws Exception {
        this.waitElement(driver, tv_card_user_name);
        this.clickIVUser();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
*/
/*//*
/        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);
        this.waitElement(driver, user_name_text);
        this.swipeToUp(driver);*//*

        if (this.doesWebElementExist(more_button)) {
            this.clickMoreBtn();
            log.info("判断是否有完善信息提示，或直接展开更多资料");
            */
/*if(this.doesWebElementExist(age_dialog_title)){
                this.clickSure();
                this.personalData(driver);
                if (!this.doesWebElementExist(more_text)) {
                    Assert.fail("3线女，点击“更多详细资料”，未能展开更多资料详情");
                }
            }else *//*

            if (!this.doesWebElementExist(more_text)) {
                Assert.fail("3线女，点击“更多详细资料”，未能展开更多资料详情");
            }
            log.info("3线女，点击“更多详细资料”，展开更多资料详情");

        } else {
            log.pass("该男用户无 更多资料");
        }
    }
*/


    //    1线女 附近

    //    1线附近人判断方法，sex为2代表女用户，1代表男用户
    public void near1(AndroidDriver driver,int sex) throws Exception {
        this.clickFuJin();
        this.clickWomenNearPeople();
        Thread.sleep(1000);
        if(this.doesWebElementExist(nearnickname.get(0))){
            String name = this.getNearNickName();
            this.clickHello(0);
            if(sex==2){
                if(!this.getTitleName().equals("身份认证")){
                    Assert.fail("女用户附近页面打招呼没有进入身份认证页面");
                }
                this.clickBtnLeft();
                log.info("女用户附近页面显示正确");
            }else if(sex==1){
                this.clickNearHeadPhoto();
                this.waitElement(driver, user_name_text);
    //            System.out.println("打招呼状态："+ask_button.getText());
                /*if (!ask_button.getText().equals("已打招呼")) {
                    Assert.fail("在列表上点击“打招呼”后，进入空间页中，出现“打招呼”按钮");
                }*/
                if (name.equals(this.getUserNameText())) {
                    log.info("点击头像进入空间后，姓名一致");
                    this.clickLeftBtn();
                } else {
                    Assert.fail("点击头像进入空间后，用户姓名不一致");
                }

            }

        }

    }


    public void manSecurity(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickZhuYe();
        /*this.waitElement(driver, memberinfo);
        this.swipeToUp(driver);
        Thread.sleep(1000);*/
        Thread.sleep(2000);
        this.swipeToUp(driver);
        this.clickSetting();
        this.clickSecurity();
        this.waitElement(driver, title_name);
        if (!this.getTitleName().equals("安全指南")) {
            Assert.fail("未成功进入安全指南页面");
        }
        this.clickJiuTuo();
//        this.waitElement(driver, title_name);
        System.out.println(this.getJiuTuoHead());
        if (!this.getJiuTuoHead().equals("酒托")) {
            Assert.fail("未成功进入酒托页面");
        }
        else log.info("成功进入酒托页面");
    }

    public void manHelp(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickZhuYe();
        Thread.sleep(2000);
        this.swipeToUp(driver);
        this.clickSetting();
        Thread.sleep(300);
        this.clickHelp();
        this.waitElement(driver, title_name);
        this.clickReload();
        if (!this.getTitleName().contains("帮助")) {
            Assert.fail("未成功进入 帮助 页面");
        }else
            log.info("成功进入 帮助 页面");
        /*this.waitElement(driver, title_name);
        this.sendSearchKey();
        this.clickSearch();
        this.clickTuiDing();
        this.waitElement(driver, title_name);
        if (!this.getTuiDingHead().contains("退订")) {
            Assert.fail("未成功进入 退订 页面");
        }*/
    }

    public void manKeFu(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste1(driver, qudaohao);
        this.clickZhuYe();
        Thread.sleep(2000);
        this.swipeToUp(driver);
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
/*
    public void manCustomCall(AndroidDriver driver, String qudaohao) throws Exception {
        this.manRegiste3(driver, qudaohao);
        this.buyLetter3(driver);
        this.clickZhuYe();
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
    }*/
/*
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
        this.clickFuJin();
        this.waitElement(driver, title_name);
        if (!this.getTitleName().equals("会员福利")) {
            Assert.fail("三线男，购买写信包月后,进入附近模块，未进入会员福利 页面");
        }
        this.clickBtnLeft();
        this.clickZhuYe();
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
       *//* if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }*//*
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
//        this.waitElementLoad(driver, piccount);
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
        System.out.println("======="+this.getAskButtonText());
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
        this.clickFuJin();
        this.waitElement(driver, title_name);
        if (!this.getTitleName().equals("会员福利")) {
            Assert.fail("一线男，购买写信包月后,进入附近模块，未进入会员福利 页面");
        }
        this.clickBtnLeft();
        this.clickFuJin();
        this.clickWomenNearPeople();
        this.waitElement(driver, nearnickname.get(0));
        this.clickHello(0);
        if (!this.doesWebElementExist(phoneauth)) {
            Assert.fail("一线男，购买写信包月后，附近模块 空间页打招呼未出现实名拦截");
        }
        this.keyBack(driver);
        this.clickNearHeadPhoto();
       *//* if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }*//*
//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
//        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
//        this.clickMonitor1(driver);
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
        this.clickZhuYe();
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
        this.clickZhuYe();
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
        this.clickZhuYe();
        this.waitElement(driver, member_center);
        this.clickRDMemberCenter();
        if (!this.getMemberCenterVipExplain().contains(this.getDate())){
            Assert.fail("三线男，购买30天vip后，有效期显示不对");
        }

    }*/

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
//        this.clickZhuYe();
//        this.waitElement(driver,member_center);
//        this.clickRDMemberCenter();
//        if(this.getBeanNum()!=550){
//            Assert.fail("三线男，购买550豆币，会员中心显示不对");
//        }
//    }
/*
    public void buyLetter3(AndroidDriver driver) throws Exception {
        this.clickZhuYe();
        //this.waitElement(driver, member_center);
        this.clickRDMemberCenter();
        this.clickWriteLetter();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickLetter7();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickKaiTong();
        this.waitElement(driver, agreepay);
        this.clickAliMianMi();
        this.clickAgreePay();
        Thread.sleep(3000);
        this.clickAliPayNow();
        Thread.sleep(3000);
        this.sendKeyA(driver,680,1500);
        Thread.sleep(500);
        this.sendKeyA(driver,320,1500);
        Thread.sleep(500);
        this.sendKeyA(driver,680,1700);
        Thread.sleep(500);
        this.sendKeyA(driver,1000,1400);
        Thread.sleep(500);
        this.sendKeyA(driver,680,1200);
        Thread.sleep(500);
        this.sendKeyA(driver,680,1200);
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
    }*/
/*

    public void buyLetter1(AndroidDriver driver) throws Exception {
        this.clickZhuYe();
        this.waitElement(driver, member_center);
        this.clickRDMemberCenter();
        this.clickWriteLetter();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickLetter7();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickKaiTong();
        this.waitElement(driver, agreepay);
        this.clickAliMianMi();
        this.clickAgreePay();
        Thread.sleep(3000);
        this.clickAliPayNow();
        Thread.sleep(3000);
        this.sendKeyA(driver,680,1500);
        Thread.sleep(500);
        this.sendKeyA(driver,320,1500);
        Thread.sleep(500);
        this.sendKeyA(driver,680,1700);
        Thread.sleep(500);
        this.sendKeyA(driver,1000,1400);
        Thread.sleep(500);
        this.sendKeyA(driver,680,1200);
        Thread.sleep(500);
        this.sendKeyA(driver,680,1200);
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
//        this.waitElement(driver, mokuai.get(0));
    }

    public void buyVip3(AndroidDriver driver) throws Exception{
        this.clickZhuYe();
        this.waitElement(driver, member_center);
        this.clickRDMemberCenter();
        this.clickVipTitle();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickVip30();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickKaiTong();
        this.waitElement(driver, agreepay);
        this.clickAliMianMi();
        this.clickAgreePay();
        Thread.sleep(3000);
        this.clickAliPayNow();
        Thread.sleep(3000);
        this.sendKeyA(driver,680,1500);
        Thread.sleep(500);
        this.sendKeyA(driver,320,1500);
        Thread.sleep(500);
        this.sendKeyA(driver,680,1700);
        Thread.sleep(500);
        this.sendKeyA(driver,1000,1400);
        Thread.sleep(500);
        this.sendKeyA(driver,680,1200);
        Thread.sleep(500);
        this.sendKeyA(driver,680,1200);
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
        this.clickZhuYe();
        this.waitElement(driver, member_center);
        this.clickRDMemberCenter();
        this.clickBean();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickBean550();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickKaiTong();
        this.waitElement(driver, agreepay);
        this.clickAliMianMi();
        this.clickAgreePay();
        Thread.sleep(3000);
        this.clickAliPayNow();
        Thread.sleep(3000);
        this.sendKeyA(driver,680,1500);
        Thread.sleep(500);
        this.sendKeyA(driver,320,1500);
        Thread.sleep(500);
        this.sendKeyA(driver,680,1700);
        Thread.sleep(500);
        this.sendKeyA(driver,1000,1400);
        Thread.sleep(500);
        this.sendKeyA(driver,680,1200);
        Thread.sleep(500);
        this.sendKeyA(driver,680,1200);
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
*/


    public void registeNear3(AndroidDriver driver, String qudaohao)throws Exception{
        manRegiste3(driver,qudaohao);
        this.clickFuJin();
        Thread.sleep(1000);

        if (!this.doesWebElementExist(desc.get(0))) {
            Assert.fail("附近 未显示头像框");
        }
        this.clickDesc();
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
        this.clickDesc();
        String name = this.getNearNickName3();
        if (!this.doesWebElementExist(head_map)) {
            Assert.fail("附近 点击头像，未弹出头像框");
        }
        this.clickLike();
        if (this.doesWebElementExist(head_map)) {
            Assert.fail("点击喜欢，未关闭头像框");
        }
        this.clickDesc();
        this.clickHeadmap();
        if (this.doesWebElementExist(tips)) {
            this.clickMonitor1(driver);
        }
/*//        等待头像左下角的 数量是否出现1/**，用于判断整个页面是否加载完成
        this.waitElementLoad(driver, piccount);
//      再次点击页面空白处，防止有头像多张时，消除 滑动查看照片提示
        this.clickMonitor1(driver);*/
        this.waitElement(driver, user_name_text);
//        log.info("判断打招呼后，进入空间，是否无打招呼按钮");
//        if (! this.doesWebElementExist(ask_button)) {
//            Assert.fail("进入空间页中，无“打招呼”按钮");
//        }
        log.info("判断 点击头像进入空间后，姓名是否一致，打招呼按钮是否不显示");
        if (name.equals(this.getUserNameText())&&this.getAskButtonText().equals("已打招呼")) {
            this.clickLeftBtn();
            log.info("附近地图喜欢对方后，进入空间页姓名和打招呼按钮显示正确");
        } else {
            Assert.fail("点击头像进入空间后，用户姓名不一致");
        }
    }
    //1线女注册
    public void womanRegiste1(AndroidDriver driver, String qudao) throws Exception {
        this.waitElement(driver,btn_register);
        this.clickTvBack();
        this.clickMonitor(driver);

        this.updateQuDao(qudao);
        log.info("渠道号：" + qudao);
        System.out.println("渠道号：" + qudao);
        this.clickSave();
        this.oneClickRegister();
        this.clickInputSex();
        this.clickSelectNv();
        this.clickRegister();
        if (!this.doesWebElementExist(upload_user_icon_take_photos)) {
            Assert.fail("女用户注册，第一个页面未提示上传头像");
        }
        this.clickUploadPhoto();
        this.clickShutterButton();
        this.clickBtnDone();
        this.clickReload();
        this.waitElement(driver, title_name);
        log.info("判断是否进入 自我介绍 页面");
        if (!this.getTitleName().equals("完善资料")) {
            Assert.fail("未能进入完善资料页面");
        }
        this.longPressRecord(driver);
        if (!this.doesWebElementExist(btn_i_know)) {
            Assert.fail("录制自我介绍失败，没有注册成功");
        }else{
            log.info("录制自我介绍成功,注册成功");
        }
        this.clickIKnown();
        if (!this.getTitleName().equals("结识附近的新朋友")) {
            Assert.fail("注册成功后没有进入打招呼页面");
        }else{
            log.info("注册成功进入打招呼页面");
        }
        this.clickSayHelloLayout();
        Thread.sleep(2000);
        if(this.doesWebElementExist(verificationPhone)){
            this.keyBack(driver);
        }else{
            if (!this.getTitleName().equals("身份认证")) {
                Assert.fail("注册成功后点击打招呼没有进入身份认证页面");
            }else{
                log.info("注册成功后点击打招呼进入身份认证页面");
            }
            this.clickBtnLeft();
        }
        this.clickReload();
        if (!this.getTitleName().equals("招呼管家")) {
            Assert.fail("注册成功后没有进入招呼管家页面");
        }
        this.clickMsgManagerOk();
        this.waitElement(driver,topview);
        if(this.getTopView().equals("热聊")){
            log.info("女用户注册成功进入热聊页");
        }else
            Assert.fail("女用户注册成功后未进入热聊页");
    }
    //1线女用户登陆
    public void womanLogin1(String account, String password) throws InterruptedException {
        this.clickTvBack();
        Thread.sleep(2000);

        this.sendAccount(account);
        this.sendPassword(password);
        this.clickTvBack();
        if(this.doesWebElementExist(right_love_image)){
            log.info("1线女用户登录后显示每次推荐用户");
            String titleName = this.getTitleName();
            if(titleName.contains("1/5")){
                this.clickLeftLoveImage();
                if(this.getTitleName().equals("身份认证")){
                    log.info("选中异性后进入身份认证页面");
                    this.clickBtnLeft();
                    titleName = this.getTitleName();
                    if(titleName.contains("2/5")){
                        log.info("喜欢TA后进度正确");
                        this.clickRightLoveImage();
                        this.clickBtnLeft();
                        this.clickRightLoveImage();
                        this.clickBtnLeft();
                        this.clickRightLoveImage();
                        this.clickBtnLeft();
                        this.clickRightLoveImage();
                        this.clickBtnLeft();
                    }
                }

            }else
                Assert.fail("每日推荐用户数不正确");
        }
        if (!this.doesWebElementExist(iv_card_user_name)) {
            Assert.fail("登录成功后，未进入热聊模块");
        }else
            log.info("登录成功后，进入热聊模块");
    }
    //1线女热聊
    public void womanReLiao1() {
//        this.clickReLiao();
        String name = this.getIVCardUserName();
        this.clickIVCardUserName();

        if(name.equals(this.getUserNameText())){
            log.info("热聊页用户昵称与空间页用户昵称一致");
        }else
            Assert.fail("热聊页用户昵称与空间页用户昵称不一致");
    }
    //1线女遇见页和空间页打招呼
    public void womanYuJian1(AndroidDriver driver, String qudao) throws Exception {
        this.womanRegiste1(driver,qudao);
        this.clickYuJian();
        this.waitElement(driver,iv_right_click);
        this.clickIVRight();
        this.clickTVSayHello();

        if (this.getTitleName().equals("身份认证")) {
            log.info("点击打招呼按钮进入身份认证页面");
            this.clickBtnLeft();
        } else {
            Assert.fail("点击打招呼按钮未进入身份认证页面");
        }
        this.clickIVUser();
        this.waitElement(driver, user_name_text);
        this.clickAskBtn();
        if (this.getTitleName().equals("身份认证")) {
            log.info("空间页点击打招呼按钮进入身份认证页面");
            this.clickBtnLeft();
        } else {
            Assert.fail("空间页点击打招呼按钮未进入身份认证页面");
        }

    }
}
