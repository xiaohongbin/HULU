package com.yhb.method;

import com.aventstack.extentreports.ExtentTest;
import com.listener.ExtentTestNGITestListener;
import com.yhb.page.PageElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Random;

public class ElementMethod extends PageElement {
    ExtentTestNGITestListener el = new ExtentTestNGITestListener();
    ExtentTest log = el.getlog();
    /*公共

        //    注册页面
    //   注册按钮或确定按钮
        public void clickBtnRegister() {
            log.info("点击注册按钮");
            btn_register.click();
        }

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
*/
//登陆按钮
    public void clickBtnLogin() {
        log.info("点击登陆按钮");
        if(doesWebElementExist(btn_login)){
            btn_login.click();
        }else{
            btn_right.click();
        }

    }
/*
公共
    //设置登录密码
    public void setPwd() {
        log.info("设置登录密码");
        id_edittext_phone.sendKeys("QWE123");
    }


    //    确定按钮
    public void clickBtnOk() {
        log.info("点击“确定”按钮");
        btn_ok.click();
    }
    //点击跳过按钮
    public void clickSkip() {
        log.info("点击跳过按钮");
        if(doesWebElementExist(btn_right)){
            btn_right.click();
        }

    }
*/

    //本地照片上传
    public void uploadLocalhostImage() {
        log.info("本地上传照片");
        upload_user_icon_localhost_images.click();
    }
    //选择相册
    public void clickIcon(AndroidDriver driver) {
        log.info("选择相册");
        new TouchAction(driver).tap(200,960).perform();
    }
//选择第一张照片
    public void clickFirstPic(AndroidDriver driver) throws Exception{
        log.info("选择第一张照片");

        new TouchAction(driver).tap(100,150).perform();

        System.out.println("选择第一张照片");
    }

    //选择第三张照片
    public void clickThreePic(AndroidDriver driver) throws Exception{
        log.info("选择第三张照片");

        new TouchAction(driver).tap(400,150).perform();

        System.out.println("选择第三张照片");
    }

 /* 公共  //拍照
    public void clickPhotos() {
        upload_user_icon_take_photos.click();
    }

    //快门
    public void cameraBtn() {
        camera_shutter_middle_button.click();
    }
    //快门后对号
    public void savnBtn() {
        save_btn.click();
    }


    //点击确定按钮
    public void clickConfirm() {
        log.info("点击确定按钮");
        btn_right.click();
    }
*/
    //确定按钮文本
    public String confirmContent() {
        log.info("选中照片后"+btn_right.getText());
        return btn_right.getText();
    }
/*
公共
//    点击下一步
    public void clickNextStep() {
        log.info("点击下一步");
        next_step.click();
    }


    //    女用户注册，录音
    public void clickAudio(AndroidDriver driver){
        log.info("点击下一步");
        Duration duration =Duration.ofSeconds(7);
        TouchAction action = new TouchAction(driver);
        action.longPress(400,900,duration);
        action.perform();
    }


    //检验注册成功
    public String registerIsSuccess() {
        log.info("检验注册是否成功");
        return loginSuccess.getText();
    }


    //注册成功后点击知道了
    public void btnIknow() {
        log.info("注册成功点击我知道了");
        btn_i_know.click();
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
*/
    //我的是否存在
    public boolean topMe() {
        return doesWebElementExist(top_me);
            //log.info("开启约会管家成功");
    }

    //点击我的tab
    public void clickMe(){
        log.info("点击“我的”tab");
        top_me.click();
    }


/*
公共
    //返回
    public void clickBtnBack() {
        log.info("点击返回按钮");
        btn_left.click();
    }

    //注册成功页面title
    public String getTitleName() {
        log.info("页面title判断");
        return title_name.getText();

    }
*/

    //注册手机号认证弹框-取消
    public void btn_pv_dialog_yuanfen_1() {
        log.info("注册后手机号认证弹框-稍后认证");
        if(doesWebElementExist(btn_pv_dialog_yuanfen_1)){
            btn_pv_dialog_yuanfen_1.click();;
        }
    }

    //注册手机号认证弹框-马上认证
    public void btn_pv_dialog_yuanfen_2() {
        log.info("注册后手机号认证弹框-马上认证");
        if(doesWebElementExist(btn_pv_dialog_yuanfen_2)){
            btn_pv_dialog_yuanfen_2.click();;
        }

    }


