package com.driver;

import com.listener.ScreenScr;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.internal.OkHttpClient.Factory;

public class Driver {

    public boolean acceptNextAlert = true;
    public StringBuffer verificationErrors = new StringBuffer();

    public void setdriver(AndroidDriver driver) {
        this.driver = driver;
    }

    //截屏
    public void takescreen(String filename) {
        ScreenScr.getScreen((TakesScreenshot) driver, filename);
    }

    /**
     * 通过getDriver()方法可直接调用对应driver，如果两个测试用例分别都创建浏览器driver，同时在TestNG的.xml文件中配置多线程并发执行，
     * 此时两浏览器执行的操作虽然分别在不同线程中，但因为引用的是同一个driver，因此会出现两浏览器相互跳跃操作的情况，
     * 即本该在浏览器1中的操作跳跃到浏览器2中执行，从而报错，解决办法是使用ThreadLocal来保证线程安全
     * 启动driver后，set到ThreadDriver，实际调用时，通过ThreadDriver.get()获取
     */
    ThreadLocal<AndroidDriver> ThreadDriver = new ThreadLocal<AndroidDriver>();
    public AndroidDriver driver = ThreadDriver.get();


    /**
     * 指定参数，从testng.xml中获取
     */
    @Parameters({"deviceID", "app"})
    @BeforeClass
    public void getDriver(String deviceID, String app) throws MalformedURLException {
        if (deviceID.equalsIgnoreCase("DU2SSE148L041137") && app.equalsIgnoreCase("laps")) {
            System.out.println(" Executing on 恋爱普适");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "4.4.2");
            capabilities.setCapability("resetKeyboard", true);
            capabilities.setCapability("app","E:\\"+app+".apk");
//            capabilities.setCapability("appPackage", "com.huizheng.lasq");
//            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");
            capabilities.setCapability("unicodeKeyboard", true);
//            capabilities.setCapability("automationName","UiAutomator2");
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//            driver.installApp("E:\\"+app+".apk");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            driver.
            ThreadDriver.set(driver);
        }else if (deviceID.equalsIgnoreCase("5TF7N15A17007305") && app.equalsIgnoreCase("laps")) {
            System.out.println(" Executing on 恋爱普适");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("newCommandTimeout", 180);
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "6.0.1");
            capabilities.setCapability("resetKeyboard", true);
            capabilities.setCapability("app","D:\\workspace\\LBS5.6.1\\apps\\"+app+".apk");
//            capabilities.setCapability("appPackage", "com.huizheng.lasq");
//            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");
            capabilities.setCapability("unicodeKeyboard", true);
//            capabilities.setCapability("automationName","UiAutomator2");
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//            driver.installApp("E:\\"+app+".apk");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            driver.
            ThreadDriver.set(driver);
        }else if (deviceID.equalsIgnoreCase("73EBB18530233351") && app.equalsIgnoreCase("lasq")) {
            System.out.println(" Executing on 恋爱神器-荣耀7C");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "8.0.0");
            capabilities.setCapability("resetKeyboard", true);
            capabilities.setCapability("app","E:\\"+app+".apk");
//            capabilities.setCapability("appPackage", "com.huizheng.lasq");
//            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");
            capabilities.setCapability("unicodeKeyboard", true);
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        } else if (deviceID.equalsIgnoreCase("ed22d1d4") && app.equalsIgnoreCase("lasq")) {
            System.out.println(" Executing on 恋爱神器-小米MI 5s");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "6.0.1");
            capabilities.setCapability("resetKeyboard", true);
            capabilities.setCapability("app","E:\\"+app+".apk");
//            capabilities.setCapability("appPackage", "com.huizheng.lasq");
//            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");
            capabilities.setCapability("unicodeKeyboard", true);
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4725/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        } else if (deviceID.equalsIgnoreCase("DU2SSE148L041137") && app.equalsIgnoreCase("lasq")) {
            System.out.println(" Executing on 恋爱神器");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "4.4.2");
            capabilities.setCapability("resetKeyboard", true);
            capabilities.setCapability("app","E:\\"+app+".apk");
//            capabilities.setCapability("appPackage", "com.huizheng.lasq");
//            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");
            capabilities.setCapability("unicodeKeyboard", true);
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        } else if (deviceID.equalsIgnoreCase("5TF7N15A17007305") && app.equalsIgnoreCase("lasq")) {
            System.out.println(" Executing on 恋爱神器");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("newCommandTimeout", 180);
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "6.0.1");
            capabilities.setCapability("resetKeyboard", true);
            capabilities.setCapability("app","D:\\workspace\\LBS5.6.1\\apps\\"+app+".apk");
