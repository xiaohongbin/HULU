package com.LBS.pagecheck;

import com.listener.ExtentTestNGITestListener;
import com.LBS.pagemethod.YuanfenMethod;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;

public class YuanfenCheck extends YuanfenMethod {
    ExtentTestNGITestListener el = new ExtentTestNGITestListener();
    ExtentTest log = el.getlog();

    public void checkTitle() {
        if (this.getPageTitle().equals("缘分")) {
            log.info("当前在“缘分”页面");
        } else {
            log.warning("当前不在“缘分”页面");
        }
    }

    public void checkSayHI1(AndroidDriver driver) throws Exception{
        this.swipeToDown(driver);
        this.clickMegClose();
        this.clickSayHI1();
        String name = this.getName1();
        this.clickIMG1();
        this.clickMonitor1(driver);
        Thread.sleep(1000);
        this.clickMonitor1(driver);
        if (this.doesWebElementExist(ask_button)) {
            Assert.fail("在列表上点击“打招呼后”，进入空间页中，出现“打招呼”按钮");
        } else {
            log.info("空间页中无“打招呼”按钮");
        }
        if (name.equals(this.getName1_1())) {
            this.clickLeftBtn();
        } else {
            Assert.fail("点击头像进入空间后，用户姓名不一致");
        }
    }

    public void checkAskBtn(AndroidDriver driver) throws Exception{
        this.swipeToDown(driver);
        String name1;
        String name2;
//        System.out.println(this.doesWebElementExist(msg_close));
        this.clickMegClose();
        this.clickIMG2();
        this.clickMonitor1(driver);
        Thread.sleep(500);
        this.clickMonitor1(driver);
        Thread.sleep(500);
        if (this.doesWebElementExist(ask_button)) {
            name1 = this.getName1_1();
            this.clickAskBtn();
            Thread.sleep(10000);
            this.clickMonitor1(driver);
            Thread.sleep(500);
            name2 = this.getName1_1();
            if (name1.equals(name2)) {
                Assert.fail("在空间中点击“打招呼”按钮后，未跳转至另一用户");
            } else {
                name1 = this.getName1_1();
                this.clickNext();
                Thread.sleep(1000);
                this.clickMonitor1(driver);
                Thread.sleep(1000);
                name2 = this.getName1_1();
                if (name1.equals(name2)) {
                    Assert.fail("在空间中点击“下一个”按钮后，未跳转至另一用户");
                } else {
                    this.clickLeftBtn();
                }
            }
        } else {
            Assert.fail("未打招呼用户，进入空间后，无“打招呼”按钮");
        }
    }

    public void checkConversation(AndroidDriver driver) throws Exception{
//        this.swipeToDown(driver);
        this.clickMegClose();
        this.clickIMG2();
        Thread.sleep(1000);
        this.clickMonitor1(driver);
        Thread.sleep(500);
        this.clickMonitor1(driver);
        Thread.sleep(500);
        String name1=this.getName1_1();
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
        this.clickMeIcon();
        Thread.sleep(500);
        this.swipeToUp(driver);
        Thread.sleep(500);
        this.swipeToUp(driver);
        Thread.sleep(500);
        int i=this.getConversationPersonNum();
        this.clickConversationPerson();
        int j=user_headphoto.size();
        String name2=this.getConversationPersonName();

        if(i!=j){
            Assert.fail("显示关注的人 数量，与实际列表中不一致");
        }
        if(!name1.equals(name2)){
            Assert.fail("实际关注的人与列表显示关注的人，名字不一致");
        }
    }

    public void checkNotread(AndroidDriver driver) throws Exception{
        this.swipeToDown(driver);
        this.clickMegClose();
        this.clickIMG2();
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

    public void checkUpgraded(AndroidDriver driver) throws Exception{
        this.swipeToDown(driver);
        this.clickMegClose();
        this.clickIMG2();
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

    public void checkOnlineStatus(AndroidDriver driver)throws Exception{
        this.swipeToDown(driver);
        this.clickMegClose();
        this.clickIMG2();
        Thread.sleep(1000);
        this.clickMonitor1(driver);
        Thread.sleep(1000);
        this.clickMonitor1(driver);
        this.swipeToUp(driver);
        Thread.sleep(1000);
        this.clickOnlineStatus();
        Thread.sleep(3000);
        if(this.getTitleName().equals("皇冠特权")){
            log.info("成功进入“皇冠特权”页");
        }else{
            Assert.fail("未进入 特权页面");
        }
    }

    public void checkWomenSayHi(AndroidDriver driver) throws Exception{
        this.clickBtnWomen();
        this.clickBtnOK();
        Thread.sleep(10000);
        this.keyBack(driver);
        Thread.sleep(5000);
        this.keyBack(driver);
        Thread.sleep(5000);
        this.keyBack(driver);
        Thread.sleep(5000);
        this.keyBack(driver);
        this.clickSayHI1();
        String name = this.getName1();
        this.clickIMG1();
        this.clickMonitor1(driver);
        Thread.sleep(1000);
        this.clickMonitor1(driver);
        Thread.sleep(1000);
        if (this.doesWebElementExist(ask_button)) {
            Assert.fail("在列表上点击“打招呼后”，进入空间页中，出现“打招呼”按钮");
        } else {
//            System.out.println("kdfjlajdfl;ajdf;ljadfs;lkjadlskfj");
            log.info("空间页中无“打招呼”按钮");
        }
//        System.out.println("11111111111111111111111111111111");
        if (name.equals(this.getName1_1())) {
//            System.out.println("22222222222222222222222222222");
            this.clickLeftBtn();
        } else {
            Assert.fail("点击头像进入空间后，用户姓名不一致");
        }
        this.clickIMG2();
        this.clickMonitor1(driver);
        Thread.sleep(1000);
        this.clickMonitor1(driver);
        Thread.sleep(1000);
        String name1=this.getName1_1();
        if (this.doesWebElementExist(ask_button)) {
            this.clickAskBtn();
            Thread.sleep(2000);
            String name2=this.getName1_1();
            if(!name1.equals(name2)){
                this.clickAskBtn();
                if(!this.doesWebElementExist(submit_button)){
                    Assert.fail("女用户打招呼超过2个后，未提示要求验证手机");
                }
            }else{
                Assert.fail("空间打招呼后，未跳转至下一个用户");
            }
        }else {
            Assert.fail("未打招呼用户，进入空间后，无“打招呼”按钮");
        }
    }

}