    //登陆-账号
    public void sendAccount() {
        log.info("点击返回按钮");
        input_account.sendKeys("848593472");
    }

    //登陆-密码
    public void sendPwd() {
        log.info("点击返回按钮");
        input_password.sendKeys("QWE123321");
    }


/*
公共
    //   ---- 注册后约会问答
    //点击第一个问题答案
    public void askInfo() {
        log.info("选择第一个答案："+askInfo.getText());
        askInfo.click();
    }
*/

//---------------注册后完善个人信息

//基本资料完善
    public String basicInformationText() {
        log.info("基本资料tab");
        return basic_information_text.getText();
    }

    //基本资料比例
    public String basicTnformationPercent() {
        log.info("基本资料的比例");
        return basic_information_percent.getText();
    }

//点击昵称
    public void clickName() {
        log.info("点击昵称");
        name.click();
    }

    //修改昵称
    public void editName() {
        log.info("修改昵称");
        editName.sendKeys("雨季");
    }
//确定按钮
    public void btnOk() {
        log.info("点击确定按钮");
        btnOk.click();
    }

 //修改后昵称判断
    public void nameIsRight() {
        Assert.assertEquals(name.getText(),"雨季","昵称保存不正确");
        log.info("修改后昵称:"+name.getText());
    }

//生日
    public void getBirthday() {
        log.info("获取生日");
        Assert.assertEquals(birthday.getText(),"1993-02-02","生日保存不正确");
        log.info("修改后生日:"+birthday.getText());
    }

    public void clickBirthday() {
        log.info("点击生日");
        birthday.click();
    }

//年龄
    public void getAge() {

        Assert.assertEquals(age.getText(),"25","年龄显示不正确");
        log.info("获取年龄:"+age.getText());
    }

//星座
    public void getConstellation() {

        Assert.assertEquals(constellation.getText(),"水瓶座","星座显示不正确");
        log.info("获取星座:"+constellation.getText());
    }

//居住地
    public void clickUpgraded() {

        Assert.assertEquals(domicile.getText(),"北京市区","居住地显示不正确");
        log.info("居住地:"+domicile.getText());
    }
//身高
    public void clickHigh() {
        log.info("编辑身高");
        high.click();
    }

    public void highIsRight() {
        Assert.assertEquals(high.getText(),"171cm","身高显示不正确");
        log.info("身高:"+high.getText());
    }

//体重
    public void clickWeight() {
        log.info("编辑体重");
        weight.click();
    }

    public void weightIsRight() {
        Assert.assertEquals(weight.getText(),"131斤","体重显示不正确");
        log.info("体重:"+weight.getText());
    }
//血型
    public void clickBloodType() {
        log.info("编辑血型");
        blood_type.click();
    }

    public void bloodTypeIsRight() {
        Assert.assertEquals(blood_type.getText(),"B","血型显示不正确");
        log.info("血型:"+blood_type.getText());
    }


    //下一步保存基本资料
    public void clickSave() {
        save.click();
        log.info("基本资料保存成功");
    }

    //个性爱好tab
    public String specificCharacterText() {
        log.info("个性爱好tab");
        return specific_character_text.getText();
    }

    //个性爱好比例
    public String specificCharacterPercent() {
        log.info("个性爱好的比例");
        return specific_character_percent.getText();
    }


//选中个性特征
    public void clickSpecific() {
        log.info("选中“感性”");
        specific.click();
    }

    //选中兴趣爱好
    public void clickHobbies() {
        log.info("选中“宠物”");
        hobbies.click();
    }


    //详细信息tab
    public String detailInformationText() {
        log.info("详细信息tab");
        return detail_information_text.getText();
    }

    //详细信息比例
    public String detailInformationPercent() {
        log.info("详细信息比例");
        return detail_information_percent.getText();
    }

    public void getInfoContent1() {
        log.info("修改详细信息-籍贯");
        info_content.get(0).click();
    }

//籍贯
    public void isRightInfoContent1() {
        Assert.assertEquals(info_content.get(0).getText(),"北京市区","籍贯保存不正确");
        log.info("籍贯保存正确："+info_content.get(0).getText());
    }

    public void getInfoContent2() {
        log.info("修改详细信息-学历");
        info_content.get(1).click();
    }

    //学历
    public void isRightInfoContent2() {
        Assert.assertEquals(info_content.get(1).getText(),"高中及中专","学历保存不正确");
        log.info("学历保存正确："+info_content.get(1).getText());
    }

