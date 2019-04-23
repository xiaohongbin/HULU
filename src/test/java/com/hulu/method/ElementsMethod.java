package com.hulu.method;

import com.aventstack.extentreports.ExtentTest;
import com.hulu.page.PageElements;
import com.listener.ExtentTestNGITestListener;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class ElementsMethod extends PageElements {
    ExtentTestNGITestListener el = new ExtentTestNGITestListener();
    ExtentTest log = el.getlog();

    /**华为手机授权
     *
     */
    //注册点击男用户头像
    public void clickBtnAllow() {
        log.info("选择 允许 授权");
        btn_allow.click();
    }

    /**
     * 通用元素方法
     */


    //注册点击男用户头像
    public void clickBtnMen() {
        log.info("选择男用户头像");
        btn_men.click();
    }

    //注册点击女用户头像
    public void clickBtnWomen() {
        log.info("选择女用户头像");
        btn_women.click();
    }

    public void clickTvBack() {
        log.info("点击登录");
        btn_back.click();
    }

    //   点击左上角 返回
    public void clickBtnLeft() {
        log.info("点击左上角 返回");
        btn_left.click();
    }

    public String getTopView() {
        log.info("获取上方模块名称");
        return topview.getText();
    }

    public void clickMsgClose() {
        log.info("点击上方私信关闭按钮");
        msg_close.click();
    }
    public void clickMsgIcon() {
        log.info("点击上方私信条");
        head_menu_icon.click();
    }

    public String getTitleName() {
        log.info("获取上方页面名称");
        return title_name.getText();
    }

    /**
     * 约会吧
     */
    //点击左上角的我的
    public void clickTopMe() {
        log.info("点击左上角的我的");
        top_me_layout.click();
    }

    //----------------会员中心
    public void body_item_8() {
        log.info("进入会员中心");
        body_item_8.click();
    }


    /**
     * 瑞福缘动
     */
    //   #点击热聊导航模块
    public void clickReLiao() {
        log.info("点击底部热聊导航模块");
        reliao.click();
    }
    //   #点击遇见导航模块
    public void clickYuJian() {
        log.info("点击底部遇见导航模块");
        yujian.click();
    }
    //   #点击附件导航模块
    public void clickFuJin() {
        log.info("点击底部附近导航模块");
        fujin.click();
    }
    //   #点击主页导航模块
    public void clickZhuYe() {
        log.info("点击底部主页导航模块");
        zhuye.click();
    }
    //   #点击私信导航模块
    public void clickSiXin() {
        log.info("点击底部私信导航模块");
        sixin.click();
    }

    public void clickAlipayQuit() {
        log.info("点击支付宝付款页面 退出");
        quit.click();
    }


    //  以上为瑞福缘动的元素



    /**
     * 修改测试环境方法
      * @param qudaonum
     */
//    修改渠道号
    public void updateQuDao(String qudaonum) {
        log.info("修改渠道号");
        qudao.click();
        qudao.clear();
        qudao.sendKeys(qudaonum);
    }

    //    展开 注册地址一项
    public void clickAddress() {
        log.info("展开注册地址一项");
        address.click();
    }

    public String getAddress() {
        log.info("获取修改后的城市");
        return address.getText();
    }

    //    展开测试环境一项
    public void clickTestEnv() {
        log.info("展开测试环境一项");
        test_env.click();
    }

    //    选择线上环境
    public void clickProduct() {
        log.info("选择线上环境");
        product.click();
    }

    //      选择预上线环境
    public void clickHuluprep() {
        log.info("选择预上线环境");
        huluprep.click();
    }

    public void clickSave() {
        log.info("点击修改测试环境上 保存");
        btn_test_save.click();
    }


    /**
     * 注册页面方法
     */

    //    点击立即注册
    public void clickRegister() {
        log.info("点击立即注册");
        btn_register.click();
    }

//    点击一键注册(返回注册页面)
    public void oneClickRegister() {
        log.info("点击一键注册");
        btn_reg.click();
    }


    public void clickMen() {
        log.info("点击 我是男");
        btn_men.click();
    }

    public void clickWomen() {
        log.info("点击“我是女”");
        btn_women.click();
    }

    public void clickIKnown() {
        log.info("点击 知道了");
        btn_i_know.click();
    }
    //  注册后打招呼头像取消选中
    public void clickImageIcon(int i) {
        log.info("点击 知道了");
        System.out.println("头像数量："+image_icon.size());
        image_icon.get(i).click();
    }


    public void clickLogin() {
        log.info("点击登录按钮");
        login.click();
    }
    public void sendAccount(String account) {
        log.info("输入用户名");
        input_account.click();
        input_account.clear();
        input_account.sendKeys(account);
    }

    public void sendPassword(String password) {
        log.info("输入密码");
        input_password.click();
        input_password.clear();
        input_password.sendKeys(password);
    }

    public void clickBtnLogin() {
        log.info("点击登录按钮");
        btn_login.click();
    }

    //设置登录密码
    public void setPwd() {
        log.info("设置登录密码");
        id_edittext_phone.sendKeys("QWE123");
    }

    public void clickProtocol() {
        log.info("点击“协议”");
        btn_protocol.click();
    }

    public void clickLijireg(){
        log.info("三线男注册合理化，基本资料点击 立即注册");
        btn_reg_dialog_reg.click();
    }
    public void clickBtnSpeed(){
        log.info("合理化，双号，超级曝光页点击 立即领取");
        btn_speed.click();
    }

    //拍照
    public void clickPhotos() {
        upload_user_icon_take_photos.click();
    }

    //快门
    public void cameraBtn() {
        camera_shutter_middle_button.click();
    }
    //华为快门
    public void shutterBtn() {
        shutter_button.click();
    }


    //快门后对号
    public void savnBtn() {
        save_btn.click();
    }
    //华为快门后对号
    public void savnDoneBtn() {
        btn_done.click();
    }


    //点击确定按钮
    public void clickConfirm() {
        log.info("点击确定按钮");
        btn_right.click();
    }

    //    点击下一步
    public void clickNextStep() {
        log.info("点击下一步");
        next_step.click();
    }

    //    女用户注册，录音、约会吧app
    public void clickAudio(AndroidDriver driver, int x ,int y){
        log.info("点击下一步");
        Duration duration =Duration.ofSeconds(7);
        TouchAction action = new TouchAction(driver);
//        action.longPress(400,900,duration);
        action.longPress(x,y,duration);
        action.perform();
    }
    public void clickCancle() {
        log.info("点击取消按钮");
        btn_cancel.click();
    }
    //检验注册成功
    public String registerIsSuccess() {
        log.info("检验注册是否成功");
        return loginSuccess.getText();
    }
    //发送约会邀请
    public void sayHello() {
        log.info("发送约会邀请");
        say_hello_layout.click();
    }

    //开启约会管家
    public void msgManagerOk() {
        log.info("开启约会管家");
        msg_manager_ok.click();
    }

    //   ---- 注册后约会问答
    //点击第一个问题答案
    public void askInfo() {
        log.info("选择第一个答案："+askInfo.getText());
        askInfo.click();
    }

    public void clickLeftLoveImage() {
        log.info("点击左侧“喜欢Ta”");
        left_love_image.click();
    }
    public void clickRightLoveImage() {
        log.info("点击右侧“喜欢Ta”");
        right_love_image.click();
    }

    /**
     * 我的页面方法
     * 个人资料完善
     */

    public void clickBtnok() {
//        log.info("点击“确定”");
        btn_ok.click();
    }

    //点击跳过按钮
    public void clickSkip() {
        log.info("点击跳过按钮");
        if(doesWebElementExist(btn_right)){
            btn_right.click();
        }

    }


//    完善资料方法
    public void clickHeight() {
        height.click();
    }

    public void clickWeight() {
        weight.click();
    }

    public void clickBloodType() {
        bloodtype.click();
    }

    public void clickInfoSave() {
        save.click();
    }

    public void clickProperty() {
        log.info("点击个性特征");
        property.click();
    }

    public void clickHobby() {
        log.info("点击兴趣爱好");
        hobby.click();
    }

    public void clickNativePlace() {
        log.info("点击籍贯");
        nativeplace.click();
    }

    public void clickEducation() {
        education.click();
    }

    public void clickJob() {
        job.click();
    }

    public void clickIncome() {
        income.click();
    }

    public void clickPart() {
        part.click();
    }

    public void clickMaritalStatus() {
        maritalstatus.click();
    }

    public void clickHouse() {
        house.click();
    }

    public void clickYidilian() {
        yidilian.click();
    }

    public void clickOppositeSex() {
        oppositesex.click();
    }

    public void clickQinmi() {
        qinmi.click();
    }

    public void clickParent() {
        parent.click();
    }

    public void clickChild() {
        child.click();
    }

    public void clickSaveData() {
        log.info("点击保存");
        save.click();
    }

    //完善资料
    protected void personalData(AndroidDriver driver) throws Exception {
        log.info("完善个人资料");
        this.clickHeight();
        this.clickBtnok();
        this.clickWeight();
        this.clickBtnok();
        this.swipeToUp(driver);
        this.clickBloodType();
        this.clickBtnok();
        this.clickSaveData();
        Thread.sleep(1000);
        this.clickProperty();
//        this.swipeToUp(driver);
        this.clickHobby();
        this.clickSaveData();
        Thread.sleep(1000);
        this.clickNativePlace();
        this.clickBtnok();
        this.clickEducation();
        this.clickBtnok();
        this.clickJob();
        this.clickBtnok();
        this.clickIncome();
        this.clickBtnok();
        this.clickPart();
        this.clickBtnok();
        this.clickMaritalStatus();
        this.clickBtnok();
        this.clickHouse();
        this.clickBtnok();
        this.clickYidilian();
        this.clickBtnok();
        this.swipeToUp(driver);
        Thread.sleep(500);
        this.clickOppositeSex();
        this.clickBtnok();
        this.clickQinmi();
        this.clickBtnok();
        this.clickParent();
        this.clickBtnok();
        this.clickChild();
        this.clickBtnok();
        this.clickSaveData();

    }
    /**
     * 会员中心页面方法
     * 豆币，包月，VIP
      */

    //    点击会员中心
    public void clickMemberCenter() {
        log.info("点击会员中心");
        member_center.click();
    }

    //    点击会员中心
    public void clickRDMemberCenter() {
        log.info("点击会员中心");
        body_item_member.click();
    }

    public void clickBean() {
        log.info("点击豆币");
        bean.click();
    }

    public void clickBeanVip() {
        log.info("点击vip0元购");
        bean_vip.click();
    }

    public int getBeanNum() {
        log.info("获取初始豆币个数");
        String b = bean.getText().replace("豆币", "").replace("个", "");
        return Integer.parseInt(b);
    }

    public void clickWriteLetter() {
        log.info("点击写信包月");
        write_letters.click();
    }

    public void clickVipTitle() {
        log.info("点击星级服务");
        vip_title.click();
    }

    /**
     * 收信宝+上传头像
     */
    public void clickReceiveLetter() {
        log.info("点击收信宝");
        receive_letter.click();
    }

    public void clickUploadPic() {
        log.info("点击上传头像");
        uploadpic.click();
    }

    public void clickLocalPic() {
        log.info("选择本地照片");
        localpicture.click();
    }
    public void clickTakePic() {
        log.info("选择拍照");
        take_picture.click();
    }


    public void clickImg() {
        log.info("选择一个相册");
        img.click();
    }

    public void clickMonitorPic(AndroidDriver driver) {
        log.info("选择一张照片");
        TouchAction action = new TouchAction(driver);
        int width = driver.manage().window().getSize().width;
        action.tap(150, 300).perform();
    }

    public void clickImgOK() {
        log.info("选中照片");
        imgok.click();
    }

    public void swipeToDownPIC(AndroidDriver driver) {
        log.info("随机滑动照片");
        Duration duration = Duration.ofSeconds(1);
        Random rand = new Random();
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action1 = new TouchAction(driver).press(width / 2, height / 4).waitAction(duration).moveTo(width / 2, rand.nextInt(1080) + 1).release();
        action1.perform();
    }

    public void clickImgSure() {
        log.info("确认照片");
        imgsure.click();
    }

    public void clickDay1() {
        log.info("点击1天");
        day1.click();
    }

    public void clickDay3() {
        log.info("点击3天");
        day3.click();
    }

    public void clickDay7() {
        log.info("点击7天");
        day7.click();
    }

    public void clickDay15() {
        log.info("点击15天");
        day15.click();
    }

    public String getDay1Price() {
        log.info("获取1天价格");
        return day1.getAttribute("name");
    }

    public String getDay3Price() {
        log.info("获取3天价格");
        return day3.getAttribute("name");
    }

    public String getDay7Price() {
        log.info("获取7天价格");
        return day7.getAttribute("name");
    }

    public String getDay15Price() {
        log.info("获取15天价格");
        return day15.getAttribute("name");
    }

    //
    public void clickMonitorPay(AndroidDriver driver) {
        log.info("点击立即付款");
        TouchAction action = new TouchAction(driver);
        action.tap(490, 1670).perform();
    }
    public void clickMigu() {
        log.info("点击咪咕联合会员");
        migu.click();
    }

    //  以上为收信宝

    public void clickReload() {
        log.info("点击右上角刷新");
        btn_right.click();
    }

    public void clickXufei() {
        log.info("点击自动续费");
        xufei.click();
    }
    //    支付方式
    public void clickWecharPay() {
        log.info("选择 微信支付");
        wecharpay.click();
    }
    public void clickYinlianPay() {
        log.info("选择 银联支付");
        yinlianpay.click();
    }
    public void clickBean800() {
        log.info("点击800语音豆");
        bean800.click();
    }

    // 公共方法
    public String getBeanPrice(WebElement element) {
        log.info("获取语音豆价格");
        return element.getAttribute("name");
    }


    public String getBean800Price() {
        log.info("获取800语音豆价格");
        return bean800price.getAttribute("name");
    }


    public void clickBean800_3() {
        log.info("点击800语音豆");
        bean800_3.click();
    }
/*

    public String getBean800Price_3() {
        log.info("获取800语音豆价格");
        return bean800price_3.getAttribute("name");
    }
*/

    public void clickBean550() {
        log.info("点击550语音豆");
        bean550.click();
    }
    public void clickBean550_3() {
        log.info("点击550语音豆");
        bean550_3.click();
    }

  public String getBean550Price() {
      log.info("获取550语音豆价格");
      return bean550price.getAttribute("name");
  }

  public String getBean550Price_3() {
      log.info("获取550语音豆价格");
      return bean550price_3.getAttribute("name");
  }

    public void clickLetterVip() {
        log.info("点击3天vip0元购");
        letter_vip.click();
    }

    public void clickLetter90() {
        log.info("点击90天会员");
        letter90.click();
    }
    public void clickLetter90_3() {
        log.info("点击90天会员");
        letter90_3.click();
    }

    //公共方法
    public String getLetterPrice(WebElement element) {
        log.info("获取会员价格");
        return element.getAttribute("name");
    }


   public String getLetter90Price() {
        log.info("获取90天会员价格");
        return letter90price.getAttribute("name");
    }


    public String getLetter90Price_3() {
        log.info("获取90天会员价格");
        return letter90price_3.getAttribute("name");
    }

    public void clickLetter30() {
        log.info("点击30天会员");
        letter30.click();
    }

    public void clickLetter30_3() {
        log.info("点击30天会员");
        letter30_3.click();
    }

    public String getLetter30Price() {
        log.info("获取30天会员价格");
        return letter30price.getAttribute("name");
    }

    public String getLetter30Price_3() {
        log.info("获取30天会员价格");
        return letter30price_3.getAttribute("name");
    }
    public void clickLetter7() {
        log.info("点击7天会员");
        letter7.click();
    }
    public void clickLetter7_3() {
        log.info("点击7天会员");
        letter7_3.click();
    }

    public String getLetter7Price() {
        log.info("获取7天会员价格");
        return letter7price.getAttribute("name");
    }
    public String getLetter7Price_3() {
        log.info("获取7天会员价格");
        return letter7price_3.getAttribute("name");
    }
    public void clickNewVip(){
        log.info("点击签约领取VIP新手礼包");
        newvip.click();
    }

    //公共方法
    public String getVipprice(WebElement element) {
        log.info("获取90天vip价格");
        return element.getAttribute("name");
    }

    public void clickVip90() {
        log.info("点击90天vip");
        vip90.click();
    }
    public void clickVip90Danhao() {
        log.info("点击90天vip");
        vip90danhao.click();
    }
    public void clickVip90Shuanghao() {
        log.info("点击90天vip");
        vip90shuanghao.click();
    }

     public String getVip90price() {
         log.info("获取90天vip价格");
         return vip90.getAttribute("name");
     }

     public String getVip90priceDanhao() {
         log.info("获取90天vip价格");
         return vip90danhao.getAttribute("name");
     }
    public String getVip90priceShuanghao() {
        log.info("获取90天vip价格");
        return vip90shuanghao.getAttribute("name");
    }

    public void clickVip30() {
        log.info("点击30天vip");
        vip30.click();
    }
    public void clickVip30Danhao() {
        log.info("点击30天vip");
        vip30danhao.click();
    }
    public void clickVip30Shuanghao() {
        log.info("点击30天vip");
        vip30shuanghao.click();
    }

    public String getVip30price() {
        log.info("获取30天vip价格");
        return vip30.getAttribute("name");
    }
   public String getVip30priceDanhao() {
        log.info("获取30天vip价格");
        return vip30danhao.getAttribute("name");
    }
    public String getVip30priceShuanghao() {
        log.info("获取30天vip价格");
        return vip30shuanghao.getAttribute("name");
    }
    public void clickKaiTong() {
        log.info("点击立即开通");
        kaitong.click();
    }

    public String fukuan() {
//        支付宝确认付款
        return aliFuKuan.getText();
    }


    /**
     * 支付宝页面方法
     */

//    支付宝关闭免密
    public void clickAliMianMi() {
        log.info("点击 我已阅读并同意");
        alimianmi.click();
    }
    //    确认开通并支付
    public void clickAgreePay(){
        log.info("支付宝，确认开通并支付 页面，点击 确认开通并支付");
        agreepay.click();
    }

    public void clickAgree() {
        log.info("支付宝，同意协议并开通 页面，点击 同意协议并开通");
        agree.click();
    }
    public void clickMonitorAgree(AndroidDriver driver) {
        log.info("支付宝免密支付页面，点击 同意协议并开通");
        TouchAction action = new TouchAction(driver);
        action.tap(530, 1320).perform();
    }
    public void clickAliTips(){
        log.info("点击支付宝 支付 安全小提示");
        alianquantips.click();
    }
    public void clickAliChenggong(){
        log.info("点击支付宝 开通成功页 完成");
        wancheng.click();
    }
    //    点击支付宝 立即付款
    public void clickAliPayNow(){
        log.info("点击支付宝 立即付款");
        alipaynow.click();
    }

    // #   支付方式
    public void clickWecharBack() {
        log.info("微信返回");
        wechatBack.click();
    }


    //    支付成功后，返回按钮
    public void clickAliBack(){
        aliback.click();
    }

    //    点击成功支付页面，右上角完成
    public void clickAliRight() {
        aliright.click();
    }


    public void clickEnsure() {
//        支付宝确认放弃支付
        ensure.click();
    }

    public void clickAlipayBack() {
        log.info("点击支付宝付款页面 回退");
        alipayback.click();
    }
    public void clickH5AlipayClose() {
        log.info("点击 支付宝直接调起H5付款页面 关闭按钮");
        h5_close.click();
    }


    public void clickBack() {
        back.click();
    }
    public void clickMonitorBack(AndroidDriver driver) {
        log.info("支付宝免密签约成功页面，点击 返回");
        TouchAction action = new TouchAction(driver);
        action.tap(530, 1160).perform();
    }

    //    发送密码 杨学敏
    public void sendKeyA(AndroidDriver driver,int x,int y) {
        TouchAction action = new TouchAction(driver);
//        int width = driver.manage().window().getSize().width;
//        int height=driver.manage().window().getSize().height;
        action.tap(x, y).perform();
    }

    //    发送密码
    public void sendKeyA(AndroidDriver driver) {
        TouchAction action = new TouchAction(driver);
//        int width = driver.manage().window().getSize().width;
//        int height=driver.manage().window().getSize().height;
        action.tap(190, 1225).perform();
    }

    public void sendKeyB(AndroidDriver driver) {
        TouchAction action = new TouchAction(driver);
//        int width = driver.manage().window().getSize().width;
//        int height=driver.manage().window().getSize().height;
        action.tap(540, 1725).perform();
    }

    public void sendKeyC(AndroidDriver driver) {
        TouchAction action = new TouchAction(driver);
//        int width = driver.manage().window().getSize().width;
//        int height=driver.manage().window().getSize().height;
        action.tap(900, 1225).perform();
    }

    public void qianyueAlipay(AndroidDriver driver) throws Exception{
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickKaiTong();
        log.info("开始进入支付宝签约流程");
        this.waitElement(driver, alisurexieyi);
        this.clickAgree();
        this.waitElement(driver,alipaypwd_title);
        this.sendKeyA(driver);
        Thread.sleep(500);
        this.sendKeyA(driver);
        Thread.sleep(500);
        this.sendKeyA(driver);
        Thread.sleep(500);
        this.sendKeyB(driver);
        Thread.sleep(500);
        this.sendKeyA(driver);
        Thread.sleep(500);
        this.sendKeyC(driver);
        Thread.sleep(500);
//        this.clickAliTips();
        this.waitElement(driver, wancheng);
        this.clickAliChenggong();
        this.waitElement(driver, alipay);
        this.keyBack(driver);
        log.info("返回多名称app页面");
    }

    public void zhifuAlipay(AndroidDriver driver) throws Exception{
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickKaiTong();
        log.info("开始进入支付宝付费支付流程");
        this.waitElement(driver, agreepay);
        this.clickAliMianMi();
        this.clickAgreePay();
        Thread.sleep(3000);
        this.clickAliPayNow();
        Thread.sleep(2000);
        this.waitElement(driver,alipaypwd_title);
        this.sendKeyA(driver);
        Thread.sleep(500);
        this.sendKeyA(driver);
        Thread.sleep(500);
        this.sendKeyA(driver);
        Thread.sleep(500);
        this.sendKeyB(driver);
        Thread.sleep(500);
        this.sendKeyA(driver);
        Thread.sleep(500);
        this.sendKeyC(driver);
        Thread.sleep(500);
        this.clickAliTips();
        this.waitElement(driver, wancheng);
        this.clickAliChenggong();
        this.waitElement(driver, alipay);
        this.keyBack(driver);
        log.info("回退进入多名称app");
    }

    /**
     * 杨学敏
     * 0元签约，支付宝登陆状态
     *
     */
    public void zhifuLoginAlipay(AndroidDriver driver) throws Exception{
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickKaiTong();
        log.info("开始进入支付宝付费支付流程");
        this.waitElement(driver, agree);
        this.clickAgree();
//        Thread.sleep(3000);
        this.waitElement(driver,alipaypwd_title);
        this.sendKeyA(driver,540,1500);
        Thread.sleep(500);
        this.sendKeyA(driver,180,1500);
        Thread.sleep(500);
        this.sendKeyA(driver,540,1700);
        Thread.sleep(500);
        this.sendKeyA(driver,900,1350);
        Thread.sleep(500);
        this.sendKeyA(driver,540,1200);
        Thread.sleep(500);
        this.sendKeyA(driver,540,1200);
        Thread.sleep(500);
        this.clickAliTips();
        log.info("判断开通免密后，是否提示开通成功");
        this.waitElement(driver, wancheng);
        this.clickAliChenggong();
        log.info("开通免密后，提示开通成功");
        this.waitElement(driver, alipay);
        this.keyBack(driver);
        log.info("回退进入多名称app");
    }
    /**
     * ??方法
     */


    public String getCurrentActivity(AndroidDriver driver) {
        log.info("获取启动的APP名称");
        return driver.currentActivity();
    }


    //    通用判断元素是否存在
    public boolean doesWebElementExist(WebElement webElement) {
        try {
            return webElement.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void keyBack(AndroidDriver driver) {
        log.info("点击物理返回键");
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }


    public void waitElement(AndroidDriver driver, WebElement webelement) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 8);
        wait.until(ExpectedConditions.elementToBeClickable(webelement));
    }

    public void waitElementLoad(AndroidDriver driver, WebElement webelement) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.textToBePresentInElement(webelement, "1"));
    }
    //    修改环境方法
