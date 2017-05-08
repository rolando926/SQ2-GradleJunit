import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Set;

import static org.hamcrest.CoreMatchers.hasItem;

/**
 * Created by RXC8414 on 5/3/2017.
 */
public class AssertThat {
    static ArrayList<String> colors = new ArrayList<>();

    @BeforeClass
    public static void setValues(){
        colors.add("Red");
        colors.add("Grey");
        colors.add("Pink");
        colors.add("Black");
        colors.add("White");
        colors.add("Magenta");
        colors.add("Purple");
        colors.add("Green");
        colors.add("Orange");
    }

    @Test
    public void isRedTest(){
        Assert.assertThat(colors, hasItem("Red"));
    }

    @Test
    public void isBlueTest(){
        Assert.assertThat(colors, hasItem("Blue"));
    }

    @Test
    public void isGreyTest(){
        Assert.assertThat(colors, hasItem("Grey"));
    }

    @Test
    public void isYellowTest(){
        Assert.assertThat(colors, hasItem("Yellow"));
    }
}
