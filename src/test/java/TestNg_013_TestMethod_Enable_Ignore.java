import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNg_013_TestMethod_Enable_Ignore {
    @Test(enabled = true)
    public static void Enable_true(){
        System.out.println("enable true");
    }
    @Test(enabled = false)
    public static void enable_false(){
        System.out.println("enable false");
    }
    @Ignore
    @Test
    public static void Ignore(){
        System.out.println("ignore");
    }
    @Test
    public static void method(){
        System.out.println("last");
    }
}
