import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNg_008_Soft_Assertion {
    static SoftAssert soft=new SoftAssert();

    @Test
    public static void a(){
         SoftAssert soft=new SoftAssert();
       String s="amit";
       String l="sah";
       soft.assertEquals(s,l);
        String f="jagan";
        String e="jagan";
        soft.assertEquals(e,f);
        System.out.println("test execute next step");
        soft.assertAll();
    }

    @Test
    public static void c(){

        String ss="ram";
        String bb="ram";
        soft.assertEquals(ss,bb);

        System.out.println("other test method executed");
    }



}
