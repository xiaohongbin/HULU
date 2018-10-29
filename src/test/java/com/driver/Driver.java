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
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//            driver.
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
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            ThreadDriver.set(driver);
        } else if (deviceID.equalsIgnoreCase("DU2SSE148L041137") && app.equalsIgnoreCase("jp")) {
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
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
//            driver.installApp("D:\\"+app+".apk");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
