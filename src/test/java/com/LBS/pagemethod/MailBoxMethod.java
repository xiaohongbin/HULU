package com.LBS.pagemethod;

import com.listener.ExtentTestNGITestListener;
import com.LBS.page.MailBoxPage;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class MailBoxMethod extends MailBoxPage {

    ExtentTestNGITestListener el = new ExtentTestNGITestListener();
    ExtentTest log=el.getlog();

    public int getMailboxNum(){
        log.info("获取 信箱 未读条数");
        return Integer.parseInt(mailbox_num.getText());
    }

    public int getLetterNum(){
        log.info("获取 私信 未读条数");
        return Integer.parseInt(letter_num.getText());
    }

    public void clickMailboxIcon(){
        log.info("点击下方“信箱”图标");
        mailbox_icon.click();
    }

    public void clickNotice(){
        notice.click();
    }

    public void clickContact(){
        contact.click();
    }

    public void clickPersonalData(){
        personal_data.click();
    }

    public String getTitleName(){
        return title_name.getText();
    }

    public void clickLeftBtn(){
        log.info("点击 回退");
        btn_left.click();
    }

    public void clickLook(){
        log.info("点击“立即查看”");
        img_look.click();
    }

    public void clickSayHello(){
        log.info("点击“打招呼”");
        for(int i=0;i<sayhello.size();i++){
            sayhello.get(i).click();
        }
    }


    public boolean doesWebElementExist(WebElement webElement)
    {
        try {
            return webElement.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void clickBtnWomen(){
        btn_women.click();
    }

    public void clickBtnOK(){
//        log.info("点击“确认”");
        btn_ok.click();
    }

    public void clickOK(){
        ok.click();
    }


    public void keyBack(AndroidDriver driver){
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }

    public void clickSearchIcon(){
        log.info("点击下方“搜索”ICON");
        search_icon.click();
    }

}
