package com.xydht.testcase;

import com.driver.Driver;
import com.xydht.check.XYDHTCheck;
import com.xydht.check.XYDHTCheck01;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class testcase extends Driver {
    public String qudao = "120220";

   //3线男901694457 aaa123456   1线男901694656
    @Test(description = "测试方法")
    public void checkProtocolT() throws Exception {
        XYDHTCheck01 xydhtCheck = PageFactory.initElements(driver, XYDHTCheck01.class);
        xydhtCheck.protocol();
    }

    @Test(description = "注册协议")
    public void checkProtocol() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.protocol();
    }

    @Test(description = "3线男注册")
    public void checkManRegiste3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.manRegiste3(driver, qudao);
    }

    @Test(description = "1线男注册")
    public void checkManRegiste1() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.manRegiste1(driver, qudao);
    }
    @Test(description = "3线男寻缘广场寻找缘分")
    public void checkManXunYuan3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.manXunYuan3(driver, qudao);
    }
    @Test(description = "3线男寻缘广场寻找缘分")
    public void checkManXunYuan1() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.manXunYuan1(driver, qudao);
    }



    @Test(description = "1线男缘分页打招呼")
    public void checkSayHi1() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.manSayHi1(driver, qudao);
    }

    @Test(description = "3线男缘分页打招呼")
    public void checkSayHi3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.manSayHi3(driver, qudao);
    }

    @Test(description = "1线男 空间页打招呼")
    public void checkAskbtn() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.askbtn(driver, qudao);
    }

    @Test(description = "1线男 空间页关注")
    public void checkConversation() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.conversation(driver, qudao);
    }

    @Test(description = "1线男 空间页拉黑")
    public void checkNotread() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.notread(driver, qudao);
    }

    @Test(description = "1线男 空间页举报")
    public void checkUpgraded() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.upgraded(driver, qudao);
    }

//    @Test(description = "1线男 空间页在线状态")
//    public void checkOnlineStatus() throws Exception {
//        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
//        xydhtCheck.onlineStatus1(driver, qudao);
//    }

