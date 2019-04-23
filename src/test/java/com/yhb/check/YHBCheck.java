package com.yhb.check;

import com.aventstack.extentreports.ExtentTest;
import com.listener.ExtentTestNGITestListener;
import com.yhb.method.ElementMethod;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;

public class YHBCheck extends ElementMethod {

    ExtentTestNGITestListener el = new ExtentTestNGITestListener();
    ExtentTest log = el.getlog();

    //男用户注册  899633590  aaa123456
    public void manRegister(AndroidDriver driver) throws Exception {
//        this.clickBtnRegister();
        this.clickBtnMen();
        this.clickRegister();
        this.waitElement(driver,title_name);
        this.setPwd();
        this.clickBtnok();
        this.waitElement(driver,title_name);
        //拍照
        this.clickPhotos();
        if(this.doesWebElementExist(shutter_button)){
            //华为拍照
            this.shutterBtn();
        }else{
            this.cameraBtn();
        }
        Thread.sleep(3000);
        if(this.doesWebElementExist(btn_done)){
            //华为拍照
            this.savnDoneBtn();
        }else {
            this.savnBtn();
        }

        this.waitElement(driver,btn_right);
        this.clickConfirm();
        Thread.sleep(3000);
        this.clickNextStep();
//        Thread.sleep(2000);
        this.waitElement(driver,title_name);
        if (!this.getTitleName().equals("约会信息")) {
            Assert.fail("男用户注册成功后，没有进入完善约会信息页面");
        }
        log.info("进入约会信息页面");
        this.clickReload();
        if(this.doesWebElementExist(title_name)) {
            if (this.getTitleName().contains("约会问答")) {
                this.dateAndAnswer(driver);
            }
        }else if (!this.doesWebElementExist(top_me)) {
            Assert.fail("注册后，无5个匹配问题，没有进入首页！");
        }
        log.info("进入约会吧首页");
    }

    //女用户注册
    public void womenRegister(AndroidDriver driver)throws Exception{
        this.clickBtnWomen();
        this.clickRegister();
        this.waitElement(driver,title_name);
        this.setPwd();
        this.clickBtnok();

        Thread.sleep(3000);
        this.swipeToUp(driver);

        /*this.uploadLocalhostImage();  //上传照片
        this.clickIcon(driver);
        Thread.sleep(2000);
        this.clickThreePic(driver);*/
        this.clickPhotos();
        if(this.doesWebElementExist(shutter_button)){
            this.shutterBtn();
        }else
            this.cameraBtn();
        if(this.doesWebElementExist(btn_done)){
            this.savnDoneBtn();
        }else
            this.savnBtn();

        this.clickConfirm();
        Thread.sleep(5000);

        this.clickAudio(driver,500,1300);
        Thread.sleep(2000);

        this.waitElement(driver,loginSuccess);
        log.info("判断是否注册成功");
        if (!this.registerIsSuccess().equals("恭喜你注册成功！")) {
            Assert.fail("女用户注册失败");
        }

        this.clickIKnown();
        //点击知道了按钮后
        Thread.sleep(1000);
        if(!this.doesWebElementExist(say_hello_layout)){
            log.fail("注册成功没有进入附近打招呼页面");
        }
//        this.clickReload();
        for(int i=0;i<4;i++){
            this.clickImageIcon(i);
        }
        this.sayHello();
        Thread.sleep(2000);
        String name= this.getTitleName();
        if(name.equals("约会管家")){
            this.msgManagerOk();
            Thread.sleep(2000);
            Assert.assertTrue(this.topMe(),"开启约会管家失败！");
        }
        log.info("女用户注册成功进入首页");
        /*this.keyBack(driver);
        this.waitElement(driver,topview);
        log.info("判断是否进入缘分模块");
        if (!this.getTopView().equals("缘分")) {
            Assert.fail("登录成功后，未进入缘分模块");
        }*/
    }

    //登陆
    public void login()throws Exception {
        this.clickBtnLogin();
        this.sendAccount();
        this.sendPwd();
        this.clickBtnLogin();
    }

    //男用户登陆公共接口
    public void manLogin()throws Exception{
        this.clickBtnMen();
        this.clickRegister();
        Thread.sleep(3000);
        log.info("设置登陆密码");
        this.setPwd();
        this.clickBtnok();

        Thread.sleep(3000);
        this.clickSkip();

    }

    //女用户登陆公共接口
    public void girlLogin(AndroidDriver driver)throws Exception{
        this.clickRegister();
        this.clickBtnWomen();
        this.clickRegister();
        Thread.sleep(3000);
        log.info("设置登陆密码");
        this.setPwd();
        this.clickBtnok();

        Thread.sleep(3000);
        this.keyBack(driver);
        this.keyBack(driver);
        this.clickSkip();
        this.waitElement(driver,title_name);
        this.clickBtnLeft();

    }

    //注册后完善个人基本资料
    public void perfectInformation(AndroidDriver driver)throws Exception{
        this.waitElement(driver,title_name);
        if (!this.getTitleName().equals("约会信息")) {
            Assert.fail("男用户注册成功后，没有进入完善约会信息页面");
        }else{ //完善个人信息
            if(this.basicInformationText().equals("基本资料")&&this.basicTnformationPercent().equals("5/8")){
                //修改基本资料
                basicInfomation(driver);
                Thread.sleep(2000);
                if(this.specificCharacterText().equals("个性爱好")&&this.specificCharacterPercent().equals("0/2")){
                    specificCharacter(driver);  //修改个性爱好
                    Thread.sleep(2000);
                    if(this.detailInformationText().equals("详细信息")&&this.detailInformationPercent().equals("0/12")){
                        detailInformation(driver);  //修改详细信息
                    }else{
                        log.info("详细信息/比例初始化不正确");
                    }

                }else{
                    log.info("个性爱好/比例初始化不正确");
                }

            }else{
                    log.info("基本资料/比例初始化不正确");
            }
        }

    }

