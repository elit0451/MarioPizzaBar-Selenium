/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mariopizzabar.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 *
 * @author elitsa
 */
public class MarioPizzaBar {
  public static void main(String[] args) {
              
        
        WebDriver driver = new HtmlUnitDriver();
        driver.get("http://localhost:3000/index.html");
        
        WebElement element = driver.findElement(By.tagName("h1"));
        
        System.out.print(element.getText());
      
    }  
}
