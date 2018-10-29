package com.LBS3.testcase;


import com.LBS3.pagecheck.Check;
import com.driver.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class test extends Driver {
    @Test(description = "3线修改，登录")
    public void checkLBS3Login() throws Exception {
        Check check=PageFactory.initElements(driver,Check.class);
        check.checkLogin(driver,"156878");
    }

    @Test(description = "3线，缘分页打招呼")
    public void checkLBS3SayHi() throws Exception {
        Check check=PageFactory.initElements(driver,Check.class);
        check.checkSayHI1(driver,"156878");
    }

    @Test(description = "3线，空间页打招呼")
    public void checkLBS3AskBtn() throws Exception {
        Check check=PageFactory.initElements(driver,Check.class);
        check.checkAskBtn(driver,"156878");
    }

    @Test(description = "3线，空间页关注")
    public void checkLBS3Conversation() throws Exception {
        Check check=PageFactory.initElements(driver,Check.class);
        check.checkConversation(driver,"156878");
    }

    @Test(description = "3线，空间页拉黑")
    public void checkLBS3Notread() throws Exception {
        Check check=PageFactory.initElements(driver,Check.class);
        check.checkNotread(driver,"156878");
    }

    @Test(description = "3线，空间页举报")
    public void checkLBS3Upgraded() throws Exception {
        Check check=PageFactory.initElements(driver,Check.class);
        check.checkUpgraded(driver,"156878");
    }

    @Test(description = "3线,空间页查看更多资料")
    public void checkLBS3More() throws Exception {
        Check check=PageFactory.initElements(driver,Check.class);
        check.checkMore(driver,"156878");
    }

    @Test(description = "3线，查看在线状态")
    public void checkLBS3OnlineStatus() throws Exception {
        Check check=PageFactory.initElements(driver,Check.class);
        check.checkOnlineStatus(driver,"156878");
    }

    @Test(description = "3线，推荐模块")
    public void checkLBS3tuijian()throws Exception{
        Check check=PageFactory.initElements(driver,Check.class);
        check.checkTuijian(driver,"156878");
    }

    @Test(description = "3线，邮件未读")
    public void checkLBS3Mailbox()throws Exception{
        Check check=PageFactory.initElements(driver,Check.class);
        check.checkMailNum(driver,"156878");
    }

    @Test(description = "3线 附近打招呼 渠道号为120220")
    public void checkLBS3Near()throws Exception{
        Check check=PageFactory.initElements(driver,Check.class);
        check.checkNear(driver);
    }

    @Test(description = "3线，对对碰")
    public void checkLBS3DuiDuiPeng()throws Exception{
        Check check=PageFactory.initElements(driver,Check.class);
        check.checkDuiDuiPeng(driver,"156878");
    }

    @Test(description = "3线 购买豆币 开通免密")
    public void checkLBS3BuyBean()throws Exception{
        Check check=PageFactory.initElements(driver,Check.class);
        check.checkBuyBean(driver,"156878");
    }

    @Test(description = "3线男，写信包月")
    public void checkLBS3BuyLetter()throws Exception{
        Check check=PageFactory.initElements(driver,Check.class);
        check.checkBuyLetter(driver,"156878");
    }
    @Test(description = "3线男，会员中心四项服务")
    public void checkMemberCenter3() throws Exception{
        Check check=PageFactory.initElements(driver,Check.class);
        check.checkVipCenter(driver,"156878");
    }

    @Test(description = "1线男，会员中心四项服务")
    public void checkMemberCenter1() throws Exception{
        Check check=PageFactory.initElements(driver,Check.class);
        check.check1VipCenter(driver,"120220");
    }

    @Test(description = "3线男，豆币购买列表及支付宝，微信调起")
    public void checkBean() throws Exception{
        Check check=PageFactory.initElements(driver,Check.class);
        check.checkBean(driver,"156878");
    }


    @Test(description = "写信包月购买列表及支付宝，微信调起")
    public void checkLetter() throws Exception{
        Check check=PageFactory.initElements(driver,Check.class);
        check.checkLetter(driver,"156878");
    }
    @Test(description = "皇冠特权购买列表及支付宝，微信调起")
    public void checkVip() throws Exception{
        Check check=PageFactory.initElements(driver,Check.class);
        check.checkVipTitle(driver,"156878");
    }

    @Test(description = "3线 收信宝购买列表及支付宝，微信调起")
    public void checkReciveLetter() throws Exception{
        Check check=PageFactory.initElements(driver,Check.class);
        check.checkReciveLetter(driver,"156878");
    }

    @AfterMethod
    public void resetApp() throws Exception{
        driver.resetApp();
    }

}
