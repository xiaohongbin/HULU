package com.laps.testcase;

import com.driver.Driver;
import com.laps.check.LAPSCheck;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class testcase extends Driver {
    public String qudaohao ="120220";

    @Test(description = "注册协议")
    public void checkProtocol() throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.protocol();
    }

    @Test(description = "1线男注册")
    public void checkManRegiste1() throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.manRegiste1(driver,qudaohao);
    }
    @Test(description = "3线男注册")
    public void checkManRegiste3() throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.manRegiste3(driver,qudaohao);
    }
    @Test(description = "1线男缘分页打招呼")
    public void checkSayHi1()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.manSayHi1(driver,qudaohao);
    }
    @Test(description = "3线男缘分页打招呼")
    public void checkSayHi3()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.manSayHi3(driver,qudaohao);
    }
    @Test(description = "1线男 空间页关注")
    public void checkConversation()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.conversation(driver,qudaohao);
    }
    @Test(description = "1线男 空间页拉黑")
    public void checkNotread()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.notread(driver,qudaohao);
    }
    @Test(description = "1线男 空间页举报")
    public void checkUpgraded()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.upgraded(driver,qudaohao);
    }
    @Test(description = "1线男 空间页打招呼")
    public void checkAskbtn()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.askbtn(driver,qudaohao);
    }
    @Test(description = "1线男 空间页在线状态")
    public void checkOnlineStatus()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.onlineStatus1(driver,qudaohao);
    }

    @Test(description = "3线男 空间页在线状态")
    public void checkManOnlineStatus3()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.onlineStatus3(driver,qudaohao);
    }
    @Test(description = "3线男 空间页 查看视频")
    public void checkManVideo3()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.manVideo3(driver,qudaohao);
    }
    @Test(description = "3线男 空间页 查看更多资料")
    public void checkManMore3()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.manMore3(driver,qudaohao);
    }
    @Test(description = "1线男 空间页 查看更多资料")
    public void checkManMore1()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.manMore1(driver,qudaohao);
    }

    @Test(description = "1线男 会员中心购买项")
    public void checkVIPList()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.VIP1(driver,qudaohao);
    }
    @Test(description = "3线男 会员中心五项服务")
    public void checkVIPList3()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.VIP3(driver,qudaohao);
    }
    @Test(description = "1线男 会员中心--豆币价格列表及支付调起")
    public void checkBeanList1()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.beanList1(driver,qudaohao);
    }
    @Test(description = "1线男 会员中心--写信包月价格列表及支付调起")
    public void checkLetterList1()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.letterList1(driver,qudaohao);
    }
    @Test(description = "1线男 会员中心--星级服务价格列表及支付调起")
    public void checkVipList1()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.VipList1(driver,qudaohao);
    }
    @Test(description = "3线男 会员中心--豆币价格列表及支付调起")
    public void checkBeanList3()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.beanList3(driver,qudaohao);
    }
    @Test(description = "3线男 会员中心--写信包月价格列表及支付调起")
    public void checkLetterList3()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.letterList3(driver,qudaohao);
    }
    @Test(description = "3线男 会员中心--星级服务价格列表及支付调起")
    public void checkVipList3()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.VipList3(driver,qudaohao);
    }

    @Test(description = "1线男 完善个人资料")
    public void checkMyPersonData1()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.myPersonData1(driver,qudaohao);
    }
    @Test(description = "1线男 征友条件")
    public void checkMyCondition1()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.myCondition1(driver,qudaohao);
    }
    @Test(description = "1线男 匹配问答")
    public void checkAnswerQuestions1()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.myQuestion1(driver,qudaohao);
    }
    @Test(description = "3线男 匹配问答")
    public void checkAnswerQuestions3()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.myQuestion3(driver,qudaohao);
    }
    @Test(description = "1线男 我的标签")
    public void checkMyTag1()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.myTag1(driver,qudaohao);
    }
    @Test(description = "3线男 自我介绍")
    public void checkMyIntroduction3()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.myIntroduction3(driver,qudaohao);
    }
    @Test(description = "3线男 我的访客")
    public void checkMyVisitor3() throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.myVisitor3(driver,qudaohao);
    }
    @Test(description = "3线男 诚信等级")
    public void checkMyIntegrity3()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.myIntegrity3(driver,qudaohao);
    }

    @Test(description = "1线男 搜索初始条件")
    public void checkInitSearch()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.initSearch(driver,qudaohao);
    }
    @Test(description = "1线男 搜索城市")
    public void checkSeachArea()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.seachArea(driver,qudaohao);
    }
    @Test(description = "1线男 搜索年龄")
    public void checkSeachAge()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.seachAge(driver,qudaohao);
    }
    @Test(description = "1线男 搜索身高")
    public void checkSeachHeight()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.seachHeight(driver,qudaohao);
    }
    @Test(description = "1线男 搜索城市，年龄 身高")
    public void checkSeachAll()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.seachAll(driver,qudaohao);
    }
    @Test(description = "1线男 搜索列表打招呼")
    public void checkSeachHello()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.seachHello(driver,qudaohao);
    }
    @Test(description = "3线男，推荐列表")
    public void checkManTuiJian3()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.tuijian3(driver,qudaohao);
    }

    @Test(description = "1线男 邮件未读")
    public void checkMailboxNum1()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.mailboxNum1(driver,qudaohao);
    }
    @Test(description = "1线男 邮件上方完善个人信息")
    public void checkMailboxPersonData1()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.mailboxPersonData1(driver,qudaohao);
    }
    @Test(description = "1线男 信箱三项")
    public void checkMailbox1()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.mailbox(driver,qudaohao);
    }
    @Test(description = "3线男 信箱消息进入空间，索要联系方式")
    public void checkManMailboxZone3()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.mailboxZone3(driver,qudaohao);
    }
    @Test(description = "3线男 信箱消息进入空间，查看多张照片")
    public void checkManMailboxZonePic3()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.mailboxZonePic3(driver,qudaohao);
    }

