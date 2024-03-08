import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_bdd_by_testNg {
    @Test(dataProvider = "data_supplier")
    public static void Show_FullName(String Fname,String Lname){
        System.out.println("My name is  "+Fname+"  "+Lname);
    }

    @DataProvider
    public static String[][] data_supplier(){
        String[][] data={{"amit","kumar"},{"palllavi","sharma"},{"gugli","soni"}};
        return  data;
    }

}
