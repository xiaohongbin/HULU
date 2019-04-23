package com.yyw.check;

import com.aventstack.extentreports.ExtentTest;
import com.listener.ExtentTestNGITestListener;
import com.listener.WriteUserID;
import com.yyw.method.ElementMethod;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;

import java.util.zip.Adler32;

public class YywCheck extends ElementMethod {
    ExtentTestNGITestListener el = new ExtentTestNGITestListener();
    ExtentTest log = el.getlog();
    WriteUserID wui = new WriteUserID();

    public void manLogin(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        for (int i = 1; i <= 6; i++) {
            if (doesWebElementExist(button1)) {
                button1.click();
                Thread.sleep(1000);
            }
        }
        clickMonitor(driver);
        clickTestEnv();
        clickProduct();
        updateQuDao(qudaohao);
        clickTestSave();
        changeLogin();
        userLogin(username, pwd);
        clickLogin();
        //        每天第一次登陆，5个问题
        while (doesWebElementExist(ask_info)) {
            ask_info.click();
        }
        clickGuide();
    }

    public void manLoginPay1(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        for (int i = 1; i <= 6; i++) {
            if (doesWebElementExist(button1)) {
                button1.click();
                Thread.sleep(1000);
            }
        }
        clickMonitor(driver);
        clickTestEnv();
        clickProduct();
        updateQuDao(qudaohao);
        clickTestSave();
        changeLogin();
        userLogin(username, pwd);
        clickLogin();
        //        每天第一次登陆，5个问题
        while (doesWebElementExist(ask_info)) {
            ask_info.click();
        }
        clickBtnWishGuideContent2();
        waitElement(driver, title_name);
        if (!getTitle().equals("会员服务")) {
            Assert.fail("点击登录付费引导，未进入 会员购买页面");
        }
    }

    public void manLogin3(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        for (int i = 1; i <= 6; i++) {
            if (doesWebElementExist(button1)) {
                button1.click();
                Thread.sleep(1000);
            }
        }
        clickMonitor(driver);
        clickTestEnv();
        clickProduct();
        updateQuDao(qudaohao);
        clickTestSave();
        changeLogin();
        userLogin(username, pwd);
        clickLogin();
        while (doesWebElementExist(ask_info)) {
            ask_info.click();
        }
//        clickBtnCancel();
        clickGuide();
    }

    public void manLoginPay3(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        for (int i = 1; i <= 6; i++) {
            if (doesWebElementExist(button1)) {
                button1.click();
                Thread.sleep(1000);
            }
        }
        clickMonitor(driver);
        clickTestEnv();
        clickProduct();
        updateQuDao(qudaohao);
        clickTestSave();
        changeLogin();
        userLogin(username, pwd);
        clickLogin();
        //        每天第一次登陆，5个问题
        while (doesWebElementExist(ask_info)) {
            ask_info.click();
        }
//        clickBtnCancel();
        clickBtnWishGuideContent2();
        waitElement(driver, title_name);
        if (!getTitle().equals("会员支付")) {
            Assert.fail("点击登录付费引导，未进入 会员支付页面");
        }
    }

    public void manSayHi1(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        manLogin(username, pwd, driver, qudaohao);
        saiHi(driver);
    }

    public void manNotRead(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        manLogin(username, pwd, driver, qudaohao);
        notRead();
    }

    //    1线男 举报
    public void manUpgraded1(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        manLogin(username, pwd, driver, qudaohao);
        upgrade();
    }

    //    1线男 空间页跳转 邮箱
    public void manSpaceToMailBox1(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        manLogin(username, pwd, driver, qudaohao);
        spaceToMailBox(driver);
    }

    //    3线男 匹配度
    public void manMatch1(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        manLogin(username, pwd, driver, qudaohao);
        spaceMatch();
    }

    //    1线男 搜索
    public void manSearch(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        manLogin(username, pwd, driver, qudaohao);
        search(driver);
    }

    //    1线男 附近
    public void manNear1(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        manLogin(username, pwd, driver, qudaohao);
        clickNear();
        this.waitElement(driver, title_name);
        String name1 = getUserName();
        clickUserName();
        clickPostLetter();
        clickIDphoto();
        String name2 = getSpaceName();
        System.out.println(name2);
        if (!name1.equals(name2)) {
            Assert.fail("从 附近 进入用户空间，用户名不一致");
        }
        if (!getSpacePraise().equals("已打招呼")) {
            Assert.fail("打招呼失败");
        }
        clickBtnLeft();
        clickDynamicBack();
        String name3 = getUserName();
        if (name1.equals(name3)) {
            Assert.fail("查看附近的人后，列表未自动刷新");
        }
    }

