package com.hulu.check;


import com.aventstack.extentreports.ExtentTest;
import com.hulu.method.ElementsMethod;
import com.listener.ExtentTestNGITestListener;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class publicCheck extends ElementsMethod {
    ExtentTestNGITestListener el = new ExtentTestNGITestListener();
    ExtentTest log = el.getlog();

    //    一三线男 会员中心可以购买项
    public void judgeVipCenter() throws Exception {
        log.info("判断是否进会员中心");
        if (!this.getTitleName().equals("会员中心")) {
            Assert.fail("未进入会员中心页面");
        }
        log.info("判断是否有 豆币购买服务");
        if (!this.doesWebElementExist(bean)) {
            Assert.fail("豆币一项不存在");
        }
        log.info("判断是否有 写信包月服务");
        if (!this.doesWebElementExist(write_letters)) {
            Assert.fail("写信包月一项不存在");
        }
        log.info("判断是否有 星级服务");
        if (!this.doesWebElementExist(vip_title)) {
            Assert.fail("星级服务一项不存在");
        }
        log.info("判断是否有 收信宝服务");
        if (!this.doesWebElementExist(receive_letter)) {
            Assert.fail("收信宝一项不存在");
        }
    }

    //一三线男判断会员中心豆币，
    public void judgeBean(AndroidDriver driver, WebElement ePrice,WebElement fPrice,int num) throws Exception {
        this.waitElement(driver, title_name);
        this.clickReload();
        if(num == 3) {  //3线
            if (!this.doesWebElementExist(bean_vip)) {
                Assert.fail("3天vip0元购不存在");
            }
        }else{//1线
            if (this.doesWebElementExist(bean_vip)) {
                Assert.fail("3天vip0元购存在");
            }
        }
        if (!this.doesWebElementExist(bean800)) {
            Assert.fail("800语音豆不存在");
        }
        if (!this.getBeanPrice(ePrice).contains("￥99")) {
            Assert.fail("800语音豆价格有误");
        }
        log.info("判断550豆币及价格");
        if (!this.doesWebElementExist(bean550)) {
            Assert.fail("550语音豆不存在");
        }
        if (!this.getBeanPrice(fPrice).contains("￥89")) {
            Assert.fail("550语音豆价格有误");
        }
    }

    //1线男，会员中心 豆币报价
    public void judgeBeanPrice1(AndroidDriver driver) throws Exception {
        System.out.println("调用publicCheck类的judgeBeanPrice1公共方法");
        this.waitElement(driver, title_name);
        this.clickBean800();
        this.waitElement(driver, title_name);
        log.info("判断800豆币，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("800豆币，支付宝无自动续费");
        }
        this.clickXufei();
        if (!this.doesWebElementExist(youhuijiage800)) {
            Assert.fail("800豆币，支付宝勾选 自动续费，不为优惠后价格");
        }
        this.clickXufei();
        log.info("判断800豆币，支付宝取消 自动续费后，恢复为原价");
        if (!this.doesWebElementExist(yuanjia800)) {
            Assert.fail("800豆币，支付宝取消 自动续费后，不为原价");
        }
        this.clickKaiTong();
        log.info("判断800豆币，支付宝调起");
//        this.waitElement(driver, alisure);
        System.out.println("this.getCurrentActivity(driver):"+this.getCurrentActivity(driver));
        if (this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            log.info("800豆币启动支付宝");
        }else if(this.getCurrentActivity(driver).toLowerCase().contains("aliuserguideactivity")){
            log.info("800豆币启动支付宝");
        }else{
            Assert.fail("800豆币未启动支付宝");

        }
        //支付宝登陆状态
        Thread.sleep(4000);
        if(this.doesWebElementExist(alisure)){
            this.clickAlipayBack();
            this.clickEnsure();
            this.waitElement(driver, alipay);
        }
        this.keyBack(driver);
        Thread.sleep(3000);
        if(doesWebElementExist(cancel)){
            new TouchAction(driver).tap(400,750).perform();
            this.keyBack(driver);
        }
        if(!this.doesWebElementExist(wecharpay)){
            this.keyBack(driver);
        }
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("800豆币，微信支付 存在自动续费 选项");
        }
//        Thread.sleep(5000);
        this.clickKaiTong();
        Thread.sleep(5000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("800豆币未启动微信");
        }
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        this.clickReload();
        //        2018年8月23版本变更
//        this.clickQueRen();
//        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断800豆币，银联支付是否默认 价格优惠10元");
//        if(!this.doesWebElementExist(xufei)){
//            Assert.fail("800豆币，银联支付无自动续费");
//        }
        if (this.doesWebElementExist(youhuijiage800)) {
            Assert.fail("800豆币，银联支付默认 为优惠后价格");
        }
        this.clickBtnLeft();
        this.clickReload();
        this.clickBean550();
        this.waitElement(driver, title_name);
        log.info("判断550豆币，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("550豆币，支付宝无自动续费");
        }
        this.clickXufei();
        if (!this.doesWebElementExist(youhuijiage550)) {
            Assert.fail("550豆币，支付宝 默认勾选 自动续费，不为优惠后价格");
        }
        this.clickXufei();
        log.info("判断550豆币，支付宝取消 自动续费后，恢复为原价");
        if (!this.doesWebElementExist(yuanjia550)) {
            Assert.fail("550豆币，支付宝 取消 自动续费后，不为原价");
        }
        this.clickKaiTong();
        log.info("判断550豆币，支付宝调起");
//        this.waitElement(driver, alisure);
        System.out.println("this.getCurrentActivity(driver):"+this.getCurrentActivity(driver));
        if (this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
//            System.out.println(this.getCurrentActivity(driver));
            log.info("550豆币启动支付宝");
        }else if(this.getCurrentActivity(driver).toLowerCase().contains("aliuserguideactivity")){
            log.info("550豆币启动支付宝");
        }else{
            Assert.fail("550豆币未启动支付宝");

        }
        //支付宝登陆状态
        Thread.sleep(4000);
        if(this.doesWebElementExist(alisure)){
            this.clickAlipayBack();
            this.clickEnsure();
            this.waitElement(driver, alipay);
        }
        this.keyBack(driver);
        Thread.sleep(3000);
        if(doesWebElementExist(cancel)){
            new TouchAction(driver).tap(400,750).perform();
            this.keyBack(driver);
        }
        if(!this.doesWebElementExist(wecharpay)){
            this.keyBack(driver);
        }
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("550豆币，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("550豆币未启动微信");
        }
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        this.clickReload();
        //        2018年8月23版本变更
//        this.clickQueRen();
//        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断550豆币，银联支付是否默认价格优惠10元");
        if (this.doesWebElementExist(youhuijiage550)) {
            Assert.fail("550豆币，银联支付 默认为优惠后价格");
        }
        log.info("豆币购买测试成功");
    }

    //   3线男， 会员中心  豆币报价
    public void judgeBeanPrice3(AndroidDriver driver) throws Exception {
        System.out.println("调用publicCheck类的judgeBeanPrice3公共方法");
        this.waitElement(driver, title_name);
        this.clickBean800();
        this.waitElement(driver, title_name);
        log.info("判断800豆币，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("800豆币，支付宝默认有自动续费");
        }
        if (!this.doesWebElementExist(youhuijiage800)) {
            Assert.fail("800豆币，支付宝默认无自动续费选项，不为优惠后价格");
        }
       /* this.clickXufei();
        log.info("判断800豆币，支付宝取消 自动续费后，恢复为原价");
        if (!this.doesWebElementExist(yuanjia800)) {
            Assert.fail("800豆币，支付宝取消 自动续费后，不为原价");
        }*/
        this.clickKaiTong();
        log.info("判断800豆币，支付宝调起");
//        this.waitElement(driver, alisure);
        System.out.println("this.getCurrentActivity(driver):"+this.getCurrentActivity(driver));
        if (this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            log.info("800豆币启动支付宝");
        }else if(this.getCurrentActivity(driver).toLowerCase().contains("aliuserguideactivity")){
            log.info("800豆币启动支付宝");
        }else{
            Assert.fail("800豆币未启动支付宝");

        }
        //支付宝登陆状态
        Thread.sleep(4000);
        if(this.doesWebElementExist(alisure)){
            this.clickAlipayBack();
            this.clickEnsure();
            this.waitElement(driver, alipay);
        }

        this.keyBack(driver);
        Thread.sleep(3000);
        if(doesWebElementExist(cancel)){
            new TouchAction(driver).tap(400,750).perform();
            this.keyBack(driver);
        }
        if(!this.doesWebElementExist(wecharpay)){
            this.keyBack(driver);
        }

        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("800豆币，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        log.info("判断800豆币，微信调起");
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
//            System.out.println(this.getCurrentActivity(driver));
            Assert.fail("800豆币未启动微信");
        }
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        this.clickReload();
        //        2018年8月23版本变更
//        this.clickQueRen();
//        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断800豆币，银联支付是否默认 价格优惠10元");

        if (!this.doesWebElementExist(youhuijiage800)) {
            Assert.fail("800豆币，银联支付默认 不为优惠后价格");
        }else
            log.info("800豆币，银联支付默认为优惠后价格");

        this.clickBtnLeft();
        this.clickReload();
        this.clickBean550();
        this.waitElement(driver, title_name);
        log.info("判断550豆币，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("550豆币，支付宝默认有自动续费");
        }
        if (!this.doesWebElementExist(youhuijiage550)) {
            Assert.fail("550豆币，支付宝 默认无自动续费选项，不为优惠后价格");
        }
       /* this.clickXufei();
        log.info("判断550豆币，支付宝取消 自动续费后，恢复为原价");
        if (!this.doesWebElementExist(yuanjia550)) {
            Assert.fail("550豆币，支付宝 取消 自动续费后，不为原价");
        }*/
        this.clickKaiTong();
        log.info("判断550豆币，支付宝调起");
//        this.waitElement(driver, alisure);
        System.out.println("this.getCurrentActivity(driver):"+this.getCurrentActivity(driver));
        if (this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            log.info("550豆币启动支付宝");
        }else if(this.getCurrentActivity(driver).toLowerCase().contains("aliuserguideactivity")){
            log.info("550豆币启动支付宝");
        }else{
            Assert.fail("550豆币未启动支付宝");

        }
        //支付宝登陆状态
        Thread.sleep(4000);
        if(this.doesWebElementExist(alisure)){
            this.clickAlipayBack();
            this.clickEnsure();
            this.waitElement(driver, alipay);
        }

        this.keyBack(driver);
        Thread.sleep(3000);
        if(doesWebElementExist(cancel)){
            new TouchAction(driver).tap(400,750).perform();
            this.keyBack(driver);
        }
        if(!this.doesWebElementExist(wecharpay)){
            this.keyBack(driver);
        }
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("550豆币，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        log.info("判断550豆币，微信调起");
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("550豆币未启动微信");
        }
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        this.clickReload();
        //        2018年8月23版本变更
//        this.clickQueRen();
//        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断550豆币，银联支付是否默认价格优惠10元");
        if (!this.doesWebElementExist(youhuijiage550)) {
            Assert.fail("550豆币，银联支付 默认不为优惠后价格");
        }
        log.info("豆币购买测试成功");

    }
    //一三线男判断会员中心写信包月，
    public void judgeLetter(AndroidDriver driver, WebElement nPrice,WebElement tPrice,WebElement sPrice,int num) throws Exception {
        this.waitElement(driver, title_name);
        this.clickReload();
        this.waitElement(driver, title_name);
        if(num == 1) {
            if (this.doesWebElementExist(letter_vip)) {
                Assert.fail("写信包月存在0元签约");
            }
        }else{
            if (!this.doesWebElementExist(letter_vip)) {
                Assert.fail("写信包月不存在0元签约");
            }
        }
        if (!this.doesWebElementExist(letter90)) {
            Assert.fail("写信包月，90天畅聊不存在");
        }
        if (!this.getLetterPrice(nPrice).contains("￥109")) {
            Assert.fail("写信包月，90天畅聊价格有误");
        }
        if (!this.doesWebElementExist(letter30)) {
            Assert.fail("写信包月，30天畅聊不存在");
        }
        if (!this.getLetterPrice(tPrice).contains("￥89")) {
            Assert.fail("写信包月，30天畅聊价格有误");
        }
        if (!this.doesWebElementExist(letter7)) {
            Assert.fail("写信包月，天畅聊不存在");
        }
        if (!this.getLetterPrice(sPrice).contains("￥69")) {
            Assert.fail("写信包月，7天畅聊价格有误");
        }
    }
    //    1线男， 会员中心  写信包月报价
    public void judgeLetterPrice1(AndroidDriver driver) throws Exception {
        this.waitElement(driver, title_name);
        this.clickLetter90();
        this.waitElement(driver, title_name);
        log.info("判断写信包月90天，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("一线男，写信包月90天，支付宝无自动续费");
        }
        this.clickXufei();
        if (!this.doesWebElementExist(youhuijiage90)) {
            Assert.fail("一线男，写信包月90天，支付宝勾选 自动续费，不为优惠后价格");
        }
        this.clickXufei();
        log.info("判断写信包月90天，支付宝取消 自动续费后，恢复为原价");
        if (!this.doesWebElementExist(yuanjia90)) {
            Assert.fail("写信包月90天，支付宝取消 自动续费后，不为原价");
        }
        this.clickKaiTong();
        log.info("判断写信包月90天，支付宝调起");
//        this.waitElement(driver, alisure);
        System.out.println("this.getCurrentActivity(driver):"+this.getCurrentActivity(driver));
        if (this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            log.info("90天畅聊启动支付宝");
        }else if(this.getCurrentActivity(driver).toLowerCase().contains("aliuserguideactivity")){
            log.info("90天畅聊启动支付宝");
        }else{
            Assert.fail("90天畅聊未启动支付宝");

        }
        //支付宝登陆状态
        Thread.sleep(4000);
        if(this.doesWebElementExist(alisure)){
            this.clickAlipayBack();
            this.clickEnsure();
            this.waitElement(driver, alipay);
        }
        this.keyBack(driver);
        Thread.sleep(3000);
        if(doesWebElementExist(cancel)){
            new TouchAction(driver).tap(400,750).perform();
            this.keyBack(driver);
        }
        if(!this.doesWebElementExist(wecharpay)){
            this.keyBack(driver);
        }
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("写信包月90天，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("90天畅聊未启动微信");
        }
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        this.clickReload();
        //        2018年8月23版本变更
//        this.clickQueRen();
//        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断写信包月90天，银联支付是否默认价格优惠10元");
        if (this.doesWebElementExist(youhuijiage90)) {
            Assert.fail("写信包月90天，银联支付默认为优惠后价格");
        }

        this.clickBtnLeft();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.waitElement(driver, title_name);
        this.clickLetter30();
        this.waitElement(driver, title_name);
        log.info("判断写信包月30天，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("写信包月30天，支付宝无自动续费");
        }
        this.clickXufei();
        if (!this.doesWebElementExist(youhuijiage30)) {
            Assert.fail("写信包月30天，支付宝勾选 自动续费，不为优惠后价格");
        }
        this.clickXufei();
        log.info("判断写信包月30天，支付宝 取消 自动续费，是否恢复原价");
        if (!this.doesWebElementExist(yuanjia30)) {
            Assert.fail("写信包月30天，支付宝取消 自动续费后，不为原价");
        }
        this.clickKaiTong();
        log.info("判断写信包月30天，支付宝调起");
//        this.waitElement(driver, alisure);
        System.out.println("this.getCurrentActivity(driver):"+this.getCurrentActivity(driver));
        if (this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            log.info("30天畅聊启动支付宝");
        }else if(this.getCurrentActivity(driver).toLowerCase().contains("aliuserguideactivity")){
            log.info("30天畅聊启动支付宝");
        }else{
            Assert.fail("30天畅聊未启动支付宝");
        }
        //支付宝登陆状态
        Thread.sleep(4000);
        if(this.doesWebElementExist(alisure)){
            this.clickAlipayBack();
            this.clickEnsure();
            this.waitElement(driver, alipay);
        }
        this.keyBack(driver);
        Thread.sleep(3000);
        if(doesWebElementExist(cancel)){
            new TouchAction(driver).tap(400,750).perform();
            this.keyBack(driver);
        }
        if(!this.doesWebElementExist(wecharpay)){
            this.keyBack(driver);
        }
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("写信包月30天，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("30天畅聊未启动微信");
        }
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        this.clickReload();
        //        2018年8月23版本变更
//        this.clickQueRen();
//        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断写信包月30天，银联支付是否默认价格优惠10元");

        if (this.doesWebElementExist(youhuijiage30)) {
            Assert.fail("写信包月30天，银联支付默认为优惠后价格");
        }

        this.clickBtnLeft();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickLetter7();
        this.waitElement(driver, title_name);
        log.info("判断写信包月7天，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("写信包月7天，支付宝无自动续费");
        }
        this.clickXufei();
        if (!this.doesWebElementExist(youhuijiage7)) {
            Assert.fail("写信包月7天，支付宝勾选 自动续费，不为优惠后价格");
        }
        this.clickXufei();
        log.info("判断写信包月7天，支付宝取消 自动续费，恢复原价");
        if (!this.doesWebElementExist(yuanjia7)) {
            Assert.fail("写信包月7天，支付宝取消 自动续费后，不为原价");
        }
        this.clickKaiTong();
        log.info("判断写信包月7天，支付宝调起");
//        this.waitElement(driver, alisure);
        System.out.println("this.getCurrentActivity(driver):"+this.getCurrentActivity(driver));
        if (this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            log.info("7天畅聊启动支付宝");
        }else if(this.getCurrentActivity(driver).toLowerCase().contains("aliuserguideactivity")){
            log.info("7天畅聊启动支付宝");
        }else{
            Assert.fail("7天畅聊未启动支付宝");

        }
        //支付宝登陆状态
        Thread.sleep(4000);
        if(this.doesWebElementExist(alisure)){
            this.clickAlipayBack();
            this.clickEnsure();
            this.waitElement(driver, alipay);
        }
        this.keyBack(driver);
        Thread.sleep(3000);
        if(doesWebElementExist(cancel)){
            new TouchAction(driver).tap(400,750).perform();
            this.keyBack(driver);
        }
        if(!this.doesWebElementExist(wecharpay)){
            this.keyBack(driver);
        }
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("写信包月7天，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("7天畅聊未启动微信");
        }
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        this.clickReload();
        //        2018年8月23版本变更
//        this.clickQueRen();
//        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断写信包月7天，银联支付是否默认勾价格优惠10元");

        if (this.doesWebElementExist(youhuijiage7)) {
            Assert.fail("写信包月7天，银联支付默认为优惠后价格");
        }
    }

    //   3线男， 会员中心  写信包月报价
    public void judgeLetterPrice3(AndroidDriver driver) throws Exception {
        this.waitElement(driver, title_name);
        this.clickLetter90();
        this.waitElement(driver, title_name);
        log.info("判断写信包月90天，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("写信包月90天，支付宝默认有自动续费");
        }
        if (!this.doesWebElementExist(youhuijiage90)) {
            Assert.fail("写信包月90天，支付宝默认无自动续费选项，不为优惠后价格");
        }
       /* this.clickXufei();
        log.info("判断写信包月90天，支付宝取消 自动续费后，恢复为原价");
        if (!this.doesWebElementExist(yuanjia90)) {
            Assert.fail("写信包月90天，支付宝取消 自动续费后，不为原价");
        }*/
        this.clickKaiTong();
        log.info("判断写信包月90天，支付宝调起");
//        this.waitElement(driver, alisure);
        System.out.println("this.getCurrentActivity(driver):"+this.getCurrentActivity(driver));
        if (this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            log.info("90天畅聊启动支付宝");
        }else if(this.getCurrentActivity(driver).toLowerCase().contains("aliuserguideactivity")){
            log.info("90天畅聊启动支付宝");
        }else{
            Assert.fail("90天畅聊未启动支付宝");

        }
        //支付宝登陆状态
        Thread.sleep(4000);
        if(this.doesWebElementExist(alisure)){
            this.clickAlipayBack();
            this.clickEnsure();
            this.waitElement(driver, alipay);
        }
        Thread.sleep(3000);
        this.keyBack(driver);

        if(doesWebElementExist(cancel)){
            new TouchAction(driver).tap(400,750).perform();
            this.keyBack(driver);
        }
        if(!this.doesWebElementExist(wecharpay)){
            this.keyBack(driver);
        }

        if(!this.doesWebElementExist(wecharpay)){
            Thread.sleep(3000);
            this.clickLetter90();
        }
//        this.waitElement(driver, title_name);
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("写信包月90天，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(8000);
        log.info("判断写信包月90天，微信调起");
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("90天畅聊未启动微信");
        }
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        this.clickReload();
        //        2018年8月23版本变更
//        this.clickQueRen();
//        this.waitElement(driver, title_name);
        if(!this.doesWebElementExist(wecharpay)){
            Thread.sleep(3000);
            this.clickLetter90();
            this.clickReload();
        }
        this.clickYinlianPay();
        log.info("判断写信包月90天，银联支付是否默认价格优惠10元");
//        if(!this.doesWebElementExist(xufei)){
//            Assert.fail("写信包月90天，银联支付无自动续费");
//        }
        if (!this.doesWebElementExist(youhuijiage90)) {
            Assert.fail("写信包月90天，银联支付默认不为优惠后价格");
        }

        this.clickBtnLeft();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.waitElement(driver, title_name);
        this.clickLetter30();
        this.waitElement(driver, title_name);
        log.info("判断写信包月30天，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("写信包月30天，支付宝默认有自动续费");
        }
        if (!this.doesWebElementExist(youhuijiage30)) {
            Assert.fail("写信包月30天，支付宝默认无自动续费选项，不为优惠后价格");
        }
        /*this.clickXufei();
        log.info("判断写信包月30天，支付宝 取消 自动续费，是否恢复原价");
        if (!this.doesWebElementExist(yuanjia30)) {
            Assert.fail("写信包月30天，支付宝取消 自动续费后，不为原价");
        }*/
        this.clickKaiTong();
//        Thread.sleep(5000);
        log.info("判断写信包月30天，支付宝调起");
//        this.waitElement(driver, alisure);
        System.out.println("this.getCurrentActivity(driver):"+this.getCurrentActivity(driver));
        if (this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            log.info("30天畅聊启动支付宝");
        }else if(this.getCurrentActivity(driver).toLowerCase().contains("aliuserguideactivity")){
            log.info("30天畅聊启动支付宝");
        }else{
            Assert.fail("30天畅聊未启动支付宝");
        }
        //支付宝登陆状态
        Thread.sleep(4000);
        if(this.doesWebElementExist(alisure)){
            this.clickAlipayBack();
            this.clickEnsure();
            this.waitElement(driver, alipay);
        }
        this.keyBack(driver);
        Thread.sleep(3000);
        if(doesWebElementExist(cancel)){
            new TouchAction(driver).tap(400,750).perform();
            this.keyBack(driver);
        }
        if(!this.doesWebElementExist(wecharpay)){
            this.keyBack(driver);
        }
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("写信包月30天，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        log.info("判断写信包月30天，微信调起");
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("30天畅聊未启动微信");
        }
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        this.clickReload();
        //        2018年8月23版本变更
//        this.clickQueRen();
//        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断写信包月30天，银联支付是否默认价格优惠10元");
//        if(!this.doesWebElementExist(xufei)){
//            Assert.fail("写信包月30天，银联支付无自动续费");
//        }
        if (!this.doesWebElementExist(youhuijiage30)) {
            Assert.fail("写信包月30天，银联支付默认不为优惠后价格");
        }

        this.clickBtnLeft();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickLetter7();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.waitElement(driver, title_name);
        log.info("判断写信包月7天，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("写信包月7天，支付宝默认有自动续费");
        }
        if (!this.doesWebElementExist(youhuijiage7)) {
            Assert.fail("写信包月7天，支付宝默认无自动续费选项，不为优惠后价格");
        }
        /*this.clickXufei();
        log.info("判断写信包月7天，支付宝取消 自动续费，恢复原价");
        if (!this.doesWebElementExist(yuanjia7)) {
            Assert.fail("写信包月7天，支付宝取消 自动续费后，不为原价");
        }*/
        this.clickKaiTong();
//        Thread.sleep(5000);
        log.info("判断写信包月7天，支付宝调起");
//        this.waitElement(driver, alisure);
        System.out.println("this.getCurrentActivity(driver):"+this.getCurrentActivity(driver));
        if (this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            log.info("7天畅聊启动支付宝");
        }else if(this.getCurrentActivity(driver).toLowerCase().contains("aliuserguideactivity")){
            log.info("7天畅聊启动支付宝");
        }else{
            Assert.fail("7天畅聊未启动支付宝");

        }
        //支付宝登陆状态
        Thread.sleep(4000);
        if(this.doesWebElementExist(alisure)){
            this.clickAlipayBack();
            this.clickEnsure();
            this.waitElement(driver, alipay);
        }
        this.keyBack(driver);
        Thread.sleep(3000);
        if(doesWebElementExist(cancel)){
            new TouchAction(driver).tap(400,750).perform();
            this.keyBack(driver);
        }
        if(!this.doesWebElementExist(wecharpay)){
            this.keyBack(driver);
        }
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("写信包月7天，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        log.info("判断写信包月7天，微信调起");
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("7天畅聊未启动微信");
        }
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        this.clickReload();
        //        2018年8月23版本变更
//        this.clickQueRen();
//        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断写信包月7天，银联支付是否默认勾价格优惠10元");
//        if(!this.doesWebElementExist(xufei)){
//            Assert.fail("写信包月7天，银联支付无自动续费");
//        }
        if (!this.doesWebElementExist(youhuijiage7)) {
            Assert.fail("写信包月7天，银联支付默认不为优惠后价格");
        }

    }

    //一三线男判断会员中心星级服务，
    public void judgeVip(AndroidDriver driver, WebElement nPrice,WebElement tPrice,int num) throws Exception {
        this.waitElement(driver, title_name);
        this.clickReload();
        this.waitElement(driver, title_name);
        log.info("判断皇冠特权中 0元签约");
        if(num == 1) {
            if (this.doesWebElementExist(newvip)) {
                Assert.fail("皇冠特权中存在0元签约");
            }
        }else{
            if (!this.doesWebElementExist(newvip)) {
                Assert.fail("皇冠特权中不存在0元签约");
            }
        }
        if (!this.doesWebElementExist(nPrice)) {
            Assert.fail("90天vip不存在");
        }
        if ((!this.getVipprice(nPrice).contains("￥100"))) {
            Assert.fail("90天vip价格错误");
        }
        if (!this.doesWebElementExist(tPrice)) {
            Assert.fail("30天vip不存在");
        }
        if (!this.getVipprice(tPrice).contains("￥50")) {
            Assert.fail("30天vip价格有误");
        }

    }
        //    1线男 皇冠特权价格及支付调起
    public void judgeVipPrice1(AndroidDriver driver) throws Exception {
        this.waitElement(driver, title_name);
        this.clickVip90Danhao();
        this.waitElement(driver, title_name);
        log.info("判断90天vip，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("90天vip，支付宝无自动续费");
        }
        this.clickXufei();
        if (!this.doesWebElementExist(youhuijiage_vip90)) {
            Assert.fail("90天vip，支付宝勾选 自动续费，不为优惠后价格");
        }
        this.clickXufei();
        log.info("判断 90天vip，支付宝取消 自动续费，恢复原价");
        if (!this.doesWebElementExist(yuanjia_vip90)) {
            Assert.fail("90天vip，支付宝取消 自动续费后，不为原价");
        }
        this.clickKaiTong();
        Thread.sleep(3000);
        log.info("判断90天vip，支付宝调起");
//        this.waitElement(driver, alisure);
        System.out.println("this.getCurrentActivity(driver):"+this.getCurrentActivity(driver));

        if (this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            log.info("90天vip启动支付宝");
        }else if(this.getCurrentActivity(driver).toLowerCase().contains("aliuserguideactivity")){
            log.info("90天vip启动支付宝");
        }else{
            Assert.fail("90天vip未启动支付宝");
        }
        //支付宝登陆状态
        Thread.sleep(4000);
        if(this.doesWebElementExist(alisure)){
            this.clickAlipayBack();
            this.clickEnsure();
            this.waitElement(driver, alipay);
        }
        this.keyBack(driver);
        Thread.sleep(3000);
        /*if(doesWebElementExist(cancel)){
            new TouchAction(driver).tap(400,750).perform();
            this.keyBack(driver);
        }*/
        if(!this.doesWebElementExist(wecharpay)){
            this.keyBack(driver);
        }
        if(!this.doesWebElementExist(wecharpay)){
            Thread.sleep(3000);
            this.clickVip90Danhao();
        }
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("90天vip，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(8000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("90天vip未启动微信");
        }
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        this.clickReload();
        //        2018年8月23版本变更
//        this.clickQueRen();
//        this.waitElement(driver, title_name);
        if(!this.doesWebElementExist(wecharpay)){
            Thread.sleep(3000);
            this.clickVip90Danhao();
            this.clickReload();
        }
        this.clickYinlianPay();
        this.waitElement(driver, title_name);
        log.info("判断90天vip，银联支付是否默认价格优惠10元");
        /*if(app.equalsIgnoreCase("mlyh")){
            if (this.doesWebElementExist(yuanjia_vip90)) {
                Assert.fail("90天vip，银联支付默认为优惠后价格");
            }
        }else {*/
        if (this.doesWebElementExist(youhuijiage_vip90)) {
            Assert.fail("90天vip，银联支付默认为优惠后价格");
        }
//        }

        this.clickBtnLeft();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickVip30Danhao();

        this.waitElement(driver, title_name);
        this.clickReload();
        log.info("判断30天vip，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("30天vip，支付宝无自动续费");
        }
        this.clickXufei();
        if (!this.doesWebElementExist(youhuijiage_vip30)) {
            Assert.fail("30天vip，支付宝勾选 自动续费，不为优惠后价格");
        }
        this.clickXufei();
        log.info("判断 30天vip，支付宝取消 自动续费，恢复原价");
        if (!this.doesWebElementExist(yuanjia_vip30)) {
            Assert.fail("30天vip，支付宝取消 自动续费后，不为原价");
        }
        this.clickKaiTong();
        log.info("判断30天vip，支付宝调起");
//        this.waitElement(driver, alisure);
        System.out.println("this.getCurrentActivity(driver):"+this.getCurrentActivity(driver));
        if (this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            log.info("30天vip启动支付宝");
        } else if(this.getCurrentActivity(driver).toLowerCase().contains("aliuserguideactivity")){
            log.info("30天vip启动支付宝");
        }else{
            Assert.fail("30天vip未启动支付宝");

        }
        //支付宝登陆状态
        Thread.sleep(4000);
        if(this.doesWebElementExist(alisure)){
            this.clickAlipayBack();
            this.clickEnsure();
            this.waitElement(driver, alipay);
        }
        this.keyBack(driver);
        Thread.sleep(3000);
        if(doesWebElementExist(cancel)){
            new TouchAction(driver).tap(400,750).perform();
            this.keyBack(driver);
        }
        if(!this.doesWebElementExist(wecharpay)){
            this.keyBack(driver);
        }
        if(!this.doesWebElementExist(wecharpay)){
            Thread.sleep(3000);
            this.clickVip90Danhao();
        }
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("30天vip，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(8000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("30天vip未启动微信");
        }
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        this.clickReload();
        //        2018年8月23版本变更
//        this.clickQueRen();
//        this.waitElement(driver, title_name);
        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断30天vip，银联支付是否默认价格优惠10元");

        if (this.doesWebElementExist(youhuijiage_vip30)) {
            Assert.fail("30天vip，银联支付默认为优惠后价格");
        }
        log.info("VIP开通测试成功");
    }


    //    3线男 皇冠特权价格及支付调起
    public void judgeVipPrice3(AndroidDriver driver) throws Exception {
        this.waitElement(driver, title_name);
        this.clickVip90();

        this.waitElement(driver, title_name);
        log.info("判断90天vip，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("90天vip，支付宝默认有自动续费");
        }
        if (!this.doesWebElementExist(youhuijiage_vip90)) {
            Assert.fail("90天vip，支付宝默认无自动续费选项，不为优惠后价格");
        }
        /*this.clickXufei();
        log.info("判断 90天vip，支付宝取消 自动续费，恢复原价");
        if (!this.doesWebElementExist(yuanjia_vip90)) {
            Assert.fail("90天vip，支付宝取消 自动续费后，不为原价");
        }*/
        this.clickKaiTong();
        Thread.sleep(3000);
        log.info("判断90天vip，支付宝调起");
//        this.waitElement(driver, alisure);
        System.out.println("this.getCurrentActivity(driver):"+this.getCurrentActivity(driver));
        if (this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            log.info("90天vip启动支付宝");
        }else if(this.getCurrentActivity(driver).toLowerCase().contains("aliuserguideactivity")){
            log.info("90天vip启动支付宝");
        }else{
            Assert.fail("90天vip未启动支付宝");
        }
        //支付宝登陆状态
        Thread.sleep(4000);
        if(this.doesWebElementExist(alisure)){
            this.clickAlipayBack();
            this.clickEnsure();
            this.waitElement(driver, alipay);
        }
        this.keyBack(driver);
        Thread.sleep(3000);
        if(doesWebElementExist(cancel)){
            new TouchAction(driver).tap(400,750).perform();
            this.keyBack(driver);
        }
        if(!this.doesWebElementExist(wecharpay)){
            this.keyBack(driver);
        }
        if(!this.doesWebElementExist(wecharpay)){
            Thread.sleep(3000);
            this.clickVip90();
        }
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("90天vip，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(8000);
        log.info("判断90天vip，微信调起");
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("90天vip未启动微信");
        }
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        this.clickReload();
        //        2018年8月23版本变更
//        this.clickQueRen();
//        this.waitElement(driver, title_name);
        if(!this.doesWebElementExist(wecharpay)){
            Thread.sleep(3000);
            this.clickVip90();
            this.clickReload();
        }
        this.clickYinlianPay();
        this.waitElement(driver, title_name);
        log.info("判断90天vip，银联支付是否默认价格优惠10元");
//        if(!this.doesWebElementExist(xufei)){
//            Assert.fail("90天vip，银联支付无自动续费");
//        }
        if (!this.doesWebElementExist(youhuijiage_vip90)) {
            Assert.fail("90天vip，银联支付默认无自动续费，不为优惠后价格");
        }

        this.clickBtnLeft();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickVip30();

        this.waitElement(driver, title_name);
        log.info("判断30天vip，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("30天vip，支付宝默认有自动续费");
        }
        if (!this.doesWebElementExist(youhuijiage_vip30)) {
            Assert.fail("30天vip，支付宝默认无自动续费选项，不为优惠后价格");
        }
       /* this.clickXufei();
        log.info("判断 30天vip，支付宝取消 自动续费，恢复原价");
        if (!this.doesWebElementExist(yuanjia_vip30)) {
            Assert.fail("30天vip，支付宝取消 自动续费后，不为原价");
        }*/
        this.clickKaiTong();
        Thread.sleep(3000);
        log.info("判断30天vip，支付宝调起");
//        this.waitElement(driver, alisure);
        System.out.println("this.getCurrentActivity(driver):"+this.getCurrentActivity(driver));
        if (this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            log.info("30天vip启动支付宝");
        } else if(this.getCurrentActivity(driver).toLowerCase().contains("aliuserguideactivity")){
            log.info("30天vip启动支付宝");
        }else{
            Assert.fail("30天vip未启动支付宝");

        }
        //支付宝登陆状态
        Thread.sleep(4000);
        if(this.doesWebElementExist(alisure)){
            this.clickAlipayBack();
            this.clickEnsure();
            this.waitElement(driver, alipay);
        }
        this.keyBack(driver);
        Thread.sleep(3000);
        if(doesWebElementExist(cancel)){
            new TouchAction(driver).tap(400,750).perform();
            this.keyBack(driver);
        }
        if(!this.doesWebElementExist(wecharpay)){
            this.keyBack(driver);
        }
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("30天vip，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(8000);
        log.info("判断30天vip，微信调起");
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("30天vip未启动微信");
        }
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        this.clickReload();
        //        2018年8月23版本变更
//        this.clickQueRen();
//        this.waitElement(driver, title_name);
        this.waitElement(driver, title_name);
        this.clickYinlianPay();
        log.info("判断30天vip，银联支付是否默认价格优惠10元");
//        if(!this.doesWebElementExist(xufei)){
//            Assert.fail("30天vip，银联支付无自动续费");
//        }
        if (!this.doesWebElementExist(youhuijiage_vip30)) {
            Assert.fail("30天vip，银联支付默认无自动续费选项，不为优惠后价格");
        }

    }



    //      3线豆币，免密开通
    public void judgeBeanMianMi(AndroidDriver driver,int beannum) throws Exception {
        log.info("判断初始豆币是不是0个");
        if (this.getBeanNum() != beannum) {
            Assert.fail("初始豆币个数和预期不一致");
        }
        this.clickBean();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickBeanVip();

        this.zhifuLoginAlipay(driver);
        this.clickReload();
        this.waitElement(driver,title_name);
        log.info("返回到会员中心页面");
        this.keyBack(driver);
        this.clickReload();
        this.waitElement(driver,title_name);
        if(this.doesWebElementExist(bean_vip)){
            Assert.fail("0元签约后，还显示0元签约入口");
        }
        log.info("0元签约成功");

    }

    //      3线写信包月，免密开通
    public void judgeLetterMianMi(AndroidDriver driver) throws Exception {
        this.clickWriteLetter();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickLetterVip();
        this.zhifuLoginAlipay(driver);
        this.clickReload();
        log.info("返回到会员中心页面");
        this.waitElement(driver,title_name);
        this.keyBack(driver);
        this.clickReload();
        this.waitElement(driver,title_name);
        if(this.doesWebElementExist(bean_vip)){
            Assert.fail("0元签约后，还显示0元签约入口");
        }
        log.info("0元签约成功");


    }

    //      3线皇冠特权，免密开通
    public void judgeVipMianMi(AndroidDriver driver) throws Exception {
        this.clickVipTitle();
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickNewVip();
        this.zhifuLoginAlipay(driver);
        this.clickReload();
        log.info("返回到会员中心页面");
        this.waitElement(driver,title_name);
        this.keyBack(driver);
        this.clickReload();
        this.waitElement(driver,title_name);
        if(this.doesWebElementExist(bean_vip)){
            Assert.fail("0元签约后，还显示0元签约入口");
        }
        log.info("0元签约成功");
    }
}
