package com.yy.testcase;

import com.driver.Driver;
import com.yy.check.YYCheck;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class testcase extends Driver {

    String qudao = "120220";
    //891670058  aaa123456  一线男
    //901687633  aaa123456  三线男（901715374，901715546，901715686）


    @Test(description = "注册协议")
    public void checkProtocol() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.protocal(driver);
    }

    @Test(description = "1线男注册登录")
    public void checkManRegiste1() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manRegiste1(driver, qudao);
        YYCheck.judgeRegist();
    }

    @Test(description = "3线男注册登录")
    public void checkManRegiste3() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manRegiste3(driver, qudao);
        YYCheck.judgeRegist();
    }

    @Test(description = "1线男缘分页打招呼")
    public void checkManSayHi1() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manSayHi1(driver, qudao);
    }

    @Test(description = "1线男缘分页关注")
    public void checkManCardAttention1() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manCardAttention1(driver, qudao);
    }

    @Test(description = "3线男缘分页-语音tab语音")
    public void checkManTVVoice3() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manTVVoice(driver, qudao);
    }

    @Test(description = "3线男缘分页-语音tab关注")
    public void checkManCardAttention3() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manCardAttention3(driver, qudao);
    }

    @Test(description = "1线男空间页打招呼和关注后回到缘分页验证按钮状态，然后测试切换下一个用户")
    public void checkManAskbtn1() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manAskbtn1(driver, qudao);
    }

    @Test(description = "1线男 空间页取消关注")
    public void checkManConversation1() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manCancleAttention1(driver, qudao);
    }

    @Test(description = "1线男 空间页拉黑")
    public void checkManNotread1() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.mannNotread1(driver, qudao);
    }

    @Test(description = "1线男 空间页举报")
    public void checkManUpgraded1() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manUpgraded1(driver, qudao);
    }

   /* @Test(description = "1线男 空间页在线状态")
    public void checkManOnlineStatus1() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manOnlineStatus1(driver, qudao);
    }*/

   /* @Test(description = "3线男 空间页查看视频")
    public void checkManVedio3() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manVideo3(driver, qudao);
    }
*/
    @Test(description = "3线男 空间页查看更多资料")
    public void checkManMore3() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manMore3(driver, qudao);
    }

    @Test(description = "1线男 空间页查看更多资料")
    public void checkManMore1() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manMore1(driver, qudao);
    }

    @Test(description = "1线男 附近")
    public void checkManNear1() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manNear1(driver, qudao);
    }

    @Test(description = "1线男 缘分页筛选")
    public void checkManFilter1() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manFilter1(driver, qudao);
    }

    @Test(description = "1线男 会员中心五项服务")
    public void checkVIPList()throws Exception{
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.VIPCenter1(driver,qudao);
    }
    @Test(description = "3线男 会员中心五项服务")
    public void checkVIPList3()throws Exception{
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.VIPCenter3(driver,qudao);
    }
    @Test(description = "1线男 会员中心--豆币价格列表及支付调起")
    public void checkBeanList1() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.BeanList1(driver);
    }

    @Test(description = "3线男 会员中心--豆币价格列表及支付调起")
    public void checkBeanList3() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.BeanList3(driver);
    }

    @Test(description = "1线男 会员中心--写信包月价格列表及支付调起")
    public void checkLetterList1() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.LetterList1(driver);
    }

    @Test(description = "3线男 会员中心--写信包月价格列表及支付调起")
    public void checkLetterList3() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.LetterList3(driver, qudao);
    }

    @Test(description = "1线男 会员中心--星级服务价格列表")
    public void checkVipList1() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.VipList1(driver);
    }

    @Test(description = "3线男 会员中心--星级服务价格列表")
    public void checkVipList3() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.VipList3(driver, qudao);
    }

    @Test(description = "1线男 完善个人资料")
    public void checkMyPersonData1() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.myPersonData(driver, qudao);
    }
    @Test(description = "1线男 诚信等级")
    public void checkIntegrityLevel1() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.integrityLevel(driver, qudao);
    }
    @Test(description = "1线男 我的照片")
    public void checkMyPicture() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.myPicture(driver, qudao);
    }
    @Test(description = "1线男 征友条件")
    public void checkMyCondition1() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.myCondition(driver, qudao);
    }

    @Test(description = "3线男 我的标签-匹配问答")
    public void checkAnswerQuestions3() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manRegiste3(driver, qudao);
        YYCheck.myTag(driver);
    }
    @Test(description = "1线男 我的标签-匹配问答")
    public void checkMyTag1() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manRegiste1(driver, qudao);
        YYCheck.myTag(driver);
    }
   /* @Test(description = "3线男 自我介绍录音-没有")
    public void checkMyIntroduction3() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.myIntroduction3(driver, "159785");
    }*/
    @Test(description = "3线男 我的访客")
    public void checkMyVisitor3() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.myVisitor3(driver, qudao);
    }