    //    1线男 邮箱
    public void manMailBox(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        manLogin(username, pwd, driver, qudaohao);
        mailBox(driver);
        if (!getTitle().equals("会员服务")) {
            Assert.fail("从消息点击 回复，未进入 会员购买页面");
        }
        price1(driver);
    }

    //    最近访客
    public void manVisitorMe1(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        manLogin(username, pwd, driver, qudaohao);
        visitorMe(driver);
        if (!getTitle().equals("会员服务")) {
            Assert.fail("点击 开通写信包月，未进入 会员服务页面");
        }
    }


    public void manSayHi3(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        manLogin3(username, pwd, driver, qudaohao);
        saiHi(driver);
    }

    //    三线男拉黑
    public void manNotRead3(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        manLogin3(username, pwd, driver, qudaohao);
        notRead();
    }

    //    三线男 举报
    public void manUpgraded3(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        manLogin3(username, pwd, driver, qudaohao);
        upgrade();
    }

    //    3线男 空间页跳转 邮箱
    public void manSpaceToMailBox3(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        manLogin3(username, pwd, driver, qudaohao);
        spaceToMailBox(driver);
    }

    //    3线男 匹配度
    public void manMatch3(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        manLogin3(username, pwd, driver, qudaohao);
        spaceMatch();
    }

//    三线男无搜索
//    public void manSearch3(String username,String pwd,AndroidDriver driver){
//        manLogin3(username,pwd);
//        search(driver);
//    }

    //    三线男附近
    public void manNear3(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        manLogin3(username, pwd, driver, qudaohao);
        clickNear();
        waitElement(driver, nearwoman);
        clickNearWoman();
        Thread.sleep(1000);
        if (!this.doesWebElementExist(iv_head_map)) {
            Assert.fail("附近 点击头像，未弹出头像框");
        }
        if (!this.doesWebElementExist(tv_name_map)) {
            Assert.fail("头像框中无姓名");
        }
        if (!this.doesWebElementExist(tv_age_map)) {
            Assert.fail("头像框中无年龄");
        }
        if (!this.doesWebElementExist(tv_distance_map)) {
            Assert.fail("头像框中无距离");
        }
        this.clickiNoLikeMap();
        if (this.doesWebElementExist(iv_head_map)) {
            Assert.fail("点击不喜欢，未关闭头像框");
        }
        clickNearWoman();
        Thread.sleep(1000);
        if (!this.doesWebElementExist(iv_head_map)) {
            Assert.fail("附近 点击头像，未弹出头像框");
        }
        this.clickLikeMap();
        if (this.doesWebElementExist(iv_head_map)) {
            Assert.fail("点击喜欢，未关闭头像框");
        }
        clickNearWoman();
        Thread.sleep(1000);
        String name = this.getNameMap();
        this.clickHeadMap();
        if (!name.equals(this.getSpaceName())) {
            Assert.fail("点击头像进入空间后，用户姓名不一致");
        }
        if (!getSpacePraise().equals("已打招呼")) {
            Assert.fail("点击“喜欢”后，进入用户空间，未标注成 已打招呼 状态");
        }
    }

    public void manMailBox3(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        manLogin3(username, pwd, driver, qudaohao);
        mailBox(driver);
        if (!getTitle().equals("会员支付")) {
            Assert.fail("从消息点击 回复，未进入 会员购买页面");
        }
        checkpay(driver);
    }

    //    最近访客
    public void manVisitorMe3(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        manLogin3(username, pwd, driver, qudaohao);
        visitorMe(driver);
        if (!getTitle().equals("会员支付")) {
            Assert.fail("点击 开通写信包月，未进入 会员支付页面");
        }
    }


    //    女用户登录
    public void womanLogin(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        for (int i = 1; i <= 6; i++) {
            if (doesWebElementExist(button1)) {
                button1.click();
                Thread.sleep(1000);
            }
        }
        clickMonitor(driver);
        clickTestEnv();
        clickPrep();
        updateQuDao(qudaohao);
        clickTestSave();
        changeLogin();
        userLogin(username, pwd);
        Thread.sleep(1000);
        clickLogin();
    }

