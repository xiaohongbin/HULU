package com.tcrl.testcase;

import com.driver.Driver;
import com.tcrl.check.TCRLCheck;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class testcase extends Driver {

    @Test(description = "使用协议")
    public void checkProtocal() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.protocal(driver);
    }

    @Test(description = "1线男注册登录")
    public void checkManRegiste1() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.manRegiste1(driver, "159785");
    }

    @Test(description = "3线男注册登录")
    public void checkManRegiste3() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.manRegiste3(driver, "159785");
    }

    @Test(description = "1线男缘分页打招呼")
    public void checkManSayHi1() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.manSayHi1(driver, "159785");
    }

    @Test(description = "3线男缘分页打招呼")
    public void checkManSayHi3() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.manSayHi3(driver, "159785");
    }

    @Test(description = "1线男 空间页打招呼及下一个")
    public void checkManAskbtn1() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.manAskbtn1(driver, "159785");
    }

    @Test(description = "1线男 空间页关注")
    public void checkManConversation1() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.manConversation1(driver, "159785");
    }

    @Test(description = "1线男 空间页拉黑")
    public void checkManNotread1() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.mannNotread1(driver, "159785");
    }

    @Test(description = "1线男 空间页举报")
    public void checkManUpgraded1() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.manUpgraded1(driver, "159785");
    }

    @Test(description = "1线男 空间页在线状态")
    public void checkManOnlineStatus1() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.manOnlineStatus1(driver, "159785");
    }

    @Test(description = "3线男 空间页查看视频")
    public void checkManVedio3() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.manVideo3(driver, "159785");
    }

    @Test(description = "3线男 空间页查看更多资料")
    public void checkManMore3() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.manMore3(driver, "159785");
    }

    @Test(description = "1线男 空间页查看更多资料")
    public void checkManMore1() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.manMore1(driver, "159785");
    }


    @Test(description = "1线男 会员中心可购买项")
    public void checkVIPCenter1() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.VIPCenter1(driver, "159785");
    }

    @Test(description = "3线男 会员中心可购买项")
    public void checkVIPCenter3() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.VIPCenter3(driver, "159785");
    }

    @Test(description = "1线男 会员中心--豆币价格列表及支付调起")
    public void checkBeanList1() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.BeanList1(driver, "159785");
    }

    @Test(description = "3线男 会员中心--豆币价格列表及支付调起")
    public void checkBeanList3() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.BeanList3(driver, "159785");
    }

    @Test(description = "1线男 会员中心--写信包月价格列表及支付调起")
    public void checkLetterList1() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.LetterList1(driver, "159785");
    }

    @Test(description = "3线男 会员中心--写信包月价格列表及支付调起")
    public void checkLetterList3() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.LetterList3(driver, "159785");
    }

    @Test(description = "1线男 会员中心--星级服务价格列表")
    public void checkVipList1() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.VipList1(driver, "159785");
    }

    @Test(description = "3线男 会员中心--星级服务价格列表")
    public void checkVipList3() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.VipList3(driver, "159785");
    }

    @Test(description = "1线男 完善个人资料")
    public void checkMyPersonData1() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.myPersonData(driver, "159785");
    }
    @Test(description = "1线男 征友条件")
    public void checkMyCondition1() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.myCondition(driver, "159785");
    }
    @Test(description = "1线男 匹配问答")
    public void checkAnswerQuestions1() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.myQuestion1(driver, "159785");
    }
    @Test(description = "3线男 匹配问答")
    public void checkAnswerQuestions3() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.myQuestion3(driver, "159785");
    }
    @Test(description = "1线男 我的标签")
    public void checkMyTag1() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.myTag(driver, "159785");
    }
    @Test(description = "3线男 自我介绍录音")
    public void checkMyIntroduction3() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.myIntroduction3(driver, "159785");
    }
    @Test(description = "3线男 我的访客")
    public void checkMyVisitor3() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.myVisitor3(driver, "159785");
    }


//    @Test(description = "3线男 会员中心--对对碰，开通免密及支付引导")
//    public void checkDuiDuiPeng() throws Exception {
//        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
//        tcrlCheck.duiDuiPeng(driver, "159785", 0);
//    }
//    @Test(description = "3线男 写信包月免密开通及支付引导")
//    public void checkLetterMianMi() throws Exception {
//        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
//        tcrlCheck.letterMianMi(driver, "68448", 0);
//    }
//    @Test(description = "3线男 皇冠特权免密开通及支付引导")
//    public void checkVIPMianMi() throws Exception {
//        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
//        tcrlCheck.vipMianMi(driver, "68448", 0);
//    }

    @Test(description = "1线男 信息模块上方完善资料")
    public void checkManMailboxPersonData1() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.manMailboxPersonData1(driver, "159785");
    }

    @Test(description = "1线男 未读信")
    public void checkManMailboxNum1() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.manMailboxNum1(driver, "159785");
    }

    @Test(description = "1线男 信箱三项")
    public void checkManMailbox1() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.manMailbox1(driver, "159785");
    }

    @Test(description = "3线男 信箱进入空间索要联系方式")
    public void checkManMailboxZone3() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.manMailboxZone3(driver, "159785");
    }

    @Test(description = "3线男 信箱进入空间查看多张照片")
    public void checkManMailboxZonePic3() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.manMailboxZonePic3(driver, "159785");
    }

    @Test(description = "1线男 附近")
    public void checkManNear1() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.manNear1(driver, "159785");
    }



    //
