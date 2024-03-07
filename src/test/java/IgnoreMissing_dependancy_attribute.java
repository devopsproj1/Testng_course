import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IgnoreMissing_dependancy_attribute {

    @Test(dependsOnMethods = {"a"},ignoreMissingDependencies = true)
    public static void b(){
        System.out.println("second b");
    }
    @Test(dependsOnMethods = {"b","a"},ignoreMissingDependencies = true)
    public static void c(){
        System.out.println("third c");
    }
}