//    @Test(description = "3线男 空间页在线状态")
//    public void checkManOnlineStatus3() throws Exception {
//        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
//        xydhtCheck.onlineStatus3(driver, qudao);
//    }

    @Test(description = "3线男 空间页 查看视频")
    public void checkManVideo3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.manVideo3(driver, qudao);
    }

    @Test(description = "3线男 空间页 查看更多资料")
    public void checkManMore3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.manMore3(driver, qudao);
    }
    @Test(description = "3线男 语音女空间页 查看第二张图片，支付引导")
    public void checkManSecPic3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.manSecPic3(driver, qudao);
    }


    @Test(description = "1线男 空间页 查看更多资料")
    public void checkManMore1() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.manMore1(driver, qudao);
    }
    @Test(description = "3线男 完善个人资料")
    public void checkMyPersonData3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.myPersonData3(driver, qudao);
    }
    @Test(description = "1线男 完善个人资料")
    public void checkMyPersonData1() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.myPersonData1(driver, qudao);
    }
    @Test(description = "3线男 征友条件")
    public void checkMyCondition3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.myCondition3(driver, qudao);
    }
    @Test(description = "1线男 征友条件")
    public void checkMyCondition1() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.myCondition1(driver, qudao);
    }
    @Test(description = "3线男 我的标签")
    public void checkMyTag3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.myTag3(driver, qudao);
    }
    @Test(description = "1线男 我的标签")
    public void checkMyTag1() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.myTag1(driver, qudao);
    }
    @Test(description = "3线男 我的访客")
    public void checkMyVisitor3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.myVisitor3(driver, "121271");
    }
    @Test(description = "3线男 诚信等级")
    public void checkMyIntegrity3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.myIntegrity3(driver, "120220");
    }

    @Test(description = "1线男 搜索初始条件")
    public void checkInitSearch() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.initSearch(driver, qudao);
    }
    @Test(description = "1线男 搜索城市")
    public void checkSeachArea() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.seachArea(driver, qudao);
    }
    @Test(description = "1线男 搜索年龄")
    public void checkSeachAge() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.seachAge(driver, qudao);
    }
    @Test(description = "1线男 搜索身高")
    public void checkSeachHeight() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.seachHeight(driver, qudao);
    }
    @Test(description = "1线男 搜索城市，年龄 身高")
    public void checkSeachAll() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.seachAll(driver, qudao);
    }
    @Test(description = "3线男，语音标签页，拨打语音，调起服务购买页面")
    public void checkManCall3() throws Exception{
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver,XYDHTCheck.class);
        xydhtCheck.manCall3(driver,qudao);
    }
    @Test(description = "三线男，语音页面，关注用户")
    public void checkConversation3() throws Exception{
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver,XYDHTCheck.class);
        xydhtCheck.conversation3(driver,qudao);
    }
    @Test(description = "三线男，信箱未读信数量")
    public void checkMailboxNum3() throws Exception{
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver,XYDHTCheck.class);
        xydhtCheck.mailboxNum3(driver,qudao);
    }
    @Test(description = "1线男 邮件未读")
    public void checkMailboxNum1() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.mailboxNum1(driver, qudao);
    }
    @Test(description = "1线男 邮件上方完善个人信息")
    public void checkMailboxPersonData1() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.mailboxPersonData1(driver, qudao);
    }
    @Test(description = "1线男 信箱三项")
    public void checkMailbox1() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.mailbox(driver, qudao);
    }
    @Test(description = "3线男 信箱消息进入空间，索要联系方式")
    public void checkManMailboxZone3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.mailboxZone3(driver, qudao);
    }

    @Test(description = "1线男 会员中心购买项")
    public void checkVIPList() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.VIP1(driver, qudao);
    }

    @Test(description = "3线男 会员中心购买项")
    public void checkVIPList3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.VIP3(driver, qudao);
    }

    @Test(description = "1线男 会员中心--豆币价格判断")
    public void checkBean1() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.beanPriceCheck1(driver, qudao);
    }

    @Test(description = "3线男 会员中心--豆币价格判断")
    public void checkBean3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.beanPriceCheck3(driver, qudao);
    }
    @Test(description = "3线男 会员中心--豆币价格列表及支付调起")
    public void checkBeanList3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.beanList3(driver, qudao);
    }

    @Test(description = "1线男 会员中心--豆币价格列表及支付调起")
    public void checkBeanList1() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.beanList1(driver, qudao);
    }

    @Test(description = "1线男 会员中心--写信包月价格判断")
    public void checkLetter1() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.letterPriceCheck1(driver, qudao);
    }

    @Test(description = "3线男 会员中心--写信包月价格判断")
    public void checkLetter3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.letterPriceCheck3(driver, qudao);
    }
    @Test(description = "3线男 会员中心--写信包月价格列表及支付调起")
    public void checkLetterList3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.letterList3(driver, qudao);
    }

    @Test(description = "1线男 会员中心--写信包月价格列表及支付调起")
    public void checkLetterList1() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.letterList1(driver, qudao);
    }

    @Test(description = "1线男 会员中心--星级服务价格判断")
    public void checkVIP1() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.vipPriceCheck1(driver, qudao);
    }

    @Test(description = "3线男 会员中心--星级服务价格判断")
    public void checkVIP3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.vipPriceCheck3(driver, qudao);
    }
    @Test(description = "3线男 会员中心--星级服务价格列表及支付调起")
    public void checkVipList3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.VipList3(driver, qudao);
    }

    @Test(description = "1线男 会员中心--星级服务价格列表及支付调起")
    public void checkVipList1() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.VipList1(driver, qudao);
    }
    @Test(description = "3线男 豆币，免密开通及支付引导")
    public void checkBeanMianMi3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.beanMianMi(driver, qudao, 0);
    }
    @Test(description = "3线男 写信包月免密开通及支付引导")
    public void checkLetterMianMi3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.letterMianMi(driver, qudao);
    }
    @Test(description = "3线男 皇冠特权免密开通及支付引导")
    public void checkVIPMianMi3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.vipMianMi(driver, qudao);
    }
    @Test(description = "1线男 附近的人及打招呼")
    public void checkManNear1() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.manNear1(driver, qudao);
    }
    @Test(description = "3线男 附近的人及打招呼")
    public void checkManNear3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.manNear3(driver, qudao);
    }

    @Test(description = "1线女 注册")
    public void checkWomenRegiste1() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.womanRegiste1(driver, qudao);
    }
    @Test(description = "3线女 注册")
    public void checkWomenRegiste3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.womanRegiste3(driver, qudao);
    }
    @Test(description = "1线女 登录")
    public void checkWomenLogin1() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.womanLogin1(driver, qudao, "893495430", "123321");
    }
    @Test(description = "3线女 登录")
    public void checkWomenLogin3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.womanLogin3(driver, qudao, "893499075", "123321");
    }

    @Test(description = "3线女 查看更多资料，无付款入口")
    public void checkWomenMore3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.womanMore3(driver, qudao);
    }
    @Test(description = "1线女 查看更多资料，无付款入口")
    public void checkWomenMore1() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.womanMore1(driver, qudao);
    }
    @Test(description = "3线女 打招呼上限")
    public void checkWomenSayHi3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.womanSayHi3(driver, qudao);
    }
    @Test(description = "3线女 注册后打开缘分助手")
    public void checkWomanYuanfenZhuShou3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.womanYuanfenZhuShou3(driver, qudao);
    }
    @Test(description = "3线女 付费入口")
    public void checkWomenMemberCenter3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.womanMemberCenter3(driver, qudao);
    }
    @Test(description = "3线女 附近")
    public void checkWomenNear3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.womanNear3(driver, qudao);
    }
    @Test(description = "1线女 附近，身边人")
    public void checkWomenNear1() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.womanNear1(driver, qudao);
    }
    @Test(description = "3线男，安全中心")
    public void checkManSecurity() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.manSecurity(driver, qudao);
    }
    @Test(description = "3线男，帮助")
    public void checkManHelp() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.manHelp(driver, qudao);
    }
    @Test(description = "3线男，在线客服")
    public void checkManKeFu() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.manKeFu(driver, qudao);
    }
    @Test(description = "3线男，自定义招呼")
    public void checkManCustomCall() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.manCustomCall(driver, qudao);
    }
    @Test(description = "3线男，购买写信包月后，打招呼实名拦截，查看更多资料及照片")
    public void checkManSayHILanjie3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.manSayHILanjie3(driver, qudao);
    }
    @Test(description = "1线男，购买写信包月后，打招呼实名拦截")
    public void checkManSayHILanjie1() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.manSayHILanjie1(driver, qudao);
    }
    @Test(description = "3线男，购买vip30天，查看更多资料，在线状态，到期日期")
    public void checkManBuyVip3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.manBuyVip3(driver, qudao);
    }
    @Test(description = "3线男，购买豆币550个")
    public void checkManBuyBean3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.manBuyBean3(driver, qudao);
    }
    @Test(description = "三线男，注册引导附近")
    public void checkManRegisteNear3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.registeNear3(driver, qudao);
    }
    /**
    @Test(description = "1线男 匹配问答")
    public void checkAnswerQuestions1() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.myQuestion1(driver, qudao);
    }

    @Test(description = "3线男 匹配问答")
    public void checkAnswerQuestions3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.myQuestion3(driver, qudao);
    }

    @Test(description = "3线男 自我介绍")
    public void checkMyIntroduction3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.myIntroduction3(driver, qudao);
    }

    @Test(description = "3线男 信箱消息进入空间，索要联系方式")
    public void checkManMailboxZone3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.mailboxZone3(driver, qudao);
    }

    @Test(description = "3线男 信箱消息进入空间，查看多张照片")
    public void checkManMailboxZonePic3() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.mailboxZonePic3(driver, qudao);
    }
    @Test(description = "3线男 对对碰，免密开通及支付引导")
    public void checkDuiDuiPeng() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.duiDuiPeng(driver, qudao, 0);
    }





    @Test(description = "1线女 缘分小助手")
    public void checkWomenZhaoHuGuanJia1() throws Exception {
        XYDHTCheck xydhtCheck = PageFactory.initElements(driver, XYDHTCheck.class);
        xydhtCheck.womanYuanfenZhuShou1(driver, qudao, "855431724", "123456q");
    }


*/

    @AfterMethod
    public void resetApp() throws Exception {
        driver.resetApp();
    }
}
