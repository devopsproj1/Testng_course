package Group_Test_Groups_Attribute;

import org.testng.annotations.Test;

public class Login {
    @Test(groups = {"regression","smoke"})
    public static void Vid_Vpass() {
        System.out.println("valid id and pss");
    }

    @Test
    public static void Vid_InvPass() {
        System.out.println("valid id and InvPss");
    }

    @Test(groups = "negative")
    public static void InvVid_vPass() {
        System.out.println("Invalid id and vPss");
    }

    @Test(groups = "negative")
    public static void InvVid_InvPass() {
        System.out.println("Invalid id and InvPss");
    }

    @Test(groups = {"ui","smoke"})
    public static void NO_Credential() {
        System.out.println("No credential uiu+smoke");
    }

}

