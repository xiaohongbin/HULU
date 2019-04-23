package com.xydht.check;

import com.aventstack.extentreports.ExtentTest;
import com.listener.ExtentTestNGITestListener;
import com.listener.WriteUserID;
import com.xydht.method.ElementMethod01;
import org.testng.Assert;

public class XYDHTCheck01 extends ElementMethod01 {
    ExtentTestNGITestListener el = new ExtentTestNGITestListener();
    ExtentTest log = el.getlog();
    WriteUserID wui=new WriteUserID();
//    PageElement pe = new PageElement();
//    ElementsMethod em = new ElementsMethod(this.driver);
//    ElementsMethod em = PageFactory.initElements( driver, ElementsMethod.class);

    public void protocol() throws Exception {
        this.clickProtocol();
        if (!this.getTitleName().equals("注册协议")) {
            Assert.fail("点击注册页面下方“使用协议”，未进入注册协议页面");
        }
        this.clickBtnLeft();
        if (!this.doesWebElementExist(this.btn_men)) {
            Assert.fail("点击注册协议页面左上角返回，未返回注册界面");
        }
    }


}
