package practice;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.*;

public class pra01 {
    public static void main(String[] args) throws InterruptedException {

        String url = "https://demoqa.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(By.xpath("//h5[text()='Elements']")).click();

        // Text Box Manipulation
//        driver.findElement(By.cssSelector(".menu-list>#item-0")).click();
//        driver.findElement(By.id("userName")).sendKeys("Himanshu Raj");
//        driver.findElement(By.xpath("//input[@type='email' and  @placeholder='name@example.com']")).sendKeys("himanshu@gamail.com");
//        driver.findElement(By.cssSelector("#currentAddress")).sendKeys("D1, VMB Paradise", Keys.ENTER, "Marathalli Banglore", Keys.ENTER);
//        driver.findElement(By.cssSelector("#currentAddress")).sendKeys("INDIA - 560037");
//        driver.findElement(By.xpath("//button[text()='Submit']")).click();
//

        // Check Box Manipulation
        driver.findElement(By.cssSelector(".menu-list>#item-1")).click();
        driver.findElement(By.className("rct-icon-expand-close")).click();
        driver.findElement(By.xpath("(//button[contains(@class,'rct-collapse-btn')])[2]")).click();
        driver.findElement(By.xpath("//span[text()='Notes']")).click();
        Boolean result = driver.findElement(By.cssSelector("#tree-node-notes")).isSelected();
        System.out.println("Selection is : "+result);
        String resultText = driver.findElement(By.id("result")).getText();
        System.out.println(resultText);


    }
}
