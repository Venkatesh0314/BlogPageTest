package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BlogProjectTest {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://qabloglist.ccbp.tech/");
        // to find the list items
        List<WebElement> blogList = driver.findElements(By.xpath("//li[@class = 'blog-item']"));
        // Verify the presence of all five blogs.
        if (blogList.size() == 5) {
            System.out.println("5 Blog Items Found");
        }
        else {
            System.out.println("Mismatch in Blog Item Count");
        }
        // Find the blog title items
        List<WebElement> blogTitleList = driver.findElements(By.xpath("//h1[@class = 'blog-title']"));

        // Verify the presence of all five blog titles.
        if (blogTitleList.size() == 5) {
            System.out.println("5 Blog Titles Found");
        } else {
            System.out.println("Mismatch in Blog Title Count");
        }

        // Find the blog description items
        List<WebElement> blogDescriptionList = driver.findElements(By.xpath("//p[@class = 'blog-description']"));

        // Verify the presence of all five blog descriptions.
        if (blogDescriptionList.size() == 5) {
            System.out.println("5 Blog Descriptions Found");
        } else {
            System.out.println("Mismatch in Blog Description Count");
        }

        // Quit the WebDriver instance
        driver.quit();
    }
}
