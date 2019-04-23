import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://zhhxy.qa.v3.xiaoyangedu.net/View/Index.html");
        driver.manage().window().maximize();
        try {
            driver.findElement(By.xpath("//*[@id=\"FaBars\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"LeftMenuContent\"]/div[1]/div[2]/div/ul/li[2]/div/span")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"LeftMenuContent\"]/div[1]/div[2]/div/ul/li[2]/ul/div[1]/div/li/span")).click();

            Thread.sleep(1000);

            driver.findElement(By.xpath("//*[@id=\"XyContentModuleReplace\"]/div[2]/div[1]/button[1]/span")).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/form/div[1]/div/div[1]/input")).click();

            driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/form/div[1]/div/div[1]/input")).sendKeys("ddddddd");
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}