import java.util.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMybatis {
	
	@Test
    public void testAddUser(){
            System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://localhost:8080/zhibing_mybatis/addUser.jsp");
            driver.findElement(By.id("name")).sendKeys("user1");
            driver.findElement(By.id("age")).sendKeys("30");
            driver.findElement(By.id("address")).sendKeys("测试地址");
            driver.findElement(By.id("save")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
    }

}
