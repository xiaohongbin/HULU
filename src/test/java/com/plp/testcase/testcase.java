package com.plp.testcase;

import com.driver.Driver;
import com.plp.check.PLPCheck;
import org.openqa.selenium.support.PageFactory;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class testcase extends Driver {
    public String qudaohao = "120220";
    @Test(description = "注册协议")
    public void checkProtocal() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.protocal();
    }

    @Test(description = "3线男，注册登录")
    public void checkManRegiste3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.manRegiste3(driver, qudaohao);
    }

    @Test(description = "1线男，注册登录")
    public void checkManRegiste1() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.manRegiste1(driver, qudaohao);
    }

    @Test(description = "3线男，缘分页打招呼")
    public void checkManSayHi3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.manSayHi3(driver, qudaohao);
    }
    @Test(description = "1线男，缘分页打招呼")
    public void checkManSayHi1() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.manSayHi1(driver, qudaohao);
    }

    @Test(description = "3线男，空间打招呼，下一位")
    public void checkManAskbtn3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.askbtn3(driver, qudaohao);
    }

    @Test(description = "3线男，关注")
    public void checkManConversation3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.conversation3(driver, qudaohao);
    }

    @Test(description = "3线男，拉黑")
    public void checkManNotread3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.notread(driver, qudaohao);
    }

    @Test(description = "3线男，举报")
    public void checkManUpgraded3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.upgraded(driver, qudaohao);
    }

    @Test(description = "3线男，在线状态")
    public void checkManOnlineStatus3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.onlineStatus3(driver, qudaohao);
    }
    @Test(description = "1线男，在线状态")
    public void checkManOnlineStatus1() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.onlineStatus1(driver, qudaohao);
    }

    @Test(description = "3线男 空间页 查看视频")
    public void checkManVideo3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.manVideo3(driver, qudaohao);
    }

    @Test(description = "3線男，查看更多资料")
    public void checkMore3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.more3(driver, qudaohao);
    }

    @Test(description = "1線男，查看更多资料")
    public void checkMore1() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.more1(driver, qudaohao);
    }

    @Test(description = "3线男，会员中心可购买项")
    public void checkManVIP3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.VIP3(driver, qudaohao);
    }
    @Test(description = "3线男，豆币价格及支付调起")
    public void checkBeanList3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.beanList3(driver, qudaohao);
    }
    @Test(description = "3线男，写信包月价格及支付调起")
    public void checkLetterList3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.letterList3(driver, qudaohao);
    }
    @Test(description = "3线男，皇冠特权价格及支付调起")
    public void checkVipList3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.VipList3(driver, qudaohao);
    }
    @Test(description = "1线男，豆币价格及支付调起")
    public void checkBeanList1() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.beanList1(driver, qudaohao);
    }
    @Test(description = "1线男，写信包月价格及支付调起")
    public void checkLetterList1() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.letterList1(driver, qudaohao);
    }
    @Test(description = "1线男，皇冠特权价格及支付调起")
    public void checkVipList1() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.VipList1(driver, qudaohao);
    }


    @Test(description = "1线男 搜索初始条件")
    public void checkInitSearch() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.initSeachCondition(driver, qudaohao);
    }

    @Test(description = "1线男 搜索城市")
    public void checkSeachArea() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.seachArea(driver, qudaohao);
    }

    @Test(description = "1线男 搜索年龄")
    public void checkSeachAge() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.seachAge(driver, qudaohao);
    }

    @Test(description = "1线男 搜索身高")
    public void checkSeachHeight() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.seachHeight(driver, qudaohao);
    }

    @Test(description = "1线男 搜索城市，年龄 身高")
    public void checkSeachAll() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.seachAll(driver, qudaohao);
    }

    @Test(description = "1线男 搜索列表打招呼")
    public void checkSeachHello() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.seachHello(driver, qudaohao);
    }

    @Test(description = "3线男，推荐语音聊天")
    public void checkManTuiJian3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.tuijian3(driver, qudaohao);
    }




    @Test(description = "3线男，完善个人资料")
    public void checkMyPersonData3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.myPersonData(driver, qudaohao);
    }

    @Test(description = "3線男，征友條件")
    public void checkMyCondition3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.myCondition3(driver, qudaohao);
    }

    @Test(description = "3線男，匹配问答")
    public void checkMyQuestion3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.myQuestion3(driver, qudaohao);
    }

    @Test(description = "3線男，自我介绍")
    public void checkMyIntroduction3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.myIntroduction3(driver, qudaohao);
    }

    @Test(description = "3線男，最近访客")
    public void checkMyVisitor3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.myVisitor3(driver, qudaohao);
    }

    @Test(description = "3線男，诚信等级")
    public void checkMyIntegrity3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.myIntegrity3(driver, qudaohao);
    }

    @Test(description = "3線男，我的标签")
    public void checkMyTag3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.myTag3(driver, qudaohao);
    }

    @Test(description = "3線男，上传头像")
    public void checkUploadPic3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.uploadPic(driver, qudaohao);
    }

    @Test(description = "3線男，咪咕约会吧vip")
    public void checkMiGu3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.migu(driver, qudaohao);
    }

    @Test(description = "信箱三项")
    public void checkMailboxTab() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.mailbox(driver, qudaohao);
    }

    @Test(description = "3線男，信箱未读")
    public void checkMailboxNum3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.mailboxNum3(driver, qudaohao);
    }

    @Test(description = "3線男，信箱完善个人信息")
    public void checkMailboxPersonData3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.mailboxPersonData3(driver, qudaohao);
    }

    @Test(description = "3線男，私信进入女用户空间，索要联系方式")
    public void checkMailboxZone3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.mailboxZone3(driver, qudaohao);
    }

    @Test(description = "3線男，空间页查看女用户多张照片")
    public void checkMailboxPic3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.mailboxZonePic3(driver, qudaohao);
    }


    @Test(description = "3線男，对对碰，免密开通及两次支付引导")
    public void checkDuiDuiPeng3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.duiDuiPeng(driver, qudaohao, 0);
    }
    @Test(description = "3线男 写信包月免密开通及支付引导")
    public void checkLetterMianMi() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.letterMianMi(driver, qudaohao, 0);
    }
    @Test(description = "3线男 皇冠特权免密开通及支付引导")
    public void checkVIPMianMi() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.vipMianMi(driver, qudaohao, 0);
    }

    @Test(description = "3线男，安全中心")
    public void checkManSecurity() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.manSecurity(driver, qudaohao);
    }
    @Test(description = "3线男，帮助")
    public void checkManHelp() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.manHelp(driver, qudaohao);
    }
    @Test(description = "3线男，在线客服")
    public void checkManKeFu() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.manKeFu(driver, qudaohao);
    }
    @Test(description = "3线男，自定义招呼")
    public void checkManCustomCall() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.manCustomCall(driver, qudaohao);
    }

    @Test(description = "3线男，购买写信包月后，打招呼实名拦截，查看更多资料及照片")
    public void checkManSayHILanjie3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.manSayHILanjie3(driver, qudaohao);
    }

    @Test(description = "1线男，购买写信包月后，打招呼实名拦截")
    public void checkManSayHILanjie1() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.manSayHILanjie1(driver, qudaohao);
    }

    @Test(description = "3线男，购买vip30天，查看更多资料，在线状态，到期日期")
    public void checkManBuyVip3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.manBuyVip3(driver, qudaohao);
    }
    @Test(description = "3线男，购买豆币550个")
    public void checkManBuyBean3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.manBuyBean3(driver, qudaohao);
    }