    //    女用户发布心愿
    public void womanWish(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        womanLogin(username, pwd, driver, qudaohao);
        clickGuide();
        Thread.sleep(1000);
        clickGuide();
        Thread.sleep(1000);
        clickGuide();
        Thread.sleep(1000);
//        clickWishGuideClose();
//        clickMailBox();
        clickMonitor1(driver);
//        clickReleaseWish();
        waitElement(driver, title_name);
        int wishgroupnum = getNum();
        clickWishGroup(wishgroupnum);
        Thread.sleep(1000);
        int wishchildnum = getNum();
        clickWishChild(wishchildnum);
        String mywish = getWishChild(wishchildnum);
        clickBtnRight();
        Thread.sleep(3000);
        clickMonitor1(driver);
        clickMyWish();
        waitElement(driver, title_name);
        if (!getMyWishContent().equals(mywish)) {
            Assert.fail("女用户发布心愿失败");
        }
    }

    //    女用户登录寻缘
    public void womanXunyuan(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        womanLogin(username, pwd, driver, qudaohao);
        clickWishGuideClose();
        waitElement(driver, edit_text);
        edit_text.sendKeys("介绍一下自己吧");
        send_btn.click();
        waitElement(driver, love_energy_know);
        love_energy_know.click();
        Thread.sleep(3000);
        id_bt_answer_hello_close.click();
        group_chat_close.click();
        clickBtnOk();
        if (!doesWebElementExist(achievement_title)) {
            Assert.fail("未进入 寻缘结果页");
        }
        if (!doesWebElementExist(achievement_respond_number)) {
            Assert.fail("寻缘结果页，无 收到回应信息");
        }
        if (!doesWebElementExist(achievement_summon_number)) {
            Assert.fail("寻缘结果页，无 召唤信息");
        }
    }

    //   信箱
    public void womanMailBox(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        womanLogin(username, pwd, driver, qudaohao);
        clickWishGuideClose();
        waitElement(driver, edit_text);
        id_bt_answer_hello_close.click();
        waitElement(driver, near);
        clickNear();
        womanMailBox(driver);
    }

    //    女用户 信息 发消息拦截
    public void womanMailDialog(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        womanLogin(username, pwd, driver, qudaohao);
        clickWishGuideClose();
        waitElement(driver, edit_text);
        id_bt_answer_hello_close.click();
        waitElement(driver, near);
        clickNear();
        womanDialog(driver);
    }

    //    女用户 信息 发消息拦截
    public void womanMailSearch(String username, String pwd, AndroidDriver driver, String qudaohao) throws Exception {
        womanLogin(username, pwd, driver, qudaohao);
        clickWishGuideClose();
        waitElement(driver, edit_text);
        id_bt_answer_hello_close.click();
        waitElement(driver, near);
        clickNear();
        mailSearch(driver);
    }

    //    通用搜索
    public void search(AndroidDriver driver) {
        clickSearch();
        if (!getTitle().equals("征友条件")) {
            Assert.fail("未进入搜索页面");
        }
        clickLocation();
        swipeLocationUp(driver);
        clickBtnOk();
        String location1 = getLocation();
        clickSave();
        String location2 = getUICity();
        if (!location1.equals(location2)) {
            Assert.fail("修改搜索条件后，发现页面，列表未刷新");
        }
        clickMine();
        clickCondition();
        if (!getMyspaceLocation().equals(location2)) {
            Assert.fail("修改搜索条件后，我的--征友条件 信息未改变");
        }
//        恢复为不限，防止多次操作后，滑动到最底部后，无法滑动
        clickLocation();
        swipeLocationDown(driver);
        clickBtnOk();
        clickSave();
    }

    //    拉黑通用
    public void notRead() {
        clickImage();
        clickMessageClose();
        clickBtnRight();
        String text1 = getNotRead();
        if (!text1.equals("拉黑")) {
            Assert.fail("默认初始为 拉黑状态 ");
        }
        clickNotRead();
        clickBtnCancel();
        clickBtnRight();
        text1 = getNotRead();
        if (!text1.equals("拉黑")) {
            Assert.fail("拉黑 点击取消 失败 ");
        }
        clickNotRead();
        clickBtnOk();

        clickBtnRight();
        text1 = getNotRead();
        if (!text1.equals("取消拉黑")) {
            Assert.fail("拉黑 点击确定 失败 ");
        }
        clickNotRead();
        clickBtnCancel();

        clickBtnRight();
        text1 = getNotRead();
        if (!text1.equals("取消拉黑")) {
            Assert.fail("取消拉黑 点击取消  失败 ");
        }
        clickNotRead();
        clickBtnOk();
        clickBtnRight();
        text1 = getNotRead();
        if (!text1.equals("拉黑")) {
            Assert.fail("取消拉黑 点击确定  失败 ");
        }
    }

