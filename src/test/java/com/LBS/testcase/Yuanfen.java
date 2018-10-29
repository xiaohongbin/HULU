package com.LBS.testcase;

import com.LBS.pagecheck.*;
import com.LBS.pagemethod.MeMethod;
import com.driver.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Yuanfen extends Driver {
//    @Test(description = "注册登录")
//    public void login() throws Exception {
//        LoginCheck loginCheck = PageFactory.initElements(driver, LoginCheck.class);
//        loginCheck.clickBtnRegist();
//        loginCheck.clickBtnMen();
//        loginCheck.clickBtnOK();
//        loginCheck.checkLogin();
//    }

    @Test(description = "缘分页TITLE")
    public void yuanfenTITLE() throws Exception {
        YuanfenCheck yuanfenCheck = PageFactory.initElements(driver, YuanfenCheck.class);
        yuanfenCheck.checkTitle();
//        yuanfenCheck.checkSayHI1(driver);
//        yuanfenCheck.checkAskBtn();
//        yuanfenCheck.checkConversation();
//        yuanfenCheck.checkNotread();
    }

    @Test(description = "1线男 缘分页列表打招呼")
    public void yuanfenSAYHI1() throws Exception {
        YuanfenCheck yuanfenCheck = PageFactory.initElements(driver, YuanfenCheck.class);
//        yuanfenCheck.checkTitle();
        yuanfenCheck.checkSayHI1(driver);
//        yuanfenCheck.checkAskBtn();
//        yuanfenCheck.checkConversation();
//        yuanfenCheck.checkNotread();
    }

    @Test(description = "1线男 空间打招呼")
    public void yuanfenAskbtn() throws Exception {
        YuanfenCheck yuanfenCheck = PageFactory.initElements(driver, YuanfenCheck.class);
//        yuanfenCheck.checkTitle();
//        yuanfenCheck.checkSayHI1(driver);
        yuanfenCheck.checkAskBtn(driver);
//        yuanfenCheck.checkConversation();
//        yuanfenCheck.checkNotread();
    }

    @Test(description = "1线男 关注功能")
    public void yuanfenConversation()throws Exception{
        YuanfenCheck yuanfenCheck = PageFactory.initElements(driver, YuanfenCheck.class);
        yuanfenCheck.checkConversation(driver);
    }

    @Test(description = "1线男 拉黑功能")
    public void yuanfenNotread() throws Exception{
        YuanfenCheck yuanfenCheck = PageFactory.initElements(driver, YuanfenCheck.class);
        yuanfenCheck.checkNotread(driver);
    }

    @Test(description = "1线男 举报功能")
    public void yuanfenUpgraded() throws Exception{
        YuanfenCheck yuanfenCheck = PageFactory.initElements(driver, YuanfenCheck.class);
        yuanfenCheck.checkUpgraded(driver);
    }

    @Test(description = "1线男 空间在线状态")
    public void yuanfenVip() throws Exception{
        YuanfenCheck yuanfenCheck = PageFactory.initElements(driver, YuanfenCheck.class);
        yuanfenCheck.checkOnlineStatus(driver);
    }

    @Test(description = "1线男 搜索初始验证")
    public void yuanfensearch() throws Exception{
        SearchCheck searchCheck = PageFactory.initElements(driver, SearchCheck.class);
        searchCheck.initCheck();
//        yuanfenCheck.checkArea();
//        yuanfenCheck.checkAge();
    }

    @Test(description = "1线男 搜索 所在地 验证")
    public void yuanfenSearchAera() throws Exception{
        SearchCheck searchCheck = PageFactory.initElements(driver, SearchCheck.class);
//        yuanfenCheck.initCheck();
        searchCheck.checkArea();
//        yuanfenCheck.checkAge();
    }

    @Test(description = "1线男 搜索 年龄 验证")
    public void yuanfenSearchAge() throws Exception{
        SearchCheck searchCheck = PageFactory.initElements(driver, SearchCheck.class);
//        yuanfenCheck.initCheck();
//        yuanfenCheck.checkArea();
        searchCheck.checkAge();
    }

    @Test(description = "1线男 搜索 身高 验证")
    public void yuanfenSearchHeight() throws Exception{
        SearchCheck searchCheck = PageFactory.initElements(driver, SearchCheck.class);
//        yuanfenCheck.initCheck();
//        yuanfenCheck.checkArea();
        searchCheck.checkHeight();
    }

    @Test(description = "1线男 搜索验证")
    public void yuanfenSearchAll() throws Exception{
        SearchCheck searchCheck = PageFactory.initElements(driver, SearchCheck.class);
//        yuanfenCheck.initCheck();
//        yuanfenCheck.checkArea();
        searchCheck.checkAll();
    }

    @Test(description = "1线男 搜索列表招呼")
    public void yuanfenSearchHello() throws Exception {
        SearchCheck searchCheck = PageFactory.initElements(driver, SearchCheck.class);
        searchCheck.checkHello();

    }

    @Test(description = "1线男 未读信检查")
    public void yuanfenMailboxMum()throws Exception{
        MailBoxCheck mailBoxCheck=PageFactory.initElements(driver,MailBoxCheck.class);
        mailBoxCheck.checkMailNum();
    }

    @Test(description = "1线男 信箱下方打招呼")
    public  void yuanfenMailSayhi()throws Exception{
        MailBoxCheck mailBoxCheck=PageFactory.initElements(driver,MailBoxCheck.class);
        mailBoxCheck.checkSayhi();
    }

    @Test(description = "1线男，信箱查看个人信息")
    public void yuanfenMailMemberInfo()throws Exception{
        MailBoxCheck mailBoxCheck=PageFactory.initElements(driver,MailBoxCheck.class);
        mailBoxCheck.checkPersonalData();
    }


    @Test(description = "1线男，个人中心 传照片")
    public void yuanfenMyImg() throws Exception {
        MeCheck meCheck=PageFactory.initElements(driver,MeCheck.class);
        meCheck.checkUploadPic(driver);
    }

    @Test(description = "1线男，豆币购买")
    public void yuanfenBuyBean() throws Exception {
        MeCheck meCheck=PageFactory.initElements(driver,MeCheck.class);
        meCheck.checkBean(0,driver);
    }

    @Test(description = "1线男 写信包月")
    public void yuanfenBuyLetter() throws Exception{
        MeCheck meCheck=PageFactory.initElements(driver,MeCheck.class);
        meCheck.checkLetter(driver);
    }

    @Test(description = "1线男，完善资料")
    public void yuanfenMemberInfo() throws Exception{
        MeCheck meCheck=PageFactory.initElements(driver,MeCheck.class);
        meCheck.checkPersonalData(driver);
    }

    @Test(description = "1线男 征友条件")
    public void yuanfenCondition() throws Exception{
        MeCheck meCheck=PageFactory.initElements(driver,MeCheck.class);
        meCheck.checkCondition(driver);
    }

    @Test(description = "1线男 匹配问答")
    public void yuanfenQuestion() throws Exception{
        MeCheck meCheck=PageFactory.initElements(driver,MeCheck.class);
        meCheck.checkQuestion(driver);
    }

    @Test(description = "1线男 我的标签")
    public void yuanfenMyTag() throws Exception{
        MeCheck meCheck=PageFactory.initElements(driver,MeCheck.class);
        meCheck.checkMyTag(driver);
    }


    @BeforeMethod
    public void login()throws Exception{
        LoginCheck loginCheck = PageFactory.initElements(driver, LoginCheck.class);
//        loginCheck.clickBtnRegist();
        loginCheck.clickBtnMen();
        loginCheck.clickBtnOK();
        loginCheck.checkLogin();
    }

    @AfterMethod
    public void restart()throws Exception{
        driver.resetApp();
    }
}
