import org.testng.annotations.Test;

public class TestNg_003_Priority_Test {
    @Test(priority = 2)
    public  static  void a(){
        System.out.println("a");
    }
    @Test(priority = 3)
    public static void  A(){
        System.out.println("A");

    }
    @Test(priority = 1)
    public  static  void b(){
        System.out.println("b");
    }
    @Test(priority = 4)
    public static void  B(){
        System.out.println("B");

    }

}
//All tests run ac to defined priority