    public void getInfoContent3() {
        log.info("修改详细信息-职业");
        info_content.get(2).click();
    }
    //    职业
    public void isRightInfoContent3() {
        Assert.assertEquals(info_content.get(2).getText(),"在校学生","职业保存不正确");
        log.info("职业保存正确："+info_content.get(2).getText());
    }
    public void getInfoContent4() {
        log.info("修改详细信息-收入");
        info_content.get(3).click();
    }
//收入
    public void isRightInfoContent4() {
        Assert.assertEquals(info_content.get(3).getText(),"小于2000元","收入保存不正确");
        log.info("收入保存正确："+info_content.get(3).getText());
    }
    public void getInfoContent5() {
        log.info("修改详细信息-魅力部位");
        info_content.get(4).click();
    }
//美丽部位
    public void isRightInfoContent5() {
        Assert.assertEquals(info_content.get(4).getText(),"笑容","魅力部位保存不正确");
        log.info("魅力部位保存正确："+info_content.get(4).getText());
    }

    public void getInfoContent6() {
        log.info("修改详细信息-情感状况");
        info_content.get(5).click();
    }

    //情感状况
    public void isRightInfoContent6() {
        Assert.assertEquals(info_content.get(5).getText(),"保密","情感状况保存不正确");
        log.info("情感状况保存正确："+info_content.get(5).getText());
    }

    public void getInfoContent7() {
        log.info("修改详细信息-住房情况");
        info_content.get(6).click();
    }
//住房情况
    public void isRightInfoContent7() {
        Assert.assertEquals(info_content.get(6).getText(),"已购房","住房情况保存不正确");
        log.info("住房情况保存正确："+info_content.get(6).getText());
    }

    public void getInfoContent8() {
        log.info("修改详细信息-接受异地恋");
        info_content.get(7).click();
    }
    //接受异地恋
    public void isRightInfoContent8() {
        Assert.assertEquals(info_content.get(7).getText(),"能","接受异地恋保存不正确");
        log.info("接受异地恋保存正确："+info_content.get(7).getText());
    }
    public void getInfoContent9() {
        log.info("修改详细信息-喜欢的异性");
        info_content.get(8).click();
    }

//喜欢的异性
    public void isRightInfoContent9() {
        Assert.assertEquals(info_content.get(8).getText(),"成熟魅力","喜欢的异性保存不正确");
        log.info("喜欢的异性保存正确："+info_content.get(8).getText());
    }

    public void getInfoContent10() {
        log.info("修改详细信息-接受亲密行为");
        info_content.get(8).click();
    }
    //接受亲密行为
    public void isRightInfoContent10() {
        Assert.assertEquals(info_content.get(8).getText(),"能","接受亲密行为保存不正确");
        log.info("接受亲密行为保存正确："+info_content.get(8).getText());
    }

    public void getInfoContent11() {
        log.info("修改详细信息-约会经历");
        info_content.get(9).click();
    }
    //约会经历
    public void isRightInfoContent11() {
        Assert.assertEquals(info_content.get(9).getText(),"没约过","约会经历保存不正确");
        log.info("约会经历保存正确："+info_content.get(9).getText());
    }

    public void getInfoContent12() {
        log.info("修改详细信息-约会目的");
        info_content.get(10).click();
    }
    //约会目的
    public void isRightInfoContent12() {
        Assert.assertEquals(info_content.get(10).getText(),"结交知己","约会目的保存不正确");
        log.info("约会目的保存正确："+info_content.get(10).getText());
    }
   /*公共 //点击左上角的我的
    public void clickTopMe() {
        log.info("点击左上角的我的");
        top_me_layout.click();
    }
*/
    //点击九宫格-约会信息
    public void clickBodyItem_9() {
        log.info("点击九宫格-约会信息");
        body_item_9.click();
    }

  //-----------------------首页
  //首页用户主页居住地策略
    public String memberMonologue() {
        log.info("首页用户主页居住地策略");
        System.out.println("==============="+member_monologue.getText());
        return member_monologue.getText();
    }

    //首页用户主页居住地
    public String memberArea() {
        log.info("首页用户主页居住地");
        return member_area.getText();
    }

    //喜欢或不喜欢操作后判断用户昵称
    public String geUserName() {
        log.info("首页用户主页-昵称");
        return user_name.getText();
    }

