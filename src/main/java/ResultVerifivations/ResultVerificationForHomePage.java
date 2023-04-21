package ResultVerifivations;

import CommonPages.Utils;
import org.testng.Assert;

public class ResultVerificationForHomePage extends Utils
{
    public void homePageTitle()
    {
        String Title= driver.getTitle();
        Assert.assertEquals(Title,"nopCommerce demo store","Login page title not matched");
    }
}
