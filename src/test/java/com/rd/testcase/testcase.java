package com.rd.testcase;

import com.driver.Driver;
import com.rd.check.RDCheck;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class testcase extends Driver {

    String qudao = "930001";
    //891670058  aaa123456   895501716 1线男   901690987  3线男

    @Test(description = "1线男注册登录")
    public void checkManRegiste1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manRegiste1(driver, qudao);
    }

    @Test(description = "3线男注册登录")
    public void checkManRegiste3() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manRegiste3(driver, qudao);
    }

    @Test(description = "1线男遇见页喜欢")
    public void checkManSayHi1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manSayHi1(driver, qudao);
    }

    @Test(description = "3线男遇见页语音")
    public void checkManVoice3() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manVoice3(driver, qudao);
    }


    @Test(description = "1线男遇见页查看下一个")
    public void checkManNextPeople() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manRegiste1(driver, qudao);
        RDCheck.manNextPeople1(driver);
    }

    @Test(description = "1线男 空间页关注")
    public void checkManConversation1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manRegiste1(driver, qudao);
        RDCheck.manCancleAttention1(driver);
    }

    @Test(description = "1线男 空间页拉黑")
    public void checkManNotread1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manRegiste1(driver, qudao);
        RDCheck.mannNotread1(driver);
    }

    @Test(description = "1线男 空间页举报")
    public void checkManUpgraded1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manRegiste1(driver, qudao);
        RDCheck.manUpgraded1(driver);
    }

    @Test(description = "1线男 空间页在线状态")
    public void checkManOnlineStatus1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manOnlineStatus1(driver, qudao);
    }


    @Test(description = "3线男 空间页查看视频")
    public void checkManVedio3() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manVideo3(driver, qudao);
    }

    @Test(description = "1线男 空间页查看更多资料")
    public void checkManMore1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manRegiste1(driver, qudao);
        RDCheck.manMore1(driver);
    }

    @Test(description = "3线男 空间页查看更多资料")
    public void checkManMore3() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manMore3(driver, qudao);
    }

    @Test(description = "1线男 附近")
    public void checkManNear1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manRegiste1(driver, qudao);
        RDCheck.near1(driver,1);
    }

    @Test(description = "3线男 附近")
    public void checkManNear3() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manNear3(driver, qudao);
    }
    @Test(description = "1线男 热聊")
    public void checkManReLiao1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manRegiste1(driver, qudao);
        RDCheck.womanReLiao1();
    }


    @Test(description = "1线男 会员中心购买项")
    public void checkVIPList() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manRegiste1(driver, qudao);
        RDCheck.VIPCenter1(driver, qudao);
    }

    @Test(description = "3线男 会员中心购买项")
    public void checkVIPList3() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manRegiste3(driver, qudao);
        RDCheck.VIPCenter3(driver, qudao);
    }

    @Test(description = "1线男 会员中心--豆币价格列表及支付调起")
    public void checkBeanList1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manRegiste1(driver, qudao);
        RDCheck.BeanList1(driver);
    }

    @Test(description = "3线男 会员中心--豆币价格列表及支付调起")
    public void checkBeanList3() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manRegiste3(driver, qudao);
        RDCheck.BeanList3(driver);
    }

    @Test(description = "1线男 会员中心--写信包月价格列表及支付调起")
    public void checkLetterList1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manRegiste1(driver, qudao);
        RDCheck.LetterList1(driver);
    }

    @Test(description = "3线男 会员中心--写信包月价格列表及支付调起")
    public void checkLetterList3() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manRegiste3(driver, qudao);
        RDCheck.LetterList1(driver);
    }

    @Test(description = "1线男 会员中心--星级服务价格列表")
    public void checkVipList1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manRegiste1(driver, qudao);
        RDCheck.VipList1(driver);
    }

    @Test(description = "3线男 会员中心--星级服务价格列表")
    public void checkVipList3() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manRegiste3(driver, qudao);
        RDCheck.VipList1(driver);
    }

    @Test(description = "1线男 完善个人资料")
    public void checkMyPersonData1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manRegiste1(driver, qudao);
        RDCheck.myPersonData(driver);
    }
    @Test(description = "1线男 诚信等级")
    public void checkIntegrityLevel1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manRegiste1(driver, qudao);
        RDCheck.integrityLevel(driver);
    }
    @Test(description = "1线男 上传头像")
    public void checkMyPicture() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manRegiste1(driver, qudao);
        RDCheck.myPicture(driver);
    }
    @Test(description = "1线男 征友条件")
    public void checkMyCondition1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manRegiste1(driver, qudao);
        RDCheck.myCondition(driver);
    }

    @Test(description = "1线男 匹配问答")
    public void checkAnswerQuestions1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manRegiste1(driver, qudao);
        RDCheck.myAnswerQuestions1(driver);
    }
    @Test(description = "1线男 我的标签-匹配问答")
    public void checkMyTag1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manRegiste1(driver, qudao);
        RDCheck.myTag(driver);
    }

    @Test(description = "1线男 自我介绍录音")
    public void checkMyIntroduction1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manRegiste1(driver, qudao);
        RDCheck.myIntroduction1(driver);
    }
    @Test(description = "1线男 我的访客")
    public void checkMyVisitor1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manRegiste1(driver, qudao);
        RDCheck.myVisitor1(driver);
    }

    @Test(description = "1线男，安全中心")
    public void checkManSecurity() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manSecurity(driver, qudao);
    }
    @Test(description = "1线男，帮助")
    public void checkManHelp() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manHelp(driver, qudao);
    }
    @Test(description = "1线男，在线客服")
    public void checkManKeFu() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manKeFu(driver,  qudao);
    }

    @Test(description = "1线男 信息模块上方完善资料")
    public void checkManMailboxPersonData1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manMailboxPersonData1(driver, qudao);
    }

    @Test(description = "1线男 未读信")
    public void checkManMailboxNum1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manMailboxNum1(driver, qudao);
    }

    @Test(description = "1线男 信箱三项")
    public void checkManMailbox1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manMailbox1(driver, qudao);
    }

    @Test(description = "3线男 信箱进入空间索要联系方式")
    public void checkManMailboxZone3() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manMailboxZone3(driver,"895751427", "aaa123456");
    }

    @Test(description = "3线男 信箱进入空间查看多张照片")
    public void checkManMailboxZonePic3() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manMailboxZonePic3(driver, qudao);
    }



    @Test(description = "1线男 登录")
    public void checkMenLogin1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manLogin1(driver, qudao, "895501716", "aaa123456");
    }

    @Test(description = "1线女 注册")
    public void checkWomenRegister1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.womanRegiste1(driver, qudao);
    }

    @Test(description = "1线女 登录")
    public void checkWomenLogin1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.womanLogin1("896672267", "aaa123456");
    }


    @Test(description = "3线女 登录")
    public void checkWomenLogin3() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.womanLogin3("896507273", "aaa123456");
    }

    @Test(description = "1线女 缘分助手开启")
    public void checkWomenYuanFenZhuShou()throws Exception{
        RDCheck RDCheck=PageFactory.initElements(driver,RDCheck.class);
        RDCheck.womenYuanFenZhuShou(driver,qudao);
    }
    @Test(description = "1线女 热聊")
    public void checkWomanReLiao1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.womanRegiste1(driver,qudao);
        RDCheck.womanReLiao1();
    }
    @Test(description = "1线女 遇见页喜欢")
    public void checkWomanYuJian1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.womanYuJian1(driver, qudao);
    }

    @Test(description = "1线女遇见页查看下一个")
    public void checkWomanNextPeople() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.womanRegiste1(driver, qudao);
        RDCheck.manNextPeople1(driver);
    }
    @Test(description = "1线女 空间页关注")
    public void checkWomanConversation1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.womanRegiste1(driver, qudao);
        RDCheck.manCancleAttention1(driver);
    }

    @Test(description = "1线女 空间页拉黑")
    public void checkWomanNotread1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.womanRegiste1(driver, qudao);
        RDCheck.mannNotread1(driver);
    }

    @Test(description = "1线女 空间页举报")
    public void checkWomanUpgraded1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.womanRegiste1(driver, qudao);
        RDCheck.manUpgraded1(driver);
    }
      @Test(description = "1线女 附近")
    public void checkWomenNear1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.womanLogin1("896672267", "aaa123456");
        RDCheck.near1(driver,2);
    }
    @Test(description = "1线女 查看更多资料 ")
    public void checkWomenMore1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.womanRegiste1(driver, qudao);
        RDCheck.manMore1(driver);
    }

    @Test(description = "1线女 完善个人资料")
    public void checkWomanPersonData1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.womanRegiste1(driver, qudao);
        RDCheck.myPersonData(driver);
    }
    @Test(description = "1线女 诚信等级")
    public void checkWomanIntegrityLevel1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.womanRegiste1(driver, qudao);
        RDCheck.integrityLevel(driver);
    }
    @Test(description = "1线女 上传头像")
    public void checkWomanPicture() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.womanRegiste1(driver, qudao);
        RDCheck.myPicture(driver);
    }
    @Test(description = "1线女 征友条件")
    public void checkWomanCondition1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.womanRegiste1(driver, qudao);
        RDCheck.myCondition(driver);
    }

    @Test(description = "1线女 匹配问答")
    public void checkWomanAnswerQuestions1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.womanRegiste1(driver, qudao);
        RDCheck.myAnswerQuestions1(driver);
    }
    @Test(description = "1线女 我的标签-匹配问答")
    public void checkWomanTag1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.womanRegiste1(driver, qudao);
        RDCheck.myTag(driver);
    }

    @Test(description = "1线女 自我介绍录音")
    public void checkWomanIntroduction1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.womanRegiste1(driver, qudao);
        RDCheck.myIntroduction1(driver);
    }
    @Test(description = "1线女 我的访客")
    public void checkWomanVisitor1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.womanRegiste1(driver, qudao);
        RDCheck.myVisitor1(driver);
    }

    /*
    @Test(description = "3线女 付费入口")
    public void checkWomenMemberCenter3() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.womanMemberCenter3(driver, qudao, "893269443", "aaa123456");
    }

    */

  /*  @Test(description = "3线女 进入空间下方，无在线状态 ")
    public void checkWomenAdvertisement3() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.womanAdvertisement3(driver, "159785", "856511377", "123456q");
    }
*/

