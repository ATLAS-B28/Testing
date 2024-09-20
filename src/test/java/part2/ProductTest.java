package part2;

import com.sauce.pages.ProductPage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {

    @Test
    public void testProductHeaderDisplayed() {
        ProductPage productPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
        assertTrue(productPage.isProductHeaderDisplay(),
                "\n Products header is not displayed \n");
    }
}