//    @Test(description = "3线男 会员中心--对对碰，开通免密及支付引导")
//    public void checkDuiDuiPeng() throws Exception {
//        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
//        YYCheck.duiDuiPeng(driver, "159785", 0);
//    }
//    @Test(description = "3线男 写信包月免密开通及支付引导")
//    public void checkLetterMianMi() throws Exception {
//        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
//        YYCheck.letterMianMi(driver, "68448", 0);
//    }
//    @Test(description = "3线男 皇冠特权免密开通及支付引导")
//    public void checkVIPMianMi() throws Exception {
//        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
//        YYCheck.vipMianMi(driver, "68448", 0);
//    }

    @Test(description = "1线男 信息模块上方完善资料")
    public void checkManMailboxPersonData1() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manMailboxPersonData1(driver, qudao);
    }

    @Test(description = "1线男 未读信")
    public void checkManMailboxNum1() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manMailboxNum1(driver, qudao);
    }

    @Test(description = "1线男 信箱三项")
    public void checkManMailbox1() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manMailbox1(driver, qudao);
    }

    @Test(description = "3线男 信箱进入空间索要联系方式")
    public void checkManMailboxZone3() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manMailboxZone3(driver, qudao);
    }

    @Test(description = "3线男 信箱进入空间查看多张照片")
    public void checkManMailboxZonePic3() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manMailboxZonePic3(driver, qudao);
    }

    //
//    @Test(description = "1线男 会员中心--收信宝价格列表")
//    public void checkReciveLetter1List1()throws Exception{
//        YYCheck YYCheck=PageFactory.initElements(driver,YYCheck.class);
//        YYCheck.reciveLetter1(driver);
//    }
//    @Test(description = "1线男 会员中心--咪咕会员列表")
//    public void checkMiguList1()throws Exception{
//        YYCheck YYCheck=PageFactory.initElements(driver,YYCheck.class);
//        YYCheck.migu(driver);
//    }
//

    @Test(description = "1线男 登录")
    public void checkMenLogin1() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.womanLogin1(driver, "893235061", "aaa123456");
    }

    @Test(description = "1线女 登录")
    public void checkWomenLogin1() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.womanLogin1(driver, "893243362", "aaa123456");
    }

    @Test(description = "3线女 登录")
    public void checkWomenLogin3() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.womanLogin3(driver, qudao, "893268877", "aaa123456");
    }

    @Test(description = "3线女 付费入口")
    public void checkWomenMemberCenter3() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.womanMemberCenter3(driver, qudao, "893269443", "aaa123456");
    }

    @Test(description = "3线女 查看更多资料 ")
    public void checkWomenMore3() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.womanMore3(driver, qudao, "893268877", "aaa123456");
    }

  /*  @Test(description = "3线女 进入空间下方，无在线状态 ")
    public void checkWomenAdvertisement3() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.womanAdvertisement3(driver, "159785", "856511377", "123456q");
    }
*/
    @Test(description = "1线女 附近")
    public void checkWomenNear1() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.womanNear1(driver, "893243362", "aaa123456");
    }
//
//    @Test(description = "1线女 缘分助手开启")
//    public void checkWomenYuanFenZhuShou()throws Exception{
//        YYCheck YYCheck=PageFactory.initElements(driver,YYCheck.class);
//        YYCheck.womenYuanFenZhuShou(driver);
//    }
//



   /* @Test(description = "3线男 对对碰，免密开通及支付引导")
    public void checkDuiDuiPeng() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.duiDuiPeng(driver, "68448", 0);
    }*/


    @Test(description = "1线男，安全中心")
    public void checkManSecurity() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manSecurity(driver, qudao);
    }
    @Test(description = "1线男，帮助")
    public void checkManHelp() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manHelp(driver, qudao);
    }
    @Test(description = "1线男，在线客服")
    public void checkManKeFu() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manKeFu(driver,  qudao);
    }

    @Test(description = "3线男，豆币免密开通及支付引导")
    public void checkBeanMianMi3() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.beanMianMi(driver, qudao,0);
    }

    @Test(description = "3线男 写信包月免密开通及支付引导")
    public void checkLetterMianMi3() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.letterMianMi(driver, qudao);
    }

    @Test(description = "3线男 皇冠特权免密开通及支付引导")
    public void checkVIPMianMi3() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.vipMianMi(driver, qudao);  //68448
    }

    @Test(description = "3线男，自定义招呼-不写")
    public void checkManCustomCall() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manCustomCall(driver,  qudao);
    }

    @Test(description = "3线男，购买写信包月后，打招呼实名拦截，查看更多资料及照片-不写")
    public void checkManSayHILanjie3() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manSayHILanjie3(driver, "159785");
    }

    @Test(description = "1线男，购买写信包月后，打招呼实名拦截-不写")
    public void checkManSayHILanjie1() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manSayHILanjie1(driver, qudao);
    }

    @Test(description = "3线男，购买vip30天，查看更多资料，在线状态，到期日期-不写")
    public void checkManBuyVip3() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.manBuyVip3(driver, qudao);
    }
//    @Test(description = "3线男，购买豆币550个")
//    public void checkManBuyBean3() throws Exception {
//        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
//        YYCheck.manBuyBean3(driver, "68448");
//    }

    @Test(description = "三线男，注册引导附近")
    public void checkManRegisteNear3() throws Exception {
        YYCheck YYCheck = PageFactory.initElements(driver, YYCheck.class);
        YYCheck.registeNear3(driver, qudao);
    }

    @AfterMethod
    public void resetApp()  {
        driver.resetApp();
    }


}