//    @Test(description = "1线女 注册")
//    public void checkWomenRegiste1() throws Exception {
//        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
//        plpCheck.womanRegiste1(driver, qudaohao);
//    }
//
//    @Test(description = "3线女 注册")
//    public void checkWomenRegiste3() throws Exception {
//        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
//        plpCheck.womanRegiste3(driver, "68448");
//    }
//
//    @Test(description = "1线女 登录")
//    public void checkWomenLogin1() throws Exception {
//        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
//        plpCheck.womanLogin1(driver, "68448", "855431724", "123456q");
//    }
//
//    @Test(description = "3线女 登录")
//    public void checkWomenLogin3() throws Exception {
//        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
//        plpCheck.womanLogin3(driver, "68448", "855431724", "123456q");
//    }
//
//    @Test(description = "3线女 查看更多资料，无付款入口")
//    public void checkWomenMore3() throws Exception {
//        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
//        plpCheck.womanMore3(driver, "68448", "855431724", "123456q");
//    }
//
//    @Test(description = "3线女 进入空间下方，无在线状态")
//    public void checkWomenAdvertisement3() throws Exception {
//        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
//        plpCheck.womanAdvertisement3(driver, "68448", "855431724", "123456q");
//    }
//
//    @Test(description = "3线女 打招呼上限")
//    public void checkWomenSayHi3() throws Exception {
//        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
//        plpCheck.womanSayHi3(driver, "68448", "855431724", "123456q");
//    }
//
//    @Test(description = "1线女 缘分小助手")
//    public void checkWomenZhaoHuGuanJia1() throws Exception {
//        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
//        plpCheck.womanYuanfenZhuShou1(driver, "68448", "855431724", "123456q");
//    }
//
//    @Test(description = "3线女 付费入口")
//    public void checkWomenMemberCenter3() throws Exception {
//        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
//        plpCheck.womanMemberCenter3(driver, "68448", "855431724", "123456q");
//    }
//
//    @Test(description = "3线女 附近")
//    public void checkWomenNear3() throws Exception {
//        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
//        plpCheck.womanNear3(driver, "68448", "855431724", "123456q");
//    }
//
//    @Test(description = "1线女 附近")
//    public void checkWomenNear1() throws Exception {
//        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
//        plpCheck.womanNear1(driver, "68448", "855431724", "123456q");
//    }

    @Test(description = "三线男，双号视频功能")
    public void checkManSpace3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.space3(driver, qudaohao);
    }

    @Test(description = "三线男，双号查看微信功能")
    public void checkManWechar3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.wechar3(driver, qudaohao);
    }

    @Test(description = "三线男，双号查看QQ功能")
    public void checkManQQ3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.qq3(driver, qudaohao);
    }

    @Test(description = "三线男，注册引导附近")
    public void checkManRegisteNear3() throws Exception {
        PLPCheck plpCheck = PageFactory.initElements(driver, PLPCheck.class);
        plpCheck.registeNear3(driver, qudaohao);
    }


    @AfterMethod
    public void resetApp() throws Exception {
        driver.resetApp();
    }
}