//
//
//





    /*
    @Test(description = "3线男 写信包月免密开通及支付引导-未完")
    public void checkLetterMianMi() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.letterMianMi(driver, qudao, 0);
    }

    @Test(description = "3线男 皇冠特权免密开通及支付引导-不写")
    public void checkVIPMianMi() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.vipMianMi(driver, "68448", 0);
    }*/


    //
//    @Test(description = "1线男 会员中心--收信宝价格列表")
//    public void checkReciveLetter1List1()throws Exception{
//        RDCheck RDCheck=PageFactory.initElements(driver,RDCheck.class);
//        RDCheck.reciveLetter1(driver);
//    }
//    @Test(description = "1线男 会员中心--咪咕会员列表")
//    public void checkMiguList1()throws Exception{
//        RDCheck RDCheck=PageFactory.initElements(driver,RDCheck.class);
//        RDCheck.migu(driver);
//    }
//

   /* @Test(description = "3线男，自定义招呼")
    public void checkManCustomCall() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manCustomCall(driver,  qudao);
    }*/

   /* @Test(description = "3线男，购买写信包月后，打招呼实名拦截，查看更多资料及照片")
    public void checkManSayHILanjie3() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manSayHILanjie3(driver, qudao);
    }

    @Test(description = "1线男，购买写信包月后，打招呼实名拦截-不写")
    public void checkManSayHILanjie1() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manSayHILanjie1(driver, qudao);
    }

    @Test(description = "3线男，购买vip30天，查看更多资料，在线状态，到期日期-不写")
    public void checkManBuyVip3() throws Exception {
        RDCheck RDCheck = PageFactory.initElements(driver, RDCheck.class);
        RDCheck.manBuyVip3(driver, qudao);
    }*/



    @AfterMethod
    public void resetApp() throws Exception {
        driver.resetApp();
    }


}
