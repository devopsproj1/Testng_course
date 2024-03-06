import net.bytebuddy.build.Plugin;
import org.testng.annotations.Test;

public class TestNg_004_No_Priority_And_Priority {
    @Test(priority = 1)
    public static void a(){
        System.out.println("a");
    }
    @Test(priority=2)
    public static void A(){
        System.out.println("A");
    }
    @Test
    public  static  void b(){
        System.out.println("b");
    }
    @Test
    public  static void B(){
        System.out.println("b");
    }
}
//in priority and without priority first without priority run due to default priority=0 ac to ascii value.
//rest tests run by after no priority tests
