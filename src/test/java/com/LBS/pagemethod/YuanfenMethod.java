package com.LBS.pagemethod;

import com.listener.ExtentTestNGITestListener;
import com.LBS.page.YuanfenPage;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class YuanfenMethod extends YuanfenPage {

    ExtentTestNGITestListener el = new ExtentTestNGITestListener();
    ExtentTest log=el.getlog();

//    通用判断元素是否存在
    public boolean doesWebElementExist(WebElement webElement)
    {
        try {
            return webElement.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

//     关闭上方通知信息
    public void clickMegClose(){
        if (this.doesWebElementExist(msg_close)) {
            log.info("点击 关闭上方“信息通知”");
            msg_close.click();
        }else{
            log.info("当前无“信息通知”");
        }
    }

//    点击 缘分页 第一排左侧用户头像左上方 心标
    public void clickSayHI1(){
        log.info("点击 缘分页 第一排左侧用户头像左上方 心标");
        iv_sayhi1.click();
    }

//    点击 缘分页 第一排左侧用户头像
    public void clickIMG1(){
        log.info("点击 缘分页 第一排左侧用户头像");
        img1.click();
    }

    //    点击 缘分页 第一排右侧用户头像
    public void clickIMG2(){
        log.info("点击 缘分页 第一排右侧用户头像");
        img2.click();
    }

//    获取缘分页 第一排左侧用户 姓名
    public String getName1(){
        log.info("获取缘分页 第一排左侧用户 姓名");
        return name1.getText();
    }

//    获取 空间页 用户姓名
    public String getName1_1(){
        log.info("获取 空间页 用户姓名");
        return name1_1.getText();
    }

//    点击 空间中 下一位按钮
    public void clickNext(){
        log.info("点击 空间中 下一位按钮");
        next_button.click();
    }

//    点击 空间中 左上角回退 按钮
    public void clickLeftBtn(){
        log.info("点击 空间中 左上角回退 按钮");
        left_btn.click();
    }

//    点击空间中“打招呼”按钮
    public void clickAskBtn(){
        log.info("点击空间中“打招呼”按钮");
        ask_button.click();
    }

//    获取页面标题
    public String getPageTitle(){
        log.info("获取页面标题");
        return topview.getText();
    }

    public void clickTabs(){
        log.info("点击页面下部");
        tabs.click();
    }

    public void clickUsername(){
        log.info("点击“姓名”");
        user_name_text.click();
    }

    public void clickRightTop(){
        log.info("点击右侧按钮");
        right_top.click();
    }

    public String getConversation(){
        log.info("获取 关注 信息");
        return conversation.getText();
    }

    public void clickConversation(){
        log.info("点击“关注”");
        conversation.click();
    }

    public String getNotread(){
        log.info("获取 拉黑 信息");
        return notread.getText();
    }

    public void clickNotread(){
        log.info("点击“拉黑”" );
        notread.click();
    }

    public String getUpgraded(){
        log.info("获取 举报 信息");
        return upgraded.getText();
    }

    public void clickUpgraded(){
        log.info("点击“举报”");
        upgraded.click();
    }

    public void clickBtnCancle(){
        log.info("点击“取消”");
        btn_cancle.click();
    }

    public void clickBtnok(){
        log.info("点击“确定”");
        btn_ok.click();
    }

    public void clickOther(){
        log.info("点击 举报中“其他”");
        other.click();
    }

    public void clickSure(){
        log.info("点击 举报中“确定举报/返回”");
        sure.click();
    }


    public  void swipeToDown(AndroidDriver driver) {
        Duration duration=Duration.ofSeconds(1);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
//        System.out.println(width);
//        System.out.println(height);
        TouchAction action1 = new TouchAction(driver).press(width / 2,height/4).waitAction(duration).moveTo(width /2, height* 3/4).release();
        action1.perform();
    }


    public  void swipeToUp(AndroidDriver driver) {
        Duration duration=Duration.ofSeconds(1);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
//        System.out.println(width);
//        System.out.println(height);
        TouchAction action1 = new TouchAction(driver).press(width / 2,height* 3/4).waitAction(duration).moveTo(width /2, height/4).release();
        action1.perform();
    }

    public void clickOnlineStatus(){
        log.info("点击“开通会员”");
        online_status.click();
    }

    public String  getTitleName(){
        log.info("获取页面标题");
        return title_name.getText();
    }


    public void clickBtnWomen(){
        btn_women.click();
    }


    public void keyBack(AndroidDriver driver){
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }

    public void clickKnow(){
        btn_know.click();
    }

    public void clickBtnOK(){
//        log.info("点击“确认”");
        btn_ok.click();
    }

    public void clickMonitor1(AndroidDriver driver) {
        TouchAction action = new TouchAction(driver);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
//        System.out.println(width);
//        System.out.println(height);
        action.tap(width-1, height-1).perform();
    }


    public void clickMeIcon(){
        meIcon.click();
    }

    public void clickConversationPerson(){
        conversationperson.click();
    }

    public int getConversationPersonNum(){
        return Integer.parseInt(conversationpersonnum.getText());
    }

    public String getConversationPersonName(){
        return user_nickname.getText();
    }
}
