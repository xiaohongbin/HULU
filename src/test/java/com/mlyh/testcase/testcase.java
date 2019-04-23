package com.mlyh.testcase;

import com.driver.Driver;

import com.mlyh.check.MLYHCheck;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class testcase extends Driver {
    String qudao = "120220";
    @Test(description = "查看注册协议")
    public void checkProtocal() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.protocal();
    }

    @Test(description = "1线男 注册登录")
    public void checkManRegiste1() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.manRegiste1(driver, qudao);
//        mlyhCheck.getUserID(driver);
    }

    @Test(description = "3线男 注册登录")
    public void checkManRegiste3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.manRegiste3(driver, qudao);
    }

    @Test(description = "1线男缘分页打招呼")
    public void checkSayHi() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.manSayHi(driver, qudao);
    }

    @Test(description = "1线男 空间页关注")
    public void checkConversation() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.conversation(driver, qudao);
    }

    @Test(description = "1线男 空间页拉黑")
    public void checkNotread() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.notread(driver, qudao);
    }

    @Test(description = "1线男 空间页举报")
    public void checkUpgraded() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.upgraded(driver, qudao);
    }

    @Test(description = "1线男 空间页打招呼")
    public void checkAskbtn() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.askbtn(driver, qudao);
    }

    @Test(description = "1线男 空间页在线状态,支付引导")
    public void checkOnlineStatus() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.onlineStatus(driver, qudao);
    }

    @Test(description = "1线男 查看更多资料")
    public void checkManMore1() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.manMore1(driver, qudao);
    }

    @Test(description = "3线男 查看更多资料")
    public void checkManMore3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.manMore3(driver, qudao);
    }

    @Test(description = "3线男 查看视频")
    public void checkManVideo3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.manVideo3(driver, qudao);
    }

    @Test(description = "1线男 会员中心购买项")
    public void checkVIPList() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.VIP(driver, qudao);
    }

    @Test(description = "3线男 会员中心购买项")
    public void checkVIPList3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.VIP3(driver, qudao);
    }

    @Test(description = "1线男 会员中心--豆币价格列表及支付方式调起")
    public void checkBeanList1() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.beanList1(driver, qudao);
    }

    @Test(description = "3线男 会员中心--豆币价格列表及支付方式调起")
    public void checkBeanList3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.beanList3(driver, qudao);
    }

    @Test(description = "1线男 会员中心--写信包月价格列表及支付方式调起")
    public void checkLetterList1() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.letterList1(driver, qudao);
    }

    @Test(description = "3线男 会员中心--写信包月价格列表及支付方式调起")
    public void checkLetterList3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.letterList3(driver, qudao);
    }

    @Test(description = "1线男 会员中心--星级服务价格列表及支付方式调起")
    public void checkVipList1() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.VipList1(driver, qudao);
    }
    @Test(description = "3线男 会员中心--星级服务价格列表及支付方式调起")
    public void checkVipList3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.VipList3(driver, qudao);
    }
