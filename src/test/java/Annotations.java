import org.junit.*;

/**
 * Created by RXC8414 on 6/8/2017.
 */
public class Annotations {

    @BeforeClass
    public static void setUp(){
        System.out.println("Initializing Selenium drivers...");
    }

    @Before
    public void setUpTestCase(){
        System.out.println("Redirect test case to start from www.homedepot.com....");
    }

    @Test
    public void verifyCanSearchforHammer(){
        System.out.println("Verified hammer was found from search...");
    }

    @Test
    public void verifyCanSearchforNail(){
        System.out.println("Verified nail was found from search...");
    }

    @Test
    public void verifyCanSearchForScrewdriver(){
        System.out.println("Verified screwdriver was found from search...");
    }

    @After
    public void cleanUp(){
        System.out.println("Cleaning up data...");
    }

    @AfterClass
    public static void stopDriver(){
        System.out.println("Close Selenium driver connection");
    }
}