//    @Test(description = "3线男 对对碰，免密开通及支付引导")
//    public void checkDuiDuiPeng()throws Exception{
//        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
//        lapsCheck.duiDuiPeng(driver,qudaohao,0);
//    }
//    @Test(description = "3线男 写信包月免密开通及支付引导")
//    public void checkLetterMianMi() throws Exception {
//        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
//        lapsCheck.letterMianMi(driver, qudaohao, 0);
//    }
//    @Test(description = "3线男 皇冠特权免密开通及支付引导")
//    public void checkVIPMianMi() throws Exception {
//        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
//        lapsCheck.vipMianMi(driver, qudaohao, 0);
//    }

    @Test(description = "1线男 附近人")
    public void checkManNear1()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.manNear1(driver,qudaohao);
    }
    @Test(description = "3线男 附近人")
    public void checkManNear3()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.manNear3(driver,qudaohao);
    }


    @Test(description = "1线女 注册登录")
    public void checkWomenRegiste1()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.womanRegiste1(driver,qudaohao);
    }
    @Test(description = "3线女 注册登录")
    public void checkWomenRegiste3()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.womanRegiste3(driver,qudaohao);
    }
    @Test(description = "1线女 登录")
    public void checkWomenLogin1()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.womanLogin1(driver,qudaohao,"874950317","123456q");
    }
    @Test(description = "3线女 登录")
    public void checkWomenLogin3()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.womanLogin3(driver,qudaohao,"874952643","123456q");
    }
    @Test(description = "3线女 查看更多资料，无付款入口")
    public void checkWomenMore3()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.womanMore3(driver,qudaohao,"855431724","123456q");
    }
    @Test(description = "3线女 进入空间下方，无在线状态")
    public void checkWomenAdvertisement3()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.womanAdvertisement3(driver,qudaohao,"855431724","123456q");
    }
    @Test(description = "3线女 打招呼上限")
    public void checkWomenSayHi3()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.womanSayHi3(driver,qudaohao,"855431724","123456q");
    }
    @Test(description = "1线女 缘分小助手")
    public void checkWomenZhaoHuGuanJia1()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.womanYuanfenZhuShou1(driver,qudaohao,"855431724","123456q");
    }
    @Test(description = "3线女 付费入口")
    public void checkWomenMemberCenter3()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.womanMemberCenter3(driver,qudaohao,"855431724","123456q");
    }
    @Test(description = "3线女 附近")
    public void checkWomenNear3()throws Exception{
        LAPSCheck lapsCheck=PageFactory.initElements(driver,LAPSCheck.class);
        lapsCheck.womanNear3(driver,qudaohao,"855431724","123456q");
    }



    @Test(description = "3线男 对对碰，免密开通及支付引导")
    public void checkDuiDuiPeng() throws Exception {
        LAPSCheck lapsCheck = PageFactory.initElements(driver, LAPSCheck.class);
        lapsCheck.duiDuiPeng3(driver, qudaohao, 0);
    }

    @Test(description = "3线男 写信包月免密开通及支付引导")
    public void checkLetterMianMi() throws Exception {
        LAPSCheck lapsCheck = PageFactory.initElements(driver, LAPSCheck.class);
        lapsCheck.letterMianMi(driver, qudaohao, 0);
    }

    @Test(description = "3线男 皇冠特权免密开通及支付引导")
    public void checkVIPMianMi() throws Exception {
        LAPSCheck lapsCheck = PageFactory.initElements(driver, LAPSCheck.class);
        lapsCheck.vipMianMi(driver, qudaohao, 0);
    }

    @Test(description = "3线男，安全中心")
    public void checkManSecurity() throws Exception {
        LAPSCheck lapsCheck = PageFactory.initElements(driver, LAPSCheck.class);
        lapsCheck.manSecurity(driver, qudaohao);
    }
    @Test(description = "3线男，帮助")
    public void checkManHelp() throws Exception {
        LAPSCheck lapsCheck = PageFactory.initElements(driver, LAPSCheck.class);
        lapsCheck.manHelp(driver, qudaohao);
    }
    @Test(description = "3线男，在线客服")
    public void checkManKeFu() throws Exception {
        LAPSCheck lapsCheck = PageFactory.initElements(driver, LAPSCheck.class);
        lapsCheck.manKeFu(driver, qudaohao);
    }
    @Test(description = "3线男，自定义招呼")
    public void checkManCustomCall() throws Exception {
        LAPSCheck lapsCheck = PageFactory.initElements(driver, LAPSCheck.class);
        lapsCheck.manCustomCall(driver, qudaohao);
    }

    @Test(description = "3线男，购买写信包月后，打招呼实名拦截，查看更多资料及照片")
    public void checkManSayHILanjie3() throws Exception {
        LAPSCheck lapsCheck = PageFactory.initElements(driver, LAPSCheck.class);
        lapsCheck.manSayHILanjie3(driver, qudaohao);
    }

    @Test(description = "1线男，购买写信包月后，打招呼实名拦截")
    public void checkManSayHILanjie1() throws Exception {
        LAPSCheck lapsCheck = PageFactory.initElements(driver, LAPSCheck.class);
        lapsCheck.manSayHILanjie1(driver, qudaohao);
    }

    @Test(description = "3线男，购买vip30天，查看更多资料，在线状态，到期日期")
    public void checkManBuyVip3() throws Exception {
        LAPSCheck lapsCheck = PageFactory.initElements(driver, LAPSCheck.class);
        lapsCheck.manBuyVip3(driver, qudaohao);
    }
    @Test(description = "3线男，购买豆币550个")
    public void checkManBuyBean3() throws Exception {
        LAPSCheck lapsCheck = PageFactory.initElements(driver, LAPSCheck.class);
        lapsCheck.manBuyBean3(driver, qudaohao);
    }

    @Test(description = "三线男，双号视频功能")
    public void checkManSpace3() throws Exception {
        LAPSCheck lapsCheck = PageFactory.initElements(driver, LAPSCheck.class);
        lapsCheck.space3(driver, qudaohao);
    }

    @Test(description = "三线男，双号查看微信功能")
    public void checkManWechar3() throws Exception {
        LAPSCheck lapsCheck = PageFactory.initElements(driver, LAPSCheck.class);
        lapsCheck.wechar3(driver, qudaohao);
    }

    @Test(description = "三线男，双号查看QQ功能")
    public void checkManQQ3() throws Exception {
        LAPSCheck lapsCheck = PageFactory.initElements(driver, LAPSCheck.class);
        lapsCheck.qq3(driver, qudaohao);
    }

    @Test(description = "三线男，注册引导附近")
    public void checkManRegisteNear3() throws Exception {
        LAPSCheck lapsCheck = PageFactory.initElements(driver, LAPSCheck.class);
        lapsCheck.registeNear3(driver, qudaohao);
    }

    @AfterMethod
    public void resetApp() throws Exception{
        driver.resetApp();
    }
}
