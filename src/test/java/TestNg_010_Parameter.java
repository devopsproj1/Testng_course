import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg_010_Parameter {
    @Parameters ({"url","url2"})//this should be same as in parameter tag in testng xml file
    @Test()
    public static void parameter(String link,String link2){ //here we can take  any name
        WebDriver driver=new ChromeDriver();

        driver.get(link);
        driver.manage().window().maximize();
        driver.get(link2);

    }
}
