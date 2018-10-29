package com.LBS.pagemethod;

import com.listener.ExtentTestNGITestListener;
import com.LBS.page.LoginPage;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.Random;

public class LoginMethod extends LoginPage {
    ExtentTestNGITestListener el = new ExtentTestNGITestListener();
    ExtentTest log=el.getlog();

    public void clickBtnRegist() {
//        System.out.println(this.doesWebElementExist(btn_regist));
        if (this.doesWebElementExist(btn_regist)) {
//            log.info("点击“返回注册”");
            btn_regist.click();
        }else{
//            log.info("当前在注册页面");
        }
    }

    public void clickBtnMen(){
//        log.info("点击“我是男”");
        btn_men.click();
    }
    public void clickBtnOK(){
//        log.info("点击“确认”");
        btn_ok.click();
    }

    public void clickBtnleft(){
//        log.info("点击左上角“<”");
        btn_left.click();
    }

    public String getTitle(){
//        log.info("获取所在页面title");
        return page_title.getText();
    }


    public boolean doesWebElementExist(WebElement webElement)
    {
        try {
            webElement.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }


    public void clickBtnWomen(){
        btn_women.click();
    }

    public void clickUploadLocalhostImages(){
        uploadlocalhostimages.click();
    }

    public void clickImg(){
        img.click();
    }

    public void clickImgOk(){
        imgok.click();
    }

    public void clickMonitor(AndroidDriver driver) {
        TouchAction action = new TouchAction(driver);
        int width = driver.manage().window().getSize().width;
        action.tap(200, 400).perform();
    }

    public void clickImgSure(){
        imgsure.click();
    }

    public void keyBack(AndroidDriver driver){
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }

    public String getVoice(){
        return  voice.getText();
    }

    public void clickKnow(){
        btn_know.click();
    }

    public String getTopView(){
        return  topview.getText();
    }


    public  void swipeToDown(AndroidDriver driver) {
        Duration duration=Duration.ofSeconds(1);
        Random rand = new Random();

        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
//        System.out.println(width);
//        System.out.println(height);
        TouchAction action1 = new TouchAction(driver).press(width / 2,height/4).waitAction(duration).moveTo(width /2, rand.nextInt(1080) + 1).release();
        action1.perform();
    }



}
