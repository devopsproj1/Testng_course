package Group_Test_Groups_Attribute;

import org.testng.annotations.Test;

public class Register {
    @Test(groups = "function")
    public static void fill_all_field() {
        System.out.println("fill all field");
    }

    @Test
    public static void fill_NO_field() {
        System.out.println("fill No field");
    }

    @Test(groups = "negative")
    public static void fill_Dup_field() {
        System.out.println("fill Dup field");
    }
}
