import org.testng.annotations.Test;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestNg_005_Negative_Priority {
    @Test(priority = 1)
    public  static  void a(){
        System.out.println("a");
    }
    @Test(priority = 2)
    public  static void A(){
        System.out.println("A");
    }
    @Test(priority= -4)
    public  static void b(){
        System.out.println("b");
    }
    @Test(priority = -5)
    public  static  void B(){
        System.out.println("B");
    }
    @Test
    public  static void c(){
        System.out.println("c");
    }
    @Test
    public  static void C(){
        System.out.println("c");
    }
}
//no priority means priority=0
//first run negative priority from ascending order towards 0
//second run no priority
//third run tests ehich have priority after zero


