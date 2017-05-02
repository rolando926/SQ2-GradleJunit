import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RXC8414 on 5/1/2017.
 */
public class TestMain {
    Main myMain = new Main();

    @Test
    public void testDisplayMessage(){
        Assert.assertEquals("This is not working",
                "This method 'displayMessage' is working!",myMain.displayMessage());
        myMain.displayMessage();
    }

    @Test
    public void testAddMethod(){
        System.out.println(myMain.add(5,7));
        Assert.assertEquals("This method is not working!",12, myMain.add(5,7));
    }
}
