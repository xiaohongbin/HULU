package com.LBS.pagecheck;

import com.LBS.pagemethod.LoginMethod;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;

public class LoginCheck extends LoginMethod {

    public void checkLogin() {
        if (this.getTitle().equals("完善资料")) {
            this.clickBtnleft();
            this.clickBtnleft();
        } else {
            Assert.fail("未进入“完善资料”页面");
        }
    }

    public void checkWomenLogin(AndroidDriver driver)throws Exception{
        this.clickBtnWomen();
        this.clickBtnOK();
        this.clickUploadLocalhostImages();
        this.clickImg();
        this.clickMonitor(driver);
        this.clickImgOk();
        this.swipeToDown(driver);
        this.clickImgSure();
        if(!this.getVoice().contains("语音")){
            Assert.fail("未进入语音介绍页面");
        }
        this.keyBack(driver);
        this.clickKnow();
        this.keyBack(driver);
        Thread.sleep(2000);
        this.keyBack(driver);
        if(!this.getTopView().equals("缘分")){
            Assert.fail("未能进入缘分页");
        }
    }

    public void checkSayhi(AndroidDriver driver)throws Exception{
        this.clickBtnWomen();
        this.clickBtnOK();
//        this.keyBack(driver);
//        this.clickUploadLocalhostImages();
//        this.clickImg();
//        this.clickMonitor(driver);
//        this.clickImgOk();
//        this.swipeToDown(driver);
//        this.clickImgSure();
//        if(!this.getVoice().contains("语音")){
//            Assert.fail("未进入语音介绍页面");
//        }
        this.keyBack(driver);
        this.clickKnow();
        this.keyBack(driver);
        Thread.sleep(2000);
        this.keyBack(driver);
//        if(!this.getTopView().equals("缘分")){
//            Assert.fail("未能进入缘分页");
//        }
    }


}
