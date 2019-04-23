package com.yyw.testcase;

import com.driver.Driver;
import com.yyw.check.YywCheck;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class testcase extends Driver {

    @Test(description = "一线男 登录付费引导")
    public void checkManLoginPay1() throws Exception {
        YywCheck yywCheck = PageFactory.initElements(driver, YywCheck.class);
        yywCheck.manLoginPay1("874965866","qwe123456",driver,"90833");
    }

    @Test(description = "一线男打招呼")
    public void checkManSayHi1() throws Exception {
        YywCheck yywCheck = PageFactory.initElements(driver, YywCheck.class);
        yywCheck.manSayHi1("874965866","qwe123456",driver,"45038");
    }

    @Test(description = "一线男 拉黑")
    public void checkManNotRead() throws Exception {
        YywCheck yywCheck = PageFactory.initElements(driver, YywCheck.class);
        yywCheck.manNotRead("874965866","qwe123456",driver,"45038");
    }
    @Test(description = "一线男 举报")
    public void checkManUpgraded1() throws Exception {
        YywCheck yywCheck = PageFactory.initElements(driver, YywCheck.class);
        yywCheck.manUpgraded1("874965866","qwe123456",driver,"45038");
    }

    @Test(description = "一线男 空间页跳转至邮箱")
    public void checkManSpaceToMailBox1() throws Exception {
        YywCheck yywCheck = PageFactory.initElements(driver, YywCheck.class);
        yywCheck.manSpaceToMailBox1("874965866","qwe123456",driver,"45038");
    }

    @Test(description = "1线男 匹配度")
    public void checkManMatch1() throws Exception {
        YywCheck yywCheck = PageFactory.initElements(driver, YywCheck.class);
        yywCheck.manMatch1("874965866","qwe123456",driver,"45038");
    }

    @Test(description = "一线男 搜索")
    public void checkManSearch() throws Exception {
        YywCheck yywCheck = PageFactory.initElements(driver, YywCheck.class);
        yywCheck.manSearch("874965866","qwe123456",driver,"45038");
    }

    @Test(description = "一线男 附近")
    public void checkManNear() throws Exception {
        YywCheck yywCheck = PageFactory.initElements(driver, YywCheck.class);
        yywCheck.manNear1("874965866","qwe123456",driver,"45038");
    }

    @Test(description = "一线男 邮箱")
    public void checkManMailBox() throws Exception {
        YywCheck yywCheck = PageFactory.initElements(driver, YywCheck.class);
        yywCheck.manMailBox("874965866","qwe123456",driver,"45771");
    }

    @Test(description = "一线男 最近访客")
    public void checkManVisitorMe1() throws Exception {
        YywCheck yywCheck = PageFactory.initElements(driver, YywCheck.class);
        yywCheck.manVisitorMe1("874965866","qwe123456",driver,"45038");
    }

    @Test(description = "三线男 登录付费引导")
    public void checkManLoginPay3() throws Exception {
        YywCheck yywCheck = PageFactory.initElements(driver, YywCheck.class);
        yywCheck.manLoginPay3("875869585","qwe123456",driver,"45038");
    }

    @Test(description = "三线男打招呼")
    public void checkManSayHi3() throws Exception {
        YywCheck yywCheck = PageFactory.initElements(driver, YywCheck.class);
        yywCheck.manSayHi3("875869585","qwe123456",driver,"45038");
    }

    @Test(description = "三线男 拉黑")
    public void checkManNotRead3() throws Exception {
        YywCheck yywCheck = PageFactory.initElements(driver, YywCheck.class);
        yywCheck.manNotRead3("875869585","qwe123456",driver,"45038");
    }

    @Test(description = "三线男 举报")
    public void checkManUpgraded3() throws Exception {
        YywCheck yywCheck = PageFactory.initElements(driver, YywCheck.class);
        yywCheck.manUpgraded3("875869585","qwe123456",driver,"45038");
    }

    @Test(description = "三线男 空间页跳转至邮箱")
    public void checkManSpaceToMailBox3() throws Exception {
        YywCheck yywCheck = PageFactory.initElements(driver, YywCheck.class);
        yywCheck.manSpaceToMailBox3("875869585","qwe123456",driver,"45038");
    }

    @Test(description = "三线男 匹配度")
    public void checkManMatch3() throws Exception {
        YywCheck yywCheck = PageFactory.initElements(driver, YywCheck.class);
        yywCheck.manMatch3("875869585","qwe123456",driver,"45038");
    }

    @Test(description = "三线男附近")
    public void checkManNear3() throws Exception {
        YywCheck yywCheck = PageFactory.initElements(driver, YywCheck.class);
        yywCheck.manNear3("875869585","qwe123456",driver,"45038");
    }

    @Test(description = "三线男 邮箱")
    public void checkManMailBox3() throws Exception {
        YywCheck yywCheck = PageFactory.initElements(driver, YywCheck.class);
        yywCheck.manMailBox3("875869585","qwe123456",driver,"45038");
    }

    @Test(description = "三线男 最近访客")
    public void checkManVisitorMe3() throws Exception {
        YywCheck yywCheck = PageFactory.initElements(driver, YywCheck.class);
        yywCheck.manVisitorMe3("875869585","qwe123456",driver,"45038");
    }
//    三线男无搜索
//    @Test(description = "三线男 搜索")
//    public void checkManSearch3() throws Exception {
//        YywCheck yywCheck = PageFactory.initElements(driver, YywCheck.class);
//        yywCheck.manSearch3("875869585","qwe123456",driver);
//    }

    @Test(description = "女用户 发布心愿")
    public void checkWomanWish() throws Exception {
        YywCheck yywCheck = PageFactory.initElements(driver, YywCheck.class);
        yywCheck.womanWish("876344644","qwe123456",driver,"46853");
    }

    @Test(description = "女用户 寻缘")
    public void checkWomanXunYuan() throws Exception {
        YywCheck yywCheck = PageFactory.initElements(driver, YywCheck.class);
        yywCheck.womanXunyuan("876344644","qwe123456",driver,"46853");
    }

    @Test(description = "女用户 信箱vip付款")
    public void checkWomanMailBox() throws Exception {
        YywCheck yywCheck = PageFactory.initElements(driver, YywCheck.class);
        yywCheck.womanMailBox("876344644","qwe123456",driver,"46853");
    }

    @Test(description = "女用户 信箱对话，实名拦截")
    public void checkWomanMailDialog() throws Exception {
        YywCheck yywCheck = PageFactory.initElements(driver, YywCheck.class);
        yywCheck.womanMailDialog("876344644","qwe123456",driver,"46853");
    }
    @Test(description = "女用户 信箱已读 搜索")
    public void checkWomanMailSearch() throws Exception {
        YywCheck yywCheck = PageFactory.initElements(driver, YywCheck.class);
        yywCheck.womanMailSearch("876344644","qwe123456",driver,"46853");
    }





    @AfterMethod
    public void resetApp() throws Exception {
        driver.resetApp();
    }
}
