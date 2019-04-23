package com.jpUI.testcase;

import com.driver.Driver;
import com.jpUI.JPCheck.JPCheck;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class testcase extends Driver {
    
    public String qudao = "120220";
    //1线男899806326 aaa123456  3线男 899814679  aaa123456
    @Test(description = "注册协议")
    public void checkProtocol() throws Exception {
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.protocol();
    }

    @Test(description = "1线男，注册")
    public void checkRegiste1() throws Exception {
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.manRegiste1(driver,qudao);
    }
    @Test(description = "3线男，注册")
    public void checkRegiste3() throws Exception {
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.manRegiste3(driver,qudao);
    }
    @Test(description = "1线男，缘分页打招呼")
    public void checkSayHi()throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.manSayHi(driver,qudao);
    }
    @Test(description = "3线男，缘分页打招呼")
    public void checkSayHi3()throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.manSayHi3(driver,qudao);
    }
    @Test(description = "1线男 空间页打招呼")
    public void checkAskbtn()throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.askbtn(driver,qudao);
    }
    @Test(description = "1线男 空间页关注")
    public void checkConversation()throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.conversation(driver,qudao);
    }
    @Test(description = "1线男 空间页拉黑")
    public void checkNotread()throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.notread(driver,qudao);
    }
    @Test(description = "1线男 空间页举报")
    public void checkUpgraded()throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.upgraded(driver,qudao);
    }
    @Test(description = "1线男 空间页在线状态")
    public void checkOnlineStatus()throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.onlineStatus(driver,qudao);
    }
    @Test(description = "3线男 空间页在线状态")
    public void checkOnlineStatus3()throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.onlineStatus3(driver,qudao);
    }
    @Test(description = "3线男 空间页看视频")
    public void checkVideo3()throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.video3(driver,qudao);
    }
    @Test(description = "3线男 空间页 查看更多资料")
    public void checkMore3()throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.more3(driver,qudao);
    }
    @Test(description = "1线男 空间页 查看更多资料")
    public void checkMore1()throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.more1(driver,qudao);
    }

    @Test(description = "1线男 会员中心五项服务")
    public void checkVIPList()throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.VIP(driver,qudao);
    }
    @Test(description = "3线男 会员中心五项服务")
    public void checkVIPList3()throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.VIP3(driver,qudao);
    }
    @Test(description = "1线男 会员中心--豆币价格列表及支付调起")
    public void checkBeanList1()throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.BeanList1(driver,qudao);
    }
    @Test(description = "3线男 会员中心--豆币价格列表及支付调起")
    public void checkBeanList3()throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.beanList3(driver,qudao);
    }
    @Test(description = "1线男 会员中心--写信包月价格列表及支付调起")
    public void checkLetterList1()throws Exception {
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.LetterList1(driver,qudao);
    }
    @Test(description = "3线男 会员中心--写信包月价格列表及支付调起")
    public void checkLetterList3()throws Exception {
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.LetterList3(driver,qudao);
    }
    @Test(description = "1线男 会员中心--星级服务价格列表及支付调起")
    public void checkVipList1()throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.VipList1(driver,qudao);
    }
    @Test(description = "3线男 会员中心--星级服务价格列表及支付调起")
    public void checkVipList3()throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.VipList3(driver,qudao);
    }
    @Test(description = "1线男 会员中心--收信宝价格列表")
    public void checkReciveLetter1List1()throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.reciveLetter1(driver,qudao);
    }
    @Test(description = "1线男 会员中心--咪咕会员列表")
    public void checkMiguList1()throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.migu(driver,qudao);
    }
