package com.lasq.testcase;

import com.driver.Driver;
import com.lasq.check.LASQCheck;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class testcase extends Driver {

    @Test(description = "查看注册协议")
    public void checkProtocal()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.protocal();
    }

    @Test(description = "1线男 注册登录")
    public void checkManRegiste1() throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.manRegiste1(driver,"120220");
    }
    @Test(description = "3线男 注册登录")
    public void checkManRegiste3() throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.manRegiste3(driver,"120220");
    }

    @Test(description = "1线男缘分页打招呼")
    public void checkSayHi()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.manSayHi(driver,"120220");
    }
    @Test(description = "1线男 空间页关注")
    public void checkConversation()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.conversation(driver,"120220");
    }
    @Test(description = "1线男 空间页拉黑")
    public void checkNotread()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.notread(driver,"120220");
    }
    @Test(description = "1线男 空间页举报")
    public void checkUpgraded()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.upgraded(driver,"120220");
    }
    @Test(description = "1线男 空间页打招呼")
    public void checkAskbtn()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.askbtn(driver,"120220");
    }
    @Test(description = "1线男 空间页在线状态,支付引导")
    public void checkOnlineStatus()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.onlineStatus(driver,"120220");
    }
    @Test(description = "1线男 查看更多资料")
    public void checkManMore1()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.manMore1(driver,"120220");
    }
    @Test(description = "3线男 查看更多资料")
    public void checkManMore3()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.manMore3(driver,"120220");
    }
    @Test(description = "3线男 查看视频")
    public void checkManVideo3()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.manVideo3(driver,"120220");
    }

    @Test(description = "1线男 会员中心购买项")
    public void checkVIPList()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.VIP(driver,"120220");
    }

    @Test(description = "1线男 会员中心--豆币价格列表及支付方式调起")
    public void checkBeanList1()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.beanList1(driver,"120220");
    }

    @Test(description = "1线男 会员中心--写信包月价格列表及支付方式调起")
    public void checkLetterList1()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.letterList1(driver,"120220");
    }

    @Test(description = "1线男 会员中心--星级服务价格列表及支付方式调起")
    public void checkVipList1()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.VipList1(driver,"120220");
    }

