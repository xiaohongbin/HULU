import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");//chromedriver服务地址
        WebDriver driver = new ChromeDriver(); //新建一个WebDriver 的对象，但是new 的是FirefoxDriver的驱动
        driver.get("http://zhhxy.qa.v3.xiaoyangedu.net/View/Index.html");//打开指定的网站
        driver.manage().window().maximize();
        try {
            driver.findElement(By.xpath("//*[@id=\"FaBars\"]")).click();//找到kw元素的id，然后输入hello
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"LeftMenuContent\"]/div[1]/div[2]/div/ul/li[2]/div/span")).click(); //点击按扭
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"LeftMenuContent\"]/div[1]/div[2]/div/ul/li[2]/ul/div[1]/div/li/span")).click();

            Thread.sleep(1000);
//            点击增加用户
            driver.findElement(By.xpath("//*[@id=\"XyContentModuleReplace\"]/div[2]/div[1]/button[1]/span")).click();
            Thread.sleep(1000);
//            获取ID输入焦点
            driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/form/div[1]/div/div[1]/input")).click();
//            输入数据
            driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/form/div[1]/div/div[1]/input")).sendKeys("ddddddd");
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        /**
         * dr.quit()和dr.close()都可以退出浏览器,简单的说一下两者的区别：第一个close，
         * 如果打开了多个页面是关不干净的，它只关闭当前的一个页面。第二个quit，
         * 是退出了所有Webdriver所有的窗口，退的非常干净，所以推荐使用quit最为一个case退出的方法。
         */
        driver.quit();//退出浏览器
    }
}