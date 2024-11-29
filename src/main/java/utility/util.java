package utility;

import org.testng.annotations.DataProvider;

public class util {

    @DataProvider(name = "login")
    public String[][] data() {
        // Corrected array size to match the number of rows and columns
        String[][] data = new String[5][2];
       
        data[0][0] = "admin";
        data[0][1] = "admin";
     //   System.out.println("valid username and invalid password");
        
        data[1][0] = "admin1";
        data[1][1] = "admin1";
       // System.out.println("invalid username and invalid password");
        
        data[2][0] = "admin2";
        data[2][1] = "admin123";
       // System.out.println("invalid username and valid password");
        
        
        data[3][0] = "";
        data[3][1] = "";
        
        
        //System.out.println("valid username and valid password");
        return data;
    }
    
    
    
}
