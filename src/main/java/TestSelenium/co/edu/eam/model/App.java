package TestSelenium.co.edu.eam.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.gecko.driver","D:\\Documentos\\Jefry\\EAM\\Semestre_8\\Ing_Software3\\geckodriver.exe");
        
        // if above property is not working or not opening the application in browser then try below property

       //System.setProperty("webdriver.firefox.marionette","G:\\Selenium\\Firefox driver\\geckodriver.exe");

      WebDriver driver = new FirefoxDriver();

      driver.get("http://www.facebook.com");

      System.out.println("Application title is ============="+driver.getTitle());

      driver.quit();
    }
}
