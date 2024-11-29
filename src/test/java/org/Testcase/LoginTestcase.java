package org.Testcase;

import org.orange.base.baseclass;
import org.orange.pages.loginpage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestcase extends baseclass {

	  loginpage lp = new loginpage(driver);
    @Test(dataProvider = "login", dataProviderClass = utility.util.class)
    public void invalidUsername(String id, String password) {
        // Initialize login page object inside the test method
      
        
        lp.userName(id);
        lp.Password(password);
        lp.submit();
        
    }
}
