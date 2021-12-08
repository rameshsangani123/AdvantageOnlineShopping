package com.test;

import static com.test.driver.findElement;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author 12244
 */
public class OnlineAdvantageshopTest {
    
    
    public OnlineAdvantageshopTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
  WebDriver driver;  
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
  
     
      @Test
     
     public void testtestAdvOnlineShopLogin() throws InterruptedException{
         driver.get("http:/www.advantageonlineshopping.com/");
         WebElement e=driver.findElement(By.id("menuUser"));
         e.click();
         
         Thread.sleep(3000);
        
         e=driver.findElement (By.name("username"));
         e.clear();
         e.sendKeys("ramesh_sangani");
         //e.submit();
        Thread.sleep(3000);
         e=driver.findElement (By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input"));
         e.clear();
         e.sendKeys("Pathik123");
         //e.submit();
          Thread.sleep(3000);
         e=driver.findElement(By.xpath("//*[@id=\"sign_in_btnundefined\"]"));
         e.click();
         
         e=driver.findElement(By.xpath("//*[@id=\"menuUserLink\"]/span"));
         e.click();
         
         e=driver.findElement(By.xpath("//*[@id=\"loginMiniTitle\"]/label[3]"));
         e.click();      
        
    }
     
      @Test
     
     public void testtestAdvOnlineShopLoginMyAcc() throws InterruptedException{
         driver.get("http:/www.advantageonlineshopping.com/");
         WebElement e=driver.findElement(By.id("menuUser"));
         e.click();
         
         Thread.sleep(3000);
        
         e=driver.findElement (By.name("username"));
         e.clear();
         e.sendKeys("ramesh_sangani");
         //e.submit();
        Thread.sleep(3000);
         e=driver.findElement (By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input"));
         e.clear();
         e.sendKeys("Pathik12345");
         //e.submit();
          Thread.sleep(3000);
         e=driver.findElement(By.xpath("//*[@id=\"sign_in_btnundefined\"]"));
         e.click();
         
         e=driver.findElement(By.xpath("//*[@id=\"menuUserLink\"]/span"));
         e.click();
         
         e=driver.findElement(By.xpath("//*[@id=\"loginMiniTitle\"]/label[1]"));
         e.click();
         Thread.sleep(2000);
         e=driver.findElement(By.xpath("//*[@id=\"myAccountContainer\"]/div[1]/h3/a"));
         e.click();
         Thread.sleep(2000);
         e=driver.findElement(By.name("emailAccountDetails"));
         e.clear();
         e.sendKeys("abc@gmail.com");
         
         Thread.sleep(1000);
         
         // change password test
         
          e=driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div/a"));
         e.click();
         
         e=driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div/div/sec-view[1]/div/input"));
         e.clear();
         e.sendKeys("Pathik123");
         
         e=driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div/div/sec-view[2]/div/input"));
         e.clear();
         e.sendKeys("Pathik12345");
         
         e=driver.findElement(By.name("confirm_new_passwordAccountDetails"));
         e.clear();
         e.sendKeys("Pathik12345");
        
         // Account Deatail Test
         Thread.sleep(2000);
         e=driver.findElement(By.name("first_nameAccountDetails"));
         e.clear();
         e.sendKeys("Veer");
         
         Thread.sleep(2000);
         e=driver.findElement(By.name("last_nameAccountDetails"));
         e.clear();
         e.sendKeys("Sutariya");
         
         Thread.sleep(1000);
         e=driver.findElement(By.name("phone_numberAccountDetails"));
         e.clear();
         e.sendKeys("2244212222");
         
         Thread.sleep(1000);
        
         WebElement drpCountryEle=driver.findElement(By.name("countryListboxAccountDetails"));
         
         Thread.sleep(4000);
         
         Select drpCountry=new Select(drpCountryEle);
         Thread.sleep(4000);
         drpCountry.selectByVisibleText("Australia");
         
         Thread.sleep(1000);
         e=driver.findElement(By.name("cityAccountDetails"));
         e.clear();
         e.sendKeys("Chcago");
         
         Thread.sleep(1000);
         e=driver.findElement(By.name("addressAccountDetails"));
         e.clear();
         e.sendKeys("760, Desplain Street");
         
         Thread.sleep(1000);
         e=driver.findElement(By.name("postal_codeAccountDetails"));
         e.clear();
         e.sendKeys("60155");
         
         Thread.sleep(1000);
         e=driver.findElement(By.name("state_/_province_/_regionAccountDetails"));
         e.clear();
         e.sendKeys("FL");
         
         Thread.sleep(1000);
        
         
         
         
         Thread.sleep(1000);
         e=driver.findElement(By.id("save_btnundefined"));
         e.click();
            
     }
     
     @Test
     
     public void testAdvOnlineShopMyAccPaymentSafe() throws InterruptedException{
         driver.get("http:/www.advantageonlineshopping.com/");
         WebElement e=driver.findElement(By.id("menuUser"));
         e.click();
         
         Thread.sleep(3000);
        
         e=driver.findElement (By.name("username"));
         e.clear();
         e.sendKeys("ramesh_sangani");
         //e.submit();
        Thread.sleep(3000);
         e=driver.findElement (By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input"));
         e.clear();
         e.sendKeys("Pathik12345");
         //e.submit();
          Thread.sleep(3000);
         e=driver.findElement(By.xpath("//*[@id=\"sign_in_btnundefined\"]"));
         e.click();
          Thread.sleep(3000);
         
         
         e=driver.findElement(By.xpath("//*[@id=\"menuUserLink\"]/span"));
         e.click();
         e=driver.findElement(By.xpath("//*[@id=\"loginMiniTitle\"]/label[1]"));
         e.click();
         
         e=driver.findElement(By.xpath("//*[@id=\"myAccountContainer\"]/div[4]/h3/a"));
         e.click();
         
         e=driver.findElement(By.xpath("//*[@id=\"paymentMethod\"]/div/div[1]/div[1]/img")); // safe payment 
         e.click();
         
         e=driver.findElement(By.name("safepay_username")); 
         e.clear();
         e.sendKeys("HelloPayment");
         
         e=driver.findElement(By.name("safepay_password")); 
         e.clear();
         e.sendKeys("Pathik123");
         
        e=driver.findElement(By.id("save_btnundefined"));
        e.click();
         
    }
     
     @Test
     
     public void testAdvOnlineShopMyAccPaymentMasterCre() throws InterruptedException{
         driver.get("http:/www.advantageonlineshopping.com/");
         WebElement e=driver.findElement(By.id("menuUser"));
         e.click();
         
         Thread.sleep(3000);
        
         e=driver.findElement (By.name("username"));
         e.clear();
         e.sendKeys("ramesh_sangani");
         //e.submit();
        Thread.sleep(3000);
         e=driver.findElement (By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input"));
         e.clear();
         e.sendKeys("Pathik12345");
         //e.submit();
          Thread.sleep(3000);
         e=driver.findElement(By.xpath("//*[@id=\"sign_in_btnundefined\"]"));
         e.click();
          Thread.sleep(3000);
         
         
         e=driver.findElement(By.xpath("//*[@id=\"menuUserLink\"]/span"));
         e.click();
         e=driver.findElement(By.xpath("//*[@id=\"loginMiniTitle\"]/label[1]"));
         e.click();
         
         e=driver.findElement(By.xpath("//*[@id=\"myAccountContainer\"]/div[4]/h3/a"));
         e.click();
         
         e=driver.findElement(By.xpath("//*[@id=\"paymentMethod\"]/div/div[1]/div[2]/img")); // MasterCredit Payment
         e.click();
         
         e=driver.findElement(By.name("card_number"));
         e.clear();
         e.sendKeys("1234 3454 4754 3455");
         
         e=driver.findElement(By.name("cvv_number"));
         e.clear();
         Thread.sleep(2000);
         e.sendKeys("67584");
         
         WebElement chkboxEle=driver.findElement(By.name("mmListbox"));
         
         Select chkbox=new Select(chkboxEle);
         Thread.sleep(4000);
         chkbox.selectByVisibleText("08");
         
         
        WebElement listboxEle = driver.findElement(By.xpath("//*[@id=\"paymentMethod\"]/div/div[3]/sec-form/div[2]/div/sec-view[2]/div/select"));
         
         Select listbox=new Select(listboxEle);
         Thread.sleep(2000);
         listbox.selectByVisibleText("2022");
         
         e=driver.findElement(By.name("cardholder_name"));
         e.clear();
         e.sendKeys( "Jay Patel");
       
         /*Thread.sleep(2000);
         e=driver.findElement(By.id("save_btnundefined"));
         e.click();*/
         
 }
     @Test
     
     public void testAdvOnlineShopMyAccPromition() throws InterruptedException{
         driver.get("http:/www.advantageonlineshopping.com/");
         WebElement e=driver.findElement(By.id("menuUser"));
         e.click();
         
         Thread.sleep(3000);
        
         e=driver.findElement (By.name("username"));
         e.clear();
         e.sendKeys("ramesh_sangani");
         //e.submit();
        Thread.sleep(3000);
         e=driver.findElement (By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input"));
         e.clear();
         e.sendKeys("Pathik12345");
         //e.submit();
          Thread.sleep(3000);
         e=driver.findElement(By.xpath("//*[@id=\"sign_in_btnundefined\"]"));
         e.click();
          Thread.sleep(3000);
          
          e=driver.findElement(By.xpath("//*[@id=\"menuUserLink\"]/span"));
         e.click();
         e=driver.findElement(By.xpath("//*[@id=\"loginMiniTitle\"]/label[1]"));
         e.click();
         
        
         
         WebElement chkboxEle=driver.findElement(By.name("notify_about_promotions"));
         
         Select chkbox=new Select(chkboxEle);
         Thread.sleep(2000);
         
         /*chkbox.selectByVisibleText("Notify me about promotions");
         Thread.sleep(1000);
          e.click();*/
         //Thread.sleep(4000);
         //chkbox.selectByVisibleText("08");
}
     
     @Test
     
     public void testMyShopAdvMyAccMyOrder() throws InterruptedException{
         driver.get("http:/www.advantageonlineshopping.com/");
         WebElement e=driver.findElement(By.id("menuUser"));
         e.click();
         
         Thread.sleep(3000);
        
         e=driver.findElement (By.name("username"));
         e.clear();
         e.sendKeys("ramesh_sangani");
         //e.submit();
        Thread.sleep(3000);
         e=driver.findElement (By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input"));
         e.clear();
         e.sendKeys("Pathik12345");
         //e.submit();
          Thread.sleep(3000);
         e=driver.findElement(By.xpath("//*[@id=\"sign_in_btnundefined\"]"));
         e.click();
          Thread.sleep(3000);
         
         
         e=driver.findElement(By.xpath("//*[@id=\"menuUserLink\"]/span"));
         e.click();
        e=driver.findElement(By.xpath("//*[@id=\"loginMiniTitle\"]/label[2]"));
         e.click();
         
         e=driver.findElement(By.xpath("/html/body/div[3]/section/article/div[3]/div/div/a"));
         e.click();
         
         
}   
     
}
