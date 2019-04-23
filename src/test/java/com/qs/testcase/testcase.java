package com.qs.testcase;

import com.driver.Driver;
import com.qs.check.QSCheck;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class testcase extends Driver {

    @Test(description = "查看注册协议")
    public void checkProtocal()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.protocal();
    }

    @Test(description = "1线男 注册登录")
    public void checkManRegiste1() throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.manRegiste1(driver,"120220");
    }
    @Test(description = "3线男 注册登录")
    public void checkManRegiste3() throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.manRegiste3(driver,"120220");
    }

    @Test(description = "1线男缘分页打招呼")
    public void checkSayHi()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.manSayHi(driver,"120220");
    }
    @Test(description = "1线男 空间页关注")
    public void checkConversation()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.conversation(driver,"120220");
    }
    @Test(description = "1线男 空间页拉黑")
    public void checkNotread()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.notread(driver,"120220");
    }
    @Test(description = "1线男 空间页举报")
    public void checkUpgraded()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.upgraded(driver,"120220");
    }
    @Test(description = "1线男 空间页打招呼")
    public void checkAskbtn()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.askbtn(driver,"120220");
    }
    @Test(description = "1线男 空间页在线状态,支付引导")
    public void checkOnlineStatus()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.onlineStatus(driver,"120220");
    }
    @Test(description = "1线男 查看更多资料")
    public void checkManMore1()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.manMore1(driver,"120220");
    }
    @Test(description = "3线男 查看更多资料")
    public void checkManMore3()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.manMore3(driver,"120220");
    }
    @Test(description = "3线男 查看视频")
    public void checkManVideo3()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.manVideo3(driver,"120220");
    }

    @Test(description = "1线男 会员中心购买项")
    public void checkVIPList()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.VIP(driver,"120220");
    }

    @Test(description = "1线男 会员中心--豆币价格列表及支付方式调起")
    public void checkBeanList1()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.beanList1(driver,"120220");
    }

    @Test(description = "1线男 会员中心--写信包月价格列表及支付方式调起")
    public void checkLetterList1()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.letterList1(driver,"120220");
    }

    @Test(description = "1线男 会员中心--星级服务价格列表及支付方式调起")
    public void checkVipList1()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.VipList1(driver,"120220");
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
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.myPersonData1(driver,"120220");
    }

    @Test(description = "3线男 完善个人资料")
    public void checkMyPersonData3()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.myPersonData3(driver,"120220");
    }

    @Test(description = "1线男 征友条件")
    public void checkMyCondition1()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.myCondition1(driver,"120220");
    }
    @Test(description = "1线男 匹配问答")
    public void checkAnswerQuestions1()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.myQuestion1(driver,"120220");
    }
    @Test(description = "3线男 匹配问答")
    public void checkAnswerQuestions3()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.myQuestion3(driver,"68448");
    }
    @Test(description = "1线男 我的标签")
    public void checkMyTag1()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.myTag1(driver,"120220");
    }
    @Test(description = "3线男 自我介绍")
    public void checkMyIntroduction3()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.myIntroduction3(driver,"68448");
    }
    @Test(description = "3线男 我的访客")
    public void checkMyVisitor3()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.myVisitor3(driver,"120220");
    }

    @Test(description = "3线男 我的访客")
    public void checkMyVisitor1()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.myVisitor1(driver,"120220");
    }
    @Test(description = "3线男 诚信等级")
    public void checkMyIntegrity1()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.myIntegrity1(driver,"120220");
    }

    @Test(description = "3线男 诚信等级")
    public void checkMyIntegrity3()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.myIntegrity3(driver,"120220");
    }


    @Test(description = "1线男 搜索初始条件")
    public void checkInitSearch()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.initSearch(driver,"120220");
    }
    @Test(description = "1线男 搜索城市")
    public void checkSeachArea()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.seachArea(driver,"120220");
    }
    @Test(description = "1线男 搜索年龄")
    public void checkSeachAge()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.seachAge(driver,"120220");
    }
    @Test(description = "1线男 搜索身高")
    public void checkSeachHeight()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.seachHeight(driver,"120220");
    }
    @Test(description = "1线男 搜索城市，年龄 身高")
    public void checkSeachAll()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.seachAll(driver,"120220");
    }
    @Test(description = "1线男 搜索列表打招呼")
    public void checkSeachHello()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.seachHello(driver,"120220");
    }
    @Test(description = "3线男 推荐语音聊天")
    public void checkManTuijian3()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.tuijian3(driver,"120220");
    }


    @Test(description = "1线男 信箱三项")
    public void checkMailbox()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.mailbox(driver,"120220");
    }
    @Test(description = "1线男 邮件未读")
    public void checkMailboxNum1()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.mailboxNum1(driver,"120220");
    }
    @Test(description = "1线男 邮件上方完善个人信息")
    public void checkMailboxPersonData1()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.mailboxPersonData1(driver,"120220");
    }

