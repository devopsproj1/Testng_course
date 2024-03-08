import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Name_dataProvider_method_by_name_attribute {
    @Test(dataProvider = "gettestdata")
    public static void Show_FullName(String Fname,String Lname){
        System.out.println("My name is  "+Fname+"  "+Lname);
    }

    @DataProvider(name = "gettestdata")
    public static String[][] data_supplier(){
        String[][] data={{"amit","kumar"},{"palllavi","sharma"},{"gugli","soni"},{"cugli","soni"}};
        return  data;
    }

}
