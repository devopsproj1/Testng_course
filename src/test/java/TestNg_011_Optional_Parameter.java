import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg_011_Optional_Parameter {
@Parameters("url")
    @Test
    public static void Opt_Para(@Optional("https://www.youtube.com/") String link){
        WebDriver driver =new ChromeDriver();
        driver.get(link);
        driver.manage().window().maximize();

    }
@Parameters("url2")
    @Test
    public  static <link2> void no_para(@Optional("https://omayo.blogspot.com/") String link2){
        WebDriver driver=new ChromeDriver();

        driver.get(link2);
    }
}
