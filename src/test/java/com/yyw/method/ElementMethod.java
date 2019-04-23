package com.yyw.method;

import com.aventstack.extentreports.ExtentTest;
import com.listener.ExtentTestNGITestListener;
import com.yyw.page.PageElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementMethod extends PageElement {
    ExtentTestNGITestListener el = new ExtentTestNGITestListener();
    ExtentTest log = el.getlog();



    public void updateQuDao(String qudaonum) {
        log.info("修改渠道号");
        qudao.click();
        qudao.clear();
        qudao.sendKeys(qudaonum);
    }

    //   点击右上角 登录按钮，切换至登录页面
    public void changeLogin(){
        btn_right.click();
    }


    public  void userLogin(String username,String pwd){
        account.clear();
        account.sendKeys(username);
        password.clear();
        password.sendKeys(pwd);
    }


//    点击登录按钮
    public void clickLogin(){
        btn_login.click();
    }

//    点击登录画面的 付费引导
    public void  clickBtnWishGuideContent2(){
        btn_wish_guide_content2.click();
    }

//    点击引导“我知道了”
    public void clickGuide(){
        btn_wish_guide_next.click();
    }

//    点击 我的
    public void clickMine(){
        mine.click();
    }

//    点击第一个头像
    public void clickImage(){
        image.click();
    }

//    h获取第一个姓名
    public String getName(){
        return name.getText();
    }

//    获取第一个年龄
    public String getAge(){
        return age.getText();
    }

//    获取第一个匹配度
    public String getMatch(){
        return match.getText();
    }
//    点击 第一个自我介绍
    public void clickUserDesc(){
        user_desc.click();
    }


//    关闭 女用户登录后的引导
    public void  clickWishGuideClose(){
        im_wish_guide_close.click();
    }

//    点击 我要发布
    public void clickReleaseWish(){
        im_release_wish.click();
    }

//    0-5的随机数，用户随机一个心愿
    public int getNum(){
        return (int)(0+Math.random()*(5-1+1));
    }

//    点击一级心愿
    public void clickWishGroup(int i){
        wish_group.get(i).click();
    }
    //    获取具体的二级心愿
    public void clickWishChild(int i){
        wish_child.get(i).click();
    }

//    获取具体的二级心愿
    public String getWishChild(int i){
        return wish_child.get(i).getText();
    }

//    点击左上角 查看我的心愿
    public void clickMyWish(){
        im_my_wish.click();
    }

//    获取第一个心愿
    public String getMyWishContent(){
        return my_wish_content.get(0).getText();
    }

//    获取空间里的姓名
    public String getSpaceName(){
        return personage_space_name.getText();
    }

//    点击右上角邮件提示
    public void  clickAroundPersonHeaderName(){
        around_person_header_name.click();
    }

//    获取空间中的匹配度
    public String getPersonageSpaceMatching(){
        return personage_space_matching.getText();
    }

//    获取空间 昵称
    public String getNickName(){
        return main_info.get(0).getText();
    }

//    获取空间 年龄
    public String getNickAge(){
        return main_info.get(1).getText();
    }

//    获取打招呼按钮文案
    public String getSpacePraise(){
        return btn_like_text.getText();
    }

//    点击打招呼
    public void clickSpacePraise(){
        btn_like_text.click();
    }
//    点击下一个
    public void clickNext(){
        btn_next_user.click();
    }

//    关闭空间页上私信提示
    public void clickMessageClose(){
        around_person_header_close.click();
    }

//    点击右上角按钮
    public void clickBtnRight(){
        btn_right.click();
    }

//    获取 拉黑文本
    public String getNotRead(){
        return neglect_not_read.getText();
    }

//    点击拉黑
    public void clickNotRead(){
        neglect_not_read.click();
    }

//    点击取消
    public void clickBtnCancel(){
        btn_cancel.click();
    }

//    点击 确定
    public void clickBtnOk(){
        btn_ok.click();
    }

//    点击举报
    public void clickUpgraded(){
        upgraded_members.click();
    }

//    获取被举报人姓名
    public String getReportName(){
        return  report_name.getText();
    }
//    选择举报原因
    public void clickEatTube(){
        eat_tube.click();
    }

//    确定举报
    public void clickSure(){
        sure.click();
    }

//    点击右上角搜索
    public void clickSearch(){
        btn_right_search.click();
    }

//    获取title
    public String getTitle(){
        return  title_name.getText();
    }

//    点击地区
    public void clickLocation(){
        location.click();
    }
//    获取地区
    public String getLocation(){
        return location.getText();
    }

//    点击保存
    public void clickSave(){
        save.click();
    }
//    获取 发现页面，列表中城市
    public String getUICity(){
        return ui_city.get(1).getText();
    }

//    点击 征友条件
    public void clickCondition(){
        condition.click();
    }

    public String getMyspaceLocation(){
        return myspace_location_view.getText();
    }



//    附近功能模块
//    点击附近
    public void clickNear(){
        near.click();
    }
//    获取第一个 用户姓名
    public String getUserName(){
        return  user_name.get(0).getText();
    }

//    点击第一个用户姓名
    public void clickUserName(){
        user_name.get(0).click();
    }
//    点击打招呼
    public void clickPostLetter(){
        post_letter.click();
    }

//    点击用户头像
    public void clickIDphoto(){
        id_photo.click();
    }

//    点击返回
    public void clickBtnLeft(){
        btn_left.click();
    }

//    点击右上角关闭
    public void clickDynamicBack(){
        dynamic_back.click();
    }


//    点击 邮箱
    public void clickMailBox(){
        mailbox.click();
    }

//    点击最近访客
    public void  clickReceiveMessageCount(){
        receive_message_count.click();
    }

//    点击写信包月
    public void clickVisitorMe(){
        visitor_me_bt.click();
    }

//    点击消息中的 头像
    public void clickMessageMemberImage(){
        message_member_image.click();
    }

//    点击 回复并索要联系方式
    public void clickPersonageSpacePay(){
        personage_space_pay.click();
    }


//    附近功能
//    点击用户小头像
    public void clickNearWoman(){
        nearwoman.click();
    }

//    获取用户姓名
    public String getNameMap(){
        return tv_name_map.getText();
    }
//    获取用户年龄
    public String getAgeMap(){
        return tv_age_map.getText();
    }

//    点击大头像，进入用户空间页
    public void clickHeadMap(){
        iv_head_map.click();
    }

//    点击不喜欢
    public void clickiNoLikeMap(){
        iv_no_like_map.click();
    }

//    点击喜欢
    public void clickLikeMap(){
        iv_like_map.click();
    }

//    女用户 邮箱  已解锁的人
    public void clickUnlockPeople(){
        unlock_people.click();
    }




//    三线支付，点击购买事件
//    3个月写信包月
    public void clickLetter3_3(){
        letter3_3.click();
    }
//    1个月写信包月
    public void clickLetter1_3(){
        letter1_3.click();
    }

//    100块豆币
    public void clickBean100_3(){
        bean100_3.click();
    }
//    50块豆币
    public void clickBean50_3(){
        bean50_3.click();
    }
//    30块豆币
    public void clickBean30_3(){
        bean30_3.click();
    }

//    点击 活动介绍
    public void clickHuodong(){
        huodong.click();
    }

//    点击 90天聊天
    public  void clickHuodongLetter(){
        huodong_letter.click();
    }

//    点击1000个豆币
    public void clickHuodongBean(){
        huodong_bean.click();
    }

//    微信支付
    public void clickWechar(){
        wechar.click();
    }

//    /    微信支付
    public void clickWechar1(){
        wechar1.click();
    }

//    立即开通
    public void clickKaitong(){
        kaitong.click();
    }


    public void clickLetter90() {
        log.info("点击90天会员");
        letter90.click();
    }

    public void clickLetter1() {
        log.info("点击1天会员");
        letter1.click();
    }


    public void clickLetter7() {
        log.info("点击1天会员");
        letter7.click();
    }
//
    public void clickBuyBean(){
        buyBean.click();
    }

    public void clickBean800(){
        bean800.click();
    }

    public void clickBean550(){
        bean550.click();
    }

    public void clickXufei() {
        log.info("点击自动续费");
        xufei.click();
    }

    public void clickKaiTong() {
        log.info("点击立即开通");
        kaitong.click();
    }


//    女用户30天vip
    public void clickVip30(){
        vip_30.click();
    }

//    女用户90天vip
    public void clickVip90(){
        vip_90.click();
    }

//    女用户选择微信支付
    public void  clickWecharNv(){
        wechar_nv.click();
    }

//    女用户开通30天vip
    public void clickFuKuan98(){
        fukuan_98.click();
    }

//    女用户开通90天vip
    public void clickFuKuan198(){
        fukuan_198.click();
    }

//

    public void swipeToUp(AndroidDriver driver) {
        log.info("向上滑动屏幕");
        Duration duration = Duration.ofSeconds(1);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action1 = new TouchAction(driver).press(width / 2, 900).waitAction(duration).moveTo(width / 2, 50).release();
        action1.perform();
    }


    public void swipeLocationUp(AndroidDriver driver) {
        log.info("向上滑动地区");
        Duration duration = Duration.ofSeconds(1);
        TouchAction action1 = new TouchAction(driver).press(650, 1300).waitAction(duration).moveTo(650, 650).release();
        action1.perform();
    }

    public void swipeLocationDown(AndroidDriver driver) {
        log.info("向下滑动地区");
        for (int i=1;i<3;i++){
            Duration duration = Duration.ofSeconds(1);
            TouchAction action1 = new TouchAction(driver).press(650, 650).waitAction(duration).moveTo(650, 1300).release();
            action1.perform();
        }

    }

    public void waitElement(AndroidDriver driver, WebElement webelement) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(webelement));
    }


    //    通用判断元素是否存在
    public boolean doesWebElementExist(WebElement webElement) {
        try {
            return webElement.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }


    //手机物理方法
    public void clickMonitor1(AndroidDriver driver) {
        log.info("点击 右下角空白处（用于处理 进入空间时，消去覆盖的提示）");
        TouchAction action = new TouchAction(driver);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        action.tap(width - 1, height - 1).perform();
    }


    public String getCurrentActivity(AndroidDriver driver) {
        log.info("获取启动的APP名称");
        return driver.currentActivity();
    }

    public void keyBack(AndroidDriver driver) {
        log.info("点击物理返回键");
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }



    //    /    点击页面空白处（用于进入修改环境）
    public void clickMonitor(AndroidDriver driver) {
        log.info("点击页面空白处（用于进入修改环境）");
        TouchAction action = new TouchAction(driver);
        int width = driver.manage().window().getSize().width;
        action.tap(560, 1800).perform();
        action.tap(560, 1800).perform();
        action.tap(560, 1800).perform();
        action.tap(560, 1800).perform();
        action.tap(560, 1800).perform();
        action.tap(560, 1800).perform();
    }


//    点击服务端环境
    public void clickTestEnv(){
        test_env.click();
    }
//    选择预上限
    public void clickPrep(){
        prep.click();
    }
//   选择线上
    public void clickProduct(){
        product.click();
    }

//    点击保存
    public void clickTestSave(){
        btn_test_save.click();
    }




}
