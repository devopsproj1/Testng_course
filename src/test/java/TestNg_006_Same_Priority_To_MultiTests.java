import org.testng.annotations.Test;

public class TestNg_006_Same_Priority_To_MultiTests {
    @Test(priority = 1)
    public  static  void a(){
        System.out.println("a");
    }
    @Test(priority = 2)
    public  static void A(){
        System.out.println("A");
    }
    @Test(priority= 1)
    public  static void b(){
        System.out.println("b");
    }
    @Test(priority = 2)
    public  static  void B(){
        System.out.println("B");
    }
    @Test(priority = 1)
    public  static void c(){
        System.out.println("c");
    }
    @Test(priority = 2)
    public  static void C(){
        System.out.println("c");
    }


    @Test(priority = 2)
    public  static  void d(){
        System.out.println("d");
    }
    @Test(priority = 1)
    public  static void D(){
        System.out.println("D");
    }
    @Test(priority= 2)
    public  static void e(){
        System.out.println("e");
    }
    @Test(priority = 1)
    public  static  void E(){
        System.out.println("E");
    }
    @Test(priority = 2)
    public  static void f(){
        System.out.println("f");
    }
    @Test(priority = 1)
    public  static void F(){
        System.out.println("c");
    }

}

//run ac to priority -1,0,1
// same priority multiple test run ac to ascii value.