    //    举报通用
    public void upgrade() {
        String name1 = getName();
        clickImage();
        clickMessageClose();
        clickBtnRight();
        clickUpgraded();
        String name2 = getReportName();
        if (!name1.equals(name2)) {
            Assert.fail("拉黑 的姓名与 空间姓名不一致");
        }
        clickEatTube();
        clickSure();
    }

    //    打招呼通用
    public void saiHi(AndroidDriver driver) throws Exception {
        String name1 = getName();
        String age1 = getAge();
        clickImage();
        String name2 = getSpaceName();
        swipeToUp(driver);
        String name3 = getNickName();
        String age2 = getNickAge();
        if (!(name1.equals(name2) && name2.equals(name3))) {
            Assert.fail("列表中姓名 与空间中姓名不一致");
        }
        if (!(age1.contains(age2))) {
            Assert.fail("列表中年龄与空间中年龄不一致");
        }
        clickSpacePraise();
        Thread.sleep(3000);
        if (getSpaceName().equals(name1)) {
            Assert.fail("点击 打招呼 按钮后，未跳转至一用户");

        }
        clickNext();
        if (getSpaceName().equals(name2)) {
            Assert.fail("点击下一个，未跳转至下一用户");
        }
    }

    //    邮箱通用
    public void mailBox(AndroidDriver driver) throws Exception {
        clickMailBox();
        waitElement(driver, title_name);
        swipeToUp(driver);
        String name1 = getUserName();
        clickUserName();
        waitElement(driver, title_name);
        if (!getTitle().equals(name1)) {
            Assert.fail("进入消息后，上方名字不一致");
        }
        clickMessageMemberImage();
        clickPersonageSpacePay();
        waitElement(driver, title_name);
//        System.out.println(getTitle());

    }

    //    最近访客通用
    public void visitorMe(AndroidDriver driver) throws Exception {
        clickMailBox();
        waitElement(driver, title_name);
        clickReceiveMessageCount();
        waitElement(driver, title_name);
        if (!getTitle().equals("最近访客")) {
            Assert.fail("未进入 最近访客 页面");
        }
        clickVisitorMe();
        waitElement(driver, title_name);
    }

    //    空间页跳转至邮箱
    public void spaceToMailBox(AndroidDriver driver) throws Exception {
        clickImage();
        clickAroundPersonHeaderName();
        waitElement(driver, title_name);
        if (!getTitle().equals("信箱")) {
            Assert.fail("点击空间页右上角 邮件提示，未跳转至 信箱");
        }
    }

    //    空间页匹配度
    public void spaceMatch() throws Exception {
        String match = getMatch();
        clickUserDesc();
        if (!getPersonageSpaceMatching().contains(match)) {
            Assert.fail("列表中匹配度，与空间中匹配度不一致");
        }
    }

    //   女用户邮箱
    public void womanMailBox(AndroidDriver driver) throws Exception {
        waitElement(driver, title_name);
        swipeToUp(driver);
        String name1 = getUserName();
//        System.out.println(name1);
        clickUserName();
        waitElement(driver, title_name);
//        System.out.println(getTitle());
        if (!getTitle().equals(name1)) {
            Assert.fail("进入消息后，上方名字不一致");
        }
        clickMessageMemberImage();
        add_contacts_left_add.click();
        add_contacts_intercept_pay.click();

        waitElement(driver, title_name);
        if (!getTitle().contains("VIP")) {
            Assert.fail("用户户点击 开通 vip，未进入付款页面");
        }
        payWoman(driver);
    }

    public void womanDialog(AndroidDriver driver) throws Exception {
        waitElement(driver, title_name);
        swipeToUp(driver);
        String name1 = getUserName();
        clickUserName();
        waitElement(driver, title_name);
        if (!getTitle().equals(name1)) {
            Assert.fail("进入消息后，上方名字不一致");
        }
        edit_text.sendKeys("介绍一下自己吧");
        send_btn.click();
        Thread.sleep(2000);
        if (!getTitle().equals("身份认证")) {
            Assert.fail("女用户从信息进入聊天，未实名拦截");
        }
    }

