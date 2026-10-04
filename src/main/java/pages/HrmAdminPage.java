package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HrmAdminPage {
    WebDriver driver;

    public HrmAdminPage(WebDriver driver) {
        this.driver = driver;
    }
    public void findAdminElements() {
        WebElement txtUsername = driver.findElement(By.xpath("//label[text()='Username']/parent::div/following-sibling::div/input"));
        WebElement drpUserRole = driver.findElement(By.xpath("//label[text()='User Role']/parent::div/following-sibling::div//div[contains(@class, 'oxd-select-text')]"));
        WebElement txtEmployeeName = driver.findElement(By.xpath("//label[text()='Employee Name']/parent::div/following-sibling::div//input"));
        WebElement drpStatus = driver.findElement(By.xpath("//label[text()='Status']/parent::div/following-sibling::div//div[contains(@class, 'oxd-select-text')]"));
        WebElement btnSearch = driver.findElement(By.xpath("//button[@type='submit']"));
        WebElement btnAdd = driver.findElement(By.xpath("//button[normalize-space()='Add']"));
        System.out.println("Đã xác định thành công các locator trên trang Admin!");
    }
}