    //不喜欢操作
    public void nextBtn() {
        log.info("首页用户主页-不喜欢操作");
        next_button.click();
    }

    //喜欢操作
    public void clickAskBtn() {
        log.info("首页用户主页-喜欢操作");
        ask_button.click();
    }

//----------------------消息
    //点击右上角的消息按钮
    public void topMessageBtn() {
        log.info("首页消息入口");
        top_message_layout.click();
    }

    //    右上角的消息按钮旁的红色未读消息数
    public boolean imgLook() {
        log.info("首页未读消息");
        return doesWebElementExist(img_look);
    }

    //    消息页面，私信tab旁未读消息
    public boolean imgLook2() {
        log.info("私信tab的未读消息标识");
        return doesWebElementExist(img_look2);
    }

    //    私信tab的管理员头像，进入消息详情页面
    public void userIconBtn() {
        log.info("点击私信tab的消息进入详情页面");
        user_icon.click();
    }

    //    消息页面完善资料入口
    public void adImageBtn() {
        log.info("消息页面完善资料入口");
        ad_image_view.click();
    }


    //    消息页面下方猜你感兴趣列表-约TA按钮
    public void sayHelloBtn() throws Exception {
        log.info("消息页面下方猜你感兴趣列表-点击约TA按钮");

        Assert.assertTrue(sayhello.get(1).isEnabled(),"点击前,“约TA”按钮为可操作样式");
        log.info("点击前,“约TA”按钮为可操作样式");
        //点击约TA按钮
        sayhello.get(1).click();
        Thread.sleep(3000);

        Assert.assertTrue(sayhello.get(1).isDisplayed(),"点击后,“约TA”按钮变为只读样式");
        log.info("点击后,“约TA”按钮变为只读样式");
    }

//---------------我的-诚信等级
    public void body_item_2() {
        log.info("进入诚信等级");
        body_item_2.click();
    }
    //快捷身份认证
    public void identity_auth_button() {
        log.info("快捷身份认证");
        identity_auth_button.click();
    }
    //手机认证
    public void phone_auth_button() {
        log.info("手机认证");
        phone_auth_button.click();
    }
    //上传本人3张照片
    public void upload_photo_button() {
        log.info("上传本人3张照片");
        upload_photo_button.click();
    }
    //资料完善到达90%
    public void information_button() {
        log.info("资料完善到达90%");
        information_button.click();
    }
    //快捷身份认证-完善资料
    public void setting_identity_auth_information_layout() {
        log.info("快捷身份认证-完善资料");
        setting_identity_auth_information_layout.click();
    }
    //快捷身份认证-上传头像
    public void setting_identity_auth_upload_user_icon_layout() {
        log.info("快捷身份认证-上传头像");
        setting_identity_auth_upload_user_icon_layout.click();
    }
    //快捷身份认证-验证手机号
    public void setting_identity_auth_check_phone_number_layout() {
        log.info("快捷身份认证-验证手机号");
        setting_identity_auth_check_phone_number_layout.click();
    }
    //快捷身份认证-上传头像-选择第一张图片
    public void id_item_image() {
        log.info("选择第一张照片");
        id_item_image.get(1).click();
    }
    //我的相册
    public void body_item_4() {
        log.info("进入我的相册");
        body_item_4.click();
    }
    //我的相册照片数量
    public int imageNum() {
        log.info("我的相册照片数量");
        return image_view_check.size()-1;
}
    //我的相册-添加照片
    public void image_view_check() {
        log.info("点击“添加照片”按钮");
        image_view_check.get(0).click();
    }
    //我的相册-添加照片-选择第一张照片
    public void id_item_select(int i) {
        log.info("选择第一张照片");
        id_item_select.get(i).click();
    }

    //约会要求
    public void body_item_1() {
        log.info("进入约会要求");
        body_item_1.click();
    }
    //约会要求-所在地
    public void myspace_location_view() {
        log.info("进入约会要求-点击所在地");
        myspace_location_view.click();
    }

    //约会要求-所在地文案
    public String myspace_location() {
        log.info("进入约会要求-显示所在地");
        return myspace_location_view.getText();
    }

    //约会要求-年龄
    public void myspace_he_age_view() {
        log.info("进入约会要求-点击年龄");
        myspace_he_age_view.click();
    }

    //约会要求-年龄文案
    public String myspace_he_age() {
        log.info("进入约会要求-显示所在地");
        return myspace_he_age_view.getText();
    }
    //约会要求-身高
    public void myspace_info_height_view() {
        log.info("进入约会要求-点击身高");
        myspace_info_height_view.click();
    }