//            capabilities.setCapability("appPackage", "com.huizheng.lasq");
//            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");
            capabilities.setCapability("unicodeKeyboard", true);
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        }else if (deviceID.equalsIgnoreCase("DU2SSE148L041137") && app.equalsIgnoreCase("jp")) {
            System.out.println(" Executing on 绝配");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "4.4.2");
            capabilities.setCapability("resetKeyboard", true);
            capabilities.setCapability("app","E:\\"+app+".apk");
//            capabilities.setCapability("appPackage", "com.huizheng.lasq");
//            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");
            capabilities.setCapability("unicodeKeyboard", true);
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//            driver.installApp("E:\\"+app+".apk");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        } else if (deviceID.equalsIgnoreCase("5TF7N15A17007305") && app.equalsIgnoreCase("jp")) {
            System.out.println(" Executing on 绝配");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("newCommandTimeout", 180);  //设置appium工作台的超时时间180秒，不会报错NoSuchSessionException
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "6.0.1");
            capabilities.setCapability("resetKeyboard", true);
            capabilities.setCapability("app","D:\\workspace\\LBS5.6.1\\apps\\"+app+".apk");
//            capabilities.setCapability("appPackage", "com.huizheng.lasq");
//            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");
            capabilities.setCapability("unicodeKeyboard", true);
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//            driver.installApp("E:\\"+app+".apk");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        }else if (deviceID.equalsIgnoreCase("DU2SSE148L041137") && app.equalsIgnoreCase("tcrl")) {
            System.out.println(" Executing on 同城热恋");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "4.4.2");
            capabilities.setCapability("resetKeyboard", true);
            capabilities.setCapability("app","E:\\"+app+".apk");
//            capabilities.setCapability("appPackage", "com.huizheng.lasq");
//            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");
            capabilities.setCapability("unicodeKeyboard", true);
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        }else if (deviceID.equalsIgnoreCase("5TF7N15A17007305") && app.equalsIgnoreCase("tcrl")) {
            System.out.println(" Executing on 同城热恋");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("newCommandTimeout", 180);
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "6.0.1");
            capabilities.setCapability("resetKeyboard", true);
            capabilities.setCapability("app","D:\\workspace\\LBS5.6.1\\apps\\"+app+".apk");
//            capabilities.setCapability("appPackage", "com.huizheng.lasq");
//            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");
            capabilities.setCapability("unicodeKeyboard", true);
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        }else if (deviceID.equalsIgnoreCase("DU2SSE148L041137") && app.equalsIgnoreCase("plp")) {
            System.out.println(" Executing on 漂流瓶");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "4.4.2");
            capabilities.setCapability("resetKeyboard", true);
            capabilities.setCapability("app","E:\\"+app+".apk");
//            capabilities.setCapability("appPackage", "com.huizheng.lasq");
//            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");
            capabilities.setCapability("unicodeKeyboard", true);
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        }else if (deviceID.equalsIgnoreCase("5TF7N15A17007305") && app.equalsIgnoreCase("plp")) {
            System.out.println(" Executing on 漂流瓶");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("newCommandTimeout", 180);
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "6.0.1");
            capabilities.setCapability("resetKeyboard", true);
            capabilities.setCapability("app","D:\\workspace\\LBS5.6.1\\apps\\"+app+".apk");
//            capabilities.setCapability("appPackage", "com.huizheng.lasq");
//            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");
            capabilities.setCapability("unicodeKeyboard", true);
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        }else if (deviceID.equalsIgnoreCase("66612808") && app.equalsIgnoreCase("yhb")) {
            System.out.println(" Executing on 约会吧");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "4.4.4");
            capabilities.setCapability("resetKeyboard", true);
            capabilities.setCapability("app","E:\\"+app+".apk");
//            capabilities.setCapability("appPackage", "com.huizheng.lasq");
//            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");
            capabilities.setCapability("unicodeKeyboard", true);
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        }else if (deviceID.equalsIgnoreCase("5TF7N15A17007305") && app.equalsIgnoreCase("yhb")) {
            System.out.println(" Executing on 约会吧");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("newCommandTimeout", 180);  //设置appium工作台的超时时间180秒，不会报错NoSuchSessionException
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "6.0.1");
            capabilities.setCapability("resetKeyboard", true);
            capabilities.setCapability("app","D:\\workspace\\LBS5.6.1\\apps\\"+app+".apk");
