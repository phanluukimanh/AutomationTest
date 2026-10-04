package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AirbnbHomePage {
    WebDriver driver;

    public AirbnbHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void findAirbnbElements() {
        WebElement txtLocation = driver.findElement(By.xpath("//input[@data-testid='structured-search-input-field-query']"));
        WebElement btnCheckIn = driver.findElement(By.xpath("//div[@data-testid='structured-search-input-field-split-dates-0']"));
        WebElement btnCheckOut = driver.findElement(By.xpath("//div[@data-testid='structured-search-input-field-split-dates-1']"));
        WebElement btnGuests = driver.findElement(By.xpath("//div[@data-testid='structured-search-input-field-guests-button']"));
        WebElement btnSearch = driver.findElement(By.xpath("//button[@data-testid='structured-search-input-search-button']"));
        System.out.println("Đã xác định thành công các locator trên trang chủ Airbnb!");
    }
}