    //约会要求-身高文案
    public String myspace_info_height() {
        log.info("进入约会要求-显示身高");
        return myspace_info_height_view.getText();
    }
    //自我介绍
    public void body_item_5() {
        log.info("进入自我介绍");
        body_item_5.click();
    }

    //自我介绍-判断“未录制”文案是否存在
    public boolean introduce_myself_hint() {
       return doesWebElementExist(introduce_myself_hint);
    }

    //长按语音
    public void longPress(AndroidDriver driver){
        //长按录音
        Duration duration =Duration.ofSeconds(8);
        TouchAction action = new TouchAction(driver);
        action.longPress(350,950,duration);
        action.perform();
    }
    //自我介绍-按住语音-提交
    public void id_bt_voice_commit() {
        log.info("自我介绍-按住语音后-提交");
        id_bt_voice_commit.click();
    }
    //问答游戏
    public void body_item_3() {
        log.info("问答游戏");
        body_item_3.click();
    }
    //问答游戏-答题获得缘分
    public void matching_qa_none_btn() {
        log.info("问答游戏-点击答题获得缘分");
        matching_qa_none_btn.click();
    }
    //问答游戏-答题获得缘分-获取问题标题
    public String quesdtion_title() {
        log.info("问题标题:"+quesdtion_title.getText());
        return quesdtion_title.getText();
    }
    //问答游戏-答题获得缘分-选中答案并返回
    public String setting_item_name() {
        log.info("问答游戏-选择第3个答案："+setting_item_name.get(2));
        setting_item_name.get(2).click();
        return setting_item_name.get(2).getText();
    }
    //问答游戏-选中答案提交
    public void qa_send_question_id() {
        log.info("问答游戏-选中答案提交");
        qa_send_question_id.click();
    }
    //问答游戏-换一题
    public void qa_change_question_id() {
        log.info("问答游戏-换一题");
        qa_change_question_id.click();
    }
    //问答游戏-列表对号
    public boolean duihao() {
        return doesWebElementExist(duihao);
    }
    //问答游戏-列表问题答案
    public String answer() {
        log.info("问答游戏-问题答案："+answer.getText());
        return answer.getText();
    }
    /* 公共
       //----------------会员中心
       public void body_item_8() {
           log.info("进入会员中心");
           body_item_8.click();
       }

      public void clickReload() {
           log.info("点击右上角刷新/跳过");
           reload.click();
       }
      public void clickBean() {
        log.info("刷新页面");
        bean.click();
      }


     public void clickBean550() {
        log.info("点击550语音豆");
        bean550.click();
     }

    public String getBean550Price() {
        log.info("获取550语音豆价格");
        return bean550price.getAttribute("name");
    }
    public void clickBean800() {
        log.info("点击800语音豆");
        bean800.click();
    }
    public String getBean800Price() {
        log.info("获取800语音豆价格");
        return bean800price.getAttribute("name");
    }
    public void clickWriteLetters() {
        log.info("点击写信包月");
        write_letters.click();
    }
*/
    public void clickLetterVip() {
        log.info("点击3天vip9元购");
        letter_vip.click();
    }
/*
公共
    public void clickLetter90() {
        log.info("点击90天会员");
        letter90.click();
    }

    public String getLetter90Price() {
        log.info("获取90天会员价格");
        return letter90price.getAttribute("name");
    }


    public void clickLetter30() {
        log.info("点击30天会员");
        letter30.click();
    }

    public String getLetter30Price() {
        log.info("获取30天会员价格");
        return letter30price.getAttribute("name");
    }


    public void clickLetter7() {
        log.info("点击7天会员");
        letter7.click();
    }

    public String getLetter7Price() {
        log.info("获取7天会员价格");
        return letter7price.getAttribute("name");
    }


    public void vipClick() {
        log.info("点击vip");
        vip.click();
    }

    public void clickVip90() {
        log.info("点击90天vip");
        vip90.click();
    }

    public String getVip90price() {
        log.info("获取90天vip价格");
        System.out.println("name:"+vip90.getAttribute("name"));
        return vip90.getAttribute("name");
    }


    public void clickVip30() {
        log.info("点击30天vip");
        vip30.click();
    }

    public String getVip30price() {
        log.info("获取30天vip价格");
        return vip30.getAttribute("name");
    }

    */
/*
    public void clickReceiveLetter() {
        log.info("点击收信宝");
        receive_letter.click();
    }

    public void clickUploadPic() {
        log.info("点击上传头像");
        uploadpic.click();
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

    public void clickKaiTong() {
        log.info("点击立即开通");
        kaitong.click();
    }
*/
    public void clickMigu() {
        log.info("点击咪咕");
        migu.click();
    }
    public void clickDingGou() {
        log.info("点击订购咪咕约会吧VIP会员");
        dinggou.click();
    }
    public void clickZhuanQu() {
        log.info("点击进入咪咕游戏联合会员专区");
        zhuanqu.click();
    }