    //    女用户已读消息中搜索
    public void mailSearch(AndroidDriver driver) throws Exception {
        clickReceiveMessageCount();
        waitElement(driver, title_name);
        swipeToUp(driver);
        String name1 = getUserName();
        clickBtnRight();
        et_search_dialog_content.sendKeys(name1);
        clickBtnOk();
        if (user_name.size() < 1) {
            Assert.fail("搜索列表中的用户，无结果");
        }
    }


    //   三线男支付页面进入及app调起
    public void checkpay(AndroidDriver driver) throws Exception {
        waitElement(driver, title_name);
        clickLetter3_3();
        pay(driver);
        keyBack(driver);

        waitElement(driver, title_name);
        clickLetter1_3();
        pay(driver);
        keyBack(driver);

        waitElement(driver, title_name);
        clickBean100_3();
        pay(driver);
        keyBack(driver);

        waitElement(driver, title_name);
        clickBean50_3();
        pay(driver);
        keyBack(driver);

        waitElement(driver, title_name);
        clickBean30_3();
        pay(driver);
        keyBack(driver);

        clickHuodong();

        waitElement(driver, title_name);
        clickHuodongLetter();
        pay(driver);
        keyBack(driver);

        waitElement(driver, title_name);
        clickHuodongBean();
        pay(driver);
        keyBack(driver);

    }

    //    支付判断调起
    public void pay(AndroidDriver driver) throws Exception {
        waitElement(driver, title_name);
        clickKaitong();
        Thread.sleep(5000);
        System.out.println(this.getCurrentActivity(driver));
        if (!this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            Assert.fail("未启动支付宝");
        }
        keyBack(driver);
        waitElement(driver, title_name);
        clickWechar();
        clickKaitong();
        Thread.sleep(5000);
        System.out.println(this.getCurrentActivity(driver));
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("未启动微信");
        }
        keyBack(driver);
        Thread.sleep(3000);
    }

    //    一线写信包月与购买豆币
    public void price1(AndroidDriver driver) throws Exception {
        waitElement(driver, title_name);
        clickLetter90();
        pay1(driver);
        keyBack(driver);

        waitElement(driver, title_name);
        clickLetter1();
        pay1(driver);
        keyBack(driver);

        waitElement(driver, title_name);
        clickLetter7();
        pay1(driver);
        keyBack(driver);

        waitElement(driver, title_name);
        clickBuyBean();

        clickBean800();
        pay1(driver);
        keyBack(driver);

        waitElement(driver, title_name);
        clickBean550();
        pay1(driver);
        keyBack(driver);

    }

    //    支付判断调起
    public void pay1(AndroidDriver driver) throws Exception {
        waitElement(driver, title_name);
        clickKaitong();
        Thread.sleep(5000);
        System.out.println(this.getCurrentActivity(driver));
        if (!this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            Assert.fail("未启动支付宝");
        }
        keyBack(driver);
        waitElement(driver, title_name);
        clickWechar1();
        clickKaitong();
        Thread.sleep(5000);
        System.out.println(this.getCurrentActivity(driver));
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("未启动微信");
        }
        keyBack(driver);
        Thread.sleep(3000);
    }


    //   女用户 支付判断调起
    public void payWoman(AndroidDriver driver) throws Exception {
        waitElement(driver, title_name);
        clickVip30();
        waitElement(driver, title_name);
        clickFuKuan98();
        Thread.sleep(5000);
        System.out.println(this.getCurrentActivity(driver));
        if (!this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            Assert.fail("未启动支付宝");
        }
        keyBack(driver);
        waitElement(driver, title_name);
        clickWecharNv();
        clickFuKuan98();
        Thread.sleep(5000);
        System.out.println(this.getCurrentActivity(driver));
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("未启动微信");
        }
        keyBack(driver);
        waitElement(driver, title_name);
        keyBack(driver);
//        90天
        clickVip90();
        waitElement(driver,title_name);
        clickFuKuan198();
//        强制等待 支付宝启动
        Thread.sleep(5000);
        System.out.println(this.getCurrentActivity(driver));
        if (!this.getCurrentActivity(driver).toLowerCase().contains("alipay")) {
            Assert.fail("未启动支付宝");
        }
        keyBack(driver);
        waitElement(driver, title_name);
        clickWecharNv();
        clickFuKuan198();
        Thread.sleep(5000);
        System.out.println(this.getCurrentActivity(driver));
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("未启动微信");
        }

    }

}
