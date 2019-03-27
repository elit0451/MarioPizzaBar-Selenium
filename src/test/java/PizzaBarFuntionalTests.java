import java.util.List;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class PizzaBarFuntionalTests {
    
    WebDriver driver;
    
    public PizzaBarFuntionalTests() {
    }
    
    @Before
    public void setUpClass() throws Exception {
        
        driver = new HtmlUnitDriver();
        driver.get("http://localhost:3000/index.html");
        
    }
    
    @Test
    public void getInitialPageTest(){
        
        WebElement element = driver.findElement(By.tagName("h1"));
        
        assertEquals("Welcome to Marios Pizzabar!", element.getText());
    }
    
    @Test
    public void placeOrder(){
        WebElement elementInput = driver.findElement(By.id("pizzaNrTxt"));
        elementInput.sendKeys("6");
        elementInput.submit();
        
        WebElement pageText = driver.findElement(By.tagName("h1"));
        
        assertEquals("Order added!", pageText.getText());
    }
    
    @Test
    public void viewOrders(){
        WebElement link = driver.findElement(By.tagName("a"));
        link.click();
        
        WebElement pageText = driver.findElement(By.tagName("h1"));
        
        
        assertEquals("List of orders", pageText.getText());
    }
    
    @Test
    public void deleteOrder(){
        WebElement link = driver.findElement(By.tagName("a"));
        link.click();
        
        List<WebElement> deleteLinks = driver.findElements(By.tagName("a"));
        deleteLinks.get(1).click();
        
        WebElement pageText = driver.findElement(By.tagName("h1"));
        assertEquals("Order deleted!", pageText.getText());
    }
    
    @After
    public void cleanUpClass() throws Exception {
        driver.quit();
    } 
    
}