//            capabilities.setCapability("appPackage", "com.huizheng.lasq");
//            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");
            capabilities.setCapability("unicodeKeyboard", true);
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        }else if (deviceID.equalsIgnoreCase("DU2SSE148L041137") && app.equalsIgnoreCase("dsjy")) {
            System.out.println(" Executing on 单身交友");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "4.4.2");
            capabilities.setCapability("resetKeyboard", true);
            capabilities.setCapability("app","E:\\"+app+".apk");
//            capabilities.setCapability("appPackage", "com.huizheng.lasq");
//            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");
            capabilities.setCapability("unicodeKeyboard", true);
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//            driver.installApp("E:\\"+app+".apk");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        }else if (deviceID.equalsIgnoreCase("5TF7N15A17007305") && app.equalsIgnoreCase("dsjy")) {
            System.out.println(" Executing on 单身交友");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("newCommandTimeout", 180);
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "6.0.1");
            capabilities.setCapability("resetKeyboard", true);
            capabilities.setCapability("app","D:\\workspace\\LBS5.6.1\\apps\\"+app+".apk");
//            capabilities.setCapability("appPackage", "com.huizheng.lasq");
//            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");
            capabilities.setCapability("unicodeKeyboard", true);
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//            driver.installApp("E:\\"+app+".apk");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        }else if (deviceID.equalsIgnoreCase("mi_4w-5c549937") && app.equalsIgnoreCase("yyw")) {
            System.out.println(" Executing on 有缘网");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("newCommandTimeout", 180);
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "6.0.1");
            capabilities.setCapability("resetKeyboard", true);
//            capabilities.setCapability("app","E:\\"+app+".apk");
            capabilities.setCapability("appPackage", "com.youyuan.yyhl");
            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");
            capabilities.setCapability("unicodeKeyboard", true);
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        }else if (deviceID.equalsIgnoreCase("DU2SSE148L041137") && app.equalsIgnoreCase("qs")) {
            System.out.println(" Executing on 牵手");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "4.4.2");
            capabilities.setCapability("resetKeyboard", true);
//            capabilities.setCapability("app","E:\\"+app+".apk");
            capabilities.setCapability("appPackage", "com.huizheng.lasq");
            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");
            capabilities.setCapability("unicodeKeyboard", true);
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//            driver.installApp("E:\\"+app+".apk");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        }else if (deviceID.equalsIgnoreCase("5TF7N15A17007305") && app.equalsIgnoreCase("qs")) {
            System.out.println(" Executing on 牵手");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("newCommandTimeout", 180);
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "6.0.1");
            capabilities.setCapability("resetKeyboard", true);
