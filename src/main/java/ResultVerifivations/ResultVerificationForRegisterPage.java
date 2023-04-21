package ResultVerifivations;

import CommonPages.Utils;
import org.testng.Assert;

public class ResultVerificationForRegisterPage extends Utils
{
    public void RegisterPageTitle()
    {
        String Title= driver.getTitle();
        Assert.assertEquals(Title,"nopCommerce demo store.Register1","Register page");
    }
}
