import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void addUpDemo(){
        Integer result = Main.addUp(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(15,result);
    }
}
