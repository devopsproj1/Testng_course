import org.testng.annotations.*;

public class TestNg_009_Anootation {

    @BeforeTest
    public static void before_test(){
        System.out.println("before test");
    }
    @AfterTest
    public static void after_test(){
        System.out.println("after test");
    }
    @BeforeClass
    public static void before_class(){
        System.out.println("before class");
    }
    @AfterClass
    public static void after_class(){
        System.out.println("after class");
    }
    @BeforeMethod
    public static void before_method(){
        System.out.println("before method");
    }
    @AfterMethod
    public static void after_methdo(){
        System.out.println("after method");
    }
    @BeforeSuite
    public static void before_suite(){
        System.out.println("before suit");
    }

    @AfterSuite
    public static void after_suite(){
        System.out.println("after suite");
    }

    @Test
    public static  void a(){
        System.out.println("test method a");
    }
    @Test
    public  static void b(){
        System.out.println("test method b");
    }
    @Test
    public  static  void c(){
        System.out.println("test method c");
    }
}