//    点击页面空白处（用于进入修改环境）
    public void clickMonitor(AndroidDriver driver) {
        log.info("点击页面空白处（用于进入修改环境）");
        TouchAction action = new TouchAction(driver);
        int width = driver.manage().window().getSize().width;
        action.tap(width - 10, 150).perform();
        action.tap(width - 10, 150).perform();
        action.tap(width - 10, 150).perform();
        action.tap(width - 10, 150).perform();

    }

    //      滑动选择所在地址,默认三线，下划选择北京
    public void swipeAddress(AndroidDriver driver) {
        log.info("滑动修改城市");
        Duration duration = Duration.ofSeconds(1);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action1 = new TouchAction(driver).press(200, 800).waitAction(duration).moveTo(200, 1200).release();
        action1.perform();
    }

    //      滑动选择所在地址,默认北京，上划选择3线
    public void swipeAddress3(AndroidDriver driver) {
        log.info("滑动修改城市");
        Duration duration = Duration.ofSeconds(1);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action1 = new TouchAction(driver).press(200, 950).waitAction(duration).moveTo(200, 690).release();
        action1.perform();
    }

    //  永远判断，下拉刷新后，列表上的 某些元素是否存在（死循环），如果不存在，则跳出该方法，继续后续方法
    public void waitElementInvisibility(WebElement webelement) throws Exception {
        for (int i = 0; i < 1; ) {
            if (!this.doesWebElementExist(webelement)) {
                break;
            }
        }
    }

    public void swipePic(AndroidDriver driver)throws Exception{
        log.info("滑动查看下一张照片");
        Duration duration = Duration.ofSeconds(1);
        TouchAction action1 = new TouchAction(driver);
//        .longPress(700, 650).waitAction(duration).moveTo(50, 650).perform();
//        TouchAction(driver).longPress(700, 650).waitAction(duration).moveTo(50, 650).perform();
        action1.longPress(1000, 650,duration).moveTo(50, 650);
        action1.release();
        action1.perform();
    }

    public void swipeToUp(AndroidDriver driver) {
        log.info("向上滑动屏幕");
        Duration duration = Duration.ofSeconds(1);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action1 = new TouchAction(driver).press(width / 2, height*3/4).waitAction(duration).moveTo(width / 2, height/4).release();
        action1.perform();
    }


}
