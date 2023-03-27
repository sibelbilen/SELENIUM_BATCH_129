package selenium_pratica.day01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C06 {

    // pencere konumunu ve pencere olcusunu yazdiriniz
    // pencere konumunu 20,20 yapiniz, pencere olcusunu 900,600 olarak degistirelim
    // yeni pencere konumunu ve yeni pencere olcusunu yazdiriniz
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        // pencere konumunu ve pencere olcusunu yazdiriniz


        System.out.println("eski konum :"+driver.manage().window().getPosition());
        System.out.println("eski boyutu: "+driver.manage().window().getSize());


        // pencere konumunu 20,20 yapiniz, pencere olcusunu 900,600 olarak degistirelim
        driver.manage().window().setPosition(new Point(20, 20));
        driver.manage().window().setSize(new Dimension(900, 600));



        // yeni pencere konumunu ve yeni pencere olcusunu yazdiriniz

        System.out.println(" yeni konumu: " + driver.manage().window().getPosition());
        System.out.println(" yeni boyutu: " + driver.manage().window().getSize());

    }

}
