package com.yhb.testcase;

import com.driver.Driver;
import com.yhb.check.YHBCheck;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class testcase extends Driver {

    @Test(description = "男用户注册")
    public void checkManRegister() throws Exception{
        YHBCheck yhbCheck=PageFactory.initElements(driver,YHBCheck.class);
        yhbCheck.manRegister(driver);
//        yhbCheck.dateAndAnswer(driver);   //约会问答

    }

    @Test(description = "女用户注册")
    public void checkWomenRegister() throws Exception{
        YHBCheck yhbCheck=PageFactory.initElements(driver,YHBCheck.class);
        yhbCheck.womenRegister(driver);
    }

    @Test(description = "用户登陆")
    public void checkManLogin() throws Exception{
        YHBCheck yhbCheck=PageFactory.initElements(driver,YHBCheck.class);
        yhbCheck.login();
        yhbCheck.waitElement(driver,yhbCheck.top_me);
        Assert.assertTrue(yhbCheck.topMe(),"登陆失败！");

    }

    @Test(description = "男用户注册后完善个人信息")
    public void checkPerfectInformation() throws Exception{
        YHBCheck yhbCheck=PageFactory.initElements(driver,YHBCheck.class);
        yhbCheck.manLogin();
        yhbCheck.perfectInformation(driver);  //完善个人信息
    }


    @Test(description = "男用户注册后，约会问答")
    public void checkManDateAndAnswer() throws Exception{
        YHBCheck yhbCheck=PageFactory.initElements(driver,YHBCheck.class);
        yhbCheck.manLogin();
        yhbCheck.clickBtnBack();
        yhbCheck.dateAndAnswer(driver);   //约会问答

    }

    @Test(description = "男用户首页")
    public void checkHome() throws Exception {
        YHBCheck yhbCheck = PageFactory.initElements(driver, YHBCheck.class);
//        yhbCheck.manLogin();
//        yhbCheck.clickBtnBack();
//        yhbCheck.keyBack(driver);  //手机的返回按钮
        yhbCheck.homeTab(driver);

    }

    @Test(description = "男用户消息")
    public void checkMessage() throws Exception {
        YHBCheck yhbCheck = PageFactory.initElements(driver, YHBCheck.class);
//        yhbCheck.manLogin();
//        yhbCheck.clickBtnBack();
//        yhbCheck.keyBack(driver);  //手机的返回按钮

        yhbCheck.messageTab(driver);
    }

    @Test(description = "男用户-我的诚信等级验证")
    public void checkCreditRating() throws Exception {
        YHBCheck yhbCheck = PageFactory.initElements(driver, YHBCheck.class);
//        yhbCheck.manLogin();
//        yhbCheck.clickBtnBack();
//        yhbCheck.keyBack(driver);  //手机的返回按钮

        yhbCheck.creditRating(driver);
    }

    @Test(description = "男用户-我的相册")
    public void checkPicture() throws Exception {
        YHBCheck yhbCheck = PageFactory.initElements(driver, YHBCheck.class);
//        yhbCheck.manLogin();
//        yhbCheck.clickBtnBack();
//        yhbCheck.keyBack(driver);  //手机的返回按钮

        yhbCheck.MyPic(driver);
    }

    @Test(description = "男用户-约会要求")
    public void checkDateRequirements() throws Exception {
        YHBCheck yhbCheck = PageFactory.initElements(driver, YHBCheck.class);
        yhbCheck.manLogin();
        yhbCheck.clickBtnBack();
        yhbCheck.keyBack(driver);  //手机的返回按钮
        yhbCheck.DateRequirements(driver);
    }
    @Test(description = "男用户-自我介绍")
    public void checkSelfIntroduction() throws Exception {
        YHBCheck yhbCheck = PageFactory.initElements(driver, YHBCheck.class);
        yhbCheck.manLogin();
        yhbCheck.clickBtnBack();
        yhbCheck.keyBack(driver);  //手机的返回按钮

        yhbCheck.selfIntroduction(driver);
    }

    @Test(description = "男用户-问答游戏")
    public void checkQuestionAndAnswerGame() throws Exception {
        YHBCheck yhbCheck = PageFactory.initElements(driver, YHBCheck.class);
        yhbCheck.manLogin();
        yhbCheck.clickBtnBack();
        yhbCheck.keyBack(driver);  //手机的返回按钮

        yhbCheck.questionAndAnswerGame(driver);
    }

    @Test(description = "男用户-会员中心-豆币")
    public void checkBeanPrice1() throws Exception {
        YHBCheck yhbCheck = PageFactory.initElements(driver, YHBCheck.class);
        yhbCheck.manLogin();
        yhbCheck.clickBtnBack();
        yhbCheck.keyBack(driver);  //手机的返回按钮

        yhbCheck.beanPrice1(driver);
    }

    @Test(description = "男用户-会员中心-写信包月")
    public void checkLetterPrice1() throws Exception {
        YHBCheck yhbCheck = PageFactory.initElements(driver, YHBCheck.class);
        yhbCheck.manLogin();
        yhbCheck.clickBtnBack();
        yhbCheck.keyBack(driver);  //手机的返回按钮
        yhbCheck.letterPrice1(driver);
    }
    @Test(description = "男用户-会员中心-VIP")
    public void checkVipPrice1() throws Exception {
        YHBCheck yhbCheck = PageFactory.initElements(driver, YHBCheck.class);
        yhbCheck.manLogin();
        yhbCheck.clickBtnBack();
        yhbCheck.keyBack(driver);  //手机的返回按钮
        yhbCheck.VipPrice1(driver);
    }

   /* @Test(description = "男用户-会员中心-收信宝")
    public void checkReceiveLetterPrice1() throws Exception {
        YHBCheck yhbCheck = PageFactory.initElements(driver, YHBCheck.class);
        yhbCheck.manLogin();
        yhbCheck.clickBtnBack();
        yhbCheck.keyBack(driver);  //手机的返回按钮
        yhbCheck.receiveLetterPrice1(driver);
    }*/

    @Test(description = "男 -咪咕会员")
    public void checkMiguList1()throws Exception{
        YHBCheck yhbCheck=PageFactory.initElements(driver,YHBCheck.class);
        yhbCheck.manLogin();
        yhbCheck.clickBtnBack();
        yhbCheck.keyBack(driver);  //手机的返回按钮
        yhbCheck.migu(driver);
    }

    @Test(description = "注册后重置密码")
    public void checkResetPwd() throws Exception {
        YHBCheck yhbCheck = PageFactory.initElements(driver, YHBCheck.class);
        yhbCheck.manLogin();
        yhbCheck.clickBtnBack();
        yhbCheck.keyBack(driver);  //手机的返回按钮
        yhbCheck.resetPwd(driver);


    }
    @Test(description = "女用户注册后信箱缘分小助手")
    public void checkSmallAssistant() throws Exception {
        YHBCheck yhbCheck = PageFactory.initElements(driver, YHBCheck.class);
        yhbCheck.girlLogin(driver);
        yhbCheck.smallAssistant(driver);


    }


    @Test(description = "男用户登陆后每日推荐")
    public void checkDayRecommend() throws Exception {
        YHBCheck yhbCheck = PageFactory.initElements(driver, YHBCheck.class);
        yhbCheck.login();
        yhbCheck.recommendedDaily(driver);


    }



    @AfterMethod
    public void resetApp() throws Exception{
        driver.resetApp();
    }
}