//    @Test(description = "3线男 对对碰，免密开通及支付引导")
//    public void checkDuiDuiPeng() throws Exception {
//        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
//        lasqCheck.duiDuiPeng(driver, "68448", 0);
//    }
//
//    @Test(description = "3线男 写信包月免密开通及支付引导")
//    public void checkLetterMianMi() throws Exception {
//        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
//        lasqCheck.letterMianMi(driver, "68448", 0);
//    }
//
//    @Test(description = "3线男 皇冠特权免密开通及支付引导")
//    public void checkVIPMianMi() throws Exception {
//        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
//        lasqCheck.vipMianMi(driver, "68448", 0);
//    }

    @Test(description = "1线男 完善个人资料")
    public void checkMyPersonData1()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.myPersonData1(driver,"120220");
    }
    @Test(description = "1线男 征友条件")
    public void checkMyCondition1()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.myCondition1(driver,"120220");
    }
    @Test(description = "1线男 匹配问答")
    public void checkAnswerQuestions1()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.myQuestion1(driver,"120220");
    }
    @Test(description = "3线男 匹配问答")
    public void checkAnswerQuestions3()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.myQuestion3(driver,"68448");
    }
    @Test(description = "1线男 我的标签")
    public void checkMyTag1()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.myTag1(driver,"120220");
    }
    @Test(description = "3线男 自我介绍")
    public void checkMyIntroduction3()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.myIntroduction3(driver,"68448");
    }
    @Test(description = "3线男 我的访客")
    public void checkMyVisitor3()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.myVisitor3(driver,"120220");
    }
    @Test(description = "3线男 诚信等级")
    public void checkMyIntegrity3()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.myIntegrity3(driver,"120220");
    }


    @Test(description = "1线男 搜索初始条件")
    public void checkInitSearch()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.initSearch(driver,"120220");
    }
    @Test(description = "1线男 搜索城市")
    public void checkSeachArea()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.seachArea(driver,"120220");
    }
    @Test(description = "1线男 搜索年龄")
    public void checkSeachAge()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.seachAge(driver,"120220");
    }
    @Test(description = "1线男 搜索身高")
    public void checkSeachHeight()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.seachHeight(driver,"120220");
    }
    @Test(description = "1线男 搜索城市，年龄 身高")
    public void checkSeachAll()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.seachAll(driver,"120220");
    }
    @Test(description = "1线男 搜索列表打招呼")
    public void checkSeachHello()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.seachHello(driver,"120220");
    }
    @Test(description = "3线男 推荐语音聊天")
    public void checkManTuijian3()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.tuijian3(driver,"120220");
    }


    @Test(description = "1线男 信箱三项")
    public void checkMailbox()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.mailbox(driver,"120220");
    }
    @Test(description = "1线男 邮件未读")
    public void checkMailboxNum1()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.mailboxNum1(driver,"120220");
    }
    @Test(description = "1线男 邮件上方完善个人信息")
    public void checkMailboxPersonData1()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.mailboxPersonData1(driver,"120220");
    }

    @Test(description = "3线男 信箱消息进入空间，索要联系方式")
    public void checkManMailboxZone3()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.mailboxZone3(driver,"120220");
    }
    @Test(description = "3线男 信箱消息进入空间，查看多张照片")
    public void checkManMailboxZonePic3()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.mailboxZonePic3(driver,"120220");
    }

    @Test(description = "1线男 附近")
    public void checkManNear1()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.manNear1(driver,"120220");
    }


    @Test(description = "1线女 登录")
    public void checkWomenLogin1()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.womanLogin1(driver,"120220","855431724","123456q");
    }
    @Test(description = "3线女 登录")
    public void checkWomenLogin3()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.womanLogin3(driver,"120220","855431724","123456q");
    }
    @Test(description = "3线女 查看更多资料，无付款入口")
    public void checkWomenMore3()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.womanMore3(driver,"120220","855431724","123456q");
    }
    @Test(description = "3线女 进入空间下方，无在线状态")
    public void checkWomenAdvertisement3()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.womanAdvertisement3(driver,"120220","855431724","123456q");
    }
    @Test(description = "3线女 查看更多资料")
    public void checkWomanMore3()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.womanMore3(driver,"120220","aaaaaa","1111111");
    }
    @Test(description = "3线女 付费入口")
    public void checkWomenMemberCenter3()throws Exception{
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.womanMemberCenter3(driver,"120220","855431724","123456q");
    }




    @Test(description = "3线男 对对碰，免密开通及支付引导")
    public void checkDuiDuiPeng() throws Exception {
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.duiDuiPeng(driver, "120220", 0);
    }

    @Test(description = "3线男 写信包月免密开通及支付引导")
    public void checkLetterMianMi() throws Exception {
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.letterMianMi(driver, "120220", 0);
    }

    @Test(description = "3线男 皇冠特权免密开通及支付引导")
    public void checkVIPMianMi() throws Exception {
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.vipMianMi(driver, "120220", 0);
    }

    @Test(description = "3线男，安全中心")
    public void checkManSecurity() throws Exception {
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.manSecurity(driver, "120220");
    }
    @Test(description = "3线男，帮助")
    public void checkManHelp() throws Exception {
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.manHelp(driver, "120220");
    }
    @Test(description = "3线男，在线客服")
    public void checkManKeFu() throws Exception {
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.manKeFu(driver, "120220");
    }
    @Test(description = "3线男，自定义招呼")
    public void checkManCustomCall() throws Exception {
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.manCustomCall(driver, "120220");
    }

    @Test(description = "3线男，购买写信包月后，打招呼实名拦截，查看更多资料及照片")
    public void checkManSayHILanjie3() throws Exception {
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.manSayHILanjie3(driver, "120220");
    }

    @Test(description = "1线男，购买写信包月后，打招呼实名拦截")
    public void checkManSayHILanjie1() throws Exception {
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.manSayHILanjie1(driver, "120220");
    }

    @Test(description = "3线男，购买vip30天，查看更多资料，在线状态，到期日期")
    public void checkManBuyVip3() throws Exception {
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.manBuyVip3(driver, "120220");
    }
    @Test(description = "3线男，购买豆币550个")
    public void checkManBuyBean3() throws Exception {
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.manBuyBean3(driver, "120220");
    }

    @Test(description = "三线男，注册引导附近")
    public void checkManRegisteNear3() throws Exception {
        LASQCheck lasqCheck=PageFactory.initElements(driver,LASQCheck.class);
        lasqCheck.registeNear3(driver, "120220");
    }


    @AfterMethod
    public void resetApp() throws Exception{
        driver.resetApp();
    }
}