    //修改基本资料
    public  void basicInfomation(AndroidDriver driver) throws Exception{
        //修改基本资料-昵称
        this.clickName();
        this.editName();
        this.btnOk();
        this.nameIsRight();
        //修改基本资料-生日
//        this.clickBirthday();
//        new TouchAction(driver).tap(230,700).perform();
//        new TouchAction(driver).tap(340,700).perform();
//        new TouchAction(driver).tap(450,700).perform();
//        //Thread.sleep(8000);
//        this.btnOk();
        this.getBirthday();
        this.getAge();
        this.getConstellation();  //星座
        this.clickUpgraded(); //居住地
        //修改基本资料-身高
        this.clickHigh();
        this.btnOk();
//        this.highIsRight();
        //修改基本资料-体重
        this.clickWeight();
//        new TouchAction(driver).tap(360,730).perform();
//        Thread.sleep(2000);
        this.btnOk();
//        this.weightIsRight();
        //修改基本资料-血型
        this.clickBloodType();
//        new TouchAction(driver).tap(360,730).perform();
//        Thread.sleep(2000);
        this.btnOk();
//        this.bloodTypeIsRight();

        if(this.basicTnformationPercent().equals("8/8")){
            log.info("基本资料编辑完成，8/8");
        }else{
            Assert.fail("基本资料编辑失败："+this.basicTnformationPercent());
        }
        this.clickSave();
    }

    //修改个性爱好
    public  void specificCharacter(AndroidDriver driver) throws Exception{
        this.clickSpecific();  //选中个性特征
        if(this.specificCharacterPercent().equals("1/2")){
            log.info("个性爱好比例正确，1/2");
        }else{
            Assert.fail("个性爱好比例不正确："+this.specificCharacterPercent());
        }
        this.swipeToUp(driver);
        this.swipeToUp(driver);
        this.clickHobbies();  //选中兴趣爱好
        if(this.specificCharacterPercent().equals("2/2")){
            log.info("个性爱好比例正确，2/2");
        }else{
            Assert.fail("个性爱好比例不正确："+this.specificCharacterPercent());
        }
        this.clickSave();
    }

    //修改详细信息
    public  void detailInformation(AndroidDriver driver) throws Exception{
        this.getInfoContent1();
        this.btnOk();
        this.isRightInfoContent1();

        this.getInfoContent2();
        this.btnOk();
        this.isRightInfoContent2();

        this.getInfoContent3();
        this.btnOk();
        this.isRightInfoContent3();

        this.getInfoContent4();
        this.btnOk();
        this.isRightInfoContent4();

        this.getInfoContent5();
        this.btnOk();
        this.isRightInfoContent5();

        this.getInfoContent6();
        this.btnOk();
        this.isRightInfoContent6();

        this.getInfoContent7();
        this.btnOk();
        this.isRightInfoContent7();

        this.getInfoContent8();
        this.btnOk();
        this.isRightInfoContent8();

        this.getInfoContent9();
        this.btnOk();
        this.isRightInfoContent9();

        this.swipeToUp(driver);

        this.getInfoContent10();
        this.btnOk();
        this.isRightInfoContent10();

        this.getInfoContent11();
        this.btnOk();
        this.isRightInfoContent11();

        this.getInfoContent12();
        this.btnOk();
        this.isRightInfoContent12();

        System.out.println("比例："+this.detailInformationPercent());
        if(this.detailInformationPercent().equals("12/12")){
            log.info("详细信息比例正确，12/12");
        }else{
            Assert.fail("详细信息比例不正确："+this.detailInformationPercent());
        }

        this.clickSave();
        if(this.getTitleName().equals("约会问答(1/5)")){
            log.info("个人信息完善成功");
        }else{
            Assert.fail("个人信息保存成功，但是没有进入约会问答页面");
        }

        this.keyBack(driver);
        this.waitElement(driver,top_bar);

        this.clickTopMe();
        this.clickBodyItem_9();
        Assert.assertEquals(this.getTitleName(),"约会信息(95%)","约会信息保存不正确");
        log.info("回到我的主页验证-约会信息保存正确");
        Assert.assertEquals(this.basicTnformationPercent(),"8/8","约会信息-基本资料保存不正确");
        log.info("回到我的主页验证约会信息-基本资料保存正确");
        Assert.assertEquals(this.specificCharacterPercent(),"2/2","约会信息-个性爱好保存不正确");
        log.info("回到我的主页验证约会信息-个性爱好保存正确");
        Assert.assertEquals(this.detailInformationPercent(),"12/12","约会信息-详细信息保存不正确");
        log.info("回到我的主页验证约会信息-详细信息保存正确");


    }

