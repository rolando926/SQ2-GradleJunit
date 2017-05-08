import org.junit.*;

/**
 * Created by RXC8414 on 5/4/2017.
 */
public class AssumeTests {
    @BeforeClass
    public static void loadPage(){
        Assert.assertTrue(true);
        System.out.println("Loaded homedepot.com");
    }

    @Test
    public void verifyLogo(){
        Assert.assertTrue("Could not verified the presence of the logo.",true);
        System.out.println("Verified Home Depot logo");
    }

    @Test
    public void verifySearchBox(){
        Assert.assertTrue("Could not verified the presence of the search box.",true);
        System.out.println("Verified Home Depot Search Box");
    }

    @Test
    public void verifyCartIcon(){
        Assert.assertTrue("Could not verified the presence of the cart icon.",true);
        System.out.println("Verified Home Depot Cart Icon");
    }

    @Before
    public void returnMainPage(){
        Assert.assertTrue("Could not return page to homedepot.com",true);
        System.out.println("Returned page to main homedepot.com");
    }


}
