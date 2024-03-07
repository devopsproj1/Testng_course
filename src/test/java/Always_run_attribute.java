import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Always_run_attribute {
    @Test
    public static void a(){
        WebDriver driver=new ChromeDriver();
        driver.get("abcd");//failed test
    }
    @Test(dependsOnMethods = {"a"},alwaysRun = true)
    public static void b(){
        System.out.println("second b");
    }
    @Test(dependsOnMethods = {"b","a"},alwaysRun = true)
    public static void c(){
        System.out.println("third c");
    }
}
