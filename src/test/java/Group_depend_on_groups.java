import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Group_depend_on_groups {
    @Test(groups = "smoke")
    public static void a(){
        System.out.println("smoke");
    }
    @Test(groups = "regression")
    public static void b(){
        WebDriver driver=new ChromeDriver();
        driver.get("omgxnggdx");//wrong url skip dependent group test in xml file mnentioned
    }
    @Test(groups = "sanity")
    public static void c(){
        System.out.println("sanity");
    }
}