//    牵手无此功能
//    @Test(description = "3线男 信箱消息进入空间，索要联系方式")
//    public void checkManMailboxZone3()throws Exception{
//        QSCheck lasqCheck=PageFactory.initElements(driver,QSCheck.class);
//        lasqCheck.mailboxZone3(driver,"120220");
//    }


    @Test(description = "3线男 信箱消息进入空间，查看多张照片")
    public void checkManMailboxZonePic3()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.mailboxZonePic3(driver,"120220");
    }

    @Test(description = "1线男 附近")
    public void checkManNear1()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.manNear1(driver,"120220");
    }

    @Test(description = "3线男 附近")
    public void checkManNear3()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.manNear3(driver,"120220");
    }

    @Test(description = "1线女 注册")
    public void checkWomenRegiste1() throws Exception {
        QSCheck qsCheck = PageFactory.initElements(driver, QSCheck.class);
        qsCheck.womanRegiste1(driver, "120220");
    }


    @Test(description = "1线女 登录")
    public void checkWomenLogin1()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.womanLogin1(driver,"120220","873964673","123456q");
    }
    @Test(description = "3线女 登录")
    public void checkWomenLogin3()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.womanLogin3(driver,"120220","855431724","123456q");
    }

//    @Test(description = "3线女 打招呼上限")
//    public void checkWomenSayHi3() throws Exception {
//        QSCheck dsjyCheck = PageFactory.initElements(driver, QSCheck.class);
//        dsjyCheck.womanSayHi3(driver, "152069", "855431724", "123456q");
//    }


    @Test(description = "1线女 查看更多资料")
    public void checkWomenMore1()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.womanMore1(driver,"120220","855431724","123456q");
    }
//     5.6.0 牵手， 在线状态的ID与基本资料等ID一致，无法判断
//    @Test(description = "3线女 进入空间下方，无在线状态")
//    public void checkWomenAdvertisement1()throws Exception{
//        QSCheck lasqCheck=PageFactory.initElements(driver,QSCheck.class);
//        lasqCheck.womanAdvertisement1(driver,"120220","855431724","123456q");
//    }
    @Test(description = "3线女 查看更多资料")
    public void checkWomenMore3()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.womanMore3(driver,"120220","aaaaaa","1111111");
    }

    @Test(description = "1线女 付费入口")
    public void checkWomenMemberCenter1()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.womanMemberCenter1(driver,"120220","855431724","123456q");
    }
    @Test(description = "3线女 付费入口")
    public void checkWomenMemberCenter3()throws Exception{
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.womanMemberCenter3(driver,"120220","855431724","123456q");
    }

    @Test(description = "3线女 附近")
    public void checkWomenNear3() throws Exception {
        QSCheck qsCheck = PageFactory.initElements(driver, QSCheck.class);
        qsCheck.womanNear3(driver, "120220", "855431724", "123456q");
    }




    @Test(description = "3线男 对对碰，免密开通及支付引导")
    public void checkDuiDuiPeng() throws Exception {
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.duiDuiPeng(driver, "120220", 0);
    }

    @Test(description = "3线男 写信包月免密开通及支付引导")
    public void checkLetterMianMi() throws Exception {
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.letterMianMi(driver, "120220", 0);
    }

    @Test(description = "3线男 皇冠特权免密开通及支付引导")
    public void checkVIPMianMi() throws Exception {
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.vipMianMi(driver, "120220", 0);
    }

    @Test(description = "3线男，安全中心")
    public void checkManSecurity() throws Exception {
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.manSecurity(driver, "120220");
    }
    @Test(description = "3线男，帮助")
    public void checkManHelp() throws Exception {
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.manHelp(driver, "120220");
    }
    @Test(description = "3线男，在线客服")
    public void checkManKeFu() throws Exception {
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.manKeFu(driver, "120220");
    }
    @Test(description = "3线男，自定义招呼")
    public void checkManCustomCall() throws Exception {
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.manCustomCall(driver, "120220");
    }

    @Test(description = "3线男，购买写信包月后，打招呼实名拦截，查看更多资料及照片")
    public void checkManSayHILanjie3() throws Exception {
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.manSayHILanjie3(driver, "120220");
    }

    @Test(description = "1线男，购买写信包月后，打招呼实名拦截")
    public void checkManSayHILanjie1() throws Exception {
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.manSayHILanjie1(driver, "120220");
    }

    @Test(description = "3线男，购买vip30天，查看更多资料，在线状态，到期日期")
    public void checkManBuyVip3() throws Exception {
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.manBuyVip3(driver, "120220");
    }
    @Test(description = "3线男，购买豆币550个")
    public void checkManBuyBean3() throws Exception {
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.manBuyBean3(driver, "120220");
    }

    @Test(description = "三线男，注册引导附近")
    public void checkManRegisteNear3() throws Exception {
        QSCheck qsCheck=PageFactory.initElements(driver,QSCheck.class);
        qsCheck.registeNear3(driver, "120220");
    }


    @AfterMethod
    public void resetApp() throws Exception{
        driver.resetApp();
    }
}
