package com.LBS.pagecheck;

import com.listener.ExtentTestNGITestListener;
import com.LBS.pagemethod.SearchMethod;
import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;

public class SearchCheck extends SearchMethod {
    ExtentTestNGITestListener el = new ExtentTestNGITestListener();
    ExtentTest log=el.getlog();

    String area;
    String age;
    String height;
//    public void checkTitle(){
//        search_icon.click();
//        System.out.println(this.getListArea());
//    }

    public void initCheck(){
        this.clickSearchIcon();
        if(!this.getTopView().equals("搜索")){
            Assert.fail("未进入“搜索”模块");
        }else {
            log.info("成功进入“搜索”模块");
        }
        this.clickSearchBtn();
        if(this.getTitleName().equals("征友条件")){
            log.info("成功进入搜索条件");
        }else {
            Assert.fail("未进入 搜索条件 页");
        }

        area=this.getAreaText();
        if (area.equals("不限制")|| area.equals("不限")){
            log.info("所在地 初始条件正确");
        }else{
            Assert.fail("所在地 初始条件 错误");
        }
        age=this.getAgeText();
        if(age.equals("不限制")|| age.equals("不限")){
            log.info("年龄初始条件正确");
        }else {
            Assert.fail("年龄初始条件错误");
        }
        height=this.getHeightText();
        if(height.equals("不限制")||height.equals("不限")){
            log.info("身高初始条件正确");
        }else {
            Assert.fail("身高初始条件错误");
        }
    }

    public void checkArea() throws Exception{
        this.clickSearchIcon();
        this.clickSearchBtn();
        this.clickArea();
        this.clickAreadown();
        this.clickOKBtn();
        area=this.getAreaText();
        this.clickSaveBtn();
        for (int i=0;i<list_area.size();i++){
            if(!list_area.get(i).getText().equals(area)){
                Assert.fail("结果列表中，出现不符合条件的城市信息");
            }
        }
    }

    public void checkAge()throws Exception{
        this.clickSearchIcon();
        this.clickSearchBtn();
        this.clickAge();
        this.clickBeginAgedown();
        this.clickOKBtn();
        age=this.getAgeText();
        this.clickSaveBtn();
        for (int i=0;i<list_age.size();i++){
            if(!list_age.get(i).getText().equals(age)){
                Assert.fail("结果列表中，出现不符合条件的年龄信息");
            }
        }
    }

    public void checkHeight()throws Exception{
        this.clickSearchIcon();
        this.clickSearchBtn();
        this.clickHeight();
        this.clickBeginHeightdown();
        this.clickOKBtn();
        height=this.getHeightText();
        this.clickSaveBtn();
        for (int i=0;i<list_height.size();i++){
            if(!list_height.get(i).getText().equals(height)){
                Assert.fail("结果列表中，出现不符合条件的身高信息");
            }
        }
    }

    public void checkAll() throws Exception{
        this.clickSearchIcon();
        this.clickSearchBtn();
        this.clickArea();
        this.clickAreadown();
        this.clickOKBtn();
        this.clickAge();
        this.clickBeginAgedown();
        this.clickOKBtn();
        this.clickHeight();
        this.clickBeginHeightdown();
        this.clickOKBtn();
        this.clickSaveBtn();
        if(hello_btn.size()<1){
            Assert.fail("多条件选择后，没有推荐结果");
        }
    }

    public void checkHello()throws Exception{
        this.clickSearchIcon();
        this.clickHello(0);
        String name = this.getNickNmae(0);
        this.clickPhoto(0);
        this.clickTabs();
        this.clickUsername();
        if (this.doesWebElementExist(ask_button)) {
            Assert.fail("在列表上点击“打招呼后”，进入空间页中，出现“打招呼”按钮");
        } else {
            log.info("空间页中无“打招呼”按钮");
        }
        if (!name.equals(this.getName1_1())){
            Assert.fail("点击头像进入空间后，用户姓名不一致");
        }
    }


}