//            capabilities.setCapability("app","E:\\"+app+".apk");
            capabilities.setCapability("appPackage", "com.huizheng.lasq");
            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");
            capabilities.setCapability("unicodeKeyboard", true);
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//            driver.installApp("E:\\"+app+".apk");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        }else if (deviceID.equalsIgnoreCase("DU2SSE148L041137") && app.equalsIgnoreCase("mlyh")) {
            System.out.println(" Executing on 美丽约会");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "4.4.2");
            capabilities.setCapability("resetKeyboard", true);
            capabilities.setCapability("app","E:\\"+app+".apk");
            capabilities.setCapability("appPackage", "com.huizheng.lasq");
            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");
            capabilities.setCapability("unicodeKeyboard", true);
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//            driver.installApp("E:\\"+app+".apk");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        }else if (deviceID.equalsIgnoreCase("5TF7N15A17007305") && app.equalsIgnoreCase("mlyh")) {
            System.out.println(" Executing on 美丽约会");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("newCommandTimeout", 180);
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "6.0.1");
            capabilities.setCapability("resetKeyboard", true);
            capabilities.setCapability("app","D:\\workspace\\LBS5.6.1\\apps\\"+app+".apk");
            capabilities.setCapability("appPackage", "com.huizheng.lasq");
            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");
            capabilities.setCapability("unicodeKeyboard", true);
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//            driver.installApp("E:\\"+app+".apk");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        }else if (deviceID.equalsIgnoreCase("DU2SSE148L041137") && app.equalsIgnoreCase("xydht")) {
            System.out.println(" Executing on 寻缘电话亭");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "4.4.2");
            capabilities.setCapability("resetKeyboard", true);
            capabilities.setCapability("app","E:\\"+app+".apk");
            capabilities.setCapability("appPackage", "com.huizheng.lasq");
            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");
            capabilities.setCapability("unicodeKeyboard", true);
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//            driver.installApp("E:\\"+app+".apk");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        }else if (deviceID.equalsIgnoreCase("5TF7N15A17007305") && app.equalsIgnoreCase("xydht")) {
            System.out.println(" Executing on 寻缘电话亭");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("newCommandTimeout", 180);
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "6.0.1");
            capabilities.setCapability("resetKeyboard", true);
            capabilities.setCapability("app","D:\\workspace\\LBS5.6.1\\apps\\"+app+".apk");
            capabilities.setCapability("appPackage", "com.huizheng.lasq");
            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");
            capabilities.setCapability("unicodeKeyboard", true);
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//            driver.installApp("E:\\"+app+".apk");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        }else if (deviceID.equalsIgnoreCase("mi_4w-5c549937") && app.equalsIgnoreCase("xydht")) {
            System.out.println(" Executing on 寻缘电话亭");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("newCommandTimeout", 180);
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "6.0.1");
            capabilities.setCapability("resetKeyboard", true);
            capabilities.setCapability("app","E:\\"+app+".apk");
            capabilities.setCapability("appPackage", "com.huizheng.lasq");
            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");
            capabilities.setCapability("unicodeKeyboard", true);
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//            driver.installApp("E:\\"+app+".apk");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        }else if (deviceID.equalsIgnoreCase("5TF7N15A17007305") && app.equalsIgnoreCase("yy")) {
            System.out.println(" Executing on 音缘");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("newCommandTimeout", 180);  //设置appium工作台的超时时间180秒，不会报错NoSuchSessionException
//            capabilities.setCapability("newCommandTimeout", 180);
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "6.0.1");
            //隐藏手机中的软键盘
            capabilities.setCapability("unicodeKeyboard", "True");
            capabilities.setCapability("resetKeyboard","True");
            capabilities.setCapability("app","D:\\workspace\\LBS5.6.1\\apps\\"+app+".apk");
            capabilities.setCapability("'noReset'",true);  //已安装apk，不需要每次重新安装
            /*capabilities.setCapability("appPackage", "com.huizheng.lasq");
            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");*/

            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//            driver.installApp("E:\\"+app+".apk");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        }else if (deviceID.equalsIgnoreCase("DU2SSE148L041137") && app.equalsIgnoreCase("yy")) {
            System.out.println(" Executing on 音缘");
            DesiredCapabilities capabilities = new DesiredCapabilities();
//            capabilities.setCapability("newCommandTimeout", 180);
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "4.4.2");
            //隐藏手机中的软键盘
            capabilities.setCapability("unicodeKeyboard", "True");
            capabilities.setCapability("resetKeyboard","True");
            capabilities.setCapability("app","E:\\"+app+".apk");
            capabilities.setCapability("'noReset'",true);  //已安装apk，不需要每次重新安装
            /*capabilities.setCapability("appPackage", "com.huizheng.lasq");
            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");*/

            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//            driver.installApp("E:\\"+app+".apk");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        }else if (deviceID.equalsIgnoreCase("5TF7N15A17007305") && app.equalsIgnoreCase("rd")) {
            System.out.println(" Executing on 瑞福缘动");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("newCommandTimeout", 180);  //设置appium工作台的超时时间180秒，不会报错NoSuchSessionException
            capabilities.setCapability("deviceName", deviceID);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "6.0.1");
            //隐藏手机中的软键盘
            capabilities.setCapability("unicodeKeyboard", "True");
            capabilities.setCapability("resetKeyboard","True");
            capabilities.setCapability("app","D:\\workspace\\LBS5.6.1\\apps\\"+app+".apk");
            capabilities.setCapability("'noReset'",true);  //已安装apk，不需要每次重新安装
            /*capabilities.setCapability("appPackage", "com.huizheng.lasq");
            capabilities.setCapability("appActivity", "com.app.ui.activity.WelcomeActivity");*/

            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//            driver.installApp("E:\\"+app+".apk");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        }
        /**
         * 需要的同学，可继续添加需要驱动（同时pom.xml中需要引入）
         */
        else {
            throw new IllegalArgumentException("The device Type is Undefined");
        }

    }

    //    @AfterTest
    @AfterClass
    public void closeBrowser() {
        driver.closeApp();
        driver.quit();
    }
}
