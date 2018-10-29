package com.LBS.pagecheck;

import com.LBS.pagemethod.MailBoxMethod;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MailBoxCheck extends MailBoxMethod {



    public void checkMailNum()throws Exception{
        int letter_beforenum;
//        int letter_afternum;
        int mailbox_beforenum;
//        int mailbox_afternum;
        this.clickMailboxIcon();
        letter_beforenum=this.getLetterNum();
        mailbox_beforenum=this.getMailboxNum();
        if(letter_beforenum!=1||mailbox_beforenum!=1){
            Assert.fail("存在未读邮件时，‘私信’与‘信箱’显示不一致");
        }
        this.clickLook();
        this.clickLeftBtn();
        Thread.sleep(5000);
        if(this.doesWebElementExist(letter_num)){
            Assert.fail("读取邮件后，上方未读标示未消失");
        }
        if(this.doesWebElementExist(mailbox_num)){
            Assert.fail("读取邮件后，下方未读标示未消失");
        }
    }

    public void checkSayhi(){
        this.clickSayHello();
    }

    public void checkPersonalData(){
        this.clickMailboxIcon();
        this.clickPersonalData();
        if(!this.getTitleName().equals("完善信息")){
            Assert.fail("点击“完善资料”，未进入“完善信息”页");
        }
    }


    public void checkMailboxwomen(AndroidDriver driver) throws  Exception{
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
        this.clickMailboxIcon();
        if(!this.getTitleName().equals("缘分小助手")){
            Assert.fail("未进入 缘分小助手页面");
        }
        this.clickOK();
        if(!this.getTitleName().equals("信箱")){
            Assert.fail("开启助手后，未进入 信箱页");
        }
        this.clickSearchIcon();
        this.clickMailboxIcon();
        if(!this.getTitleName().equals("信箱")){
            Assert.fail("退出信箱后，重新点击“信箱”，未进入 信箱页");
        }
    }

}