    //男注册后回答约会问答
    public void dateAndAnswer(AndroidDriver driver)throws Exception{
        this.waitElement(driver,title_name);
        String title = this.getTitleName();
        Assert.assertEquals(title,"约会问答(1/5)","没有进入第一个约会问答");
        this.askInfo();  //选择答案
        this.waitElement(driver,title_name);
        title = this.getTitleName();
        Assert.assertEquals(title,"约会问答(2/5)","没有进入第二个约会问答");
        this.askInfo();  //选择答案
        this.waitElement(driver,title_name);
        title = this.getTitleName();
        Assert.assertEquals(title,"约会问答(3/5)","没有进入第三个约会问答");
        this.askInfo();  //选择答案
        this.waitElement(driver,title_name);
        title = this.getTitleName();
        Assert.assertEquals(title,"约会问答(4/5)","没有进入第四个约会问答");
        this.askInfo();  //选择答案
        this.waitElement(driver,title_name);
        title = this.getTitleName();
        Assert.assertEquals(title,"约会问答(5/5)","没有进入第五个约会问答");
        this.askInfo();  //选择答案

        if(!this.doesWebElementExist(top_me)){
            Assert.fail("约会问题回答后没有进入首页！");
        }

//        this.waitElement(driver,top_me);
//        Assert.assertTrue(this.topMe(),"约会问题回答后没有进入首页！");
//        log.info("约会问题回答成功,进入首页");

    }



    //男注册后首页
    public void homeTab(AndroidDriver driver)throws Exception{
        this.manRegister(driver);
        this.waitElement(driver,user_name);
//        第一个用户名
        String name = this.geUserName();
        System.out.println(name);
        this.swipeToUp(driver);
        Thread.sleep(1000);
        Assert.assertEquals(this.memberArea(),"北京","用户的居住地显示不正确");
        //不喜欢操作
        this.nextBtn();
//        Thread.sleep(2000);
//        this.swipeToDown(driver);
        this.waitElement(driver,user_name);
        //判断换人
//        第二个用户名
        String name1 = geUserName();
        System.out.println(name1);
        if(name1.equals(name)){
            Assert.fail("点击 不喜欢 后，没有切换用户");
        }
//        Assert.assertNotEquals(name,name1,"不喜欢操作后没有切换用户");
        log.info("不喜欢操作成功，且切换用户");

        this.swipeToUp(driver);
        Assert.assertEquals(this.memberArea(),"北京","用户的居住地显示不正确");

        //喜欢操作
        this.clickAskBtn();
        this.waitElement(driver,user_name);
//        Thread.sleep(2000);
//        this.swipeToDown(driver);
        //判断换人
        name = geUserName();
        System.out.println(name);
        if(name1.equals(name)){
            Assert.fail("点击 喜欢 后，没有切换用户");
        }
//        Assert.assertNotEquals(name,name1,"喜欢操作后没有切换用户");
        log.info("喜欢操作成功，且切换用户");

    }


    //男注册后-消息
    public void messageTab(AndroidDriver driver)throws Exception{
        this.manRegister(driver);
        Assert.assertTrue(imgLook(),"首页右上角未显示未读消息标识");
        this.topMessageBtn();
        this.btn_pv_dialog_yuanfen_1();  //手机号认证
        Assert.assertTrue(imgLook2(),"私信tab旁未显示未读消息标识");
        Assert.assertTrue(imgLook(),"管理员消息未显示未读消息标识");

        this.userIconBtn(); //进入消息详情
        this.clickBtnLeft(); //返回消息页面


        Assert.assertFalse(imgLook2(),"私信tab旁显示未读消息标识");
        Assert.assertFalse(imgLook(),"管理员消息显示未读消息标识");

        //判断进入完善资料页面
        this.adImageBtn();
        Assert.assertEquals(this.getTitleName(),"完善信息","没有进入完善信息页面");
        this.clickBtnLeft(); //返回消息页面

        //猜你感兴趣的女用户列表-约TA按钮
        this.sayHelloBtn();

        this.clickBtnLeft(); //返回首页
        Assert.assertFalse(imgLook(),"首页右上角显示未读消息标识");
        log.info("消息验证成功");



    }

    //女注册后-消息-缘分小助手
    public void smallAssistant(AndroidDriver driver)throws Exception{
        this.topMessageBtn();
        this.waitElement(driver,title_name);
        if(this.getTitleName().equals("缘分小助手")){
            //选择类型
            this.clickTypeSelect();
            log.info("问题类型："+this.QAContent());
            String QAtype = this.QAContent();
            log.info("选择某一问题类型");
            this.clickType();
            String QA =this.typeSelect();
            Assert.assertEquals(QAtype,QA,"问题类型选择与显示不一致");
            //选择问题1
            this.clickSelectQA1();
            log.info("问题1："+this.QAContent());
            QAtype = this.QAContent();
            this.clickType();
            QA =this.QA1();
            Assert.assertEquals(QAtype,QA,"问题1选择与显示不一致");
            //选择问题2
            this.clickSelectQA2();
            log.info("问题2："+this.QAContent());
            QAtype = this.QAContent();
            this.clickType();
            QA =this.QA2();
            Assert.assertEquals(QAtype,QA,"问题2选择与显示不一致");
            this.clickOK();
            Assert.assertEquals(this.getTitleName(),"信箱","缘分小助手开启失败");
            log.info("缘分小助手开启成功");

        }
    }
    //男注册后-诚信等级
    public void creditRating(AndroidDriver driver)throws Exception{
        this.manRegister(driver);
        this.clickTopMe();
        this.body_item_2();
        //快捷身份证认证
        this.identity_auth_button();
        this.setting_identity_auth_information_layout();
        Assert.assertEquals(getTitleName(),"约会信息(15%)","未进入到完善资料页面");
        log.info("进入到完善资料页面");
        this.clickBtnLeft(); //返回
//        this.clickBtnLeft();

//        //////上传头像
//        this.setting_identity_auth_upload_user_icon_layout();
//        this.photoUpload();
        //快捷身份认证 验证手机号
        this.setting_identity_auth_check_phone_number_layout();
        this.phoneCheck();
        //手机认证
        this.phone_auth_button();
        this.phoneCheck();
        //上传本人3张照片
        this.upload_photo_button();
        this.photoUpload();
        this.swipeToUp(driver);
        //资料完善到达90%
        this.information_button();
        Assert.assertEquals(getTitleName(),"约会信息(15%)","未进入到完善资料页面");
        log.info("进入到完善资料页面");
        this.clickBtnLeft(); //返回
        log.info("诚信等级提交成功");
    }

