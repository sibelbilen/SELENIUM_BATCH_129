import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstClass {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver","src/main/java/drivers/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);

        driver.get("https://www.amazon.com");

      Thread.sleep(3000);

    }
}
