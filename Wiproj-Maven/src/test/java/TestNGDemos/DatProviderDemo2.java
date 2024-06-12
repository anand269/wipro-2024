package TestNGDemos;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DatProviderDemo2 {

    @DataProvider(name = "loginData")
    public Object[][] provideData(Method method) {
        if (method.getName().equals("testValidLogin")) {
            return new Object[][] {
                { "validUser1", "validPassword1" },
                { "validUser2", "validPassword2" }
            };
        } else {
            return new Object[][] {
                { "invalidUser1", "invalidPassword1" },
                { "invalidUser2", "invalidPassword2" }
            };
        }
    }

    @Test(dataProvider = "loginData")
    public void testValidLogin(String username, String password) {
        System.out.println("Valid Login - Username: " + username + ", Password: " + password);
        // Add your test logic here
    }

    @Test(dataProvider = "loginData")
    public void testInvalidLogin(String username, String password) {
        System.out.println("Invalid Login - Username: " + username + ", Password: " + password);
        // Add your test logic here
    }
}

