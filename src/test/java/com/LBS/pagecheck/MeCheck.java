package com.LBS.pagecheck;

import com.LBS.pagemethod.MeMethod;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;

public class MeCheck extends MeMethod {

    public void checkUploadPic(AndroidDriver driver){
        this.clickMeIcon();
        if(!this.doesWebElementExist(noimg)){
            Assert.fail("未提交照片，无提示");
        }
        this.clickUploadPic();
        this.clickLocalPic();
        this.clickImg();
        this.clickMonitor(driver);
        this.clickImgOK();
        if(!this.doesWebElementExist(imgcheck)){
            Assert.fail("提交照片后，未显示审核照片");
        }
    }

    public void checkBean(int beannum,AndroidDriver driver) throws Exception{
        this.clickMeIcon();
//        this.clickMegClose();
        this.clickMembercenter();
        if(this.getBeanNum()!=beannum){
            Assert.fail("初始豆币个数和预期不一致");
        }
        this.clickBean();
        this.clickBean800();
        this.clickWecharPay();
        this.clickOK();
        Thread.sleep(5000);
//        String app=this.getCurrentActivity(driver);
//        System.out.println(app);
        if(!this.getCurrentActivity(driver).contains("SimpleLoginUI")){
//            System.out.println(this.getCurrentActivity(driver));
            Assert.fail("未启动微信");
        }
        this.keyBack(driver);
        if(!this.getTitle().equals("会员服务")){
            Assert.fail("未返回 会员服务页面");
        }
    }

    public void checkLetter(AndroidDriver driver) throws Exception{
        this.clickMeIcon();
        this.clickMegClose();
        this.clickMembercenter();
        this.clickLetter();
        this.clickBuy90();
        this.clickOK();
        Thread.sleep(5000);
        if(!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")){
            System.out.println(this.getCurrentActivity(driver));
            Assert.fail("未启动支付宝");
        }
        this.keyBack(driver);
        if(!this.getTitle().equals("会员服务")){
            Assert.fail("未返回 会员服务页面");
        }
    }

    public void checkPersonalData(AndroidDriver driver) throws Exception{
        this.clickMeIcon();
        this.clickMegClose();
        this.clickMemberInfo();
        this.clickHeight();
        this.clickOKBtn();
        this.clickWeight();
        this.clickOKBtn();
        this.swipeToUp(driver);
        this.clickBloodType();
        this.clickOKBtn();
        this.clickSave();
        Thread.sleep(2000);
        this.clickProperty();
        this.swipeToUp(driver);
        this.clickHobby();
        this.clickSave();
        this.clickNativePlace();
        this.clickOKBtn();
        this.clickEducation();
        this.clickOKBtn();
        this.clickJob();
        this.clickOKBtn();
        this.clickIncome();
        this.clickOKBtn();
        this.clickPart();
        this.clickOKBtn();
        this.clickMaritalStatus();
        this.clickOKBtn();
        this.clickHouse();
        this.clickOKBtn();
        this.clickYidilian();
        this.clickOKBtn();
        this.swipeToUp(driver);
        this.clickOppositeSex();
        this.clickOKBtn();
        this.clickQinmi();
        this.clickOKBtn();
        this.clickParent();
        this.clickOKBtn();
        this.clickChild();
        this.clickOKBtn();
        this.clickSave();
        Thread.sleep(5000);
//        System.out.println(this.getMemberInfo());
        if(!this.getMemberInfo().contains("95%")){
            Assert.fail("修改资料后，未生效");
        }
    }

    public void checkCondition(AndroidDriver driver)throws Exception{
        this.clickMeIcon();
        this.clickMegClose();
        this.swipeToUp(driver);
        Thread.sleep(2000);
        this.clickBodyItem();
        this.clickLocalView();
        this.clickDown();
        this.clickOKBtn();
        this.clickAgeView();
        for(int i=0;i<5;i++){
            this.clickDown();
        }
        this.clickOKBtn();
        this.clickHeightView();
        for(int i=0;i<10;i++){
            this.clickDown();
        }
        this.clickOKBtn();
        String local_view=this.getLocalView();
        String age_view=this.getAgeView();
        String height_view=this.getHeightView();
        this.clickSave();
        this.clickSearchIcon();
        this.clickSearchButton();
        String local_text=this.getAreaText();
        String age_text=this.getAgeText();
        String height_text=this.getHeightText();
        if(!local_text.equals(local_view)){
            Assert.fail("搜索中 所在地与征友条件中所在地 不一致");
        }
        if(!age_text.contains(age_view)){
            Assert.fail("搜索中年龄与征友条件中年龄不一致");
        }

        if(!height_text.contains(height_view)){
            Assert.fail("搜索中身高与征友条件中身高不一致");
        }
        this.keyBack(driver);
        this.clickYuanfenIcon();
        this.swipeToDown(driver);
        Thread.sleep(5000);


        for(int i=0;i<4;i++){
            iv.get(i).click();
////            this.clickMegClose();
            this.clickMonitor1(driver);
            Thread.sleep(2000);
            this.clickMonitor1(driver);
//            this.clickUsername();
//            this.clickUsername();
            Thread.sleep(2000);
            System.out.println(this.getMemberInfoText());
            if(!this.getMemberInfoText().contains(local_view)){
                Assert.fail("缘分页中,第"+(i+1)+"个用户，地区与征友条件中不一致");
            }
            this.keyBack(driver);
        }
    }

    public void checkQuestion(AndroidDriver driver)throws Exception{
        this.clickMeIcon();
        this.clickMegClose();
        this.clickMatchingQa();
        if(!this.getTitle().equals("匹配问答")){
            Assert.fail("未能进入匹配问答页面");
        }
        this.clickQuestionView();
        this.clickSendQuestion();
        this.clickLeft();
        this.swipeToUp(driver);
        int i=this.getQuestionNum();
        this.clickQuestionNum();
        if(!this.getTitle().equals("我的匹配问答")){
            Assert.fail("未能进入“我的匹配问答”页面");
        }
        int j=qa_q_ico.size();
        if(i!=1||i!=j){
            Assert.fail("匹配问答中，回答的数量与显示的数量不一致");
        }
    }

    public void checkMyTag(AndroidDriver driver)throws Exception {
        this.clickMeIcon();
//        this.clickMegClose();
        this.swipeToMyTag(driver);
        this.clickMyTag();
        if(!this.getTitle().equals("我的标签")){
            Assert.fail("未能进入“我的标签”页面");
        }
        this.clickMatch();
        if(!this.getTitle().equals("匹配问答")){
            Assert.fail("在“我的标签”页，点击“匹配问答”，未能进入“匹配问答”页面");
        }
    }

    public void checkWomen(AndroidDriver driver) throws Exception{
        this.clickBtnWomen();
        this.clickBtnOK();
        Thread.sleep(10000);
        this.keyBack(driver);
        Thread.sleep(5000);
        this.keyBack(driver);
        Thread.sleep(5000);
        this.keyBack(driver);
        Thread.sleep(5000);
        this.keyBack(driver);
        this.clickMeIcon();
        if(this.doesWebElementExist(membercenter)){
            Assert.fail("女用户登录，有“会员中心”");
        }
//        if(this.doesWebElementExist(new_thing)){
//            Assert.fail("女用户登录，有“领取话费”");
//        }
    }


}