//    @Test(description = "3线男 对对碰,开通免密0元购及支付引导")
//    public void checkDuiDuiPeng()throws Exception{
//        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
//        jpCheck.duiDuiPeng(driver,qudao,0);
//    }
//    @Test(description = "3线男 写信包月免密开通及支付引导")
//    public void checkLetterMianMi() throws Exception {
//        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
//        jpCheck.letterMianMi(driver, "68448", 0);
//    }
//    @Test(description = "3线男 皇冠特权免密开通及支付引导")
//    public void checkVIPMianMi() throws Exception {
//        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
//        jpCheck.vipMianMi(driver, "68448", 0);
//    }

    @Test(description = "1线男 我的个人资料")
    public void checkMyPersonData() throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.myPersonData(driver,qudao);
    }
    @Test(description = "1线男 我的征友条件")
    public void checkMyConditon() throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.myCondition(driver,qudao);
    }
    @Test(description = "1线男 我的匹配问答")
    public void checkMyQuestion() throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.myQuestion(driver,qudao);
    }
    @Test(description = "3线男 我的匹配问答")
    public void checkMyQuestion3() throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.myQuestion3(driver,qudao);
    }
    @Test(description = "1线男 我的标签")
    public void checkMyTag() throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.myTag(driver,qudao);
    }
    @Test(description = "3线男 自我介绍")
    public void checkMyIntroduction3() throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.myIntroduction3(driver,qudao);
    }
    @Test(description = "3线男 我的访客")
    public void checkMyVisitor3() throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.myVisitor3(driver,qudao);
    }
    @Test(description = "3线男 诚信等级")
    public void checkMyIntegrity3()throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.myIntegrity3(driver,"120220");
    }


    @Test(description = "1线男 搜索初始条件")
    public void checkInitSearch() throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.initSearch(driver,qudao);
    }
    @Test(description = "1线男 搜索城市验证")
    public void checkSearchArea() throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.seachArea(driver,qudao);
    }
    @Test(description = "1线男 搜索年龄验证")
    public void checkSearchAge() throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.seachAge(driver,qudao);
    }
    @Test(description = "1线男 搜索身高验证")
    public void checkSearchHeight() throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.seachHeight(driver,qudao);
    }
    @Test(description = "1线男 搜索城市，年龄 身高")
    public void checkSearchAll() throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.seachAll(driver,qudao);
    }
    @Test(description = "1线男 搜索列表打招呼")
    public void checkSearchHello() throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.seachHello(driver,qudao);
    }
    @Test(description = "3线男 推荐语音聊天")
    public void checkTuijian3() throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.tuijian3(driver,qudao);
    }

    @Test(description = " 信箱3个标签")
    public void checkMailboxTab() throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.mailbox(driver,qudao);
    }
    @Test(description = "1线男 信箱未读信标示")
    public void checkMailboxNum() throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.mailboxNum(driver,qudao);
    }
    @Test(description = "1线男 信息上完善个人资料")
    public void checkMailboxPersonData() throws Exception{
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.mailboxPersonData(driver,qudao);
    }

    @Test(description = "3線男，私信进入女用户空间，索要联系方式")
    public void checkMailboxZone3() throws Exception {
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.mailboxZone3(driver, qudao);
    }
    @Test(description = "3線男，空间页查看女用户多张照片")
    public void checkMailboxZonePic3() throws Exception {
        JPCheck jpCheck = PageFactory.initElements(driver, JPCheck.class);
        jpCheck.mailboxZonePic3(driver, qudao);
    }


    @Test(description = "1线男，附近的人及打招呼")
    public void checkManNear1()throws Exception{
        JPCheck jpCheck=PageFactory.initElements(driver,JPCheck.class);
        jpCheck.manNear1(driver,qudao);
    }
    @Test(description = "3线男，附近的人及打招呼")
    public void checkManNear3()throws Exception{
        JPCheck jpCheck=PageFactory.initElements(driver,JPCheck.class);
        jpCheck.manNear3(driver,qudao);
    }

    @Test(description = "3线女 查看更多资料，无付款入口")
    public void checkWomenMore3()throws Exception{
        JPCheck jpCheck=PageFactory.initElements(driver,JPCheck.class);
        jpCheck.womanMore3(driver,qudao,"885954504","123321");
    }
    @Test(description = "3线女 进入空间下方，无在线状态")
    public void checkWomenAdvertisement3()throws Exception{
        JPCheck jpCheck=PageFactory.initElements(driver,JPCheck.class);
        jpCheck.womanAdvertisement3(driver,qudao,"885954504","123321");
    }
    @Test(description = "3线女，附近的人及打招呼")
    public void checkWomanNear3()throws Exception{
        JPCheck jpCheck=PageFactory.initElements(driver,JPCheck.class);
        jpCheck.womanNear3(driver,qudao,"885954504","123321");
    }
    @Test(description = "3线女，无会员中心")
    public void checkWomenMemberCenter3()throws Exception{
        JPCheck jpCheck=PageFactory.initElements(driver,JPCheck.class);
        jpCheck.womanMemberCenter3(driver,qudao,"885954504","123321");
    }

    @Test(description = "3线男 豆币免密开通及支付引导")
    public void checkBeanMianMi3() throws Exception {
        JPCheck jpCheck=PageFactory.initElements(driver,JPCheck.class);
        jpCheck.beanMianMi(driver, qudao, 0);
    }

    @Test(description = "3线男 写信包月免密开通及支付引导")
    public void checkLetterMianMi3() throws Exception {
        JPCheck jpCheck=PageFactory.initElements(driver,JPCheck.class);
        jpCheck.letterMianMi(driver, qudao);
    }

    @Test(description = "3线男 皇冠特权免密开通及支付引导")
    public void checkVIPMianMi3() throws Exception {
        JPCheck jpCheck=PageFactory.initElements(driver,JPCheck.class);
        jpCheck.vipMianMi(driver, qudao);
    }

    @Test(description = "3线男，安全中心")
    public void checkManSecurity() throws Exception {
        JPCheck jpCheck=PageFactory.initElements(driver,JPCheck.class);
        jpCheck.manSecurity(driver, qudao);
    }
    @Test(description = "3线男，帮助")
    public void checkManHelp() throws Exception {
        JPCheck jpCheck=PageFactory.initElements(driver,JPCheck.class);
        jpCheck.manHelp(driver, qudao);
    }
    @Test(description = "3线男，在线客服")
    public void checkManKeFu() throws Exception {
        JPCheck jpCheck=PageFactory.initElements(driver,JPCheck.class);
        jpCheck.manKeFu(driver, qudao);
    }
    @Test(description = "3线男，自定义招呼")
    public void checkManCustomCall() throws Exception {
        JPCheck jpCheck=PageFactory.initElements(driver,JPCheck.class);
        jpCheck.manCustomCall(driver, qudao);
    }

    @Test(description = "3线男，购买写信包月后，打招呼实名拦截，查看更多资料及照片")
    public void checkManSayHILanjie3() throws Exception {
        JPCheck jpCheck=PageFactory.initElements(driver,JPCheck.class);
        jpCheck.manSayHILanjie3(driver, qudao);
    }
    @Test(description = "1线男，购买写信包月后，打招呼实名拦截")
    public void checkManSayHILanjie1() throws Exception {
        JPCheck jpCheck=PageFactory.initElements(driver,JPCheck.class);
        jpCheck.manSayHILanjie1(driver, qudao);
    }
    @Test(description = "3线男，购买vip30天，查看更多资料，在线状态，到期日期")
    public void checkManBuyVip3() throws Exception {
        JPCheck jpCheck=PageFactory.initElements(driver,JPCheck.class);
        jpCheck.manBuyVip3(driver, qudao);
    }
    @Test(description = "3线男，购买豆币550个")
    public void checkManBuyBean3() throws Exception {
        JPCheck jpCheck=PageFactory.initElements(driver,JPCheck.class);
        jpCheck.manBuyBean3(driver, qudao);
    }

    @Test(description = "三线男，注册引导附近")
    public void checkManRegisteNear3() throws Exception {
        JPCheck jpCheck=PageFactory.initElements(driver,JPCheck.class);
        jpCheck.registeNear3(driver, qudao);
    }


    @AfterMethod
    public void resetApp(){
        driver.resetApp();
    }
}
