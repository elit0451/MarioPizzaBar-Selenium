
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 *
 * @author elitsa
 */
public class NewEmptyJUnitTest1 {
    
    WebDriver driver;
    
    public NewEmptyJUnitTest1() {
    }
    
    @org.junit.jupiter.api.BeforeAll
    public void setUpClass() throws Exception {
        
        System.setProperty("webdriver.chrome.driver","/Users/elitsa/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("localhost:3000/index.html");
       
        /*WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Cheese!");
        element.submit();*/
    }
    
    @Test
    public void getInitialPageTest(){
        
        System.setProperty("webdriver.chrome.driver","/Users/elitsa/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("localhost:3000/index.html");
        WebElement element = driver.findElement(By.tagName("h1"));
        
        assertEquals("Welcome to Marios Pizzabar!", element.getText());
    }
    
    @org.junit.jupiter.api.AfterAll
    public void cleanUpClass() throws Exception {
        driver.quit();
    } 
    
}
