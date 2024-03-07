package Group_test_byXMl;

import org.testng.annotations.Test;

public class Login {
    @Test
    public static void Vid_Vpass(){
        System.out.println("valid id and pss");
    }
    @Test
    public static void Vid_InvPass(){
        System.out.println("valid id and InvPss");
    }
    @Test
    public static void InvVid_vPass(){
        System.out.println("Invalid id and vPss");
    }
    @Test
    public static void InvVid_InvPass(){
        System.out.println("Invalid id and InvPss");
    }
    @Test
    public static void NO_Credential(){
        System.out.println("No credential");
    }

}