//    @Test(description = "1线男 会员中心--收信宝价格列表")
//    public void checkReciveLetter1List1()throws Exception{
//        TCRLCheck tcrlCheck=PageFactory.initElements(driver,TCRLCheck.class);
//        tcrlCheck.reciveLetter1(driver);
//    }
//    @Test(description = "1线男 会员中心--咪咕会员列表")
//    public void checkMiguList1()throws Exception{
//        TCRLCheck tcrlCheck=PageFactory.initElements(driver,TCRLCheck.class);
//        tcrlCheck.migu(driver);
//    }
//

    @Test(description = "1线女 登录")
    public void checkWomenLogin1() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.womanLogin1(driver, "159785", "856516843", "123456q");
    }

    @Test(description = "3线女 登录")
    public void checkWomenLogin3() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.womanLogin3(driver, "159785", "856511377", "123456q");
    }

    @Test(description = "3线女 付费入口")
    public void checkWomenMemberCenter3() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.womanMemberCenter3(driver, "159785", "856511377", "123456q");
    }

    @Test(description = "3线女 查看更多资料 ")
    public void checkWomenMore3() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.womanMore3(driver, "159785", "856511377", "123456q");
    }

    @Test(description = "3线女 进入空间下方，无在线状态 ")
    public void checkWomenAdvertisement3() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.womanAdvertisement3(driver, "159785", "856511377", "123456q");
    }

    @Test(description = "1线女 附近")
    public void checkWomenNear1() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.womanNear1(driver, "159785", "856516843", "123456q");
    }
//
//    @Test(description = "1线女 缘分助手开启")
//    public void checkWomenYuanFenZhuShou()throws Exception{
//        TCRLCheck tcrlCheck=PageFactory.initElements(driver,TCRLCheck.class);
//        tcrlCheck.womenYuanFenZhuShou(driver);
//    }
//



    @Test(description = "3线男 对对碰，免密开通及支付引导")
    public void checkDuiDuiPeng() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.duiDuiPeng(driver, "68448", 0);
    }

    @Test(description = "3线男 写信包月免密开通及支付引导")
    public void checkLetterMianMi() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.letterMianMi(driver, "68448", 0);
    }

    @Test(description = "3线男 皇冠特权免密开通及支付引导")
    public void checkVIPMianMi() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.vipMianMi(driver, "68448", 0);
    }

    @Test(description = "3线男，安全中心")
    public void checkManSecurity() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.manSecurity(driver, "159785");
    }
    @Test(description = "3线男，帮助")
    public void checkManHelp() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.manHelp(driver, "159785");
    }
    @Test(description = "3线男，在线客服")
    public void checkManKeFu() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.manKeFu(driver, "159785");
    }
    @Test(description = "3线男，自定义招呼")
    public void checkManCustomCall() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.manCustomCall(driver, "159785");
    }

    @Test(description = "3线男，购买写信包月后，打招呼实名拦截，查看更多资料及照片")
    public void checkManSayHILanjie3() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.manSayHILanjie3(driver, "159785");
    }

    @Test(description = "1线男，购买写信包月后，打招呼实名拦截")
    public void checkManSayHILanjie1() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.manSayHILanjie1(driver, "159785");
    }

    @Test(description = "3线男，购买vip30天，查看更多资料，在线状态，到期日期")
    public void checkManBuyVip3() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.manBuyVip3(driver, "159785");
    }
//    @Test(description = "3线男，购买豆币550个")
//    public void checkManBuyBean3() throws Exception {
//        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
//        tcrlCheck.manBuyBean3(driver, "68448");
//    }

    @Test(description = "三线男，注册引导附近")
    public void checkManRegisteNear3() throws Exception {
        TCRLCheck tcrlCheck = PageFactory.initElements(driver, TCRLCheck.class);
        tcrlCheck.registeNear3(driver, "159785");
    }

    @AfterMethod
    public void resetApp() throws Exception {
        driver.resetApp();
    }
}
