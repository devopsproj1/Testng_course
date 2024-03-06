import org.testng.annotations.Test;

public class TestNg_002_Default_Priority
{
    @Test
    public  void a(){
        System.out.printf("method a");
    }
    @Test
    public void A(){
        System.out.printf("method A");
    }
    @Test
    public void b(){
        System.out.println("method b");
    }
    @Test
    public  void B(){
        System.out.println("method B");
    }


}
//Default priority defined Test  run ac to ascii number from lowest to highest.
//default priority means priority=0
