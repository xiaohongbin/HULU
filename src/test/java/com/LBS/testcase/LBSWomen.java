package com.LBS.testcase;

import com.LBS.pagecheck.LoginCheck;
import com.LBS.pagecheck.MailBoxCheck;
import com.LBS.pagecheck.MeCheck;
import com.LBS.pagecheck.YuanfenCheck;
import com.driver.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LBSWomen extends Driver {

    @Test(description = "女用户 登录")
    public void login()throws Exception{
        LoginCheck loginCheck=PageFactory.initElements(driver,LoginCheck.class);
        loginCheck.checkWomenLogin(driver);
    }

    @Test(description = "1线，女用户打招呼上限")
    public void sayhi()throws Exception{
        YuanfenCheck yuanfenCheck=PageFactory.initElements(driver,YuanfenCheck.class);
        yuanfenCheck.checkWomenSayHi(driver);
    }

    @Test(description = "1线，女用户 招呼助手功能")
    public void mailbox()throws Exception{
        MailBoxCheck mailBoxCheck=PageFactory.initElements(driver,MailBoxCheck.class);
        mailBoxCheck.checkMailboxwomen(driver);
    }

    @Test(description = "1线，女用户 会员功能")
    public void membercenter() throws Exception{
        MeCheck meCheck=PageFactory.initElements(driver,MeCheck.class);
        meCheck.checkWomen(driver);
    }

    @AfterMethod
    public void restart()throws Exception{
        driver.resetApp();
    }


}
