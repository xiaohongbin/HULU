package com.LBS.pagemethod;

import com.listener.ExtentTestNGITestListener;
import com.LBS.page.SearchPage;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class SearchMethod extends SearchPage {
    ExtentTestNGITestListener el = new ExtentTestNGITestListener();
    ExtentTest log=el.getlog();

    public List<String> getListArea(){
        List area=new ArrayList();
        for(int i=0; i<list_area.size();i++){
            area.add(list_area.get(i).getText());
        }
        return area;
    }

    public String getTopView(){
        log.info("获取topview");
        return topview.getText();
    }

    public String getTitleName(){
        log.info("获取Titlename");
        return  titlename.getText();
    }

    public void clickSearchBtn(){
        log.info("点击右上角 搜索");
        search_right_button.click();
    }

    public String getAreaText(){
        log.info("获取 所在地 条件");
        return area_text.getText();
    }

    public String getAgeText(){
        log.info("获取 年龄 条件");
        return  age_text.getText();
    }

    public String getHeightText(){
        log.info("获取 身高 条件");
        return  height_text.getText();
    }

    public void clickSearchIcon(){
        log.info("点击下方“搜索”ICON");
        search_icon.click();
    }

    public void clickArea(){
        log.info("点击“所在地”一行");
        area.click();
    }

    public void clickAreadown()throws Exception{
        Thread.sleep(1000);
        log.info("选择“上海”");
        area_down.click();
        Thread.sleep(1000);
        area_down.click();
    }

    public void clickOKBtn(){
        log.info("点击“确定”");
        btn_ok.click();
    }

    public void clickSaveBtn(){
        log.info("点击“保存”");
        save_btn.click();
    }


    public void clickAge(){
        log.info("点击“年龄”一行");
        age.click();
    }

    public void clickBeginAgedown()throws Exception{
        Thread.sleep(500);
        log.info("选择23岁");
        for (int i=0; i<6;i++){
            begin_age_down.click();
            Thread.sleep(1000);
        }
    }

    public void clickHeight(){
        log.info("点击“身高”一行");
        height.click();
    }

    public void clickBeginHeightdown()throws Exception{
        Thread.sleep(500);
        log.info("选择身高");
        for (int i=0; i<12;i++){
            begin_height_down.click();
        }
    }

//    通用判断元素是否存在
    public boolean doesWebElementExist(WebElement webElement)
    {
        try {
            return webElement.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public  void swipeToDown(AndroidDriver driver) {
        Duration duration=Duration.ofSeconds(1);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
//        System.out.println(width);
//        System.out.println(height);
        TouchAction action1 = new TouchAction(driver).press(width / 2,height/4).waitAction(duration).moveTo(width /2, height* 3/4).release();
        action1.perform();

//        Duration duration1=Duration.ofSeconds(6);
//        action1.longPress(1,2,duration1).perform();
    }



    public void clickMegClose(){
        if (this.doesWebElementExist(msg_close)) {
            log.info("点击 关闭上方“信息通知”");
            msg_close.click();
        }else{
            log.info("当前无“信息通知”");
        }
    }


    public void clickPhoto(int i){
        log.info("点击第"+(i+1)+"个用户头像");
        img.get(i).click();
    }

    public void clickHello(int i){
        log.info("点击第"+(i+1)+"个用户打招呼");
        hello_btn.get(i).click();
    }

//    获取 空间页 用户姓名
    public String getName1_1(){
        log.info("获取 空间页 用户姓名");
        return name1_1.getText();
    }
//获取用户 姓名
    public String getNickNmae(int i){
        log.info("点击第"+(i+1)+"个用户姓名");
        return nickname.get(i).getText();
    }

    //    点击 空间中 下一位按钮
    public void clickNext(){
        log.info("点击 空间中 下一位按钮");
        next_button.click();
    }

    //    点击 空间中 左上角回退 按钮
    public void clickLeftBtn(){
        log.info("点击 空间中 左上角回退 按钮");
        left_btn.click();
    }

    //    点击空间中“打招呼”按钮
    public void clickAskBtn(){
        log.info("点击空间中“打招呼”按钮");
        ask_button.click();
    }

    public void clickTabs(){
        log.info("点击页面下部");
        tabs.click();
    }

    public void clickUsername(){
        log.info("点击“姓名”");
        user_name_text.click();
    }
}