    //诚信认证-手机号验证
    public void phoneCheck(){
        Assert.assertEquals(getTitleName(),"手机认证","未进入到手机号验证页面");
        log.info("进入到手机号验证页面");
        this.clickBtnLeft(); //返回
    }

    //诚信认证-上传照片
    public void photoUpload() throws Exception{
        this.id_item_image();
        Thread.sleep(2000);
        this.clickSkip();  //确定
    }


    //男注册后-我的相册
    public void MyPic(AndroidDriver driver)throws Exception {
        this.manRegister(driver);
        this.clickTopMe();
        this.body_item_4();  //进入我的相册
        Assert.assertEquals(this.imageNum(),1,"我的相册照片不为 1张照片");
        log.info("第一次进入我的相册，显示1张照片正确");
        this.image_view_check();    //点击“添加照片”按钮
        //选择6张照片
        selectPic(6,1);
        //选择多于6张照片
        this.id_item_select(6);
        Assert.assertEquals(this.confirmContent(),"确定6/6","选中照片错误，最多选中6张照片");

        //取消选中照片，只选择1张，因为有bug
        selectPic(5,2);
        this.clickConfirm();
        this.waitElement(driver,image_view_check.get(0));
        Assert.assertEquals(this.imageNum(),2,"上传的照片没有正确显示在相册，数量不正确");
        log.info("上传照片成功");

    }

    //type：1选中，2取消选中
    public void selectPic(int num,int type){
        for(int i = 0;i<num;i++){
            this.id_item_select(i);
            if(type== 1){
                System.out.println("========="+"确定"+(i+1)+"/6");
                Assert.assertEquals(this.confirmContent(),"确定"+(i+1)+"/6","选中照片后文本显示不正确");
            }else if(type == 2){
                System.out.println("========="+"确定"+(num-i)+"/6");
                Assert.assertEquals(this.confirmContent(),"确定"+(num-i)+"/6","应该只有一张照片被选中");
            }

        }
    }

    //男注册后-约会要求
    public void DateRequirements(AndroidDriver driver)throws Exception {
        this.clickTopMe();
        this.body_item_1();
        //所在地
        this.myspace_location_view();
        new TouchAction(driver).tap(360,850).perform();  //选中上海
        new TouchAction(driver).tap(360,850).perform();  //选中上海
        this.clickBtnok();  //确定
        String location = this.myspace_location();
        Assert.assertEquals(location,"上海","约会要求的所在地选中后显示不正确");

        //年龄
        this.myspace_he_age_view();
        swipeToUpSecend(driver,280,860,371);  //选中起始年龄
        swipeToUpSecend(driver,440,860,371);  //选中截至年龄
        this.clickBtnok();  //确定
        System.out.println("年龄区间："+this.myspace_he_age());
//        Assert.assertEquals(this.myspace_he_age(),"27~33岁","约会要求的年龄选中后显示不正确");
        //身高
        this.myspace_info_height_view();
        swipeToUpSecend(driver,260,860,371);  //选中起始身高
        swipeToUpSecend(driver,420,860,371);  //选中截至身高
        this.clickBtnok();  //确定
        System.out.println("身高区间："+this.myspace_info_height());
//        Assert.assertEquals(this.myspace_info_height(),"157~160cm","约会要求的身高选中后显示不正确");

        this.clickSave();  //保存
        this.keyBack(driver);//物理键返回到首页
        this.getSpace(driver,0, location);  //首页刷新用户



    }


   public  void getSpace(AndroidDriver driver,int i,String location) throws Exception{
       while(i<10){
           this.swipeToUp(driver);
           Thread.sleep(2000);
           //判断首页的用户所在地
           System.out.println("居住地===="+this.memberArea());
           if(!this.memberArea().equals(location)){
               this.nextBtn(); // 不喜欢操作
               i++;
//                ,"根据约会要求筛选的用户居住地不正确");
           }else{ //符合条件
                log.info("首页推荐用户的居住地正确");
                return;
           }


       }
   }

    //男注册后-自我介绍
    public void  selfIntroduction(AndroidDriver driver)throws Exception{
        this.clickTopMe();
        if(this.introduce_myself_hint()==true){
            log.info("进入录制语音");
            this.body_item_5();
            this.longPress(driver);
            this.id_bt_voice_commit(); //提交
            this.clickBtnLeft();  //返回
            Assert.assertFalse(this.introduce_myself_hint(),"录制失败");
            log.info("自我介绍完成");
        }

    }

    //男注册后-问答游戏
    public void  questionAndAnswerGame(AndroidDriver driver)throws Exception{
        this.clickTopMe();
        this.body_item_3();
        this.matching_qa_none_btn(); //回答问题
        String title = this.quesdtion_title();
        System.out.println("title:"+title);
        String answer = this.setting_item_name();   //选中答案并返回
        this.qa_send_question_id();  //提交
        Thread.sleep(1000);
        String title2 = this.quesdtion_title();
        System.out.println("title2:"+title2);
        Assert.assertNotEquals(title,title2,"提交答案后，问题没有切换");
        log.info("提交答案成功");
        this.qa_change_question_id(); //换一题
        title = this.quesdtion_title();
        System.out.println("title2:"+title2+"------"+"title3:"+title);
        Assert.assertNotEquals(title,title2,"换一题后，问题没有切换");
        log.info("换一题成功");
        this.clickBtnLeft();  //返回
        if(this.duihao()==true){
            System.out.println("this.answer():"+this.answer());
            Assert.assertEquals(this.answer(),answer,"选中的答案显示不正确");
            log.info("选中的答案显示正确");
        }

    }

