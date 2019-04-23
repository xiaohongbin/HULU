package com.dsjy.testcase;

import com.driver.Driver;
import com.dsjy.check.DSJYCheck;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class testcase extends Driver {
    public String qudao = "120220";

    @Test(description = "注册协议")
    public void checkProtocol() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.protocol();
    }

    @Test(description = "1线男注册")
    public void checkManRegiste1() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.manRegiste1(driver, qudao);
    }

    @Test(description = "3线男注册")
    public void checkManRegiste3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.manRegiste3(driver, qudao);
    }

    @Test(description = "1线男缘分页打招呼")
    public void checkSayHi1() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.manSayHi1(driver, qudao);
    }

    @Test(description = "3线男缘分页打招呼")
    public void checkSayHi3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.manSayHi3(driver, qudao);
    }

    @Test(description = "1线男 空间页打招呼")
    public void checkAskbtn() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.askbtn(driver, qudao);
    }

    @Test(description = "1线男 空间页关注")
    public void checkConversation() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.conversation(driver, qudao);
    }

    @Test(description = "1线男 空间页拉黑")
    public void checkNotread() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.notread(driver, qudao);
    }

    @Test(description = "1线男 空间页举报")
    public void checkUpgraded() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.upgraded(driver, qudao);
    }

    @Test(description = "1线男 空间页在线状态")
    public void checkOnlineStatus() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.onlineStatus1(driver, qudao);
    }

    @Test(description = "3线男 空间页在线状态")
    public void checkManOnlineStatus3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.onlineStatus3(driver, qudao);
    }

    @Test(description = "3线男 空间页 查看视频")
    public void checkManVideo3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.manVideo3(driver, qudao);
    }

    @Test(description = "3线男 空间页 查看更多资料")
    public void checkManMore3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.manMore3(driver, qudao);
    }

    @Test(description = "1线男 空间页 查看更多资料")
    public void checkManMore1() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.manMore1(driver, qudao);
    }

    @Test(description = "1线男 会员中心购买项")
    public void checkVIPList() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.VIP1(driver, qudao);
    }

    @Test(description = "3线男 会员中心购买项")
    public void checkVIPList3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.VIP3(driver, qudao);
    }

    @Test(description = "1线男 会员中心--豆币价格列表及支付调起")
    public void checkBeanList1() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.beanList1(driver, qudao);
    }

    @Test(description = "1线男 会员中心--写信包月价格列表及支付调起")
    public void checkLetterList1() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.letterList1(driver, qudao);
    }

    @Test(description = "1线男 会员中心--星级服务价格列表及支付调起")
    public void checkVipList1() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.VipList1(driver, qudao);
    }

    @Test(description = "3线男 会员中心--豆币价格列表及支付调起")
    public void checkBeanList3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.beanList3(driver, qudao);
    }

    @Test(description = "3线男 会员中心--写信包月价格列表及支付调起")
    public void checkLetterList3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.letterList3(driver, qudao);
    }

    @Test(description = "3线男 会员中心--星级服务价格列表及支付调起")
    public void checkVipList3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.VipList3(driver, qudao);
    }

    @Test(description = "1线男 完善个人资料")
    public void checkMyPersonData1() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.myPersonData1(driver, qudao);
    }

    @Test(description = "1线男 征友条件")
    public void checkMyCondition1() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.myCondition1(driver, qudao);
    }

    @Test(description = "1线男 匹配问答")
    public void checkAnswerQuestions1() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.myQuestion1(driver, qudao);
    }

    @Test(description = "3线男 匹配问答")
    public void checkAnswerQuestions3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.myQuestion3(driver, qudao);
    }

    @Test(description = "1线男 我的标签")
    public void checkMyTag1() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.myTag1(driver, qudao);
    }

    @Test(description = "3线男 自我介绍")
    public void checkMyIntroduction3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.myIntroduction3(driver, qudao);
    }

    @Test(description = "3线男 我的访客")
    public void checkMyVisitor3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.myVisitor3(driver, "121271");
    }

    @Test(description = "3线男 诚信等级")
    public void checkMyIntegrity3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.myIntegrity3(driver, "120220");
    }

    @Test(description = "1线男 搜索初始条件")
    public void checkInitSearch() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.initSearch(driver, qudao);
    }

    @Test(description = "1线男 搜索城市")
    public void checkSeachArea() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.seachArea(driver, qudao);
    }

    @Test(description = "1线男 搜索年龄")
    public void checkSeachAge() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.seachAge(driver, qudao);
    }

    @Test(description = "1线男 搜索身高")
    public void checkSeachHeight() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.seachHeight(driver, qudao);
    }

    @Test(description = "1线男 搜索城市，年龄 身高")
    public void checkSeachAll() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.seachAll(driver, qudao);
    }

    @Test(description = "1线男 搜索列表打招呼")
    public void checkSeachHello() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.seachHello(driver, qudao);
    }

    @Test(description = "3线男，推荐语音聊天")
    public void checkManTuiJian3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.tuijian3(driver, qudao);
    }

    @Test(description = "1线男 信箱三项")
    public void checkMailbox1() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.mailbox(driver, qudao);
    }

    @Test(description = "1线男 邮件未读")
    public void checkMailboxNum1() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.mailboxNum1(driver, qudao);
    }

    @Test(description = "1线男 邮件上方完善个人信息")
    public void checkMailboxPersonData1() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.mailboxPersonData1(driver, qudao);
    }

    @Test(description = "3线男 信箱消息进入空间，索要联系方式")
    public void checkManMailboxZone3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.mailboxZone3(driver, qudao);
    }

    @Test(description = "3线男 信箱消息进入空间，查看多张照片")
    public void checkManMailboxZonePic3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.mailboxZonePic3(driver, qudao);
    }

    @Test(description = "1线男 附近的人及打招呼")
    public void checkManNear1() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.manNear1(driver, qudao);
    }

    @Test(description = "3线男 附近的人及打招呼")
    public void checkManNear3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.manNear3(driver, qudao);
    }

    @Test(description = "3线男 豆币，免密开通及支付引导")
    public void checkBeanMianMi3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.beanMianMi(driver, qudao, 0);
    }

    @Test(description = "3线男 写信包月免密开通及支付引导")
    public void checkLetterMianMi3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.letterMianMi(driver, qudao);
    }

    @Test(description = "3线男 皇冠特权免密开通及支付引导")
    public void checkVIPMianMi3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.vipMianMi(driver, qudao);
    }

    @Test(description = "3线男，安全中心")
    public void checkManSecurity() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.manSecurity(driver, qudao);
    }
    @Test(description = "3线男，帮助")
    public void checkManHelp() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.manHelp(driver, qudao);
    }
    @Test(description = "3线男，在线客服")
    public void checkManKeFu() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.manKeFu(driver, qudao);
    }
    @Test(description = "3线男，自定义招呼")
    public void checkManCustomCall() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.manCustomCall(driver, qudao);
    }

    @Test(description = "3线男，购买写信包月后，打招呼实名拦截，查看更多资料及照片")
    public void checkManSayHILanjie3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.manSayHILanjie3(driver, qudao);
    }

    @Test(description = "1线男，购买写信包月后，打招呼实名拦截")
    public void checkManSayHILanjie1() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.manSayHILanjie1(driver, qudao);
    }

    @Test(description = "3线男，购买vip30天，查看更多资料，在线状态，到期日期")
    public void checkManBuyVip3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.manBuyVip3(driver, qudao);
    }
    @Test(description = "3线男，购买豆币550个")
    public void checkManBuyBean3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.manBuyBean3(driver, qudao);
    }





    @Test(description = "1线女 注册")
    public void checkWomenRegiste1() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.womanRegiste1(driver, qudao);
    }

    @Test(description = "3线女 注册")
    public void checkWomenRegiste3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.womanRegiste3(driver, qudao);
    }

    @Test(description = "1线女 登录")
    public void checkWomenLogin1() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.womanLogin1(driver, qudao, "855431724", "123456q");
    }

    @Test(description = "3线女 登录")
    public void checkWomenLogin3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.womanLogin3(driver, qudao, "855431724", "123456q");
    }

    @Test(description = "3线女 查看更多资料，无付款入口")
    public void checkWomenMore3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.womanMore3(driver, qudao, "855431724", "123456q");
    }

    @Test(description = "3线女 进入空间下方，无在线状态")
    public void checkWomenAdvertisement3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.womanAdvertisement3(driver, qudao, "855431724", "123456q");
    }

    @Test(description = "3线女 打招呼上限")
    public void checkWomenSayHi3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.womanSayHi3(driver, qudao, "855431724", "123456q");
    }

    @Test(description = "1线女 缘分小助手")
    public void checkWomenZhaoHuGuanJia1() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.womanYuanfenZhuShou1(driver, qudao, "855431724", "123456q");
    }

    @Test(description = "3线女 付费入口")
    public void checkWomenMemberCenter3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.womanMemberCenter3(driver, qudao, "855431724", "123456q");
    }

    @Test(description = "3线女 附近")
    public void checkWomenNear3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.womanNear3(driver, qudao, "855431724", "123456q");
    }



    @Test(description = "三线男，双号视频功能")
    public void checkManSpace3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.space3(driver, qudao);
    }

    @Test(description = "三线男，双号查看微信功能")
    public void checkManWechar3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.wechar3(driver, qudao);
    }

    @Test(description = "三线男，双号查看QQ功能")
    public void checkManQQ3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.qq3(driver, qudao);
    }

    @Test(description = "三线男，注册引导附近")
    public void checkManRegisteNear3() throws Exception {
        DSJYCheck dsjyCheck = PageFactory.initElements(driver, DSJYCheck.class);
        dsjyCheck.registeNear3(driver, qudao);
    }

    @AfterMethod
    public void resetApp() throws Exception {
        driver.resetApp();
    }
}