//    @Test(description = "3线男 对对碰，免密开通及支付引导")
//    public void checkDuiDuiPeng() throws Exception {
//        mlyhCheck mlyhCheck=PageFactory.initElements(driver,mlyhCheck.class);
//        mlyhCheck.duiDuiPeng(driver, "68448", 0);
//    }
//
//    @Test(description = "3线男 写信包月免密开通及支付引导")
//    public void checkLetterMianMi() throws Exception {
//        mlyhCheck mlyhCheck=PageFactory.initElements(driver,mlyhCheck.class);
//        mlyhCheck.letterMianMi(driver, "68448", 0);
//    }
//
//    @Test(description = "3线男 皇冠特权免密开通及支付引导")
//    public void checkVIPMianMi() throws Exception {
//        mlyhCheck mlyhCheck=PageFactory.initElements(driver,mlyhCheck.class);
//        mlyhCheck.vipMianMi(driver, "68448", 0);
//    }

    @Test(description = "1线男 完善个人资料")
    public void checkMyPersonData1() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.myPersonData1(driver, qudao);
    }

    @Test(description = "1线男 征友条件")
    public void checkMyCondition1() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.myCondition1(driver, qudao);
    }

    @Test(description = "1线男 匹配问答")
    public void checkAnswerQuestions1() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.myQuestion1(driver, qudao);
    }

    @Test(description = "3线男 匹配问答")
    public void checkAnswerQuestions3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.myQuestion3(driver, "68448");
    }

    @Test(description = "1线男 我的标签")
    public void checkMyTag1() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.myTag1(driver, qudao);
    }

    @Test(description = "3线男 自我介绍")
    public void checkMyIntroduction3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.myIntroduction3(driver, "68448");
    }

    @Test(description = "3线男 我的访客")
    public void checkMyVisitor3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.myVisitor3(driver, qudao);
    }

    @Test(description = "1线男 我的访客")
    public void checkMyVisitor1() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.myVisitor1(driver, qudao);
    }

    @Test(description = "3线男 诚信等级")
    public void checkMyIntegrity3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.myIntegrity3(driver, qudao);
    }

    @Test(description = "1线男 诚信等级")
    public void checkMyIntegrity1() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.myIntegrity1(driver, qudao);
    }


    @Test(description = "1线男 搜索初始条件")
    public void checkInitSearch() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.initSearch(driver, qudao);
    }

    @Test(description = "1线男 搜索城市")
    public void checkSeachArea() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.seachArea(driver, qudao);
    }

    @Test(description = "1线男 搜索年龄")
    public void checkSeachAge() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.seachAge(driver, qudao);
    }

    @Test(description = "1线男 搜索身高")
    public void checkSeachHeight() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.seachHeight(driver, qudao);
    }

    @Test(description = "1线男 搜索城市，年龄 身高")
    public void checkSeachAll() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.seachAll(driver, qudao);
    }

    @Test(description = "1线男 搜索列表打招呼")
    public void checkSeachHello() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.seachHello(driver, qudao);
    }

    @Test(description = "3线男 推荐语音聊天")
    public void checkManTuijian3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.tuijian3(driver, qudao);
    }


    @Test(description = "1线男 信箱三项")
    public void checkMailbox() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.mailbox(driver, qudao);
    }

    @Test(description = "1线男 邮件未读")
    public void checkMailboxNum1() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.mailboxNum1(driver, qudao);
    }

    @Test(description = "1线男 邮件上方完善个人信息")
    public void checkMailboxPersonData1() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.mailboxPersonData1(driver, qudao);
    }

    @Test(description = "3线男 信箱消息进入空间，索要联系方式")
    public void checkManMailboxZone3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.mailboxZone3(driver, qudao);
    }

    @Test(description = "3线男 信箱消息进入空间，查看多张照片")
    public void checkManMailboxZonePic3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.mailboxZonePic3(driver, qudao);
    }

    @Test(description = "1线男 附近")
    public void checkManNear1() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.manNear1(driver, qudao);
    }


    @Test(description = "1线女 注册")
    public void checkWomenRegiste1() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.womanRegiste1(driver, qudao);
    }

    @Test(description = "3线女 注册")
    public void checkWomenRegiste3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.womanRegiste3(driver, qudao);
    }

    @Test(description = "1线女 登录")
    public void checkWomenLogin1() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.womanLogin1(driver, qudao, "873964673", "123456q");
    }

    @Test(description = "3线女 登录")
    public void checkWomenLogin3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.womanLogin3(driver, qudao, "855431724", "123456q");
    }

    @Test(description = "3线女 打招呼上限")
    public void checkWomenSayHi3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.womanSayHi3(driver, qudao, "855431724", "123456q");
    }

    @Test(description = "3线女 查看更多资料，无付款入口")
    public void checkWomenMore3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.womanMore3(driver, qudao);
    }
    @Test(description = "1线女 查看更多资料，无付款入口")
    public void checkWomenMore1() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.womanMore1(driver, qudao);
    }

//    @Test(description = "3线女 进入空间下方，无在线状态")
//    public void checkWomenAdvertisement3()throws Exception{
//        MLYHCheck mlyhCheck=PageFactory.initElements(driver,MLYHCheck.class);
//        mlyhCheck.womanAdvertisement3(driver,qudao,"855431724","123456q");
//    }

    @Test(description = "3线女 付费入口")
    public void checkWomenMemberCenter1() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.womanMemberCenter1(driver, qudao, "855431724", "123456q");
    }

    @Test(description = "3线女 付费入口")
    public void checkWomenMemberCenter3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.womanMemberCenter3(driver, qudao, "855431724", "123456q");
    }


    @Test(description = "3线男 豆币，免密开通及支付引导")
    public void checkBeanMianMi3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.beanMianMi(driver, qudao, 0);
    }

    @Test(description = "3线男 写信包月免密开通及支付引导")
    public void checkLetterMianMi3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.letterMianMi(driver, qudao);
    }

    @Test(description = "3线男 皇冠特权免密开通及支付引导")
    public void checkVIPMianMi3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.vipMianMi(driver, qudao);
    }

    @Test(description = "3线男，安全中心")
    public void checkManSecurity() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.manSecurity(driver, "120220");
    }

    @Test(description = "3线男，帮助")
    public void checkManHelp() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.manHelp(driver, "120220");
    }

    @Test(description = "3线男，在线客服")
    public void checkManKeFu() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.manKeFu(driver, "120220");
    }

    @Test(description = "3线男，自定义招呼")
    public void checkManCustomCall() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.manCustomCall(driver, "120220");
    }

    @Test(description = "3线男，购买写信包月后，打招呼实名拦截，查看更多资料及照片")
    public void checkManSayHILanjie3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.manSayHILanjie3(driver, "120220");
    }

    @Test(description = "1线男，购买写信包月后，打招呼实名拦截")
    public void checkManSayHILanjie1() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.manSayHILanjie1(driver, "120220");
    }

    @Test(description = "3线男，购买vip30天，查看更多资料，在线状态，到期日期")
    public void checkManBuyVip3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.manBuyVip3(driver, "120220");
    }

    @Test(description = "3线男，购买豆币550个")
    public void checkManBuyBean3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.manBuyBean3(driver, "120220");
    }

    @Test(description = "三线男，注册引导附近")
    public void checkManRegisteNear3() throws Exception {
        MLYHCheck mlyhCheck = PageFactory.initElements(driver, MLYHCheck.class);
        mlyhCheck.registeNear3(driver, "120220");
    }


    @AfterMethod
    public void resetApp() throws Exception {
        driver.resetApp();
    }
}
