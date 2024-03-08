import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependOnGroups_Attribute {
    @Test(groups = {"sanity"})
    public static void a(){
        WebDriver driver=new ChromeDriver();
        driver.get("abcd");//failed test
    }
    @Test(groups = {"smoke"})
    public static void b(){
        WebDriver driver=new ChromeDriver();
        driver.get("abcd");//failed test
    }
    @Test(dependsOnGroups = {"smoke"})
    public static void c(){
        System.out.println("third c");
    }
    @Test(dependsOnGroups = {"sanity"})
    public static void d(){
        System.out.println("third d");
    }
    @Test()
    public static void e(){
        System.out.println("depend on smoke");
    }

}
