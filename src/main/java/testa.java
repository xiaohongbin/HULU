import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.File;
import java.io.IOException;

public class testa {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/chromedriver.exe");
//        System.setProperty("webdriver.gecko.driver",".\\Tools\\geckodriver.exe");
//        FirefoxOptions Options = new FirefoxOptions();
//        Options.addArguments("user-data-dir=C:\\Users\\happy\\AppData\\Local\\Google\\Chrome\\User Data");
//        WebDriver driver = new FirefoxDriver(Options);
//        driver.manage().window().maximize();
//        File file = new File("C:\\Users\\happy\\Desktop\\FileUpload.html");
//        // 用java来实现文件读取功 \
//        driver.get(file.getAbsolutePath());
//        driver.findElement(By.name("uploadFile")).click();
//        // 点击选择文件按钮
//        Thread.sleep(3000);
//        // 设置等待3秒
//        Runtime exe = Runtime.getRuntime();
//        // Java 的Runtime 模块的getruntime.exec()方法可以调用exe 程序并执行。
//        try {
//            String str = "E://upload.exe";
//            exe.exec(str);
//            // 运行指定位置的.exe文件
//        } catch (IOException e) {
//            System.out.println("Error to run the exe");
//            e.printStackTrace();
//        }
//        driver.close();
//        driver.quit();
//        int a=;
        for (int i=0;i<100;i++){
            System.out.println((int)(0+Math.random()*(5-1+1)));
        }

    }
}
