import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg_007_Test_verifiy_via__Assert_Class {



    @Test
    public static void  A(){
        String actual_name=null;
        Assert.assertNotNull(actual_name,"Value is Null");//java.lang.AssertionError: Value is Null expected object to not be null

    }
    @Test
    public static void verify_Name(){
        String actual_name="amit";
        String expected_name="amit";
        Assert.assertEquals(actual_name,expected_name);//passed test
    }
@Test
    public static void verify_SirName(){
        String actual_name="KOHILI";
        String expected_name="SHAH";
        Assert.assertNotEquals(actual_name,expected_name);//pass test
    }

    @Test
    public static void z_failed(){
        String st="woe";
      if(st.equals("woe"))
          Assert.fail("value is WOE");// intensionally fail for some condition and show errror alert;
    }

    @Test
    public static void verify_string(){

        String s="juli";
        String l="sharma";
        Assert.assertEquals(s,l);
        System.out.println("code  stop after assertion fail and rest code wont run");
        String s1="amit";
        String s2="Kumar";
        Assert.assertEquals(s2,s1);
        //failed test java.lang.AssertionError:Expected :amit  Actual   :Kumar


    }
}
//above are Hard assertion if one test step fail the code will stop and rest of verification of same test method  are skipped or not started