    //    支付方式
    public String getBaoYue() {
        log.info("获取价格");
        System.out.println("获取咪咕会员价格："+baoyue.getAttribute("name"));
        return baoyue.getAttribute("name");
    }
    public boolean hasGame() {
        log.info("是否进入咪咕游戏联合会员专区");
        return doesWebElementExist(game);
    }
    public void clickSet() {
        log.info("点击设置");
        set.click();
    }
    public void clickUserinfo() {
        log.info("点击用户信息");
        userinfo.click();
    }

    public String getUserName() {
        log.info("用户账号："+userinfo_username.getText());
        return userinfo_username.getText();
    }
    public void clickModify() {
        log.info("点击修改按钮");
        modify_button.click();
    }
    public void setNewPwd() {
        log.info("输入新密码："+"aaa123456");
        password.clear();
        password.sendKeys("aaa123456");
    }
    public void clickSubmit() {
        log.info("点击保存按钮");
        btn_submit.click();
    }
    public String account() {
        log.info("登陆账号："+inputAccount.getText());
        return inputAccount.getText();
    }
    public void password() {
        log.info("登陆密码："+"aaa123456");
        inputPassword.clear();
        inputPassword.sendKeys("aaa123456");

    }
    //缘分小助手
    public void clickTypeSelect() {
        log.info("缘分小助手选择问题类型");
        QA_type_select_tv.click();
    }
    public String typeSelect() {
        log.info("缘分小助手问题类型："+QA_type_select_tv.getText());
        return QA_type_select_tv.getText();
    }
    public void clickType() {
        QA.get(1).click();
    }

    public String QAContent() {
//        log.info("问题类型/问题："+QA.get(1).getText());
        return QA.get(1).getText();
    }
    public void clickSelectQA1() {
        log.info("点击问题1");
        QA_content_select_tv.click();
    }

    public String QA1() {
        log.info("问题1："+QA_content_select_tv.getText());
        return QA_content_select_tv.getText();
    }
    public void clickSelectQA2() {
        log.info("点击问题2");
        QA2_content_select_tv.click();
    }

    public String QA2() {
        log.info("问题2："+QA2_content_select_tv.getText());
        return QA2_content_select_tv.getText();
    }
    public void clickOK() {
        log.info("点击开启小助手按钮");
        ok.click();
    }
    public void clickYueTA() {
        log.info("男用户登陆后每日推荐-约TA");
        yue_ta_2.click();
    }
    public  String getName(){
        log.info("用户昵称："+right_name.getText());
        return right_name.getText();
    }



    public void swipeToDown(AndroidDriver driver) {
        log.info("向下滑动屏幕");
        Duration duration = Duration.ofSeconds(1);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action1 = new TouchAction(driver).press(width / 2, height / 4).waitAction(duration).moveTo(width / 2, height * 3 / 4).release();
        action1.perform();
    }
/*  公共
    public void swipeToUp(AndroidDriver driver) {
        log.info("向上滑动屏幕");
        Duration duration = Duration.ofSeconds(1);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action1 = new TouchAction(driver).press(width / 2, height*3/4).waitAction(duration).moveTo(width / 2, height/4).release();
        action1.perform();
    }*/

    public void swipeToUpSecend(AndroidDriver driver,int x, int y,int y1) {
        log.info("小范围向上滑动屏幕");
        Duration duration = Duration.ofSeconds(1);
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action1 = new TouchAction(driver).press(x, y).waitAction(duration).moveTo(x, y1).release();
        action1.perform();
    }

/*  公共
     public void keyBack(AndroidDriver driver) {
        log.info("点击物理返回键");
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }

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



    public void waitElement(AndroidDriver driver, WebElement webelement) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(webelement));
    }

*/
}
