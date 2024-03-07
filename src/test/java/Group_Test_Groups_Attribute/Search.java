package Group_Test_Groups_Attribute;

import org.testng.annotations.Test;

public class Search {
    @Test(groups = {"functional","smoke",})
    public static void VproductSearch() {
        System.out.println("valid product search");
    }

    @Test(groups = {"negative"})
    public static void InvproductSearch() {
        System.out.println("invalid product search");
    }

}