    //男用户登陆后每日推荐
    public void recommendedDaily(AndroidDriver driver) throws  Exception{
        String name =  this.getName();
        this.clickYueTA();
        String name2 = this.getName();
        if(!name.equals(name2)) {
            this.clickYueTA();
            this.clickYueTA();
            this.clickYueTA();
            this.clickYueTA();
            log.info("约TA成功");
            this.waitElement(driver, top_me);
            if (!this.topMe()) {
                Assert.fail("每日推荐约TA后没有进入首页");
            }
            log.info("每日推荐约TA后成功进入首页");
        }
    }


    public void beanList1(AndroidDriver driver) throws Exception {
        this.manLogin();
        this.clickBtnLeft();
//        yhbCheck.keyBack(driver);  //手机的返回按钮
        this.clickTopMe();
        this.body_item_8();
        this.waitElement(driver, title_name);
        this.clickBean();
//        this.beanPrice1(driver);
        this.judgeBeanPrice1(driver);
    }

    public void letterList1(AndroidDriver driver) throws Exception {
        this.manLogin();
        this.clickBtnLeft();
//        yhbCheck.keyBack(driver);  //手机的返回按钮
        this.clickTopMe();
        this.body_item_8();
        this.waitElement(driver, title_name);
        this.clickWriteLetter();
        this.judgeLetterPrice1(driver);
    }
    public void vipList1(AndroidDriver driver) throws Exception {
        this.manLogin();
        this.clickBtnLeft();
//        yhbCheck.keyBack(driver);  //手机的返回按钮
        this.clickTopMe();
        this.body_item_8();
        this.waitElement(driver, title_name);
        this.clickVipTitle();
        this.judgeVipPrice1(driver);
    }



    public void VIP(AndroidDriver driver) throws Exception {
        this.manLogin();
        this.clickBtnLeft();
        this.clickTopMe();
        this.body_item_8();
        this.waitElement(driver, title_name);
        this.judgeVipCenter();
    }

/**
 * 公共方法替换

 */
/*
    //    1线男，会员中心 可购买项
    public void VipCenter() throws Exception {
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
        log.info("判断是否有 咪咕联合会员服务");
        if (!this.doesWebElementExist(migu)) {
            Assert.fail("咪咕联合会员一项不存在");
        }
    }
*/

