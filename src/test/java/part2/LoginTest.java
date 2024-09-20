package part2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginErrorMsg() {
        loginPage.setUsername("standard_user");
        loginPage.setPasswordField("zyx6948");
        loginPage.clickLoginBtn();
        String actualRes = loginPage.getErrorMsg();
        Assert.assertTrue(actualRes.contains("Epic sadface"));
    }
}
