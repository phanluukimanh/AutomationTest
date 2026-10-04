package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSearchResultPage {
    WebDriver driver;

    public AmazonSearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public void findAmazonElements() {
        WebElement chkAdidas = driver.findElement(By.xpath("//li[@id='p_89/adidas']//i[contains(@class, 'a-icon-checkbox')]"));
        WebElement firstProductCard = driver.findElement(By.xpath("(//div[@data-component-type='s-search-result'])[1]"));
        WebElement firstProductTitle = driver.findElement(By.xpath("(//div[@data-component-type='s-search-result'])[1]//h2//span"));
        WebElement firstProductPrice = driver.findElement(By.xpath("(//div[@data-component-type='s-search-result'])[1]//span[@class='a-price']"));
        System.out.println("Đã xác định thành công locator trên trang Amazon!");
    }
}