    /**
     * 公共方法替换

     */
/*
    //    男，会员中心 豆币报价
    public void beanPrice1(AndroidDriver driver) throws Exception {

        this.clickReload();
        if (!this.doesWebElementExist(bean800)) {
            Assert.fail("800语音豆不存在");
        }
        if (!this.getBean800Price().contains("￥99")) {
            Assert.fail("800语音豆价格有误");
        }
        if (!this.doesWebElementExist(bean550)) {
            Assert.fail("550语音豆不存在");
        }
        if (!this.getBean550Price().contains("￥89")) {
            Assert.fail("550语音豆价格有误");
        }
        this.clickBean800();
        this.waitElement(driver, kaitong);
        log.info("判断800豆币，支付宝勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("800豆币，支付宝无自动续费");
        }

        this.clickXufei();
        log.info("判断800豆币，支付宝自动续费后,价格优惠10元");
        if (!this.doesWebElementExist(youhuijiage800)) {
            Assert.fail("800豆币，支付宝勾选自动续费后，价格没有优惠10元");
        }
        this.clickXufei();
        log.info("判断800豆币，支付宝取消 自动续费后，恢复为原价");
        if (!this.doesWebElementExist(yuanjia800)) {
            Assert.fail("800豆币，支付宝取消 自动续费后，不为原价");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        System.out.println("====+++++++"+this.getCurrentActivity(driver).toLowerCase());
        //判断是否包含 alipay,用户被登出和刚安装启动情况下
        if(this.getCurrentActivity(driver).toLowerCase().contains("alipay")){
            log.info("800豆币启动支付宝");
        }else if(this.getCurrentActivity(driver).toLowerCase().contains("aliuserguideactivity")){
            log.info("800豆币启动支付宝");
        }else{
            Assert.fail("800豆币未启动支付宝");

        }
        this.keyBack(driver);
        if(doesWebElementExist(cancel)){
            new TouchAction(driver).tap(400,750).perform();
            this.keyBack(driver);
        }

        this.waitElement(driver, title_name);
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("800豆币，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("800豆币未启动微信");
        }
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickYinlianPay();
        log.info("判断800豆币，银联支付原价是否是99元");
        if (!this.doesWebElementExist(yuanjia800)) {
            Assert.fail("800豆币原价不是99元");
        }
        this.clickBtnLeft();  //返回
        this.clickReload();
        this.clickBean550();
        this.waitElement(driver, title_name);
        this.clickReload();
        log.info("判断550豆币，支付宝勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("550豆币，支付宝无自动续费");
        }
        if (this.doesWebElementExist(youhuijiage550)) {
            Assert.fail("550豆币，支付宝 默认勾选 自动续费，为优惠后价格");
        }
        this.clickXufei();
        log.info("判断550豆币，支付宝勾选自动续费后，为优惠后价格");
        if (this.doesWebElementExist(yuanjia550)) {
            Assert.fail("550豆币，支付宝自动续费后，不为优惠后价格");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        System.out.println("===="+this.getCurrentActivity(driver).toLowerCase());
        if(this.getCurrentActivity(driver).toLowerCase().contains("alipay")){
            log.info("550豆币启动支付宝");
        }else if(this.getCurrentActivity(driver).toLowerCase().contains("aliuserguideactivity")){
            log.info("550豆币启动支付宝");
        }else{
            Assert.fail("550豆币未启动支付宝");

        }

        this.keyBack(driver);
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
        this.clickYinlianPay();
        log.info("判断550豆币，银联支付原价是否是89元");
        if (!this.doesWebElementExist(yuanjia550)) {
            Assert.fail("550豆币原价不是89元");
        }
        log.info("豆币购买测试成功");
    }

    //    男， 会员中心  写信包月报价
    public void letterPrice1(AndroidDriver driver) throws Exception {

        this.clickReload();
        this.waitElement(driver, title_name);
        if (!this.doesWebElementExist(letter90)) {
            Assert.fail("90天畅聊不存在");
        }
        if (!this.getLetter90Price().contains("￥109")) {
            Assert.fail("90天畅聊价格有误");
        }
        if (!this.doesWebElementExist(letter30)) {
            Assert.fail("30天畅聊不存在");
        }
        if (!this.getLetter30Price().contains("￥89")) {
            Assert.fail("30天畅聊价格有误");
        }
        if (!this.doesWebElementExist(letter7)) {
            Assert.fail("7天畅聊不存在");
        }
        if (!this.getLetter7Price().contains("￥69")) {
            Assert.fail("7天畅聊价格有误");
        }
        this.clickLetter90();
        this.waitElement(driver, title_name);
        log.info("判断写信包月90天，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("一线男，写信包月90天，支付宝无自动续费");
        }
        if (this.doesWebElementExist(youhuijiage90)) {
            Assert.fail("一线男，写信包月90天，支付宝默认勾选 自动续费，为优惠后价格");
        }else{
            log.info("一线男，写信包月90天，支付宝默认未勾选 自动续费，显示原价");
        }
        this.clickXufei();
        log.info("判断写信包月90天，支付宝勾选自动续费后，显示优惠后价格");
        if (this.doesWebElementExist(yuanjia90)) {
            Assert.fail("写信包月90天，支付宝勾选自动续费后，仍显示原价");
        }else{
            log.info("一线男，写信包月90天，支付宝勾选自动续费后，显示优惠后价格");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        if(this.getCurrentActivity(driver).toLowerCase().contains("alipay")){
            log.info("90天畅聊启动支付宝");
        }else if(this.getCurrentActivity(driver).toLowerCase().contains("aliuserguideactivity")){
            log.info("90天畅聊启动支付宝");
        }else{
            Assert.fail("90天畅聊未启动支付宝");
        }
        this.keyBack(driver);
        if(doesWebElementExist(cancel)){
            new TouchAction(driver).tap(400,750).perform();
            this.keyBack(driver);
        }
        this.waitElement(driver, title_name);
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("90天写信包月，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("90天写信包月未启动微信");
        }
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickYinlianPay();
        log.info("判断90天写信包月，银联支付原价是否是109元");
        if (!this.doesWebElementExist(yuanjia90)) {
            Assert.fail("90天写信包月原价不是109元");
        }
        this.clickBtnLeft();  //返回
        this.clickReload();
        this.waitElement(driver, title_name);
        this.clickLetter30();
        this.waitElement(driver, title_name);
        this.clickReload();
        log.info("判断写信包月30天，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("一线男，写信包月30天，支付宝无自动续费");
        }
        if (this.doesWebElementExist(youhuijiage30)) {
            Assert.fail("一线男，写信包月30天，支付宝默认勾选 自动续费，为优惠后价格");
        }else{
            log.info("一线男，写信包月30天，支付宝默认未勾选 自动续费，显示原价");
        }
        this.clickXufei();
        log.info("判断写信包月30天，支付宝勾选自动续费后，显示优惠后价格");
        if (this.doesWebElementExist(yuanjia30)) {
            Assert.fail("写信包月30天，支付宝勾选自动续费后，仍显示原价");
        }else{
            log.info("一线男，写信包月30天，支付宝勾选自动续费后，显示优惠后价格");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        if(this.getCurrentActivity(driver).toLowerCase().contains("alipay")){
            log.info("30天畅聊启动支付宝");
        }else if(this.getCurrentActivity(driver).toLowerCase().contains("aliuserguideactivity")){
            log.info("30天畅聊启动支付宝");
        }else{
            Assert.fail("30天畅聊未启动支付宝");
        }
        this.keyBack(driver);
        if(doesWebElementExist(cancel)){
            new TouchAction(driver).tap(400,750).perform();
            this.keyBack(driver);
        }
        this.waitElement(driver, title_name);
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("30天写信包月，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("30天写信包月未启动微信");
        }
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickYinlianPay();
        log.info("判断30天写信包月，银联支付原价是否是89元");
        if (!this.doesWebElementExist(yuanjia30)) {
            Assert.fail("30天写信包月原价不89元");
        }

        this.clickBtnLeft();  //返回
        this.clickReload();
        this.clickLetter7();
        this.waitElement(driver, title_name);
        this.clickReload();
        log.info("判断写信包月7天，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("一线男，写信包月7天，支付宝无自动续费");
        }
        if (this.doesWebElementExist(youhuijiage7)) {
            Assert.fail("一线男，写信包月7天，支付宝默认勾选 自动续费，为优惠后价格");
        }else{
            log.info("一线男，写信包月7天，支付宝默认未勾选 自动续费，显示原价");
        }
        this.clickXufei();
        log.info("判断写信包月7天，支付宝勾选自动续费后，显示优惠后价格");
        if (this.doesWebElementExist(yuanjia7)) {
            Assert.fail("写信包月7天，支付宝勾选自动续费后，仍显示原价");
        }else{
            log.info("一线男，写信包月7天，支付宝勾选自动续费后，显示优惠后价格");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        if(this.getCurrentActivity(driver).toLowerCase().contains("alipay")){
            log.info("7天畅聊启动支付宝");
        }else if(this.getCurrentActivity(driver).toLowerCase().contains("aliuserguideactivity")){
            log.info("7天畅聊启动支付宝");
        }else{
            Assert.fail("7天畅聊未启动支付宝");
        }
        this.keyBack(driver);
        if(doesWebElementExist(cancel)){
            new TouchAction(driver).tap(400,750).perform();
            this.keyBack(driver);
        }
        this.waitElement(driver, title_name);
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("7天写信包月，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("7天写信包月未启动微信");
        }
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickYinlianPay();
        log.info("判断7天写信包月，银联支付原价是否是69元");
        if (!this.doesWebElementExist(yuanjia7)) {
            Assert.fail("7天写信包月原价不69元");
        }

        log.info("写信包月测试成功");

    }
    //    男，会员中心 皇冠特权
    public void VipPrice1(AndroidDriver driver) throws Exception {
        this.clickTopMe();
        this.body_item_8();
        this.waitElement(driver, title_name);
        this.clickVipTitle();
        this.clickReload();
        this.waitElement(driver, title_name);
        if (!this.doesWebElementExist(vip90danhao)) {
            Assert.fail("90天vip不存在");
        }
        if (!this.getVip90priceDanhao().contains("￥100")) {
            Assert.fail("90天vip价格错误");
        }
        if (!this.doesWebElementExist(vip30danhao)) {
            Assert.fail("30天vip不存在");
        }
        if (!this.getVip30priceDanhao().contains("￥50")) {
            Assert.fail("30天vip价格有误");
        }
        this.clickVip90Danhao();
        this.clickReload();
        this.waitElement(driver, title_name);
        log.info("判断90天vip，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("90天vip，支付宝无自动续费");
        }
        if (this.doesWebElementExist(youhuijiage_vip90)) {
            Assert.fail("90天vip，支付宝默认勾选 自动续费，为优惠后价格");
        }
        this.clickXufei();
        log.info("判断 90天vip，支付宝取消 自动续费，恢复原价");
        if (this.doesWebElementExist(yuanjia_vip90)) {
            Assert.fail("90天vip，支付宝勾选自动续费后，显示原价");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        if(this.getCurrentActivity(driver).toLowerCase().contains("alipay")){
            log.info("90天vip启动支付宝");
        }else if(this.getCurrentActivity(driver).toLowerCase().contains("aliuserguideactivity")){
            log.info("90天vip启动支付宝");
        }else{
            Assert.fail("90天vip未启动支付宝");
        }
        this.keyBack(driver);
        if(doesWebElementExist(cancel)){
            new TouchAction(driver).tap(400,750).perform();
            this.keyBack(driver);
        }
        this.waitElement(driver, title_name);
        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("90天vip，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("90天vip未启动微信");
        }
        this.keyBack(driver);
        this.clickReload();
        this.clickYinlianPay();
        this.waitElement(driver, title_name);
        log.info("判断90天vip，银联支付是否默认价格优惠10元");
        if (this.doesWebElementExist(youhuijiage_vip90)) {
            Assert.fail("90天vip，银联支付默认勾选 自动续费，为优惠后价格");
        }

        this.clickBtnLeft();  //返回
        this.clickReload();
        this.clickVip30Danhao();
        this.clickReload();
        this.waitElement(driver, title_name);
        log.info("判断30天vip，支付宝是否默认勾选 自动续费，且价格优惠10元");
        if (!this.doesWebElementExist(xufei)) {
            Assert.fail("30天vip，支付宝无自动续费");
        }
        if (this.doesWebElementExist(youhuijiage_vip30)) {
            Assert.fail("30天vip，支付宝默认勾选 自动续费，为优惠后价格");
        }
        this.clickXufei();
        log.info("判断 30天vip，支付宝取消 自动续费，恢复原价");
        if (this.doesWebElementExist(yuanjia_vip30)) {
            Assert.fail("30天vip，支付宝勾选自动续费后，显示原价");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        if(this.getCurrentActivity(driver).toLowerCase().contains("alipay")){
            log.info("30天vip启动支付宝");
        }else if(this.getCurrentActivity(driver).toLowerCase().contains("aliuserguideactivity")){
            log.info("30天vip启动支付宝");
        }else{
            Assert.fail("30天vip未启动支付宝");
        }
        this.keyBack(driver);
        if(doesWebElementExist(cancel)){
            new TouchAction(driver).tap(400,750).perform();
            this.keyBack(driver);
        }

        this.clickWecharPay();
        if (this.doesWebElementExist(xufei)) {
            Assert.fail("30天vip，微信支付 存在自动续费 选项");
        }
        this.clickKaiTong();
        Thread.sleep(5000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("30天vip未启动微信");
        }
        this.keyBack(driver);
        this.waitElement(driver, title_name);
        this.clickReload();
        this.clickYinlianPay();
        log.info("判断30天vip，银联支付是否默认价格优惠10元");

        if (this.doesWebElementExist(youhuijiage_vip30)) {
            Assert.fail("30天vip，银联支付默认勾选 自动续费，为优惠后价格");
        }
        log.info("VIP开通测试成功");
    }*/
   //    1线男，会员中心 收信宝----已废掉
   /* public void receiveLetterPrice1(AndroidDriver driver) throws Exception {
        this.clickTopMe();
        this.body_item_8();
        this.waitElement(driver, title_name);
        this.clickReceiveLetter();
        this.clickReload();
        this.clickUploadPic();  //上传头像
        this.id_item_image();  //选中第一张照片
        this.clickSkip();
        if (!this.doesWebElementExist(day1)) {
            Assert.fail("1天展示不存在");
        }
        if (!this.doesWebElementExist(day3)) {
            Assert.fail("3天展示不存在");
        }
        if (!this.doesWebElementExist(day7)) {
            Assert.fail("7天展示不存在");
        }
        if (!this.doesWebElementExist(day15)) {
            Assert.fail("15天展示不存在");
        }
        if (!this.getDay1Price().equals("1天(80豆币/10元)")) {
            Assert.fail("1天展示价格不对");
        }
        if (!this.getDay3Price().equals("3天(300豆币/30元)")) {
            Assert.fail("3天展示价格不对");
        }
        if (!this.getDay7Price().equals("7天(600豆币/50元)")) {
            Assert.fail("7天展示价格不对");
        }
        if (!this.getDay15Price().equals("15天(1300豆币/100元)")) {
            Assert.fail("15天展示价格不对");
        }
        this.clickDay1();
        this.waitElement(driver,title_name);
        this.clickReload();
        this.waitElement(driver,title_name);
        this.clickMonitorPay(driver);
        Thread.sleep(3000);
        if (!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")) {
            Assert.fail("1天展示未启动支付宝");
        }
        this.keyBack(driver);
        this.waitElement(driver,title_name);
        this.clickWecharPay();
        this.waitElement(driver,title_name);
        this.clickMonitorPay(driver);
        Thread.sleep(2000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("1天展示未启动微信");
        }
        this.keyBack(driver);
        this.clickBtnLeft();
        this.waitElement(driver,title_name);
        this.clickReload();
        this.clickDay3();
        this.clickReload();
        this.waitElement(driver,title_name);
        this.clickMonitorPay(driver);
        Thread.sleep(1000);
        if (!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")) {
            Assert.fail("3天展示未启动支付宝");
        }
        this.keyBack(driver);
        this.clickWecharPay();
        Thread.sleep(1000);
        this.clickMonitorPay(driver);
        Thread.sleep(1000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("3天展示未启动微信");
        }
        this.keyBack(driver);
        this.clickBtnLeft();
        this.clickReload();
        this.clickDay7();
        this.clickReload();
        Thread.sleep(1000);
        this.clickMonitorPay(driver);
        Thread.sleep(1000);
        if (!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")) {
            Assert.fail("7天展示未启动支付宝");
        }
        this.keyBack(driver);
        this.clickWecharPay();
        Thread.sleep(1000);
        this.clickMonitorPay(driver);
        Thread.sleep(1000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("7天展示未启动微信");
        }
        this.keyBack(driver);
        this.clickBtnLeft();
        this.clickReload();
        this.clickDay15();
        this.clickReload();
        Thread.sleep(1000);
        this.clickMonitorPay(driver);
        Thread.sleep(1000);
        if (!this.getCurrentActivity(driver).contains("AlipayUserLoginActivity")) {
            Assert.fail("15天展示未启动支付宝");
        }
        this.keyBack(driver);
        this.clickWecharPay();
        Thread.sleep(1000);
        this.clickMonitorPay(driver);
        Thread.sleep(1000);
        if (!this.getCurrentActivity(driver).contains("SimpleLoginUI")) {
            Assert.fail("15天展示未启动微信");
        }
    }
*/
   public void migu (AndroidDriver driver)throws Exception{
       this.clickTopMe();
       this.swipeToUp(driver);
       this.clickMigu();
       this.clickReload();
       this.waitElement(driver, title_name);
       this.clickDingGou();  //订购
       this.waitElement(driver,title_name);
       String price = this.getBaoYue();
       if(!price.contains("￥30.00")){
           Assert.fail("咪咕VIP会员价格不正确");
       }
       this.clickBtnLeft();
       this.waitElement(driver,title_name);
       this.clickZhuanQu();
       this.clickReload();
       this.waitElement(driver,title_name);
       this.clickReload();
       this.waitElement(driver,title_name);
       System.out.println("判断是否进入咪咕游戏专区:"+!this.hasGame());
       log.info("判断是否进入咪咕游戏专区");
       if(!this.hasGame()){
           Assert.fail("未进入咪咕游戏专区");
       }
       log.info("成功进入咪咕游戏专区");
   }


    public void resetPwd (AndroidDriver driver)throws Exception{
        this.clickTopMe();
        this.clickSet();
        this.waitElement(driver,title_name);
        this.clickUserinfo();
        this.waitElement(driver,title_name);
        String username = this.getUserName();
        this.clickModify();  //点击修改按钮
        this.setNewPwd();
        this.clickSubmit();
        this.waitElement(driver,title_name);
        String account = this.account();
        if(!username.equals(account)){
            Assert.fail("修改密码后登陆页面显示的账号不正确");
        }
        this.password();
        this.clickBtnLogin();
        this.waitElement(driver,top_me);
        if(this.topMe()){
            log.info("新密码登陆成功");
        }else{
            Assert.fail("新密码登陆失败");
        }


    }

}
