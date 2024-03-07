import org.testng.annotations.Test;

public class DependsOnMethod_Attribute_non_exist_method {

    @Test(dependsOnMethods = {"e"})//e method not available
    public static void D() {
        System.out.println("method not available");// throw dependsONMethod_attribute.d() depends on nonexistent method
    }
}
