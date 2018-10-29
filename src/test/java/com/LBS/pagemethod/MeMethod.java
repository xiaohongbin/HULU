package com.LBS.pagemethod;

import com.LBS.page.MePage;
import com.aventstack.extentreports.ExtentTest;
import com.listener.ExtentTestNGITestListener;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class MeMethod extends MePage {
    ExtentTestNGITestListener el = new ExtentTestNGITestListener();
    ExtentTest log=el.getlog();
    public void clickMeIcon(){
        meIcon.click();
    }

    public void clickUploadPic(){
        uploadpic.click();
    }

    public void clickLocalPic(){
        localpicture.click();
    }

    public void clickImg(){
        img.click();
    }

    public void clickMonitor(AndroidDriver driver) {
        TouchAction action = new TouchAction(driver);
        int width = driver.manage().window().getSize().width;
        action.tap(200, 400).perform();
    }

    public void clickImgOK(){
        imgok.click();
    }

    public String getCurrentActivity(AndroidDriver driver){
//        System.out.println(driver.getAutomationName());
        return  driver.currentActivity();
    }

    public String getTitle(){
        return title_name.getText();
    }

    public void clickMembercenter(){
        membercenter.click();
    }

    public int getBeanNum(){
        String a=beannum.getText().replace("豆币","");
        String b=a.replace("个","");
        return Integer.parseInt(b);
    }

    public void clickBean(){
        bean.click();
    }

    public void clickLetter(){
        letter.click();
    }

    public void clickBuy90(){
        buy90.click();
    }

    public void clickOK(){
        ok.click();
    }

    public void keyBack(AndroidDriver driver){
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }

    public void clickWecharPay(){
        wecharpay.click();
    }

    public String getBeanpower(){
        return beanpower.getAttribute("content-desc");
    }

    public void clickBean800(){
        bean800.click();
    }


    //    通用判断元素是否存在
    public boolean doesWebElementExist(WebElement webElement)
    {
        try {
            return webElement.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }


    public void clickMegClose(){
        if (this.doesWebElementExist(msg_close)) {
            log.info("点击 关闭上方“信息通知”");
            msg_close.click();
        }else{
            log.info("当前无“信息通知”");
        }
    }

    public void clickMemberInfo(){
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

    public void clickSave(){
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


    public  void swipeToUp(AndroidDriver driver) {
        Duration duration=Duration.ofSeconds(1);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
//        System.out.println(width);
//        System.out.println(height);
        TouchAction action1 = new TouchAction(driver).press(width / 2,height* 3/4).waitAction(duration).moveTo(width /2, height/4).release();
        action1.perform();
    }


    public String getMemberInfo(){
        return  memberinfo.getText();
    }

    public void clickBodyItem(){
        bodyitem.click();
    }

    public String getLocalView(){
        return  location_view.getText();
    }
    public void clickLocalView(){
        location_view.click();
    }

    public String getAgeView(){
        return  age_view.getText();
    }

    public void clickAgeView(){
        age_view.click();
    }

    public String getHeightView(){
        return height_view.getText();
    }

    public void clickHeightView(){
        height_view.click();
    }


    public String getHeightText(){
        log.info("获取 身高 条件");
        return  height_text.getText();
    }

    public String getAreaText(){
        log.info("获取 所在地 条件");
        return area_text.getText();
    }

    public String getAgeText(){
        log.info("获取 年龄 条件");
        return  age_text.getText();
    }

    public void clickDown(){
        down.click();
    }

    public void clickSearchIcon(){
        search_icon.click();
    }

    public void clickSearchButton(){
        search_right_button.click();
    }





   public void clickYuanfenIcon(){
        yuanfen_icon.click();
   }

    public void clickTabs(){
        log.info("点击页面下部");
        tabs.click();
    }

    public void clickUsername(){
        log.info("点击“姓名”");
        user_name_text.click();
    }

    public String getMemberInfoText(){
        return memberinfotext.getText();
    }


    public void clickLeftBtn(){
        left_btn.click();
    }

    public void clickLeft(){
        left.click();
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


    public  void swipeToMyTag(AndroidDriver driver) {
        log.info("滑动至“我的标签”");
        Duration duration=Duration.ofSeconds(1);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
//        System.out.println(width);
//        System.out.println(height);
        TouchAction action1 = new TouchAction(driver).press(500,1400).waitAction(duration).moveTo(500, 1000).release();
        action1.perform();
    }

    public void clickMonitor1(AndroidDriver driver) {
        TouchAction action = new TouchAction(driver);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
//        System.out.println(width);
//        System.out.println(height);
        action.tap(width-1, height-1).perform();
    }


    public void clickBtnWomen(){
        btn_women.click();
    }

    public void clickBtnOK(){
//        log.info("点击“确认”");
        btn_ok.click();
    }

    public void  clickMatchingQa(){
        matching_qa.click();
    }

    public void clickQuestionView(){
        question_view.click();
    }

    public void clickSendQuestion(){
        send_question.click();
    }

    public void clickQuestionNum(){
        questionnum.click();
    }

    public int getQuestionNum(){
        return Integer.parseInt(questionnum.getText());
    }

    public void clickMyTag(){
        mytag.click();
    }

    public void clickMatch(){
        match.click();
    }




}
